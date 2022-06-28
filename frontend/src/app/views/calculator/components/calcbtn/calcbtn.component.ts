import { Component, Input, OnInit } from '@angular/core';
import { CalculatorService } from 'src/app/services/calculator.service';
import { HostListener } from '@angular/core';
import { WeatherGetService } from 'src/app/services/weatherGET.service';
@Component({
  selector: 'calcbtn',
  templateUrl: './calcbtn.component.html',
  styleUrls: ['./calcbtn.component.css']
})
export class CalcbtnComponent implements OnInit {
  
  @Input() value!: string ;
  backgroundColor :string = 'background-color';
  grey:string = '#dadce0';
  blue: string = '#4285f4';
  constructor(private caclulatorService: CalculatorService, private weatherService: WeatherGetService) { }

  ngOnInit(): void {
  }

  getColor(value: string){
    switch(value){
      case "-": 
      case "+": 
      case "*": 
      case "/": return this.grey;
      case "=": return this.blue;
      case "Clear": return this.grey;
    }
    return '#efefef'
  }

  pressedBtn(value:string){
    this.caclulatorService.setScreen(value);
  }

 
}
//"{backgroundColor : value == '=' ? blue : ''}" 