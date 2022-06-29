import { Humidity } from "./WeatherObjects/Humidity";
import { Location } from "./WeatherObjects/Location";
import { Rain } from "./WeatherObjects/Rain";
import { Temperature } from "./WeatherObjects/Temperature";
import { Wind } from "./WeatherObjects/Wind";

export interface CurrentWeather{
    temperature: Temperature,
    location: Location,
    rain: Rain,
  
}