INSERT INTO Genre (libelleGenre) 
SELECT DISTINCT style FROM MesSeries WHERE NOT style IS NULL order by  Style;

INSERT INTO Serie (titreSerie, termine, idGenre, nombreAlbums) 
SELECT titre, case parution when "Finie" then 1 else 0 end, idGenre, tomes FROM MesSeries, Genre WHERE libelleGenre = style and parution <> "One shot";

INSERT INTO Editeur (nomEditeur) 
SELECT DISTINCT editeur FROM MesAlbums WHERE NOT editeur IS NULL order by editeur;

INSERT INTO Album(titreAlbum, numero, cycle, depotLegal, possede, horsSerie, premiereEdition, formatAlbum, isbn, idSerie, idEditeur)
SELECT a.titre, a.tome, a.cycle, CONCAT(RIGHT(a.dl,4) , "-" , LEFT(a.dl, 2) , "-01"), 1, Case when a.tome is Null and not s.idSerie is null then 1 else 0 end, 0, case when a.format = "Grand format" then 2 else 1 end, a.isbn, s.idSerie, e.idEditeur
FROM (MesAlbums a inner join Serie s on a.serie = s.titreSerie) left join Editeur e on e.nomEditeur = a.editeur;


UPDATE Album, Serie SET couverture = concat( case Serie.idSerie 
when 3 then "asterix"
when 5 then "cheminsdemalefosse"
when 6 then "cycledecyann" 
when 7 then "derniertemplier"
when 9 then "irs"
when 10 then "irs-allwatcher"
when 12 then "jacquesgallard"
when 13 then "ladys"
when 14 then "longvoyagedeléna"
when 16 then "passagersduvent"
when 17 then "quetedeloiseaudutemps"
when 20 then "scorpion"
when 23 then "venush" 
when 26 then "decalogue" 
when 27 then "legataire" 
else lower(replace(titreSerie, " ", "")) end, "_", case when horsSerie=1 then "hs" else numero end, ".jpg") 
where Album.idSerie = Serie.IdSerie ;


13	Lady S.
14	Long voyage de Léna (Le)
15	Magasin général
16	Passagers du vent (Les)




INSERT INTO Personne (nomUsuel, nom, prenom) 
Select distinct scenario, CASE WHEN instr(scenario,',') > 0 THEN SUBSTRING_INDEX(scenario, ',', 1) ELSE null END, CASE WHEN instr(scenario,',') > 0 THEN LTRIM(SUBSTRING_INDEX(scenario, ',', -1) ) ELSE Null END  
from MesAlbums where not scenario is null;

INSERT INTO Metier (idMetier, LibelleMetier) VALUES (1,"Scenario"),(2, "Dessin"), (3, "Couleur");


INSERT INTO AlbumPersonne (idAlbum, idPersonne, idMetier)
SELECT DISTINCT idAlbum, idPersonne, 1 FROM (Album a INNER JOIN MesAlbums ma ON a.titreAlbum = ma.titre and a.numero = ma.tome) INNER JOIN Personne p ON ma.scenario = p.nomUsuel
UNION SELECT DISTINCT idAlbum, idPersonne, 2 FROM (Album a INNER JOIN MesAlbums ma ON a.titreAlbum = ma.titre and a.numero = ma.tome) INNER JOIN Personne p ON ma.dessin = p.nomUsuel;



