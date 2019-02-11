public class ZhengJue implements CouJue{
    private Boy boy;
    public ZhengJue(Boy bb){
        this.boy=bb;
    }
    @Override
    public void getjuese1() {
        System.out.println("虚拟角色1");
    }
    @Override
    public void getjuese2() {
        System.out.println("虚拟角色2");
    }
    @Override
    public void getjuese3() {
        System.out.println("虚拟角色3");
    }
}
class  Boy{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
