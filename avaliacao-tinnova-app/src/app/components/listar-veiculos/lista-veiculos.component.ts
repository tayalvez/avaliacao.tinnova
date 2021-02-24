import { Component, OnInit } from '@angular/core';
import { Observable } from "rxjs";
import { VeiculoService } from "../../services/veiculo.service";
import { Veiculo } from "../../models/veiculo";

@Component({
  selector: 'app-lista-veiculos',
  templateUrl: './lista-veiculos.component.html',
  styleUrls: ['./lista-veiculos.component.css']
})
export class ListaVeiculosComponent implements OnInit {

  veiculos: Observable<Veiculo[]>;

  constructor(private veiculoService: VeiculoService) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.veiculos = this.veiculoService.getVeiculosList();
  }

  deleteVeiculo(id: number) {
    this.veiculoService.deleteVeiculo(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

}
