package com.deloitte.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.deloitte.java.models.Student;

public class ObjectSerializationStudent {
	public static void main(String args[]) {

		Student s1 = new Student("bhanu", 22, 1234, 1, 76, 90);

		// writing object to file (serialization)
		try (FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\git\\repository\\NexWave\\src\\stu.dat")) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// reading object from file (de-serialization)
		try (FileInputStream fis = new FileInputStream("C:\\Users\\admin\\git\\repository\\NexWave\\src\\stu.dat")) {
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student e2 = (Student) ois.readObject();
			System.out.println(e2);
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
	}
}
