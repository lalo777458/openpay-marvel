import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { PagesComponent } from './pages/pages.component';
import { BitacoraComponent } from './bitacora/bitacora.component';
import { AppComponent } from './app.component';
import { EstructuraComponent } from './estructura/estructura.component';

const routes: Routes = [
  {
    path: '', redirectTo: '/marvel', pathMatch: 'full'
  },

  {
    path: '', component: EstructuraComponent,
    children: [
      { path: 'marvel', component: PagesComponent },
      { path: 'bitacora', component: BitacoraComponent }
    ]
  }


];

@NgModule({
  //declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
