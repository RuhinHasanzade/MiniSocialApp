package util;

import entity.User;

import  entity.Post;

import exception.PostNotFoundException;

public class SocialUtil {
    private static User[] users = new User[10];
    private static int indexUser = 0;

    public static void addUser(User u) {
        if (indexUser >= users.length) {
            System.out.println("Massiv dolub yeni user ucun yer yoxdur!!!");
        }

        users[indexUser++] = u;
        System.out.println("User ugurlar elave olundu: " + u.getUsername());
    }

    public static void addPost(User u , Post p) {
        if (u.getPostIndex() >= u.getPosts().length) {
            System.out.println("Massivde yer yoxdur");
        }

        u.getPosts()[u.getPostIndex()]  = p;
        u.setPostIndex(u.getPostIndex()+1);

        System.out.println("Post elave olundu: " + p.getContent());
    }

    public static void likePost(User u , int postId) throws PostNotFoundException {
      Post[] posts =  u.getPosts();

      for (Post p : posts) {
          if ( p!= null && p.getId() == postId) {
               p.setLikeCount(p.getLikeCount() +1);
              System.out.println("Post beyenildi!!");
              return;
          }
      }

      throw new PostNotFoundException("Id uygun Post tapilmadi");
    }
}
