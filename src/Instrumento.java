public class Instrumento {
    void tocar() {
        System.out.println("Tocando um instrumento musical.");
    }
}

class Violao extends Instrumento {
    void tocar() {
        System.out.println("Tocando um violão.");
    }
}

class Piano extends Instrumento {
    void tocar() {
        System.out.println("Tocando um piano.");
    }
}
