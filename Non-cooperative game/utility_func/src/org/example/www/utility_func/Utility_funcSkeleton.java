
/**
 * Utility_funcSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
    package org.example.www.utility_func;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Comparator;
import org.example.www.utility_func.DB;

import com.mysql.jdbc.Statement;


/**
     *  Utility_funcSkeleton java skeleton for the axisService
     */
    public class Utility_funcSkeleton{
        
    	static private Comparator<Alternative> descUtility;
    	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
 	    // Database name: context to be added 
 	    static final String DB_URL = "";

 	    //  Database credentials: to be added
 	    static final String USER = "";
 	    static final String PASS = "";
 	    private static Connection conn = null;
 	    private static Statement stmt = null;
        

	  	static {
	            descUtility = new Comparator<Alternative>(){
	                @Override public int compare(Alternative alt1, Alternative alt2){
	                    return (int)((alt2.getUtility() - alt1.getUtility())*10000);
	                }
	            };     
	        } 
         
         
        /**
         * Auto generated method signature
         * 
                                     * @param rank 
             * @return rankResponse 
             * @throws InvalidInputFaultMessage 
         * @throws SQLException 
         * @throws ClassNotFoundException 
         */
        
                 public org.example.www.utility_func.RankResponse rank
                  (
                  org.example.www.utility_func.Rank rank
                  )
            throws InvalidInputFaultMessage, ClassNotFoundException, SQLException{
                	 Alternative [] altArray = new Alternative[rank.getIn().getAlternatives().getAlternative().length];
                	 
                	 double TravelTimeMax = 0.0;
                	
                	 DB db = DB.getInstance();
                	 ResultSet rs = null;
                	 Class.forName("com.mysql.jdbc.Driver");
            		 conn = DriverManager.getConnection(DB_URL, USER, PASS);

            		 stmt = (Statement) conn.createStatement();
                	 for(int i=0;i<rank.getIn().getAlternatives().getAlternative().length;i++){
                		
                		 String sql = "SELECT total_distance FROM route_type WHERE start_cluster = \""+rank.getIn().getAlternatives().getAlternative()[i].getStartCluster()+"\" AND end_cluster = \""+rank.getIn().getAlternatives().getAlternative()[i].getEndCluster()+"\" AND uuid = \""+rank.getIn().getAlternatives().getAlternative()[i].getId()+"\"";
                		 rs = stmt.executeQuery(sql);
                		 
                //		 rs = db.selectRows("route_type", "total_distance", "start_cluster = \""+rank.getIn().getAlternatives().getAlternative()[i].getStartCluster()+"\" AND end_cluster = \""+rank.getIn().getAlternatives().getAlternative()[i].getEndCluster()+"\" AND id = \""+rank.getIn().getAlternatives().getAlternative()[i].getId()+"\"", null, null);
                		 try {
                			 if(rs.next())
                				 TravelTimeMax +=rs.getDouble("total_distance");
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                		 
                	 }
                	 rs.close();
                	 stmt.close();
            		 conn.close();
                	 TravelTimeMax = (TravelTimeMax/(rank.getIn().getAlternatives().getAlternative().length))/1000; /*Average alternative distance in kilometers*/
      
                     for(int i=0; i<rank.getIn().getAlternatives().getAlternative().length;i++){
                    	 double u=0.0;
                    	 double sum = 0.0;
                    	
                    	 for(int j=0; j<rank.getIn().getRequest().getPreference()[0].getPreference().length;j++){
                    		 sum += rank.getIn().getRequest().getPreference()[0].getPreference()[j].getWeight();
                    		 
                    	 }
                    	for(int j=0; j<rank.getIn().getRequest().getPreference()[0].getPreference().length;j++){
                             		 
                    		 if(rank.getIn().getRequest().getPreference()[0].getPreference()[j].getName().compareTo("TravelTime")==0){
                    		//	 u += (rank.getIn().getRequest().getPreference()[0].getPreference()[j].getWeight()/sum)*((Math.exp((rank.getIn().getRequest().getPreference()[0].getPreference()[j].getValue()*TravelTimeMax*60)-rank.getIn().getAlternatives().getAlternative()[i].getTravelTime()))/Math.exp(Math.abs((rank.getIn().getRequest().getPreference()[0].getPreference()[j].getValue()*TravelTimeMax*60)- rank.getIn().getAlternatives().getAlternative()[i].getTravelTime()))) ;
                    			 double t = (0.5*rank.getIn().getAlternatives().getAlternative()[i].getTravelTime())/(rank.getIn().getRequest().getPreference()[0].getPreference()[j].getValue()*TravelTimeMax*60);
                    			 u += (rank.getIn().getRequest().getPreference()[0].getPreference()[j].getWeight()/sum)*Math.exp(-t);
                    			 System.out.println("travel u " + u);
                    		 }
                    		 else if(rank.getIn().getRequest().getPreference()[0].getPreference()[j].getName().compareTo("Cost")==0){
                    			 if(rank.getIn().getRequest().getPreference()[0].getPreference()[j].getValue()==0.0){
                    				InvalidInputFault fault = new InvalidInputFault();

                    		            fault.setId(rank.getIn().getAlternatives().getAlternative()[i].getId());
                    		            InvalidInputFaultMessage ex = new InvalidInputFaultMessage("Maximum Cost cannot be Zero!");
                    		            ex.setFaultMessage(fault);
                    		            throw ex;
                    		        }
                    			 else{ 
                    				 u += (rank.getIn().getRequest().getPreference()[0].getPreference()[j].getWeight()/sum)*(Math.exp((-0.7*rank.getIn().getAlternatives().getAlternative()[i].getCost())/rank.getIn().getRequest().getPreference()[0].getPreference()[j].getValue()));
                    				 System.out.println("cost u " + u);
                    			 }
                    		}
                    		 else if(rank.getIn().getRequest().getPreference()[0].getPreference()[j].getName().compareTo("WalkingDistance")==0){
                    			 if(rank.getIn().getRequest().getPreference()[0].getPreference()[j].getValue()==0.0){
                    				 	InvalidInputFault fault = new InvalidInputFault();

                    		            fault.setId(rank.getIn().getAlternatives().getAlternative()[i].getId());
                    		            InvalidInputFaultMessage ex = new InvalidInputFaultMessage("Maximum Walking Distance cannot be Zero!");
                    		            ex.setFaultMessage(fault);
                    		            throw ex;
                    		        }
                    			 else{
                    				// u += (rank.getIn().getRequest().getPreference()[0].getPreference()[j].getWeight()/sum)*(-rank.getIn().getAlternatives().getAlternative()[i].getWalkingDistance()/(rank.getIn().getRequest().getPreference()[0].getPreference()[j].getValue()*100) +1);
                    				 u += (rank.getIn().getRequest().getPreference()[0].getPreference()[j].getWeight()/sum)*Math.exp(-0.3*Math.pow(rank.getIn().getAlternatives().getAlternative()[i].getWalkingDistance()/(rank.getIn().getRequest().getPreference()[0].getPreference()[j].getValue()*100) , 2));
                    				 System.out.println("walkingDistance u " + u);
                    			 }
                    		 }
                    		 else if(rank.getIn().getRequest().getPreference()[0].getPreference()[j].getName().compareTo("NoOfChanges")==0){
	                    		if(rank.getIn().getAlternatives().getAlternative()[i].getNoOfChanges()<2.0) /*0 for DRIVING and WALKING, 1 for TRANSIT*/
	                  				u += (rank.getIn().getRequest().getPreference()[0].getPreference()[j].getWeight()/sum);
	                  			else if(rank.getIn().getAlternatives().getAlternative()[i].getNoOfChanges()==2.0)
	                  				u += 4.0/5.0*(rank.getIn().getRequest().getPreference()[0].getPreference()[j].getWeight()/sum);
	                  			else if(rank.getIn().getAlternatives().getAlternative()[i].getNoOfChanges()==3.0)
	                  				u += 3.0/5.0*(rank.getIn().getRequest().getPreference()[0].getPreference()[j].getWeight()/sum);
	                  			else if(rank.getIn().getAlternatives().getAlternative()[i].getNoOfChanges()==4.0)
	                  				u += 2.0/5.0*(rank.getIn().getRequest().getPreference()[0].getPreference()[j].getWeight()/sum);
	                  			else
	                  				u += 1.0/5.0*(rank.getIn().getRequest().getPreference()[0].getPreference()[j].getWeight()/sum);
                    		/*	 if(rank.getIn().getAlternatives().getAlternative()[i].getNoOfChanges()>rank.getIn().getRequest().getPreference()[0].getPreference()[j].getValue())
                    				 ;
                    			 else if (rank.getIn().getAlternatives().getAlternative()[i].getNoOfChanges()>=0){
                    				 int noc = rank.getIn().getAlternatives().getAlternative()[i].getNoOfChanges();
                    				 if (noc==0) /*For Driving and walking*/
                    		/*			 noc=1;
                    				 u += (rank.getIn().getRequest().getPreference()[0].getPreference()[j].getValue() - noc + 1)/rank.getIn().getRequest().getPreference()[0].getPreference()[j].getValue();
                    			 }*/
                    			 System.out.println("NoOfChanges u " + u);
                    		 }
                    		 else{
                    			 InvalidInputFault fault = new InvalidInputFault();

             		            fault.setId(rank.getIn().getAlternatives().getAlternative()[i].getId());
             		            String faulttext = rank.getIn().getRequest().getPreference()[0].getPreference()[j].getName()+" is not a valid preference name!";
             		            InvalidInputFaultMessage ex = new InvalidInputFaultMessage(faulttext);
             		            ex.setFaultMessage(fault);
             		            throw ex;
                    		}
                    	 }
                  			rank.getIn().getAlternatives().getAlternative()[i].setUtility(u);
                  			altArray[i]=rank.getIn().getAlternatives().getAlternative()[i];
                  			}
            
                          Arrays.sort(altArray,descUtility);
                          RankResponse rr = new RankResponse();	
                          Trip tr = new Trip();
                          tr.setRequest(rank.getIn().getRequest());
                          AlternativeListType alType = new AlternativeListType();
                          alType.setAlternative(altArray);
                          tr.setAlternatives(alType);
                          rr.setOut(tr);
                     
                          return rr; 
                //TODO : fill this with the necessary business logic
             //   throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#rank");
        }
     
    }
    