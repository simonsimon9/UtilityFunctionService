import { Component, OnInit } from '@angular/core';
import { WeatherGetService } from 'src/app/services/weatherGET.service';

@Component({
  selector: 'app-weather',
  templateUrl: './weather.component.html',
  styleUrls: ['./weather.component.css']
})
export class WeatherComponent implements OnInit {
  title: string = "Weather"
  constructor() { }

  ngOnInit(): void {


  }

}
