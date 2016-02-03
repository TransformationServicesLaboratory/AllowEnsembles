
/**
 * InvalidInputFaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */

package org.example.www.utility_func;

public class InvalidInputFaultMessage extends java.lang.Exception{

    private static final long serialVersionUID = 1449598553546L;
    
    private InvalidInputFault faultMessage;

    
        public InvalidInputFaultMessage() {
            super("InvalidInputFaultMessage");
        }

        public InvalidInputFaultMessage(java.lang.String s) {
           super(s);
        }

        public InvalidInputFaultMessage(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public InvalidInputFaultMessage(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(InvalidInputFault fault){
       faultMessage = fault;
    }
    
    public InvalidInputFault getFaultMessage(){
       return faultMessage;
    }
}
    