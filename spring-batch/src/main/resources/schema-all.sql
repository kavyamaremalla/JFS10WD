DROP TABLE IF EXISTS people;

CREATE TABLE people(
    person_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20)
)