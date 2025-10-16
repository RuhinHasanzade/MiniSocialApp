package entity;

public class Post {
    private int id;
    private String content;
    private int likeCount;

    public Post() {
    }

    public Post(int id, String content) {
        this.id = id;
        this.content = content;
        this.likeCount = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", likeCount=" + likeCount +
                '}';
    }
}
