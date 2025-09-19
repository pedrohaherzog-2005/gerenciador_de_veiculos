package br.com.unisales;

import java.util.ArrayList;

import br.com.unisales.veiculos.Bicicleta;
import br.com.unisales.veiculos.Carro;

public class Main {
    public static void main(String[] args) {
        // ----- Instâncias usando construtores diferentes (sobrecarga) -----
        // Carros: um usando construtor com preco, outro sem preco
        Carro carro1 = new Carro("Mustang", 2022, 150000.0, 2);
        Carro carro2 = new Carro("Fusca", 1978, 2); // usa construtor sem preco

        // Bicicletas: uma com preco, outra sem preco
        Bicicleta bike1 = new Bicicleta("Mountain Bike", 2020, 2000.0, false);
        Bicicleta bike2 = new Bicicleta("Caloi", 2023, true); // sem preco

        // ----- Polimorfismo: lista de Movivel -----
        ArrayList<Movivel> garagem = new ArrayList<>();
        garagem.add(carro1);
        garagem.add(bike1);
        garagem.add(carro2);
        garagem.add(bike2);

        // ----- Iterar e chamar métodos polimorficamente -----
        System.out.println("=== Simulação de movimento ===");
        for (Movivel m : garagem) {
            m.mover();
            System.out.printf("Velocidade máxima reportada: %.1f km/h%n", m.getVelocidadeMaxima());
            System.out.println();
        }

        // ----- Chamar exibirDetalhes() (sobrecargas) para cada instância -----
        // exibirDetalhes não faz parte de Movivel, então usamos instanceof e cast
        System.out.println("=== Exibindo detalhes (sobrecargas) ===");
        for (Movivel m : garagem) {
            if (m instanceof Carro) {
                Carro c = (Carro) m;
                c.exibirDetalhes();         // versão simples
                c.exibirDetalhes(true);     // versão completa
            } else if (m instanceof Bicicleta) {
                Bicicleta b = (Bicicleta) m;
                b.exibirDetalhes();         // versão simples
                b.exibirDetalhes(true);     // versão completa
            }
            System.out.println();
        }

        // ----- Somar velocidades máximas (polimorfismo via interface) -----
        double somaVelocidades = 0.0;
        for (Movivel m : garagem) {
            somaVelocidades += m.getVelocidadeMaxima();
        }
        System.out.printf("Soma das velocidades máximas da garagem: %.1f km/h%n", somaVelocidades);
    }
}
