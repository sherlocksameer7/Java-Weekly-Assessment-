package harman.assessment.project;

import java.io.*;

public class Input {

    public static void main(String[] args) {

        try
        {
            FileInputStream obj_inp = new FileInputStream("C:\\Users\\sherl\\IdeaProjects\\Java Weekly Assessment\\Op_file.txt");

            DataInputStream in = new DataInputStream(obj_inp);

            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String str = br.readLine();  // These are all the main thing to understand for the reading of vowel words by FileInputStream Reader!!!


            int count[] = new int[5];

            for (int i = 0; i < str.length(); ++i)
            {


                if (str.charAt(i) == 'a' || str.charAt(i) == 'A')
                {
                    count[0] = count[0] + 1;
                }


                if (str.charAt(i) == 'e' || str.charAt(i) == 'E') {
                    count[1] = count[1] + 1;
                }


                if (str.charAt(i) == 'i' || str.charAt(i) == 'I')
                {
                    count[2] = count[2] + 1;
                }


                if (str.charAt(i) == 'o' || str.charAt(i) == 'O')
                {
                    count[3] = count[3] + 1;
                }


                if (str.charAt(i) == 'u' || str.charAt(i) == 'U')
                {
                    count[4] = count[4] + 1;
                }
            }


            System.out.println("Number of Letter 'A' = " + count[0]);

            System.out.println("Number of Letter 'E' = " + count[1]);

            System.out.println("Number of Letter 'I' = " + count[2]);

            System.out.println("Number of Letter 'O' = " + count[3]);

            System.out.println("Number of Letter 'U' = " + count[4]);


        }


        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
