package exception;

import java.io.*;

import static java.lang.Integer.parseInt;

public class FileRead {
    public static void main(String[] args)  {

//        File file = new File("exception/abc.txt");
//        DataOutputStream outputStream = new DataOutputStream(file);
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/exception/abc.txt"));
//            if(reader == null)
//                throw new IOException("Invalid score");
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


            for (i = 1; i < 4; i++) {
                int highest = 0, summation = 0;
                for (int j = 0; j < 5; j++) {
//                    if(num[j][i] < 15){
//                        throw new InvalidCTScore(num[j][i]);
//                    }
                    summation += num[j][i];
                    if (num[j][i] > highest) {
                        highest = num[j][i];
                    }
                }
                System.out.println("Highest mark: " + highest + " Avarage: " + (summation / 5));
            }

            System.out.println("Print highest mark of each student");
            for (i=0;i<5;i++){
                int high=0;
                for(int j=1;j<4;j++){
                    if(high<num[i][j]){
                        high = num[i][j];
                    }
                }
                System.out.println(num[i][0]+" "+high);
            }

        }catch (IOException e) {
            System.out.println("File not found");
        }
//        } catch (InvalidCTScore e) {
//            System.out.println(e.getMessage());
//        }
    }
}
