package com.client;

import java.io.*;
import java.util.ArrayList;
import com.client.sign.Signlink;

public class GroundItemColors implements Serializable {
    private static final long serialVersionUID = 1L;

    public int itemColor = 0xffffff;
    public int itemId = 0;

    public GroundItemColors(int id, int color) {
        this.itemId = id;
        this.itemColor = color;
    }

    public static void saveGroundItems(ArrayList<GroundItemColors> itemColors) {
        try {
            File file = new File(Signlink.getCacheDirectory() + "grounditems.ser");
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(itemColors);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static void loadGroundItems() {
        File file = new File(Signlink.getCacheDirectory() + "grounditems.ser");
        if (!file.exists()) {
            System.err.println("grounditems.ser file not found.");
            return;
        }

        ArrayList<GroundItemColors> itemColors = null;
        try {
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            itemColors = (ArrayList<GroundItemColors>) in.readObject();
            in.close();
            fileIn.close();
            Client.groundItemColors = itemColors;
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
    }
}
