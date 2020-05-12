<<<<<<< HEAD
# Beüzemelés


WEBES
A db.properties fájlban át kell állítani a db elérését vagy a tomcat bin könyvtárába bemásolni a resources/db/sample.db fájlt!

ASZTALI 
a sample.db adatbázist pom es src mappa egy szintjerol olvassa be az app

sqlite jdbc 3.30.1
Java 13 verzio

#Leiras
https://okt.sed.hu/alkfejl1/gyakorlat/kotprog/kerdoiv/

ASZTALI
	-Add menu alatt New Survey hozzaadsz egy kerdoivet
	   -Add question gombbat tudsz kerdeseket hozzaadni valaszokkal
	   		-save gomb menti
	   		-probald ki a tobb lehetoseges keredeseket is! :)

	   -kerdoiv hozzaadasnal mindent ki kell tolteni, de figyelmeztet is az app
	    	-legalabb 1 kerdes kell
	    	-ido formatumok : hh:mm
	   -Save gombbal mented
	-ha mentettuk es beszarjuk az ablakot megjelenik a listaban
	-szuresi lehetosegek a View menupont alatt vannak

WEB
	-ha beallitottuk az adatbazist megjeleniti a kerdoiveket
	-el tudod inditani azokat a kerdoiveket ahol benne vagy az aktialis intevallumban
			-beirod a kerdoiv ID-t a mezobe es Start survey gomb
			-egyebkent hibauzenet ha intevallumon kivul
	-kerdoivek kitoltese jelenleg csak string alapu valaszokat tamogat
	    -show answers gomb megjeleniti a valaszt amit az aszali appban irtunk jobb oldalt
	-kitoltes alatt megjeleniti a kerdoivhez elmentett kerdeseket es valaszokat

=======
# alkfej1Web


Webes alkalmazás funkciói:
  - Kérdéssor kitöltése
  - Csak akkor lehetséges, ha a kérdéssor feltételei teljesülnek
  - Rögzíteni kell a kitöltő nevét és a kitöltés időpontját.
  - Kérdéssort nem lehet folytatni.
  
Az alkalmazás http://localhost:8080/FirstWebMaven_war/survey címen lesz elérhetö.

Rajki Zsombor Milán - VS92AH
>>>>>>> 2b539bb79b7db357281b4316c1ce9770c4b8e97c
