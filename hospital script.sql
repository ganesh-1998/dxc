CREATE TABLE Patient
(
  patient_id number primary key,
  patient_name varchar2(20)
  );
  
  
  CREATE TABLE Doctor
  (
   doctor_id number primary key,
   doctor_name varchar2(20)
   );
   
   
   INSERT INTO patient values (11,'Apple');
   INSERT INTO patient values (12,'Ball');
   INSERT INTO patient values (13,'Cat');
   
   INSERT INTO doctor values (100, 'Dr. Gulati');
   INSERT INTO doctor values (101, 'Dr. Sharma');
   INSERT INTO doctor values (102, 'Dr. Kalpana');