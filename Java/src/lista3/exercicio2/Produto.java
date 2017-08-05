package lista3.exercicio2;

public abstract class Produto implements Comparable<Produto> {
	
	private String nome;
	private double preco;
	private String codigoBarras;
	
	public Produto(String nome, double preco, String codigoBarras) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.codigoBarras = codigoBarras;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public abstract String imprimirDados();
	
	@Override
	public boolean equals(Object obj) {
		Produto produto = (Produto) obj;
		return this.codigoBarras.equals(produto.getCodigoBarras());
			}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome : " + this.nome + ", Preço: R$ " + this.preco;
	}

	public int compareTo(Produto arg0) {
		return 0;
	}
	
	

}
