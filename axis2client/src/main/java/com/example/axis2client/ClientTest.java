package com.example.axis2client;

import java.rmi.RemoteException;

import org.tempuri.AddDocument;
import org.tempuri.AddResponseDocument;
import org.tempuri.DivideDocument;
import org.tempuri.DivideResponseDocument;
import org.tempuri.MultiplyDocument;
import org.tempuri.MultiplyResponseDocument;
import org.tempuri.SubtractDocument;
import org.tempuri.SubtractResponseDocument;
import org.tempuri.AddDocument.Add;
import org.tempuri.DivideDocument.Divide;
import org.tempuri.MultiplyDocument.Multiply;
import org.tempuri.SubtractDocument.Subtract;

import com.example.wsdl.CalculatorStub;

public class ClientTest {
	public static void testAdd() throws RemoteException {
		CalculatorStub cal = new CalculatorStub();
		Add add = AddDocument.Add.Factory.newInstance();
		add.setIntA(2);
		add.setIntB(1);
		AddDocument addDoc = AddDocument.Factory.newInstance();
		addDoc.setAdd(add);

		AddResponseDocument response = cal.add(addDoc);
		System.out.println(response.getAddResponse().getAddResult());
	}

	public static void testDivide() throws RemoteException {
		CalculatorStub cal = new CalculatorStub();
		Divide divide = DivideDocument.Divide.Factory.newInstance();
		divide.setIntA(2);
		divide.setIntB(2);
		DivideDocument divideDoc = DivideDocument.Factory.newInstance();
		divideDoc.setDivide(divide);
		;

		DivideResponseDocument response = cal.divide(divideDoc);
		System.out.println(response.getDivideResponse().getDivideResult());
	}

	public static void testMultiply() throws RemoteException {
		CalculatorStub cal = new CalculatorStub();
		Multiply multiply = MultiplyDocument.Multiply.Factory.newInstance();
		multiply.setIntA(2);
		multiply.setIntB(2);
		MultiplyDocument multiplyDoc = MultiplyDocument.Factory.newInstance();
		multiplyDoc.set(multiply);
		;

		MultiplyResponseDocument response = cal.multiply(multiplyDoc);
		System.out.println(response.getMultiplyResponse().getMultiplyResult());
	}

	public static void testSubtract() throws RemoteException {
		CalculatorStub cal = new CalculatorStub();
		Subtract subtract = SubtractDocument.Subtract.Factory.newInstance();
		subtract.setIntA(2);
		subtract.setIntB(1);
		SubtractDocument subtractDoc = SubtractDocument.Factory.newInstance();
		subtractDoc.set(subtract);
	
		SubtractResponseDocument response = cal.subtract(subtractDoc);
		System.out.println(response.getSubtractResponse().getSubtractResult());
	}

	public static void main(String[] args) throws RemoteException {
		ClientTest.testAdd();
		ClientTest.testDivide();
		ClientTest.testMultiply();
		ClientTest.testSubtract();
	}
}
