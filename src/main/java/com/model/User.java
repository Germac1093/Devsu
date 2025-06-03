package com.model;
import com.opencsv.bean.CsvBindByName;
import lombok.Data;

@Data
public class User {
    @CsvBindByName(column = "firstName")
    private String firstName;

    @CsvBindByName(column = "lastName")
    private String lastName;

    @CsvBindByName(column = "postalCode")
    private String postalCode;
}

