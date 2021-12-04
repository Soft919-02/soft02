package entity;

public class Student {
    int sid;
    String account,password,clas;

    public Student(int sid, String account, String password, String clas) {
        this.sid = sid;
        this.account = account;
        this.password = password;
        this.clas = clas;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }
}
