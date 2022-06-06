import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
//angular material
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';

//components
import { AppComponent } from './app.component';
import { UrlInputComponent } from './views/urlshortner/components/url-input/url-input.component';
import { TinyurlOutputComponent } from './views/urlshortner/components/tinyurl-output/tinyurl-output.component';
import { HeaderComponent } from './shared/header/header.component';
import { UrlshortnerComponent } from './views/urlshortner/urlshortner.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { ClipboardModule } from 'ngx-clipboard';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MainNavComponent } from './shared/main-nav/main-nav.component';
import { LayoutModule } from '@angular/cdk/layout';
import { MatButtonModule } from '@angular/material/button';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatListModule } from '@angular/material/list';
import { CalculatorComponent } from './views/calculator/calculator.component';
import { WeatherComponent } from './views/weather/weather.component';
import { routing } from './app.routing';
import { RouterModule } from '@angular/router';
@NgModule({
  declarations: [
    AppComponent,
    UrlInputComponent,
    TinyurlOutputComponent,
    HeaderComponent,
    UrlshortnerComponent,
    MainNavComponent,
    CalculatorComponent,
    WeatherComponent
  
  ],
  imports: [
    BrowserModule,
    FormsModule,
    routing,
    HttpClientModule,
    NgbModule,
    ClipboardModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatIconModule,
    LayoutModule,
    MatButtonModule,
    MatSidenavModule,
    MatListModule,
    RouterModule
    
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
