import { Component, OnInit } from '@angular/core';
import { VeiculoService } from "../../services/veiculo.service";
import { Veiculo } from "../../models/veiculo";

@Component({
  selector: 'app-cadastrar-veiculo',
  templateUrl: './cadastrar-veiculo.component.html',
  styleUrls: ['./cadastrar-veiculo.component.css']
})
export class CadastrarVeiculoComponent implements OnInit {

  veiculo: Veiculo = new Veiculo();
  submitted = false;

  constructor(private veiculoService: VeiculoService) { }

  ngOnInit() {
  }

  newEmployee(): void {
    this.submitted = false;
    this.veiculo = new Veiculo();
  }

  save() {
    this.veiculoService.createVeiculo(this.veiculo)
      .subscribe(data => console.log(data), error => console.log(error));
    this.veiculo = new Veiculo();
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }

}
