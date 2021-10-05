package Quiz_project.Menu2;

public class User {
    protected String user_name;
    protected int score;
    protected int level;

    public User(String user_name, int score, int level) {
        this.user_name = user_name;
        this.score = score;
        this.level = level;
    }


    /**
     * @return
     */
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "User_Information{" + user_name + '\'' + "score :" + score + "level :" + level +
                '}';
    }
}
