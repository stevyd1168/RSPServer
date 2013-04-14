package palidino76.rs2.world.ge;

import palidino76.rs2.world.items.Items;
import palidino76.rs2.player.Player;
import java.util.HashMap;
import java.util.Iterator;

public class GrandExchange {

	public static HashMap<String, GEItem> items = new HashMap<String, GEItem>();
	public static Items idef = new Items();
	
	public static boolean itemExists(String itemName)
	{
		return items.containsKey(itemName.toLowerCase());
	}

	public static boolean itemBought(String itemName)
	{
		return items.get(itemName.toLowerCase()) == null ? true : items.get(itemName.toLowerCase()).bought;
	}

	public static void marketItems(Player p)
	{
		if (p == null) return;
		Iterator iter = items.keySet().iterator();  
		while (iter.hasNext())
		{  
			GEItem j = items.get(iter.next());
			p.sendMessage(j.name +", "+ cost(j.name));
		}
	}

	public static void sell(Player p, int itemId, int[] prices, int amount)
	{
		items.put(idef.getItemName(itemId).replaceAll("_", " ").toLowerCase(), new GEItem(p, itemId, prices, amount));
		p.sendMessage("Added to Grand Exchange: "+ itemId + " amount of " + amount);
	}
	
	public static String cost(String itemName)
	{
		GEItem cItem = items.get(itemName.toLowerCase());
		String str;
		if (cItem != null) str = cItem.name + ", costs minimum "+cItem.min+", maximum "+cItem.max;
		else str = "Could not find any seller..";
		return str;
	}
	
	public static void buy(Player p, String itemName, int amount)
	{
		itemName = itemName.toLowerCase();
		if(!itemExists(itemName))
		{
			p.frames.sendMessage(p, "This item is not on the market..");
			return;
		}
		boolean itemNull = false;
		GEItem boughtItem = items.get(itemName.toLowerCase());
		if (boughtItem == null)
			itemNull = true;
		if (itemNull)
		{
			p.frames.sendMessage(p, "This item does not exist.");
			return;
		}
		if (boughtItem.owner() == p)
		{
			p.frames.sendMessage(p, "You can't buy your own item..");
			return;
		}
		if (boughtItem.giveTo(p, amount))
		{
			p.frames.sendMessage(p, "You have successfully bought "+ amount + " of "+ boughtItem.name);
			items.remove(itemName);
		}
	}
}