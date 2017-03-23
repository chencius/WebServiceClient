package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.rmi.RemoteException;

import javax.activation.DataHandler;

import org.apache.axis2.AxisFault;

import com.chargesystem.endpoint.Answer;
import com.chargesystem.endpoint.AnswerResponse;
import com.chargesystem.endpoint.WebServiceStub;
import com.chargesystem.endpoint.Response;

public class ClientTest {

	public static void main(String[] args) {
		AnswerResponse resp = null;
		//RemoteStopChargingResponse resp = null;
		String url = "http://localhost:8088/axis2/services/WebService";
		try {
			WebServiceStub stub = new WebServiceStub(url);
			Answer an = new Answer();
			resp = stub.answer(an);
//			RemoteStopCharging sc = new RemoteStopCharging();
//			sc.setChargeBox("Chen");
//			sc.setChargePoint("Addams");
//			sc.setConnectorId(88);
//			resp = stub.remoteStopCharging(sc);
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		DataHandler dataFromBytes = resp.get_return();
		InputStream is;
		Response r = null;
		try {
			is = dataFromBytes.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			r = (Response)ois.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(r);
		
    }  

}
