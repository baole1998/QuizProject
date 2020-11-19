package Quiz_project.Menu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserManagement {
    private User[] users ;
    private int totalUser;

    public UserManagement(User[] users, int totalUser) {
        this.users = users;
        this.totalUser = totalUser;
    }

    public UserManagement(){
        Scanner scanner = new Scanner(System.in);
        users = new User[totalUser];

        for (int i=0;i<totalUser;i++){
            System.out.println("Mời nhập tên :");
            String user_name = scanner.next();
//            try {
//                FileWriter writer = new FileWriter("src/Quiz_project/Menu/User_name.txt");
//                BufferedWriter bufferedWriter = new BufferedWriter(writer);
//                bufferedWriter.write("a1");
//                bufferedWriter.newLine();
//                bufferedWriter.write("a2");
//                bufferedWriter.close();
//                System.out.println("Success");
//            }catch (Exception e){
//                e.fillInStackTrace();
//            }
        }
    }
}
