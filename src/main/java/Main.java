import java.util.HashMap;
import java.util.List;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        ConfigParser testConfig = new ConfigParser();
        StringCounter strCount = new StringCounter();
        HashMap<String, String> configMap = testConfig.parseConfig("stringCounter.properties");

        String dPath = new File(configMap.get("dataPath"))
                .getAbsolutePath();

        List<String> dataList = testConfig.parseForStrCount(dPath, configMap.get("delimiter"));

        int count = strCount.countMatches(configMap.get("matchCondition"), dataList);
        System.out.println("There are " + count + " matching strings in the input list.");
    }
}




