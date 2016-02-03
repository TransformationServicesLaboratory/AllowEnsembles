
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:18:31 BST)
 */

        
            package org.example.www.utility_func;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.example.org/utility_func/".equals(namespaceURI) &&
                  "PreferenceListType".equals(typeName)){
                   
                            return  org.example.www.utility_func.PreferenceListType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/utility_func/".equals(namespaceURI) &&
                  "Request".equals(typeName)){
                   
                            return  org.example.www.utility_func.Request.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/utility_func/".equals(namespaceURI) &&
                  "AlternativeListType".equals(typeName)){
                   
                            return  org.example.www.utility_func.AlternativeListType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/utility_func/".equals(namespaceURI) &&
                  "Preference".equals(typeName)){
                   
                            return  org.example.www.utility_func.Preference.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/utility_func/".equals(namespaceURI) &&
                  "Coordinate".equals(typeName)){
                   
                            return  org.example.www.utility_func.Coordinate.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/utility_func/".equals(namespaceURI) &&
                  "ModesList".equals(typeName)){
                   
                            return  org.example.www.utility_func.ModesList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/utility_func/".equals(namespaceURI) &&
                  "Alternative".equals(typeName)){
                   
                            return  org.example.www.utility_func.Alternative.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/utility_func/".equals(namespaceURI) &&
                  "Trip".equals(typeName)){
                   
                            return  org.example.www.utility_func.Trip.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    