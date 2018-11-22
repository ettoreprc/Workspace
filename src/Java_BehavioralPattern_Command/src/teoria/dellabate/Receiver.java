package teoria.dellabate;

import java.io.InputStream;

public class Receiver {
	 
    public void list() {
        System.out.println( exec( "dir c:\\" ) );
    }
 
    private String exec(String command) {
        String outString = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec( "cmd /C " + command );
            process.waitFor();
            InputStream is = process.getInputStream();
            int full = is.available();
            byte[] out = new byte[full];
            is.read(out, 0, (full - 1));
            outString = new String(out);
        } catch (Exception ex1) {
            ex1.printStackTrace();
        }
        return outString;
    }
 
}