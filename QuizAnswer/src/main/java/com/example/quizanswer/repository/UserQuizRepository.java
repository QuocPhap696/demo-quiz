package com.example.quizanswer.repository;

import com.example.quizanswer.model.UserQuiz;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserQuizRepository extends JpaRepository<UserQuiz, Integer> {
}
