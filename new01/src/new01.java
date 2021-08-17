// 接口

// 抽象方法的集合

public class new01 {
    public static void main(String[] args){
        ani sth = new ani();
        sth.eat();
        sth.drink(10);
    }

}

interface live{
    abstract void eat();
    abstract void drink(int num);
}

class ani implements live{

    public void eat() {
        System.out.println("eat");
    }

    public void drink(int num) {
        System.out.println("drink: "+num);
    }
}
