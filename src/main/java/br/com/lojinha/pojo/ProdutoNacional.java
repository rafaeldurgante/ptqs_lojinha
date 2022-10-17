package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoNacional extends Produto implements Favorito {

    private double impostoNacional;

    public double getImpostoNacional() {
        return impostoNacional;
    }

    public void setImpostoNacional(double impostoNacional) {
        this.impostoNacional = impostoNacional;
    }

    public ProdutoNacional(String marcaIncial, Tamanho tamanhoInicial) {
        super(marcaIncial, tamanhoInicial);
    }


    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + "e " + this.getValor();
    }
}
