public class ExemploComposição {
    
    public static void main(String[] args) {
        Endereço endereço = new Endereço("123 main street", "Cidade A", "Estado A", "777666");
        Pessoa pessoa = new Pessoa("Nicão", 19, endereço);

        pessoa.exibirInformações();
    }
}
