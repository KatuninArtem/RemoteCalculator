package com.jump.demos.calculator;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class CalculatorService extends Service {

	@Override
	public IBinder onBind(Intent arg0) {
		return binder;
	}
	
	public IBinder getBinder() {
		return binder;
	}
	
	public final CalculatorInterface.Stub binder = new CalculatorInterface.Stub()
			{
				public int add(int a, int b) throws RemoteException {
					return a + b;
				}

				public int subtract(int a, int b) throws RemoteException {
					return a - b;
				}

				public int multiply(int a, int b) throws RemoteException {
					return a * b;
				}

				public int divide(int a, int b) throws RemoteException {
					if(b != 0) {
						return a / b;
					} else {
						throw new RuntimeException("Division by zero");
					}
				}
		
			};
	
}
