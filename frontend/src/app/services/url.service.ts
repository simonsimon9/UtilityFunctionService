import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { Url } from '../Url';
import { environment } from 'src/environments/environment';
const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
  })
}
@Injectable({
  providedIn: 'root'
})
export class UrlService {
  private apiUrl = environment.backendurl;

  constructor(private myHttpRequest:HttpClient) { }

  sendUrl(url: Url):Observable<Url>{
    console.log('send to back end');
    return this.myHttpRequest.post<Url>(`${this.apiUrl}/post`,url, httpOptions);
  }
}
