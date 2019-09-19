# Lloseng

Ce repor contient une copie de [code available to students](https://github.com/TimLethbridge/Lloseng)
Manuel de cours: [Object-Oriented Software Engineering: Practical Software
Development using UML and Java](http://www.site.uottawa.ca/school/research/lloseng/), 2nd Edition, 2004 McGraw Hill.
by [Timothy C. Lethbridge](http://www.eecs.uottawa.ca/~tcl) and
[Robert Laganière](http://www.eecs.uottawa.ca/~laganier).

# LLaboratoire 2 (introduit le devoir 1) – L’Orienté-Objet 

Date de soumission : Sep. 28, 9h30pm. [BrightSpace](https://uottawa.brightspace.com/)
Travaillez en équipes de deux ou individuellement.
Dans le lab 2, vous allez commencer à travailler sur votre devoir 1. Le TA vous expliquera comment débugger un programme, comment préparer votre environment (Eclipse IDE).

Clonez le repo en utilisant la commande suivante:

```
git clone https://github.com/SEG2105-uottawa/SEG2505-Lab2.git
```

## Format

Votre repo doit être nommé: \[prefix\]-\[student-number-1\]_\[student-number-2\], par exemple


```
lab02-1484511_90210901210
```

Lorsque vous avez terminé, soumettez un fichier texte nommé d'après vos numéros d'étudiant (xxxxx_yyyyy.txt).
Par exemple,

```
lab02-1484511_90210901210.txt
```

Incluez les informations suivantes:

* Vos noms et numéros d'étudiant
* Un lien vers votre repo GitHub. 

Votre repo GitHub doit contenir toutes les solutions deu devoir 1,
aucune soumission de solution via BrightSpace ne sera évaluée.
Seules les informations ci-dessus doivent être soumises à BrightSpace.


#### Eclipse
Vous allez utiliser Eclipse dans ce lab. [Instructions on how to get started](http://www.site.uottawa.ca/~mgarz042/SEG2105/assignments/Lab1_Getting_Started.html) 

#### Exercices

Travaillez sur les exercices suivants du manuel. Vous devez rendre
une seule copie des réponses par groupe. Assurez-vous que les noms et les numéros d'étudiants
des deux partenaires sont clairement indiqués. Vous devez travailler sur ces questions
pendant le laboratoire, puis terminez le travail à la maison.

## Analyse de plusieurs designs

1. Prenez 5 minutes pour lire la section 2.9 du manuel du cours, débutant à la page 57.
2. Ce devoir se concentrera sur [PointCP] (/pointcp) se trouvant dans ce repo GitHub,
toutes les instructions seront donc relatives à ce répertoire.

```
cd pointcp
```

Avant d'apporter des modifications, compilez le code et assurez-vous qu'il compile.

```
javac PointCP.java PointCPTest.java
```

Pour éxécuter le programme: 

```
java PointCPTest
```
Vous pouvez bien entendu exécuter les programmes à l'aide de l'IDE Eclipse (ou de votre IDE préféré).

## PointCP

Toutes les modifications doivent être effectuées dans le répertoire `/pointcp`.
En modifiant la version d'origine, implémentez les designs suivantes.

* design 2 (edit code in `/design2` directory)
* design 3 (edit code in `/design3` directory)
* design 6 (edit code in `/design6` directory)

4. Modifiez la classe `PointCPTest` pour vous permettre de tester les designs que vous avez
développés. Faites une série complète de tests pour assurer vos classes
et l'interface fonctionnent correctement.

5. Remplacez [OUTPUT.md](/pointcp/OUTPUT.md) pour fournir clairement une copie
de la sortie générée par vos tests pour chaque design. Clairement
indiquez le design en question. 

Répondez aux exercices suivants dans les fichiers `EXX.md` fournis
en utilisant [GitHub Markdown](https://guides.github.com/features/mastering-markdown/).

* Utilisez le fichier [E26](/pointcp/E26.md) (tableau de ce que vous pensez être les avantages et les inconvénients des designs 2, 3 et 6)
* Utilisez le fichier le fichier [E28](/pointcp/E28.md) (analyse des performances comparant les trois conceptions que vous avez implémentées à la place de Design 1 et Design 5 comme indiqué dans le livre)
* Utilisez le fichier [E29](/pointcp/E29.md) (similaire à E28)
* Utilisez le fichier [E30](/pointcp/E30.md) (similaire à E28)

Pour effectuer cette évaluation vous devez créer des instances
aléatoires pour chaque design et ensuite faire des appels pour chaque méthode (plusieurs
milliers de fois). Finalement, notez le temps pris pour les simulations. Exécutez chaque
version plusieurs fois pour vous assurer que vos résultats sont consistants. Utilisez la
médiane comme résultat et notez la valeur minimale et maximale. 
Voici la description des designs 2,3 et 6 (prise du manuel):

| Design | How cartesian coordinates are computed | How polar coordinates are computed |
| --- | --- | --- |
| Design 2: Store polar coordinates only | Computed on demand, but not stored| Simply returned |
| Design 3: Store cartesian coordinates only | Simply returned | Computed on demand, but not stored |
| Design 6: Interface with designs 2 and 3 as classes implementing it. | Depends on the concrete class used | Depends on the concrete class used |

6. Remplacez le fichier [TESTING.md](/pointcp/TESTING.md) et décrivez clairement

* comment vous avez fait les tests,
* exemples de résultats de l'exécution des tests
* le tableau et
* une discussion des résultats.



## ARRAYS


7. Comparez les performances des tableaux ArrayList, LinkedList et les tableaux ordinaires.
Vous devriez faire une série d'expériences où vous effectuez chacun des tests suivants
avec les trois types de collections, en examinant le temps d’exécution. Vous devez
exécuter chaque cas plusieurs fois sur le même ordinateur pour obtenir des durées
moyennes stables.

* Construisez de très grandes collections en mettant des entiers aléatoires dans
chaque collection, un à la fois. Les floats aléatoires devraient avoir une valeur
comprise entre zéro et 9.0. Vous devez rendre chaque collection suffisamment
grande pour que l'exécution prenne au moins 10 secondes pour ajouter les floats
dans le cas d'une ArrayList. Vous devrez faire des expériences initiales pour
déterminer ce qui est une bonne taille. Vous utiliseriez la même taille de collection
pour ArrayList, LinkedList et le tableau. ArrayList et LinkedList peuvent être créés en
ajoutant successivement des éléments et en leur permettant de grandir, tandis
que le tableau doit être créé à sa taille maximale, puis rempli avec son contenu.
Vous pouvez également essayer d'expérimenter le cas où vous créez initialement
ArrayList et LinkedList avec leur taille maximale.

* Construisez de très grandes collections comme en (a). Utilisez ensuite des
itérateurs pour additionner les éléments. Soustrayez le temps de construction
pour obtenir une mesure du temps nécessaire à l'itération. Utilisez une boucle for
pour le tableau et un itérateur pour le LinkedList et ArrayList.

Présentez vos résultats dans des tableaux appropriés et écrivez vos conclusions. A
partir de vos conclusions, développez des recommandations.
Utilisez le fichier [ARRAY.md](/pointcp/ARRAY.md) 

Vous avez des questions relatives au devoir?
 Veuillez utiliser les forums Piazza!
