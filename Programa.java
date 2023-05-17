import java.util.Scanner;

class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean erroTentativas = false;
    Pessoa pessoa = new Pessoa();
    Mensagem mensagem = new Mensagem();
    Validacao validacao = new Validacao();

    System.out.println("\tRelatório Auxiliar de Controle de Infecções");

    Object sc = null;
	pessoa.coletaNome(sc);
    pessoa.coletaIdade(sc);

    Pessoa pesssoa = null;
	erroTentativas = mensagem.realizaPerguntaVacinaEmDia(pesssoa);

    Mensagem pessoas = null;
	validacao.validacaoDasProximasPerguntas(pessoas, pesssoa, erroTentativas, scanner);

    Pessoa erroTentativass = null;
	validacao.calcularValidacaoFinal(erroTentativass, pessoas, erroTentativas);

    // scanner.close();
  }
}