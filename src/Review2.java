import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Review2 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<personnelData> data = new ArrayList<>();
        readPersonnelData(data);
        //print(data);
    }

    private static void readPersonnelData(ArrayList<personnelData> data) throws FileNotFoundException {
        File personnelFile = new File("PersonnelData.txt");
        Scanner scanner = new Scanner(personnelFile).useDelimiter(Pattern.compile("^\\s*$", Pattern.MULTILINE));
        int count = 1;
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();

            //System.out.println(line);

            String[] tokens = line.split("\\r?\\n");
            for (String line1 : tokens){
                if(line.isEmpty()){
                    break;
                }
                System.out.println("line " + count++ + " : " + line1 );
            }
        }
        //System.out.println(sb);
        scanner.close();
    }

    private static void print(ArrayList<personnelData> data){
        System.out.println(data.get(0).getEmployeeNumber());
    }
}
