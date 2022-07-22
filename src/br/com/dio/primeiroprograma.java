package br.com.dio;

//ctrl alt o deleta os import que nao estamos utilizando
//alt enter na variavel cria o import automaticamente
//shitf f6 renomeia arquivos

import br.com.dio.model.gatineo;

public class primeiroprograma {
    public static void main(String[] args) {

        gatineo gatineo = new gatineo();

        System.out.println(gatineo);

        Livro livro1 = new Livro("O mistério de Belladona", 500);
        System.out.println(livro1);


       /* int a = 5;
        int b = 8;
        System.out.println("Olá Mundo! " + (a+b));*/

        /*ctrl shift barra comenta varias linhas de uma vez */
        //ctrl barra comenta uma linha por vez
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
