import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
public class ConfigParser {

    public ConfigParser(){}

    public String[] parseLine(String line, String delim){
        return line.split(delim);
    }

    public List<String> parseForStrCount (String path, String delim){
        List<String> strList = new ArrayList<String>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            for(String line; (line = br.readLine()) != null; ) {
                for(String word: this.parseLine(line, delim)){
                    strList.add(word);
                }
            }
        }
        catch (Exception e) {
            //TODO Detailed logging to log file....
            System.out.println("Error parsing for str count.");
            System.out.println(e);
        }

        return strList;
    }

    public HashMap<String,String> parseConfig (String path){
        HashMap<String, String> parsedMap = new HashMap<>();
        Properties loadProp = new Properties();

        try {
            loadProp.load(this.getClass().getResourceAsStream(path));

            for (String key : loadProp.stringPropertyNames()) {
                String value = loadProp.getProperty(key);
                parsedMap.put(key, value);
            }
        }

        catch (Exception e) {
            //TODO Detailed Logging messages saved to file......
            System.out.println("Config parser critical failure");
            System.out.println(e);
        }

        return parsedMap;
    }
}
