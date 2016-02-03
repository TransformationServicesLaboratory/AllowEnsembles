package org.example.www.utility_func;

import com.mysql.jdbc.*;
import com.sun.rowset.CachedRowSetImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Map;

import javax.sql.rowset.CachedRowSet;

/**
 * Singleton implementation for a database wrapper class
 * @author cxanthos
 * 
 */
public class DB {
    private static DB instance = null;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    // Database name: context 
    static final String DB_URL = "jdbc:mysql://localhost/context_v20";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "nomore123!";
    private static Connection conn = null;
    private static Statement stmt = null;

    protected DB(){}

    public static DB getInstance(){
        if(instance == null) {
            instance = new DB();
       }
        return instance;
    }
   
   
    /**
     * 
     * @param table The DB table from which to delete
     * @param where The where clauses
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void deleteRow(String table, String where) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = (Statement) conn.createStatement();
        String sql = "DELETE FROM `"+table+"` WHERE "+where;
     //   System.out.println(sql);
        if (stmt.executeUpdate(sql) == 0) {
            throw new SQLException("Deleting failed or no rows matching criteria found. No rows affected.");
        }

        conn.close();
    }
    
    /**
     * 
     * @param table The DB table
     * @param fields All data to insert, in <Key, Value> format
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int insertRow(String table, Map<String,String> fields) throws SQLException, ClassNotFoundException {
   
 
    	Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = (Statement) conn.createStatement();
        Iterator it = fields.entrySet().iterator();
        String keys = "";
        String values = "";
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if (keys.length() == 0)
            	keys = keys+pair.getKey();
            else 
            	keys = keys+","+pair.getKey();

            if (values.length() == 0) {
                if (pair.getValue() != null) values = "\""+values+pair.getValue()+"\"";
                else values = "NULL";
            }
            else {
                if (pair.getValue() != null) values = values+",\""+pair.getValue()+"\"";
                else values = ", NULL";
            }
            it.remove(); // avoids a ConcurrentModificationException
        }
        String sql = "INSERT INTO "+table+" ("+keys+") VALUES ("+values+")";
    //    System.out.println("--->"+sql);
        // insert
        if (stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS) == 0) {
            throw new SQLException("Insertion failed, no rows affected.");
        }
        // If we need to get the generated ID for the insterted row, uncomment the following lines
        ResultSet rs = stmt.getGeneratedKeys();
        rs.next();
        
        conn.close();
        return rs.getInt(1);
    }

    /**
     * 
     * @param from The DB table
     * @param cols Columns to select
     * @param where Where clauses
     * @param order Order by
     * @param limit Limit
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public ResultSet selectRows(String from, String cols, String where, String order, String limit) throws ClassNotFoundException, SQLException {
    	Class.forName("com.mysql.jdbc.Driver");
    	conn = DriverManager.getConnection(DB_URL, USER, PASS);

    	stmt = (Statement) conn.createStatement();
    	String sql = "SELECT "+cols+" FROM `"+from+"`";
    	if (where!=null)
    		sql += " WHERE "+where;
	    if (order!=null)
	        sql += " ORDER BY "+order;
	    if (limit!=null)
	        sql += " LIMIT "+limit;
	//    System.out.println("--->"+sql);
	    ResultSet rs = stmt.executeQuery(sql);
	    CachedRowSet rowset = new CachedRowSetImpl();
	    rowset.populate(rs);

        conn.close();
	    return rowset;
   }
    
    public void updateRows(String table, String column, String value, String where) throws ClassNotFoundException, SQLException {
    	Class.forName("com.mysql.jdbc.Driver");
    	conn = DriverManager.getConnection(DB_URL, USER, PASS);
    
    	stmt = (Statement) conn.createStatement();
    	
    	String sql = "UPDATE `"+table+"` SET `"+column+"` = \""+value+"\"";
    	System.out.println("--->"+sql);
    	if (where != null)
    		sql = sql+" WHERE "+where;
    	stmt.executeUpdate(sql);

        conn.close();
    }
}