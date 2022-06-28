import { HttpClient } from '@angular/common/http';
import {  EventEmitter, Injectable} from '@angular/core';
import { forkJoin, Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { CurrentWeather } from '../models/Weather/CurrentWeather';
import { CurrentWeatheForecast } from '../models/Weather/CurrentWeatherForecast';
import { WeatherEmit } from '../models/Weather/WeatherEmit';
import { WeatherForecasts } from '../models/Weather/WeatherObjects/WeatherForecasts';
// This is the service.
@Injectable({
    providedIn: 'root'
  })
export class WeatherGetService{
    public weatherUpdate: EventEmitter<any> = new EventEmitter();

    private apiUrl = environment.backendurl;

    constructor(private myHttpRequest:HttpClient) {}
    //http://localhost:8080/weather?zip=90001
    getWeatherAndForecast(zip: any){
        forkJoin([
            this.getCurrentWeather(zip),
            this.getForecastWeather(zip)
        ]).subscribe(data=>{
            this.weatherUpdate.emit(data);
        })
    }
    getCurrentWeather(zip : any):Observable<CurrentWeather>{
      return this.myHttpRequest.get<CurrentWeather>(`${this.apiUrl}/weather?zip=${zip}`);
    }

    getForecastWeather(zip: any):Observable<CurrentWeatheForecast>{
        return this.myHttpRequest.get<CurrentWeatheForecast>(`${this.apiUrl}/forecast?zip=${zip}`);

    }
   // sendUrl(calculation: any):Observable<any>{
   //     console.log('send to back end');
       // return this.myHttpRequest.post<any>(`${this.apiUrl}/post`,url, httpOptions);
   //   }
    
}