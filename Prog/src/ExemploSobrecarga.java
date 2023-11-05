public class ExemploSobrecarga {
    
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        int resultadoInt = calculadora.somar(4, 6);
        double resultadoDouble = calculadora.somar(25, 50);
        String resultadoString = calculadora.somar("Louzadinha, ", "e Nicão!");

        System.out.println("Resultado Inteiro: " + resultadoInt);
        System.out.println("Resultado Double: " + resultadoDouble);
        System.out.println("Resultado String: " + resultadoString);
    }
}
