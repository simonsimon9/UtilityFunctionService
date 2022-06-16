import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { CalculatorService } from 'src/app/services/calculator.service';
@Component({
  selector: 'calcscreen',
  templateUrl: './calcscreen.component.html',
  styleUrls: ['./calcscreen.component.css']
})
export class CalcscreenComponent implements OnInit {
  public previous: string = "";
  public screen:string = "0";
  subscription: Subscription = new Subscription;
  constructor(private calculatorService: CalculatorService) { 
  }

  ngOnInit(): void {
    this.subscription = this.calculatorService.calcUpdated.subscribe((values)=>{
     console.log(values);
     this.previous= values.previous;
      this.screen = values.current;
    })
  }
   ngOnDestroy(){
     this.subscription.unsubscribe();
   }
}
