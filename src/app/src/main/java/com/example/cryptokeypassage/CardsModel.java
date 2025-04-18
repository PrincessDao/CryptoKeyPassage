package com.example.cryptokeypassage;

public class CardsModel {
    String companyName;
    int image;
    int cardColor;
    int companyTextColor;

    public CardsModel(String companyName, int image, int cardColor, int companyTextColor) {
        this.companyName = companyName;
        this.image = image;
        this.cardColor = cardColor;
        this.companyTextColor = companyTextColor;
    }

    public String getCompanyName() {
        return companyName;
    }
    public int getImage() {
        return image;
    }
    public int getCardColor() { return cardColor; }
    public int getCompanyTextColor() { return companyTextColor; }
}
