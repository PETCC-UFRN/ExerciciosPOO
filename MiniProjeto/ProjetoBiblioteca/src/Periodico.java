//Id;Título;Ano;Volume;Número;Assunto;Quantidade;Disponíveis
public class Periodico extends Item {
    private String ano;
    private int volume;
    private int numero;
    private String assunto;

    public Periodico(){/* Empty */}

    @Override
    public void mostrarDetalhes() {
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Quantidade: " + this.getQuantidade());
        System.out.println("Disponíveis: " + this.getDisponiveis());
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
}
