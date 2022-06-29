DROP TABLE product CASCADE CONSTRAINTS;
DROP TABLE userinfo CASCADE CONSTRAINTS;

CREATE TABLE userinfo(
		userid                        		VARCHAR2(50)		 NULL ,
		password                      		VARCHAR2(50)		 NULL ,
		name                          		VARCHAR2(50)		 NULL ,
		email                         		VARCHAR2(50)		 NULL 
);


CREATE TABLE product(
		p_no                          		NUMBER(10)		 NULL ,
		p_name                        		VARCHAR2(50)		 NULL ,
		p_price                       		NUMBER(10)		 NULL ,
		p_image                       		VARCHAR2(50)		 NULL ,
		p_desc                        		VARCHAR2(512)		 NULL ,
		p_click_count                 		NUMBER(10)		 DEFAULT 0		 NULL 
);



ALTER TABLE userinfo ADD CONSTRAINT IDX_userinfo_PK PRIMARY KEY (userid);

ALTER TABLE product ADD CONSTRAINT IDX_product_PK PRIMARY KEY (p_no);

