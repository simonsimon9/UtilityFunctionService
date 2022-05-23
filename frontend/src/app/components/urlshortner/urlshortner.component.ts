import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-urlshortner',
  templateUrl: './urlshortner.component.html',
  styleUrls: ['./urlshortner.component.css']
})
export class UrlshortnerComponent implements OnInit {
  title:string = "underwood help us";
  url!: string;
  constructor() { }

  ngOnInit(): void {
  }

}
