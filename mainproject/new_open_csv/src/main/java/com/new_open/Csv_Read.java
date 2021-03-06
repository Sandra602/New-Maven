package com.new_open;

import java.io.FileReader;
import com.opencsv.CSVReader;

import java.io.FileReader;

public class Csv_Read {


        public static void readDataLineByLine()
        {

            try {

                // Create an object of filereader
                // class with CSV file as a parameter.
                FileReader filereader = new FileReader("filename.csv");

                // create csvReader object passing
                // file reader as a parameter
                CSVReader csvReader = new CSVReader(filereader);
                String[] nextRecord;

                // we are going to read data line by line
                while ((nextRecord = csvReader.readNext()) != null) {
                    for (String cell : nextRecord) {
                        System.out.print(cell + "\t");
                    }
                    System.out.println();
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            readDataLineByLine();
        }
    }


