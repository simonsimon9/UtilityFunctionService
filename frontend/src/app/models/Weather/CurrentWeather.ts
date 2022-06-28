import { Location } from "./WeatherObjects/Location";
import { Rain } from "./WeatherObjects/Rain";
import { Temperature } from "./WeatherObjects/Temperature";

export interface CurrentWeather{
    temperature: Temperature,
    location: Location
    rain: Rain
}