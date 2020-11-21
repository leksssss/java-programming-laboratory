import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class CopyFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File input = new File("original.txt");
		input.createNewFile();
		File output = new File("copy.txt");
		output.createNewFile();
		FileInputStream in = new FileInputStream(input);
		FileOutputStream out = new FileOutputStream(output);
		int val;
		System.out.println("Copy File Content :");
		while((val=in.read())!=-1) {
			out.write(val);
			System.out.print((char)val);
		}
		in.close();
		out.close();
	}

}
