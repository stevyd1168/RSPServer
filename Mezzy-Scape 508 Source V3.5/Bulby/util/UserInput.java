package Bulby.util;
 
import Bulby.players.Player;
 
/**
 *
 * @author Gravediggah
 */
public class UserInput {
 
    private Player p;
    private int input = 0;
    private boolean waiting = false;
    private int inputType = -1;
    private int inputBtn = -1;
 
    public UserInput(Player p) {
        this.p = p;
    }
 
    public void setInput(int input) {
        this.input = input;
        parseInput();
    }
 
    public int getInput() {
        return input;
    }
 
    public void runInput() {
        String q = "";
        switch (inputType) {
            case 1:
                q = "Enter amount to offer:";
                break;
          }
 
        p.frames.runScript(p, 108, new Object[]{q}, "s");
    }
 
    public void request(int type, int button) {
        this.waiting = true;
        this.inputType = type;
        this.inputBtn = button;
        runInput();
    }
 
    public void resetInput() {
        this.waiting = false;
        this.input = 0;
        this.inputType = -1;
        this.inputBtn = -1;
    }
 
    public void parseInput() {
        if (inputType > -1) {
            if (input > 0) {
                switch (inputType) {
                    case 1:
                        p.pTrade.tradeItemB(inputBtn, input);
                        break;
                }
            }
        }
        resetInput();
    }
}