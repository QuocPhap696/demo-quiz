package com.example.quizanswer.controller.api;

import com.example.quizanswer.model.Question;
import com.example.quizanswer.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/question")
public class QuestionRestController {
    @Autowired
    private QuestionService questionService;
    @GetMapping
    public ResponseEntity<?>findAll(){
        List<Question> questionList = questionService.findAll();
        return ResponseEntity.ok(questionList);
    }
}
