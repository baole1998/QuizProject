package Quiz_project.Menu;

import java.util.Scanner;

/**
 * nhập câu trả lời
 */
public class InsertAnswer {
    public String answer;
    public static void insertAnswer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập đáp án :");
        String answer = scanner.nextLine().toUpperCase();
    }
}
