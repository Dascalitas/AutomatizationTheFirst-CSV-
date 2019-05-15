package com.dascalitas;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CSVWriter {
    public static final String  SAMPLE_CSV_FILE_PATH = "country2.csv";

    public static void main(String[] args) throws IOException {

        try (
                BufferedWriter writer= new BufferedWriter(new FileWriter(SAMPLE_CSV_FILE_PATH));
                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                .withHeader("ID" , "Name" , "Capital" , "valute")))
        {
                csvPrinter.printRecord("AU" , "Australia" , "Canberra" , "Australian dollar");
                csvPrinter.printRecord("CN" , "China" , "Beijing" , "yuan");
                csvPrinter.printRecord("KR" , "Korea" , "Seoul" , "Won");
                csvPrinter.printRecord("MD" , "Moldova" , "Chisinau" , "Leu");
                csvPrinter.printRecord("RU" , "Russia" , "Moscow" , "Rubly");
                csvPrinter.printRecord("GB" , "Great Britain" , "London" , "Pound Sterling");
                csvPrinter.printRecord("JP" , "Japan" , "Tokyo" , "Yen");
                csvPrinter.printRecord("TH" , "Thailand" , "Bangkok" , "Baht");
                csvPrinter.printRecord("DE" , "Germany" , "Berlin" , "Euro");
                csvPrinter.printRecord("IL" , "Israel" , "Jerusalem" , "New Shekel");
                csvPrinter.printRecord("IT" , "Italy" , "Rome" , "Euro");
                csvPrinter.printRecord("MX" , "Mexico" , "Mexico City" , "Peso");


                csvPrinter.printRecord(Arrays.asList("NO", "Norway", "Oslo", "Norwegian Krone"));
                csvPrinter.printRecord(Arrays.asList("US", "United States of America", "Washington", "American Dollar"));

                csvPrinter.flush();
        }
    }
}
