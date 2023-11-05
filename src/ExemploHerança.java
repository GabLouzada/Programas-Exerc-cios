public class ExemploHerança {
    public static void main(String[] args) {
        Instrumento instrumento = new Instrumento();
        Violao violao = new Violao();
        Piano piano = new Piano();

        instrumento.tocar(); // 
        violao.tocar();      
        piano.tocar();       
    }
}
