import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LatestVersion {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();;
        scanner.nextLine();
        List<String> S = Arrays.asList(scanner.nextLine().split(" "));
        System.out.println("Latest version: "+latestVersion(S));
    }
    public static int latestVersion(List<String> S){
        int latest = -1;
        for (String file : S){
            String[] part = file.split("_");
            if (part.length==2 && part[0].equals("File")&&part[1].matches("\\d+")){
                int version = Integer.parseInt(part[1]);
                latest = Math.max(latest,version);
            }
        }
        return latest;
    }
}
