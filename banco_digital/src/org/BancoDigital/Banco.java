package org.BancoDigital;

import lombok.Data;

@Data
public class Banco {
}

/*
 public class Banco {

    private String nome;
    private List<Conta> contas;

    // Construtor para inicializar a lista de contas
    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    // Métodos para gerenciamento de contas
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void removerConta(Conta conta) {
        contas.remove(conta);
    }

    public Conta buscarContaPorNumero(String numero) {
        for (Conta conta : contas) {
            if (Integer.toString(conta.getNumero()).equals(numero)) {
                return conta;
            }
        }
        return null; // Retorna null se não encontrar a conta com o número especificado
    }
}
*/ 