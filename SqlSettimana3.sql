CREATE TABLE Clienti(
	numeroCliente SERIAL PRIMARY KEY,
	nome VARCHAR NOT NULL,
	cognome VARCHAR NOT NULL,
	dataDiNascita DATE NOT NULL,
	regioneresidenza VARCHAR NOT NULL
);

CREATE TABLE Fatture(
	numeroFattura SERIAL PRIMARY KEY,
	tipologia VARCHAR NOT NULL,
	importoIva INTEGER NOT NULL,
	idCliente SERIAL,
	dataFattura DATE NOT NULL,
	numeroFornitore SERIAL
);

CREATE TABLE Prodotti(
	idProdotto SERIAL PRIMARY KEY,
	descrizione VARCHAR,
	inProduzione BOOLEAN,
	inCommercio BOOLEAN,
	dataAttivazione DATE,
	dataDisattivazione DATE
);

CREATE TABLE Fornitori(
	numeroFornitore SERIAL PRIMARY KEY,
	denominazione VARCHAR,
	regioneResidenza VARCHAR
);

INSERT INTO Clienti (nome, cognome, dataDiNascita, regioneresidenza) VALUES ('Giacomo', 'Freddi', '1988-03-10', 'Pavia');
INSERT INTO Clienti (nome, cognome, dataDiNascita, regioneresidenza) VALUES ('Mauro', 'Santori', '1982-09-11', 'Reggio-emiolia');
INSERT INTO Clienti (nome, cognome, dataDiNascita, regioneresidenza) VALUES ('Federica', 'Mantovani', '1994-01-25', 'Perugia');
INSERT INTO Clienti (nome, cognome, dataDiNascita, regioneresidenza) VALUES ('Luca', 'Ferretti', '1982-08-15', 'Napoli');
INSERT INTO Clienti (nome, cognome, dataDiNascita, regioneresidenza) VALUES ('Paolo', 'Deluca', '2003-07-12', 'Firenze')

INSERT INTO Fatture (tipologia, importoIva, dataFattura) VALUES ('pro-forma', 22, '2017-09-18');
INSERT INTO Fatture (tipologia, importoIva, dataFattura) VALUES ('immediata', 25, '2022-12-4');
INSERT INTO Fatture (tipologia, importoIva, dataFattura) VALUES ('differita', 20, '2017-09-18');
INSERT INTO Fatture (tipologia, importoIva, dataFattura) VALUES ('anticipata', 22, '2016-05-02');
INSERT INTO Fatture (tipologia, importoIva, dataFattura) VALUES ('semplificata', 20, '2020-06-18');

INSERT INTO Prodotti (descrizione, inProduzione, inCommercio ,dataAttivazione, dataDisattivazione) VALUES ('PlayStation5', true, true, '2023-10-20', '2023-12-31');
INSERT INTO Prodotti (descrizione, inProduzione, inCommercio ,dataAttivazione, dataDisattivazione) VALUES ('TvSamsung', false, true, '2019-06-10', '2021-12-31');
INSERT INTO Prodotti (descrizione, inProduzione, inCommercio ,dataAttivazione, dataDisattivazione) VALUES ('FrigoriferoSmeg', false, true, '2016-09-17', '2018-12-31');
INSERT INTO Prodotti (descrizione, inProduzione, inCommercio ,dataAttivazione, dataDisattivazione) VALUES ('LavatriceSmeg', false, false, '2023-10-20', '2023-12-31');
INSERT INTO Prodotti (descrizione, inProduzione, inCommercio ,dataAttivazione, dataDisattivazione) VALUES ('computerHP', true, true, '2020-05-07', '2020-12-31');
INSERT INTO Prodotti (descrizione, inProduzione, inCommercio ,dataAttivazione, dataDisattivazione) VALUES ('lavastovigliSmeg', false, true, '2021-08-18', '2021-12-31');
INSERT INTO Prodotti (descrizione, inProduzione, inCommercio ,dataAttivazione, dataDisattivazione) VALUES ('mobileLusso', false, false, '2014-10-20', '2020-12-31');
INSERT INTO Prodotti (descrizione, inProduzione, inCommercio ,dataAttivazione, dataDisattivazione) VALUES ('AutoMercedes', true, true, '2017-10-20', '2027-12-31');


INSERT INTO Fornitori (denominazione, regioneResidenza) VALUES ('Frigeri&Trasporti' , 'Emilia Romagna');
INSERT INTO Fornitori (denominazione, regioneResidenza) VALUES ('Sicaf&Trasporti' , 'Lombardia');
INSERT INTO Fornitori (denominazione, regioneResidenza) VALUES ('Codeluppi&Trasporti' , 'Piemonte');
INSERT INTO Fornitori (denominazione, regioneResidenza) VALUES ('D&M Trasporti internazionali' , 'Emilia Romagna');

SELECT * FROM Clienti WHERE EXTRACT (YEAR FROM dataDiNascita) = 1982;

SELECT * FROM Fatture WHERE importoIva = 20;
SELECT * FROM Prodotti WHERE EXTRACT (YEAR FROM dataAttivazione) = 2017 AND inProduzione = true AND inCommercio = true;




