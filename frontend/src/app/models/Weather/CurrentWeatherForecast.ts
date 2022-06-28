import { Location } from "./WeatherObjects/Location";
import { WeatherForecasts } from "./WeatherObjects/WeatherForecasts";

export interface CurrentWeatheForecast{
    location: Location,
    weatherForecasts: WeatherForecasts[]
}