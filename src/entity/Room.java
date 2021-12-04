package entity;

public class Room {
    int rid;
    String name, type;
    String seat;//无0好1用2坏3

    public Room(int rid, String name, String type, String seat) {
        this.rid = rid;
        this.name = name;
        this.type = type;
        this.seat = seat;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
