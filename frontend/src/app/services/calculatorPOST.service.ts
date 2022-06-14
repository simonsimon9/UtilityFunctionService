import { HttpClient } from '@angular/common/http';
import {  HostListener, Injectable, OnChanges, SimpleChanges } from '@angular/core';
import { EventEmitter } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
// This is the service.
@Injectable({
    providedIn: 'root'
  })
export class CalculatorPOSTService{

    private apiUrl = environment.backendurl;

    constructor(private myHttpRequest:HttpClient) {}
      
   // sendUrl(calculation: any):Observable<any>{
   //     console.log('send to back end');
       // return this.myHttpRequest.post<any>(`${this.apiUrl}/post`,url, httpOptions);
   //   }
    
}