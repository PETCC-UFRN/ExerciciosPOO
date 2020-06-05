import java.time.LocalDate;

public class Emprestimo {
  public LocalDate dataEmprestimo;
  public LocalDate dataDevolucao;
  public boolean renovado;
  
  public Emprestimo(){
    dataEmprestimo = LocalDate.now();
    dataDevolucao = dataEmprestimo.plusDays(14);
    renovado = false;
  }
  public Emprestimo(int diasDeAjuste){
    dataEmprestimo = LocalDate.now().plusDays(diasDeAjuste);
    dataDevolucao = dataEmprestimo.plusDays(14);
    renovado = false;
  }
  public void renovar() throws Exception{
    if (renovado)
      throw new Exception("Empréstimo já foi renovado");
    else {
      dataDevolucao = dataDevolucao.plusDays(14);
      renovado = true;
    }
  }
  public LocalDate getDataEmprestimo(){
    return dataEmprestimo;
  }
  public LocalDate getDataDevolucao(){
    return dataDevolucao;
  }
  public boolean isRenovado(){
    return renovado;
  }
  @Override
  public String toString(){
    return "Data de Devolução: " + dataDevolucao.toString();
  }
}

