import { HttpClient } from '@angular/common/http';
import { Injectable} from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
// This is the service.
@Injectable({
    providedIn: 'root'
  })
export class CalculatorPOSTService{

    private apiUrl = environment.backendurl;

    constructor(private myHttpRequest:HttpClient) {}
    
    sendCalculation(val: string):Observable<any>{
      return this.myHttpRequest.post<any>(`${this.apiUrl}/calc`, val);
    }
   // sendUrl(calculation: any):Observable<any>{
   //     console.log('send to back end');
       // return this.myHttpRequest.post<any>(`${this.apiUrl}/post`,url, httpOptions);
   //   }
    
}