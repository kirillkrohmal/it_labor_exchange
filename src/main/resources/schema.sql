drop table if exists recomendations;

CREATE TABLE recommendations (
   id SERIAL PRIMARY KEY,
   title VARCHAR (45),
   salary INTEGER,
   description VARCHAR (255)
);

CREATE TABLE users
(
  id serial NOT NULL,
  username character varying(45) unique NOT NULL,
  is_enabled boolean,
  password character varying(255) NOT NULL,
  resume bytea,
  CONSTRAINT users_pkey PRIMARY KEY (id)
);


