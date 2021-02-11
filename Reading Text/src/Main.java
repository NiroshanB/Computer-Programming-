import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static ArrayList<String> lines = new ArrayList();
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            lines.add(line);
        }
        br.close();
        for(String s: lines){
            System.out.println(s);
        }
        System.out.println();
        findWord("programmer");
    }
    static void findWord(String searchWord){
        for(int i = 0; i<lines.size(); i++){
            String temp = lines.get(i).toString();
            if (temp.contains(searchWord)){
                System.out.println("The word " + "'" + searchWord + "'" + " is found at index position " + temp.indexOf(searchWord) + " in Sentence " + i);

            }
        }
    }
}
