package com.ultima.pessoas;

public class Responssavel extends Pessoa {
    private boolean[] pagamentos = new boolean[12];

    public Responssavel( String nome) {
        super(nome);
    }
    public boolean pagarMensalidade( int mes , boolean situacao) {
        // TODO IMPLEMENTAR
        return false ;
    }

    public boolean[] getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(boolean[] pagamentos) {
        this.pagamentos = pagamentos;
    }

    @Override  // intertface
    public String verSituacao( int mes) {
        return null;
    }

    @Override
    public String relatorio() {
        return null;
    }
}
