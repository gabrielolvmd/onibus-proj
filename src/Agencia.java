import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import motorista.Motorista;
import onibus.Onibus;
import passageiros.Passageiro;
import trajetos.Trajeto;

public class Agencia {

    public static void vendaPassagem(Onibus onibus, Passageiro passageiro) {
        double valorPassagem = onibus.getValorPassagem();
        int idadePassageiro = passageiro.getIdade();

        if (onibus.getQtdPassageirosAtual() < onibus.getQtdPassageirosSuportada()) {
            if (idadePassageiro >= 60) {
                valorPassagem = valorPassagem / 2;
                onibus.setPassagensMeiasVendidas(1);
                onibus.setTotalArrecadado(valorPassagem);
            } else {
                onibus.setPassagensInteirasVendidas(1);
                onibus.setTotalArrecadado(valorPassagem);
            }
            onibus.adicionaPassageiro(passageiro);
            onibus.setQtdPassageirosAtual(1);

            // COMENTE O CÓDIGO ABAIXO PARA UTILIZAR OS TESTES DO ONIBUS OLIVEIRA(LINHA 84)
            // SEM EXIBIR MUITAS INFORMAÇÕES NO TERMINAL

            // System.out.println("--------------------Passagem emitida com
            // sucesso--------------------");
            // System.out.printf(
            // "INFORMAÇÕES DA PASSAGEM \nÔnibus saindo de %s com destino a %s.
            // \nPassageiro: %s, identidade: %s, idade: %d. \nValor R$%,.2f%n",
            // onibus.getCidadeOrigem(), onibus.getCidadeDestino(), passageiro.getNome(),
            // passageiro.getIdentidade(), passageiro.getIdade(), valorPassagem);
        } else {
            System.out.println("Passagens esgotadas!");
        }
    }

    public static void main(String[] args) throws Exception {

        // ADICIONANDO TRAJETOS E ROTAS DA AGÊNCIA
        Trajeto trajetoJoaoPessoa = new Trajeto("Guarabira", "Joao Pessoa", "Guarabira", 38.90);
        Trajeto trajetoNatal = new Trajeto("Guarabira", "Natal", "Guarabira", 48.50);
        Trajeto trajetoCampina = new Trajeto("Guarabira", "Campina Grande", "Guarabira", 24.70);
        // LISTA CONTENDO OS TRAJETOS OFERECIDOS PELA AGÊNCIA
        Set<Trajeto> trajetosAgencia = Trajeto.trajetosExistentes;

        // ADICIONANDO MOTORISTAS DA EMPRESA
        Motorista carlosAlberto = new Motorista("Carlos Alberto", "025313633", 36);
        Motorista cristianoRonaldo = new Motorista("Cristiano Ronaldo", "013584", 38);
        Motorista neymarJunior = new Motorista("Neymar Júnior", "0101456", 29);
        Motorista ribamar = new Motorista("Ribamar", "02101453", 27);
        Motorista lucasPaqueta = new Motorista("Lucas Paquetá", "1483584", 25);
        // LISTA CONTENDO OS MOTORISTAS DA EMPRESA
        Set<Motorista> motoristasAgencia = Motorista.motoristasExistentes;

        // ADICIONANDO ONIBUS COM SEUS DEVIDOS TRAJETOS
        Onibus onibusOliveira = new Onibus(1423, 47, trajetoJoaoPessoa);
        Onibus onibusRodrigues = new Onibus(1539, 29, trajetoCampina);
        Onibus onibusMedeiros = new Onibus(2589, 59, trajetoNatal);

        // System.out.println(trajetosAgencia);
        // System.out.println(motoristasAgencia);

        // CRIANDO PASSAGEIROS
        Passageiro gabrielOliveira = new Passageiro("Gabriel Oliveira", "01545323", 62);
        Passageiro aliceSilva = new Passageiro("Alice Silva", "02456789", 28);
        Passageiro marcosPereira = new Passageiro("Marcos Pereira", "03467890", 45);
        Passageiro anaSantos = new Passageiro("Ana Santos", "04231234", 35);
        Passageiro luanaLima = new Passageiro("Luana Lima", "05671234", 22);
        Passageiro carlosSouza = new Passageiro("Carlos Souza", "06781234", 40);
        Passageiro juliaFerreira = new Passageiro("Julia Ferreira", "07651234", 30);
        Passageiro pedroMendes = new Passageiro("Pedro Mendes", "08231234", 55);
        Passageiro lauraRibeiro = new Passageiro("Laura Ribeiro", "09781234", 27);
        Passageiro mariaOliveira = new Passageiro("Maria Oliveira", "10111234", 70);
        Passageiro lucasSantana = new Passageiro("Lucas Santana", "11551234", 32);

        /*
         * SIMULANDO TRABALHO DA EMPRESA DE ÔNIBUS COM O ONIBUS OLIVEIRA
         * PARA INICIAR A CORRIDA COM UM ONIBUS É NECESSÁRIO ADICIONAR UM MOTORISTA
         * O MÉTODO iniciaFinalizaViagem() INICIA UMA VIAGEM SE O ONIBUS ESTIVER PARADO
         * E PARA A VIAGEM SE O ONIBUS ESTIVER EM VIAGEM
         */
        onibusOliveira.setMotorista(carlosAlberto);
        vendaPassagem(onibusOliveira, gabrielOliveira);
        vendaPassagem(onibusOliveira, aliceSilva);
        vendaPassagem(onibusOliveira, marcosPereira);
        vendaPassagem(onibusOliveira, anaSantos);
        vendaPassagem(onibusOliveira, luanaLima);
        vendaPassagem(onibusOliveira, carlosSouza);
        vendaPassagem(onibusOliveira, juliaFerreira);
        vendaPassagem(onibusOliveira, pedroMendes);
        vendaPassagem(onibusOliveira, lauraRibeiro);
        vendaPassagem(onibusOliveira, mariaOliveira);
        vendaPassagem(onibusOliveira, lucasSantana);
        onibusOliveira.iniciaFinalizaViagem();
        onibusOliveira.cidadeDePartidaEDestino();
        System.out.println("Número de passageiros: " + onibusOliveira.getQtdPassageirosAtual());
        System.out.println("Valor arrecadado: " + onibusOliveira.getTotalArrecadado());
        System.out.println("Valor da passagem: " + onibusOliveira.getValorPassagem());
        System.out.println("Passagens inteiras: " + onibusOliveira.getPassagensInteirasVendidas());
        System.out.println("Passagens meias: " + onibusOliveira.getPassagensMeiasVendidas());
        System.out.println("Passageiros a bordo: " + onibusOliveira.getPassageirosABordo());

    }

}
