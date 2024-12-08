package decorators_java_api;

import java.io.*;

public class AUX_CLS {

    public static void writeTextToFile(String filePath, String text){
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File((filePath)))))){
            bw.write(text);
            bw.write(System.lineSeparator());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
