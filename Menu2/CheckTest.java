package Quiz_project.Menu2;


import java.util.Scanner;

/**
 * Chức năng kiểm tra lại
 */
public class CheckTest {
    public static void checkAgain(){
        System.out.println("Bạn muốn xem lại mục nào ");
        System.out.println("1. Thông tin user \n2. Các truy vấn khác \n3. Thoát \n0. Trở lại");
        Scanner scanner = new Scanner(System.in);
        UserManagement userManagement = new UserManagement();
        int check = scanner.nextInt();
        switch (check){
            case 1:
                System.out.println("Nhập tên user muốn tìm");
                String user_name = scanner.next();
                System.out.println();// trả về tên vừa nhập
                break;
            case 2:
                System.out.println("Mời chọn truy vấn ");
                break;
            case 3:
                System.out.println("Bye!");
                break;
            case 0:
                Menu.menu();
                break;
            default:
                System.out.println("Bạn hãy chọn lại ");
                break;
        }
    }
}
