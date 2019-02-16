package DemoPack.Lesson13.Exceptions.TryAndCatch.Exe1ListOfNumbers;

import java.io.*;

public class ListOfNumbers1 {

    public void writeList1() {
        PrintWriter out = null;

        System.out.println("Entering 'try' statement\n");

        try {

            out = new PrintWriter(new FileWriter("lena.txt"));

            File file = new File("/Users/alenka/Documents/lena.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            System.out.println("Your file opens here: \n");

            int n = 0;

                while ((st = br.readLine()) != null) {
                    n++;
                    System.out.println(st);
                }

                System.out.println("\n*** Number of lines into the file: " + n);


            } catch(IndexOutOfBoundsException e){
                System.err.println("Caught IndexOutOfBoundsException: " +
                        e.getMessage());

            } catch(FileNotFoundException e){
                System.err.println("Caught File not found exception: " + e.getMessage());

            } catch(IOException e){
                e.printStackTrace();

            } finally{
                if (out != null) {
                    System.out.println("Closing PrintWriter");
                    out.close();
                } else {
                    System.out.println("PrintWriter not open");
                }
            }
        }

    }



