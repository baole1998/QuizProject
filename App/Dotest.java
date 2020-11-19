package App;

import java.util.Scanner;

public class Dotest {
    public void dotest(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lựa chọn ngôn ngữ lập trình ? \n 1. Java \n 2. Html");
        int lange = scanner.nextInt();
        switch (lange) {
            case 1:
                Javaquiz javaquiz = new Javaquiz();
                javaquiz.javaquiz();
        }



    }
}
