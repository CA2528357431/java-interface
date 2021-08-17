public class new02 {
    public static void main(String[] args){
        live life = new ani();
        life.eat();
        life.drink(11);

        // 接口实例化

        // 抽象类、接口做参数时，都要用这种形式

    }

}

interface live{
    static final int times = 0;
    // static、final可省略
    // 不可改，可调用
    abstract void eat();
    abstract void drink(int num);
}

class ani implements live{

    public void eat() {
        System.out.println("eat: "+times);

    }

    public void drink(int num) {
        System.out.println("drink: "+num);
    }
}

