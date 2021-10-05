package Quiz_project.Menu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Lưu đáp án
 */
public class Answer {
    public static String answer;

    public static void saveAnswer() {
        boolean yesOrno;
        String yn;
        Scanner scanner =new Scanner(System.in);
            System.out.println("Bạn có muốn lưu đáp án :(Y)es / (N)o");
            while (true){
                yn = scanner.nextLine().toUpperCase();
                if (yn.equals("Y")) {
                    yesOrno = true;
                    try {
                        FileWriter writer = new FileWriter("src/Quiz_project/Menu/User_anwser.txt");
                        BufferedWriter bufferedWriter = new BufferedWriter(writer);
                        bufferedWriter.write("Answer\n"+ answer);
                        bufferedWriter.newLine();
                        bufferedWriter.close();
                        System.out.println("Success!");

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }else if (yn.equals("N")){
                    yesOrno = false;
                    break;
                }else {
                    System.out.println("Bạn hãy nhập (Y) hoặc (N)");
                }
            }
    }
}


