package com.example.quizanswer.service;

import com.example.quizanswer.model.Quiz;
import com.example.quizanswer.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;
    public List<Quiz> findAll(){
       return quizRepository.findAll();
    }
    public Quiz findById(Integer id){
        return quizRepository.findById(id).get();
    }

}

