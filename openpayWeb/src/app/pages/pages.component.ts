import { Component, OnInit } from '@angular/core';
import { MarvelService } from './marvel.service';


@Component({
  selector: 'app-pages',
  templateUrl: './pages.component.html',
  styleUrls: ['./pages.component.css']
})
export class PagesComponent implements OnInit{

  characters:any;
  characterId:any;
  visible!:boolean;
  title!:string;

  constructor(
    private marvelService: MarvelService
  ){

  }
  ngOnInit(): void {
    this.getCharacters();
  }

  async getCharacters(){
    let response = await this.marvelService.getCharacters().toPromise();
    this.characters = response.results;
    console.log(this.characters);
  }

  async verInformacion(id:number){
    this.characterId  = null;
    this.visible= true;
    let response = await this.marvelService.getCharactersById(id).toPromise();
    this.characterId = response.results;
    this.title = this.characterId[0].name;
  }
}
