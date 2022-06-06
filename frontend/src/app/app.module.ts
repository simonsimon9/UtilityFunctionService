import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
//angular material
import {MatToolbarModule} from '@angular/material/toolbar';


//components
import { AppComponent } from './app.component';
import { UrlInputComponent } from './components/url-input/url-input.component';
import { TinyurlOutputComponent } from './components/tinyurl-output/tinyurl-output.component';
import { HeaderComponent } from './components/header/header.component';
import { UrlshortnerComponent } from './components/urlshortner/urlshortner.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { ClipboardModule } from 'ngx-clipboard';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './shared/navbar/navbar/navbar.component';

@NgModule({
  declarations: [
    AppComponent,
    UrlInputComponent,
    TinyurlOutputComponent,
    HeaderComponent,
    UrlshortnerComponent,
    NavbarComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    NgbModule,
    ClipboardModule,
    BrowserAnimationsModule,
    MatToolbarModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
