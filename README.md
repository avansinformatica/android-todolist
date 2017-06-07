# Android ToDoList app
Praat tegen de [node-mysql-todolist backend](https://github.com/avansinformatica/node-mysql-todolist).

## Static Code Analysis met SonarQube
Er is ook een configuratie voor static code analysis met behulp van [SonarQube](https://sonarqube.com/organizations/avansinformaticabreda/projects). Deze anayse geeft je inzicht in de kwaliteit van je code.

De analyse wordt nog op je lokale machine uitgevoerd en daarna automatisch online gezet. Je moet de analyse dus nog handmatig triggeren. Hierbij 
wordt gebruik gemaakt van [Gradle](http://www.gradle.com/).

Om een analyse uit te voeren en naar SonarQube te publiceren:

```
gradle sonarqube
```

Bekijk ook het bestand `gradle.properties`; dat bevat settings voor de analyse en voor de koppeling naar SonarQube online.