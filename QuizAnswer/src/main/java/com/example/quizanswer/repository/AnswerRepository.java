package com.example.quizanswer.repository;

import com.example.quizanswer.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    List<Answer> findByQuestionId(Integer questionId);
}
