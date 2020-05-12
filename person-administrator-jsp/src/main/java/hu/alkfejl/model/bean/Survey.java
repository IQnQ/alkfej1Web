package hu.alkfejl.model.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Survey {
    private int id;
    private String name;
    private LocalDateTime from;
    private LocalDateTime to;
    private LocalTime maxTime;
    private int limit;

    public Survey() {}

    public Survey(int id, String name, String cDate, boolean isFilled, String fromD, String toD, String fromT, String toT, String maxT, int limit) {
        try {
            this.id = id ;
            this.name = name;
            //this.createdDate = LocalDate.parse(cDate);
            //this.isFilledOut.set(isFilled);
            this.from = LocalDateTime.of(LocalDate.parse(fromD), LocalTime.parse(fromT));
            this.to = LocalDateTime.of(LocalDate.parse(toD), LocalTime.parse(toT));
            this.maxTime = LocalTime.parse(maxT);
            this.limit = limit ;
        } catch (Exception e) {
            System.out.println(e);
        }
    }


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

    public LocalDateTime getFrom() {
        return from;
    }

    public void setFrom(LocalDateTime from) {
        this.from = from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public void setTo(LocalDateTime to) {
        this.to = to;
    }

    public LocalTime getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(LocalTime maxTime) {
        this.maxTime = maxTime;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
