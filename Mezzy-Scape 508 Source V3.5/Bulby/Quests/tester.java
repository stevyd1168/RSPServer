
package Bulby.Quests;


import java.io.*;
import Bulby.net.SocketListener;
import Bulby.players.PlayerSave;
import Bulby.util.Misc;
import Bulby.Quests.*;
import Bulby.Server;
import Bulby.Engine;
import Bulby.players.Player;
import Bulby.util.Misc;
import Bulby.io.*;


public abstract class Tester extends Quests {

public Tester(Player owner, Integer uid) {
		super(owner, UID);
}
    	protected String name = "";

    	protected int uid = 1;

    	protected int stage = -1;

    	protected int finalStage = 50;

	/**
	 * This is an abstract Method, and as such
	 * must be overwritten by every subclass of 
	 * Quest. It defines the unique features of
	 * each quest - its name, its 'completion stage',
	 * any items, npcs, objects that are associated
	 * with it.
	 */
	public void define()
	{
		setName("Tester"); // Sets the name of this quest.
		setFinalStage(100); // The stage at which this quest ends.
	}

	/**
	 * Also an abstract Method that must be overwritten.
	 * This is called when the getFinalStage() is met.
	 */
	public void completeQuest(Player p)
	{
                Engine.playerItems.addItem(p, 995, 500); // gives 500 coins on complete
		
		sleep(2500); // waits 2500 mil secounds
		
		p.frames.sendMessage(p, "You have completed " + getName() + "!"); // send message
		p.frames.sendMessage(p, "@gre@You just gained 1 quest point!"); // send message
		}
	}