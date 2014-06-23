INSERT INTO db_comics.genre (libellegenre) SELECT DISTINCT style FROM bdgest2010.dbgestseries WHERE NOT style IS NULL AND NOT style like '<%>' and idSerie IN (625,7825,9566,329,2571,6626, 7234,1812,5295,5018,8940) order by  Style;

INSERT INTO db_comics.serie (idSerie, TitreSerie, Termine, idGenre) SELECT idSerie, titre, case Encours when 1 then 0 else 1 end, idGenre FROM bdgest2010.dbgestseries, db_comics.genre WHERE libelleGenre = style 
and idSerie IN (625,7825,9566,329,2571,6626, 7234,1812,5295,5018,8940);

INSERT INTO db_comics.editeur (NomEditeur) 
SELECT DISTINCT editeur FROM bdgest2010.dbgestalbums WHERE NOT editeur IS NULL AND NOT editeur like '<%>' and idSerie IN (625,7825,9566,329,2571,6626, 7234,1812,5295,5018,8940) order by editeur;

INSERT INTO db_comics.album(idAlbum,TitreAlbum,Numero,DateSortie,Couverture, idSiteRef, Possede, HorsSerie, PremiereEdition, ISBN, IdSerie, idEditeur)
SELECT min(IdAlbum), Titre, Num, min(DL), max(couverture), min(idAlbum), 0, horsSerie, 0, min(Reference), s.idSerie, e.idEditeur
from (bdgest2010.dbgestalbums a inner join db_comics.serie s on a.idSerie = s.idSerie) left join db_comics.editeur e ON a.editeur = e.NomEditeur
where integrale = 0 and not num is null and HorsSerie = 0
group by Titre, s.idSerie, Num, HorsSerie order by s.idSerie, Num, HorsSerie 


UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='1354';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='1356';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='1358';
DELETE FROM `db_comics`.`album` WHERE `idAlbum`='1360';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='1361';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='1363';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='1366';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='1368';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='1370';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='2335';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='2342';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='2353';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='2368';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='2364';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='2372';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='2383';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='2387';
DELETE FROM `db_comics`.`album` WHERE `idAlbum`='2392';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='2391';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='2393';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='2395';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='2398';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='2318';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='2322';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='2326';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='7608';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='10567';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='10579';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='10570';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='10571';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='10572';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='10573';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='10574';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='10576';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='10577';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='10578';
UPDATE `db_comics`.`album` SET `Possede`='1', `PremiereEdition`='1' WHERE `idAlbum`='19565';
DELETE FROM `db_comics`.`album` WHERE `idAlbum`='25714';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='25712';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='25717';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='25722';
DELETE FROM `db_comics`.`album` WHERE `idAlbum`='25724';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='25727';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='25731';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='27913';
DELETE FROM `db_comics`.`album` WHERE `idAlbum`='27916';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='27918';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='27922';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='27925';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='27928';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='30290';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='30293';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='30295';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='30297';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='30299';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='36357';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='36360';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='36363';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='36366';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='36369';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='36370';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='36373';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='36375';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='38895';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='38896';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='38912';
UPDATE `db_comics`.`album` SET `Possede`='1', `PremiereEdition`='1' WHERE `idAlbum`='38914';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='38916';
UPDATE `db_comics`.`album` SET `Possede`='1', `PremiereEdition`='1' WHERE `idAlbum`='38919';
UPDATE `db_comics`.`album` SET `Possede`='1', `PremiereEdition`='1' WHERE `idAlbum`='38922';
UPDATE `db_comics`.`album` SET `Possede`='1', `PremiereEdition`='1' WHERE `idAlbum`='38924';
UPDATE `db_comics`.`album` SET `Possede`='1', `PremiereEdition`='1' WHERE `idAlbum`='38926';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='38900';
DELETE FROM `db_comics`.`album` WHERE `idAlbum`='38901';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='38903';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='38904';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='38905';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='38906';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='38907';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='38908';
DELETE FROM `db_comics`.`album` WHERE `idAlbum`='38909';
UPDATE `db_comics`.`album` SET `Possede`='1' WHERE `idAlbum`='38910';

UPDATE db_comics.serie SET NombreAlbums = (Select count(*) from db_comics.album a where a.idSerie = db_comics.serie.idserie);


 SELECT DISTINCT editeur FROM bdgest2010.dbgestalbums WHERE NOT editeur IS NULL AND NOT editeur like '<%>' order by  editeur;