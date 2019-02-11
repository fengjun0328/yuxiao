public class DanLi {
    /*饿汉单例模式（立刻加载）*/
    /*指向自己的实例的私有静态引用，主动创建*/
    private  static   DanLi   danli= new  DanLi();
    /*私有的构造方法*/
    private   DanLi(){}
    /*以自己的实例返回静态的共有方法，静态工厂方法*/
    public static DanLi getDanli() {
        return danli;
    }
}
