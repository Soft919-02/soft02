package entity;

public class StudentExperiment {
    int seat;
    Experiment e;

    public StudentExperiment(int seat, Experiment e) {
        this.seat = seat;
        this.e = e;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public Experiment getExperiment() {
        return e;
    }

    public void setExperiment(Experiment e) {
        this.e = e;
    }
}
