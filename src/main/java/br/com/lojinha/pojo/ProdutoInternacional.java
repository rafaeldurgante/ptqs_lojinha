package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public void setValor(double novoValor) {
        if (novoValor > -100) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores do que -100");
        }
    }

    private double taxadeimportacao;

    public double getTaxadeimportacao() {
        return taxadeimportacao;
    }

    public void setTaxadeimportacao(double taxadeimportacao) {
        this.taxadeimportacao = taxadeimportacao;
    }


    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + "e " +  this.getValor();
    }
}
