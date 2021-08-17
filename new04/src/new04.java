public class new04 {
    public static void main(String[] args){

        // 直接访问内部类对象不可行
        // 创建内部类对象

        out.in inner = new out(100,80).new in(99);
        inner.doing();

        // 本质上是创建匿名out，以此创建



    }

}

class out{
    int x;
    in inner;

    class in{
        int y;
        in(int num){
            this.y = num;
        }
        void doing(){
            System.out.println("in out: "+x);
        }
    }

    out(int x,int y){
        this.x=x;
        this.inner = new in(y);
    }

    void doing(){
        System.out.println("out:"+x);
        System.out.println(this.inner.y);
        this.inner.doing();
    }


}

