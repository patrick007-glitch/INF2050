## Identification

- Cours      : Outils et pratiques de développement logiciel
- Sigle      : INF2050
- Session    : Hiver 2019
- Groupe     : `<30>`
- Enseignant : `<François-Xavier Guillemette>`
- Auteur     : `<Patrick Chalifour>` (`<CHAP03089503>`) (`<dj991063@ens.uqam.ca>`)
- Auteur     : `<Serban-Costin Ivanescu>` (`<IVAS14069704>`) (`<votre courriel UQAM>`)
- Auteur     : `<Anaïs Yaïci>` (`<YAIA20559707>`) (`<votre courriel UQAM>`)
- Auteur     : `<Steve Gordon>` (`<GORS09077601>`) (`<votre courriel UQAM>`)


# Comparaison des outils de build java

## Ant
*Ant* est un outil de build sorti en 2000 pour pallier aux difficultés de *MAKE* qui est sorti en 1976 et codé en C.  L'une des raisons majeurs d'être d'*Ant* est la difficulté
d'intégré des conventions du language C dans l'écosystême Java. Les fichiers de build *Ant* sont écris en *XML* et sont nommés _build.xml_ par convention. *Ant* requiert que les développeurs 
écrivent toutes les commandes de gestion de build pour leur projet ce qui peut mener a des fichiers XML énormes comportant des centaines et parfois des milliers de ligne. De plus, le projet *Ant* 
original est sorti avec aucun systême de gestion des dépendances. Lorsque le besoin c'est fait sentir, le sous-projet *IVY* qui est un gestionnaire de dépendance, a été développé par *Jayasoft* et intégré avec *Ant*. 

Source : https://www.baeldung.com/ant-maven-gradle, mise à jour le 15 août 2019, auteur : baeldung.

## Gradle
Gradle a été conçu avec Maven et Ant en tête. Il n'utilise plus des fichier XML mais plutot un DSL basé sur Groovy et qui adapte un language spécifique pour des projets spécifique. Un fichier de configuration Gradle s'apelle build.gradle par convention.
Gradle seule n'a pas vraiment de fonction. Il faut utiliser de plugins pour ajouter des fonctionnalité a Gradle ce qui permet de gardé les fichiers de configurations simple et court.
À partir de la version 1.0, *Gradle* n'utilise plus *IVY* comme gestionnaire de dépendance. Un gestionnaire de dépendance independant a été construit spécifiquement pour *Gradle*. 
De plus, *Gradle* est nativement intégré a Eclipse, Intellij et NetBeans ce qui permet de roulé directement des buils *Gradle* dans ces *IDE*.


Source : https://docs.gradle.org/1.0/release-notes.html#powerful-dependency-management



### Critères de comparaisons

#### Critères 1 : 


#### Critères 2 : 


#### Critères 3 : 