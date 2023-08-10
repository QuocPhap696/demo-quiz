package com.example.quizanswer.service;

import com.example.quizanswer.model.Answer;
import com.example.quizanswer.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    public List<Answer> findAll(){
        return answerRepository.findAll();
    }
    public List<Answer> findById(Integer id){
        return  answerRepository.findByQuestionId(id);
    }
}
