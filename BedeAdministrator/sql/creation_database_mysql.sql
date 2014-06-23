DROP TABLE IF EXISTS AlbumPersonne ;
DROP TABLE IF EXISTS Album ;
DROP TABLE IF EXISTS Serie ;
DROP TABLE IF EXISTS Editeur ;
DROP TABLE IF EXISTS Genre ;
DROP TABLE IF EXISTS Personne ;
DROP TABLE IF EXISTS Metier ;

-- -----------------------------------------------------
-- Table Editeur
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Editeur (
  idEditeur INT NOT NULL AUTO_INCREMENT,
  NomEditeur VARCHAR(45) NULL,
  CONSTRAINT pk_editeur PRIMARY KEY (idEditeur))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table Genre
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Genre (
  idGenre INT NOT NULL AUTO_INCREMENT,
  libelleGenre VARCHAR(45) NOT NULL,
  CONSTRAINT pk_genre PRIMARY KEY (idGenre))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table Metier
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Metier (
  idMetier INT NOT NULL AUTO_INCREMENT,
  libelleMetier VARCHAR(45) NULL,
  CONSTRAINT pk_metier PRIMARY KEY (idMetier))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table Serie
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Serie (
  idSerie INT NOT NULL AUTO_INCREMENT,
  titreSerie VARCHAR(45) NULL,
  termine TINYINT(1) NULL,
  nombreAlbums INT NULL,
  idGenre  INT NULL,
  CONSTRAINT pk_serie PRIMARY KEY (idSerie),
  CONSTRAINT fk_serie_genre FOREIGN KEY (idGenre) REFERENCES Genre (idGenre)
)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table Album
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Album (
  idAlbum INT NOT NULL AUTO_INCREMENT,
  titreAlbum VARCHAR(50) NOT NULL,
  numero VARCHAR(25) NULL,
  cycle VARCHAR(25) NULL,
  depotLegal DATETIME NULL,
  couverture VARCHAR(255) NULL,
  idSiteRef VARCHAR(255) NULL,
  possede BOOLEAN NOT NULL DEFAULT false,
  horsSerie BOOLEAN NOT NULL DEFAULT false,
  PremiereEdition BOOLEAN NOT NULL DEFAULT false,
  isbn VARCHAR(25) NULL,
  formatAlbum TINYINT NOT NULL,
  idSerie INT NULL,
  idEditeur INT NULL ,
  idGenre  INT NULL COMMENT 'uniquement pour les one shot',
  CONSTRAINT pk_album PRIMARY KEY (idAlbum),
  CONSTRAINT fk_album_Serie FOREIGN KEY (idSerie) REFERENCES Serie (idSerie),
  CONSTRAINT fk_album_genre FOREIGN KEY (idGenre) REFERENCES Genre (idGenre),
  CONSTRAINT fk_Album_Editeur FOREIGN KEY (idEditeur) REFERENCES Editeur (idEditeur)
)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table Personne
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Personne (
  idPersonne INT NOT NULL AUTO_INCREMENT,
  Nom VARCHAR(45) NULL,
  Prenom VARCHAR(45) NULL,
  NomUsuel VARCHAR(90) NULL,
  DateNaissance DATETIME NULL,
  DateDeces DATETIME NULL,
  CONSTRAINT pk_personne PRIMARY KEY (idPersonne))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table AlbumPersonne
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS AlbumPersonne (
  idAlbumPersonne INT NOT NULL AUTO_INCREMENT,
  idAlbum INT NULL,
  idPersonne INT NULL,
  idMetier INT NULL,
  PRIMARY KEY (idAlbumPersonne),
  CONSTRAINT fk_AlbumPersonne_Album FOREIGN KEY (idAlbum) REFERENCES Album (idAlbum),
  CONSTRAINT fk_AlbumPersonne_Personne FOREIGN KEY (idPersonne) REFERENCES Personne (idPersonne),
  CONSTRAINT fk_AlbumPersonne_Metier FOREIGN KEY (idMetier) REFERENCES Metier (idMetier)
)
ENGINE = InnoDB;

CREATE INDEX fk_Serie_Genre_idx ON Serie (idGenre ASC);
CREATE INDEX fk_Album_Serie_idx ON Album (idSerie ASC);
CREATE INDEX fk_Album_Editeur_idx ON Album (idEditeur ASC);
CREATE INDEX fk_Album_Genre_idx ON Album (idGenre ASC);
CREATE INDEX fk_AlbumPersonne_Album_idx ON AlbumPersonne (idAlbum ASC);
CREATE INDEX fk_AlbumPersonne_Personne_idx ON AlbumPersonne (idPersonne ASC);
CREATE INDEX fk_AlbumPersonne_Metier_idx ON AlbumPersonne (idMetier ASC);
