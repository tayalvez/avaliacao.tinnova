import { Component, OnInit, Input } from '@angular/core';
import { VeiculoService } from "../../services/veiculo.service";
import { Veiculo } from "../../models/veiculo";
import { ListaVeiculosComponent } from '../listar-veiculos/lista-veiculos.component';

@Component({
  selector: 'app-detalhes-veiculo',
  templateUrl: './detalhes-veiculo.component.html',
  styleUrls: ['./detalhes-veiculo.component.css']
})
export class DetalhesVeiculoComponent implements OnInit {

  @Input() veiculo: Veiculo;

  constructor(private veiculoService: VeiculoService, private listComponent: ListaVeiculosComponent) { }

  ngOnInit() {
  }

  deleteVeiculo(veiculo:Veiculo) {
    this.veiculoService.deleteVeiculo(veiculo.id)
      .subscribe(data => console.log(data), error => console.log(error));
    this.veiculo = new Veiculo();
  }
}
