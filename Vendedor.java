package Teste_06;


import java.util.*;

class Vendedor {
    private String nome;
    private Map<String, Double> vendasPorMes;

    public Vendedor(String nome) {
        this.nome = nome;
        this.vendasPorMes = new HashMap<>();
    }

    public void adicionarVenda(String mesAno, double valorVenda) {
        vendasPorMes.put(mesAno, valorVenda);
    }

    public double getTotalVendasMes(String mesAno) {
        return vendasPorMes.getOrDefault(mesAno, 0.0);
    }

    public String getNome() {
        return nome;
    }
}


