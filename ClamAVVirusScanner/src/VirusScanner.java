

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VirusScanner {
	public static void main(String[] arg) {
		try {

			ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c",
					"C: && cd \"C:\\Program Files\\ClamAV\" && clamscan.exe \"D:\\Abhishek\\environment.yml\"");
			builder.redirectErrorStream(true);
			Process p = builder.start();
			BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line;
			while (true) {
				line = r.readLine();
				if (line == null) {
					break;
				}
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
