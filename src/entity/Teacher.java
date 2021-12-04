package entity;

public class Teacher {
    int tid;
    String account,password;

    public Teacher(int tid, String account, String password) {
        this.tid = tid;
        this.account = account;
        this.password = password;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
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
}
