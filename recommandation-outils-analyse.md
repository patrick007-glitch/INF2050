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
Développé originalement par Oliver Burn en 2001 [9], CheckStyle est un outil d'analyse du code et permet d'exposer les écarts par rapport aux conventions établies[1]. Cet outil devient pertinent lorsque plusieurs personnes d'une même équipe travaillent sur le code source. En effet, chacun peut avoir ses propres façons de faire qui sont possiblement différentes de celles de ses co-équipiers. C'est ainsi que cet outil devient particulièrement utile. Il sert à s'assurer que tous utilisent les mêmes conventions et les mêmes façons de faire. L'outil s'assure que le code soit bien formatté, bien standardisé, qu'il suit les bonnes pratiques et qu'il soit de qualité[3]. La version actuellement disponible est 8.31. Il peut être avantageusement incorporé à l'outil de build afin d'inclure systématiquement la détection des écarts du format du code source.



## PMD
PMD, quant à lui, est un outil complémentaire à CheckStyle, FindBugs ou encore SpotBugs. Tous ces outils effectuent des vérifications différentes. PMD se démarque par la détection des mauvaises pratiques de codage en y vérifiant les problèmes potentiels tels que les parties de code non utilisées ou sous-optimales ou encore des expressions inutilement compliquées[2]. La dernière version sortie en mars 2020 est 6.22.0 [4]. Le projet PMD a initialement débuté à l'été 2002. Les concepteurs initiaux David Dixon-Peugh, David Craine and Tom Copeland avaient pour but de remplacer un outil de vérification de code commercial dans un projet du gouvernement américain. Ils ont alors décidé d'écrire leur propre application et ont obtenu l'approbation pour le publier en mode open source[8].



### Critères de comparaison

#### Critère 1 : Utilisation
Quoique CheckStyle et PMD peuvent être fort utiles, ils couvrent néanmoins des domaines d'application différents. En effet, CheckStyle s'occupe principalement des conventions d'écriture. Parmi les éléments vérifiés, il y a, entre autres, une absence ou une mauvaise documentation javadoc, des espaces mal positionnés, le positionnement des parenthèses et des accolades et la longueur des lignes de codes[1]. Pour ce qui est de PMD, l'outil vérifie principalement le code lui-même. On compte parmi les éléments surveillés les blocs try/catch vides, les expressions inutilement compliquées, l'utilisation des expressions "==" et ".equals()", les variables et les importations non utilisées, les boucles et les "if" non nécessaires ainsi que le nom des variables[1].

Comme ces outils ne couvrent pas nécessairement les mêmes éléments et que chacun regarde plutôt divers types de problèmes en utilisant différentes règles[3], ils sont plutôt utilisés en complémentarité. Ainsi, l'équipe de programmation s'assure d'une meilleure standardisation du code ce qui permet une lecture et une maintenabilité plus facile.

De plus, comme ces outils peuvent être intégrés dans l'outil de build, ils sont automatiquement sollicités. Ils peuvent donc servir en outre d'un certain contrôle de la qualité. En effet, un changement dans le code qui provoque aussi un changement dans la détection des "irrégularités" indique potentiellement un problème dont il faut s'occuper ou à tout le moins en être conscient.

Selon certains, l'analyse statique du code devrait occuper une place importante dans l'environment de développement. Il semblerait qu'en suivant son évolution et en réparant les problèmes de qualité du code, on augmente du même coup la qualité de l'application à développer et la possibilité de livrer plus facilement celle-ci à temps [3].

Basé sur tous ces éléments, il serait donc préférable d'utiliser les deux outils en parallèle. Cependant, il est plus facile pour l'oeil humain de détecter les conventions d'écriture. Ajoutons aussi que ce critère peut devenir très subjectif et que le fait d'obtenir une irrégularité dans la convention d'écriture ne provoque pas nécessairement une erreur dans le code. Cependant, si on regarde strictement d'un point de vue de la qualité du code, le meilleur outil serait donc PMD car il permet de faciliter la détection d'éléments plus subtils, potentiellement plus objectifs et ayant une implication plus grande que le simple formatage de celui-ci.



#### Critère 2 : Points forts
Tel que mentionné précédemment, un des points forts de CheckStyle et de PMD est d'obtenir une homogénéité, une standardisation et une certaine qualité du code et de ses conventions d'écriture. Ainsi, tous les membres d'une même équipe doivent s'assurer de coder de la même façon facilitant du même coup la compréhension et la lecture du code mais aussi de sa documentation. Sans être fiable à 100%, on diminue quand même les chances que du mauvais code ou du code non fonctionnel se retrouve en production, ce qui est un net avantage. Aussi, le fait que ces outils puissent être automatisés avec l'outil de build devient extrêmement intéressant. Nul besoin qu'un humain fasse le travail ardu et ennuyeux de faire ces détections. La personne étant en charge de la revue de code peut donc focusser sur ce qui ne peut pas être détecté par ces outils.

De plus, chacun de ces outils ont l'avantage de pouvoir être personnalisés par de multiples règles afin d'éviter d'obtenir une avalanche d'avertissements non pertinents créant ainsi des faux positifs inutiles[3,6,7]. Ce critère devient important puisque si cette situation se produit, les programmeurs courent la chance de mal utiliser leur temps afin de démeler les vrais problèmes cachés à l'intérieur de fausses alertes réduisant ainsi l'efficacité de l'équipe. La confiance envers lesdits outils pourront s'en trouver affectée.

Aussi, pour ajouter aux points forts, PMD utilise une fonctionnalité appelé "copy-paste detector" ou CPD qui permet de détecter si du code est réutilisé dans l'application[1]. En général, on veut éviter d'avoir du code redondant en appliquant le principe DRY (Don’t Repeat Yourself)[8] puisque cela peut être plus difficile à maintenir et peut être source de problèmes.

Par ailleurs, les règles de PMD sont organisées selon huit catégories différentes: les meilleurs pratiques de codage, le style, le design, la documentation, les items fréquemment sujets aux erreur, le Multithreading, la performance et enfin la sécurité [8].

En conclusion pour les points forts, la variété des éléments analysés et le fait de pouvoir personnaliser les règles sont des atouts importants et peuvent s'avérer essentiels. En ce sens, l'outil PMD semble bien adapté et semble aussi obtenir une couverture plus large.



#### Critère 3: Points faibles






{
     With Checkstyle and PMD the rules are more general and style-related so they should only be used with custom configuration files to spare the team from an avalanche of irrelevant feedback
}[6]



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









++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
# General considerations +++++++++++++++++++++++++++++++++++++++++++++++++:
{

     FindBugs is another static code analyzer very similar to PMD.  The biggest difference between PMD and FindBugs is that FindBugs works on byte code, whereas PMD works on source code. FindBugs can find things like:

     – Improper use of .equals() and .hashCode()
     – Unsafe casts
     – When something will always be null
     – Possible StackOverflows
     – Possible ignored exceptions

     There is a lot of overlap between FindBugs and PMD. Because of the limitations of working with byte code or source code, each excels in their own area. They compliment each other, but are not the same thing.

     The ideal static code analyzer would combine PMD, FindBugs and Checkstyle, so all aspects of coding practice could be covered.

     Not only do they enforce project-wide coding standards, but they help prevent buggy code from reaching a critical environment.

}[1]





{
     a weakness of these tools is that they might provide a too extensive list of recommendations, most of which might be irrelevant (and noisy) for developers.

     In summary, if properly used, static analysis tools can provide a useful support during the development process. In other words, the removal of certain warnings before submitting a patch could help reducing the burden during the review process.

     we used tools that do not require the code to compile. For this reason, tools such as FindBugs [13] that require the code to be compiled were not considered in this study.

     Both CheckStyle and PMD are highly configurable tools that help users to enforce the adherence to coding standards by reporting violations to those standards.


}[7]



++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
# CheckStyle +++++++++++++++++++++++++++++++++++++++++++++++++:
{
      It’s not going to stop any rouge exceptions, but it will give feedback on how the code is put together. Checkstyle is useful to ensure java code is being written right. Here are some things Checkstyle will catch:

     Checkstyle is most-different from PMD and FindBugs. While it has checks for things like empty catch blocks and .equals() vs ‘==’, the main focus on the project is ensuring the coding style adheres to a set of conventions.

     Here’s a small snippet of checkstyle being run on Apache Tomcat’s source.  Unfortunately, the project does not come with any XSLT renderers. However, output can be directed into an XML file and a custom renderer could be made.
}[1]





{
     There are basically only a few limits for Checkstyle:

     Java code should be written with ASCII characters only, no UTF-8 support.
     To get valid violations, code have to be compilable, in other case you can get not easy to understand parse errors.
     You cannot determine the type of an expression. Example: "getValue() + getValue2()"
     You cannot determine the full inheritance hierarchy of type.
     You cannot see the content of other files. You have content of one file only during all Checks execution. All files are processed one by one.
     This means that you cannot implement some of the code inspection features that are available in advanced IDEs like Eclipse, IntelliJ IDEA, SpotBugs, Sonarqube.


}[5]


++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
# PMD +++++++++++++++++++++++++++++++++++++++++++++++++:
{
     PMD is an extremely useful tool in analyzing source code. According to the project website, it ‘scans source code and looks for potential problems, possible bugs, unused and suboptimal code, over-complicated expressions and duplicate code’. PMD comes with a huge set of rules that can analyze many different things in java code. To name a few:

     – Empty try/catch blocks

     – Over-complicated expressions

     – Using .equals() instead of ‘==’

     – Unused variables and imports

     – Unnecessary loops and if statements

     – Enforce naming conventions

     Additionally, PMD comes with a copy-paste detector to find blocks of copied and pasted code. Best of all, custom PMD rules are easily written with XPath and a GUI included with the software.[1]

     Out of the box, reports from PMD are transformed with XSLT into HTML reports. A custom XSLT transformation can be written to cater to specific needs.

}[1]



{


     PMD is a source code analyzer that finds common flaws like unused objects, empty blocks, unnecessary catches, incomprehensible namings and so forth. It uses “rulesets” allow you to check your code for almost every wrong language use pattern you can come up with, and copy-paste detection to make it easier for you to follow the best practices of code reuse.

     PMD is a very customizable tool, so the performance and installation outcome really depends on how one has instructed the tool to find problems. PMD has its own built-in rulesets, but it suggests to have your own rulesets relevant to the project, developers and frameworks. Having a framework-related ruleset is actually a good thing, because it helps you find problems that other tools cannot, like framework-specific configuration threats and issues. PMD is like a team-specific automatic code review tool in a sense, as it helps spot problems that a team thinks are important for their project.

     One of the first things we notice about PMD is that it’s somewhat spammy. Source code has a much richer structure, than, for example, a compiled bytecode archive. This means that the rate of false positives when finding code inefficiencies is higher. The solution is to carefully examine rulesets that PMD employes when you run it and limit its output to the most severe cases.
}[3]



{
     When PMD is integrated into the build pipeline, it can act as a quality gate. For example, if rule violations are detected, the build can be failed or the commit can be rejected. This can be used to enforce a specific quality goal. The build pipeline could also be configured to only make sure, that no new rule violations are introduced, so that the code quality doesn’t degrade and hopefully  improves over time.[8]

     There is one other component in PMD, that is often overseen: CPD – the CopyPaste-Detector. This is a separate component, that searches for code duplications in order to follow the DRY principle (Don’t Repeat Yourself).





     GitHub is now the primary location for the source code and the issue tracker.


}[8]
