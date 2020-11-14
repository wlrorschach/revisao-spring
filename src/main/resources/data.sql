DROP TABLE IF EXISTS CATEGORIA;
 
CREATE TABLE CATEGORIA (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  career VARCHAR(250) DEFAULT NULL
);

CREATE TABLE LIVOS (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  NOME VARCHAR(250) NOT NULL,
  CATEGORIA VARCHAR(250) NOT NULL,
  AUTOR VARCHAR(250) DEFAULT NULL
);

INSERT INTO CATEGORIA (first_name, last_name, career) VALUES
  ('Aliko', 'Dangote', 'Billionaire Industrialist'),
  ('Bill', 'Gates', 'Billionaire Tech Entrepreneur'),
  ('Folrunsho', 'Alakija', 'Billionaire Oil Magnate');