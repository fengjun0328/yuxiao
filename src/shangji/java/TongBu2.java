public class TongBu2 {
    /*同步延迟加载-使用内部类实现延迟加载*/
    //使用内部类，按需加载，用时加载
    private  static   class   Holder{
        private static TongBu2 tongBu2=new TongBu2();
    }

    //私有构造
    private TongBu2(){}

    public static TongBu2 getTongBu2() {
       return  Holder.tongBu2;
    }
}
