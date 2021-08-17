// 匿名类

public class new05 {
    public static void main(String[] args){

        out neo = new out(99){
            void doing() {
                System.out.println("neo writing:" + x);
            }
        };

        neo.doing();

        // 很明显，此neo并非属于out，而我们并未命名类
        // 称之为匿名类
        // 某类只有一个对象可用

    }
}


class out{
    int x;

    out(int x){
        this.x=x;
    }

    void doing() {
        System.out.println("out:" + x);
    }

}