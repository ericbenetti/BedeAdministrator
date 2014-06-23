CREATE OR REPLACE VIEW AlbumsSerie (idAlbum, titre, numero, cycle, depotLegal, couverture, idSiteRef, possede
	, horsSerie, premiereEdition, formatAlbum, isbn, idSerie, serie, idEditeur, idGenre, editeur, genre) 
AS
	SELECT idAlbum, titreAlbum, numero, cycle, depotLegal, couverture, idSiteRef, possede, horsSerie, premiereEdition, formatAlbum
		, Isbn, s.idSerie, titreSerie, e.idEditeur, g.idGenre, NomEditeur, LibelleGenre
	FROM ((Album a LEFT JOIN Editeur e ON a.idEditeur = e.idEditeur) LEFT JOIN Genre g ON a.idGenre = g.idgenre ) LEFT JOIN Serie s ON a.idSerie = s.idSerie;



CREATE OR REPLACE VIEW vue_serie (idSerie, TitreSerie, Termine, NombreAlbums, idGenre, LibelleGenre)
AS
	SELECT idSerie, TitreSerie, Termine, NombreAlbums, Genre.idGenre, LibelleGenre
	FROM Serie LEFT JOIN Genre ON Serie.idGenre = Genre.idgenre ;

CREATE OR REPLACE VIEW AuteursAlbum (idAuteur, idPersonne, nom, prenom, nomUsuel, idMetier, libelleMetier, idAlbum)
AS
	SELECT idAlbumPersonne, p.idPersonne, p.Nom, p.Prenom, p.NomUsuel, m.idMetier, m.libelleMetier, ap.idAlbum
	FROM (AlbumPersonne ap INNER JOIN Personne p ON ap.idPersonne = p.idPersonne) INNER JOIN Metier m ON ap.IdMetier = m.IdMetier;

CREATE OR REPLACE VIEW viewAlbums (idAlbum, titre, possede, eo, dl, isbn, editeur) 
AS
SELECT idAlbum, CONCAT("<html>", CASE WHEN NOT s.idSerie IS NULL THEN CONCAT("<B>", titreSerie, "</B>", CASE WHEN horsSerie =1 THEN " - HS" WHEN NOT numero IS NULL THEN CONCAT(" - " , numero) ELSE "" END, CASE WHEN NOT cycle IS NULL THEN CONCAT(" - " , cycle) ELSE "" END,  " - ", titreAlbum) else CONCAT("<B>", titreAlbum, "</B>") end, "</html>"), possede, premiereEdition, depotLegal, Isbn, nomEditeur
	FROM (Album a LEFT JOIN Editeur e ON a.idEditeur = e.idEditeur) LEFT JOIN Serie s ON a.idSerie = s.idSerie;
