## Identification

- Cours      : Outils et pratiques de développement logiciel
- Sigle      : INF2050
- Session    : Hiver 2020
- Groupe     : `<30>`
- Enseignant : `<François-Xavier Guillemette>`
- Auteur     : `<Patrick Chalifour>` (`<CHAP03089503>`) (`<dj991063@ens.uqam.ca>`)
- Auteur     : `<Serban-Costin Ivanescu>` (`<IVAS14069704>`) (`<votre courriel UQAM>`)
- Auteur     : `<Anaïs Yaïci>` (`<YAIA20559707>`) (`<ed691033@ens.uqam.ca>`)
- Auteur     : `<Steve Gordon>` (`<GORS09077601>`) (`<gordon.steve@courrier.uqam.ca>`)


# Comparaison des outils d'analyse statique

## CheckStyle
Développé originalement par Oliver Burn en 2001 [9], CheckStyle est un outil d'analyse du code et permet d'exposer les écarts par rapport aux conventions établies [1]. Cet outil devient pertinent lorsque plusieurs personnes d'une même équipe travaillent sur le code source. En effet, chacun peut avoir ses propres façons de faire qui sont possiblement différentes de celles de ses co-équipiers. C'est ainsi que cet outil devient particulièrement utile. Il sert à s'assurer que tous utilisent les mêmes conventions et les mêmes façons de faire. L'outil s'assure que le code soit bien formatté, bien standardisé, qu'il suit les bonnes pratiques et qu'il soit de qualité [3]. La version actuellement disponible est 8.31. Il peut être avantageusement incorporé à l'outil de build afin d'inclure systématiquement la détection des écarts du format du code source.



## PMD
PMD, quant à lui, est un outil complémentaire à CheckStyle, FindBugs ou encore SpotBugs. Tous ces outils effectuent des vérifications différentes. PMD se démarque par la détection des mauvaises pratiques de codage en y vérifiant les problèmes potentiels tels que les parties de code non utilisées ou sous-optimales ou encore des expressions inutilement compliquées[2]. La dernière version sortie en mars 2020 est 6.22.0 [4]. Le projet PMD a initialement débuté à l'été 2002. Les concepteurs initiaux David Dixon-Peugh, David Craine and Tom Copeland avaient pour but de remplacer un outil de vérification de code commercial dans un projet du gouvernement américain. Ils ont alors décidé d'écrire leur propre application et ont obtenu l'approbation pour le publier en mode open source [8].



### Critères de comparaison

#### Critère 1 : Utilisation
Quoique CheckStyle et PMD peuvent être fort utiles, ils couvrent néanmoins des domaines d'application différents. En effet, CheckStyle s'occupe principalement des conventions d'écriture. Parmi les éléments vérifiés, il y a, entre autres, une absence ou une mauvaise documentation javadoc, des espaces mal positionnés, le positionnement des parenthèses et des accolades et la longueur des lignes de codes [1]. Pour ce qui est de PMD, l'outil vérifie principalement le code lui-même. On compte parmi les éléments surveillés les blocs try/catch vides, les expressions inutilement compliquées, l'utilisation des expressions "==" et ".equals()", les variables et les importations non utilisées, les boucles et les "if" non nécessaires ainsi que le nom des variables [1].

Comme ces outils ne couvrent pas nécessairement les mêmes éléments et que chacun regarde plutôt divers types de problèmes en utilisant différentes règles [3], ils sont plutôt utilisés en complémentarité. Ainsi, l'équipe de programmation s'assure d'une meilleure standardisation du code ce qui permet une lecture et une maintenabilité plus facile.

De plus, comme ces outils peuvent être intégrés dans l'outil de build, ils sont automatiquement sollicités. Ils peuvent donc servir en outre d'un certain contrôle de la qualité. En effet, un changement dans le code qui provoque aussi un changement dans la détection des "irrégularités" indique potentiellement un problème dont il faut s'occuper ou à tout le moins en être conscient.

Selon certains, l'analyse statique du code devrait occuper une place importante dans l'environment de développement. Il semblerait qu'en suivant son évolution et en réparant les problèmes de qualité du code, on augmente du même coup la qualité de l'application à développer et la possibilité de livrer plus facilement celle-ci à temps [3].

Basé sur tous ces éléments, il serait donc préférable d'utiliser les deux outils en parallèle. Cependant, il est plus facile pour l'oeil humain de détecter les conventions d'écriture. Ajoutons aussi que ce critère peut devenir très subjectif et que le fait d'obtenir une irrégularité dans la convention d'écriture ne provoque pas nécessairement une erreur dans le code. Cependant, si on regarde strictement d'un point de vue de la qualité du code, le meilleur outil serait donc PMD car il permet de faciliter la détection d'éléments plus subtils, potentiellement plus objectifs et ayant une implication plus grande que le simple formattage de celui-ci.



#### Critère 2 : Points forts
Tel que mentionné précédemment, un des points forts de CheckStyle et de PMD est d'obtenir une homogénéité, une standardisation et une certaine qualité du code et de ses conventions d'écriture. Ainsi, tous les membres d'une même équipe doivent s'assurer de coder de la même façon facilitant du même coup la compréhension et la lecture du code mais aussi de sa documentation. Sans être fiable à 100%, on diminue quand même les chances que du mauvais code ou du code non fonctionnel se retrouve en production, ce qui est un net avantage. Aussi, le fait que ces outils puissent être automatisés avec l'outil de build devient extrêmement intéressant. Nul besoin qu'un humain fasse le travail ardu et ennuyeux de faire ces détections. La personne étant en charge de la revue de code peut donc focusser sur ce qui ne peut pas être détecté par ces outils.

De plus, chacun de ces outils ont l'avantage de pouvoir être personnalisés par de multiples règles afin d'éviter d'obtenir une avalanche d'avertissements non pertinents créant ainsi des faux positifs inutiles [3,6,7]. Ce critère devient important puisque si cette situation se produit, les programmeurs courent la chance de mal utiliser leur temps afin de démeler les vrais problèmes cachés à l'intérieur de fausses alertes réduisant ainsi l'efficacité de l'équipe. La confiance envers lesdits outils pourront s'en trouver affectée.

Aussi, pour ajouter aux points forts, PMD utilise une fonctionnalité appelé "copy-paste detector" ou CPD qui permet de détecter si du code est réutilisé dans l'application [1]. En général, on veut éviter d'avoir du code redondant en appliquant le principe DRY (Don’t Repeat Yourself) [8] puisque cela peut être plus difficile à maintenir et peut être source de problèmes.

Par ailleurs, les règles de PMD sont organisées selon huit catégories différentes: les meilleurs pratiques de codage, le style, le design, la documentation, les items fréquemment sujets aux erreur, le Multithreading, la performance et enfin la sécurité [8].

En conclusion pour les points forts, la variété des éléments analysés et le fait de pouvoir personnaliser les règles sont des atouts importants et peuvent s'avérer essentiels. En ce sens, l'outil PMD semble bien adapté et semble aussi obtenir une couverture plus large.



#### Critère 3: Points faibles
Comme partout, il y a des avantages mais aussi des inconvénients. Les outils d'analyse statiques ne font pas exceptions à la règle. Comme mentionné précedemment, CheckStyle et PMD ont des règles personnalisables qui comptent parmi les avantages. Cependant, cette personnalisation devient essentielle car ces outils ont des règles générales par défaut qui donnent beaucoup d'avertissements non pertinents et peuvent potentiellement devenir un lourd fardeau [6,7]. Il importe donc d'investir une certaine quantité de temps pour que ces outils apportent un atout majeur plutôt qu'une contrainte ou une limite. Aussi, cette personnalisation peut différer d'un projet à l'autre et doit donc necessiter plus d'investissement de temps ou être vu comme une tâche à être incorporer dans le projet.

De plus, si on voulait réduire le temps investi à configurer les règles qu'utilisent ces outils, on pourrait opter pour l'utilisation d'un seul outil. Cependant, comme chacun de ces outils couvrent des aspects plus spécifiques du code, l'utilisation de l'un ou de l'autre entraîne nécessairement des éléments non pris en charge de façon automatique. Il devient évident que ces outils doivent être incorporés pour une utilisation en parallèle afin de pallier à ces lacunes [1].

Aussi, ces deux outils travaillent sur du code source. Il existe des outils comme FindBugs qui font l'analyse sur du byte code. Ceci amène certains avantages tels que la détection d'une mauvaise utilisation de ".equals()" et ".hashCode()", les conversions de types non sécuritaires, la détection de variables ou objets toujours null et les exceptions possiblement ignorés [1]. Il va sans dire que des options supplémentaires en terme de détection peuvent être un atout que malheureusement CheckStyle et PMD n'ont pas.

À ces points faibles, ajoutons que CheckStyle ne prend en considération que du code Java écrit en ASCII seulement donc sans support UTF-8 et il n'est pas possible de voir le contenu d'autres fichiers puisque chacun est analysé individuellement [5].

En conclusion, il semble que chacun des outils possèdent des points faibles que seuls une bonne configuration des règles d'analyses peuvent atténuer. Ajoutons aussi que leur utilisation en simultané apporte un bénéfice supérieur que lorsqu'utilisé individuellement. D'ailleurs, cetains outils tels que Sonarqube intègrent CheckStyle, PMD et FindBugs [6]. Basé sur ces éléments, il semble que ces outils soient équivalents en terme de points faibles.



### Bibliographie

1.  https://www.sparkred.com/blog/open-source-java-static-code-analyzers/, 12 décembre 2017.

2.  https://www.sw-engineering-candies.com/blog-1/comparison-of-findbugs-pmd-and-checkstyle, Markus Sprunck.

3.  https://www.jrebel.com/blog/static-code-analysis-in-java-guide, 17 avril 2014, JRebel.

4.  https://pmd.github.io

5.  https://checkstyle.sourceforge.io

6.  https://stackoverflow.com/questions/184563/checkstyle-vs-pmd

7.  http://www.veneraarnaoudova.ca/wp-content/uploads/2015/02/2015-SANER-Panichella-et-al-preprint.pdf, février 2015, Sebastiano Panichella.

8.  https://www.datarespons.com/code-quality-assurance-with-pmd/, Andreas Dangel.

9.  https://en.wikipedia.org/wiki/Checkstyle
