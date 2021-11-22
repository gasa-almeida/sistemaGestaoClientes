package com.sistemaclientes;

public class Main {

    public static Menu menu = new Menu();
    public static void main(String[] args) {

        System.out.println("SISTEMA GESTÃO DE CLIENTES");
        //chama a função para adicionar clientes;
        menu.addClientes();
        System.out.println("\nCLIENTES CADASTRADOS");
        //chama a função para listar as opções de menu
        menu.opcoesMenu();
    }
}
