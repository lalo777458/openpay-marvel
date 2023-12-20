import { Component, OnInit } from '@angular/core';
import { Bitacora } from '../interfaces/bitacora';
import { BitacoraService } from './bitacora.service';

@Component({
  selector: 'app-bitacora',
  templateUrl: './bitacora.component.html',
  styleUrls: ['./bitacora.component.css']
})
export class BitacoraComponent implements OnInit {

  bitacora!: Bitacora[];

  constructor(private bitacoraService: BitacoraService) {

  }

  ngOnInit(): void {
    this.getBitacora();
  }

  async getBitacora() {
    this.bitacora = await this.bitacoraService.getBitacora().toPromise() || [];
  }


}
