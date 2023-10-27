package trajetos;

import java.util.HashSet;
import java.util.Set;

public class Trajeto {
  String cidadeOrigem;
  String cidadeDestino;
  String cidadeRetorno;
  double valorPassagem;
  public static Set<Trajeto> trajetosExistentes = new HashSet<>();

  public Trajeto(String cidadeOrigem, String cidadeDestino, String cidadeRetorno, double valorPassagem) {
    this.cidadeOrigem = cidadeOrigem;
    this.cidadeDestino = cidadeDestino;
    this.cidadeRetorno = cidadeRetorno;
    this.valorPassagem = valorPassagem;
    trajetosExistentes.add(this);
  }

  public double getValorPassagem() {
    return valorPassagem;
  }

  @Override
  public String toString() {
    return "Origem: " + cidadeOrigem + ", Destino: " + cidadeDestino + ", Retorno: "
        + cidadeRetorno + "\n";
  }

  public String getCidadeOrigem() {
    return cidadeOrigem;
  }

  public void setCidadeOrigem(String cidadeOrigem) {
    this.cidadeOrigem = cidadeOrigem;
  }

  public String getCidadeDestino() {
    return cidadeDestino;
  }

  public void setCidadeDestino(String cidadeDestino) {
    this.cidadeDestino = cidadeDestino;
  }

  public String getCidadeRetorno() {
    return cidadeRetorno;
  }

  public void setCidadeRetorno(String cidadeRetorno) {
    this.cidadeRetorno = cidadeRetorno;
  }
}
