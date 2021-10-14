//package Quiz_project.Menu;
//
//import java.util.Scanner;
//
//public class Menu {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("__________MENU__________");
//            System.out.println("1. Làm bài trắc nghiệm");
//            System.out.println("2. Xem lại bài thi");
//            System.out.println("3. Kết thúc chương trình");
//
//            int n = scanner.nextInt();
//            switch (n) {
//                case 1:
//                    DoTest dotest = new DoTest();
//                    dotest.dotest();
//                    break;
//                case 2:
//                    CheckTest checkTest = new CheckTest();
//                    checkTest.checkAgain();
//                    break;
//                case 3:
//                    System.out.println("Bye!");
//                    break;
//                default:
//                    System.out.println("Hãy chọn lại!");
//                    Menu.main();
//                    break;
//            }
//        }catch (Exception Fail){
//            System.out.println("Nhập sai dữ liệu!");
//            Menu.main();
//        }finally {
//        }
//    }
//
//    static void main() {
//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("__________MENU__________");
//            System.out.println("1. Làm bài trắc nghiệm");
//            System.out.println("2. Xem lại bài thi");
//            System.out.println("3. Kết thúc chương trình");
//
//            int n = scanner.nextInt();
//            switch (n) {
//                case 1:
//                    DoTest dotest = new DoTest();
//                    dotest.dotest();
//                    break;
//                case 2:
//                    CheckTest checkTest = new CheckTest();
//                    checkTest.checkAgain();
//                    break;
//                case 3:
//                    System.out.println("Bye!");
//                    break;
//                default:
//                    System.out.println("Hãy chọn lại");
//                    Menu.main();
//                    break;
//            }
//        }catch (Exception Fail){
//            System.out.println("Nhập sai dữ liệu! Mời bạn nhập lại");
//            Menu.main();
//        }finally {
//        }
//    }
//}
