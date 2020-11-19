package App;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            //boolean cont = true;
            //do {
                System.out.println("Lựa chọn chức năng: [1 - 3]");
                System.out.println("1. Làm bài trắc nghiệm");
                System.out.println("2. Xem lại bài thi");
                System.out.println("3. Kết thúc chương trình");

                int n = scanner.nextInt();
                switch (n) {
                    case 1:
                        Dotest dotest = new Dotest();
                        dotest.dotest();
                        break;
                    case 2:
                        System.out.println("Xem lại bài");
                        break;
                    default:
                        System.out.println("Kết thúc chương trình");
                        //cont = false;
                        break;
                }
            //} while (cont);
        }catch (Exception Fail){
            System.out.print("Nhập sai dữ liệu");
        }finally {

        }


    }




}
