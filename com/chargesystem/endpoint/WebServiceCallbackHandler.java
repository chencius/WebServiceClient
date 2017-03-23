
/**
 * WebServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */

    package com.chargesystem.endpoint;

    /**
     *  WebServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class WebServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public WebServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public WebServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for remoteStopCharging method
            * override this method for handling normal response from remoteStopCharging operation
            */
           public void receiveResultremoteStopCharging(
                    com.chargesystem.endpoint.RemoteStopChargingResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from remoteStopCharging operation
           */
            public void receiveErrorremoteStopCharging(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for remoteStartCharging method
            * override this method for handling normal response from remoteStartCharging operation
            */
           public void receiveResultremoteStartCharging(
                    com.chargesystem.endpoint.RemoteStartChargingResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from remoteStartCharging operation
           */
            public void receiveErrorremoteStartCharging(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for answer method
            * override this method for handling normal response from answer operation
            */
           public void receiveResultanswer(
                    com.chargesystem.endpoint.AnswerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from answer operation
           */
            public void receiveErroranswer(java.lang.Exception e) {
            }
                


    }
    