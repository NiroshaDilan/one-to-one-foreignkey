INSERT INTO course(id, name, created_date, last_update_date)
VALUES(1001, 'JPA In 50 minutes', sysdate(), sysdate());
INSERT INTO course(id, name, created_date, last_update_date)
VALUES(1002, 'Spring security', sysdate(), sysdate());
INSERT INTO course(id, name, created_date, last_update_date)
VALUES(1003, 'ElasticSearch', sysdate(), sysdate());

INSERT INTO student(id, name, created_date, last_update_date) VALUES(2001, 'Dilan', sysdate(), sysdate());
INSERT INTO student(id, name, created_date, last_update_date) VALUES(2002, 'Nirosha', sysdate(), sysdate());
INSERT INTO student(id, name, created_date, last_update_date) VALUES(2003, 'Fernando', sysdate(), sysdate());
INSERT INTO student(id, name, created_date, last_update_date) VALUES(2004, 'Gayan', sysdate(), sysdate());

INSERT INTO passport(id, number, created_date, last_update_date)
VALUES(3001, 'E123456', sysdate(), sysdate());
INSERT INTO passport(id, number, created_date, last_update_date)
VALUES(3002, 'E256321', sysdate(), sysdate());
INSERT INTO passport(id, number, created_date, last_update_date)
VALUES(3003, 'EL125421', sysdate(), sysdate());
INSERT INTO passport(id, number, created_date, last_update_date)
VALUES(3004, 'EFL12545', sysdate(), sysdate());

INSERT INTO review(id, rating, description, created_date, last_update_date)
VALUES(4001, '5', 'Great course', sysdate(), sysdate());
INSERT INTO review(id, rating, description, created_date, last_update_date)
VALUES(4002, '5', 'Great course', sysdate(), sysdate());
INSERT INTO review(id, rating, description, created_date, last_update_date)
VALUES(4003, '1', 'Not good', sysdate(), sysdate());
INSERT INTO review(id, rating, description, created_date, last_update_date)
VALUES(4004, '3', 'Week course', sysdate(), sysdate());