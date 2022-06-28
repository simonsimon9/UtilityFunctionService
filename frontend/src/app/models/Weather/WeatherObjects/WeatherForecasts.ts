import { Rain } from "./Rain";
import { Temperature } from "./Temperature";
import { WeatherState } from "./WeatherState";

export interface WeatherForecasts{
    forecastTime: string,
    rain: Rain,
    temperature: Temperature,
    weatherState: WeatherState
}