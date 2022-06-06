import { ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { CalculatorComponent } from './views/calculator/calculator.component';
import { TinyurlOutputComponent } from './views/urlshortner/components/tinyurl-output/tinyurl-output.component';
import { UrlshortnerComponent } from './views/urlshortner/urlshortner.component';
import { WeatherComponent } from './views/weather/weather.component';
const appRoutes: Routes = [
{ path: 'tinyurl', component: UrlshortnerComponent },
{path:'calculator', component: CalculatorComponent},
{path: 'weather', component: WeatherComponent},

{ path: '', redirectTo: '/tinyurl', pathMatch: 'full' },

];
export const routing: ModuleWithProviders<any> = RouterModule.forRoot(appRoutes);