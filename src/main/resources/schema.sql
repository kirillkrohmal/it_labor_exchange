drop table if exists recomendations;

CREATE TABLE recommendations (
   id SERIAL PRIMARY KEY,
   title VARCHAR (45),
   salary INTEGER,
   description VARCHAR (255)
);
