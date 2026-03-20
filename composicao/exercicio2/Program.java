package exerciciosCursoUdemy.composicao.exercicio2;

import exerciciosCursoUdemy.composicao.exercicio2.entities.Comment;
import exerciciosCursoUdemy.composicao.exercicio2.entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Comment cm1p1 = new Comment("Have a nice trip!");
        Comment cm2p1 = new Comment("Wow that´s awesome!");

        Comment cm1p2 = new Comment("Good night");
        Comment cm2p2 = new Comment("May the Force be with you");

        Post post1 = new Post(
                LocalDateTime.parse("21/06/2018 13:05:44", df),
                "Traveling to new Zealand",
                "I´m going to visit this wonderful country!",
                12
        );
        Post post2 = new Post(
                LocalDateTime.parse("28/07/2018 23:14:19", df),
                "Good night guys",
                "See you tomorrow",
                5
        );

        post1.addComment(cm1p1);
        post1.addComment(cm2p1);

        post2.addComment(cm1p2);
        post2.addComment(cm2p2);

        System.out.println(post1);
        System.out.println(post2);
    }
}
