package br.com.unisales.veiculos;

import br.com.unisales.Movivel;
import br.com.unisales.model.Veiculo;

public class Bicicleta extends Veiculo implements Movivel {
    private boolean eletrica;

    public Bicicleta(String modelo, int anoFabricacao, double preco, boolean eletrica) {
        super(modelo, anoFabricacao, preco);
        this.eletrica = eletrica;
    }

    public Bicicleta(String modelo, int anoFabricacao, boolean eletrica) {
        super(modelo, anoFabricacao);
        this.eletrica = eletrica;
    }

    public boolean isEletrica() {
        return eletrica;
    }

    public void setEletrica(boolean eletrica) {
        this.eletrica = eletrica;
    }

    @Override
    public void mover() {
        System.out.println("Pedalando a bicicleta: " + getModelo() + " de forma ecológica!");
    }
    
    @Override
    public double getVelocidadeMaxima() {
        return eletrica ? 45.0 : 25.0;
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes da Bicicleta:");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAnoFabricacao());
        System.out.println("Preço: " + getPreco());
        System.out.println("Elétrica: " + isEletrica());
        System.out.println("Tipo de Combustível: " + getTipoCombustivel());
    }

    public void exibirDetalhes(boolean completo) {
        exibirDetalhes();
        if (completo) {
            System.out.println("Perfeita para o meio ambiente!");
        }
    }

    @Override
    public String getTipoCombustivel() {
        return eletrica ? "Bateria" : "Nenhum (força humana)";
    }
}
