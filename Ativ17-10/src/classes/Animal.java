package classes;

public class Animal {

	private String nome;
	private String raca;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public void caminhar() {
		
	}
	private Float comprimento;
	private Integer nPatas;
	private String cor;
	private String ecossistema;
	public Float getComprimento() {
		return comprimento;
	}
	public void setComprimento(Float comprimento) {
		this.comprimento = comprimento;
	}
	public Integer getnPatas() {
		return nPatas;
	}
	public void setnPatas(Integer nPatas) {
		this.nPatas = nPatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getEcossistema() {
		return ecossistema;
	}
	public void setEcossistema(String ecossistema) {
		this.ecossistema = ecossistema;
	}
}
