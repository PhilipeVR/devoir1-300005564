
# Your discussion about testing




This is where you should provide a description in
[GitHub Markdown](https://guides.github.com/features/mastering-markdown/)
that clearly describes:

1. how you did the tests,
2. sample outputs from running the tests
3. the table and
4. a discussion of the results.


Réponses

1.	J’ai créé une classe testTime qui a une méthode efficencyAnalysis. Cette méthode créer une instance PointCP et appèle soit getTheta(), getRho(), getX ou getY() et calcule le temps d’exécution pour faire cet action 5000 fois avec une boucle. Celui-ci retourne le temps d’exécution (type long). Dans la méthode main, j’appelle la méthode efficiencyAnalysis et calcule la moyenne de 1000 appelle à cet fonction. La classe testTime permet de calculer la moynne du temps pour l’exécution des 4 méthodes principales. 

2.	
Design 2 :  Average execution time in milliseconds : 0.16521
Design 3: Average execution time in milliseconds : 0.41250400000000004
Design 6: Average execution time in milliseconds : 0.005

3. 

|    Designs     |    getX()          |    getY()                      |    getRho()        |    getTheta()       |
|----------------|--------------------|--------------------------------|--------------------|---------------------|
|    Design 2    |    0.1931533 ms    |    0.19305809999999998   ms    |    0.1665985 ms    |    0.1790988 ms     |
|    Design 3    |    0.1664697 ms    |    0.1683425 ms                |    0.17754 ms      |    0.41491140 ms    |
|    Design 6    |    0.013 ms        |    0.011 ms                    |    0.004 ms        |    0.005 ms         |




4. On peut observer que le design 6 est le plus efficace et le plus rapide. Les résultats des tests démontrent que le fait de calculer à chaque fois (dans le design 2 et 3) la conversion de cartésien à polaire ou polaire à cartésien prend beaucoup de temps.





