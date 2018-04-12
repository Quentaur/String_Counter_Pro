import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class StringCounter {
    public StringCounter(){}

    public int countMatches (String matchCond, List<String> data){
        int matchCount = 0;

        try {
            Pattern patn = Pattern.compile(matchCond);
            for (String str : data) {
                Matcher match = patn.matcher(str);
                while (match.find()) {
                    matchCount++;
                }
            }
            return matchCount;
        }
        catch (Exception e){
            //TODO detailed logging to file
            System.out.println("match condition error");
            System.out.println(e);
        }
        return -1;
    }
}
