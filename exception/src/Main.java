import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("index.txt");){

        }catch (IOException e){
            e.printStackTrace();
        }
        //fis.close()를 자동으로 해줌
    }
}