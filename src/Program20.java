import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program20 {

	static File f = new File("C:\\Users\\Aaditya Dwivedi\\Desktop\\NewFile.txt");

	static void MakeFile() {
		try {
			if (f.createNewFile()) {
				System.out.println("File Created Successfully.");
			} else {
				System.out.println("File Already Exists.");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	static void getFileInformation() {
		try {
			if (f.exists()) {
				System.out.println("File Name: " + f.getName());
				System.out.println("File Path: " + f.getAbsolutePath());
				System.out.println("Readable: " + f.canRead());
				System.out.println("Writable: " + f.canWrite());
				System.out.println("Executable: " + f.canExecute());
				System.out.println("File Size in Bytes: " + f.length());
			}

		} catch (Exception e) {
			e.getMessage();
		}
	}

	static void writeData() throws IOException {
		FileWriter FW = new FileWriter(f);
		try {
			FW.write("Java is Cool !!!");
			System.out.println("File Written successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			FW.close();
		}
	}

	static void readData() throws Exception {
		Scanner SC = new Scanner(f);
		while (SC.hasNextLine()) {
			String fileData = SC.nextLine();
			System.out.println(fileData);
		}
		SC.close();
	}

	static void operation() {
		File dest = new File("C:\\Users\\Aaditya Dwivedi\\Desktop\\New.txt");
		if (f.renameTo(dest)) {
			System.out.println("File Renamed !");
		} else {
			System.out.println("File not renamed :(");
		}
		File make = new File("C:\\Users\\Aaditya Dwivedi\\Desktop\\New\\File");
		if (make.mkdirs()) { 			// directories under directory
			System.out.println("Directories created !");
		} else {
			System.out.println("Directories not created :(");
		}
	}

	public static void main(String[] args) throws Exception {
		Program20.MakeFile();
		Program20.getFileInformation();
		Program20.writeData();
		Program20.readData();
		Program20.operation();
	}
}
