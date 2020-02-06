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

#### Critères 1 :  L'utilisabilité

L'utilisabilité en tant que critère se décrit facilement lorsque l'on considère les sous critères nécessaires à l'évaluation de celui-ci. 

Tout d'abord, un bon outil de build doit être *compréhensible*. Le but et la fonction de cet outil doivent être clair pour que l'utilisateur ciblé voit facilement l'utilité et les avantages de choisir cet outil au lieu d'un autre. De plus, pour attirer l'attention de la communauté des programmeurs un outil de build doit nécessairement donné accès aux fonctions de bases nécessaires mais aussi à des fonctions avancées qui le distringueront des autres outils disponible. L'outil doit être facile d'utilisation et ne pas exiger une constante relecture de la documentation. De plus, la simplicité et la rapidité d'utilisation d'un outil influence aussi sa compréhensabilité. Par exemple, un outil complexe à installer annonce un outil plus complexe et long à utiliser. 

Intrinsèquement, un bon outil de build doit avoir une documentation disponible et complète pour facilité la compréhension de l'outil et son utilisation. Cette documentation doit contenir toutes les charactérisiques énoncés par le sous critère de la compréhensibilité mais doit en plus être de bonne qualité. Une bonne documentation se mesure sur le niveau de lecture et de connaissance requise pour comprendre celle-ci ainsi que la concision et l'étendue de sa couverture. Elle doit contenir lorsque possible des instructions étape par étape pour l'utilisation, les commandes, les problèmes et les messages d'erreurs qui sont simple et concise. Cette documentation doit offrir un support complet et offrir une éducation exhaustive sur comment utiliser l'outil.

L'utilisabilité est un critère très important car il peut affecter la décision d'un programmeur ou d'une entreprise d'utiliser un outil au lieu d'un autre sans même avoir écrit une seule ligne de code. Un outil bien documenté et compréhensible aura un avantage certain sur un autre outil et pourrait avoir une plus grande adoption par l'industrie. Plus un outil est compréhensible, plus il donne des ressources, des balises et des instructions claires aux programmeurs ce qui leurs permet de manière général, de travailler plus efficacement et plus rapidement sur une variété de projet.

D'abord, lorsque l'on consulte le site web des deux outils de build, les buts de *Gradle* sont mit en avant plan et énnoncés clairement. Avec *Ant* on tombe directement sur un descripteur des différentes version et son but et ses avantages sont moins facilement repérable. 
Dans un autre temps, *Gradle* offre les même fonctionnalités de base qu'*Ant* mais offrent plus de fonctionnalités avancés qui sont documentés de manière claire et concise pour une variété de languages. Ceci donne un avantage clair sur Ant car un programmeur devra apprendre uniquement un outil de build. Alors qu'avec *Ant*, qui a été créé principalement pour des projets java, un programmeur devra apprendre un autre outil de build s'il compte faire des projets en d'autres languages. 
De plus, *Gradle* est beaucoup plus compréhensible qu'*Ant* sur la documentation pour l'installation. Alors que la documentation pour *Gradle* fait le tour de l'installation en une centaines de lignes seulement et comporte quelque ligne de commande relativement simple; la documentation pour installer *Ant* fait quand à elle plusieurs pages d'environ 500 lignes et comprend des instructions relativement plus complexes et plusieurs lignes de commandes. Bref le niveau de connaissance du lecteur pour installer Ant doit être plus élevé. La documentation pour Graddle est plus courte, plus concise, plus facile à lire et droit au but. 
Enfin, *Gradle* comprend une variété énorme de tutoriels, pour des projets dans plusieurs languages de programmation, alors qu'*Ant* comprend seulement quelques tutoriels et encore une fois le niveau de connaissance requise pour lire les tutoriels est beaucoup plus élevé avec *Ant* qu'avec *Gradle*. 


#### Critères 2 : 


#### Critères 3 : 



### Bibliographie 

1. https://www.baeldung.com/ant-maven-gradle, mise à jour le 15 août 2019, Baeldung.

2. https://docs.gradle.org/1.0/release-notes.html#powerful-dependency-management

3. https://software.ac.uk/sites/default/files/SSI-SoftwareEvaluationCriteria.pdf, novembre 2011, Sofware Sustainability Institue.