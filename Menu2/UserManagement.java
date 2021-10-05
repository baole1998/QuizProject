package Quiz_project.Menu2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class UserManagement {
    private ArrayList<User> users = new ArrayList<User>();
    private HashMap<String, User> mapUsers = new HashMap<String, User>();
//    private int totalUser;

    public UserManagement(ArrayList<User> users, HashMap<String, User> mapUsers) {
        this.users = users;
        this.mapUsers = mapUsers;
//        this.totalUser = totalUser;
    }

    public UserManagement() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

//        for (User user: users) {
            System.out.println("Mời nhập tên :");
            String user_name = scanner.next();
            int level = random.nextInt(2);
            int score = random.nextInt(10);

            try {
                FileWriter writer = new FileWriter("src/Quiz_project/Save_here/User.txt"+user_name);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                bufferedWriter.write("User name :"+user_name+"\nLevel :"+level+"\nScore :"+score);
                bufferedWriter.newLine();
                bufferedWriter.close();
                User user = new User(user_name, score, level);
                users.add(user);
                mapUsers.put(user_name,user);
                System.out.println("Successful save user's information!");
            }catch (IOException e){
                e.printStackTrace();
            }
//        }
    }

    /**
     * Tìm Max,Min
     * @return User
     */
    public User getMaxScore() {
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                return user1.getScore().compareTo(user2.getScore());
            }
        });
        return users.get(users.size()-1);
    }
    public User getMinScore(){
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                return user1.getScore().compareTo(user2.getScore());
            }
        });
        return users.get(0);
    }

    /**
     * Tìm theo id
     */
    public User getUserById(String name){
        return mapUsers.get(name);
    }

    /**
     * in dãy user theo thứ tự
     */
    public void printArrayUser() {
        for (User user : users
        ) {

        }
    }
}
