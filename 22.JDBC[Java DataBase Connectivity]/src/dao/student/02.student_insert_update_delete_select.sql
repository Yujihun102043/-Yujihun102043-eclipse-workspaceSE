
insert into student(no,name,kor,eng,math,tot,avg,grade,rank) values(student_no_seq.nextval,'KIM',34,67,89,0,0.0,'F',1);
insert into student(no,name,kor,eng,math,tot,avg,grade,rank) values(student_no_seq.nextval,'JIM',56,67,89,0,0.0,'F',1);
insert into student(no,name,kor,eng,math,tot,avg,grade,rank) values(student_no_seq.nextval,'FIM',77,67,89,0,0.0,'F',1);
insert into student(no,name,kor,eng,math,tot,avg,grade,rank) values(student_no_seq.nextval,'DIM',89,67,89,0,0.0,'F',1);
insert into student(no,name,kor,eng,math,tot,avg,grade,rank) values(student_no_seq.nextval,'SIM',12,67,89,0,0.0,'F',1);
insert into student(no,name,kor,eng,math,tot,avg,grade,rank) values(student_no_seq.nextval,'AIM',90,67,89,0,0.0,'F',1);
insert into student(no,name,kor,eng,math,tot,avg,grade,rank) values(student_no_seq.nextval,'XIM',96,67,89,0,0.0,'F',1);
insert into student(no,name,kor,eng,math,tot,avg,grade,rank) values(student_no_seq.nextval,'NIM',68,67,89,0,0.0,'F',1);
insert into student(no,name,kor,eng,math,tot,avg,grade,rank) values(student_no_seq.nextval,'KIM',79,67,89,0,0.0,'F',1);
insert into student(no,name,kor,eng,math,tot,avg,grade,rank) values(student_no_seq.nextval,'PIM',34,67,89,0,0.0,'F',1);

update student set name='CHANGE',kor=90,eng=90,math=90,tot=0,avg=0.0,grade='F',rank=1 where no = 1;
delete from student where no=1;
select * from student where no=7;
select * from student;



