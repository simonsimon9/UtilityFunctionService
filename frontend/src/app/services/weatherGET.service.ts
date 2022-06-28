import { HttpClient } from '@angular/common/http';
import {  Injectable} from '@angular/core';
import { forkJoin, Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { CurrentWeather } from '../models/Weather/CurrentWeather';
import { CurrentWeatheForecast } from '../models/Weather/CurrentWeatherForecast';
import { WeatherForecasts } from '../models/Weather/WeatherObjects/WeatherForecasts';
// This is the service.
@Injectable({
    providedIn: 'root'
  })
export class WeatherGetService{
    currentWeather!: CurrentWeather
    forecastWeather!: CurrentWeatheForecast
    private apiUrl = environment.backendurl;

    constructor(private myHttpRequest:HttpClient) {}
    //http://localhost:8080/weather?zip=90001
    getWeatherAndForecast(zip: any){
        forkJoin([
            this.getCurrentWeather(zip),
            this.getForecastWeather(zip)
        ]).subscribe(data=>{
            this.currentWeather = data[0];
            console.log(this.currentWeather);
            this.forecastWeather = data[1];
            console.log(this.forecastWeather)
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