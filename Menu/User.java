package Quiz_project.Menu;

public abstract class User {
    protected String user_name;
    protected int score;
    protected String level;

    public User(String user_name, int score) {
        this.user_name = user_name;
        this.score = score;
    }

    /**
     *
     * @return
     */
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    @Override
    public String toString() {
        return "User_Information{"  + user_name + '\'' + "score :" + score +
                '}';
    }
}
