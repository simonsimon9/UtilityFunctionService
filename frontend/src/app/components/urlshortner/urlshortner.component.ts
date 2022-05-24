import { Component, OnInit } from '@angular/core';
import { UrlService } from 'src/app/services/url.service';
import { Url } from 'src/app/Url';

@Component({
  selector: 'app-urlshortner',
  templateUrl: './urlshortner.component.html',
  styleUrls: ['./urlshortner.component.css']
})
export class UrlshortnerComponent implements OnInit {
  title:string = "underwood help us";
  constructor(private urlService: UrlService) { }

  ngOnInit(): void {
  }

  submitUrl(newurl: Url){
    console.log(newurl);
    console.log("in submit url");
    this.urlService.sendUrl(newurl).subscribe();
  }

}