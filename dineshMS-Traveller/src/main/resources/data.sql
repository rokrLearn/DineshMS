DROP Table IF EXISTS traveller;

CREATE TABLE traveller (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(256) NOT NULL,
sex CHAR NOT NULL,
age INT NOT NULL
);

INSERT INTO traveller (name, sex, age) VALUES
('Dinesh Purty', 'M', 28),
('Sagar Agarwal', 'M', 29),
('Sahil Sharma', 'M', 28);