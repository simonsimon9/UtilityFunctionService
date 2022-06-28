import { CurrentWeather } from "./CurrentWeather";
import { WeatherForecasts } from "./WeatherObjects/WeatherForecasts";

export interface WeatherEmit{
    currentWeather: CurrentWeather,
    forecastWeather: WeatherForecasts[]
}