public class TongBu {
    /*同步延迟加载 synchronized 方法*/
    /*指向自己的实例的私有静态引用*/
    private  static   TongBu   tongbu;
    /*私有的构造方法*/
    private TongBu(){ }
   /*使用synchronized 修饰，临界资源的同步互斥访问*/
    public static synchronized TongBu getTongbu() {
        if(tongbu==null){
            tongbu=new TongBu();
        }
        return tongbu;
    }
}
