DROP TABLE board CASCADE CONSTRAINTS;
DROP TABLE member CASCADE CONSTRAINTS;

CREATE TABLE member(
		m_id                          		VARCHAR2(10)		 NULL ,
		m_password                    		VARCHAR2(10)		 NULL ,
		m_name                        		VARCHAR2(50)		 NULL ,
		m_address                     		VARCHAR2(100)		 NULL ,
		m_age                         		NUMBER(3)		 DEFAULT 0		 NULL ,
		m_married                     		CHAR(1)		 DEFAULT 'F'		 NOT NULL,
		m_regdate                     		DATE		 DEFAULT sysdate		 NULL 
);


CREATE TABLE board(
		board_no                      		NUMBER(10)		 NULL ,
		board_title                   		VARCHAR2(100)		 NOT NULL,
		board_content                 		VARCHAR2(512)		 NULL ,
		board_wday                    		DATE		 DEFAULT sysdate		 NULL ,
		board_read_count              		NUMBER(10)		 DEFAULT 0		 NULL ,
		m_id                          		VARCHAR2(10)		 NULL 
);



ALTER TABLE member ADD CONSTRAINT IDX_member_PK PRIMARY KEY (m_id);

ALTER TABLE board ADD CONSTRAINT IDX_board_PK PRIMARY KEY (board_no);
ALTER TABLE board ADD CONSTRAINT IDX_board_FK0 FOREIGN KEY (m_id) REFERENCES member (m_id);

