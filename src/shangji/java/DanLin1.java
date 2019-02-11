public class DanLin1 {
    /*懒汉单例模式（延迟加载）*/
    /*指向自己的实例的私有静态引用*/
    private static  DanLin1  danLin1;

    /*私有的构造方法*/
    private DanLin1(){}

    /*以自己的实例返回静态的公共方法，静态工厂*/

    public static DanLin1 getDanLin1() {
        if(danLin1==null){
          danLin1=new DanLin1();
        }
        return danLin1;
    }
}
