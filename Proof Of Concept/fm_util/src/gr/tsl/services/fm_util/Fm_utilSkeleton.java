
/**
 * Fm_utilSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package gr.tsl.services.fm_util;

import java.util.Arrays;
import java.util.Comparator;

    /**
     *  Fm_utilSkeleton java skeleton for the axisService
     */
    public class Fm_utilSkeleton{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param rank 
             * @return rankResponse 
         */
    	 static private Comparator<Route> descUtility;
	     
			
	     // We initialize static variables inside a static block.
	     static {
	         descUtility = new Comparator<Route>(){
	             @Override public int compare(Route rt1, Route rt2){
	                 return (int)((rt2.getUtility() - rt1.getUtility())*100);
	             }
	         };     
	     }
        
        
                 public gr.tsl.services.fm_util.RankResponse rank
                  (
                  gr.tsl.services.fm_util.Rank rank
                  )
                 {
                       	 int THRESHOLD_1 = 5;
                           	 int THRESHOLD_2 = 2;
                           	 double b = 0.3;
                           	 double a = 1.2;
                           	 double t = 1.0;
                           	 double k = 2.1;
                           	 double f = 1.4;
                           	 
                           	 Route [] rrArray = new Route[rank.getIn().length];
                           	 Route [] prfArray = new Route[rank.getIn().length];
                           	
                             int lArray=0;
                             int prflArray = 0;
                             
                           	 for (int i=0;i<rank.getIn().length;i++)
                           	 {
                           		 if (rank.getIn()[i].localState==1)
                           		 {
                           			 if (rank.getIn()[i].localCapacity< THRESHOLD_1)
                           			 {
                           				rank.getIn()[i].localUtility= b * rank.getIn()[i].localCost * Math.exp(-(a*t)) + k*rank.getIn()[i].localCapacity;
                           			 }
                           			 else
                           			 {
                           				rank.getIn()[i].localUtility = b * rank.getIn()[i].localCost * Math.exp(-(a*t)) + k;
                           			 }	 
                           		 }
                           		 else
                           			rank.getIn()[i].localUtility = b * rank.getIn()[i].localCost * Math.exp(-(a*t)) + f*rank.getIn()[i].localCapacity;
                           		 if(rank.getIn()[i].localUtility>=THRESHOLD_2)
                           			rrArray[lArray++]=rank.getIn()[i];
                           		 
                           	 }
                  
                           	 Arrays.sort(rrArray,descUtility);
                           	
                           	 prflArray = 0;
                           	 for (int i=0; i<rrArray.length && rrArray[i]!= null; i++)
                           	 {
                           		 int flag=0;
                           		 for (int j=0; j<rrArray[i].localPrf.length; j++)
                           		 {
                           			 for(int x=0;x<rrArray[i].localPrf[j].localValue.length; x++)
                           			 {
        	                   			 if (rrArray[i].localPrf[j].localValue[x]==false)
        	                   			 {
        	                   				 flag++;
        	                   				 break;
        	                   	
        	                   			 }
                           			 }
                           		 }
                           		 if (flag==0)
                           			 prfArray[prflArray++] = rrArray[i];
                           		 
                           	 }
                           	 
                           	 if(prflArray==0)
                           	 {
                           		 Route [] tmpArray = new Route[lArray];
                          		 for (int i=0; i<lArray; i++)
                          			 tmpArray[i] = rrArray[i];
                           		 Arrays.sort(tmpArray,descUtility);
                              	 RankResponse rr = new RankResponse();	 
                              	 rr.setOut(tmpArray);
                              	 return rr; 
                           	 }
                           	 else
                           	 {
                           		 Route [] tmpArray = new Route[prflArray];
                           		 for (int i=0; i<prflArray; i++)
                           			 tmpArray[i] = prfArray[i];
                           		 Arrays.sort(tmpArray,descUtility);
                              	 RankResponse rr = new RankResponse();	 
                              	 rr.setOut(tmpArray);
                              	 return rr;       
                           	 }
                           	 }
             
            }
    