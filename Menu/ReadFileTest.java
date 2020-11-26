package Quiz_project.Menu;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * đọc file
 */
public class ReadFileTest {
    public static List<String> readFileTest(String fileName) {

        List<String> lines = Collections.emptyList();
        try
        {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return lines;
    }
    public static void readFileJava(){
        List l = readFileTest("src/Quiz_project/Menu/TestJava__Basic.txt");
        Iterator<String> itr = l.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
    public static void readFileHTML(){
        List l = readFileTest("src/Quiz_project/Menu/TestHTML__Basic.txt");
        Iterator<String> itr = l.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
//    private static List readFileJava(String s) {
//        return null;
//    }

//    public static void readFileTest(){
//        try {
//            FileReader fr = new FileReader("src/Quiz_project/Menu/TestJava__Basic.txt");
//            BufferedReader br = new BufferedReader(fr);
//            int i;
//            while ((i= br.read()) != -1){
//                System.out.print((char) i);
//            }
//            br.close();
//            fr.close();
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        //lỗi hiển thị liền ký tự
//        finally {
//            System.out.println();
//        }
//    }

}
