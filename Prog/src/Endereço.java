public class Endereço {
    private String rua;
    private String cidade;
    private String estado;
    private String cep;

    public Endereço(String rua, String cidade, String estado, String cep){
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;

    }
    
    public String getEndereçoCompleto(){
        return rua + ", " + cidade + ", " + estado + ", " + cep;

    }
}

    class Pessoa {
        private String nome;
        private int idade;
        private Endereço endereço;

        public Pessoa(String nome, int idade, Endereço endereço){
            this.nome = nome;
            this.idade = idade;
            this.endereço = endereço;

        }

        public void exibirInformações(){
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Endereço: " + endereço.getEndereçoCompleto());
        }
    }