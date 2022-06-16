import {  HostListener, Injectable, OnChanges, SimpleChanges } from '@angular/core';
import { EventEmitter } from '@angular/core';
import { CalculatorPOSTService } from './calculatorPOST.service';
// This is the service.
@Injectable({
    providedIn: 'root'
  })
export class CalculatorService implements OnChanges{
private calculation: string ="0";

public calcUpdated: EventEmitter<string> = new EventEmitter();

    constructor(private calculatorPostService: CalculatorPOSTService) {
        
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
        console.log("HERE IS STRING BEFORE: " + this.calculation);
        if(val === 'Escape' || val === 'Delete' || val ==='Backspace' || val==='Clear'){
            this.calculation = "0";
        }else if(val==="="){
            //send to backend
            this.calculatorPostService.sendCalculation(this.calculation).subscribe(result=>{
                console.log("what did i get back");
                console.log(result);
            })
        }
         else{
            if(this.calculation==="0"){
                this.calculation = val;
            }else{
                this.calculation += val;

            }
        }
        
       this.calcUpdated.emit(this.calculation);
       console.log("HERE IS STRING After: " + this.calculation);

    }

    ngOnChanges(changes: SimpleChanges): void {
        console.log(changes);
    }
    
}