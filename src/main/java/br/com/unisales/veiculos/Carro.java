package br.com.unisales.veiculos;

import br.com.unisales.Movivel;
import br.com.unisales.model.Veiculo;

public class Carro extends Veiculo implements Movivel {
    private int numeroPortas;

    public Carro(String modelo, int anoFabricacao, double preco, int numeroPortas) {
        super(modelo, anoFabricacao, preco);
        this.numeroPortas = numeroPortas;
    }

    public Carro(String modelo, int anoFabricacao, int numeroPortas) {
        super(modelo, anoFabricacao);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void mover() {
        System.out.println("Dirigindo o carro: " + getModelo() + " a toda velocidade!");
    }

    @Override
    public double getVelocidadeMaxima() {
        return 200.0;
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes do Carro:");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAnoFabricacao());
        System.out.println("Preço: " + getPreco());
        System.out.println("Portas: " + getNumeroPortas());
        System.out.println("Tipo de Combustível: " + getTipoCombustivel());
    }

    public void exibirDetalhes(boolean completo) {
        exibirDetalhes();
        if (completo) {
            System.out.println("Ideal para viagens longas!");
        }
    }

    @Override
    public String getTipoCombustivel() {
        return "Gasolina ou Elétrico";
    }
    
}
