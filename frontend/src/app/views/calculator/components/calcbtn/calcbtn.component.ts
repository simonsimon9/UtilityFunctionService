import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'calcbtn',
  templateUrl: './calcbtn.component.html',
  styleUrls: ['./calcbtn.component.css']
})
export class CalcbtnComponent implements OnInit {
  @Input() value : string | undefined;
  constructor() { }

  ngOnInit(): void {
  }

}
