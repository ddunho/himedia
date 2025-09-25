import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(FileWriter filewriter = new FileWriter("output.txt")){
            filewriter.write("Hello World");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}