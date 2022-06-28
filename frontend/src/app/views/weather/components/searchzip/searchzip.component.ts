import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { WeatherGetService } from 'src/app/services/weatherGET.service';

@Component({
  selector: 'app-searchzip',
  templateUrl: './searchzip.component.html',
  styleUrls: ['./searchzip.component.css']
})
export class SearchzipComponent implements OnInit {
  zipInput: string = "";
  
  
  constructor(private weatherService: WeatherGetService) { }

  ngOnInit(): void {
  }

  onSubmit(){
    console.log("pressed");
    this.weatherService.getWeatherAndForecast(this.zipInput);
  }

}
