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
  username character varying(45),
  is_enabled boolean,
  resume bytea,
  CONSTRAINT users_pkey PRIMARY KEY (id)
);


