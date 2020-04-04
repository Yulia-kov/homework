package fitnessTask;

import java.time.LocalDate;
import java.time.LocalTime;

public class Daily extends Membership implements GymZone, AerobicZone, SwimmingPool, StartTime, EndTime {
    public Daily(LocalDate start, LocalDate end, String name, String surname, int year) {
        super(start, end, name, surname, year);
    }

    @Override
    public boolean ableGym() {
        return true;
    }

    @Override
    public boolean ableAerob() {
        return true;
    }

    @Override
    public boolean ablePool() {
        System.out.println("Данный абонемент не дает доступ в бассейн: " + name);
        return false;
    }

    @Override
    public LocalTime stTime() {
        LocalTime startTime = LocalTime.of(8, 00);
        return startTime;
    }

    @Override
    public LocalTime eTime() {
        LocalTime endTime = LocalTime.of(16, 00);
        return endTime;
    }


}
