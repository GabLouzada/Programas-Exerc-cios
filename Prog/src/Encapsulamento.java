public class Encapsulamento {
    
    private String configuração = "padrão";
    
    public String getConfiguração(){
        return configuração;

    }
    
    public void setConfiguração(String novaConfiguração){
        configuração = novaConfiguração;
    }
}

    class Componente1{
        void configurarSistema(Encapsulamento configuração){
            System.out.println("Componente 1: Situação atual- " + configuração.getConfiguração());           
        }
    }

    class Componente2{
        void alterarConfiguração(Encapsulamento configuração, String novaConfiguração){
            configuração.setConfiguração(novaConfiguração);
            System.out.println("Componente 2: Foi alterado para- " + configuração.getConfiguração());
        }
    }