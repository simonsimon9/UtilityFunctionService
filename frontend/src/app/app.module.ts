import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


import { AppComponent } from './app.component';
import { UrlInputComponent } from './components/url-input/url-input.component';
import { TinyurlOutputComponent } from './components/tinyurl-output/tinyurl-output.component';
import { HeaderComponent } from './components/header/header.component';
import { UrlshortnerComponent } from './components/urlshortner/urlshortner.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { ClipboardModule } from 'ngx-clipboard';

@NgModule({
  declarations: [
    AppComponent,
    UrlInputComponent,
    TinyurlOutputComponent,
    HeaderComponent,
    UrlshortnerComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    NgbModule,
    ClipboardModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
