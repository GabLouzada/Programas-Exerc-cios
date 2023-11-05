public class Veiculo {

    public void acelerar(){
        System.out.println("O carro está acelerando!");
    }
}

    class Carro extends Veiculo{
        @Override
        public void acelerar(){
            System.out.println("O carro está muito veloz!");
        }
    }

    class Moto extends Veiculo{
        @Override
        public void acelerar(){
            System.out.println("A moto está ultrapassando o carro!");
        }
    }   