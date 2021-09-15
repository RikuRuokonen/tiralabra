package com.ruokonen;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("testing");
        MazeBuilder mb = new MazeBuilder(10, 10);
        System.out.println(Arrays.deepToString(mb.getMaze()).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
    }
}
