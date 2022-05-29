import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-tinyurl-output',
  templateUrl: './tinyurl-output.component.html',
  styleUrls: ['./tinyurl-output.component.css']
})
export class TinyurlOutputComponent implements OnInit {
  @Input() tinyurl!: String;
  @Input() originalurl!: String;
  visibility!: String
  constructor() { }

  ngOnInit(): void {
  }

  copy(event: Event){
  
    this.visibility="visible";
    setTimeout(()=>this.myFunction(), 3000);
    
  }

   myFunction(){
    this.visibility= "hidden";
    console.log("help");
  }

}
