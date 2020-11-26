package Quiz_project.Menu;

import java.util.Scanner;

/**
 * Chức năng chọn bài
 */
public class DoTest {
    public static void doTest(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Lựa chọn ngôn ngữ lập trình \n1. Java\n2. Html\n3. Thoát \n0. Trở lại");
            int n = scanner.nextInt();
            switch (n){
                case 1:
                    //Đọc file đề bài Java
                    ReadFileTest.readFileTest("src/Quiz_project/Menu/TestJava__Basic.txt");
                    System.out.println("Mời bạn nhập đáp án :");
                    Answer.answer = scanner.next();
                    Answer.saveAnswer();
                    break;
                case 2:
                    //Đọc file đề bài HTML
                    ReadFileTest.readFileTest("src/Quiz_project/Menu/TestHTML__Basic.txt");
                    System.out.println("Mời bạn nhập đáp án :");
                    break;
                case 3:
                    System.out.println("ByeBye!");
                    break;
                case 0:
                    Menu.menu();
                    break;
                default:
                    System.out.println("Hãy chọn lại!");
                    doTest();
                    break;
            }
        }
        catch (Exception e) {
            System.out.println("Nhập sai dữ liệu! Mời nhập lại");
            doTest();
        }
    }
}