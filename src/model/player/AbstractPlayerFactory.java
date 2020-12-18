package model.player;

import model.BoardConfiguration;
import org.json.simple.JSONObject;


import java.util.ArrayList;

public abstract class AbstractPlayerFactory {
    public abstract ArrayList<Player> get(BoardConfiguration boardConfiguration, JSONObject config);
    public abstract Player createAIPLayer(int balance, AICharacteristic aiCharacteristic, String playerTokenType);
    public abstract Player createHumanPLayer(int balance, String playerTokenType);
}
