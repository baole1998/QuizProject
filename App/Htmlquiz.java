package App;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Htmlquiz {
    public void htmlquiz(){
        try {
            FileReader fr = new FileReader("/Users/lebao/IdeaProjects/Test/src/TextQuiz/Htmlquiz.txt");
            BufferedReader bufferedReader = new BufferedReader(fr);
            int i;
            while ((i = bufferedReader.read()) != -1){
            System.out.print((char) i);
            }
            fr.close();
            bufferedReader.close();

            System.out.println();
            System.out.println("Mời bạn nhập đáp án: <vd: A,C,D,B> " );
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
