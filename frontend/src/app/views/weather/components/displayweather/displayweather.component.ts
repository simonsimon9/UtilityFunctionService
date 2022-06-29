import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { CurrentWeather } from 'src/app/models/Weather/CurrentWeather';
import { CurrentWeatheForecast } from 'src/app/models/Weather/CurrentWeatherForecast';
import { WeatherGetService } from 'src/app/services/weatherGET.service';

@Component({
  selector: 'app-displayweather',
  templateUrl: './displayweather.component.html',
  styleUrls: ['./displayweather.component.css']
})
export class DisplayweatherComponent implements OnInit {
  currentWeather!: CurrentWeather;
  currentForecast!: CurrentWeatheForecast;
  subscription: Subscription = new Subscription;

  constructor(private weatherService: WeatherGetService) { }

  ngOnInit(): void {
    this.subscription = this.weatherService.weatherUpdate.subscribe(result=>{
      this.currentWeather = result[0];
      this.currentForecast = result[1];
      console.log(this.currentForecast);
    })
  }

}
