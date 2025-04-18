package com.example.cryptokeypassage;

public class HistoryModel {
    String timeDate;
    String timeHMS;
    String textAction;
    int imageAction;

    public HistoryModel(String timeDate, String timeHMS, String textAction, int imageAction) {
        this.timeDate = timeDate;
        this.timeHMS = timeHMS;
        this.textAction = textAction;
        this.imageAction = imageAction;
    }

    public String getTimeDate() {
        return timeDate;
    }

    public String getTimeHMS() {
        return timeHMS;
    }

    public String getTextAction() {
        return textAction;
    }

    public int getImageAction() {
        return imageAction;
    }
}
