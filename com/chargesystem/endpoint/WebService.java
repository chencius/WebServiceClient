

/**
 * WebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */

    package com.chargesystem.endpoint;

    /*
     *  WebService java interface
     */

    public interface WebService {
          

        /**
          * Auto generated method signature
          * 
                    * @param remoteStopCharging0
                
         */

         
                     public com.chargesystem.endpoint.RemoteStopChargingResponse remoteStopCharging(

                        com.chargesystem.endpoint.RemoteStopCharging remoteStopCharging0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param remoteStopCharging0
            
          */
        public void startremoteStopCharging(

            com.chargesystem.endpoint.RemoteStopCharging remoteStopCharging0,

            final com.chargesystem.endpoint.WebServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param remoteStartCharging2
                
         */

         
                     public com.chargesystem.endpoint.RemoteStartChargingResponse remoteStartCharging(

                        com.chargesystem.endpoint.RemoteStartCharging remoteStartCharging2)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param remoteStartCharging2
            
          */
        public void startremoteStartCharging(

            com.chargesystem.endpoint.RemoteStartCharging remoteStartCharging2,

            final com.chargesystem.endpoint.WebServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param answer4
                
         */

         
                     public com.chargesystem.endpoint.AnswerResponse answer(

                        com.chargesystem.endpoint.Answer answer4)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param answer4
            
          */
        public void startanswer(

            com.chargesystem.endpoint.Answer answer4,

            final com.chargesystem.endpoint.WebServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    