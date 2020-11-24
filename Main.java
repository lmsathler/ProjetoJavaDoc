package br.newtonpaiva.letstravel;

public class Main {
	public static void main(String[]args) {    
		System.out.println("|=========== Teste Let`s Travel ===========|");
		
		FeedGuia fG = new FeedGuia();
	    fG.setClassificacao(1);
	    fG.setLista("Roteiro 1");
	    System.out.println(fG);
	    
	    Guia g1 = new Guia();
	    g1.setCodGuia(2341);
	    g1.setCredencial(99934003);
	    g1.setNome("João Silva");
	    g1.setIdade(23);
	    g1.setSexo("M");
	    g1.setEndereco("Rua tal, 43 - Rio Verde");
	    g1.setTelefone(33211475);
	    g1.setEmail("guiajoaosilva@gmail.com");
	    g1.setLocalPasseio("Angra dos Reis - RJ");
	    g1.setHabilidades("Lugares incomuns");
	    g1.setSenha("****");
	    System.out.println(g1);
	    
	    PagamentoRoteiro pgRoteiro = new PagamentoRoteiro();
	    pgRoteiro.setFormaPagamento("Cartao de Crédito");
	    pgRoteiro.setCodPagamento(2);
	    System.out.println(pgRoteiro);
	    
	    Pesquisa p1 = new Pesquisa();
	    p1.setCidade("Angra dos Reis");
	    p1.setEstado("RJ");
	    p1.setDataViagem("15/12/2020");
	    p1.setCodRoteiro(9912992);
	    System.out.println(p1);
	    
	    RoteiroPersonalizado rp1 = new RoteiroPersonalizado();
	    rp1.setCodRoteiroPersonalizado(231123320);
	    System.out.println(rp1);
	    
	    Roteiros rt1 = new Roteiros();
	    rt1.setNome("Passeio de Barco");
	    rt1.setMapa("Ilha 1, 2 e 3");
	    rt1.setData("15/12/2020");
	    rt1.setValor(250.00);
	    System.out.println(rt1);
	    
	    Turista t1 = new Turista();
	    t1.setNome("Alberto");
	    t1.setIdade(34);
	    t1.setSexo("M");
	    t1.setEndereco("Rua Atletico, 92");
	    t1.setTelefone(991915544);
	    t1.setEmail("albertoturista@gmail.com");
	    t1.setCadastrar(true);
	    System.out.println(t1);
	    
		
		/*Turista novaPessoa = new Turista("Guilherme", LocalDate.of(1995, 02, 20), "M", "Rua Artur de Castro Cunha, 739",
				999999999, "lzguilhermecp@gmail.com", "*****", "cadastrar");
        

		

        	/*Guia novoGuia = new Guia("João Silva", Date.UTC(1995, 02, 17, 6, 12, 40), "M", "Rua Longe, 999", 888888888, "joaosilvaguia@gmail.com", 
				"*******", 147852369, "Angra dos Reis", 12, "Lugares diferenciados", 963258741);
        
		
		Roteiro novoRoteiro = new Roteiro("Praia", "Angra dos Reis", 254.52, Date.UTC(2020, 05, 23, 02, 22, 41));		*/
		
		
	}
}
