package com.utils;

import java.util.List;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;


public class ReadCsv
{
    public static List<String[]> readCSV(String filePath) {
        final Logger LOGGER = Logger.getLogger(ReadCsv.class.getName());
        if (filePath == null || filePath.isEmpty()) {
            throw new IllegalArgumentException("La ubicacion es nula o esta vacia!!!");
        }
        List<String[]> records = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
            String[] values;
            while ((values = csvReader.readNext()) != null) {
                records.add(values);
            }
        } catch (IOException | CsvValidationException e) {
            LOGGER.log(Level.SEVERE, "Error al leer el archivo: " + e.getMessage(), e);
        }
        return records;

    }

}