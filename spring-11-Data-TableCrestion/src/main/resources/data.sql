INSERT INTO EMPLOYEES(id, name)
values(1, 'Mike');

-- postgres is gonna insert the data in student table that is coming from entity package:
INSERT INTO students(student_first_name,student_last_name,email)
VALUES('Mike','Smith','mike@cydeo.com');

INSERT INTO students(student_first_name,student_last_name,email)
VALUES('Tom','Hanks','tom@cydeo.com');
