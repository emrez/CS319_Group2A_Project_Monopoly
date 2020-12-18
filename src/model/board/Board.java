package model.board;

import model.tiles.Tile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Board implements Iterable<Tile>, Serializable {
    String boardName;
    int boardSalary;
    ArrayList<Tile> tiles;

    // newly added
    int jailTileIndex;

    public ArrayList<Tile> getTiles() {
        return tiles;
    }

    public void setTiles(ArrayList<Tile> tiles) {
        this.tiles = tiles;
    }

    @Override
    public Iterator<Tile> iterator() {
        return tiles.iterator();
    }

    public int getJailTileIndex() {
        return jailTileIndex;
    }

    public void setJailTileIndex(int jailTileIndex) {
        this.jailTileIndex = jailTileIndex;
    }

    public int getBoardSalary() {
        return boardSalary;
    }

    public void setBoardSalary(int salary) {
        this.boardSalary = salary;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }
}
