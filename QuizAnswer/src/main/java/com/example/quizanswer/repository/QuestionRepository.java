package com.example.quizanswer.repository;

import com.example.quizanswer.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    List<Question> findByQuizId(Integer quizId);
}
