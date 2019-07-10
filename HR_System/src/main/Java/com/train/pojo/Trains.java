package com.train.pojo;

public class Trains {
    private TrainPlus trainPlus;
    private String status;

    public TrainPlus getTrainPlus() {
        return trainPlus;
    }

    public void setTrainPlus(TrainPlus trainPlus) {
        this.trainPlus = trainPlus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Trains(TrainPlus trainPlus) {
        this.trainPlus = trainPlus;
    }

    @Override
    public String toString() {
        return "Trains{" +
                "trainPlus=" + trainPlus +
                ", status='" + status + '\'' +
                '}';
    }
}
