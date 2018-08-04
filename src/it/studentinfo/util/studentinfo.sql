
--DROP TABLE student;
--DROP TABLE classes;


create database studentinfo;
use studentinfo;
CREATE TABLE classes(
    stid      INT            IDENTITY(1,1)      PRIMARY KEY,
    stclass   VARCHAR(10)    NOT NULL,
    stdep     VARCHAR(30)    NOT NULL,  
);

CREATE TABLE student(
    stuid           INT                 IDENTITY(20161201,1)    PRIMARY KEY,
    stunumber       NVARCHAR(10)        NOT NULL,
    stuname         NVARCHAR(10)        NOT NULL,
    stusex          NVARCHAR(5)         NOT NULL,
    stuage          INT                 NOT NULL,
    stuintime       INT                 NOT NULL,
    stid            INT		            FOREIGN KEY REFERENCES classes(stid)
);


INSERT INTO classes VALUES ('114051A','Computer Science');
INSERT INTO classes VALUES ('114051B','Computer Science');
INSERT INTO classes VALUES ('114052A','Computer Software');
INSERT INTO classes VALUES ('114052B','Computer Software');
INSERT INTO classes VALUES ('114053A','Computer Network');
INSERT INTO classes VALUES ('114053B','Computer Network');

INSERT INTO student VALUES ('1401','AAAa','MAN','20','2014','1');
INSERT INTO student VALUES ('1402','BBBa','WOMAN','19','2014','2');
INSERT INTO student VALUES ('1403','CCCa','MAN','20','2014','3');
INSERT INTO student VALUES ('1404','DDDa','WOMAN','19','2014','4');
INSERT INTO student VALUES ('1405','EEEa','MAN','21','2014','5');
INSERT INTO student VALUES ('1406','FFFa','WOMAN','19','2014','6');

select * from classes;
select * from student;