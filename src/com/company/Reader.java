package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    ArrayList<HikingMap> hikingMaps = new ArrayList<>();

    public Reader() throws FileNotFoundException {
        readFile();
    }

    public void readFile() throws FileNotFoundException {
        File file = new File("W:\\1920 Classes\\1st_Programing_II\\AK71\\TrailMap\\src\\hiking_challenge.dat");
        Scanner scanner = new Scanner(file);
        // going through each line , i hard coded the number of lines because i'm stupid //
        for(int i = 0; i < 24; i ++){
            // getting each line and splitting it using regular expressions //
            String tempLine = scanner.nextLine();
            String[] options = tempLine.split("[({ , })]");

            // seeing if the line is a new map (coordinates) //
            if(i == 0 || i == 6 || i == 12 || i == 18){
                HikingMap temp = new HikingMap();
                // setting the coordinates //
                temp.setStartX(Integer.parseInt(options[2]));
                temp.setStartY(Integer.parseInt(options[3]));
                temp.setEndX(Integer.parseInt(options[6]));
                temp.setEndY(Integer.parseInt(options[7]));
                hikingMaps.add(temp);
            }
        }
    }
}
