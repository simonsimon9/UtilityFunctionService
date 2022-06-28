import { Rain } from "./Rain";
import { Temperature } from "./Temperature";

export interface WeatherForecasts{
    forcastTime: string,
    rain: Rain,
    temperature: Temperature
}