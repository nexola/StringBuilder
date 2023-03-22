package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {

    private static DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;

    private final List<Comment> comment = new ArrayList<>();

    // Constructors
    public Post() {}

    public Post(LocalDateTime moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    // Getters and Setters
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public String getTitle() {
        return title;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void addComment(Comment comment) {
        this.comment.add(comment);
    }

    public void removeComment(Comment comment) { this.comment.remove(comment); }

    // To string
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment)).append("\n");
        sb.append(content).append("\n");
        sb.append("Comments: \n");
        for (Comment c : comment) {
            sb.append(c.getText()).append("\n");
        }
        return sb.toString();
    }
}

