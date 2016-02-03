
/**
 * Pssgr_utilSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package gr.tsl.services.pssgr_util;

import java.util.Arrays;
import java.util.Comparator;

    /**
     *  Pssgr_utilSkeleton java skeleton for the axisService
     */
    public class Pssgr_utilSkeleton{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param evaluation 
             * @return evaluationResponse 
         */
   	 static private Comparator<PRoute> descUtility;
     
		
     // We initialize static variables inside a static block.
     static {
         descUtility = new Comparator<PRoute>(){
             @Override public int compare(PRoute rt1, PRoute rt2){
                 return (int)((rt2.getUtility() - rt1.getUtility())*100);
             }
         };     
     }
        
                 public gr.tsl.services.pssgr_util.EvaluationResponse evaluation
                  (
                  gr.tsl.services.pssgr_util.Evaluation evaluation
                  )
            {
                   	 double b = 0.3;
                   	 double a = 1.2;
                   	 double t = 1.0;
                   	 PRoute [] rrArray = new PRoute[evaluation.getIn().length];
                     
                     
                   	 for (int i=0;i<evaluation.getIn().length;i++)
                   	 {
                   		 double w = 1.0 / (evaluation.getIn()[i].localPrf.length + 1);
                   		 double v=0;
                   		 evaluation.getIn()[i].localUtility = 0;
                   		 for (int j=0; j<evaluation.getIn()[i].localPrf.length;j++)
                   		 {
                       		 if(evaluation.getIn()[i].localPrf[j].localValue.length>0 && evaluation.getIn()[i].localPrf[j].localValue[0]==true)
                       			 v=1;
                       		 else if(evaluation.getIn()[i].localPrf[j].localValue.length>1 && evaluation.getIn()[i].localPrf[j].localValue[1]==true)
                       			 v=0.75;
                       		 else if(evaluation.getIn()[i].localPrf[j].localValue.length>2 && evaluation.getIn()[i].localPrf[j].localValue[2]==true)
                       			 v=0.5;
                       		 else
                       			 v=0;
                       		evaluation.getIn()[i].localUtility += w*v;
                   		 }
                  		evaluation.getIn()[i].localUtility = w*(Math.exp(-(a*t))/Math.exp(b*evaluation.getIn()[i].localCost));
                   		rrArray[i] = evaluation.getIn()[i];
                   	 }
          
                   	 Arrays.sort(rrArray,descUtility);
                
                	 EvaluationResponse er = new EvaluationResponse();
                	 er.setOut(rrArray[0]);
                	 return er;        }
     
    }
    