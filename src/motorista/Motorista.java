package motorista;

import java.util.HashSet;
import java.util.Set;

public class Motorista {

  String nome;
  String numeroHabilitacao;
  int idade;

  public static Set<Motorista> motoristasExistentes = new HashSet<>();
  private static Set<String> habilitacoesExistentes = new HashSet<>();

  public String getNome() {
    return nome;
  }

  @Override
  public String toString() {
    return nome + ", Habilitacao: " + numeroHabilitacao + ", idade: " + idade + "\n";
  }

  public Motorista(String nome, String numeroHabilitacao, int idade) {
    if (habilitacoesExistentes.contains(numeroHabilitacao)) {
      System.out.println("Número de habilitação já está em uso.");
    } else {
      this.nome = nome;
      this.numeroHabilitacao = numeroHabilitacao;
      this.idade = idade;
      motoristasExistentes.add(this);
      habilitacoesExistentes.add(numeroHabilitacao);
    }
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNumeroHabilitacao() {
    return numeroHabilitacao;
  }

  public void setNumeroHabilitacao(String numeroHabilitacao) {
    if (numeroHabilitacao.contains(numeroHabilitacao)) {
      System.out.println("Habilitação já existente.");
    } else {
      habilitacoesExistentes.remove(this.numeroHabilitacao);
      this.numeroHabilitacao = numeroHabilitacao;
      habilitacoesExistentes.add(numeroHabilitacao);
    }
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

}
