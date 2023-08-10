package com.example.quizanswer.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserQuiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer score;
    private LocalDate localDate;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
    @ManyToOne
    @JoinColumn(name = "quizId")
    private Quiz quiz;


}
