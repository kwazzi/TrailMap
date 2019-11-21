package com.company;

public class HikingMap {
    char map [][] = new char[5][5];
    int mapTime[][] = new int[5][5];
    int totalTime;
    int startX; int startY; int endX; int endY;

    public HikingMap(){

    }

    public int[][] getMapTime() {
        return mapTime;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public int getStartY() {
        return startY;
    }

    public int getStartX() {
        return startX;
    }

    public int getEndY() {
        return endY;
    }

    public int getEndX() {
        return endX;
    }

    public char[][] getMap() {
        return map;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public void setMapTime(int[][] mapTime) {
        this.mapTime = mapTime;
    }

    public void setMap(char[][] map) {
        this.map = map;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }
}


