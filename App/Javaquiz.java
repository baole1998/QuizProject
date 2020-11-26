package App;

import java.io.*;
import java.util.Scanner;

public class Javaquiz {
    public void javaquiz(){
        try {
            FileReader fileReader = new FileReader("/Users/lebao/IdeaProjects/Test/src/TextQuiz/Javaquiz.txt");
            BufferedReader br = new BufferedReader(fileReader);
            int n;
            while ((n = br.read()) != -1){
                System.out.print((char) n);
            }
            fileReader.close();
            br.close();

            System.out.println();
            System.out.println("Mời bạn nhập đáp án: <vd: A,B,C,D> " );
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


