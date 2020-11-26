package App;

import java.util.Scanner;

public class Dotest {
    public void dotest() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lựa chọn ngôn ngữ lập trình ? \n 1. Java \n 2. Html");
            int lange = scanner.nextInt();
            switch (lange) {
                case 1:
                    Javaquiz javaquiz = new Javaquiz();
                    javaquiz.javaquiz();
                    break;
                case 2:
                    Htmlquiz htmlquiz = new Htmlquiz();
                    htmlquiz.htmlquiz();
                    break;
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập mã sinh viên: (Vd: 101, 102, 103,...)" );
            int ID = sc.nextInt();
            sc.nextLine();
            System.out.println("Mời bạn nhập tên:");
            String name = sc.next();

        }catch (Exception ex) {
            System.out.println("!!!Yêu cầu nhập bằng chữ số");
        } finally {

        }
    }
}
