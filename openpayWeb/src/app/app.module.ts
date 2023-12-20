import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PagesComponent } from './pages/pages.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { TableModule } from 'primeng/table';
import { HttpClientModule } from '@angular/common/http';
import { ButtonModule } from 'primeng/button';
import { TooltipModule } from 'primeng/tooltip';
import { DialogModule } from 'primeng/dialog';
import { DynamicDialogModule } from 'primeng/dynamicdialog';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ValueOptionsPipePipe } from './pipe/value-options-pipe.pipe';
import { BitacoraComponent } from './bitacora/bitacora.component';
import { HeaderComponent } from './header/header.component';
import { EstructuraComponent } from './estructura/estructura.component';

@NgModule({
  declarations: [
    AppComponent,
    PagesComponent,
    ValueOptionsPipePipe,
    BitacoraComponent,
    HeaderComponent,
    EstructuraComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    HttpClientModule,

    TableModule,
    ButtonModule,
    TooltipModule,
    DialogModule,
    DynamicDialogModule,
    BrowserAnimationsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
