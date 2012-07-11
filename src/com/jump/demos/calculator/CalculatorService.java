package com.jump.demos.calculator;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class CalculatorService extends Service {

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return binder;
	}
	
	public IBinder getBinder()
	{
		return binder;
	}
	@Override
	public void onCreate()
	{
		super.onCreate();
	}
	@Override
	public void onDestroy()
	{
		super.onDestroy();
	}
	
	
	public final CalculatorInterface.Stub binder = new CalculatorInterface.Stub()
			{

				public int add(int a, int b) throws RemoteException {
					// TODO Auto-generated method stub
					return a+b;
				}

				public int subtract(int a, int b) throws RemoteException {
					// TODO Auto-generated method stub
					return a-b;
				}

				public int multiply(int a, int b) throws RemoteException {
					// TODO Auto-generated method stub
					return a*b;
				}

				public int divide(int a, int b) throws RemoteException {
					// TODO Auto-generated method stub
					if(b != 0)
						return a / b;
					else
						throw new RuntimeException("Division by zero");
				}
		
			};
	

}
