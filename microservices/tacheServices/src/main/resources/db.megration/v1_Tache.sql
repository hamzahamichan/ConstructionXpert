CREATE TABLE tache (
                       id_tache SERIAL PRIMARY KEY,
                       description VARCHAR(100),
                       dateDebut DATE,
                       dateFin DATE,
                       statut VARCHAR(20),
                       projetId INT
);