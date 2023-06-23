import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception_01 {
    public static void main(String[] args) throws IOException {
        FileInputStream file = null;
try {
   file = new FileInputStream("\"T:\\CLONE\\calculator.css\"");
}catch (FileNotFoundException e){
    System.out.println("File not found ");
}finally {
    // cleanup code
    if (file !=null ){

        file.close();
    }
    System.out.println("FILE CLOSED ");
}

    }
}
