package properties;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

public class JavaTools {
    private Properties config = new Properties();

    public JavaTools() {
        load(JavaTools.class.getResourceAsStream("/javatools.properties"));
    }

    public Set<String> getToolKeys() {
        Set<String> result = new TreeSet<>();
        for(String s : config.stringPropertyNames()) {
            if(s.contains("name")) {
                result.add(s.substring(0,s.indexOf(".")));
            }
        }
        return result;
    }

    private Properties load(InputStream inputStream) {
        config = new Properties();
        try (
                InputStreamReader reader = new InputStreamReader(inputStream);
        ) {
            config.load(reader);
            return config;
        } catch (IOException ioe) {
            throw new RuntimeException("Cannot read properties file from inputstream", ioe);
        }
    }

    public Set<String> getTools() {
        Set<String> result = new HashSet<>();
        for (String key : getToolKeys()) {
            result.add(getName(key));

        }
        return result;

    }

    public String getName(String key) {
        return config.getProperty(key + "." + "name");
    }

    public String getUrl(String key) {
        return config.getProperty(key + "." + "url");
    }
}
