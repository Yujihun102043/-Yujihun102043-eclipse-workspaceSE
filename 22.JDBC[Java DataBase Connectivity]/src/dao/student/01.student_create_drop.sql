drop table student_no_seq;
create sequence student_no_seq start with 1 nocycle nocache;

drop table student;
create table student (
		no number(4) primary key,
		name varchar2(20),
		kor number(3),
		eng number(3),
		math number(3),
		tot number(3) default 0,
		avg number(5,2) default 0.0,
		grade char(1) default 'F',
        rank number(3) default 1
);

commit;





