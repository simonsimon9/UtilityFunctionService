import { Component, OnInit } from '@angular/core';
import { urlModel } from 'src/app/urlmodel';

@Component({
  selector: 'app-url-input',
  templateUrl: './url-input.component.html',
  styleUrls: ['./url-input.component.css']
})
export class UrlInputComponent implements OnInit {
  url: string | undefined;
  submissionurl : urlModel | undefined;
  constructor() { }

  ngOnInit(): void {
  }
  onSubmit(){
    if(!this.url){
      alert('Please add url');
      return;
    }

    const newUrlSubmission ={
      url: this.url,
      userId: null
    }
  }
}
