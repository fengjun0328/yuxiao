package cn.jboa.pojo;

public class Employee {
    public  int  SN;
    public  int  Position_id;
    public  int  DEPartment_id;
    public  String uname;
    public  String  upassword;
    public  String  status;

    public int getSN() {
        return SN;
    }

    public void setSN(int SN) {
        this.SN = SN;
    }

    public int getPosition_id() {
        return Position_id;
    }

    public void setPosition_id(int position_id) {
        Position_id = position_id;
    }

    public int getDEPartment_id() {
        return DEPartment_id;
    }

    public void setDEPartment_id(int DEPartment_id) {
        this.DEPartment_id = DEPartment_id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
