package files_and_streams;
import java.io.*;
import java.sql.SQLException;
import java.util.Scanner;

public class zerotostar {
    public static void main(String[] args) throws IOException, SQLException {
        String n = "";
        File file = new File("C:\\Users\\vishnu\\Desktop\\que1.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            char[] txt = line.toCharArray();
            for(int i=0;i<txt.length;i++)
            {
                if(txt[i]=='0' || txt[i]=='o')
                {
                    txt[i] = '*';
                }
                n = n+ txt[i];
            }
        }
        System.out.println(n);
        BufferedWriter fin = new BufferedWriter(new FileWriter("C:\\Users\\vishnu\\Desktop\\que1sol.txt"));

        fin.write(n);
        fin.close();
    }

}
