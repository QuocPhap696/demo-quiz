package com.example.quizanswer.controller.api;

import com.example.quizanswer.model.Answer;
import com.example.quizanswer.service.AnswerService;
import com.example.quizanswer.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/answer")
public class AnswerRestController {
    @Autowired
    private QuizService quizService;
    @Autowired
    private AnswerService answerService;
    @GetMapping
    public ResponseEntity<?> showIndex(){
        List<Answer> answerList = answerService.findAll();
        return ResponseEntity.ok(answerList);
    }
}
