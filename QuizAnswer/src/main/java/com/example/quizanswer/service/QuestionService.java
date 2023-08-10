package com.example.quizanswer.service;

import com.example.quizanswer.model.Question;
import com.example.quizanswer.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> findById(Integer id){
        return questionRepository.findByQuizId(id);
    }
    public List<Question> findAll(){
        return questionRepository.findAll();
    }
}
