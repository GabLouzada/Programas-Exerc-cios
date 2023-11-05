public class EncapsulamentoExemplo {
        public static void main(String[] args) {
            Encapsulamento configuração = new Encapsulamento();
            Componente1 componente1 = new Componente1();
            Componente2 componente2 = new Componente2();

            componente1.configurarSistema(configuração);
            componente2.alterarConfiguração(configuração, "Nova configuração");
            componente1.configurarSistema(configuração);
        }
    }