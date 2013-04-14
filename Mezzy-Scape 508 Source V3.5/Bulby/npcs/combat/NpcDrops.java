/*
 * Class NpcDrops
 *
 * Version 1.0
 *
 * Saturday, September 20, 2008
 *
 * Created by Stricken716
 */

package palidino76.rs2.npcs.combat;

import palidino76.rs2.Engine;
import palidino76.rs2.players.Player;
import palidino76.rs2.util.Misc;
import palidino76.rs2.npcs.NPC;


public class NpcDrops {
public static int randomZamorak[] = {10468, 10460, 11700, 6737, 6585, 7462, 4131, 8291, 9100, 9103, 9232, 9233, 9235, 9234, 9809, 536};

public static int getZamorakDrop() {
	return randomZamorak[(int)(Math.random()*randomZamorak.length)];
}
public static int randomJad[] = {6570};

public static int getJadDrop() {
	return randomJad[(int)(Math.random()*randomJad.length)];
}
public static int randomBandos[] = {11696, 6737, 6585, 7462, 4131, 11724, 11726, 11728, 536};

public static int getBandosDrop() {
	return randomBandos[(int)(Math.random()*randomBandos.length)];
}

public static int randomObby[] = {6522, 6523, 6524, 6525, 6526, 6527};

public static int getObbyDrop() {
	return randomObby[(int)(Math.random()*randomObby.length)];
}
public static int randomSaradomin[] = {6737, 6585, 7462, 4131, 10464, 10458, 11730, 11698, 9236, 9237, 9238, 9239, 9101, 9098, 9810, 536};

public static int getSaradominDrop() {
	return randomSaradomin[(int)(Math.random()*randomSaradomin.length)];
}
public static int randomArmadyl[] = {6737, 6585, 7462, 4131, 11720, 11694, 11718, 11722, 9196, 14844, 14774, 9194, 536};

public static int getArmadylDrop() {
	return randomArmadyl[(int)(Math.random()*randomArmadyl.length)];
}
public static int randomKbd[] = {11284, 4587, 11732, 536};

	public static int getKbdDrop() {
		return randomKbd[(int)(Math.random()*randomKbd.length)];
	}
	public static int randomKalphite[] = {536, 11284, 7158, 11732, 1187, 1377, 3140, 11335, 1305, 1434, 4087, 4585, };

	public static int getKalphiteDrop() {
		return randomKalphite[(int)(Math.random()*randomKalphite.length)];
	}
public void npcDrop(Player p) {
NPC n2 = Engine.npcs[p.attackNPC];


	if (n2.npcType == 6260) {
	Engine.items.createGroundItem(NpcDrops.getBandosDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
	p.points += 1;
	p.frames.sendMessage(p, "You now have " + p.points + " bandos kills");		
}	
	if (n2.npcType == 6261) {
	Engine.items.createGroundItem(NpcDrops.getBandosDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
	p.points += 1;
	p.frames.sendMessage(p, "You now have " + p.points + " bandos kills");		
}	
	if (n2.npcType == 6263) {
	Engine.items.createGroundItem(NpcDrops.getBandosDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
	p.points += 1;
	p.frames.sendMessage(p, "You now have " + p.points + " bandos kills");		
}	
	if (n2.npcType == 6265) {
Engine.items.createGroundItem(NpcDrops.getBandosDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
	p.points += 1;
	p.frames.sendMessage(p, "You now have " + p.points + " bandos kills");		
}	
	if (n2.npcType == 6203) {
	Engine.items.createGroundItem(NpcDrops.getZamorakDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
	}
	if (n2.npcType == 6204) {
	Engine.items.createGroundItem(NpcDrops.getZamorakDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
	}
	if (n2.npcType == 6206) {
	Engine.items.createGroundItem(NpcDrops.getZamorakDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
	}
	if (n2.npcType == 6208) {
Engine.items.createGroundItem(NpcDrops.getZamorakDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	
	if (n2.npcType == 2745) {
Engine.items.createGroundItem(NpcDrops.getJadDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	if (n2.npcType == 1153) {
Engine.items.createGroundItem(NpcDrops.getKalphiteDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	if (n2.npcType == 1154) {
Engine.items.createGroundItem(NpcDrops.getKalphiteDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	if (n2.npcType == 1155) {
Engine.items.createGroundItem(NpcDrops.getKalphiteDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	if (n2.npcType == 1156) {
	Engine.items.createGroundItem(NpcDrops.getKalphiteDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	if (n2.npcType == 1157) {
	Engine.items.createGroundItem(NpcDrops.getKalphiteDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	if (n2.npcType == 3835) {
	Engine.items.createGroundItem(NpcDrops.getKalphiteDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	if (n2.npcType == 3836) {
Engine.items.createGroundItem(NpcDrops.getKalphiteDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	if (n2.npcType == 2629) {
		Engine.items.createGroundItem(NpcDrops.getObbyDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	if (n2.npcType == 2627) {
Engine.items.createGroundItem(NpcDrops.getObbyDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	if (n2.npcType == 2738) {
	Engine.items.createGroundItem(NpcDrops.getObbyDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	if (n2.npcType == 2631) {
Engine.items.createGroundItem(NpcDrops.getObbyDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	if (n2.npcType == 6247) {
Engine.items.createGroundItem(NpcDrops.getSaradominDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	if (n2.npcType == 6248) {
Engine.items.createGroundItem(NpcDrops.getSaradominDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	if (n2.npcType == 6250) {
	Engine.items.createGroundItem(NpcDrops.getSaradominDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	if (n2.npcType == 6252) {
Engine.items.createGroundItem(NpcDrops.getSaradominDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	if (n2.npcType == 6222) {
Engine.items.createGroundItem(NpcDrops.getArmadylDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	if (n2.npcType == 6223) {
Engine.items.createGroundItem(NpcDrops.getArmadylDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	if (n2.npcType == 6225) {
	Engine.items.createGroundItem(NpcDrops.getArmadylDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	if (n2.npcType == 6227) {
Engine.items.createGroundItem(NpcDrops.getArmadylDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}
	if (n2.npcType == 50) {
Engine.items.createGroundItem(NpcDrops.getKbdDrop(), 1, n2.absX, n2.absY, p.heightLevel, p.username);
}

	}
		}