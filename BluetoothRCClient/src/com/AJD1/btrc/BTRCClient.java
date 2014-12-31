package com.AJD1.btrc;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

//To be used by BluetoothRCCientGUI class.
public class BTRCClient {
	//Declaring IP and port to be used in order to reach the EV3 over Bluetooth. 
	//IP is default for the EV3. 
	static final String IP = "10.0.1.1";
	static final int PORT = 1111;
	
	//These are the methods that can be called. Each method has a corresponding action
	//that will be carried out by the EV3.
	public void bluetoothForward() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(1);
		socket.close();
	}
	
	public void bluetoothReverse() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(2);
		socket.close();
	}
	
	public void bluetoothRight() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(3);
		socket.close();
	}
	
	public void bluetoothLeft() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(4);
		socket.close();
	}
	
	public void bluetoothStop() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(5);
		socket.close();
	}
	
	public void bluetoothExit() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(6);
		socket.close();
	}
	
	public void bluetoothHonk() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(7);
		socket.close();
	}
	
	public void bluetoothFire() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(8);
		socket.close();
	}
	
	public void bluetoothStopFire() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(9);
		socket.close();
	}

}
