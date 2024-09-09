import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Writer {
    public void writeTodo(String fileName) throws IOException{
        FileWriter fw = new FileWriter(fileName, Charset.forName("utf8"), true);
        fw.write("Feladatgyűjteményből gyakorlás");
        fw.close();

                
        
    }
}
