package fitnessTask;

import java.time.LocalDate;
import java.time.LocalTime;

public class Membership implements StartTime, EndTime, GymZone, SwimmingPool, AerobicZone {
    LocalDate start;
    LocalDate end;

    protected String name;
    protected String surname;
    protected int year;

    public Membership(LocalDate start, LocalDate end, String name, String surname, int year) {
        this.start = start;
        this.end = end;
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() >= 2) {
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname != null && surname.length() >= 2) {
            this.surname = surname;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 2004) {
            this.year = year;
        }
    }

    @Override
    public LocalTime eTime() {
        return null;
    }

    @Override
    public LocalTime stTime() {
        return null;
    }

    @Override
    public boolean ableAerob() {
        return false;
    }

    @Override
    public boolean ableGym() {
        return false;
    }

    @Override
    public boolean ablePool() {
        return false;
    }
}
