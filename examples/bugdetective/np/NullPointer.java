package examples.bugdetective.np;
import java.io.*;

public class NullPointer
{
    String sFileName = "";
    
    int getLineLength()
	{
        String sFirstLine = null;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(sFileName));
            sFirstLine = reader.readLine();
        } catch (Exception e) {
            System.out.println("Exception occured. " + e.toString());
        } finally {
            close(reader);
        }
        return sFirstLine.length();
	}
    
    private void close(Reader reader) 
    {
        try {
            reader.close();
        } catch (Exception e) {            
        }
    }
    
}
