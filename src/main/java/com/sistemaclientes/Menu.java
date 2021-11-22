package com.sistemaclientes;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    int opcao;

    //lista as opções de menu no prompt
    public void opcoesMenu() {

        System.out.println("\nDIGITE O VALOR CORRESPONDENTE A UMA OPÇÃO ABAIXO:");
        System.out.println("\n     1 - PARA LISTAR TODOS CLIENTES");
        System.out.println("\n     2 - PARA INFORMAR COMPRA DE UM CLIENTE");
        System.out.println("\n     3 - PARA INFORMAR PAGAMENTO DE UM CLIENTE");
        System.out.println("\n     0 - PARA SAIR");

        //faz a leitura da infomração digitada pelo usuário e armazena na variável
        opcao = scanner.nextInt();

        //executa rotina conforme a opção escolhida pelo usuário
        do{
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    System.out.println("\nVocê escolheu: " + opcao + " - LISTAR TODOS CLIENTES.");
                    System.out.println("\nRELAÇÃO DE CLIENTES CADASTRADOS:");
                    listarClientes();
                    opcoesMenu();
                    break;
                case 2:
                    System.out.println("\nVocê escolheu: " + opcao + " - INFORMAR COMPRA DE UM CLIENTE.");
                    informarCompraCliente();
                    opcoesMenu();
                    break;
                case 3:
                    System.out.println("\nVocê escolheu: " + opcao + " - INFORMAR PAGAMENTO DE UM CLIENTE.");
                    informarPagamentoCliente();
                    opcoesMenu();
                    break;
                default:
                    System.out.println("\nVocê escolheu: " + opcao + " - OPÇÃO INVÁLIDA, TENTE NOVAMENTE.");
            }
        }while (opcao != 0);
        System.out.println("\nVocê escolheu: " + opcao + " - SISTEMA ENCERRADO.");
    }

    //criação de listas para cada tipo de cliente
    static ArrayList<ClienteA> clienteAList = new ArrayList<>();
    static ArrayList<ClienteB> clienteBList = new ArrayList<>();
    static ArrayList<ClienteC> clienteCList = new ArrayList<>();

    //função para adicionar clientes na lista, chamada na classe Main
    public static void addClientes() {
        clienteAList.add(new ClienteA("clienteA", "Pedro","015.186.505-85", "Porto Alegre-RS",0.00, 0.00, 0.00));
        clienteAList.add(new ClienteA("clienteA", "Marta","015.186.505-87", "Porto Alegre-RS",0.00, 0.00, 0.00));
        clienteBList.add(new ClienteB("clienteB","Rose","015.200.505-85", "São Paulo-SP",00.00, 0.00, 0.00));
        clienteCList.add(new ClienteC("clienteC","Renato","015.300.505-85", "Santa Maria-RS",0.00, 0.00, 0.00));
        clienteBList.add(new ClienteB("clienteB","Joana","615.400.005-15", "Vitória-ES",0.00, 0.00, 0.00));
    }

    //função para listar todos os clientes cadastrados
    public static void listarClientes() {
        System.out.println("----------------------------");
        System.out.println("\nCLIENTES DO TIPO -CLIENTEA-:");
        for(int index = 0; index < clienteAList.size(); index++) {
            System.out.println("NOME: " + clienteAList.get(index).getNomeCliente());
            System.out.println("CPF: " + clienteAList.get(index).getCpf());
            System.out.println("ENDEREÇO: " + clienteAList.get(index).getEndereco());
            System.out.println("LIMITE DE CRÉDITO: " + clienteAList.get(index).getLimiteCredito());
            System.out.println("TOTAL DE COMPRAS: " + clienteAList.get(index).getTotalCompras());
            System.out.println("TOTAL DE PAGAMENTOS: " + clienteAList.get(index).getTotalPagametos());
            System.out.println("SALDO DEVEDOR: " + (clienteAList.get(index).getTotalPagametos() - clienteAList.get(index).getTotalCompras()));

            System.out.println("\n");
        }
        System.out.println("----------------------------");

        System.out.println("\nCLIENTES DO TIPO -CLIENTEB-:");
        for(int index = 0; index < clienteBList.size(); index++) {
            System.out.println("NOME: " + clienteBList.get(index).getNomeCliente());
            System.out.println("CPF: " + clienteBList.get(index).getCpf());
            System.out.println("ENDEREÇO: " + clienteBList.get(index).getEndereco());
            System.out.println("LIMITE DE CRÉDITO: " + clienteBList.get(index).getLimiteCredito());
            System.out.println("TOTAL DE COMPRAS: " + clienteBList.get(index).getTotalCompras());
            System.out.println("TOTAL DE PAGAMENTOS: " + clienteBList.get(index).getTotalPagametos());
            System.out.println("SALDO DEVEDOR: " + (clienteBList.get(index).getTotalPagametos() - clienteBList.get(index).getTotalCompras()));
            System.out.println("\n");
        }
        System.out.println("----------------------------");

        System.out.println("\nCLIENTES DO TIPO -CLIENTEC-:");
        for(int index = 0; index < clienteCList.size(); index++) {
            System.out.println("NOME: " + clienteCList.get(index).getNomeCliente());
            System.out.println("CPF: " + clienteCList.get(index).getCpf());
            System.out.println("ENDEREÇO: " + clienteCList.get(index).getEndereco());
            System.out.println("LIMITE DE CRÉDITO: " + clienteCList.get(index).getLimiteCredito());
            System.out.println("TOTAL DE COMPRAS: " + clienteCList.get(index).getTotalCompras());
            System.out.println("TOTAL DE PAGAMENTOS: " + clienteCList.get(index).getTotalPagametos());
            System.out.println("SALDO DEVEDOR: " + (clienteCList.get(index).getTotalPagametos() - clienteCList.get(index).getTotalCompras()));
            System.out.println("\n");
        }
        System.out.println("----------------------------");
    }

    //função para informar a compra de um cliente
    public void informarCompraCliente() {
        System.out.println("\nPARA COMPRA, INFORME O CPF DO CLIENTE (com pontuação e hífen): ");
        String cpfDigitado = scanner.next();

        //retorna dados do cliente com cpf digitado
        Cliente clienteReturn = localizaCliente(cpfDigitado);

        //verifica o tipo de cliente de acordo com o cadastro
        if(clienteReturn.tipoCliente == "clienteA"){
            ClienteA clienteAux = (ClienteA) clienteReturn;
            if(clienteAux.getCpf() != null){
                System.out.println("CLIENTE LOCALIZADO\n");
                System.out.println("TIPO CLIENTE: " + clienteAux.getTipoCliente());
                System.out.println("NOME: " + clienteAux.getNomeCliente());
                System.out.println("CPF: " + clienteAux.getCpf());
                System.out.println("TOTAL DE COMPRAS: " + clienteAux.getTotalCompras());
                System.out.println("TOTAL DE PAGAMENTOS: " + clienteAux.getTotalPagametos());
                System.out.println("\n");

                clienteAux.setCountCompras();
                clienteAux.verificaDesconto();
                System.out.println("INFORME O VALOR DA COMPRA: ");
                double valorCompra = scanner.nextDouble();
                clienteAux.somaCompra(valorCompra);
                clienteAux.addLimiteCredito();

            } else {
                System.out.println("CLIENTE NÃO FOI LOCALIZADO\n");
            }
        }
        if(clienteReturn.tipoCliente == "clienteB"){
            ClienteB clienteAux = (ClienteB) clienteReturn;
            if(clienteReturn.getCpf() != null){
                System.out.println("CLIENTE LOCALIZADO\n");
                System.out.println("TIPO CLIENTE: " + clienteAux.getTipoCliente());
                System.out.println("NOME: " + clienteAux.getNomeCliente());
                System.out.println("CPF: " + clienteAux.getCpf());
                System.out.println("TOTAL DE COMPRAS: " + clienteAux.getTotalCompras());
                System.out.println("TOTAL DE PAGAMENTOS: " + clienteAux.getTotalPagametos());
                System.out.println("\n");

                clienteAux.setCountCompras();
                clienteAux.verificaDesconto();
                System.out.println("INFORME O VALOR DA COMPRA: ");
                double valorCompra = scanner.nextDouble();
                clienteReturn.somaCompra(valorCompra);
            } else {
                System.out.println("CLIENTE NÃO FOI LOCALIZADO\n");
            }
        }
        if(clienteReturn.tipoCliente == "clienteC") {
            ClienteC clienteAux = (ClienteC) clienteReturn;
            if(clienteReturn.getCpf() != null){
                System.out.println("CLIENTE LOCALIZADO\n");
                System.out.println("TIPO CLIENTE: " + clienteAux.getTipoCliente());
                System.out.println("NOME: " + clienteAux.getNomeCliente());
                System.out.println("CPF: " + clienteAux.getCpf());
                System.out.println("TOTAL DE COMPRAS: " + clienteAux.getTotalCompras());
                System.out.println("TOTAL DE PAGAMENTOS: " + clienteAux.getTotalPagametos());
                System.out.println("\n");

                System.out.println("INFORME O VALOR DA COMPRA: ");
                double valorCompra = scanner.nextDouble();
                clienteReturn.somaCompra(valorCompra);


            } else {
                System.out.println("CLIENTE NÃO FOI LOCALIZADO\n");
            }
        }

    }

    //função para informar pagamento
    public void informarPagamentoCliente() {
        System.out.println("\n PARA PAGAMENTO, INFORME O CPF DO CLIENTE (com pontuação e hífen): ");
        String cpfDigitado = scanner.next();
        //retorna dados do cliente com cpf digitado
        Cliente clienteReturn = localizaCliente(cpfDigitado);
        if(clienteReturn.getCpf() != null){
            System.out.println("CLIENTE LOCALIZADO\n");
            System.out.println("TIPO CLIENTE: " + clienteReturn.getTipoCliente());
            System.out.println("NOME: " + clienteReturn.getNomeCliente());
            System.out.println("CPF: " + clienteReturn.getCpf());
            System.out.println("TOTAL DE COMPRAS: " + clienteReturn.getTotalCompras());
            System.out.println("TOTAL DE PAGAMENTOS: " + clienteReturn.getTotalPagametos());
            System.out.println("\n");

            System.out.println("INFORME O VALOR DO PAGAMENTO: ");
            double vlrPgto = scanner.nextDouble();
            clienteReturn.somaTotalPagamentos(vlrPgto);

        } else {
            System.out.println("CLIENTE NÃO FOI LOCALIZADO\n");
        }
    }

    //função para localizar cliente
    public Cliente localizaCliente(String cpf) {
        Cliente cliente = new Cliente();
        //procura na lista clientesA
        if(cpf != null) {
            int indexA = 0;
            while (cliente.cpf == null && indexA < clienteAList.size()) {
                String cpfLista = clienteAList.get(indexA).getCpf();
                if(cpfLista.equals(cpf)) {
                    cliente = clienteAList.get(indexA);
                }
                indexA++;
            }
        }
        //procura na lista clientesA
        if(cpf != null && cliente.cpf == null) {
            int indexB = 0;
            while (cliente.cpf == null && indexB < clienteBList.size()) {
                String cpfLista = clienteBList.get(indexB).getCpf();
                if(cpfLista.equals(cpf)) {
                    cliente = clienteBList.get(indexB);
                }
                indexB++;
            }
        }
        //procura na lista clientesA
        if(cpf !=null && cliente.getCpf() == null) {
            int indexC = 0;
            while (cliente.cpf == null && indexC < clienteBList.size()) {
                String cpfLista = clienteCList.get(indexC).getCpf();
                if(cpfLista.equals(cpf)) {
                    cliente = clienteCList.get(indexC);
                }
                indexC++;
            }
        }
        return cliente;

    }


}
