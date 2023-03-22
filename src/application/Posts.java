package application;

import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Posts {
    public static void main(String[] args) {

        // Creating Post 1
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        Post post1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", dtf),
                "Traveling to new Zealand",
                "I'm going to visit this wonderful country!",
                12);
        // Comments for Post 1
        post1.addComment(new Comment("Have a nice trip"));
        post1.addComment(new Comment("Wow that's awesome!"));

        // Creating Post 2
        Post post2 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", dtf),
                "Good night guys",
                "See you tomorrow",
                5);
        // Comments for Post 2
        post2.addComment(new Comment("Good night"));
        post2.addComment(new Comment("May the Force be with you"));

        // Visual output
        System.out.println(post1);
        System.out.println(post2);

    }
}
