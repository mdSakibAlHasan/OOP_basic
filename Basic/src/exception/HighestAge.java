package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.Integer.parseInt;

public class HighestAge {
        public static void main(String[] args)  {

//        File file = new File("exception/abc.txt");
//        DataOutputStream outputStream = new DataOutputStream(file);
            try {
                BufferedReader reader = new BufferedReader(new FileReader("src/exception/people.txt"));
                String line;
                int[][] num = new int[10][4];
                int i = 0;
                line = reader.readLine();
                while (line != null) {
                    String words[] = (line.split(" "));
                    int j = 0;
                    for (String word : words) {
                        num[i][j] = parseInt(word);
                        j++;
                    }
                    i++;
                    //System.out.println(line);
                    line = reader.readLine();
                }


                for (i = 0; i < 5; i++) {
                    if (num[i][1] >= 70) {
                        System.out.println(num[i][0]+" "+num[i][1]);
                    }
                }


            }catch (IOException e){
                System.out.println("File not found");
            }
        }

}
