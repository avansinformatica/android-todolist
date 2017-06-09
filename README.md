# Android ToDoList app
Deze app maakt gebruik van de  [node-mysql-todolist backend](https://github.com/avansinformatica/node-mysql-todolist).

## Static Code Analysis met SonarQube
Er is een configuratie voor static code analysis met behulp van [SonarQube](https://sonarqube.com/organizations/avansinformaticabreda/projects). Deze anayse geeft je inzicht in de kwaliteit van je code.

De analyse wordt nog op je lokale machine uitgevoerd en daarna automatisch online gezet. Je moet de analyse dus nog handmatig triggeren. Hierbij wordt gebruik gemaakt van een plugin in [Gradle](http://www.gradle.com/). Je analyse is te zien op [sonarcloud.io](http://www.sonarcloud.io), de cloud-based portal van SonarQube. 

### Configuratie
Om de gegenereerde analyse online op Sonarqube inzichtelijk te maken moet je de koppeling maken tussen jouw Android project en je SonarQube account. Hiervoor moet je een aantal properties configureren. Die vind je in het bestand `gradle.properties`.

De properties komen overeen met de instellingen van jouw account op sonarcloud.io. Doe daarvoor het volgende:

- Maak een account op [sonarcloud.io](http://www.sonarcloud.io). Inloggen kan met je GitHub account. Rechtsboven in het venster ga je naar jouw account.
- Default, als je met GitHub inlogt, is er een organisation met de naam 'jouwaccount-github'. Vul deze in bij . Als je dat wilt kun je ook een nieuwe organisation toevoegen.
- Maak in je account, onder de tab 'Security', een token. Bewaar dat token tijdelijk; je vult het strak 

### Analyse uitvoeren
Om een analyse uit te voeren en naar SonarQube te publiceren:

```
gradle sonarqube
```

