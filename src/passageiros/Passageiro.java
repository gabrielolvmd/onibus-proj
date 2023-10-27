package passageiros;

public class Passageiro {
  String nome;
  String identidade;
  int idade;

  public Passageiro(String nome, String identidade, int idade) {
    this.nome = nome;
    this.identidade = identidade;
    this.idade = idade;
  }

  @Override
  public String toString() {
    return "Passageiro: " + nome + ", identidade: " + identidade + ", idade: " + idade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getIdentidade() {
    return identidade;
  }

  public void setIdentidade(String identidade) {
    this.identidade = identidade;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public boolean acimaDeSessenta() {
    return this.idade >= 60 ? true : false;
  }
}
