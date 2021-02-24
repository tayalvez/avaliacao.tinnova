import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavigationComponent } from './components/navigation/navigation.component';
import { CadastrarVeiculoComponent } from './components/cadastrar-veiculo/cadastrar-veiculo.component';
import { ListaVeiculosComponent } from './components/listar-veiculos/lista-veiculos.component';
import {Router, RouterModule, Routes} from "@angular/router";
import { NotFoundComponent } from './components/not-found/not-found.component';
import { FormsModule } from '@angular/forms';
import {HttpClientModule} from "@angular/common/http";
import {config} from "rxjs";
import { EditarVeiculoComponent } from './components/editar-veiculo/editar-veiculo.component';
import { DetalhesVeiculoComponent } from './components/detalhes-veiculo/detalhes-veiculo.component';

@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    CadastrarVeiculoComponent,
    ListaVeiculosComponent,
    NotFoundComponent,
    EditarVeiculoComponent,
    DetalhesVeiculoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
