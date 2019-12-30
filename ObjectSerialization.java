import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectSerialization {

	public static void main(String args[]) {
		Employee2 e = new Employee2(101, "Bhanu", 25000);
		try(FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\git\\repository\\NexWave\\src\\emp.dat")){
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e);
		}
		catch(Exception e1){
			System.out.println(e1.getMessage());
		}
	}
}
