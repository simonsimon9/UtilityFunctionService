import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { Url } from 'src/app/Url';

@Component({
  selector: 'app-url-input',
  templateUrl: './url-input.component.html',
  styleUrls: ['./url-input.component.css']
})
export class UrlInputComponent implements OnInit {
  @Output() onSubmitUrl: EventEmitter<Url> = new EventEmitter();

  url: string | undefined;
  
  constructor() { }

  ngOnInit(): void {
  }
  onSubmit(){
    if(!this.url){
      alert('Please add url');
      return;
    }

    const newUrl = {
      originalurl: this.url ,
      tinyurl: undefined,
      userId: undefined
    }
    console.log(newUrl)
    
    //emitter , now in urlshortner.component.html, you can call this emitter by (onSubmitUrl) 
    //this case we will do (onSubmitUrl)="functionName($event)" 
    this.onSubmitUrl.emit(newUrl);
    
  }
}
