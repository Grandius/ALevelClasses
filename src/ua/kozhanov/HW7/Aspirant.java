package ua.kozhanov.HW7;

public class Aspirant extends Student {

    private boolean hasScienceWorkPublished;

    public boolean hasScienceWorkPublished() {
        return hasScienceWorkPublished;
    }

    public void setHasScienceWorkPublished(boolean hasScienceWorkPublished) {
        this.hasScienceWorkPublished = hasScienceWorkPublished;
    }

    public Aspirant(String firstName, String lastName, String group, double avgMark, boolean hasScienceWorkPublished) {
        super(firstName, lastName, group, avgMark);
        this.hasScienceWorkPublished = hasScienceWorkPublished;
    }

    public Aspirant() {

    }

    @Override
    public int getScholarship() {
        if (avgMark == 5.0) {
            return 200;
        } else return 180;
    }
}
