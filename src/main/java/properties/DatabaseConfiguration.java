package properties;


import java.io.*;
import java.util.Properties;

public class DatabaseConfiguration {
    private static final String ENCODING_UTF8 = "UTF-8";
    private Properties properties = new Properties();

    public DatabaseConfiguration(File file) {
        try(FileInputStream fis = new FileInputStream(file)) {
            load(fis);
        }
        catch(IOException ioe) {
            throw new IllegalArgumentException("Cannot read file",ioe);
        }
    }

    public DatabaseConfiguration() {
        try (InputStream is = this.getClass().getResourceAsStream("/db.properties")) {
            load(is);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file", ioe);
        }

    }
    private Properties load(InputStream inputStream) {
       properties = new Properties();
        try (
                InputStreamReader reader = new InputStreamReader(inputStream, ENCODING_UTF8);
        ) {
            properties.load(reader);
            return properties;
        } catch (IOException ioe) {
            throw new RuntimeException("Cannot read properties file from inputstream", ioe);
        }
    }

    public String getHost() {
        return properties.getProperty("db.host");
    }

    public int getPort() {
        return Integer.parseInt(properties.getProperty("db.port"));
    }

    public String getSchema() {
        return properties.getProperty("db.schema");
    }
}
