package com.example.quizanswer.controller.api;
import com.example.quizanswer.model.Quiz;
import com.example.quizanswer.service.AnswerService;
import com.example.quizanswer.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizRestController {
    @Autowired
    private QuizService quizService;
    @Autowired
    private AnswerService answerService;

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll() {
        List<Quiz> quizList = quizService.findAll();
        return ResponseEntity.ok(quizList);
    }

    @GetMapping("/{id}")
    public Quiz getQuizById(@PathVariable Integer id){
        return quizService.findById(id);
    }

}
