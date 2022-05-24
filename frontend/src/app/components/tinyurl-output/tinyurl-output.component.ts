import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-tinyurl-output',
  templateUrl: './tinyurl-output.component.html',
  styleUrls: ['./tinyurl-output.component.css']
})
export class TinyurlOutputComponent implements OnInit {
  @Input() tinyurl!: String;
  constructor() { }

  ngOnInit(): void {
  }

}
