package com.ruokonen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MapConverter {

  private File map;
  private Scanner scanner;

  public MapConverter(File file) throws FileNotFoundException {
    this.map = file;
    if (!readFile()) {
      throw new FileNotFoundException();
    }
  }

   public boolean readFile() {
      try {
        scanner = new Scanner(map);
        return true;
      } catch(FileNotFoundException e) {
        return false;
      }
   }

  public char [][] createMatrix (){
      scanner.nextLine();
      String height = scanner.nextLine();
      String width = scanner.nextLine();
      System.out.println(height);
      char[][] matrix =
              new char[Integer.parseInt(height.substring(7))]
                      [Integer.parseInt(width.substring(6))];
      scanner.nextLine();
      return matrix;
  }

  public char[][] transformToMatrix(){
    char[][] transformed = createMatrix();
    for (int i = 0; i < transformed.length; i++) {
      transformed[i] = scanner.nextLine().toCharArray();
    }
    return transformed;
  }


}
