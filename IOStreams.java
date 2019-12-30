import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class IOStreams {
	public static void main(String args[]) {
		// File Object
		File f = new File("C:\\Users\\admin\\Desktop\\table.htm");
//		System.out.println(f.isFile());
//		System.out.println(f.length());
//		System.out.println(f.isDirectory());
//		System.out.println(f.canRead());
//		System.out.println(f.getAbsolutePath());
//		System.out.println(f.canExecute());

		// FileOutputStream (8 bits)
		try (FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\abc.txt")) {
			for (int i = 65; i < 91; i++)
				fos.write(i);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// FileInputStream (8 bits)
		try (FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\abc.txt")) {
			int ch;
			while ((ch = fis.read()) != -1) {
//				System.out.print((int) ch + " ");
			}
//			while ((ch = fis.read()) != -1)
//				System.out.print((char) ch + " ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// FileWriter (16 bits)
		try (FileWriter fw = new FileWriter("C:\\Users\\admin\\Desktop\\abc.txt", true)) {
			for (int i = 97; i <= 122; i++)
				fw.write(i);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// FileReader (16 bits)
		try (FileReader fr = new FileReader("C:\\Users\\admin\\Desktop\\abc.txt")) {
			int ch;
			System.out.println("\n");
			while ((ch = fr.read()) != -1) {
//				System.out.print((char) ch + " ");
			}
			f.delete();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// ByteArrayInputStream
		byte[] arr = { 10, 20, 30, 40, 50 };
		try (ByteArrayInputStream bis = new ByteArrayInputStream(arr)) {
			int ch;
			while ((ch = bis.read()) != -1) {
//				System.out.print(ch);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// DataoutputStream
		try (FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\abc.dat")) {
			DataOutputStream dos = new DataOutputStream(fos);
			int i = 1234567;
			float f1 = 10.f;
			double d = 902192091.99;
			dos.write(i);
			dos.writeFloat(f1);
			dos.writeDouble(d);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// DataOutputStream
		try (FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\abc.dat")) {
			DataInputStream dis = new DataInputStream(fis);
			int ch;
			int i = dis.readInt();
			float f1 = dis.readFloat();
			double d = dis.readDouble();
			System.out.println(i + "\n" + f + "\n" + d);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		//BufferedOutputStream
		try (FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\abc.dat")) {
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			for (int i = 65; i < 90; i++)
				bos.write(i);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		//BufferedInputStream
		try (FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\abc.dat")) {
			BufferedInputStream bis = new BufferedInputStream(fis);
			int ch;
			while((ch = bis.read()) != -1) {
				System.out.println((char) ch + "");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
