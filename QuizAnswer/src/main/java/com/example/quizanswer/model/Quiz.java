package com.example.quizanswer.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String content;
    @OneToMany(mappedBy = "quiz")
    private List<Question> questions;
    @OneToMany(mappedBy = "quiz")
    @JsonIgnore
    private List<UserQuiz> userQuizList;
}
