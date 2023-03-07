import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EmployeeListings {

    public static void main(String[] args) throws IOException {


        BufferedReader br = Files.newBufferedReader(Paths.get(System.getProperty("user.dir")+"\\employees.csv" )) ;

        StringBuilder manager = new StringBuilder();
        StringBuilder single_name_employees = new StringBuilder();


        //skipping first line (Name,Role,Division)
        String str=br.readLine() ;

        // storing each line
        while ((str = br.readLine()) != null) {

          String[] strings = str.split(",");
            if (strings[1].equals("Manager") && strings[2].equals("R&D")) {
                manager.append(str).append("\n") ;
            }
            if (!strings[0].contains(" ")) {
                single_name_employees.append(str).append("\n") ;
            }

        }

        // writing the stored values in files
        FileWriter managerFileWriter = new FileWriter(System.getProperty("user.dir")+"\\managers.csv");
        managerFileWriter.write(manager.toString());
        managerFileWriter.close();


        FileWriter singleNameEmpWriter = new FileWriter(System.getProperty("user.dir") + "\\single_name_employees.csv");
        singleNameEmpWriter.write(single_name_employees.toString());
        singleNameEmpWriter.close();

    }
}
