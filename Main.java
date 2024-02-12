package Teste_06;

import java.util.ArrayList;
import java.util.List;

	
	public class Main {
	    public static Vendedor maisVendeuNoMes(List<Vendedor> vendedores, String mesAno) {
	        Vendedor maisVendido = null;
	        double maiorValor = 0;

	        for (Vendedor vendedor : vendedores) {
	            double valorVenda = vendedor.getTotalVendasMes(mesAno);
	            if (valorVenda > maiorValor) {
	                maiorValor = valorVenda;
	                maisVendido = vendedor;
	            }
	        }

	        return maisVendido;
	    }

	    public static void main(String[] args) {
	        // Criar vendedores e adicionar vendas
	        Vendedor anaSilva = new Vendedor("Ana Silva");
	        anaSilva.adicionarVenda("12/2021", 5200.00);
	        anaSilva.adicionarVenda("01/2022", 4000.00);
	        anaSilva.adicionarVenda("02/2022", 4200.00);
	        anaSilva.adicionarVenda("03/2022", 5850.00);
	        anaSilva.adicionarVenda("04/2022", 7000.00);

	        Vendedor joaoMendes = new Vendedor("João Mendes");
	        joaoMendes.adicionarVenda("12/2021", 3400.00);
	        joaoMendes.adicionarVenda("01/2022", 7700.00);
	        joaoMendes.adicionarVenda("02/2022", 5000.00);
	        joaoMendes.adicionarVenda("03/2022", 5900.00);
	        joaoMendes.adicionarVenda("04/2022", 6500.00);

	        // Criar lista de vendedores
	        List<Vendedor> vendedores = new ArrayList<>();
	        vendedores.add(anaSilva);
	        vendedores.add(joaoMendes);

	        // Calcular e imprimir o vendedor que mais vendeu em um determinado mês
	        String mesAno = "03/2022";
	        Vendedor vendedorMaisVendeu = maisVendeuNoMes(vendedores, mesAno);
	        System.out.println("O vendedor que mais vendeu no mês " + mesAno + " foi: " + vendedorMaisVendeu.getNome());
	    }
	}


