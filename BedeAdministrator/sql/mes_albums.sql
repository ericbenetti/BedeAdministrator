DROP TABLE IF EXISTS MesAlbums ;
CREATE TABLE MesAlbums (

	serie varchar(250) NULL,
	tome varchar(250) NULL,
	cycle varchar(250) NULL,
	titre varchar(250) NULL,
	scenario varchar(255) NULL,
	dessin varchar(255) NULL,
	dl varchar(250) NULL,
	editeur varchar(250) NULL,
	collection varchar(250) NULL,
	format varchar(250) NULL,
	isbn varchar(250) NULL
);

INSERT INTO MesAlbums VALUES
("Airborne 44","1",Null,"Là où tombent les hommes","Jarbinet, Philippe","Jarbinet, Philippe","09/2009","Casterman",Null,"Grand format","9782203013728"),
("Airborne 44","2",Null,"Demain sera sans nous","Jarbinet, Philippe","Jarbinet, Philippe","09/2009","Casterman",Null,"Grand format","9782203013889"),
("Airborne 44","3",Null,"Omaha Beach","Jarbinet, Philippe","Jarbinet, Philippe","09/2011","Casterman",Null,"Grand format","9782203037069"),
("Airborne 44","4",Null,"Destins croisés","Jarbinet, Philippe","Jarbinet, Philippe","04/2012","Casterman","Ligne d'Horizon","Grand format","9782203037076"),
("Airborne 44","5",Null,"S’il faut survivre","Jarbinet, Philippe","Jarbinet, Philippe","04/2014","Casterman","Ligne d'Horizon","Grand format","9782203074767"),
("Alpha","1",Null,"L'échange","Renard, Pascal","Jigounov, Youri","05/1996","Le Lombard",Null,"Format normal","2803612046"),
("Alpha","2",Null,"Clan Bogdanov","Renard, Pascal","Jigounov, Youri","05/1997","Le Lombard",Null,"Format normal","2803612488"),
("Alpha","3",Null,"Le salaire des loups","Mythic","Jigounov, Youri","04/1998","Le Lombard",Null,"Format normal","2803613395"),
("Alpha","4",Null,"La liste","Mythic","Jigounov, Youri","03/1999","Le Lombard","Troisième Vague","Format normal","2803613832"),
("Alpha","5",Null,"Sanctions","Mythic","Jigounov, Youri","10/2000","Le Lombard","Troisième Vague","Format normal","2803614863"),
("Alpha","6",Null,"L'émissaire","Mythic","Jigounov, Youri","04/2002","Le Lombard","Troisième Vague","Format normal","2803616394"),
("Alpha","7",Null,"Snow White, 30 secondes !","Mythic","Jigounov, Youri","10/2003","Le Lombard","Troisième Vague","Format normal","2803618354"),
("Alpha","8",Null,"Jeux de puissants","Mythic","Jigounov, Youri","11/2004","Le Lombard","Troisième Vague","Format normal","2803620367"),
("Alpha","9",Null,"Scala","Mythic","Jigounov, Youri","09/2006","Le Lombard","Troisième Vague","Format normal","2803620944"),
("Alpha","10",Null,"Mensonges","Mythic","Jigounov, Youri","05/2007","Le Lombard","Troisième Vague","Format normal","9782803622498"),
("Alpha","11",Null,"Fucking patriot","Jigounov, Youri","Jigounov, Youri","09/2009","Le Lombard","Troisième Vague","Format normal","9782803624560"),
("Alpha","12",Null,"Petit tour avec Malcolm","Jigounov, Youri","Lamquet, Chris","08/2013","Le Lombard","Troisième Vague","Format normal","9782803627493"),
("Astérix","6",Null,"Astérix et Cléopatre","Goscinny, René","Uderzo, Albert","07/1965",Null,Null,"Format normal",Null),
("Astérix","7",Null,"Le combat des chefs","Goscinny, René","Uderzo, Albert","01/1966",Null,Null,"Format normal",Null),
("Astérix","10",Null,"Astérix Légionnaire","Goscinny, René","Uderzo, Albert","07/1967",Null,Null,"Format normal",Null),
("Astérix","12",Null,"Astérix aux jeux Olympiques","Goscinny, René","Uderzo, Albert","07/1968",Null,Null,"Format normal",Null),
("Astérix","15",Null,"La zizanie","Goscinny, René","Uderzo, Albert","04/1970",Null,Null,"Format normal",Null),
("Astérix","19",Null,"Le devin","Goscinny, René","Uderzo, Albert","10/1972",Null,Null,"Format normal","2205006509"),
("Astérix","20",Null,"Astérix en Corse","Goscinny, René","Uderzo, Albert","04/1973",Null,Null,"Format normal",Null),
("Astérix","21",Null,"Le cadeau de César","Goscinny, René","Uderzo, Albert","07/1974",Null,Null,"Format normal",Null),
("Astérix","25",Null,"Le grand Fossé","Uderzo, Albert","Uderzo, Albert","04/1980",Null,Null,"Format normal","2864970007"),
("Astérix","28",Null,"Astérix chez Rahazade","Uderzo, Albert","Uderzo, Albert","10/1987","Hachette",Null,"Format normal","2864970201"),
("Astérix","29",Null,"La rose et le glaive","Uderzo, Albert","Uderzo, Albert","10/1991","Les Éditions Albert René",Null,"Format normal","2864970538"),
("Astérix","30",Null,"La galère d'Obélix","Uderzo, Albert","Uderzo, Albert","07/1996","Les Éditions Albert René",Null,"Format normal","2864970961"),
("Astérix","31",Null,"Astérix et Latraviata","Uderzo, Albert","Uderzo, Albert","03/2001","Les Éditions Albert René",Null,"Format normal","2864971437"),
("Astérix","32",Null,"Astérix et la rentrée gauloise","Goscinny, René","Uderzo, Albert","01/1993","Les Éditions Albert René",Null,"Format normal",Null),
("Astérix","33",Null,"Le ciel lui tombe sur la tête","Uderzo, Albert","Uderzo, Albert","10/2005","Les Éditions Albert René",Null,"Format normal","2864971704"),
(Null,Null,Null,"Chansons pour les yeux",Null,Null,"09/2004","Delcourt","Hors Collection","Grand format","2847895094"),
("Châteaux Bordeaux","1",Null,"Le Domaine","Corbeyran, Éric","Espé","03/2011","Glénat","Grafica","Grand format","9782723472814"),
("Châteaux Bordeaux","2",Null,"L'Œnologue","Corbeyran, Éric","Espé","03/2012","Glénat","Grafica","Grand format","9782723484541"),
("Châteaux Bordeaux","3",Null,"L'Amateur","Corbeyran, Éric","Espé","09/2013","Glénat","Grafica","Grand format","9782723492775"),
("Châteaux Bordeaux","4",Null,"Les millésimes","Corbeyran, Éric","Espé","09/2013","Glénat","Grafica","Grand format","82723492775"),
("Cycle de Cyann (Le)","1",Null,"La sOurce et la sOnde","Lacroix, Claude","Bourgeon, François","10/1993","Casterman",Null,"Format normal","2203388579"),
("Cycle de Cyann (Le)","2",Null,"Six saisons sur ilO","Lacroix, Claude","Bourgeon, François","10/1997","Casterman",Null,"Format normal","2203388943"),
("Cycle de Cyann (Le)","3",Null,"Aïeïa d'Aldaal","Lacroix, Claude","Bourgeon, François","01/2005","Vents d'Ouest",Null,"Format normal","2749302188"),
("Cycle de Cyann (Le)","4",Null,"Les couleurs de Marcade","Lacroix, Claude","Bourgeon, François","01/2007","Vents d'Ouest",Null,"Format normal","9782749302393"),
("Cycle de Cyann (Le)","5",Null,"Les Couloirs de l'Entretemps","Lacroix, Claude","Bourgeon, François","10/2012","12bis",Null,"Grand format","9782356483232"),
("Dernier templier (Le)","1",Null,"L'encodeur","Khoury, Raymond","Lalor, Miguel","03/2009","Dargaud",Null,"Grand format","9782205060607"),
("Dernier templier (Le)","2",Null,"Le chevalier de la crypte","Khoury, Raymond","Lalor, Miguel","02/2010","Dargaud",Null,"Grand format","9782205063059"),
("Dernier templier (Le)","3",Null,"L'Eglise engloutie","Khoury, Raymond","Lalor, Miguel","05/2011","Dargaud",Null,"Grand format","9782205065275"),
("Dernier templier (Le)","4",Null,"Le faucon du temple","Khoury, Raymond","Lalor, Miguel","01/2013","Dargaud",Null,"Grand format","9782205067729"),
("Dernier templier (Le)","5",Null,"L'œuvre du démon","Khoury, Raymond","Rocco, Bruno","03/2014","Dargaud",Null,"Grand format","9782205070088"),
("Empire USA","1",Null,"Tome 1","Desberg, Stephen","Griffo","09/2008","Dargaud",Null,"Format normal","9782505003960"),
("Empire USA","2",Null,"Tome 2","Desberg, Stephen","Mounier, Alain","09/2008","Dargaud",Null,"Format normal","9782505003977"),
("Empire USA","3",Null,"Tome 3","Desberg, Stephen","Juszezak, Erik","10/2008","Dargaud",Null,"Format normal","9782505003984"),
("Empire USA","4",Null,"Tome 4","Desberg, Stephen","Griffo","11/2008","Dargaud",Null,"Format normal","9782505003991"),
("Empire USA","5",Null,"Tome 5","Desberg, Stephen","Koller, Daniel","11/2008","Dargaud",Null,"Format normal","9782505004004"),
("Empire USA","6",Null,"Tome 6","Desberg, Stephen","Reculé, Henri","12/2008","Dargaud",Null,"Format normal","9782505004011"),
("Empire USA","7","Saison 2","Tome 1","Desberg, Stephen","Reculé, Henri","09/2011","Dargaud",Null,"Format normal","9782505011309"),
("Empire USA","8","Saison 2","Tome 2","Desberg, Stephen","Queireix, Alain","09/2011","Dargaud",Null,"Format normal","9782505011316"),
("Empire USA","9","Saison 2","Tome 3","Desberg, Stephen","Griffo","10/2011","Dargaud",Null,"Format normal","9782505011408"),
("Empire USA","10","Saison 2","Tome 4","Desberg, Stephen","Mounier, Alain","10/2011","Dargaud",Null,"Format normal","9782505011415"),
("Empire USA","11","Saison 2","Tome 5","Desberg, Stephen","Juszezak, Erik","11/2011","Dargaud",Null,"Format normal","9782505011507"),
("Empire USA","12","Saison 2","Tome 6","Desberg, Stephen","Koller, Daniel","11/2011","Dargaud",Null,"Format normal","9782505011521"),
("I.R.$.","1",Null,"La voie fiscale","Desberg, Stephen","Vrancken, Bernard","04/1999","Le Lombard","Troisième Vague","Format normal","2803613964"),
("I.R.$.","2",Null,"La stratégie Hagen","Desberg, Stephen","Vrancken, Bernard","04/2000","Le Lombard","Troisième Vague","Format normal","2803614111"),
("I.R.$.","3",Null,"Blue ice","Desberg, Stephen","Vrancken, Bernard","05/2001","Le Lombard","Troisième Vague","Format normal","2803616319"),
("I.R.$.","4",Null,"Narcocratie","Desberg, Stephen","Vrancken, Bernard","05/2002","Le Lombard","Troisième Vague","Format normal","2803617501"),
("I.R.$.","5",Null,"Silicia Inc.","Desberg, Stephen","Vrancken, Bernard","05/2003","Le Lombard","Troisième Vague","Format normal","2803618729"),
("I.R.$.","6",Null,"Le corrupteur","Desberg, Stephen","Vrancken, Bernard","04/2004","Le Lombard","Troisième Vague","Format normal","2803619857"),
("I.R.$.","7",Null,"Corporate America","Desberg, Stephen","Vrancken, Bernard","05/2005","Le Lombard","Troisième Vague","Format normal","2803620715"),
("I.R.$.","8",Null,"La guerre noire","Desberg, Stephen","Vrancken, Bernard","05/2006","Le Lombard","Troisième Vague","Format normal","2803621533"),
("I.R.$.","9",Null,"Liaisons romaines","Desberg, Stephen","Vrancken, Bernard","05/2007","Le Lombard","Troisième Vague","Format normal","9782803622627"),
("I.R.$.","10",Null,"La loge des assassins","Desberg, Stephen","Vrancken, Bernard","05/2008","Le Lombard","Troisième Vague","Format normal","9782803623976"),
("I.R.$.","11",Null,"Le chemin de Gloria","Desberg, Stephen","Vrancken, Bernard","06/2009","Le Lombard","Troisième Vague","Format normal","9782803625253"),
("I.R.$.","12",Null,"Au Nom du Président","Desberg, Stephen","Vrancken, Bernard","06/2010","Le Lombard","Troisième Vague","Format normal","9782803626342"),
("I.R.$.","13",Null,"L'or de Yamashita","Desberg, Stephen","Vrancken, Bernard","07/2011","Le Lombard","Troisième Vague","Format normal","9782803628193"),
("I.R.$.","14",Null,"Les survivants de Nankin","Desberg, Stephen","Vrancken, Bernard","06/2012","Le Lombard","Troisième Vague","Format normal","9782803630622"),
("I.R.$. - All Watcher","1",Null,"Antonia","Desberg, Stephen","Queireix, Alain","06/2009","Le Lombard","Troisième Vague","Format normal","9782803625352"),
("I.R.$. - All Watcher","2",Null,"La nébuleuse Roxana","Desberg, Stephen","Koller, Daniel","02/2010","Le Lombard","Troisième Vague","Format normal","9782803626649"),
("I.R.$. - All Watcher","3",Null,"Petra","Desberg, Stephen","Queireix, Alain","04/2010","Le Lombard","Troisième Vague","Format normal","9782803626243"),
("I.R.$. - All Watcher","4",Null,"La Spirale Mc Parnell","Desberg, Stephen","Mutti, Andrea","06/2010","Le Lombard","Troisième","Format normal","9782803626250"),
("I.R.$. - All Watcher","5",Null,"Mia Maï","Desberg, Stephen","Bourgne, Marc","11/2010","Le Lombard","Troisième Vague","Format normal","9782803627486"),
("I.R.$. - All Watcher","6",Null,"La théorie des cordes fiscales","Desberg, Stephen","Koller, Daniel","02/2011","Le Lombard","Troisième Vague","Format normal","9782803627943"),
("I.R.$. - All Watcher","7",Null,"Le trou noir financier","Desberg, Stephen","Bourgne, Marc","06/2011","Le Lombard","Troisième Vague","Format normal","9782803628223"),
("Ils étaient dix","1",Null,"Octobre 1812","Stalner, Éric","Stalner, Éric","02/2009","12bis",Null,"Grand format","9782356480385"),
("Ils étaient dix","2",Null,"Novgora","Stalner, Éric","Stalner, Éric","03/2010","12bis",Null,"Grand format","9782356481108"),
("Ils étaient dix","3",Null,"Paris 1820","Stalner, Éric","Stalner, Éric","03/2011","12bis",Null,"Grand format","9782356482112"),
("Ils étaient dix","4",Null,"Rue Saint-Honoré","Stalner, Éric","Stalner, Éric","09/2011","12bis",Null,"Grand format","9782356482563"),
("Ils étaient dix","5",Null,"Omertà","Stalner, Éric","Stalner, Éric","08/2012","12bis",Null,"Grand format","9782356483812"),
("Ils étaient dix","6",Null,"Le vieil empereur","Stalner, Éric","Stalner, Éric","05/2013","12bis",Null,"Grand format","9782356484666"),
("Jacques Gallard (Une aventure de)","1",Null,"Parfum d'Afrique","Tripp, Jean-Louis","Tripp, Jean-Louis","06/1983","Milan",Null,"Format normal","2867260132"),
("Lady S.","1",Null,"Na zdorovié, Shaniouchka !","Van Hamme, Jean","Aymond, Philippe","10/2004","Dupuis","Repérages","Format normal","2800136081"),
("Lady S.","2",Null,"À ta santé, Suzie !","Van Hamme, Jean","Aymond, Philippe","09/2005","Dupuis","Repérages","Format normal","280013660X"),
("Lady S.","3",Null,"59° Latitude Nord","Van Hamme, Jean","Aymond, Philippe","10/2006","Dupuis","Repérages","Format normal","280013836X"),
("Lady S.","4",Null,"Jeu de dupes","Van Hamme, Jean","Aymond, Philippe","10/2007","Dupuis","Repérages","Format normal","9782800139296"),
("Lady S.","5",Null,"Une taupe à Washington","Van Hamme, Jean","Aymond, Philippe","11/2008","Dupuis","Repérages","Format normal","9782800140698"),
("Lady S.","6",Null,"Salade portugaise","Van Hamme, Jean","Aymond, Philippe","10/2009","Dupuis","Repérages","Format normal","9782800144757"),
("Lady S.","7",Null,"Une seconde d'éternité","Van Hamme, Jean","Aymond, Philippe","04/2011","Dupuis","Grand","Format normal","9782800147437"),
("Lady S.","8",Null,"Raison d'état","Van Hamme, Jean","Aymond, Philippe","08/2012","Dupuis","Grand Public","Format normal","9782800154305"),
("Lady S.","9",Null,"Pour la peau d'une femme","Van Hamme, Jean","Aymond, Philippe","11/2013","Dupuis","Grand Public","Format normal","9782800157566"),
("Long voyage de Léna (Le)","1",Null,"Le long voyage de Léna","Christin, Pierre","Juillard, André","09/2006","Dargaud","Long Courrier","Grand format","220505743X"),
("Long voyage de Léna (Le)","2",Null,"Léna et les trois femmes","Christin, Pierre","Juillard, André","10/2009","Dargaud","Long Courrier","Grand format","9782205061932"),
("Magasin général","1",Null,"Marie","Loisel, Régis","Tripp, Jean-Louis","03/2006","Casterman",Null,"Grand format","2203370114"),
("Magasin général","2",Null,"Serge","Loisel, Régis","Tripp, Jean-Louis","10/2006","Casterman",Null,"Grand format","2203370130"),
("Magasin général","3",Null,"Les hommes","Loisel, Régis","Tripp, Jean-Louis","10/2007","Casterman",Null,"Grand format","9782203348103"),
("Magasin général","4",Null,"Confessions","Loisel, Régis","Tripp, Jean-Louis","10/2008","Casterman",Null,"Grand format","9782203016910"),
("Magasin général","5",Null,"Montréal","Loisel, Régis","Tripp, Jean-Louis","11/2009","Casterman",Null,"Grand format","9782203024632"),
("Magasin général","6",Null,"Ernest Latulippe","Loisel, Régis","Tripp, Jean-Louis","10/2010","Casterman",Null,"Grand format","978-2-203-02616-2"),
("Magasin général","7",Null,"Charleston","Loisel, Régis","Tripp, Jean-Louis","11/2011","Casterman",Null,"Grand format","978-2-203-03219-4"),
("Magasin général","8",Null,"Les femmes","Loisel, Régis","Tripp, Jean-Louis","11/2012","Casterman",Null,"Grand format","978-2-203-04922-2"),
("Passagers du vent (Les)","1",Null,"La fille sous la dunette","Bourgeon, François","Bourgeon, François","01/1980","Glénat",Null,"Format normal","2-7234-0132-4"),
("Passagers du vent (Les)","2",Null,"Le ponton","Bourgeon, François","Bourgeon, François","07/1980","Glénat",Null,"Format normal","2-7234-0164-2"),
("Passagers du vent (Les)","3",Null,"Le comptoir de Juda","Bourgeon, François","Bourgeon, François","04/1981","Glénat",Null,"Format normal","2-7234-0215-0"),
("Passagers du vent (Les)","4",Null,"L'heure du serpent","Bourgeon, François","Bourgeon, François","04/1982","Glénat",Null,"Format normal","2-7234-0290-8"),
("Passagers du vent (Les)","5",Null,"Le bois d'ébène","Bourgeon, François","Bourgeon, François","05/1984","Glénat",Null,"Format normal","2-7234-0440-4"),
("Passagers du vent (Les)","6",Null,"La Petite Fille Bois-Caïman - Livre 1","Bourgeon, François","Bourgeon, François","09/2009","12bis",Null,"Grand format","978-2-356-48066-8"),
("Passagers du vent (Les)","7",Null,"La Petite Fille Bois-Caïman - Livre 2","Bourgeon, François","Bourgeon, François","01/2010","12bis",Null,"Grand format","978-2-356-48112-2"),
("Quête de l'oiseau du temps (La)","1",Null,"La conque de Ramor","Le Tendre, Serge","Loisel, Régis","01/1983","Dargaud","Histoires fantastiques","Format normal","2-205-02406-X"),
("Quête de l'oiseau du temps (La)","2",Null,"Le temple de l'oubli","Le Tendre, Serge","Loisel, Régis","01/1984","Dargaud","Histoires fantastiques","Format normal","2-205-02576-7"),
("Quête de l'oiseau du temps (La)","3",Null,"Le Rige","Le Tendre, Serge","Loisel, Régis","11/1985","Dargaud","Histoires fantastiques","Grand format","2-205-02952-5"),
("Quête de l'oiseau du temps (La)","4",Null,"L'œuf des ténébres","Le Tendre, Serge","Loisel, Régis","08/1987","Dargaud","Histoires fantastiques","Grand format","2-205-03460-X"),
("Quête de l'oiseau du temps (La)","5",Null,"L'ami Javin","Le Tendre, Serge","Lidwine","10/1998","Dargaud",Null,"Grand format","2-205-04394-3"),
("Quête de l'oiseau du temps (La)","6",Null,"Le grimoire des dieux","Le Tendre, Serge","Aouamri, Mohamed","11/2007","Dargaud",Null,"Grand format","978-2-205-05633-4"),
("Quête de l'oiseau du temps (La)","7",Null,"La voie du Rige","Le Tendre, Serge","Mallié, Vincent","03/2010","Dargaud",Null,"Grand format","978-2-205-06009-6"),
("Quête de l'oiseau du temps (La)","8",Null,"Le chevalier Bragon","Le Tendre, Serge","Mallié, Vincent","12/2013","Dargaud",Null,"Grand format","978-2-205-06330-1"),
("Rafales","1",Null,"Les inhumains","Desberg, Stephen","Vallès, Francis","05/2005","Le Lombard","Troisième Vague","Format normal","2-8036-2070-7"),
("Rafales","2",Null,"L'évolution","Desberg, Stephen","Vallès, Francis","04/2006","Le Lombard","Troisième Vague","Format normal","2-8036-2159-2"),
("Rafales","3",Null,"India allen","Desberg, Stephen","Vallès, Francis","04/2007","Le Lombard","Troisième vague","Format normal","978-2-8036-2254-2"),
("Rafales","4",Null,"La solution Lucrèce","Desberg, Stephen","Vallès, Francis","07/2008","Le Lombard","Troisième vague","Format normal","978-2-8036-2407-2"),
("Rani","1",Null,"Bâtarde","Van Hamme, Jean","Vallès, Francis","11/2009","Le Lombard",Null,"Grand format","978-2-8036-2598-7"),
("Rani","2",Null,"Brigande","Van Hamme, Jean","Vallès, Francis","01/2011","Le Lombard",Null,"Grand format","978-2-8036-2752-3"),
("Rani","3",Null,"Esclave","Van Hamme, Jean","Vallès, Francis","04/2012","Le Lombard",Null,"Grand format","978-2-8036-2973-2"),
("Rani","4",Null,"Maîtresse","Van Hamme, Jean","Vallès, Francis","08/2013","Le Lombard",Null,"Grand format","978-2-8036-3197-1"),
("Scorpion (Le)","HS",Null,"Le procès scorpion","Desberg, Stephen","Marini, Enrico","10/2007","Dargaud",Null,"Format normal","978-2-505-00239-0"),
("Scorpion (Le)","1",Null,"La marque du diable","Desberg, Stephen","Marini, Enrico","10/2000","Dargaud",Null,"Format normal","2-87129-301-5"),
("Scorpion (Le)","2",Null,"Le secret du Pape","Desberg, Stephen","Marini, Enrico","10/2001","Dargaud",Null,"Format normal","2-87129-352-X"),
("Scorpion (Le)","3",Null,"La croix de Pierre","Desberg, Stephen","Marini, Enrico","11/2002","Dargaud",Null,"Format normal","2-87129-463-1"),
("Scorpion (Le)","4",Null,"Le Démon au Vatican","Desberg, Stephen","Marini, Enrico","04/2004","Dargaud",Null,"Format normal","2-87129-570-0"),
("Scorpion (Le)","5",Null,"La vallée sacrée","Desberg, Stephen","Marini, Enrico","11/2004","Dargaud",Null,"Format normal","2-87129-677-4"),
("Scorpion (Le)","6",Null,"Le trésor du Temple","Desberg, Stephen","Marini, Enrico","10/2005","Dargaud",Null,"Format normal","2-87129-760-6"),
("Scorpion (Le)","7",Null,"Au Nom du Père","Desberg, Stephen","Marini, Enrico","11/2006","Dargaud",Null,"Format normal","2-505-00018-2"),
("Scorpion (Le)","8",Null,"L'ombre de l'Ange","Desberg, Stephen","Marini, Enrico","11/2008","Dargaud",Null,"Format normal","978-2-505-00474-5"),
("Scorpion (Le)","9",Null,"Le Masque de la Vérité","Desberg, Stephen","Marini, Enrico","08/2010","Dargaud",Null,"Format normal","978-2-505-00914-6"),
("Scorpion (Le)","10",Null,"Au Nom du Fils","Desberg, Stephen","Marini, Enrico","11/2012","Dargaud",Null,"Format normal","978-2-505-01503-1"),
("Thomas Silane","1",Null,"Flash mortel","Chanoinat, Philippe","Lécossois, Yves","02/2004","Bamboo","Grand Angle","Grand format","2-912715-87-3"),
("Thomas Silane","2",Null,"Le tueur de Noël","Chanoinat, Philippe","Lécossois, Yves","03/2005","Bamboo","Grand Angle","Grand format","2-915309-58-2"),
("Thomas Silane","3",Null,"Tempêtes","Chanoinat, Philippe","Lécossois, Yves","05/2006","Bamboo","Grand Angle","Grand format","2-915309-95-7"),
("Thomas Silane","4",Null,"Objectifs","Chanoinat, Philippe","Zaghi, Roberto","04/2009","Bamboo","Grand Angle","Grand format","978-2-350-78301-7"),
("Thomas Silane","5",Null,"Fuites","Chanoinat, Philippe","Zaghi, Roberto","06/2010","Bamboo","Grand angle","Grand format","978-2-350-78935-4"),
("Thomas Silane","6",Null,"Libérations","Buendia, Patrice","Zaghi, Roberto","09/2011","Bamboo","Grand Angle","Grand format","978-2-8189-0702-3"),
("Thomas Silane","7",Null,"Racines","Buendia, Patrice","Zaghi, Roberto","04/2014","Bamboo","Grand Angle","Grand format","978-2-8189-2445-7"),
("Trolls de Troy","1",Null,"Histoires trolles","Arleston, Scotch","Mourier, Jean-Louis","06/1997","Soleil Productions",Null,"Grand format","2-87764-591-6"),
("Trolls de Troy","2",Null,"Le scalp du vénérable","Arleston, Scotch","Mourier, Jean-Louis","06/1998","Soleil Productions",Null,"Grand format","2-87764-712-9"),
("Trolls de Troy","3",Null,"Comme un vol de pétaures","Arleston, Scotch","Mourier, Jean-Louis","05/1999","Soleil Productions",Null,"Grand format","2-87764-849-4"),
("Trolls de Troy","4",Null,"Le feu occulte","Arleston, Scotch","Mourier, Jean-Louis","06/2000","Soleil Productions",Null,"Grand format","2-84565-000-0"),
("Trolls de Troy","5",Null,"Les maléfices de la thaumaturge","Arleston, Scotch","Mourier, Jean-Louis","08/2001","Soleil Productions",Null,"Grand format","2-84565-176-7"),
("Trolls de Troy","6",Null,"Trolls dans la brume","Arleston, Scotch","Mourier, Jean-Louis","09/2002","Soleil Productions",Null,"Grand format","2-84565-373-5"),
("Trolls de Troy","7",Null,"Plume de sage","Arleston, Scotch","Mourier, Jean-Louis","04/2004","Soleil Productions",Null,"Grand format","2-84565-482-0"),
("Trolls de Troy","8",Null,"Rock'N Troll Attitude","Arleston, Scotch","Mourier, Jean-Louis","06/2005","Soleil Productions",Null,"Grand format","2-84946-054-0"),
("Trolls de Troy","9",Null,"Les prisonniers du Darshan (I)","Arleston, Scotch","Mourier, Jean-Louis","08/2006","Soleil Productions",Null,"Grand format","2-84946-498-8"),
("Trolls de Troy","10",Null,"Les enragés du Darshan (II)","Arleston, Scotch","Mourier, Jean-Louis","06/2007","Soleil Productions",Null,"Grand format","978-2-84946-850-0"),
("Trolls de Troy","11",Null,"Trollympiades","Arleston, Scotch","Mourier, Jean-Louis","06/2008","Soleil Productions",Null,"Grand format","978-2-302-00201-2"),
("Trolls de Troy","12",Null,"Sang famille (I)","Arleston, Scotch","Mourier, Jean-Louis","07/2009","Soleil Productions",Null,"Grand format","978-2-302-00630-0"),
("Trolls de Troy","13",Null,"La guerre des gloutons (II)","Arleston, Scotch","Mourier, Jean-Louis","06/2010","Soleil Productions",Null,"Grand format","978-2-302-01102-1"),
("Trolls de Troy","14",Null,"L'histoire de Waha","Arleston, Scotch","Mourier, Jean-Louis","12/2010","Soleil Productions",Null,"Grand format","978-2-302-01381-0"),
("Trolls de Troy","15",Null,"Boules de poils (I)","Arleston, Scotch","Mourier, Jean-Louis","10/2011","Soleil Productions",Null,"Grand format","978-2-302-01629-3"),
("Trolls de Troy","16",Null,"Poils de trolls (II)","Arleston, Scotch","Mourier, Jean-Louis","06/2012","Soleil Productions",Null,"Grand format","978-2-302-02229-4"),
("Trolls de Troy","17",Null,"La Trolle impromptue","Arleston, Scotch","Mourier, Jean-Louis","11/2013","Soleil Productions",Null,"Grand format","978-2-302-03621-5"),
(Null,Null,Null,"Une histoire d'hommes","Zep","Zep","09/2013","Rue de Sèvres",Null,"Grand format","978-2-369-81001-8"),
("Vénus H.","1",Null,"Anja","Dufaux, Jean","Renaud","05/2005","Dargaud",Null,"Grand format","2-87129-743-6"),
("Vénus H.","2",Null,"Miaki","Dufaux, Jean","Renaud","05/2007","Dargaud",Null,"Grand format","978-2-505-00064-8"),
("Vénus H.","3",Null,"Wanda","Dufaux, Jean","Renaud","05/2008","Dargaud",Null,"Grand format","978-2-505-00133-1"),
("Chemins de Malefosse (Les)","2",Null,"L'attentement","Bardet, Daniel","Dermaut, François","08/1984","Glénat",Null,"Format normal","2723404617"),
("Décalogue (Le)","1",Null,"Le manuscrit","Giroud, Frank","Béhé","01/2001","Glénat","Grafica","Grand format","2723430642"),
("Décalogue (Le)","2",Null,"La Fatwa","Giroud, Frank","De Vita, Giulio","01/2001","Glénat","Grafica","Grand format","2723431290"),
("Décalogue (Le)","3",Null,"Le météore","Giroud, Frank","Charles, Jean-François","05/2001","Glénat","Grafica","Grand format","2723431908"),
("Décalogue (Le)","4",Null,"Le serment","Giroud, Frank","TBC","05/2001","Glénat","Grafica","Grand format","2723432165"),
("Décalogue (Le)","5",Null,"Le vengeur","Giroud, Frank","Rocco, Bruno","02/2002","Glénat","Grafica","Grand format","272343379X"),
("Décalogue (Le)","6",Null,"L'échange","Giroud, Frank","Mounier, Alain","02/2002","Glénat","Grafica","Grand format","2723434389"),
("Décalogue (Le)","7",Null,"Les conjurés","Giroud, Frank","Gillon, Paul","10/2002","Glénat","Grafica","Grand format","2723435008"),
("Décalogue (Le)","8",Null,"Nahik","Giroud, Frank","Rollin, Lucien","10/2002","Glénat","Grafica","Grand format","2723435717"),
("Décalogue (Le)","9",Null,"Le papyrus de Kôm-Ombo","Giroud, Frank","Faure, Michel","01/2003","Glénat","Grafica","Grand format","2723435725"),
("Décalogue (Le)","10",Null,"La dernière sourate","Giroud, Frank","Franz","01/2003","Glénat","Grafica","Grand format","2723435733"),
("Décalogue (Le) - Le Légataire","1",Null,"Le rendez-vous de Glasgow","Giroud, Frank","Meyer, Camille","01/2006","Glénat","Grafica","Grand format","2723445194"),
("Décalogue (Le) - Le Légataire","2",Null,"Le songe de Médine","Giroud, Frank","Meyer, Camille","01/2007","Glénat","Grafica","Grand format","9782723454599"),
("Décalogue (Le) - Le Légataire","3",Null,"Le labyrinthe de Thot","Giroud, Frank","Meyer, Camille","04/2008","Glénat","Grafica","Grand format","9782723459723"),
("Décalogue (Le) - Le Légataire","4",Null,"Le Cardinal","Giroud, Frank","Béhé","03/2009","Glénat","Grafica","Grand format","9782723465496"),
("Décalogue (Le) - Le Légataire","5",Null,"Le testament du prophète","Giroud, Frank","Béhé","09/2010","Glénat","Grafica","Grand format","9782723472593"),
("XIII","1",Null,"Le jour du soleil noir","Van Hamme, Jean","Vance, William","09/1984","Dargaud",Null,"Format normal","2871290008"),
("XIII","2",Null,"Là où va l'indien...","Van Hamme, Jean","Vance, William","01/1985","Dargaud",Null,"Format normal","2871290032"),
("XIII","3",Null,"Toutes les larmes de l'enfer","Van Hamme, Jean","Vance, William","01/1986","Dargaud",Null,"Format normal","2871290083"),
("XIII","4",Null,"SPADS","Van Hamme, Jean","Vance, William","01/1987","Dargaud",Null,"Format normal","2871290237"),
("XIII","5",Null,"Rouge total","Van Hamme, Jean","Vance, William","11/1988","Dargaud",Null,"Format normal","287129044X"),
("XIII","6",Null,"Le dossier Jason Fly","Van Hamme, Jean","Vance, William","01/1990","Dargaud",Null,"Format normal","2871290598"),
("XIII","7",Null,"La nuit du 3 août","Van Hamme, Jean","Vance, William","10/1990","Dargaud",Null,"Format normal","2871290628"),
("XIII","8",Null,"Treize contre un","Van Hamme, Jean","Vance, William","10/1991","Dargaud",Null,"Format normal","2871290652"),
("XIII","9",Null,"Pour Maria","Van Hamme, Jean","Vance, William","09/1992","Dargaud",Null,"Format normal","2871290660"),
("XIII","10",Null,"El cascador","Van Hamme, Jean","Vance, William","02/1994","Dargaud",Null,"Format normal","2871290725"),
("XIII","11",Null,"Trois montres d'argent","Van Hamme, Jean","Vance, William","03/1995","Dargaud",Null,"Format normal","2871290822"),
("XIII","12",Null,"Le jugement","Van Hamme, Jean","Vance, William","09/1997","Dargaud",Null,"Format normal","2871291179"),
("XIII","13",Null,"The XIII mystery - L'enquête","Van Hamme, Jean","Vance, William","01/1999","Dargaud",Null,"Format normal","2871290911"),
("XIII","14",Null,"Secret défense","Van Hamme, Jean","Vance, William","10/2000","Dargaud",Null,"Format normal","2871292973"),
("XIII","15",Null,"Lachez les chiens !","Van Hamme, Jean","Vance, William","03/2002","Dargaud",Null,"Format normal","2871294526"),
("XIII","16",Null,"Opération Montecristo","Van Hamme, Jean","Vance, William","02/2004","Dargaud",Null,"Format normal","2871295921"),
("XIII","17",Null,"L'or de Maximilien","Van Hamme, Jean","Vance, William","09/2005","Dargaud",Null,"Format normal","287129755X"),
("XIII","18",Null,"La version Irlandaise","Van Hamme, Jean","Giraud, Jean","11/2007","Dargaud",Null,"Format normal","9782505001317"),
("XIII","19",Null,"Le dernier round","Van Hamme, Jean","Vance, William","11/2007","Dargaud",Null,"Format normal","9782505001300"),
("XIII","20",Null,"Le jour du Mayflower","Sente, Yves","Jigounov, Youri","11/2011","Dargaud",Null,"Format normal","9782505012948"),
("XIII","21",Null,"L'appât","Sente, Yves","Jigounov, Youri","11/2012","Dargaud",Null,"Format normal","9782505015048"),
("XIII","22",Null,"Retour à Greenfalls","Sente, Yves","Jigounov, Youri","11/2013","Dargaud",Null,"Format normal","9782505017998"),
("XIII Mystery","1",Null,"La Mangouste","Dorison, Xavier","Meyer, Ralph","10/2008","Dargaud",Null,"Format normal","9782505004721"),
("XIII Mystery","2",Null,"Irina","Corbeyran, Éric","Berthet, Philippe","10/2009","Dargaud",Null,"Format normal","9782505006923"),
("XIII Mystery","3",Null,"Little Jones","Yann","Henninot, Éric","10/2010","Dargaud",Null,"Format normal","9782505009795");

DROP TABLE IF EXISTS MesSeries ;

CREATE TABLE MesSeries (

	titre varchar(250) Null,
	style varchar(250) Null,
	parution varchar(250) Null,
	tomes varchar(250) Null
);

INSERT INTO MesSeries VALUES
("Airborne 44","Guerre","En cours","5"),
("Alpha","Espionnage","En cours","12"),
("Astérix","Humoristique","En cours","35"),
("Chansons pour les yeux","Adaptation","One shot","1"),
("Châteaux Bordeaux","Roman graphique","En cours","4"),
("Chemins de Malefosse (Les)","Historique","En cours","21"),
("Cycle de Cyann (Le)","Science-fiction","En cours","5"),
("Dernier templier (Le)","Aventure","En cours","5"),
("Empire USA","Thriller","En cours","12"),
("I.R.$.","Polar/Thriller","En cours","14"),
("I.R.$. - All Watcher","Polar/thriller","Finie","7"),
("Ils étaient dix","Historique","En cours","6"),
("Jacques Gallard (Une aventure de)","Aventure","Finie","4"),
("Lady S.","Espionnage","En cours","9"),
("Long voyage de Léna (Le)","Roman graphique","Finie","2"),
("Magasin général","Chronique sociale","En cours","8"),
("Passagers du vent (Les)","Historique","Finie","7"),
("Quête de l'oiseau du temps (La)","Heroïc Fantasy","En cours","8"),
("Rafales","Polar/thriller","Finie","4"),
("Rani","Historique","En cours","4"),
("Scorpion (Le)","Aventure","En cours","10"),
("Thomas Silane","Polar fantastique","En cours","7"),
("Trolls de Troy","Heroïc Fantasy","En cours","17"),
("Une histoire d'hommes","Roman graphique","One shot","1"),
("Vénus H.","Polar/thriller","Finie","3"),
("XIII","Polar/Thriller","En cours","22"),
("XIII Mystery","Polar/thriller","En cours","7"),
("Décalogue (Le)","Historique","Finie","10"),
("Décalogue (Le) - Le Légataire","Historique","Finie","5");




