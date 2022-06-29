import { Humidity } from "./Humidity";
import { Rain } from "./Rain";
import { Temperature } from "./Temperature";
import { WeatherState } from "./WeatherState";
import { Wind } from "./Wind";

export interface WeatherForecasts{
    forecastTime: string,
    rain: Rain,
    temperature: Temperature,
    weatherState: WeatherState,
    humidity: Humidity,
    wind: Wind

}