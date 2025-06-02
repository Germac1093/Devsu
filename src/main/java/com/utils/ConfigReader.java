package com.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConfigReader {
    private static final Logger LOGGER = Logger.getLogger(ConfigReader.class.getName());
    private Properties properties;

    public ConfigReader(String fileName) {
        properties = new Properties();
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName)) {
            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                throw new IllegalArgumentException("El archivo de propiedades \"" + fileName + "\" no ha sido encontrado en el classpath.");
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error al cargar el archivo de propiedades: " + fileName, e);
            throw new RuntimeException("Error crítico al cargar la configuración", e);
        }
    }

    public String getProperty(String key) {
        String value = properties.getProperty(key);
        if (value == null) {
            LOGGER.warning("La propiedad con clave \"" + key + "\" no fue encontrada.");
        }
        return value;
    }
}
