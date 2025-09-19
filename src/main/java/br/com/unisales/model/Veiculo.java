package br.com.unisales.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Data;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class Veiculo {
    private String modelo;
    private int anoFabricacao;
    private double preco;

    public Veiculo(String modelo, int anoFabricacao) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.preco = 0.0;
    }

    public abstract String getTipoCombustivel();
}
