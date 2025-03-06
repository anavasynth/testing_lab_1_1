package edu.honchariukvadym;

/* 
  @author  Anavasynth
  @project  IntelliJ IDEA
  @class  HumanIMB
  version 1.0.0
  @since 06.03.2025 - 16.25
*/

class HumanIMB {
    private double weight; // Weight in kg
    private double height; // Height in meters

    public HumanIMB(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateIMT() {
        return weight / (height * height);
    }

    public IMTCategory determineCategory() {
        double imt = calculateIMT();
        if (imt < 18.5) return IMTCategory.DEFICIT;
        if (imt < 25) return IMTCategory.NORM;
        if (imt < 30) return IMTCategory.WARNING;
        return IMTCategory.FAT;
    }

    public String getIMTResult() {
        return switch (determineCategory()) {
            case DEFICIT -> "Deficit";
            case NORM -> "Norm";
            case WARNING -> "Warning!";
            case FAT -> "Fat";
        };
    }
}
