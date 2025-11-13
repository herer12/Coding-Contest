import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("input/"));
        try ( FileWriter file = new FileWriter("output/output.txt")){
            String line = scanner.nextLine();















        }catch (IOException e){
            e.printStackTrace();
        }
    }
}