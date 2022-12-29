import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class FileUtilities {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
//        try {
//            FileWriter myFile = new FileWriter("data/newFile.txt", true);
//            
//            myFile.write("This is what I added to the file:\n");
//            myFile.write("First line\n");
//            myFile.write("Second Line\n");
//            
//            myFile.close();
//            
//            
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } 
        
        AddUserInput();
        
       

    }
    
    public static void addOrRead() {
        File myFile = null;
        
        myFile = new File("data/data.csv");
        
        if(myFile.exists()) {
            try {
                Scanner fileScanner = new Scanner(myFile);
                HashMap<String, String[]> newHashMap = new HashMap<String, String[]>();
                
                
                while(fileScanner.hasNextLine()) {
                    String[] tempStrings = fileScanner.nextLine().split(",");
                    newHashMap.put(tempStrings[0], new String[] {tempStrings[1], tempStrings[2], tempStrings[3]});
                }
                
                fileScanner.close();
                
                
                
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            
        } else {
            FileWriter writeMyFileWriter = null;
            try {
                writeMyFileWriter = new FileWriter("data/data.csv", true);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            
            try {
                writeMyFileWriter.write("100, Syed Atyab, syed.atyab@something.com, true\n");
                writeMyFileWriter.write("101, Abdullah, abc@something.com, true\n");
                writeMyFileWriter.write("102, Ameer, qwe@something.com, true\n");
                writeMyFileWriter.write("103, Noor, asd@something.com, true\n");
                writeMyFileWriter.write("104, Wasan, sdf@something.com, true\n");
                writeMyFileWriter.write("105, Bara'ah, rer.wwe@something.com, true\n");
                writeMyFileWriter.write("106, Fatima, 768uuui@something.com, true\n");
                writeMyFileWriter.write("107, Anwaar, hgjghj.ghjgh.ghjghj@something.com, true\n");
                writeMyFileWriter.write("108, Najla, bnmb.bnmbmbn.bnmbm@something.com, true\n");
                writeMyFileWriter.write("109, Marium, fgjfbnmghj@something.com, true\n");
                writeMyFileWriter.write("110, Malak, ghjgjghj@something.com, true\n");
                writeMyFileWriter.write("111, Mohammad Shibli, ghjghj_qwerwqer@something.com, true\n");
                writeMyFileWriter.write("112, Mehmood, mehmoodweoiruweioru.asdads_34@something.com, true\n");
                
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                try {
                    writeMyFileWriter.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            
        }
    }
    
    public static void AddUserInput() {
        
        
        Scanner userInputScanner = new Scanner(System.in);
        FileWriter myFile = null;
        
        System.out.print("(Enter your name: )");
        String name = userInputScanner.nextLine();
        
        System.out.print("(Enter your email: )");
        String email = userInputScanner.nextLine();
        int counter = 001;
        
        
        
        try {
            myFile = new FileWriter("data/userInput.csv", true);
            myFile.write(counter + ", " + name + ", " + email + ", true ");
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                myFile.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        
    }
    
    public static void ReadAndAdd() {
        File inputFile = null;
        Scanner fileScanner = null;
        FileWriter newFile = null;
        
        inputFile = new File("data/input.txt");
        
        try {
            newFile = new FileWriter("data/results.txt", true);
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        
        
        try {
            fileScanner = new Scanner(inputFile);
            while(fileScanner.hasNext()) {
                String tempString = fileScanner.nextLine();
                tempString = tempString.toUpperCase();
                try {
                    newFile.write(tempString + "\n");
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            fileScanner.close();
            try {
                newFile.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        

    }
    

}
