package br.com.projetoTCC.infra.gateways.Produto;

import br.com.projetoTCC.domain.entities.Produto.Produto;
import br.com.projetoTCC.infra.persistence.Produto.ProdutoEntity;

public class ProdutoEntityMapper {

    public ProdutoEntity toEntity (Produto produto){
        return new ProdutoEntity(produto.getNomeProduto(), produto.getCodigo(), produto.getQuantidade(), produto.getValidade(), produto.getObservacoes(), produto.getLote(), produto.getUltimaModificacao());
    }

    public Produto toDomain(ProdutoEntity entity){
        return new Produto(entity.getNomeProduto(), entity.getCodigo(), entity.getQuantidade(), entity.getValidade(), entity.getNomeProduto(), entity.getLote(), entity.getUltimaModificacao() );
    }
}
