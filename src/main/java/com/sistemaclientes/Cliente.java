package com.sistemaclientes;

public class Cliente {
    public Cliente() {}

    public String tipoCliente;
    public String nomeCliente;
    public String cpf;
    public String endereco;
    public double totalCompras;
    public double totalPagametos;


    public Cliente(String tipoCliente, String nomeCliente, String cpf, String endereco, double limiteCredito, double totalCompras, double totalPagametos) {
        this.tipoCliente = tipoCliente;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.endereco = endereco;
        this.totalCompras = totalCompras;
        this.totalPagametos = totalPagametos;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTotalCompras(double totalCompras) {
        this.totalCompras = totalCompras;
    }

    public void setTotalPagamentos(double totalPagametos) {
        this.totalPagametos = totalPagametos;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public String getNomeCliente() {

        return nomeCliente;
    }

    public String getCpf() {

        return cpf;
    }

    public String getEndereco() {

        return endereco;
    }

    public double getTotalCompras() {
        return totalCompras;
    }
    public double getTotalPagametos() {
        return  totalPagametos;
    }

    public void somaCompra(double valorCompra){
        setTotalCompras(totalCompras + valorCompra);
    }

    public void somaTotalPagamentos(double valorPgto) {
        setTotalPagamentos(totalPagametos + valorPgto);
    }

}
