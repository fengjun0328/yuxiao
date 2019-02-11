package GC;

public class Test {
    public static  void main(String[] args){
        KFC kfc=new KFC();
        Foot m=kfc.getFoot("鸡肉");
        Foot C=kfc.getFoot("hanbao");
        try {
            m.get();
            C.get();
        }catch (NullPointerException e){
            System.out.println("无");
        }
    }
}
