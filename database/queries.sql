select * from quizquestions;
select Question,Answer4 from quizquestions where id = 1;
update quizschema.quizquestions set question = 'Hvor mange tæer er der på hændrene?', answer4 = 'der er da fingre på hænderne!' where id = 2;
select * from quizquestions where Question like  '%tæer%';
insert into quizquestions(question, answer1, answer2, answer3, answer4) values('Hvor mange timer er der programmerings prøve?','15 timer','alt for lang tid','alt for kort tid', '8 timer')