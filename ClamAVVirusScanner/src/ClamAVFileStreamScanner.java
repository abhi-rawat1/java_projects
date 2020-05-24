import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import fi.solita.clamav.ClamAVClient;

public class ClamAVFileStreamScanner {
	public static void main(String [] arg) {
		try {
			ClamAVClient client = new ClamAVClient("localhost", 3310);
			InputStream inFile;
			inFile = new FileInputStream(new File("D:\\Abhishek\\CodeIssues.docx"));
			byte[] reply = client.scan(inFile);
			if (!ClamAVClient.isCleanReply(reply)) {
				System.out.println("Virus is present in a file. Something was found");
			} else {
				System.out.println(" File is good");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
