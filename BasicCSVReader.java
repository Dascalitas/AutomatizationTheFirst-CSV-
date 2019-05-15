package com.dascalitas;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BasicCSVReader {
    private static final String SAMPLE_CSV_FILE_PATH = "./country.csv";

    public static void main(String[] args) throws IOException {
        try (
                Reader reader = new BufferedReader(new FileReader(SAMPLE_CSV_FILE_PATH));

                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT)) {

            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index
                String name = csvRecord.get(0);
                String surname = csvRecord.get(1);
                String Birthday = csvRecord.get(2);
                String Abilities = csvRecord.get(3);
                String domain = csvRecord.get(4);
                String Country = csvRecord.get(5);

                System.out.println("No - " + csvRecord.getRecordNumber());
                System.out.println("---------------");
                System.out.println("Name : " + name);
                System.out.println("Surname : " + surname);
                System.out.println("Birthday : " + Birthday);
                System.out.println("Abilities : " + Abilities);
                System.out.println("Domain : " + domain);
                System.out.println("Country : " + Country);
                System.out.println("---------------\n\n");
            }
        }
    }
}
