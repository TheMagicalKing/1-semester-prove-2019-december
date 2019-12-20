create table quizquestions
(
    id       int auto_increment
        primary key,
    Question varchar(100) null,
    Answer1  varchar(255) null,
    Answer2  varchar(255) null,
    Answer3  varchar(255) null,
    Answer4  varchar(255) null
);

INSERT INTO quizschema.quizquestions (id, Question, Answer1, Answer2, Answer3, Answer4) VALUES (1, 'Hvordan fungere programmerings prøven?', 'Tyve elever der sidder bag skærmen på deres computere', 'Tyve elever der har computer problemer', 'Tyve elever der hopper ude foran skolen', 'der er ingen der kommer');
INSERT INTO quizschema.quizquestions (id, Question, Answer1, Answer2, Answer3, Answer4) VALUES (2, 'Hvor mange fingrer er der på føderne?', '10', '20', '30', 'Der er da tæer på fødrerne');