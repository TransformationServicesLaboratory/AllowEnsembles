
/**
 * Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:18:31 BST)
 */

            
                package org.example.www.utility_func;
            

            /**
            *  Request bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Request
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Request
                Namespace URI = http://www.example.org/utility_func/
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for Id
                        */

                        
                                    protected java.lang.String localId ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getId(){
                               return localId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Id
                               */
                               public void setId(java.lang.String param){
                            
                                            this.localId=param;
                                       

                               }
                            

                        /**
                        * field for RequestTimestamp
                        */

                        
                                    protected java.lang.String localRequestTimestamp ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRequestTimestamp(){
                               return localRequestTimestamp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequestTimestamp
                               */
                               public void setRequestTimestamp(java.lang.String param){
                            
                                            this.localRequestTimestamp=param;
                                       

                               }
                            

                        /**
                        * field for StartPoint
                        */

                        
                                    protected org.example.www.utility_func.Coordinate localStartPoint ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.example.www.utility_func.Coordinate
                           */
                           public  org.example.www.utility_func.Coordinate getStartPoint(){
                               return localStartPoint;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StartPoint
                               */
                               public void setStartPoint(org.example.www.utility_func.Coordinate param){
                            
                                            this.localStartPoint=param;
                                       

                               }
                            

                        /**
                        * field for EndPoint
                        */

                        
                                    protected org.example.www.utility_func.Coordinate localEndPoint ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.example.www.utility_func.Coordinate
                           */
                           public  org.example.www.utility_func.Coordinate getEndPoint(){
                               return localEndPoint;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EndPoint
                               */
                               public void setEndPoint(org.example.www.utility_func.Coordinate param){
                            
                                            this.localEndPoint=param;
                                       

                               }
                            

                        /**
                        * field for StartCluster
                        */

                        
                                    protected int localStartCluster ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getStartCluster(){
                               return localStartCluster;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StartCluster
                               */
                               public void setStartCluster(int param){
                            
                                            this.localStartCluster=param;
                                       

                               }
                            

                        /**
                        * field for EndCluster
                        */

                        
                                    protected int localEndCluster ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getEndCluster(){
                               return localEndCluster;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EndCluster
                               */
                               public void setEndCluster(int param){
                            
                                            this.localEndCluster=param;
                                       

                               }
                            

                        /**
                        * field for Modes
                        * This was an Array!
                        */

                        
                                    protected org.example.www.utility_func.ModesList[] localModes ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.example.www.utility_func.ModesList[]
                           */
                           public  org.example.www.utility_func.ModesList[] getModes(){
                               return localModes;
                           }

                           
                        


                               
                              /**
                               * validate the array for Modes
                               */
                              protected void validateModes(org.example.www.utility_func.ModesList[] param){
                             
                              if ((param != null) && (param.length < 1)){
                                throw new java.lang.RuntimeException("Input values do not follow defined XSD restrictions");
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param Modes
                              */
                              public void setModes(org.example.www.utility_func.ModesList[] param){
                              
                                   validateModes(param);

                               
                                      this.localModes=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.example.www.utility_func.ModesList
                             */
                             public void addModes(org.example.www.utility_func.ModesList param){
                                   if (localModes == null){
                                   localModes = new org.example.www.utility_func.ModesList[]{};
                                   }

                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localModes);
                               list.add(param);
                               this.localModes =
                             (org.example.www.utility_func.ModesList[])list.toArray(
                            new org.example.www.utility_func.ModesList[list.size()]);

                             }
                             

                        /**
                        * field for DepartTime
                        */

                        
                                    protected org.apache.axis2.databinding.types.Time localDepartTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDepartTimeTracker = false ;

                           public boolean isDepartTimeSpecified(){
                               return localDepartTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.Time
                           */
                           public  org.apache.axis2.databinding.types.Time getDepartTime(){
                               return localDepartTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DepartTime
                               */
                               public void setDepartTime(org.apache.axis2.databinding.types.Time param){
                            localDepartTimeTracker = param != null;
                                   
                                            this.localDepartTime=param;
                                       

                               }
                            

                        /**
                        * field for ArrivalTime
                        */

                        
                                    protected org.apache.axis2.databinding.types.Time localArrivalTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localArrivalTimeTracker = false ;

                           public boolean isArrivalTimeSpecified(){
                               return localArrivalTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.Time
                           */
                           public  org.apache.axis2.databinding.types.Time getArrivalTime(){
                               return localArrivalTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ArrivalTime
                               */
                               public void setArrivalTime(org.apache.axis2.databinding.types.Time param){
                            localArrivalTimeTracker = param != null;
                                   
                                            this.localArrivalTime=param;
                                       

                               }
                            

                        /**
                        * field for Preference
                        * This was an Array!
                        */

                        
                                    protected org.example.www.utility_func.PreferenceListType[] localPreference ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.example.www.utility_func.PreferenceListType[]
                           */
                           public  org.example.www.utility_func.PreferenceListType[] getPreference(){
                               return localPreference;
                           }

                           
                        


                               
                              /**
                               * validate the array for Preference
                               */
                              protected void validatePreference(org.example.www.utility_func.PreferenceListType[] param){
                             
                              if ((param != null) && (param.length < 1)){
                                throw new java.lang.RuntimeException("Input values do not follow defined XSD restrictions");
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param Preference
                              */
                              public void setPreference(org.example.www.utility_func.PreferenceListType[] param){
                              
                                   validatePreference(param);

                               
                                      this.localPreference=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.example.www.utility_func.PreferenceListType
                             */
                             public void addPreference(org.example.www.utility_func.PreferenceListType param){
                                   if (localPreference == null){
                                   localPreference = new org.example.www.utility_func.PreferenceListType[]{};
                                   }

                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPreference);
                               list.add(param);
                               this.localPreference =
                             (org.example.www.utility_func.PreferenceListType[])list.toArray(
                            new org.example.www.utility_func.PreferenceListType[list.size()]);

                             }
                             

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.example.org/utility_func/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Request",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Request",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://www.example.org/utility_func/";
                                    writeStartElement(null, namespace, "id", xmlWriter);
                             

                                          if (localId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("id cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.example.org/utility_func/";
                                    writeStartElement(null, namespace, "RequestTimestamp", xmlWriter);
                             

                                          if (localRequestTimestamp==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RequestTimestamp cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRequestTimestamp);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localStartPoint==null){
                                                 throw new org.apache.axis2.databinding.ADBException("StartPoint cannot be null!!");
                                            }
                                           localStartPoint.serialize(new javax.xml.namespace.QName("http://www.example.org/utility_func/","StartPoint"),
                                               xmlWriter);
                                        
                                            if (localEndPoint==null){
                                                 throw new org.apache.axis2.databinding.ADBException("EndPoint cannot be null!!");
                                            }
                                           localEndPoint.serialize(new javax.xml.namespace.QName("http://www.example.org/utility_func/","EndPoint"),
                                               xmlWriter);
                                        
                                    namespace = "http://www.example.org/utility_func/";
                                    writeStartElement(null, namespace, "StartCluster", xmlWriter);
                             
                                               if (localStartCluster==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("StartCluster cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartCluster));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.example.org/utility_func/";
                                    writeStartElement(null, namespace, "EndCluster", xmlWriter);
                             
                                               if (localEndCluster==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("EndCluster cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndCluster));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                       if (localModes!=null){
                                            for (int i = 0;i < localModes.length;i++){
                                                if (localModes[i] != null){
                                                 localModes[i].serialize(new javax.xml.namespace.QName("http://www.example.org/utility_func/","Modes"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                           throw new org.apache.axis2.databinding.ADBException("Modes cannot be null!!");
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Modes cannot be null!!");
                                        
                                    }
                                  if (localDepartTimeTracker){
                                    namespace = "http://www.example.org/utility_func/";
                                    writeStartElement(null, namespace, "DepartTime", xmlWriter);
                             

                                          if (localDepartTime==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("DepartTime cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDepartTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localArrivalTimeTracker){
                                    namespace = "http://www.example.org/utility_func/";
                                    writeStartElement(null, namespace, "ArrivalTime", xmlWriter);
                             

                                          if (localArrivalTime==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ArrivalTime cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localArrivalTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                       if (localPreference!=null){
                                            for (int i = 0;i < localPreference.length;i++){
                                                if (localPreference[i] != null){
                                                 localPreference[i].serialize(new javax.xml.namespace.QName("http://www.example.org/utility_func/","preference"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                           throw new org.apache.axis2.databinding.ADBException("preference cannot be null!!");
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("preference cannot be null!!");
                                        
                                    }
                                 
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.example.org/utility_func/")){
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                                      elementList.add(new javax.xml.namespace.QName("http://www.example.org/utility_func/",
                                                                      "id"));
                                 
                                        if (localId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("id cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://www.example.org/utility_func/",
                                                                      "RequestTimestamp"));
                                 
                                        if (localRequestTimestamp != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestTimestamp));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RequestTimestamp cannot be null!!");
                                        }
                                    
                            elementList.add(new javax.xml.namespace.QName("http://www.example.org/utility_func/",
                                                                      "StartPoint"));
                            
                            
                                    if (localStartPoint==null){
                                         throw new org.apache.axis2.databinding.ADBException("StartPoint cannot be null!!");
                                    }
                                    elementList.add(localStartPoint);
                                
                            elementList.add(new javax.xml.namespace.QName("http://www.example.org/utility_func/",
                                                                      "EndPoint"));
                            
                            
                                    if (localEndPoint==null){
                                         throw new org.apache.axis2.databinding.ADBException("EndPoint cannot be null!!");
                                    }
                                    elementList.add(localEndPoint);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://www.example.org/utility_func/",
                                                                      "StartCluster"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartCluster));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://www.example.org/utility_func/",
                                                                      "EndCluster"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndCluster));
                            
                             if (localModes!=null) {
                                 for (int i = 0;i < localModes.length;i++){

                                    if (localModes[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://www.example.org/utility_func/",
                                                                          "Modes"));
                                         elementList.add(localModes[i]);
                                    } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Modes cannot be null !!");
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Modes cannot be null!!");
                                    
                             }

                         if (localDepartTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.example.org/utility_func/",
                                                                      "DepartTime"));
                                 
                                        if (localDepartTime != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDepartTime));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("DepartTime cannot be null!!");
                                        }
                                    } if (localArrivalTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.example.org/utility_func/",
                                                                      "ArrivalTime"));
                                 
                                        if (localArrivalTime != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localArrivalTime));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ArrivalTime cannot be null!!");
                                        }
                                    }
                             if (localPreference!=null) {
                                 for (int i = 0;i < localPreference.length;i++){

                                    if (localPreference[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://www.example.org/utility_func/",
                                                                          "preference"));
                                         elementList.add(localPreference[i]);
                                    } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("preference cannot be null !!");
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("preference cannot be null!!");
                                    
                             }

                        

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static Request parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Request object =
                new Request();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"Request".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Request)org.example.www.utility_func.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list7 = new java.util.ArrayList();
                    
                        java.util.ArrayList list10 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.example.org/utility_func/","id").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"id" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.example.org/utility_func/","RequestTimestamp").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RequestTimestamp" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRequestTimestamp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.example.org/utility_func/","StartPoint").equals(reader.getName())){
                                
                                                object.setStartPoint(org.example.www.utility_func.Coordinate.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.example.org/utility_func/","EndPoint").equals(reader.getName())){
                                
                                                object.setEndPoint(org.example.www.utility_func.Coordinate.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.example.org/utility_func/","StartCluster").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"StartCluster" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStartCluster(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.example.org/utility_func/","EndCluster").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"EndCluster" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEndCluster(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.example.org/utility_func/","Modes").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list7.add(org.example.www.utility_func.ModesList.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone7 = false;
                                                        while(!loopDone7){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone7 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://www.example.org/utility_func/","Modes").equals(reader.getName())){
                                                                    list7.add(org.example.www.utility_func.ModesList.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone7 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setModes((org.example.www.utility_func.ModesList[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.example.www.utility_func.ModesList.class,
                                                                list7));
                                                            
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.example.org/utility_func/","DepartTime").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"DepartTime" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDepartTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.example.org/utility_func/","ArrivalTime").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ArrivalTime" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setArrivalTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.example.org/utility_func/","preference").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list10.add(org.example.www.utility_func.PreferenceListType.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone10 = false;
                                                        while(!loopDone10){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone10 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://www.example.org/utility_func/","preference").equals(reader.getName())){
                                                                    list10.add(org.example.www.utility_func.PreferenceListType.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone10 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPreference((org.example.www.utility_func.PreferenceListType[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.example.www.utility_func.PreferenceListType.class,
                                                                list10));
                                                            
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    