import { bootstrapApplication } from '@angular/platform-browser';
import { App } from './app/app';
import { provideHttpClient, withFetch } from '@angular/common/http';

bootstrapApplication(App, {
  providers: [
    provideHttpClient(withFetch()) // HttpClient configurato per fetch API
  ]
}).catch(err => console.error(err));
