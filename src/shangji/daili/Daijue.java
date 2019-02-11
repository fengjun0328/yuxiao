public class Daijue implements  CouJue{
    private  ZhengJue ZJ;
    public Daijue(Boy bb){
        ZJ=new ZhengJue(bb);
    }

    @Override
    public void getjuese1() {
        ZJ.getjuese1();
    }

    @Override
    public void getjuese2() {
        ZJ.getjuese2();
    }

    @Override
    public void getjuese3() {
        ZJ.getjuese3();
    }
}
