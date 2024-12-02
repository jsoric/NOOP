package com.repetitorium.pckg1_exam_problem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Car {

    private String brand;
    private String model;
    private final DateTimeFormatter dateTimeFormatter;

    private static final LocalDate START_DATE = LocalDate.of(1980,1,1);
    private static final LocalDate END_DATE = LocalDate.of(2024,1,1);

    private final String dateOfProduction;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        this.dateOfProduction = randomDate();
    }

    private String randomDate() {
        long start = START_DATE.toEpochDay();
        long end = END_DATE.toEpochDay();
        long randomEpochDay = start + (long) (Math.random() * (end - start));
        return LocalDate.ofEpochDay(randomEpochDay).format(dateTimeFormatter);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", dateTimeFormatter=" + dateTimeFormatter +
                ", dateOfProduction='" + dateOfProduction + '\'' +
                '}';
    }
}
