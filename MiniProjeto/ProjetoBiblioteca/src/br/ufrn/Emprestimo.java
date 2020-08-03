package br.ufrn;

import java.time.LocalDate;

public class Emprestimo implements Comparable<Emprestimo> {
  private LocalDate dataEmprestimo;
  private LocalDate dataDevolucao;
  private boolean renovado;
  private Item item;

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

  public void setDataEmprestimo(LocalDate dataEmprestimo) {
    this.dataEmprestimo = dataEmprestimo;
  }

  public void setDataDevolucao(LocalDate dataDevolucao) {
    this.dataDevolucao = dataDevolucao;
  }

  public void setRenovado(boolean renovado) {
    this.renovado = renovado;
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

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  @Override
  public String toString(){
    return "Data de Devolução: " + dataDevolucao.toString();
  }

  @Override
  public int compareTo(Emprestimo emprestimo) {
      if (this.getDataDevolucao() == emprestimo.getDataDevolucao())
        return this.item.getId() - emprestimo.getItem().getId();
      else {
        return this.getDataDevolucao().compareTo(emprestimo.getDataDevolucao());
      }
  }
}

