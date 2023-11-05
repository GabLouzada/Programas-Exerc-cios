interface Bicho {
    void comer();
    void dormir();
    void barulho();
}

class Dog implements Bicho{
    @Override
    public void comer(){
        System.out.println("O cão está comendo!");
    }

    @Override
    public void dormir(){
        System.out.println("O cão está dormindo na casinha!");
    }

    @Override
    public void barulho(){
        System.out.println("O cão está latindo muito!");
    }
}