package entity;

import java.util.Arrays;

public class User {
    private int id;
    private String username;
    private Post[] posts;

    private int postIndex;

    public User() {
    }

    public User(int id, String username,int postLimit) {
        this.id = id;
        this.username = username;
        this.posts = new Post[postLimit];
    }

    public int getId() {
        return id;
    }

    public int getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(int postIndex) {
        this.postIndex = postIndex;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Post[] getPosts() {
        return posts;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", posts=" + Arrays.toString(posts) +
                '}';
    }
}
