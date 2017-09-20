public class NovoContato {
    
    private String nome;
    private String numero;
    
    public NovoContato(){
        System.out.println("Novo contato criado");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("Nome: " + this.nome);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
        System.out.println("Número: " + this.numero);
    }
    
}
