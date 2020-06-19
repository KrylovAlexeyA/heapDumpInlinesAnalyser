import java.util.Arrays;
import java.util.List;

public class Calculator {

    long limit = 34359738368L;

    public void calculate(List<List<String>> list, String total) {
        String arch = System.getProperty("sun.arch.data.model");
        List<String> splitted = Arrays.asList(total.split("\\s+"));
        long totalNum = Long.parseLong(splitted.get(splitted.size() - 1));
        int header = arch.equals("64") ? 8 : 4;
        int ref = totalNum > limit ? 8 : 4;
    }
}