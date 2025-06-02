package com.utils;

import java.util.List;
//import org.testng.annotations.DataProvider;

public class CsvDataProvider
{
    //@DataProvider(name = "csvDataProvider")
    public static Object[][] csvDataProvider()
    {
        List<String[]> records = ReadCsv.readCSV("src/test/resources/datosComprador.csv");

        Object[][] data = new Object[records.size()][records.get(0).length];
        for(int i=0; i<records.size(); i++)
        {
            data[i] = records.get(i);
        }
        return data;
    }

    public static void main(String[] args) {
        Object[][] datos = CsvDataProvider.csvDataProvider();
        System.out.println((String) (datos[0][0]));
    }
}