--insert
/********************user insert*********************************/
insert into userinfo(userid,password,name,email) values('guard1','1111','김경호1','guard1@korea.com');
insert into userinfo(userid,password,name,email) values('guard2','2222','김경호2','guard2@korea.com');
insert into userinfo(userid,password,name,email) values('guard3','3333','김경호3','guard3@korea.com');
insert into userinfo(userid,password,name,email) values('guard3','4444','김경호4','guard4@korea.com');
/********************product insert******************************/
insert into product values(1, '비글', 550000, 'bigle.png','귀여워요...', 0);
insert into product values(2, '달마시안', 500000, 'dalma.jpg','사랑스러워요', 0);
insert into product values(3, '퍼그', 400000, 'pug.jpg','예뻐요', 0);
insert into product values(4, '페키니즈', 450000, 'pekiniz.png','든든해요.', 0);
insert into product values(5, '포메라니안', 800000, 'pomeranian.jpg','키우기쉬워요.', 0);
insert into product values(6, '샤페이', 700000, 'shaipei.jpg','애교가많아요.', 0);
insert into product values(7, '닥스훈트', 800000, 'dachshund.jpg','멋있어요.', 0);
insert into product values(8, '사모예드', 800000, 'samoyed.jpg','용감해요.', 0);
/***********************cart insert*******************************/
--guard1님카트담기(insert)
insert into cart(cart_no,cart_qty,p_no,userid) values(cart_cart_no_seq.nextval,1,3,'guard1');
insert into cart(cart_no,cart_qty,p_no,userid) values(cart_cart_no_seq.nextval,2,7,'guard1');
insert into cart(cart_no,cart_qty,p_no,userid) values(cart_cart_no_seq.nextval,3,8,'guard1');
--guard2님카트담기(insert)
insert into cart(cart_no,cart_qty,p_no,userid) values(cart_cart_no_seq.nextval,1,1,'guard2');
insert into cart(cart_no,cart_qty,p_no,userid) values(cart_cart_no_seq.nextval,2,2,'guard2');
commit;








