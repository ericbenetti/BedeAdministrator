INSERT INTO Metier (idMetier, LibelleMetier) VALUES (1,"Scenario"),(2, "Desssin"), (3, "Couleur");
INSERT INTO Genre (idGenre, LibelleGenre) VALUES (1, "Policier"), (2, "Espionnage"), (3, "Aenture"), (4, "Héroic-Fantasy"), (5,"Science-Fiction"), (6, "Historique"), (7, "Guerre"), (8, "Erotique"), (9, "Humoristique"), (10, "Bibliographique"), (11, "Chronique sociale");
INSERT INTO Editeur (idEditeur, NomEditeur) VALUES (1, "Dargaud");
INSERT INTO Serie (idSerie, TitreSerie, Termine, NombreAlbums, idGenre) VALUES 
(1, "Astérix le gaulois)", 0, 35, 9),
(2, "Magasin Général", 0, 8, 11),
(3, "Alpha", 0, 13, 2),
(4, "I.R.$.", 0, 14, 1),
(5, "Le Scorpion", 10, 0, 3);

DELETE FROM Album;
INSERT INTO Album (idAlbum, TitreAlbum, Numero, Cycle, DateSortie, Couverture, idSiteRef, Possede, HorsSerie, PremiereEdition, Isbn, idSerie, idEditeur, idGenre) VALUES 
(1, "La marque du diable", "1", NULL, "2000-10-01", "Couvertures/Scorpion/scorpion01.jpg", "2052", 1, 0, 0, "2-87129-301-5", 5, 1, NULL),
(2, "Le secret du Pape", "2", NULL, "2001-10-01", "Couvertures/Scorpion/scorpion02.jpg", "6461", 1, 0, 0, "2-87129-352-X", 5, 1, NULL),
(3, "La croix de Pierre", "3", NULL, "2002-11-01", "Couvertures/Scorpion/scorpion03.jpg", "20698", 1, 0, 0, "2-87129-463-1", 5, 1, NULL);



