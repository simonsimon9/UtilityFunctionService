import {  HostListener, Injectable, OnChanges, SimpleChanges } from '@angular/core';
import { EventEmitter } from '@angular/core';
import { CalcScreen } from '../CalcScreen';
import { CalculatorPOSTService } from './calculatorPOST.service';
// This is the service.
@Injectable({
    providedIn: 'root'
  })
export class CalculatorService {
private calculation: string ="0";
private previousCalculation: string = "";

public calcUpdated: EventEmitter<CalcScreen> = new EventEmitter();

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
                this.previousCalculation = this.calculation +  " = " + result;
                this.calculation = String(result);
                console.log("result"+ this.previousCalculation);
                let emitData: CalcScreen =  {
                    previous: this.previousCalculation,
                    current: this.calculation
                };
                this.calcUpdated.emit(emitData);
            },error=>{
                this.previousCalculation = this.calculation + " = " + " invalid";
                this.calculation = "0";
                console.log("inside error");
                console.log(error);
                let emitData: CalcScreen =  {
                    previous: this.previousCalculation,
                    current: this.calculation
                };
                this.calcUpdated.emit(emitData);
            })
        }
         else{
            if(this.calculation==="0"){
                if(val === "+" || val === "-" || val === "/" || val==="-" || val ==="."){
                    this.calculation += val;
                }else{
                    this.calculation = val;
                }
            }else{
                this.calculation += val;

            }
        }
        let emitData: CalcScreen =  {
            previous: this.previousCalculation,
            current: this.calculation
        };
       this.calcUpdated.emit(emitData);
       console.log("HERE IS STRING After: " + this.calculation);

    }

    
    
}