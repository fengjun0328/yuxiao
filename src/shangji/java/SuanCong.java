public class SuanCong {
    /*双重检测*/
    //使用volatile 关键字 放置重排序
    private static  volatile  SuanCong suanCong;

    private SuanCong(){}

    public static SuanCong getSuanCong() {
        if (suanCong==null){
            synchronized (SuanCong.class){
               if(suanCong==null){
                 suanCong=new SuanCong();
               }
            }
        }
        return suanCong;
    }
}
