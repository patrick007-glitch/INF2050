# INF2050
Ceci est le répertoire pour INF2050 Team Slackers.
Membre d'équipe :
- Patrick Chalifour
- Serban-Costin Ivanescu
- Anaïs Yaïci
- Steve Gordon,

Ce projet est un projet dans le cadre d'un cours universitaire (INF2050). C'est
un interpreteur pour le language minischeme qui un dérivé de scheme créer dans
le cadre du cours par le professeur François-Xavier Guillemette.

Le projet est diviser en deux modules soit l'interpreteur sous le dossier minischeme
et l'application web sous le dossier web_minischeme. 

## Compiler l'application
Pour compiler l'application minischeme il faut d'abord être dans le fichier
minischeme et lancer la commande :

 gradle clean build


## Rouler l'application web
Puis pour rouler l'application web il faut d'abord la compiler. Dans le fichier
web_minischeme, lancer la commande:

  gradle clean build

puis pour lancer l'application

 gradlew.bat bootRun

L'application web sera alors disponible à l'adresse http://localhost:8080.
