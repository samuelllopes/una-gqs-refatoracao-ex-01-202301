import java.util.Scanner;

public class Mensagem {
  private static final String SIM = "SIM";
  private static final String NAO = "NAO";
  private static final String MENSAGEM_ERRO = "\nEntrada inválida! Digite SIM ou NAO.";

  public boolean realizaPergunta(Pessoa pessoa, String mensagem) {
    Scanner scanner = new Scanner(System.in);
    for (int contador = 0; contador < 3; contador++) {
      System.out.println(mensagem);
      String resposta = scanner.next().toUpperCase();
      if (resposta.equals(SIM) || resposta.equals(NAO)) {
        return false;
      } else {
        System.out.println(MENSAGEM_ERRO);
      }
    }
    return true;
  }

  public boolean realizaPerguntaVacinaEmDia(Pessoa pessoa) {
    return realizaPergunta(pessoa, "\nSeu cartão de vacina está em dia? Digite SIM ou NAO ?");
  }

  public boolean realizaPerguntaTeveSintomasRecentemente(Pessoa pessoa) {
    String mensagem = "\nTeve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe)" +
        "Digite SIM ou NAO.";
    return realizaPergunta(pessoa, mensagem);
  }

  public boolean realizaPerguntaTeveContatoPessoasSintomaticas(Pessoa pessoa) {
    String mensagem = "\nTeve contato com pessoas com sintomas gripais nos últimos dias?" +
        "Digite SIM ou NAO.";
    return realizaPergunta(pessoa, mensagem);
  }

  public boolean realizaPerguntaEstaRetornandoViagemExterior(Pessoa pessoa) {
    String mensagem = "\nEstá retornando de viagem ao exterior? Digite SIM ou NAO.";
    return realizaPergunta(pessoa, mensagem);
  }

  public void imprimirRelatorioFinal(Pessoa pessoa) {
    System.out.println("\nNome: " + pessoa.nome);
    System.out.println("Idade: " + pessoa.idade + " anos");
    System.out.println("Cartão Vacinal em Dia: " + pessoa.cartaoVacinaEmDia);
    System.out.println("Teve sintomas recentemente: " + pessoa.teveSintomasRecentemente);
    System.out.println("Teve contato com pessoas infectadas: " + pessoa.teveContatoComPessoasSintomaticas);
    System.out.println("Está retornando de viagem: " + pessoa.estaRetornandoViagem);
    System.out.println("Porcentagem infecção: " + pessoa.porcentagemInfeccao);
    System.out.println("Orientação Final: " + pessoa.orientacaoFinal);
  }

  public void imprimirMensagemErro() {
    System.out.println("Não foi possível realizar a operação. Por favor, tente novamente.");
  }

public boolean realizaPerguntaTeveSintomasRecenmente(Pessoa pessoa, Scanner scanner) {
	return false;
}

public boolean realizaPerguntaTeveContatoPessoasAssintomaticas(Pessoa pessoa, Scanner scanner) {
	return false;
}
}
