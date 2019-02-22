package cn.jboa.pojo;

public class Claimvoucher {
    public   int  id;
    public   String   name;
    public   String   CREATE_TIME;
    public   String   MODIF_TIME;
    public   String   EVENT;
    public   String   STATUS;
    public   String   TOTAL_ACCOUNT;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(String CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

    public String getMODIF_TIME() {
        return MODIF_TIME;
    }

    public void setMODIF_TIME(String MODIF_TIME) {
        this.MODIF_TIME = MODIF_TIME;
    }

    public String getEVENT() {
        return EVENT;
    }

    public void setEVENT(String EVENT) {
        this.EVENT = EVENT;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getTOTAL_ACCOUNT() {
        return TOTAL_ACCOUNT;
    }

    public void setTOTAL_ACCOUNT(String TOTAL_ACCOUNT) {
        this.TOTAL_ACCOUNT = TOTAL_ACCOUNT;
    }
}
