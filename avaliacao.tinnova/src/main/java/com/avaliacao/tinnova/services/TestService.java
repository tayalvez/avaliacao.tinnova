package com.avaliacao.tinnova.services;

import com.avaliacao.tinnova.model.Veiculo;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    public double totalEleitores = 1000;
    public double votosValidos = 800;
    public double votosBrancos = 150;
    public double votosNulos = 50;
    int[] vet = {5, 3, 2, 4, 7, 1, 0, 6};
    int aux = 0;
    int i = 0;

    public double percentualValidos() {
        return votosValidos / totalEleitores;
    }
    public double percentualBrancos() {
        return votosBrancos / totalEleitores;
    }
    public double percentualNulos() {
        return votosNulos / totalEleitores;
    }
    public int[] ordenarVetor() {

        for(i = 0; i<5; i++){
            for(int j = 0; j<4; j++){
                if(vet[j] > vet[j + 1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
        return vet;
    }

    public double fatorial(double x) {
        double f = x;
        if(x == 0){
            return 1;
        }
        while (x > 1){
            f = f *(x-1);
            x--;
        }

        return f;
    }



}
