import java.util.Scanner;

public class Validacao {
  private Scanner scanner;

  public Validacao() {
    setScanner(new Scanner(System.in));
  }

  public void calcularValidacaoFinal(Pessoa pessoa, Mensagem mensagem, boolean erroTentativas) {
    if (erroTentativas) {
      mensagem.imprimirMensagemErro();
    } else {
      CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
      calculoPorcentagem.calculaPorcentagem(pessoa);

      if (pessoa.estaRetornandoViagem == Mensagem.SIM) {
        mensagem.imprimirRelatorioFinal(pessoa);
      } else {
        if (pessoa.porcentagemInfeccao >= 90) {
          pessoa.orientacaoFinal = "Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado.";
        } else {
          pessoa.orientacaoFinal = "Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.";
        }
        mensagem.imprimirRelatorioFinal(pessoa);
      }
    }
  }

  public void realizarValidacaoDasProximasPerguntas(Mensagem mensagem, Pessoa pessoa, boolean erroTentativas) {
    if (!erroTentativas) {
      erroTentativas = mensagem.realizaPerguntaTeveSintomasRecentemente(pessoa);
    }

    if (!erroTentativas) {
      erroTentativas = mensagem.realizaPerguntaTeveContatoPessoasSintomaticas(pessoa);
    }

    if (!erroTentativas) {
      // erroTentativas = mensagem.realizaPerguntaEstaRetornandoViagemExterior(pessoa);
    }
  }

public Scanner getScanner() {
	return scanner;
}

public void setScanner(Scanner scanner) {
	this.scanner = scanner;
}

public void validacaoDasProximasPerguntas(Mensagem pessoas, Pessoa pesssoa, boolean erroTentativas, Scanner scanner2) {
	// TODO Auto-generated method stub
	
}
}

