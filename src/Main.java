import entity.User;
import entity.Post;
import util.SocialUtil;
import exception.PostNotFoundException;

import java.io.PipedOutputStream;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.PosixFileAttributes;

public class Main {
    public static void main(String[] args) {
        User u1  = new User(1,"Ruhin",10);

        Post p1 = new Post(1,"Salam menem Ruhin");

        SocialUtil.addUser(u1);

        SocialUtil.addPost(u1,p1);

        try {
            SocialUtil.likePost(u1 , 3);
        }catch (PostNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}