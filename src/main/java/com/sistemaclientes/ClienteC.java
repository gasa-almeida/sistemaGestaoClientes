package com.sistemaclientes;

public class ClienteC extends Cliente {
    public ClienteC(String tipoCliente, String nomeCliente,String cpf, String endereco, double limiteCredito, double totalCompras, double totalPagamentos) {
        super(tipoCliente, nomeCliente, cpf, endereco, limiteCredito, totalCompras, totalPagamentos);
    }

    public double limiteCredito = 1000.00;
    public double getLimiteCredito() {
        return limiteCredito;
    }

}
