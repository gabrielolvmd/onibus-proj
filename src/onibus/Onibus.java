package onibus;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import motorista.Motorista;
import passageiros.Passageiro;
import trajetos.Trajeto;

public class Onibus {

  // IMPLEMENTAR NUMERO DE PASSAGENS MEIAS, INTEIRAS E TOTAL ARRECADADO.
  // AJUSTAR LISTA DE PASSAGEIROS

  int numeracao;
  private int qtdPassageirosSuportada;
  int qtdPassageirosAtual;
  Trajeto trajetoOnibus;
  String motorista;
  public static Set<Passageiro> passageirosABordo = new HashSet<>();
  boolean estaEmViagem = false;
  int passagensMeiasVendidas;
  int passagensInteirasVendidas;
  double totalArrecadado = 0;

  public Onibus(int numeracao, int qtdPassageirosSuportada, Trajeto trajetoOnibus) {
    this.numeracao = numeracao;
    this.qtdPassageirosSuportada = qtdPassageirosSuportada;
    this.trajetoOnibus = trajetoOnibus;
  }

  public void adicionaPassageiro(Passageiro passageiro) {
    passageirosABordo.add(passageiro);
  }

  public static void setPassageirosABordo(Set<Passageiro> passageirosABordo) {
    Onibus.passageirosABordo = passageirosABordo;
  }

  public int getPassagensMeiasVendidas() {
    return passagensMeiasVendidas;
  }

  public void setPassagensMeiasVendidas(int passagensMeiasVendidas) {
    this.passagensMeiasVendidas += passagensMeiasVendidas;
  }

  public int getPassagensInteirasVendidas() {
    return passagensInteirasVendidas;
  }

  public void setPassagensInteirasVendidas(int passagensInteirasVendidas) {
    this.passagensInteirasVendidas += passagensInteirasVendidas;
  }

  public String getTotalArrecadado() {
    DecimalFormat formato = new DecimalFormat("#.00");
    return "R$" + formato.format(this.totalArrecadado);
  }

  public void setTotalArrecadado(double totalArrecadado) {
    this.totalArrecadado += totalArrecadado;
  }

  public double getValorPassagem() {
    return trajetoOnibus.getValorPassagem();
  }

  public void setQtdPassageirosAtual(int passagemAdicionada) {
    this.qtdPassageirosAtual += passagemAdicionada;
  }

  public int getQtdPassageirosAtual() {
    return qtdPassageirosAtual;
  }

  public void setEstaEmViagem(boolean estaEmViagem) {
    this.estaEmViagem = estaEmViagem;
  }

  public boolean estaEmViagem() {
    return estaEmViagem;
  }

  public int getNumeracao() {
    return numeracao;
  }

  public void setNumeracao(int numeracao) {
    this.numeracao = numeracao;
  }

  public int getQtdPassageirosSuportada() {
    return qtdPassageirosSuportada;
  }

  public void getTrajetoOnibus() {
    System.out.println(trajetoOnibus);
  }

  public void setTrajetoOnibus(Trajeto trajetoOnibus) {
    this.trajetoOnibus = trajetoOnibus;
  }

  public String getMotorista() {
    return motorista;
  }

  public void setMotorista(Motorista motorista) {
    this.motorista = motorista.getNome();
  }

  public Set<Passageiro> getPassageirosABordo() {
    return passageirosABordo;
  }

  public String getCidadeOrigem() {
    return this.trajetoOnibus.getCidadeOrigem();
  }

  public String getCidadeDestino() {
    return this.trajetoOnibus.getCidadeDestino();
  }

  public void cidadeDePartidaEDestino() {
    System.out.println(
        "Origem: " + this.trajetoOnibus.getCidadeOrigem() + "\n Destino: " + this.trajetoOnibus.getCidadeDestino());
  }

  public void iniciaFinalizaViagem() {
    if (this.motorista == null) {
      System.out.println("Defina um motorista para a viagem começar.");
    } else {
      setEstaEmViagem(!estaEmViagem);
      System.out.println("Ônibus em viagem com motorista " + this.getMotorista());
    }
  }

  public void obterInformacoesPassagens() {

  }

  public void totalArrecadado() {

  }

}
