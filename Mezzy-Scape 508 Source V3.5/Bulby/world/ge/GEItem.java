import palidino76.rs2.player.Player;
import palidino76.rs2.player.items.PlayerItems;
package palidino76.rs2.world.ge;
/**
 * @author momosherilly
 * Grand Exchange item..
 */
public class GEItem {

	public Player owner;
	public String name;
	public int min, max, amount, id;
	public boolean bought = false;
	public PlayerItems playerItems;

	public GEItem(Player player, int item, int[] prices, int amnt)
	{
		playerItems = new PlayerItems();
		bought = false;
		id = item;
		min = 1;
		max = 10;
		owner = player;
		name = GrandExchange.idef.getItemName(item).replaceAll("_", " ").toLowerCase();
		amount = amnt;
		if (prices.length < 2) return;
		min = prices[0];
		max = prices[1];
		if (min <= 0) min = 1;
		if (max <= 0) max = 5;
		if (min > max) min = max / 2;
	}

	public PlayerItems pi()
	{
		return playerItems;
	}

	public int getPrice(int buying)
	{
		return ((max / 2) + min) * buying;
	}

	public boolean sell (Player buyer, int amtToBuy)
	{
		if (pi().invItemCount(buyer, 995) < getPrice(amtToBuy))
		{
			buyer.frames.sendMessage(buyer, "Not enough coins to buy this item.");
			return false;
		}
		if (pi().invItemCount(owner, id) < 1)
		{
			buyer.frames.sendMessage(buyer, "The owner of this item has no stock..");
			bought = true;
			return false;
		}
		pi().deleteItem(buyer, 995, pi().getItemSlot(buyer, 995), getPrice(amtToBuy));
		pi().addItem(owner, 995, getPrice(amtToBuy) + (min / 4));
		return true;
	}
	
	public boolean giveTo(Player buyer, int buyingAmount)
	{
		int buy = buyingAmount;
		if (pi().invItemCount(buyer, id) > amount)
		{
			buy = amount;
			buyer.frames.sendMessage(buyer, "There was only " + amount + " of this item..");
			buyer.frames.sendMessage(buyer, "..you have yet to buy "+ (pi().invItemCount(buyer, id) - amount)+ "of this item.");
		}
		if (buy <= 0)
		{
			buyer.frames.sendMessage(buyer, "You should specify an amount on how much you'd like to buy..");
			return false;
		}
		if (pi().invItemCount(buyer, 995) < getPrice(buy))
		{
			buyer.frames.sendMessage(buyer, "This item costs " + getPrice(buy) + ", you do not have enough coins..");
			return false;
		}
		bought = sell(buyer, buy);
		return bought;
	}

	public Player owner()
	{
		return owner;
	}
}