import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { CalculatorService } from 'src/app/services/calculator.service';
@Component({
  selector: 'calcscreen',
  templateUrl: './calcscreen.component.html',
  styleUrls: ['./calcscreen.component.css']
})
export class CalcscreenComponent implements OnInit {
  public screen:string=""
  subscription: Subscription = new Subscription;
  constructor(private calculatorService: CalculatorService) { }

  ngOnInit(): void {
    this.subscription = this.calculatorService.calcUpdated.subscribe((response)=>{
      this.screen = this.calculatorService.getScreen();
    })
  }
   ngOnDestroy(){
     this.subscription.unsubscribe();
   }
}
