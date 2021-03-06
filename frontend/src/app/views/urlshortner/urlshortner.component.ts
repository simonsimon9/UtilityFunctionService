import { Component, OnInit } from '@angular/core';
import { UrlService } from 'src/app/services/url.service';
import { Url } from 'src/app/models/Url';
@Component({
  selector: 'app-urlshortner',
  templateUrl: './urlshortner.component.html',
  styleUrls: ['./urlshortner.component.css']
})
export class UrlshortnerComponent implements OnInit {
  title:string = "URL Shortner Service";
  responseTinyUrl!:string;
  responseOriginalUrl!:string;
  constructor(private urlService: UrlService) { }

  ngOnInit(): void {
  }

  submitUrl(newurl: Url){
    
    console.log("inside submit");
    this.urlService.sendUrl(newurl).subscribe((response)=>{
      console.log(response);
      this.responseTinyUrl = response.tinyurl!;
      this.responseOriginalUrl = response.originalurl!;
    });
  }

}
