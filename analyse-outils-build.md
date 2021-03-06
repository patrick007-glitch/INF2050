## Identification

- Cours      : Outils et pratiques de développement logiciel
- Sigle      : INF2050
- Session    : Hiver 2019
- Groupe     : `<30>`
- Enseignant : `<François-Xavier Guillemette>`
- Auteur     : `<Patrick Chalifour>` (`<CHAP03089503>`) (`<dj991063@ens.uqam.ca>`)
- Auteur     : `<Serban-Costin Ivanescu>` (`<IVAS14069704>`) (`<votre courriel UQAM>`)
- Auteur     : `<Anaïs Yaïci>` (`<YAIA20559707>`) (`<ed691033@ens.uqam.ca
- Auteur     : `<Steve Gordon>` (`<GORS09077601>`) (`<gordon.steve@courrier.uqam.ca>`)


# Comparaison des outils de build java

## Ant
*Ant* est un outil de build sorti en 2000 pour pallier aux difficultés de *MAKE* qui est sorti en 1976 et codé en C.  L'une des raisons majeures d'être d'*Ant* est la difficulté
d'intégrer des conventions du language C dans l'écosystème Java. Les fichiers de build *Ant* sont écrits en *XML* et sont nommés _build.xml_ par convention. *Ant* requiert que les développeurs
écrivent toutes les commandes de gestion de build pour leur projet ce qui peut mener à des fichiers *XML* énormes comportant des centaines et parfois des milliers de lignes. De plus, le projet *Ant*
original est sorti avec aucun système de gestion des dépendances. Lorsque le besoin s'est fait sentir, le sous-projet *IVY* qui est un gestionnaire de dépendances, a été développé par *Jayasoft* et intégré avec *Ant*.[1]



## Gradle
Gradle a été conçu avec Maven et Ant en tête. Il n'utilise plus des fichiers *XML* mais plutôt un DSL basé sur Groovy et qui adapte un langage spécifique pour des projets spécifiques. Un fichier de configuration Gradle s'apelle build.gradle par convention.
Gradle seul n'a pas vraiment de fonction. Il faut utiliser des plugins pour ajouter des fonctionnalités a Gradle ce qui permet de garder les fichiers de configuration simples et courts.
À partir de la version 1.0, *Gradle* n'utilise plus *IVY* comme gestionnaire de dépendances. Un gestionnaire de dépendances independant a été construit spécifiquement pour *Gradle*.
De plus, *Gradle* est nativement intégré à Eclipse, Intellij et NetBeans ce qui permet de rouler directement des builds *Gradle* dans ces *IDE*.[2]






### Critères de comparaison

#### Critère 1 :  L'utilisabilité

L'utilisabilité en tant que critère se décrit facilement lorsque l'on considère les sous critères nécessaires à l'évaluation de celui-ci soit la compréhensibilité et la documentation.[3]

Tout d'abord, un bon outil de build doit être *compréhensible*. Le but et la fonction de cet outil doivent être clairs pour que l'utilisateur ciblé voie facilement l'utilité et les avantages de choisir cet outil au lieu d'un autre. De plus, pour attirer l'attention de la communauté des programmeurs, un outil de build doit nécessairement donner accès aux fonctions de base nécessaires mais aussi à des fonctions avancées qui le distingueront des autres outils disponibles. L'outil doit être facile d'utilisation et ne pas exiger une constante relecture de la documentation. De plus, la simplicité et la rapidité d'utilisation d'un outil influence aussi sa compréhensabilité. Par exemple, un outil complexe à installer annonce un outil plus complexe et plus long à utiliser.[3]

Intrinsèquement, un bon outil de build doit avoir une documentation disponible et complète pour faciliter la compréhension de l'outil et son utilisation. Cette documentation doit contenir toutes les caractéristiques définies par le sous critère de la compréhensibilité mais doit en plus être de bonne qualité. Une bonne documentation se mesure sur le niveau de lecture et de connaissance requise pour comprendre celle-ci ainsi que la concision et l'étendue de sa couverture. Elle doit contenir, lorsque cela est possible des instructions étape par étape pour l'utilisation, les commandes, les problèmes et les messages d'erreurs qui sont simples et concises. Cette documentation doit offrir un support complet et offrir une éducation exhaustive sur comment utiliser l'outil.[3]

L'utilisabilité est un critère très important car il peut affecter la décision d'un programmeur ou d'une entreprise d'utiliser un outil au lieu d'un autre sans même avoir écrit une seule ligne de code. Un outil bien documenté et compréhensible aura un avantage certain sur un autre outil et pourrait avoir une plus grande adoption par l'industrie. Plus un outil est compréhensible, plus il donne des ressources, des balises et des instructions claires aux programmeurs ce qui leurs permet de manière général, de travailler plus efficacement et plus rapidement sur une variété de projets.

D'abord, lorsque l'on consulte le site web des deux outils de build, les buts de *Gradle* sont mis en avant plan et énoncés clairement. Avec *Ant* on tombe directement sur un descripteur des différentes versions et son but et ses avantages sont moins facilement repérables.
D'un autre côté, *Gradle* offre les mêmes fonctionnalités de base que les fonctionnalités d'*Ant*. En plus, il offre des fonctionnalités avancées, documentées de manière claire et concise, et avec une variété de langages. Ceci donne un avantage clair sur *Ant* car un programmeur devra apprendre uniquement un outil de build.Tel que présenté, Ant a été créé principalement pour des projets java. Or, un programmeur devra apprendre un autre outil de construction s’il doit faire des projets en d’autres langages.
De plus, *Gradle* est beaucoup plus compréhensible qu'*Ant* sur la documentation pour l'installation.

En effet, alors que la documentation pour Gradle fait le tour de l’installation en quelques lignes seulement et comporte des commandes relativement simples à comprendre, la documentation d’Ant fait, quant à elle, plusieurs pages d’environ 500 lignes et comprend des instructions relativement plus complexes et plusieurs lignes de commandes.
Bref, le niveau de connaissance du lecteur pour installer *Ant* doit être plus élevé. La documentation pour *Gradle* est plus courte, plus concise, plus facile à lire et va droit au but.

Enfin, *Gradle* comprend une variété énorme de tutoriels, pour des projets dans plusieurs langages de programmation, alors qu'*Ant* comprend seulement quelques tutoriels et encore une fois le niveau de connaissances requise pour lire les tutoriels est beaucoup plus élevé avec *Ant* par rapport à *Gradle*.


#### Critère 2 : La maintenance

Une fois l'outil de build choisi, le code doit pouvoir être maintenu facilement sur une certaine période de temps avec la possibilité que ce code puisse être utilisé ou réutilisé par plusieurs développeurs. La robustesse du code et sa stabilité doivent donc être assurées au fil du temps. Le critère de maintenance devient donc un facteur important. Ce critère peut être évalué selon différents aspects tels que la complexité du code et la documentation ainsi le support de la communauté.

Selon la complexité du code, le script *Ant* est codé en *XML*. Ce script peut varier énormément selon ce qu'il doit accomplir [4]. Pour les projets relativement simples, ce langage peut s'avérer un bon choix. Cependant, aussitôt que le projet se complexifie, le script peut faire plusieurs centaines de lignes de code et plus. Puisque cet outil ne nécessite pas de convention de codage [5] comme c'est le cas pour *Maven* ou *Gradle*, celui-ci demeure assez flexible. Cette dernière caractéristique introduit néanmoins un facteur de complexité supplémentaire puisque chaque projet devient unique et plus difficile à comprendre [6]. De plus, selon le site drdobbs, le code script *XML* se retrouve mélangé avec des scripts externes afin de construire la logique voulue. Ce surplus de code entraîne nécessairement plus de complexité et donc plus de maintenance [6].

Pour ce qui est de *Gradle*, le site internet JRebel décrit son code comme étant relativement simple. L'utilisateur peut, en un coup d'oeil, comprendre assez facilement ce que le script fait. Même si l'utilisateur ne possède aucune expérience de la syntaxe Groovy, le code demeure assez intuitif [4].

Selon l'aspect de la documentation et du support, il est important d'avoir toute l'information disponible que ce soit au niveau de sa documentation et de sa qualité que des informations retrouvées à travers la communauté de développeurs pour maintenir le code. Ce dernier élément est spécialement important car ceux-ci sont dotés de l'expertise nécessaire pour l'utilisation, les conseils et le déboggage. Selon le site internet JRebel, la documentation de *Gradle* est tout simplement géniale. Plusieurs formats sont disponibles (HTML, PDF ou papier) et abondamment illustrés d'exemples [4]. Aussi, un différenciateur important, est le support de la communauté qui est organisé, efficace et assuré par les professionnels de la compagnie Gradleware, toujours selon JRebel [4].

Quant à *Ant*, la documentation semble plus désuète et l'information serait un peu plus difficile à trouver, spécialement si on ne connaît pas spécifiquement les noms des éléments recherchés [4]. La communauté serait moins grande et se concentrerait plus spécifiquement alentour de *StackOverflow* et de la bonne volonté et de l'expérience de ses utilisateurs [4].

En définitive, sur le plan de maintenance au sens strict du mot, le meilleur outil, est *Gradle* dû à son code plus simple pour autant que ses utilisateurs veuillent en apprendre la syntaxe *Groovy*. Tel que mentionné par le site drdobbs, à mesure que le script *XML* grossit, la maintenance du code peut devenir une tâche ardue [6] ce qui joue en défaveur de *Ant*.



#### Critère 3: Soutien Actuel

Outre la complexité du code et son utilisation, il y a le support actuel qu'un programme possède qui vient jouer un rôle au choix. On ne choisit plus d'installer Windows XP dû à son obsolescence et son arrêt de support.

Plus spécifiquement le support d'une application viendra toucher: La période dont elle a été conçue, en quel langage elle a été écrite et pour quelle système d'opération, la portabilité , la fréquence des mises à jours et le nombre d'utilisateurs approximatif présent.

Commencent par la date initiale de lancement, pour Apache Ant, c'est le 19 août 2000. Quant à Gradle, la première version a été lancée le 12 juin 2012. Déjà là nous voyons une différence de 12 ans entre les deux applications, ce qui, dans le monde des applications marque plusieurs générations d'applications. Nous savons qu'Apache Maven est l'itération par apache d'ant par contre Gradle vient après les deux. De plus Gradle étant un conçue pour remplacer Ant et Maven, donc possède des commandes pour transformer les fichiers XML d'Ant et Maven en configuration de Gradle. Ceci est les principaux avantages de l'itération.[6][7]

Quant au langage et système, les deux applications sont écrites en Java donc roulent sur le JVM et sont donc très compatibles avec la majorité des systèmes d'opérations modernes. Bien sûr, cela veut aussi dire que les applications sont dépendantes de Java. Par contre, au moment présent Java est l'un des langages les plus utilisés et est donc très soutenu.

Pour ce qui est de la fréquence des mises à jours. La dernière version majeure de Gradle a été lancée le 8 novembre 2019 (6.0) et depuis il y a eu deux versions mineures (6.1 et 6.2) la 6.2 lancées le 17 février 2020. Contrairement Apache Ant et sur la même version majeure (1.10) depuis 2016. Cependant elle possède des mises à jours mineures à fréquence régulière (3~5 mois). La dernière version mineure stable de Apache Ant (1.10.7) datait le 5 septembre 2019.[6][7]

Quant au nombres d'utilisateurs, Il serait très difficile de faire une comparaison précise. Par contre, nous pouvons analyser les tendances de recherche sur l'internet. Il faut, par contre, prendre les résultats avec beaucoup d'incertitude. En faisant une comparaison à travers le temps et mondialement sur Google trends avec les mots-clefs "Apache Ant" et "Gradle", nous voyons qu'Ant était plus rechercheé au lancement de Gradle, par contre Gradle monte et rattrape Apache Ant autour de mi-2014 tandis que celle-ci est en déclin progressivement. D'après Google trends, en janvier 2020, la recherche des mots serait de 83 à 11 pour Gradle.[9] De plus, une analyse entre le trafic des sites officiels de chaque application, notamment "gradle.org" et "ant.apache.org". Cependant vu que "ant.apache.org" est un sous-domaine de "apache.org", il est difficile de déterminer le trafic de "ant.apache.org". De ce, "apache org" possède grandement plus de trafic  que "gradle.org". [10][11]




### Bibliographie

1. https://www.baeldung.com/ant-maven-gradle, mise à jour le 15 août 2019, Baeldung.

2. https://docs.gradle.org/1.0/release-notes.html#powerful-dependency-management

3. https://software.ac.uk/sites/default/files/SSI-SoftwareEvaluationCriteria.pdf, novembre 2011, Sofware Sustainability Institute.

4. https://www.jrebel.com/blog/java-build-tools-comparison, 21 août 2014, JRebel.

5. https://www.codeflow.site/fr/article/ant-maven-gradle.

6. https://www.drdobbs.com/jvm/why-build-your-java-projects-with-gradle/240168608, 8 juillet 2014, Benjamin Muschko.

7. https://archive.apache.org/dist/ant/binaries/

8. https://gradle.org/releases/

9. https://trends.google.com/trends/?geo=US

10. https://www.alexa.com/siteinfo

11. https://www.similarweb.com/
