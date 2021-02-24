import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CadastrarVeiculoComponent} from "./components/cadastrar-veiculo/cadastrar-veiculo.component";
import {ListaVeiculosComponent} from "./components/listar-veiculos/lista-veiculos.component";
import {NotFoundComponent} from "./components/not-found/not-found.component";
import {DetalhesVeiculoComponent} from "./components/detalhes-veiculo/detalhes-veiculo.component";
import {EditarVeiculoComponent} from "./components/editar-veiculo/editar-veiculo.component";

const routes: Routes = [
  {
    path:'cadastrar-veiculo',
    component:CadastrarVeiculoComponent
  },
  {
    path:'lista-veiculos',
    component:ListaVeiculosComponent
  },
  {
    path:'',
    component:ListaVeiculosComponent,
    pathMatch:'full'
  },
  {
    path:'**',
    component:NotFoundComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
