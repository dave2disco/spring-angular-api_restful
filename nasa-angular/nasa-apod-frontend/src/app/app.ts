import { Component, signal } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NasaService } from './services/nasa';
import { SafeUrlPipe } from './pipes/safe-url.pipe';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, SafeUrlPipe], // HttpClientModule non serve più
  templateUrl: './app.html',
  styleUrls: ['./app.css']
})
export class App {
  apod = signal<any>(null);
  title = signal('NASA APOD Randomizer');

  constructor(private nasaService: NasaService) {
    this.loadAPOD();
  }

  loadAPOD() {
    this.nasaService.getRandomAPOD().subscribe({
      next: data => this.apod.set(data),
      error: err => {
        console.error('Errore backend:', err);
        setTimeout(() => this.loadAPOD(), 500);
      }
    });
  }
}
