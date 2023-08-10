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
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String content;
    private String type;
    @ManyToOne
    @JoinColumn(name = "quizId")
    @JsonIgnore
    private Quiz quiz;
    @OneToMany(mappedBy = "question")
    private List<Answer> answerList;

}
