package com.sistemaclientes;

public class ClienteB extends Cliente {
    public ClienteB(String tipoCliente, String nomeCliente, String cpf, String endereco, double limiteCredito, double totalCompras, double totalPagamentos) {
        super(tipoCliente, nomeCliente, cpf, endereco, limiteCredito, totalCompras, totalPagamentos);
    }

    public double limiteCredito = 5000.00;
    public double gatilhoPagtos = 2000.00;
    public int countCompras = 0;

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setCountCompras() {
        if(totalPagametos >= gatilhoPagtos) {
            countCompras = countCompras + 2;
            gatilhoPagtos = gatilhoPagtos + 2000.00;
        }
    }

    public void verificaDesconto() {
        if(countCompras > 0) {
            System.out.println("POSSUI DESCONTO DE 5% PARA " + countCompras + " COMPRAS");
            countCompras = countCompras -1;
        }
    }

}
