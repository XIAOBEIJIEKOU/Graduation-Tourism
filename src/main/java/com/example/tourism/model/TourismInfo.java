package com.example.tourism.model;

public class TourismInfo {

    private String name;

    private String introduction;

    private String imgName;

    private int currentNum;

    private int maxinumFlow;

    private int costTime;

    public int getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(int currentNum) {
        this.currentNum = currentNum;
    }

    public int getMaxinumFlow() {
        return maxinumFlow;
    }

    public void setMaxinumFlow(int maxinumFlow) {
        this.maxinumFlow = maxinumFlow;
    }

    public int getCostTime() {
        return costTime;
    }

    public void setCostTime(int costTime) {
        this.costTime = costTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }
}
