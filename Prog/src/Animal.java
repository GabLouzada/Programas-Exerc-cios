public class Animal {
    
    public void Barulho(){
        System.out.println("Os animais fazem barulho.");
    }
}

class Cachorro extends Animal{
    @Override
    public void Barulho(){
        System.out.println("Os cachorros latem.");
    }
}

class Gato extends Animal{
    @Override
    public void Barulho(){
        System.out.println("Os gatos miam.");
    }
}