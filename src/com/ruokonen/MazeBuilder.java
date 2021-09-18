package com.ruokonen;

public class MazeBuilder {

    private char[][] maze;

    public MazeBuilder(int x, int y) {
        maze = new char[y][x];
        for(int i = 0; i < maze.length; i++) {
            for(int j = 0; j < maze[0].length; j++) {
                maze[i][j] = '.';
            }
        }
    }


    private void generateMaze() {

    }


    public char[][] getMaze() {
        return maze;
    }

}
