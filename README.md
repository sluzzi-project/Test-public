# Test-public
Test su esercizi di logica, di programmazione ad oggetti e di creazione chiamate webservice Rest

Il progetto include tutti i 3 test affrontati :
-Fase 1 : Serie di Fibonacci;
-Fase 2 : Programmazione ad oggetti (Student);
-Fase 3 : Progetto Spring boot + chiamate GET/POST webservice REST

N.B. : Solo per comodità ho messo Test Fase 1 e 2 all'interno del progetto Fase 3;

La Fase 1
Creata una classe Java che ha al suo interno un main;
Calcolo del iesimo numero di Fibonacci che ha 1000 cifre;
La classe si trova al percorso :
webserviceRest\src\main\java\it\sluzzi\myti\test\fibonacci\Fibonacci.java
Il Run si esegue come una Java Application;
Se si utilizza un IDE (es. Eclipse), sulla console si vedrà il risultato;

La Fase 2
Creata una classe Java che ha al suo interno un main;
Calcolo età dello studente;
Calcolo media del grado di istruzione dello studente;
La classe si trova al percorso :
webserviceRest\src\main\java\it\sluzzi\myti\test\student\Student.java
Il Run si esegue come una Java Application;
Se si utilizza un IDE (es. Eclipse), sulla console si vedrà il risultato;

La Fase 3
cHo reato un progetto Spring Boot partendo dal link https://start.spring.io/ 
Il progetto generato è di tipo Maven con aggiunta della dipendenza Web sul pom : spring-boot-starter-web);
Test di chiamata GET e POST WS Rest ;
GET restituisce la lista degli studenti;
POST aggiunge un nuovo studente;
Si lancia l'applicazione come Spring Boot App;
La classe Application si trova nel seguente path :
webserviceRest\src\main\java\it\sluzzi\myti\webserviceRest\WebserviceRestApplication.java
Per vedere il risultato della chiamata GET del WS Rest per visualizzare la lista Studenti bisogna aprire il brower a questo link :
http://localhost:8080/students/
Sulla pagina comparirà in formato json la lista degli studenti;
La lista è caricata dal programma;

Per la chiamata POST per aggiungere uno studente bisogna utilizzare un tool che permette di fare questo;
Tool utilizzato : [Postman](https://www.getpostman.com);
Ti permette di immettre l'url e di associargli l' oggetto json (nel body);
Con lo stesso tool si può testare anche la chiamata di GET (lista studenti).


