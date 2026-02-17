# NASA Random APOD Viewer

Progetto fullstack che mostra immagini e video casuali dell'**Astronomy Picture of the Day (APOD)** della NASA.  
Frontend in **Angular Standalone**, backend in **Spring Boot (Java)**.

---

## Funzionalità principali

- Visualizza **immagini e video** dell’APOD.
- Mostra **titolo, descrizione e copyright**.
- Bottone **“Visualizza casuale”** per caricare nuovi contenuti.
- Gestione sicura della chiave API lato backend.

## Apri un terminale nella cartella e avvia:
mvnw spring-boot:run

(L’API sarà disponibile su: http://localhost:8080/apod/random)

## Apri un altro terminale nella cartella `nasa-angular/nasa-apod-frontend`:
cd nasa-angular
cd nasa-apod-frontend
npm install
ng serve

(L’app sarà disponibile su: http://localhost:4200)
