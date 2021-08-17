// 内部类

// 可调用out的资源


public class new03 {
    public static void main(String[] args){

        out sth = new out(100,90);
        sth.doing();


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
