package com.utils;

import com.opencsv.bean.CsvToBeanBuilder;
import com.model.User;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CsvDataProvider {
    private static final Logger LOGGER = Logger.getLogger(CsvDataProvider.class.getName());
    private static final String DEFAULT_FILE_PATH = "src/test/resources/user.csv";

    public static List<User> csvUserDataProvider() {
        return csvUserDataProvider(DEFAULT_FILE_PATH);
    }

    public static List<User> csvUserDataProvider(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            return new CsvToBeanBuilder<User>(reader)
                    .withType(User.class)
                    .build()
                    .parse();
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error reading CSV file: " + filePath, e);
            return Collections.emptyList();
        }
    }

}