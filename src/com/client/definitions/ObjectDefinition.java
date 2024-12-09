package com.client.definitions;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;

import com.client.Class36;
import com.client.Client;
import com.client.MRUNodes;
import com.client.Model;
import com.client.OnDemandFetcher;
import com.client.Stream;
import com.client.StreamLoader;

public final class ObjectDefinition {

    protected Object runGetter(Field field, Object o) {
        for (Method method : o.getClass().getMethods()) {
            if (((method.getName().startsWith("get")) || method.getName().startsWith("is"))
                    && ((method.getName().length() == (field.getName().length() + 3))
                    || (method.getName().length() == (field.getName().length() + 2)))) {
                if (method.getName().toLowerCase().endsWith(field.getName().toLowerCase())) {
                    try {
                        Logger.getGlobal().info("Invoking Method: " + method.getName());
                        return method.invoke(o);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        Logger.getGlobal().severe("Could not determine method: " + method.getName());
                    }

                }
            }
        }
        return null;
    }

    public static int getTotalObjects() {
        return totalObjects;
    }

    public short[] getOriginalTexture() {
        return originalTexture;
    }

    public short[] getModifiedTexture() {
        return modifiedTexture;
    }

    public boolean isaBoolean736() {
        return aBoolean736;
    }

    public byte getaByte742() {
        return aByte742;
    }

    public byte getaByte737() {
        return aByte737;
    }

    public int getAnInt738() {
        return anInt738;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getVarpId() {
        return varpId;
    }

    public int getAnInt745() {
        return anInt745;
    }

    public int getAnInt746() {
        return anInt746;
    }

    public int[] getOriginalModelColors() {
        return originalModelColors;
    }

    public int getThickness() {
        return thickness;
    }

    public int getConfigId() {
        return configId;
    }

    public boolean isaBoolean751() {
        return aBoolean751;
    }

    public static boolean isLowMem() {
        return lowMem;
    }

    public static Stream getStream() {
        return stream;
    }

    public int getType() {
        return type;
    }

    public static int[] getStreamIndices() {
        return streamIndices;
    }

    public boolean isaBoolean757() {
        return aBoolean757;
    }

    public int getAnInt758() {
        return anInt758;
    }

    public int[] getChildrenIDs() {
        return childrenIDs;
    }

    public int getAnInt760() {
        return anInt760;
    }

    public int getAnInt761() {
        return anInt761;
    }

    public boolean isaBoolean762() {
        return aBoolean762;
    }

    public boolean isaBoolean764() {
        return aBoolean764;
    }

    public static Client getClientInstance() {
        return clientInstance;
    }

    public boolean isaBoolean766() {
        return aBoolean766;
    }

    public boolean isaBoolean767() {
        return aBoolean767;
    }

    public int getAnInt768() {
        return anInt768;
    }

    public boolean isaBoolean769() {
        return aBoolean769;
    }

    public static int getCacheIndex() {
        return cacheIndex;
    }

    public int getHeight() {
        return height;
    }

    public int[] getAnIntArray773() {
        return anIntArray773;
    }

    public int getAnInt774() {
        return anInt774;
    }

    public int getAnInt775() {
        return anInt775;
    }

    public int[] getAnIntArray776() {
        return anIntArray776;
    }

    public String getDescription() {
        return description;
    }

    public boolean isHasActions() {
        return hasActions;
    }

    public boolean isaBoolean779() {
        return aBoolean779;
    }

    public static MRUNodes getMruNodes2() {
        return mruNodes2;
    }

    public int getAnimation() {
        return animation;
    }

    public static ObjectDefinition[] getCache() {
        return cache;
    }

    public int getAnInt783() {
        return anInt783;
    }

    public int[] getModifiedModelColors() {
        return modifiedModelColors;
    }

    public static MRUNodes getMruNodes1() {
        return mruNodes1;
    }

    public String[] getActions() {
        return actions;
    }

    public void applyTexturing(Model m, int id) {
        if (id == 26764)
            m.setTexture(26);
    }

    private static void createHerb(ObjectDefinition def, String name, int[] newColors) {
        def.anIntArray773 = ObjectDefinition.forID(8143).anIntArray773;
        def.name = name;
        def.actions = new String[]{"Forage", null, null, null, null};
        def.modifiedModelColors = new int[]{20364, 19988, 19992};
        if (newColors != null) {
            def.originalModelColors = newColors;//new int[] {25505, 25496,  25496};
        }
    }

    public static void createForagable(ObjectDefinition definition, String name, String description) {
        definition.name = name;
        definition.actions = new String[]{"Forage", null, null, null, null};
        definition.description = description;
    }

    private static void copyDef(ObjectDefinition newDefinition, ObjectDefinition baseDefinition) {
        newDefinition.name = baseDefinition.name;
        newDefinition.anIntArray773 = baseDefinition.anIntArray773;
        newDefinition.description = baseDefinition.description;
        newDefinition.originalModelColors = baseDefinition.originalModelColors;
        newDefinition.modifiedModelColors = baseDefinition.modifiedModelColors;
        newDefinition.width = baseDefinition.width;
        newDefinition.height = baseDefinition.height;
        newDefinition.configId = baseDefinition.configId;
        newDefinition.anInt758 = baseDefinition.anInt758;
        newDefinition.varpId = baseDefinition.varpId;
        newDefinition.actions = baseDefinition.actions;
        newDefinition.animation = baseDefinition.animation;
        newDefinition.anInt761 = baseDefinition.anInt761;
        newDefinition.aByte742 = baseDefinition.aByte742;
        newDefinition.aByte737 = baseDefinition.aByte737;
        newDefinition.aBoolean736 = baseDefinition.aBoolean736;
        newDefinition.modifiedTexture = baseDefinition.modifiedTexture;
        newDefinition.originalTexture = baseDefinition.originalTexture;
    }


    public static ObjectDefinition forID(int i) {
        if (i > streamIndices.length)
            i = streamIndices.length - 2;

        if (i == 25913 || i == 25916 || i == 25917)
            i = 15552;

        for (int j = 0; j < 20; j++)
            if (cache[j].type == i)
                return cache[j];

        cacheIndex = (cacheIndex + 1) % 20;
        ObjectDefinition objectDef = cache[cacheIndex];
        stream.currentOffset = streamIndices[i];
        objectDef.type = i;
        objectDef.setDefaults();
        objectDef.readValues(stream);
        if (i >= 26281 && i <= 26290) {
            objectDef.actions = new String[]{"Choose", null, null, null, null};
        }
        if(i >= 29180 && i <= 29225) {
            objectDef.actions = new String[]{"Admire", "Buy", null, null, null};
            objectDef.aBoolean767 = false;
            objectDef.aBoolean757 = false;
            objectDef.aBoolean779 = false;
        }
        switch (i) {
            case 6799:
                objectDef.name = "Artisan's crafting station";
                objectDef.description = "A highly efficient work station";
                objectDef.actions = new String[]{"Craft", "Check", "Add Tickets", null, null};
                break;
            case 114:
                objectDef.actions = new String[]{"Cook", null, null, null, null};
                break;
            case 2611:
                objectDef.actions = new String[]{"Add Items", null, null, null, null};
                break;
            case 7528:
                objectDef.actions = new String[]{"Brew", "Open Inventory", null, null, null};
                break;
            case 13542:
                objectDef.name = "Chef's range";
                objectDef.description = "A highly efficient work station";
                objectDef.actions = new String[]{"Cook", "Check", "Add Tickets", null, null};
                break;
            case 878:
                objectDef.name = "Herbalist's well";
                objectDef.description = "A highly efficient work station";
                objectDef.actions = new String[]{"Fill", "Check", "Add Tickets", null, null};
                break;
            case 15931:
                objectDef.actions = new String[]{"Deposit", null,null, null, null};
                break;
            case 1363:
                objectDef.actions = new String[]{"Chop", null,null, null, null};
                break;
            case 15468:
                objectDef.name = "Artisan's sawmill";
                objectDef.description = "A highly efficient work station";
                objectDef.actions = new String[]{"Cut", "Check", "Add Tickets", null, null};
                break;
            case 11017:
                objectDef.name = "Pyromancer's brazier";
                objectDef.description = "A highly efficient work station";
                objectDef.actions = new String[]{"Burn", "Check", "Add Tickets", null, null};
                break;
            case 13520:
                objectDef.name = "Boss Instance Portal";
                break;
            case 13636:
                objectDef.description = "A strange energy emanates from this.";
                objectDef.actions = new String[]{"Open Rift", null, null, null, null};
                break;
            case 2279:
                objectDef.name = "Upgrade Workbench";
                objectDef.description = "A workbench for upgrading items";
                objectDef.actions = new String[]{"Upgrade", null, null, null, null};
                break;
            case 13637:
                copyDef(objectDef,forID(13636));
                objectDef.description = "A strange energy emanates from this.";
                objectDef.actions = new String[]{"Open Instance", null, null, null, null};
                break;
            case 13619:
                copyDef(objectDef,forID(13619));
                objectDef.name = "Tomb Raider Portal";
                objectDef.description = "A portal to your private instance";
                objectDef.actions = new String[]{"Enter", "Close", null, null, null};
                break;
            case 13638:
                copyDef(objectDef,forID(13637));
                objectDef.name = "Tomb Raider Portal";
                objectDef.description = "A strange energy emanates from this.";
                objectDef.actions = new String[]{"Open Instance", null, null, null, null};
                break;
            case 13620:
                copyDef(objectDef,forID(13620));
                objectDef.name = "Boss Instance Portal";
                objectDef.description = "A portal to your private instance";
                objectDef.actions = new String[]{"Enter", "Close", null, null, null};
                break;
            case 567:
                objectDef.description = "A strange energy emanates from this.";
                objectDef.actions = new String[]{"Teleport", null, null, null, null};
                break;
            case 10621:
                objectDef.name = "Shining Chest";
                objectDef.description = "I should use my @blu@Shiny Keys @bla@on this.";
                break;
            case 4126:
                objectDef.name = "Shining Chest";
                objectDef.description = "I should use my @blu@Shiny Keys @bla@on this.";
                objectDef.actions = new String[]{"Open", "Redeem", null, null, null};
                break;
            case 2282:
                objectDef.name = "Furnace";
                objectDef.actions = new String[]{"Smelt", null, null, null, null};
                break;
            case 6945:
                objectDef.actions = new String[]{"Bank", "Exchange", "Collect", "Redeem", "Redeem"};
                break;
            case 2887:
                copyDef(objectDef,ObjectDefinition.forID(1304));
                objectDef.name = "Cinnamon Tree";
                objectDef.actions = new String[]{"Chop", null, null, null, null};
                objectDef.description = "A rare tree";
                break;
            case 7855:
                createForagable(objectDef,"Limpwurt plant","A warm climate foragable.");
                break;
            case 7725:
                createForagable(objectDef,"Whiteberry bush","A warm climate foragable.");
                break;
            case 8621:
                createForagable(objectDef,"Snape Grass","A hot climate foragable.");
                objectDef.modifiedModelColors = new int[]{14786, 21978, 14897, 8148};
                objectDef.originalModelColors = new int[]{29481, 29481, 28512, 29481};
//                28512
                break;
            case 7134:
                createForagable(objectDef,"Mort Myre Fungus","A foragable native to wetlands.");
                break;
            case 7757:
                createForagable(objectDef,"Cactus","A hot and dry climate foragable.");
                break;
            case 1406:
                createForagable(objectDef,"Poato Cactus","A hot and dry climate foragable.");
                break;
            case 10157:
            case 26149:
                ObjectDefinition originalDef = ObjectDefinition.forID(26149);
                objectDef.anIntArray773 = new int[]{7427, 7428, 7426};
                objectDef.name = "Dimensional Rift";
                objectDef.animation = 2260;
                objectDef.actions = new String[]{"Teleport", null, null, null, null};
                break;
            case 28924:
                objectDef.anIntArray773 = new int[]{31600, 31657};
                objectDef.name = "Abyssal Seer";
                objectDef.animation = 1473;
                objectDef.actions = new String[]{"Teleport", null, null, null, null};
                objectDef.modifiedModelColors = new int[] {20364, 19988, 19992};
                objectDef.originalModelColors = new int[] {20364, 19988, 19992};
                break;
//            case 8132:
//                createHerb(objectDef, "Guam", new int[]{22428, 22418, 22428});
//                break;
//            case 8133:
//                createHerb(objectDef, "Marrentill", new int[]{22433, 22424, 22433});
//                break;
//            case 8134:
//                createHerb(objectDef, "Tarromin", new int[]{25505, 25496, 25496});
//                break;
//            case 8135:
//                createHerb(objectDef, "Harralander", new int[]{16289, 13204, 13204});
//                break;
//            case 8136:
//                createHerb(objectDef, "Ranarr Weed", new int[]{17304, 15250, 15250});
//                break;
//            case 8137:
//                createHerb(objectDef, "Toadflax", new int[]{22408, 22414, 22414});
//                break;
//            case 8138:
//                createHerb(objectDef, "Irit Leaf", new int[]{17961, 18974, 18974});
//                break;
//            case 8139:
//                createHerb(objectDef, "Avantoe", new int[]{24342, 25360, 25360});
//                break;
//            case 8140:
//                createHerb(objectDef, "Kwuarm", new int[]{13204, 14224, 14224});
//                break;
//            case 8141:
//                createHerb(objectDef, "Cadantine", new int[]{13974, 14866, 14866});
//                break;
//            case 8142:
//                createHerb(objectDef, "Snapdragon", new int[]{14226, 13212, 13212});
//                break;
//            case 8144:
//                createHerb(objectDef, "Lantadyme", new int[]{27548, 30610, 30610});
//                break;
//            case 8145:
//                createHerb(objectDef, "Dwarf Weed", new int[]{22416, 22414, 22414});
//                break;
//            case 8146:
//                createHerb(objectDef, "Torstol", new int[]{22422, 22416, 22416});
//                break;
//            case 8147:
//                createHerb(objectDef, "Bloodweed", new int[]{947, 822, 925});
//                objectDef.description = "A rare herb containing a thick blood like substance.";
//                break;
            case 15420:
                objectDef.actions = new String[]{"Build", null, null, null, null};
                break;
            case 20928:
                objectDef.name = "Fishing Spot";
                objectDef.actions = new String[]{"Lure", "Bait", null, null, null};
                break;
            case 20930:
                objectDef.name = "Fishing Spot";
                objectDef.actions = new String[]{"Net", null, null, null, null};
                break;
            case 20929:
                objectDef.name = "Fishing Spot";
                objectDef.actions = new String[]{"Cage", "Harpoon", null, null, null};
                break;
            case 20926:
                objectDef.name = "Fishing Spot";
//				objectDef.anIntArray773 = new int[] { 20928 };
                objectDef.actions = new String[]{"Net", "Harpoon", null, null, null};
                break;
            case 28496:
                objectDef.name = "@yel@Fairy Rock";
                objectDef.description = "A bit too yellow isnt it?";
                break;

            //DeadlyChest
            case 27288:
                objectDef.name = "@red@Deadly Chest";
                break;
            //EndDeadlyChest
//		case 8207:
//			objectDef.actions = new String[] { "Care-To", null, null, null, null };
//			objectDef.name = "Herb Patch";
//			break;
//			case 8720:
//				objectDef.name = "Vote shop";
//				break;
//		case 8210:
//			objectDef.actions = new String[] { "Rake", null, null, null, null };
//			objectDef.name = "Herb Patch";
//			break;
//			case 29150:
//				objectDef.actions = new String[] { "Venerate", null, null, null, null };
//				break;
//		case 8139:
//		case 8140:
//		case 8141:
//		case 8142:
//			objectDef.actions = new String[] { "Inspect", null, null, null, null };
//			objectDef.name = "Herbs";
//			break;
            case 3840:
                objectDef.actions = new String[5];
                objectDef.actions[0] = "Fill";
                objectDef.actions[1] = "Empty-From";
                objectDef.name = "Compost Bin";
                break;
            case 172:
                objectDef.name = "Ckey chest";
                break;
            case 12309:
                objectDef.actions = new String[5];
                objectDef.actions[0] = "Bank";
                objectDef.actions[1] = "Buy gloves";
                objectDef.actions[2] = null;
                objectDef.name = "Chest";
                break;
            case 22819:
            case 24101:
                objectDef.actions[2] = "Trading Post";
                break;

            case 1750:
                objectDef.anIntArray773 = new int[]{8131,};
                objectDef.name = "Willow";
                objectDef.varpId = 2;
                objectDef.anInt761 = 2;
                objectDef.aByte737 = 25;
                objectDef.actions = new String[]{"Chop down", null, null, null, null};
                objectDef.anInt758 = 3;
                break;

            case 26782:
                objectDef.actions = new String[]{"Recharge", null, null, null, null};
                break;

            case 1751:
                objectDef.anIntArray773 = new int[]{8037, 8040,};
                objectDef.name = "Oak";
                objectDef.varpId = 3;
                objectDef.anInt761 = 3;
                objectDef.aByte737 = 25;
                objectDef.actions = new String[]{"Chop down", null, null, null, null};
                objectDef.anInt758 = 1;
                break;

            case 7814:
                objectDef.actions = new String[]{"Teleport", null, null, null, null};
                break;

            case 8356:
                objectDef.actions = new String[]{"Teleport", "Mt. Quidamortem", null, null, null};
                break;

            case 28900:
                objectDef.actions = new String[]{"Teleport", "Recharge Crystals", null, null, null};
                break;

            case 28837:
                objectDef.actions = new String[]{"Set Destination", null, null, null, null};
                break;

            case 7811:
                objectDef.name = "District Supplies";
                objectDef.actions = new String[]{"Blood Money", "Free", "Quick-Sets", null, null};
                break;

            case 1752:
                objectDef.anIntArray773 = new int[]{4146,};
                objectDef.name = "Hollow tree";
                objectDef.aByte737 = 25;
                objectDef.actions = new String[]{"Chop down", null, null, null, null};
                objectDef.originalModelColors = new int[]{13592, 10512,};
                objectDef.modifiedModelColors = new int[]{7056, 6674,};
                objectDef.anInt758 = 0;
                break;
            case 4873:
                objectDef.name = "Wilderness Lever";
                objectDef.varpId = 3;
                objectDef.anInt761 = 3;
                objectDef.aByte737 = 25;
                objectDef.actions = new String[]{"Enter Deep Wildy", null, null, null, null};
                objectDef.anInt758 = 3;
                break;
            case 29735:
                objectDef.name = "Basic Slayer Dungeon";
                break;
            case 2544:
                objectDef.name = "Dagannoth Manhole";
                break;
            case 29345:
                objectDef.name = "Training Teleports Portal";
                objectDef.actions = new String[]{"Teleport", null, null, null, null};
                break;
            case 29346:
                objectDef.name = "Wilderness Teleports Portal";
                objectDef.actions = new String[]{"Teleport", null, null, null, null};
                break;
            case 29347:
                objectDef.name = "Boss Teleports Portal";
                objectDef.actions = new String[]{"Teleport", null, null, null, null};
                break;
            case 29349:
                objectDef.name = "Mini-Game Teleports Portal";
                objectDef.actions = new String[]{"Teleport", null, null, null, null};
                break;
            case 4155:
                objectDef.name = "Zul Andra Portal";
                break;
            case 2123:
                objectDef.name = "Mt. Quidamortem Slayer Dungeon";
                break;
            case 4150:
                objectDef.name = "Warriors Guild Mini-game Portal";
                break;
            case 11803:
                objectDef.name = "Donator Slayer Dungeon";
                break;
            case 4151:
                objectDef.name = "Barrows Mini-game Portal";
                break;
            case 1753:
                objectDef.anIntArray773 = new int[]{8157,};
                objectDef.name = "Yew";
                objectDef.varpId = 3;
                objectDef.anInt761 = 3;
                objectDef.aByte737 = 25;
                objectDef.actions = new String[]{"Chop down", null, null, null, null};
                objectDef.anInt758 = 3;
                break;

            case 6943:
                objectDef.anIntArray773 = new int[]{1270,};
                objectDef.name = "Bank booth";
                objectDef.aBoolean757 = false;
                objectDef.aByte737 = 25;
                objectDef.aByte742 = 25;
                objectDef.actions = new String[]{null, "Bank", "Collect", null, null};
                break;

            case 25016:
            case 25017:
            case 25018:
            case 25029:
                objectDef.actions = new String[]{"Push-Through", null, null, null, null};
                break;

            case 19038:
                objectDef.actions = new String[]{null, null, null, null, null};
                objectDef.varpId = 3;
                objectDef.anInt761 = 3;
                objectDef.width = 340; // Width
                objectDef.thickness = 500; // Thickness
                objectDef.height = 400; // Height
                break;

            case 18826:
            case 18819:
            case 18818:
                objectDef.varpId = 3;
                objectDef.anInt761 = 3;
                objectDef.width = 200; // Width
                objectDef.thickness = 200; // Thickness
                objectDef.height = 100; // Height
                break;

            case 27777:
                objectDef.name = "Gangplank";
                objectDef.actions = new String[]{"Travel to CrabClaw Isle", null, null, null, null};
                objectDef.varpId = 1;
                objectDef.anInt761 = 1;
                objectDef.width = 80; // Width
                objectDef.thickness = 80; // Thickness
                objectDef.height = 250; // Height
                break;
            case 13641:
                objectDef.name = "Teleportation Device";
                objectDef.actions = new String[]{"Quick-Teleport", null, null, null, null};
                objectDef.varpId = 1;
                objectDef.anInt761 = 1;
                objectDef.width = 80; // Width
                objectDef.thickness = 80; // Thickness
                objectDef.height = 250; // Height
                break;
            case 5595:
            case 631:
            case 629:
            case 3860:
            case 4275:
                objectDef.actions = new String[]{null, "Steal-From", null, null, null};
                break;
            // bar stool test
            case 2312:
                objectDef.actions = new String[]{"sit", "sit", "sit", "sit", "sit"};
                break;
            case 13127:
                objectDef.actions = new String[]{null, null, null, null, null};
                break;
            case 13129:
                objectDef.actions = new String[]{null, "Enter", null, null, null};
                break;
            case 27095://lava dragon teleport
                objectDef.name = "Portal";
                objectDef.actions = new String[]{"Teleport Home", null, null, null, null};
                objectDef.varpId = 1;
                objectDef.anInt761 = 1;
                //objectDef.width = 80; // Width
                //objectDef.thickness = 80; // Thickness
                //objectDef.height = 250; // Height
                break;
            case 15439:
                objectDef.actions = new String[]{"Build", null, null, null, null};
                break;
            //Donator zone doors
            case 12617:
                objectDef.name = "Zone One";
                objectDef.actions = new String[]{"Enter", "Leave", null, null, null};
                objectDef.varpId = 1;
                objectDef.anInt761 = 1;
                objectDef.width = 80; // Width
                objectDef.thickness = 80; // Thickness
                objectDef.height = 250; // Height
                break;
            case 11987:
                objectDef.name = "Zone Two";
                objectDef.actions = new String[]{"Enter", "Leave", null, null, null};
                objectDef.varpId = 1;
                objectDef.anInt761 = 1;
                objectDef.width = 80; // Width
                objectDef.thickness = 80; // Thickness
                objectDef.height = 250; // Height
                break;
            case 12719:
                objectDef.name = "Zone Three";
                objectDef.actions = new String[]{"Enter", "Leave", null, null, null};
                objectDef.varpId = 1;
                objectDef.anInt761 = 1;
                objectDef.width = 80; // Width
                objectDef.thickness = 80; // Thickness
                objectDef.height = 250; // Height
                break;
            case 12639:
                objectDef.name = "Zone Four";
                objectDef.actions = new String[]{"Enter", "Leave", null, null, null};
                objectDef.varpId = 1;
                objectDef.anInt761 = 1;
                objectDef.width = 80; // Width
                objectDef.thickness = 80; // Thickness
                objectDef.height = 250; // Height
                break;

            case 11700:
                objectDef.anIntArray773 = new int[]{4086};
                objectDef.name = "Venom";
                objectDef.varpId = 3;
                objectDef.anInt761 = 3;
                objectDef.aBoolean767 = false;
                objectDef.aBoolean762 = true;
                objectDef.animation = 1261;
                objectDef.modifiedModelColors = new int[]{31636};
                objectDef.originalModelColors = new int[]{10543};
                objectDef.thickness = 160;
                objectDef.height = 160;
                objectDef.width = 160;
                objectDef.actions = new String[5];
                // objectDef.description = new String(
                // "It's a cloud of venomous smoke that is extremely toxic.");
                break;

            case 11601: // 11601
                objectDef.originalTexture = new short[]{2};
                objectDef.modifiedTexture = new short[]{46};
                break;
        }
        if (Client.debugModels) {

            if (objectDef.name == null || objectDef.name.equalsIgnoreCase("null"))
                objectDef.name = "test";

            objectDef.hasActions = true;
        }
        return objectDef;
    }

    public static void dumpList() {
        try {
            FileWriter fw = new FileWriter(System.getProperty("user.home") + "/Desktop/object_data.json");
            fw.write("[\n");
            for (int i = 0; i < totalObjects; i++) {
                ObjectDefinition def = ObjectDefinition.forID(i);
                String output = "[\"" + StringUtils.join(def.actions, "\", \"") + "\"],";

                String finalOutput = "	{\n" + "		\"id\": " + def.type + ",\n		" + "\"name\": \"" + def.name
                        + "\",\n		\"models\": " + Arrays.toString(def.anIntArray773) + ",\n		\"actions\": "
                        + output.replaceAll(", \"\"]", ", \"Examine\"]").replaceAll("\"\"", "null")
                        .replace("[\"null\"]", "[null, null, null, null, \"Examine\"]")
                        .replaceAll(", \"Remove\"", ", \"Remove\", \"Examine\"")
                        + "	\n		\"width\": " + def.width + "\n	},";
                fw.write(finalOutput.replaceAll("\"name\": \"null\",", "\"name\": null,"));

                // .replaceAll("\"name\": \"null\",", "\"name\": null,")
                fw.write(System.getProperty("line.separator"));
            }
            fw.write("]");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void objectDump() {
        try {
            FileWriter fw = new FileWriter(System.getProperty("user.home") + "/Desktop/Object Dump2.txt");
            for (int i = 0; i < totalObjects; i++) {
                ObjectDefinition obj = ObjectDefinition.forID(i);

                fw.write("case " + i + ":");
                fw.write(System.getProperty("line.separator"));
                Arrays.stream(obj.getClass().getFields()).forEach(field -> {
                    try {
                        if (!field.getName().equalsIgnoreCase("streamIndices") && !field.getName().equalsIgnoreCase("cache")) {
//                            System.out.println("Working on: " + field.getName());
                            if (field.getType().isArray()) {
                                if (field.getType().toString().equalsIgnoreCase("class [I")) {
                                    fw.write(field.getName() + "= " + Arrays.toString((int[]) field.get(obj)) + ";");
                                    fw.write(System.getProperty("line.separator"));
                                } else {
                                    try {
                                        fw.write(field.getName() + "= " + Arrays.toString((String[]) field.get(obj)) + ";");
                                        fw.write(System.getProperty("line.separator"));
                                    } catch (ClassCastException e) {
                                        fw.write(field.getName() + "= " + field.get(obj) + ";");
                                        fw.write(System.getProperty("line.separator"));
                                    }
                                }

                            } else {
                                fw.write(field.getName() + "= " + field.get(obj) + "\";");
                                fw.write(System.getProperty("line.separator"));
                            }
                        }
                    } catch (IOException | IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });

//                fw.write("case " + i + ":");
//                fw.write(System.getProperty("line.separator"));
//                fw.write("itemDef.name = \"" + obj.name + "\";");
//                fw.write(System.getProperty("line.separator"));
//                fw.write("itemDef.modelID= " + Arrays.toString(obj.anIntArray773) + ";");
//                fw.write(System.getProperty("line.separator"));
//                fw.write("itemDef.originalColors= " + Arrays.toString(obj.originalModelColors) + ";");
//                fw.write(System.getProperty("line.separator"));
//                fw.write("itemDef.modifiedColors= " + Arrays.toString(obj.modifiedModelColors) + ";");
//                fw.write(System.getProperty("line.separator"));
//                fw.write("itemDef.modifiedTexture= " + Arrays.toString(obj.modifiedTexture) + ";");
//                fw.write(System.getProperty("line.separator"));
//                fw.write("break;");
                fw.write(System.getProperty("line.separator"));
                fw.write(System.getProperty("line.separator"));
            }
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void applyTexture(Model model, int id) {
        switch (id) {
            case 26764:// Venenatis Webs
                model.setTexture(26);
                break;
        }
    }

    private void setDefaults() {
        anIntArray773 = null;
        anIntArray776 = null;
        name = null;
        description = null;
        modifiedModelColors = null;
        originalModelColors = null;
        // originalTexture = null;
        // modifiedTexture = null;
        varpId = 1;
        anInt761 = 1;
        aBoolean767 = true;
        aBoolean757 = true;
        hasActions = false;
        aBoolean762 = false;
        aBoolean769 = false;
        aBoolean764 = false;
        animation = -1;
        anInt775 = 16;
        aByte737 = 0;
        aByte742 = 0;
        actions = null;
        anInt746 = -1;
        anInt758 = -1;
        aBoolean751 = false;
        aBoolean779 = true;
        thickness = 128;
        height = 128;
        width = 128;
        anInt768 = 0;
        anInt738 = 0;
        anInt745 = 0;
        anInt783 = 0;
        aBoolean736 = false;
        aBoolean766 = false;
        anInt760 = -1;
        anInt774 = -1;
        configId = -1;
        childrenIDs = null;
    }

    public void method574(OnDemandFetcher class42_sub1) {
        if (anIntArray773 == null)
            return;
        for (int j = 0; j < anIntArray773.length; j++)
            class42_sub1.method560(anIntArray773[j] & 0xffff, 0);
    }

    public static void nullLoader() {
        mruNodes1 = null;
        mruNodes2 = null;
        streamIndices = null;
        cache = null;
        stream = null;
    }

    public static int totalObjects;

    public static void unpackConfig(StreamLoader streamLoader) {
        stream = new Stream(streamLoader.getDataForName("loc.dat"));
        Stream stream = new Stream(streamLoader.getDataForName("loc.idx"));
        totalObjects = stream.readUnsignedWord();
        streamIndices = new int[totalObjects];
        int i = 2;
        for (int j = 0; j < totalObjects; j++) {
            streamIndices[j] = i;
            i += stream.readUnsignedWord();
        }
        cache = new ObjectDefinition[20];
        for (int k = 0; k < 20; k++) {
            cache[k] = new ObjectDefinition();
        }
//        objectDump();
    }

    public boolean method577(int i) {
        if (anIntArray776 == null) {
            if (anIntArray773 == null)
                return true;
            if (i != 10)
                return true;
            boolean flag1 = true;
            Model model = (Model) mruNodes2.insertFromCache(type);
            for (int k = 0; k < anIntArray773.length; k++)
                flag1 &= Model.method463(anIntArray773[k] & 0xffff);
            applyTexturing(model, type);
            return flag1;
        }
        Model model = (Model) mruNodes2.insertFromCache(type);
        for (int j = 0; j < anIntArray776.length; j++)
            if (anIntArray776[j] == i)
                return Model.method463(anIntArray773[j] & 0xffff);
        applyTexturing(model, type);
        return true;
    }

    public Model modelAt(int i, int j, int k, int l, int i1, int j1, int k1) {
        Model model = method581(i, k1, j);
        if (model == null)
            return null;
        if (aBoolean762 || aBoolean769)
            model = new Model(aBoolean762, aBoolean769, model);
        if (aBoolean762) {
            int l1 = (k + l + i1 + j1) / 4;
            for (int i2 = 0; i2 < model.numVertices; i2++) {
                int j2 = model.vertexX[i2];
                int k2 = model.vertexZ[i2];
                int l2 = k + ((l - k) * (j2 + 64)) / 128;
                int i3 = j1 + ((i1 - j1) * (j2 + 64)) / 128;
                int j3 = l2 + ((i3 - l2) * (k2 + 64)) / 128;
                model.vertexY[i2] += j3 - l1;
            }

            model.method467();
        }
        return model;
    }

    public boolean method579() {
        if (anIntArray773 == null)
            return true;
        boolean flag1 = true;
        for (int i = 0; i < anIntArray773.length; i++)
            flag1 &= Model.method463(anIntArray773[i] & 0xffff);
        return flag1;
    }

    public ObjectDefinition method580() {
        int i = -1;
        if (anInt774 != -1) {
            VarBit varBit = VarBit.cache[anInt774];
            int setting = varBit.anInt648;
            int start = varBit.anInt649;
            int end = varBit.anInt650;
            int mask = Client.anIntArray1232[end - start];
            Logger.getGlobal().info("Setting Index: " + setting);
            Logger.getGlobal().info("Start: " + start);
            Logger.getGlobal().info("End: " + end);
            Logger.getGlobal().info("Mask: " + mask);
            Logger.getGlobal().info("Start & Mask: " + (start & mask));
            Logger.getGlobal().info("Setting Value: " + clientInstance.variousSettings[setting]);
            Logger.getGlobal().info("Setting Value Shift: " + (clientInstance.variousSettings[setting] >> start & mask));
            i = clientInstance.variousSettings[setting] >> start & mask;
            Logger.getGlobal().info("i = : " + i);
            Logger.getGlobal().info( "Ardougne Calculation: " + (setting + ((i + 1) << 8)));
        } else if (configId != -1)
            i = clientInstance.variousSettings[configId];
        if (i < 0 || i >= childrenIDs.length || childrenIDs[i] == -1)
            return null;
        else
            return forID(childrenIDs[i]);
    }

    private Model method581(int j, int k, int l) {
        Model model = null;
        long l1;
        if (anIntArray776 == null) {
            if (j != 10)
                return null;
            l1 = (type << 6) + l + ((long) (k + 1) << 32);
            Model model_1 = (Model) mruNodes2.insertFromCache(l1);
            if (model_1 != null)
                return model_1;
            applyTexture(model, type);
            if (anIntArray773 == null)
                return null;
            boolean flag1 = aBoolean751 ^ (l > 3);
            int k1 = anIntArray773.length;
            for (int i2 = 0; i2 < k1; i2++) {
                int l2 = anIntArray773[i2];
                if (flag1)
                    l2 += 0x10000;
                model = (Model) mruNodes1.insertFromCache(l2);
                if (model == null) {
                    model = Model.method462(l2 & 0xffff);
                    applyTexture(model, type);
                    if (model == null)
                        return null;
                    if (flag1)
                        model.method477();
                    mruNodes1.removeFromCache(model, l2);
                }
                if (k1 > 1)
                    aModelArray741s[i2] = model;
            }

            if (k1 > 1)
                model = new Model(k1, aModelArray741s);
        } else {
            int i1 = -1;
            for (int j1 = 0; j1 < anIntArray776.length; j1++) {
                if (anIntArray776[j1] != j)
                    continue;
                i1 = j1;
                break;
            }

            if (i1 == -1)
                return null;
            l1 = (type << 8) + (i1 << 3) + l + ((long) (k + 1) << 32);
            Model model_2 = (Model) mruNodes2.insertFromCache(l1);
            if (model_2 != null)
                return model_2;
            int j2 = anIntArray773[i1];
            boolean flag3 = aBoolean751 ^ (l > 3);
            if (flag3)
                j2 += 0x10000;
            model = (Model) mruNodes1.insertFromCache(j2);
            if (model == null) {
                model = Model.method462(j2 & 0xffff);
                applyTexture(model, type);// try
                if (model == null)
                    return null;
                if (flag3)
                    model.method477();
                mruNodes1.removeFromCache(model, j2);
            }
        }
        boolean flag;
        flag = thickness != 128 || height != 128 || width != 128;
        boolean flag2;
        flag2 = anInt738 != 0 || anInt745 != 0 || anInt783 != 0;
        Model model_3 = new Model(modifiedModelColors == null && modifiedTexture == null, Class36.method532(k),
                l == 0 && k == -1 && !flag && !flag2, model);
        if (k != -1) {
            model_3.method469();
            model_3.method470(k);
            model_3.faceGroups = null;
            model_3.vertexGroups = null;
        }
        while (l-- > 0)
            model_3.method473();
        if (modifiedModelColors != null) {
            for (int k2 = 0; k2 < modifiedModelColors.length; k2++)
                model_3.method476(modifiedModelColors[k2], originalModelColors[k2]);

        }
        if (modifiedTexture != null) {
            for (int k2 = 0; k2 < modifiedTexture.length; k2++)
                model_3.replaceTexture(modifiedTexture[k2], originalTexture[k2]);

        }
        if (flag)
            model_3.method478(thickness, width, height);
        if (flag2)
            model_3.method475(anInt738, anInt745, anInt783);
        // model_3.method479(64 + aByte737, 768 + aByte742 * 5, -50, -10, -50,
        // !aBoolean769);
        // ORIGINAL^

        model_3.method479(64 + aByte737, 768 + aByte742 * 5, -50, -10, -50, !aBoolean769);

        if (anInt760 == 1)
            model_3.itemDropHeight = model_3.modelHeight;
        mruNodes2.removeFromCache(model_3, l1);
        return model_3;
    }

    /*
     * private void readValues(Stream stream) { int i = -1; label0: do { int j; do {
     * j = stream.readUnsignedByte(); if (j == 0) break label0; if (j == 1) { int k
     * = stream.readUnsignedByte(); if (k > 0) if (anIntArray773 == null || lowMem)
     * { anIntArray776 = new int[k]; anIntArray773 = new int[k]; for (int k1 = 0; k1
     * < k; k1++) { anIntArray773[k1] = stream.readUnsignedWord(); anIntArray776[k1]
     * = stream.readUnsignedByte(); }
     *
     * } else { stream.currentOffset += k * 3; } } else if (j == 2) name =
     * stream.readString(); else if (j == 3) description = stream.readBytes(); else
     * if (j == 5) { int l = stream.readUnsignedByte(); if (l > 0) if (anIntArray773
     * == null || lowMem) { anIntArray776 = null; anIntArray773 = new int[l]; for
     * (int l1 = 0; l1 < l; l1++) anIntArray773[l1] = stream.readUnsignedWord();
     *
     * } else { stream.currentOffset += l * 2; } } else if (j == 14) anInt744 =
     * stream.readUnsignedByte(); else if (j == 15) anInt761 =
     * stream.readUnsignedByte(); else if (j == 17) aBoolean767 = false; else if (j
     * == 18) aBoolean757 = false; else if (j == 19) { i =
     * stream.readUnsignedByte(); if (i == 1) hasActions = true; } else if (j == 21)
     * aBoolean762 = true; else if (j == 22) aBoolean769 = false; else if (j == 23)
     * aBoolean764 = true; else if (j == 24) { animation =
     * stream.readUnsignedWord(); if (animation == 65535) animation = -1; } else if
     * (j == 28) anInt775 = stream.readUnsignedByte(); else if (j == 29) aByte737 =
     * stream.readSignedByte(); else if (j == 39) aByte742 =
     * stream.readSignedByte(); else if (j >= 30 && j < 35) { if (actions == null)
     * actions = new String[5]; actions[j - 30] = stream.readString(); if (actions[j
     * - 30].equalsIgnoreCase("hidden")) actions[j - 30] = null; } else if (j == 40)
     * { int i1 = stream.readUnsignedByte(); modifiedModelColors = new int[i1];
     * originalModelColors = new int[i1]; for (int i2 = 0; i2 < i1; i2++) {
     * modifiedModelColors[i2] = stream.readUnsignedWord(); originalModelColors[i2]
     * = stream.readUnsignedWord(); } } else if (j == 41) { int j2 =
     * stream.readUnsignedByte(); modifiedTexture = new short[j2]; originalTexture =
     * new short[j2]; for (int k = 0; k < j2; k++) { modifiedTexture[k] = (short)
     * stream.readUnsignedWord(); originalTexture[k] = (short)
     * stream.readUnsignedWord(); }
     *
     * } else if (j == 60) anInt746 = stream.readUnsignedWord(); else if (j == 62)
     * aBoolean751 = true; else if (j == 64) aBoolean779 = false; else if (j == 65)
     * thickness = stream.readUnsignedWord(); else if (j == 66) height =
     * stream.readUnsignedWord(); else if (j == 67) width =
     * stream.readUnsignedWord(); else if (j == 68) anInt758 =
     * stream.readUnsignedWord(); else if (j == 69) anInt768 =
     * stream.readUnsignedByte(); else if (j == 70) anInt738 =
     * stream.readSignedWord(); else if (j == 71) anInt745 =
     * stream.readSignedWord(); else if (j == 72) anInt783 =
     * stream.readSignedWord(); else if (j == 73) aBoolean736 = true; else if (j ==
     * 74) { aBoolean766 = true; } else { if (j != 75) continue; anInt760 =
     * stream.readUnsignedByte(); } continue label0; } while (j != 77); anInt774 =
     * stream.readUnsignedWord(); if (anInt774 == 65535) anInt774 = -1; anInt749 =
     * stream.readUnsignedWord(); if (anInt749 == 65535) anInt749 = -1; int j1 =
     * stream.readUnsignedByte(); childrenIDs = new int[j1 + 1]; for (int j2 = 0; j2
     * <= j1; j2++) { childrenIDs[j2] = stream.readUnsignedWord(); if
     * (childrenIDs[j2] == 65535) childrenIDs[j2] = -1; }
     *
     * } while (true); if (i == -1 && name != "null" && name != null) { hasActions =
     * anIntArray773 != null && (anIntArray776 == null || anIntArray776[0] == 10);
     * if (actions != null) hasActions = true; } if (aBoolean766) { aBoolean767 =
     * false; aBoolean757 = false; } if (anInt760 == -1) anInt760 = aBoolean767 ? 1
     * : 0; }
     */

    public void readValues(Stream stream) {
        int flag = -1;
        do {
            int type = stream.readUnsignedByte();
            if (type == 0)
                break;
            if (type == 1) {
                int len = stream.readUnsignedByte();
                if (len > 0) {
                    if (anIntArray773 == null || lowMem) {
                        anIntArray776 = new int[len];
                        anIntArray773 = new int[len];
                        for (int k1 = 0; k1 < len; k1++) {
                            anIntArray773[k1] = stream.readUnsignedWord();
                            anIntArray776[k1] = stream.readUnsignedByte();
                        }
                    } else {
                        stream.currentOffset += len * 3;
                    }
                }
            } else if (type == 2)
                name = stream.readString();
            else if (type == 3)
                description = stream.readString();
            else if (type == 5) {
                int len = stream.readUnsignedByte();
                if (len > 0) {
                    if (anIntArray773 == null || lowMem) {
                        anIntArray776 = null;
                        anIntArray773 = new int[len];
                        for (int l1 = 0; l1 < len; l1++)
                            anIntArray773[l1] = stream.readUnsignedWord();
                    } else {
                        stream.currentOffset += len * 2;
                    }
                }
            } else if (type == 14)
                varpId = stream.readUnsignedByte();
            else if (type == 15)
                anInt761 = stream.readUnsignedByte();
            else if (type == 17)
                aBoolean767 = false;
            else if (type == 18)
                aBoolean757 = false;
            else if (type == 19)
                hasActions = (stream.readUnsignedByte() == 1);
            else if (type == 21)
                aBoolean762 = true;
            else if (type == 22)
                aBoolean769 = true;
            else if (type == 23)
                aBoolean764 = true;
            else if (type == 24) { // Object Animations
                animation = stream.readUnsignedWord();
                if (animation == 65535)
                    animation = -1;
            } else if (type == 28)
                anInt775 = stream.readUnsignedByte();
            else if (type == 29)
                aByte737 = stream.readSignedByte();
            else if (type == 39)
                aByte742 = stream.readSignedByte();
            else if (type >= 30 && type < 39) {
                if (actions == null)
                    actions = new String[9];
                actions[type - 30] = stream.readString();
                if (actions[type - 30].equalsIgnoreCase("hidden"))
                    actions[type - 30] = null;
            } else if (type == 40) {
                int i1 = stream.readUnsignedByte();
                modifiedModelColors = new int[i1];
                originalModelColors = new int[i1];
                for (int i2 = 0; i2 < i1; i2++) {
                    modifiedModelColors[i2] = stream.readUnsignedWord();
                    originalModelColors[i2] = stream.readUnsignedWord();
//                    System.out.println("Color: " + originalModelColors[i2]);

                }
            } else if (type == 41) {
                int i1 = stream.readUnsignedByte();
                originalTexture = new short[i1];
                modifiedTexture = new short[i1];
                for (int i2 = 0; i2 < i1; i2++) {
                    originalTexture[i2] = (short) stream.readUnsignedWord();
                    modifiedTexture[i2] = (short) stream.readUnsignedWord();
                }
            } else if (type == 82)
                anInt746 = stream.readUnsignedWord();
            else if (type == 62)
                aBoolean751 = true;
            else if (type == 64)
                aBoolean779 = false;
            else if (type == 65)
                thickness = stream.readUnsignedWord();
            else if (type == 66)
                height = stream.readUnsignedWord();
            else if (type == 67)
                width = stream.readUnsignedWord();
            else if (type == 68)
                anInt758 = stream.readUnsignedWord();
            else if (type == 69)
                anInt768 = stream.readUnsignedByte();
            else if (type == 70)
                anInt738 = stream.readSignedWord();
            else if (type == 71)
                anInt745 = stream.readSignedWord();
            else if (type == 72)
                anInt783 = stream.readSignedWord();
            else if (type == 73)
                aBoolean736 = true;
            else if (type == 74)
                aBoolean766 = true;
            else if (type == 75)
                anInt760 = stream.readUnsignedByte();
            else if (type == 77) {
                anInt774 = stream.readUnsignedWord();
                if (anInt774 == 65535)
                    anInt774 = -1;
                configId = stream.readUnsignedWord();
                if (configId == 65535)
                    configId = -1;
                int j1 = stream.readUnsignedByte();
                childrenIDs = new int[j1 + 1];
                for (int j2 = 0; j2 <= j1; j2++) {
                    childrenIDs[j2] = stream.readUnsignedWord();
                    if (childrenIDs[j2] == 65535)
                        childrenIDs[j2] = -1;
                }
            }
        } while (true);
        if (flag == -1 && name != "null" && name != null) {
            hasActions = anIntArray773 != null && (anIntArray776 == null || anIntArray776[0] == 10);
            if (actions != null)
                hasActions = true;
        }
        if (aBoolean766) {
            aBoolean767 = false;
            aBoolean757 = false;
        }
        if (anInt760 == -1)
            anInt760 = aBoolean767 ? 1 : 0;
    }

    private ObjectDefinition() {
        type = -1;
    }

    public short[] originalTexture;
    public short[] modifiedTexture;
    public boolean aBoolean736;
    @SuppressWarnings("unused")
    public byte aByte742;
    @SuppressWarnings("unused")
    public byte aByte737;
    public int anInt738;
    public String name;
    public int width;
    private static final Model[] aModelArray741s = new Model[4];
    public int varpId;
    public int anInt745;
    public int anInt746;
    public int[] originalModelColors;
    public int thickness;
    public int configId;
    public boolean aBoolean751;
    public static boolean lowMem;
    private static Stream stream;
    public int type;
    public static int[] streamIndices;
    public boolean aBoolean757;
    public int anInt758;
    public int childrenIDs[];
    public int anInt760;
    public int anInt761;
    public boolean aBoolean762;
    public boolean aBoolean764;
    public static Client clientInstance;
    public boolean aBoolean766;
    public boolean aBoolean767;
    public int anInt768;
    public boolean aBoolean769;
    public static int cacheIndex;
    public int height;
    public int[] anIntArray773;
    public int anInt774;
    public int anInt775;
    public int[] anIntArray776;
    public String description;
    public boolean hasActions;
    public boolean aBoolean779;
    public static MRUNodes mruNodes2 = new MRUNodes(30);
    public int animation;
    private static ObjectDefinition[] cache;
    public int anInt783;
    public int[] modifiedModelColors;
    public static MRUNodes mruNodes1 = new MRUNodes(500);
    public String actions[];

}
