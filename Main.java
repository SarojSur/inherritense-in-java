class Animal{
    void eat(){
        System.out.println("eating...Animal class...eat method");
    }
}

class Lion extends Animal{
    void roar(){
        System.out.println("roaring...Lion class...roar method");
    }
}

class BabyLion extends Lion{
    void weep(){
        System.out.println("weeping...babylion class...weep method");
    }
}

public class Main{
    public static void main(String [] args){
        BabyLion obj=new BabyLion();
        obj.weep();
        obj.roar();
        obj.eat();
    }
}
