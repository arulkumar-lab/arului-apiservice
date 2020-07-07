DROP TABLE IF EXISTS items;

DROP TABLE IF EXISTS person;


CREATE TABLE items (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  code VARCHAR(250) NOT NULL,
  type_code VARCHAR(250) NOT NULL,
  description VARCHAR(250) DEFAULT NULL
);


CREATE TABLE person(
    id INT AUTO_INCREMENT PRIMARY KEY ,
    FIRST_NAME VARCHAR(250) DEFAULT NULL,
    LAST_NAME VARCHAR(250) DEFAULT NULL
)