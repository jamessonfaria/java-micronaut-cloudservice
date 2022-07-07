package br.com.jamesson.controller;

import java.time.LocalDate;

public class CalibrationUpdate {
    private String model;
    private String serial;
    private LocalDate data;

    public CalibrationUpdate() {
    }

    public CalibrationUpdate(String model, String serial, LocalDate data) {
        this.model = model;
        this.serial = serial;
        this.data = data;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CalibrationUpdate{" +
                "model='" + model + '\'' +
                ", serial='" + serial + '\'' +
                ", data=" + data +
                '}';
    }
}
