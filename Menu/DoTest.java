package Quiz_project.Menu;

import Quiz_project.Menu2.Menu;

import java.io.*;
import java.util.Scanner;

/**
 * Chức năng làm bài
 */
public class DoTest {
    public void dotest(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Lựa chọn ngôn ngữ lập trình \n1. Java\n2. Html \n0. Trở lại");
            int n = scanner.nextInt();
            switch (n){
                case 1:
                    //Đọc file đề bài Java
                    try {
                        FileReader fr = new FileReader("src/Quiz_project/Menu/TestJava.txt");
                        BufferedReader br = new BufferedReader(fr);
                        int i;
                        while ((i= br.read()) != -1){
                            System.out.print((char) i);
                        }
                        br.close();
                        fr.close();
                    }catch (FileNotFoundException e){
                        e.printStackTrace();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                    System.out.println("Bạn hãy nhập đáp án theo thứ tự câu\n      Example: A,B,C,D,E");
                    String Answer = scanner.next();
                    break;
                case 2:
                    //Đọc file đề bài HTML
                    try {
                        FileReader fr = new FileReader("src/Quiz_project/Menu/TestHTML.txt");
                        BufferedReader br = new BufferedReader(fr);
                        int i;
                        while ((i= br.read()) != -1){
                            System.out.print((char) i);
                        }
                        br.close();
                        fr.close();
                    }catch (FileNotFoundException e){
                        e.printStackTrace();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                    /**
                     * Lỗi bị nhập liền ký tự
                     */
                    System.out.println("Bạn hãy nhập đáp án theo thứ tự câu\nExample: A,B,C,D,E");
                    Answer = scanner.next();
                    break;
                case 0:
                    Menu.menu();
                    break;
                default:
                    System.out.println("Hãy chọn lại!");
                    dotest();
                    break;
            }
        } catch (Exception Fail) {
            System.out.println("Nhập sai dữ liệu! Mời nhập lại");
            dotest();
        }

    }
}

