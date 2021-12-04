package entity;

public class Experiment {
    int eid, tid, rid;
    String name, subject,time;
    int studyTime;
    String seat;
    boolean isShared;
    String phone;

    public Experiment(int eid, int tid, int rid, String name, String subject, String time, int studyTime, String seat, boolean isShared, String phone) {
        this.eid = eid;
        this.tid = tid;
        this.rid = rid;
        this.name = name;
        this.subject = subject;
        this.time = time;
        this.studyTime = studyTime;
        this.seat = seat;
        this.isShared = isShared;
        this.phone = phone;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(int studyTime) {
        this.studyTime = studyTime;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public boolean isShared() {
        return isShared;
    }

    public void setShared(boolean shared) {
        isShared = shared;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
