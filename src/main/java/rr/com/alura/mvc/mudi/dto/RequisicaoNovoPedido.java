package rr.com.alura.mvc.mudi.dto;

import javax.validation.constraints.NotBlank;

import br.com.alura.mvc.mudi.model.Pedido;

public class RequisicaoNovoPedido {
// anotação do bean validation 
	@NotBlank
	private String nomeProduto;
	
	@NotBlank
	private String urlProduto;
	
	@NotBlank
	private String urlImagem;
	
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getUrlProduto() {
		return urlProduto;
	}
	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	
	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto(nomeProduto);
		pedido.setDescricao(descricao);
		pedido.setUrlImagem(urlImagem);
		pedido.setUrlProduto(urlProduto);
		
		return pedido;
	}
}
