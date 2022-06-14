import {  HostListener, Injectable, OnChanges, SimpleChanges } from '@angular/core';
import { EventEmitter } from '@angular/core';
// This is the service.
@Injectable({
    providedIn: 'root'
  })
export class CalculatorService implements OnChanges{
private calculation  = "";

public calcUpdated: EventEmitter<string> = new EventEmitter();
    constructor() {
        
        document.addEventListener('keydown', (e)=>{
            
            switch(e.key){
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0':
                case '*':
                case '+':
                case '-':
                case '/':
                case 'Escape':
                case 'Backspace':
                case 'Delete':
                    this.setScreen(e.key);
            }
        })
    }
    


    setScreen(val:string) : void {

        if(val === 'Escape' || val === 'Delete' || val ==='Backspace' || val==='Clear'){
            this.calculation = "";
        }
         else{
            this.calculation += val;
        }
        
       this.calcUpdated.emit(this.calculation);
    }

    ngOnChanges(changes: SimpleChanges): void {
        console.log(changes);
    }
    
}