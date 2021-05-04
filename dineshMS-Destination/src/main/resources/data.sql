DROP Table IF EXISTS destination;

CREATE TABLE destination (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(256) NOT NULL
);

INSERT INTO destination (name) VALUES
('Dubai'),
('Thailand');