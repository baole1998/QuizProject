package App;

import java.io.*;
import java.util.Scanner;

public class Javaquiz {
    public void javaquiz(){
        try {
            FileReader fileReader = new FileReader("/Users/lebao/Desktop/Bao's Files/Coding/Java/App.Javaquiz.txt");
            BufferedReader br = new BufferedReader(fileReader);
            int n;
            while ((n = br.read()) != -1){
                System.out.print((char) n);
            }
            String line = "";
            while ((line=br.readLine()) != null);

            fileReader.close();
            br.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Mời bạn nhập đáp án: " );
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

    }
}


