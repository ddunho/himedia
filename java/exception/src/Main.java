import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try{
            new FileInputStream("text.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}