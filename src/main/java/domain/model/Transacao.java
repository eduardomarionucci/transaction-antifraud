package domain.model;

import domain.rule.CategoriaTransacao;
import domain.rule.StatusTransacao;
import domain.rule.TipoOperacao;

import java.math.BigDecimal;
import java.util.Date;

public class Transacao {

    private String e2e;
    private BigDecimal amount;
    private Date data;
    private Entidade recebedor;
    private Entidade pagador;
    private TipoOperacao tipoOperacao;
    private CategoriaTransacao categoriaTransacao;
    private StatusTransacao status;





}
