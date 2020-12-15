import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class combine_output {

    public static void main(String[] args) throws IOException {

    String combined = "";
    String res = "";

    for(int i = 0; i<1000 ; i++) {

        File file = new File ("E:/4th Year Sem 1/Thesis 2/RPRK_output/output_RPRK_" + i + ".txt");        

        Scanner scan = new Scanner(file);
        String word = scan.nextLine();
        res += word;
        System.out.println("Combining file : " + i);
    }

    FileWriter write = new FileWriter("E:/4th Year Sem 1/Thesis 2/RPRK_output/combined_RPRK/Combined_RPRK.txt");
    write.write(res);
    write.close();
        
    }
    
}
