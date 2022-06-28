import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { CurrentWeather } from 'src/app/models/Weather/CurrentWeather';
import { CurrentWeatheForecast } from 'src/app/models/Weather/CurrentWeatherForecast';
import { SearchzipComponent } from '../searchzip/searchzip.component';

@Component({
  selector: 'app-displayweather',
  templateUrl: './displayweather.component.html',
  styleUrls: ['./displayweather.component.css']
})
export class DisplayweatherComponent implements OnInit {
  currentWeather!: CurrentWeather;
  currentForecast!: CurrentWeatheForecast;
  subscription: Subscription = new Subscription;

  constructor() { }

  ngOnInit(): void {
   
  }

}
