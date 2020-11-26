package Quiz_project.Menu;

import java.util.Scanner;

/**
 * Hiển thị menu
 */
public class Menu {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("__________MENU__________");
            System.out.println("1. Làm bài trắc nghiệm");
            System.out.println("2. Xem lại bài thi");
            System.out.println("3. Kết thúc chương trình");

            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    DoTest dotest = new DoTest();
                    dotest.doTest();
                    break;
                case 2:
                    CheckTest checkTest = new CheckTest();
                    checkTest.checkAgain();
                    break;
                case 3:
                    System.out.println("ByeBye!");
                    break;
                default:
                    System.out.println("Hãy chọn lại!");
                    menu();
                    break;
            }
        }catch (Exception Fail){
            System.out.println("Nhập sai dữ liệu!");
            menu();
        }finally {
        }
    }
}
// STOPSHIP: 25-Nov-20