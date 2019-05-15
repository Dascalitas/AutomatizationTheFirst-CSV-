package com.dascalitas;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;

public class OpenCSVExample {

    public static void main(String[] args)
    {
        try (CSVReader reader = new CSVReader(new FileReader("country.csv")))

        {
            //Get the CSVReader instance with specifying the delimiter to be used
            String [] nextLine;
            //Read one line at a time
            while ((nextLine = reader.readNext()) != null)
            {
                for(String token : nextLine)
                {
                    //Print all tokens
                    System.out.print(token + " ");
                }
                System.out.println("");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        }
    }

