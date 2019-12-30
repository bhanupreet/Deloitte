package com.deloitte.java;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.deloitte.java.models.Employee2;

public class ObjectSerialization {

	public static void main(String args[]) {
		Employee2 e = new Employee2(101, "Bhanu", 25000);
		
		//writing object to file (serialization)
		try(FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\git\\repository\\NexWave\\src\\emp.dat")){
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e);
		}
		catch(Exception e1){
			System.out.println(e1.getMessage());
		}
		                         
		//reading object from file (de-serialization)
		try(FileInputStream fos = new FileInputStream("C:\\Users\\admin\\git\\repository\\NexWave\\src\\emp.dat")){
			ObjectInputStream ois = new ObjectInputStream(fos);
			Employee2 e2 = (Employee2) ois.readObject();
			System.out.println(e2);
		}
		catch(Exception e1){
			System.out.println(e1.getMessage());
		}
		
	}
}
