const API_QUIZ = 'http://localhost:8090/api/quiz/findAll'
let array = ["a", "b", "c", "d"] ;
let questions;
function renderQuiz(){
    $.ajax({
        url: API_QUIZ,
        method: "GET",
        headers:{
            'Accept':'application/json',
            'Content-Type': 'application/json'},
    }).done(data => {
        console.log("data",data)
        let str = '';

        let str2 = '';
        data.forEach(quiz => {
            let randomQuestion = shuffleArray(quiz.questions);
            questions = randomQuestion;
            let selectQuestion = randomQuestion.slice(0,3);
            let ques = '';
            let questionCount = 0;
            selectQuestion.forEach((question, indexQues) => {
                let randomAnswer = shuffleArray(question.answerList);
                let selectAnswer = randomAnswer.slice(0,4);
                let ans = '';
                selectAnswer.forEach((answer, indexAnw) => {
                    if (question.type === "radio") {
                        ans += ` <div class="form-check">
              <input class="form-check-input" type="radio" value=${answer.content} name="ques-${question.id}" id="answer-${answer.id}">
              <label class="form-check-label" for="answer-${answer.id}">
                  ${array[indexAnw]}. ${answer.content}
              </label>
          </div>`
                    } else if (question.type === "checkbox") {
                        ans += ` <div class="form-check">
              <input class="form-check-input" value=${answer.content} type="checkbox" name="ques-${question.id}" id="answer-${answer.id}">
              <label class="form-check-label" for="answer-${answer.id}">
                  ${array[indexAnw]}. ${answer.content}
              </label>
          </div>`
                    }
          //           else {
          //               ans += ` <div class="form-check">
          //     <input value=${answer.content} class="form-check-input" type="radio" name="ques-${question.id}" id="answer-${answer.id}">
          //     <label class="form-check-label" for="answer-${answer.id}">
          //         ${answer.content}
          //     </label>
          // </div>`
          //           }
                })
                if (question.type === "radio" || question.type === "true/false") {
                    ques += ` <h3 class="alert alert-secondary">${++indexQues}. ${question.content}</h3>
                        <span class="h5">Select one:</span>
            ${ans}
          `
                } else {
                    ques += ` <h3 class="alert alert-secondary">${++indexQues}. ${question.content}</h3>
                        <span class="h5">Select one or more:</span>
            ${ans}
          `
                }
                str2 += `<button type="button" class="btn btn-outline-dark" style="margin-right: 5%">${indexQues}</button>`
            })
            str += ` <h1 class="text-center">${quiz.content}</h1>
  <div id="">
      <div id="question">
         ${ques}
      </div>
  </div>`
            document.getElementById("quiz").innerHTML = str;
            // document.getElementById("select-question").innerHTML = str2;
        })
    })
}
renderQuiz();

function shuffleArray(array) {
    for (let i = array.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        [array[i], array[j]] = [array[j], array[i]];
    }
    return array;
}

function submit(){
    console.log(questions)
    for (i = 0; i<questions.length; i++){
        let name = "ques-" + questions[i].id;
            const checkedQuestionInputs = document.querySelectorAll(`input[name="${name}"]:checked`);
        checkedQuestionInputs.forEach(input => {
            if (input.type === "radio") {
                console.log(input.value);

            }else {

            }
        });
    }
}


