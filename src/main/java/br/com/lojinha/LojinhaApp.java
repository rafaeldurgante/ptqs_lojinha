package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {

    public static void main (String[] args) {
        Produto meuproduto = new Produto("DELL", Tamanho.MEDIO);
        //meuproduto.setMarca("Sony");
        meuproduto.setNome("Notebook");
        meuproduto.setValor(30);
        //meuproduto.setTamanho(Tamanho.GRANDE);


        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItem = new ItemIncluso("cabo de energia", 1);
        ItemIncluso segundoItem = new ItemIncluso("jogos", 3);
        ItemIncluso terceitoItem = new ItemIncluso("controles", 2);

        itensInclusos.add(primeiroItem);
        itensInclusos.add(segundoItem);
        itensInclusos.add(terceitoItem);


        meuproduto.setItensInclusos(itensInclusos);

        System.out.println(meuproduto.getValor());
        System.out.println(meuproduto.getMarca());
        System.out.println(meuproduto.getNome());
        System.out.println(meuproduto.getTamanho());

        for (ItemIncluso itematual: meuproduto.getItensInclusos()) {
            System.out.println(itematual.getNome());
            System.out.println(itematual.getQuantidade());
        }

        ProdutoNacional novoProduto = new ProdutoNacional("YAMAHA", Tamanho.PEQUENO);
        novoProduto.setImpostoNacional(0.55548);
        System.out.println(novoProduto.getImpostoNacional());
        System.out.println(novoProduto.getMarca());
        System.out.println(novoProduto.getTamanho());

        ProdutoInternacional newproduct = new ProdutoInternacional("Tesla", Tamanho.GRANDE);
        newproduct.setTaxadeimportacao(5.6588);
        newproduct.setValor(-99.999999);
        System.out.println(newproduct.getTaxadeimportacao());
        System.out.println(newproduct.getMarca());
        System.out.println(newproduct.getTamanho());
        System.out.println(newproduct.getValor());
        /*
        System.out.println(meuproduto.getItensInclusos().get(0).getNome());
        System.out.println(meuproduto.getItensInclusos().get(0).getQuantidade());
        System.out.println(meuproduto.getItensInclusos().get(1).getNome());
        System.out.println(meuproduto.getItensInclusos().get(1).getQuantidade());
        System.out.println(meuproduto.getItensInclusos().get(2).getNome());
        System.out.println(meuproduto.getItensInclusos().get(2).getQuantidade());






        /*
        System.out.println("Hello World");

        String cargo = "Analista de Qualidade 3";
        System.out.println(cargo);

        int minhaIdade = 38;
        System.out.println(minhaIdade);

        double meuSalario = 8500.50;
        System.out.println(meuSalario);

        String empresa = "WEX";
        System.out.println(empresa);

        boolean empregado = true;
        System.out.println(empregado);
        */



    }
}
