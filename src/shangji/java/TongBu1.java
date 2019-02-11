public class TongBu1 {
    /*同步延迟加载 synchronized块*/
    /*指向自己实例的私有静态引用*/
    private static  TongBu1  tongBu1;
    /*私有的构造方法*/
    private TongBu1(){}

    public static TongBu1 getTongBu1() {
        synchronized(TongBu1.class){
            if(tongBu1==null){
                tongBu1=new TongBu1();
            }
        }
        return tongBu1;
    }
}
