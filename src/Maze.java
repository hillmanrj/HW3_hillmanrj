import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * http://stackoverflow.com/questions/16030753/simple-maze-game-in-java
 * Created by hillmanrj on 2/28/2017.
 */
public class Maze {

    int row;
    int col;
    int startRow;
    int startCol;
    int exitRow;
    int exitCol;
    char cell = new cell(row, col);
    //char[] lines;


    public Maze (File filename){
        Scanner keyboard = new Scanner(System.in);
        int i = 0;

        System.out.println("What is the name of the file: ");
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();

        // establishes the java input for reading the file
        java.io.File inputFile = new java.io.File(fileName);

        try {
            Scanner fileReader = new Scanner(inputFile);

            while (fileReader.hasNextLine()) {
                //char[] lines = fileReader.nextLine();
                i++;
            }


            // closes the file reader
            fileReader.close();


        } catch (FileNotFoundException e) {
            System.out.println("Sorry, cannot find the file");
            System.exit(0);
        }

    }

    public int getRows(){
        return row;
    }

    public int getCols(){
        return col;
    }

    public int getStartRow(){
        return startRow;
    }

    public int getStartCol(){
        return startCol;
    }

    public int getExitRow(){
        return exitRow;
    }

    public int getExitCol(){
        return exitCol;
    }

    public char getCell(int row, int col){
        return cell;
    }

    public boolean openCell(int row, int col){
        return true;
    }

    public void setCell(int row, int col, char newCh){
    }

    public String toString(){
        String maze = char[] lines;
        return maze;
    }
}
