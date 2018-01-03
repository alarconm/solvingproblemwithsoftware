package Week1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HelloUnicode {

    public void printHello() {

        String fileName = "D:\\JavaProjects\\solvingproblemswithsoftware\\src\\main\\resources\\text\\hellounicode.txt";


        String line = null;

        try {

            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("unable to open file '" + fileName + "'");
        }
        catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }

    }

}
