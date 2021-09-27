package com.ruokonen;
import java.io.File;
import java.io.FileNotFoundException;

public class MapProvider {
  private String selectedMap;
  private File map;
  private char[][] matrix;
  private MapConverter converter;

  public MapProvider() throws Exception {
    this.map = new File("./maps/Milan_0_1024.map");
    System.out.println(map.exists());
    System.out.println(map.canRead());
    System.out.println(map.exists());
    this.converter = new MapConverter(map);
  }

  public char[][] getMapAsMatrix() {
    return converter.transformToMatrix();
  }

}
