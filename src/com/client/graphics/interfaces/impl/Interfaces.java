package com.client.graphics.interfaces.impl;

import com.client.*;
import com.client.definitions.ItemDefinition;
import com.client.features.gameframe.ScreenMode;
import com.client.graphics.interfaces.RSInterface;
import com.client.graphics.loaders.SpriteLoader;
import com.client.runehub.RunehubUtils;
import org.runehub.api.util.SkillDictionary;

import java.text.NumberFormat;
import java.util.Arrays;

public class Interfaces extends RSInterface {

    public static void loadInterfaces(TextDrawingArea[] textDrawingAreas) {
        wrathRune();
        GrandExchange.initializeInterfaces(defaultTextDrawingAreas);
        settingsInterface(defaultTextDrawingAreas);
        pointCounter(defaultTextDrawingAreas);
        mysteryBox(defaultTextDrawingAreas);
        shopWidget(defaultTextDrawingAreas);
        barrowsReward(defaultTextDrawingAreas);
        keybinding(defaultTextDrawingAreas);
        ancients(defaultTextDrawingAreas);
        questTab(defaultTextDrawingAreas);
        caelTournamentSupplies(defaultTextDrawingAreas);
        infoTab(defaultTextDrawingAreas);
        teleport(defaultTextDrawingAreas); // Michael - Was "Detailedteleport"
        safeBox(defaultTextDrawingAreas);
        helpDatabaseComponent(defaultTextDrawingAreas);
        helpComponent(defaultTextDrawingAreas);
        groundItemCustomizing(defaultTextDrawingAreas);
        staffInterface(defaultTextDrawingAreas);
        staffInterfaceBank(defaultTextDrawingAreas);
        teleBook(defaultTextDrawingAreas); // Michael - Tele book added
        teleportationInterface(defaultTextDrawingAreas);
        bank(defaultTextDrawingAreas);
        bankPin(defaultTextDrawingAreas);
        slayerInterface(defaultTextDrawingAreas);
        slayerInterfaceSub1(defaultTextDrawingAreas);
        slayerInterfaceSub2(defaultTextDrawingAreas);
        PVPInterface3(defaultTextDrawingAreas);
        PVPInterface(defaultTextDrawingAreas);
        PVPInterface2(defaultTextDrawingAreas);
        PVPInterface3(defaultTextDrawingAreas);
        clanChatTab(defaultTextDrawingAreas);
        clanChatSetup(defaultTextDrawingAreas);
        itemsKeptOnDeath(defaultTextDrawingAreas);
        SettingsWidget.widget(defaultTextDrawingAreas);
        emoteTab();
        bountyHunterWidget(defaultTextDrawingAreas);
        godWars(defaultTextDrawingAreas);
        spawnTab(defaultTextDrawingAreas);
        prayerBook(defaultTextDrawingAreas);
        equipmentScreen(defaultTextDrawingAreas);
        equipmentTab(defaultTextDrawingAreas);
        itemsOnDeathDATA(defaultTextDrawingAreas);
        itemsOnDeath(defaultTextDrawingAreas);
        Pestpanel(defaultTextDrawingAreas);
        Pestpanel2(defaultTextDrawingAreas);
        configureLunar(defaultTextDrawingAreas);
        achievements(defaultTextDrawingAreas);
        rift(defaultTextDrawingAreas);
        updateShopWidget(defaultTextDrawingAreas);
        teleportation(defaultTextDrawingAreas);
        preloadEquipmentWidget(defaultTextDrawingAreas);
        initializeTitleWidget(defaultTextDrawingAreas);
        initializeCommandHelp();
        addPestControlRewardWidget(defaultTextDrawingAreas);
        addModerateWidget(defaultTextDrawingAreas);
        addAntibotWidget(defaultTextDrawingAreas);
        ironmanWidget(defaultTextDrawingAreas);
        addGodwarsWidget(defaultTextDrawingAreas);
        barrowsKillcount(defaultTextDrawingAreas);
        lootingBag(defaultTextDrawingAreas);
        lootingBagAdd(defaultTextDrawingAreas);
        runePouch(defaultTextDrawingAreas);
        quickPrayers(defaultTextDrawingAreas);
        wellOfGoodWill(defaultTextDrawingAreas);
        listings(defaultTextDrawingAreas);
        tradingpost(defaultTextDrawingAreas);
        tradingSelect(defaultTextDrawingAreas);
        offer(defaultTextDrawingAreas);
        tradingSelected(defaultTextDrawingAreas);
        skotizo(defaultTextDrawingAreas);
        slayerOverlay(defaultTextDrawingAreas);
        Teleporting(defaultTextDrawingAreas);
        prestigeInterface(defaultTextDrawingAreas);
        LoginInterface();
        expLock(defaultTextDrawingAreas);
        addStaffSpecialWidget();
        skillTabWithHovers(defaultTextDrawingAreas);
        normals(defaultTextDrawingAreas);
        wushankoTeleportCharge(textDrawingAreas);
        playPass(textDrawingAreas);
        addPlayerTab(textDrawingAreas);
        addQuestTab(textDrawingAreas);
        addAchievementTab(textDrawingAreas);
        addDnDTab(textDrawingAreas);
        addTab5(textDrawingAreas);
        addRiftSelection(textDrawingAreas);
        addSkillTab(textDrawingAreas);
//        runehubTeleport(textDrawingAreas);
        skillActionUI(textDrawingAreas);
        instanceTimer(textDrawingAreas);

        addSailingTradeSelectionUI(textDrawingAreas);
    }


    private static void instanceTimer(TextDrawingArea[] tda) {
        final String path = "Interfaces/runehub/tab/player/SPRITE";
        RSInterface tab = addTabInterface(57500);
        RSInterface scroll = addTabInterface(57550);
        addSprite(57506, 0, path);
        addText(57507, "Instances", tda, 2, 0xFFA500, true, true);

        addSprite(57513, 14, path);

        addText(57514, "Lorem Ipsum", tda, 2, 0xFFA500, true, true);
        addText(57515, "Lorem Ipsum", tda, 1, 0xFFA500, true, true);
        addText(57516, "Players", tda, 1, 0xFFA500, true, true);
        addProgressBar(57517, 167, 21, new int[]{0xA67711, 0x005F00});
        addClickableText(57518, "Send Invite to Player", "Invite Player", tda, 2, 0xff9040, true, true, 150);
//        addText(57519, "Invite Player", tda, 1, 0xFFA500, true, true);
//        addClickableSprites(57520, "Send Invite",path,22,22);

        setChildren(7, tab);

        setBounds(57506, 4, 2, 0, tab);
        setBounds(57507, 95, 4, 1, tab);


        setBounds(57513, 5, 65, 2, tab);
        setBounds(57514, 95, 30, 3, tab);
        setBounds(57515, 95, 45, 4, tab);
//        setBounds(57516, 95, 105, 5, tab);
        setBounds(57517, 14, 73, 5, tab);
        setBounds(57550, 4, 120, 6, tab);
//        setBounds(57518,20, 230,8,tab);
//        setBounds(57519, 95, 210, 9, tab);
//        setBounds(57520, 165, 230, 10, tab);

//        int playerMax = 4;
//        scroll.totalChildren(playerMax);
//        for (int i = 0; i < playerMax; i++) {
//            addClickableText(57551 + i,"player name","Remove",tda,0, 0xff9040, false, true, 150);
//            setBounds(57551 + i,8,2 + (i * 12),i,scroll);
//        }
//
//        scroll.width = 160;
//        scroll.height = 190;
//        scroll.scrollMax = 40;
    }

    private static void mysteryBox(TextDrawingArea[] tda) {
        RSInterface iface = addInterface(47000);
        /* Base interface */
        //addSpriteLoader(47001, 1073);
        addSprite(47001, 1073, "Interfaces/MysteryBox/SPRITE");
        //addSprite(65001, 0, "Interfaces/Teleporting/Background");
        addText(47002, "Mystery Box", tda, 2, 0xFFA500, true, true);
        addButton(47003, 527, "Interfaces/MysteryBox/SPRITE", "Close");
        addButton(47004, 810, "Interfaces/MysteryBox/SPRITE", "Spin");
        addText(47005, "Spin 1x", tda, 2, 0xFFA500, true, true);
        addSprite(47006, 530, "Interfaces/MysteryBox/SPRITE");
        addSprite(47007, 531, "Interfaces/MysteryBox/SPRITE");
        addText(47008, "Feeling lucky?", tda, 2, 0xFFA500, true, true);
        addWrappingText(47009, "Sacrifice your box for a chance at something rare!", tda, 1, 0xFFA500, false, true, 300);
        addSprite(47010, 528, "Interfaces/MysteryBox/SPRITE");
        addSprite(47011, 533, "Interfaces/MysteryBox/SPRITE");
        addButton(47012, 810, "Interfaces/MysteryBox/SPRITE", "Spin");
        addText(47013, "Spin All", tda, 2, 0xFFA500, true, true);

        setChildren(15, iface);
        setBounds(47001, 10, 10, 0, iface);
        setBounds(47002, 253, 13, 1, iface);
        setBounds(47003, 473, 14, 2, iface);
        setBounds(47004, 323, 256, 3, iface);
        setBounds(47005, 358, 263, 4, iface);
        setBounds(47006, 17, 185, 5, iface);
        setBounds(47007, 33, 65, 6, iface);
        setBounds(47008, 253, 78, 7, iface);
        setBounds(47009, 120, 108, 8, iface);
        setBounds(47012, 393, 256, 13, iface);
        setBounds(47013, 428, 263, 14, iface);
        // Boxes
        setBounds(47200, 10, 187, 9, iface);
        // Items
        setBounds(47100, 17, 192, 10, iface);
        // Item selector
        setBounds(47010, 252, 187, 11, iface);
        setBounds(47011, 10, 185, 12, iface);

        /* Boxes */
        RSInterface box = addInterface(47200);
        box.width = 480;
        setChildren(Client.BOXES64, box);
        // 64 boxes in each sprite
        int x = 0;
        for (int i = 0; i < Client.BOXES64; i++) {
            //addSpriteLoader(47201, 1076);
            addSprite(47201, 532, "Interfaces/MysteryBox/SPRITE");
            //addSprite(47201, 0, "");
            setBounds(47201, x, 0, i, box);
            x += 2880;
        }

        /* Items */
        RSInterface scroll = addInterface(47100);
        scroll.width = 474;
        addToItemGroup(47101, 1750, 1, 13, 10, false, null, null, null);
        setChildren(1, scroll);
        setBounds(47101, 0, 0, 0, scroll);
    }

    private static void addPlayerTab(TextDrawingArea[] tda) {
        final String path = "Interfaces/runehub/tab/player/SPRITE";
        RSInterface tab = addTabInterface(57000);
        addSprite(57006, 0, path);
        addText(57007, "Player Summary", tda, 2, 0xFFA500, false, true);
        addClickableSprites(57001, "Player Summary", path, 2, 1);
        addClickableSprites(57002, "Under Development", path, 1, 1);
        addClickableSprites(57003, "Achievements", path, 1, 2);
        addClickableSprites(57004, "Distractions & Diversions", path, 1, 2);
        addClickableSprites(57005, "Miscellaneous", path, 1, 2);
        addSprite(57010, 9, path);
        addSprite(57008, 8, path);
        addSprite(57009, 8, path);
        addText(57011, "Lorem Ipsum", tda, 1, 0xFFA500, true, true);
        addText(57012, "Combat Level", tda, 1, 0xFFA500, true, true);
        addText(57013, "Total Level", tda, 1, 0xFFA500, true, true);
        addSprite(57014, 11, path);
        addSprite(57015, 12, path);

        addText(57016, "126", tda, 1, 0x0DC10D, true, true);
        addText(57017, String.valueOf(2000), tda, 1, 0x0DC10D, false, true);

        addSprite(57018, 7, path);
        addSprite(57019, 10, path);
        addText(57020, "Total XP:", tda, 1, 0xFFA500, false, true);
        addText(57021, NumberFormat.getInstance().format(20000000), tda, 1, 0x0DC10D, false, true);

        addSprite(57022, 7, path);
        addSprite(57023, 6, path);
        addText(57024, "Membership:", tda, 1, 0xFFA500, false, true);
        addText(57025, "0 Days", tda, 1, 0x0DC10D, false, true);

        addProgressBar(57026, 180, 28, new int[]{0xA67711, 0x005F00});
        addClickableSprites(57027, "View Play Pass", path, 24, 24);
        addText(57028, "Play Pass", tda, 2, 0xffffff, true, false);

        addProgressBar(57037, 180, 28, new int[]{0xA67711, 0x005F00});
        addClickableSprites(57038, "View Current Journey", path, 24, 24);
        addText(57039, "Journey", tda, 2, 0xffffff, true, false);

        addSprite(57029, 20, path);
        addSprite(57030, 15, path);
        addSprite(57031, 16, path);
        addSprite(57032, 17, path);
        addSprite(57033, 18, path);

        addSprite(57034, 7, path);
        addText(57035, "Time Played:", tda, 0, 0xFFA500, false, true);
        addText(57036, "0 Days", tda, 0, 0x0DC10D, false, true);

//        for (int i = 1; i < 5; i++) {
//            String tooltip = "Coming Soon";
//            if (i == 1)
//                tooltip = "Quests";
//            else if (i == 2)
//                tooltip = "Achievements";
//            addClickableSprites(57001 + i, tooltip, path, 1, 2);
//        }

        setChildren(39, tab);
        setBounds(57006, 4, 30, 0, tab);
        setBounds(57007, 8, 33, 1, tab);
        setBounds(57010, 4, 56, 2, tab);
        setBounds(57009, 4, 80, 3, tab);
        setBounds(57008, 97, 80, 4, tab);
        setBounds(57011, 95, 58, 5, tab);
        setBounds(57012, 49, 82, 6, tab);
        setBounds(57013, 143, 82, 7, tab);
        setBounds(57014, 14, 99, 8, tab);
        setBounds(57015, 113, 99, 9, tab);
        setBounds(57016, 40, 97, 10, tab);
        setBounds(57017, 133, 97, 11, tab);

        setBounds(57018, 4, 118, 12, tab);
        setBounds(57019, 13, 121, 13, tab);
        setBounds(57020, 31, 121, 14, tab);
        setBounds(57021, 81, 121, 15, tab);

        setBounds(57022, 4, 140, 16, tab);
        setBounds(57023, 13, 143, 17, tab);
        setBounds(57024, 31, 143, 18, tab);
        setBounds(57025, 105, 143, 19, tab);

        setBounds(57027, 4, 185, 20, tab);
        setBounds(57026, 4, 186, 21, tab);
        setBounds(57028, 90, 194, 22, tab);

        setBounds(57029, 12, 8, 28, tab);
        setBounds(57030, 50, 8, 29, tab);
        setBounds(57031, 87, 8, 30, tab);
        setBounds(57032, 125, 8, 31, tab);
        setBounds(57033, 163, 8, 32, tab);

        setBounds(57034, 4, 162, 33, tab);
        setBounds(57035, 13, 168, 34, tab);
        setBounds(57036, 74, 168, 35, tab);

        setBounds(57038, 4, 219, 36, tab);
        setBounds(57037, 5, 220, 37, tab);
        setBounds(57039, 90, 228, 38, tab);

        for (int i = 0; i < 5; i++) {
            setBounds(57001 + i, 4 + (i * 37), 5, 23 + i, tab);
        }
    }


    private static void addQuestTab(TextDrawingArea[] tda) {
        final String path = "Interfaces/runehub/tab/player/SPRITE";
        RSInterface tab = addTabInterface(57100);
        RSInterface scroll = addTabInterface(57114);
        addClickableSprites(57101, "Player Summary", path, 1, 2);
        addClickableSprites(57102, "Under Development", path, 2, 1);
        addClickableSprites(57103, "Achievements", path, 1, 2);
        addClickableSprites(57104, "Distractions & Diversions", path, 1, 2);
        addClickableSprites(57105, "Miscellaneous", path, 1, 2);
        addSprite(57106, 0, path);
        addText(57107, "Under Development", tda, 2, 0xFFA500, false, true);


        addSprite(57108, 20, path);
        addSprite(57109, 15, path);
        addSprite(57110, 16, path);
        addSprite(57111, 17, path);
        addSprite(57112, 18, path);
        addSprite(57113, 0, "Interfaces/runehub/tab/SPRITE");

        setChildren(14, tab);

        setBounds(57106, 4, 30, 0, tab);
        setBounds(57107, 8, 33, 1, tab);

        setBounds(57108, 12, 8, 7, tab);
        setBounds(57109, 50, 8, 8, tab);
        setBounds(57110, 87, 8, 9, tab);
        setBounds(57111, 125, 8, 10, tab);
        setBounds(57112, 163, 8, 11, tab);
        setBounds(57113, 2, 56, 12, tab);
        setBounds(57114, 4, 60, 13, tab);

        for (int i = 0; i < 5; i++) {
            setBounds(57101 + i, 4 + (i * 37), 5, 2 + i, tab);
        }

        int children = 30;
        int startIndex = 57115;
        scroll.totalChildren(children);
        for (int i = 0; i < children; i++) {
            addClickableText(startIndex + i, "", "", tda, 1, 0xFFA500, true, false, 160);
            setBounds(startIndex + i, (5), (20 * i), i, scroll);
        }
//        for (int i = 0; i < children; i++) {
//            addClickableSprites(startIndex + i, "Details", path, 21, 2);
//            setBounds(startIndex + i, (5), (40 * i), i, scroll);
//        }

//        for (int i = 0; i < children; i++) {
//            addText(startIndex + (children) + i, "Lorem Ipsum", tda, 1, 0xFFA500, true, true);
//            setBounds(startIndex + (children) + i, (82), 3 + (40 * i), (children) + i, scroll);
//        }
//
//        for (int i = 0; i < children; i++) {
//            addText(startIndex + (children * 2) + i, "Lorem Ipsum", tda, 0, 0xFFA500, true, true);
//            setBounds(startIndex + (children * 2) + i, (82), 20 + (40 * i), (children * 2) + i, scroll);
//        }

        scroll.width = 160;
        scroll.height = 190;
        scroll.scrollMax = 40 * children + 200;// + totalSkills * 4;
    }
 
    private static void addAchievementTab(TextDrawingArea[] tda) {
        final String path = "Interfaces/runehub/tab/player/SPRITE";
       /* RSInterface tab = addTabInterface(57200);
        RSInterface scroll = addTabInterface(57214);
        addClickableSprites(57201, "Player Summary", path, 1, 2);
        addClickableSprites(57202, "Quests", path, 1, 1);
        addClickableSprites(57203, "Achievements", path, 2, 2);
        addClickableSprites(57204, "Distractions & Diversions", path, 1, 2);
        addClickableSprites(57205, "Miscellaneous", path, 1, 2);
        addSprite(57206, 0, path);
        addText(57207, "Achievements", tda, 2, 0xFFA500, false, true);

        addSprite(57208, 20, path);
        addSprite(57209, 15, path);
        addSprite(57210, 16, path);
        addSprite(57211, 17, path);
        addSprite(57212, 18, path);
        addSprite(57213, 0, "Interfaces/runehub/tab/SPRITE");

        setChildren(14, tab);

        setBounds(57206, 4, 30, 0, tab);
        setBounds(57207, 8, 33, 1, tab);

        setBounds(57208, 12, 8, 7, tab);
        setBounds(57209, 50, 8, 8, tab);
        setBounds(57210, 87, 8, 9, tab);
        setBounds(57211, 125, 8, 10, tab);
        setBounds(57212, 163, 8, 11, tab);
        setBounds(57213, 2, 56, 12, tab);
        setBounds(57214, 4, 60, 13, tab);

        for (int i = 0; i < 5; i++) {
            setBounds(57201 + i, 4 + (i * 37), 5, 2 + i, tab);
        }

        int children = 30;
        int startIndex = 57215;
        scroll.totalChildren(children);
        for (int i = 0; i < children; i++) {
            addClickableText(startIndex + i, "", "", tda, 1, 0xFFA500, true, false, 160);
            setBounds(startIndex + i, (5), (20 * i), i, scroll);
        }
//        for (int i = 0; i < children; i++) {
//            addClickableSprites(startIndex + i, "Details", path, 21, 2);
//            setBounds(startIndex + i, (5), (40 * i), i, scroll);
//        }

//        for (int i = 0; i < children; i++) {
//            addText(startIndex + (children) + i, "Lorem Ipsum", tda, 1, 0xFFA500, true, true);
//            setBounds(startIndex + (children) + i, (82), 3 + (40 * i), (children) + i, scroll);
//        }
//
//        for (int i = 0; i < children; i++) {
//            addText(startIndex + (children * 2) + i, "Lorem Ipsum", tda, 0, 0xFFA500, true, true);
//            setBounds(startIndex + (children * 2) + i, (82), 20 + (40 * i), (children * 2) + i, scroll);
//        }

        scroll.width = 160;
        scroll.height = 190;
        scroll.scrollMax = 40 * children + 200;// + totalSkills * 4;
    }
    */  // Michael Old Achievements
    
     
        RSInterface tab = addTabInterface(57200);
        RSInterface scroll = addTabInterface(57214);
        addClickableSprites(57201, "Player Summary", path, 1, 2);
        addClickableSprites(57202, "Quests", path, 1, 1);
        addClickableSprites(57203, "Achievements", path, 2, 2);
        addClickableSprites(57204, "Distractions & Diversions", path, 1, 2);
        addClickableSprites(57205, "Miscellaneous", path, 1, 2);
        addSprite(57206, 0, path);
        addText(57207, "Achievements", tda, 2, 0xFFA500, false, true);

        addSprite(57208, 20, path);
        addSprite(57209, 15, path);
        addSprite(57210, 16, path);
        addSprite(57211, 17, path);
        addSprite(57212, 18, path);
        addSprite(57213, 0, "Interfaces/runehub/tab/SPRITE");
        setChildren(14, tab);

        setBounds(57206, 4, 30, 0, tab);
        setBounds(57207, 8, 33, 1, tab);

        setBounds(57208, 12, 8, 7, tab);
        setBounds(57209, 50, 8, 8, tab);
        setBounds(57210, 87, 8, 9, tab);
        setBounds(57211, 125, 8, 10, tab);
        setBounds(57212, 163, 8, 11, tab);
        setBounds(57213, 2, 56, 12, tab);
        setBounds(57214, 4, 60, 13, tab);

        for (int i = 0; i < 5; i++) {
            setBounds(57201 + i, 4 + (i * 37), 5, 2 + i, tab);
        }

        int children = 3;
        int startIndex = 57215;
        scroll.totalChildren(children * 3);

        for (int i = 0; i < children; i++) {
            addClickableSprites(startIndex + i, "Details", path, 23, 23);
            setBounds(startIndex + i, (5), (40 * i), i, scroll);
        }

        for (int i = 0; i < children; i++) {
            addProgressBar(startIndex + (children) + i, 140, 23, new int[]{0xA67711, 0x005F00});
            setBounds(startIndex + (children) + i, (12), 7 + (40 * i), (children) + i, scroll);
        }

        for (int i = 0; i < children; i++) {
            addText(startIndex + (children * 2) + i, "Lorem Ipsum", tda, 1, 0xffffff, true, true);
            setBounds(startIndex + (children * 2) + i, (82), 9 + (40 * i), (children * 2) + i, scroll);
        }

        scroll.width = 160;
        scroll.height = 190;
        scroll.scrollMax = 40 * children + 200;// + totalSkills * 4;
    } 

    private static void addDnDTab(TextDrawingArea[] tda) {
        final String path = "Interfaces/runehub/tab/player/SPRITE";
        RSInterface tab = addTabInterface(57300);
        RSInterface scroll = addTabInterface(57314);
        addClickableSprites(57301, "Player Summary", path, 1, 2);
        addClickableSprites(57302, "Diaries", path, 1, 1);
        addClickableSprites(57303, "Achievements", path, 1, 2);
        addClickableSprites(57304, "Distractions & Diversions", path, 2, 2);
        addClickableSprites(57305, "Miscellaneous", path, 1, 2);
        addSprite(57306, 0, path);
        addText(57307, "Distractions & Diversions", tda, 2, 0xFFA500, false, true);

        addSprite(57308, 20, path);
        addSprite(57309, 15, path);
        addSprite(57310, 16, path);
        addSprite(57311, 17, path);
        addSprite(57312, 18, path);
        addSprite(57313, 0, "Interfaces/runehub/tab/SPRITE");
        setChildren(14, tab);

        setBounds(57306, 4, 30, 0, tab);
        setBounds(57307, 8, 33, 1, tab);

        setBounds(57308, 12, 8, 7, tab);
        setBounds(57309, 50, 8, 8, tab);
        setBounds(57310, 87, 8, 9, tab);
        setBounds(57311, 125, 8, 10, tab);
        setBounds(57312, 163, 8, 11, tab);
        setBounds(57313, 2, 56, 12, tab);
        setBounds(57314, 4, 60, 13, tab);
//95 58
        for (int i = 0; i < 5; i++) {
            setBounds(57301 + i, 4 + (i * 37), 5, 2 + i, tab);
        }

        int children = 3;
        int startIndex = 57315;
        scroll.totalChildren(children * 3);
        for (int i = 0; i < children; i++) {
            addClickableSprites(startIndex + i, "Details", path, 21, 2);
            setBounds(startIndex + i, (5), (40 * i), i, scroll);
        }

        for (int i = 0; i < children; i++) {
            addText(startIndex + (children) + i, "Lorem Ipsum", tda, 1, 0xFFA500, true, true);
            setBounds(startIndex + (children) + i, (82), 3 + (40 * i), (children) + i, scroll);
        }

        for (int i = 0; i < children; i++) {
            addText(startIndex + (children * 2) + i, "Lorem Ipsum", tda, 0, 0xFFA500, false, true);
            setBounds(startIndex + (children * 2) + i, (10), 20 + (40 * i), (children * 2) + i, scroll);
        }

        scroll.width = 160;
        scroll.height = 190;
        scroll.scrollMax = 40 * children + 200;// + totalSkills * 4;
    }

    private static void addTab5(TextDrawingArea[] tda) {
        final String path = "Interfaces/runehub/tab/player/SPRITE";
        RSInterface tab = addTabInterface(57400);
        RSInterface scroll = addTabInterface(57414);
        addClickableSprites(57401, "Player Summary", path, 1, 2);
        addClickableSprites(57402, "Diaries", path, 1, 1);
        addClickableSprites(57403, "Achievements", path, 1, 2);
        addClickableSprites(57404, "Distractions & Diversions", path, 1, 2);
        addClickableSprites(57405, "Miscellaneous", path, 2, 2);
        addSprite(57406, 0, path);
        addText(57407, "Miscellaneous", tda, 2, 0xFFA500, false, true);

        addSprite(57408, 20, path);
        addSprite(57409, 15, path);
        addSprite(57410, 16, path);
        addSprite(57411, 17, path);
        addSprite(57412, 18, path);
        addSprite(57413, 0, "Interfaces/runehub/tab/SPRITE");

        setChildren(14, tab);

        setBounds(57406, 4, 30, 0, tab);
        setBounds(57407, 8, 33, 1, tab);

        setBounds(57408, 12, 8, 7, tab);
        setBounds(57409, 50, 8, 8, tab);
        setBounds(57410, 87, 8, 9, tab);
        setBounds(57411, 125, 8, 10, tab);
        setBounds(57412, 163, 8, 11, tab);
        setBounds(57413, 2, 56, 12, tab);
        setBounds(57414, 4, 60, 13, tab);

        for (int i = 0; i < 5; i++) {
            setBounds(57401 + i, 4 + (i * 37), 5, 2 + i, tab);
        }

        int children = 30;
        int startIndex = 57415;
        scroll.totalChildren(children);
        for (int i = 0; i < children; i++) {
            addClickableText(startIndex + i, "", "", tda, 1, 0xFFA500, true, false, 160);
            setBounds(startIndex + i, (5), (20 * i), i, scroll);
        }
//        for (int i = 0; i < children; i++) {
//            addClickableSprites(startIndex + i, "Details", path, 21, 2);
//            setBounds(startIndex + i, (5), (40 * i), i, scroll);
//        }

//        for (int i = 0; i < children; i++) {
//            addText(startIndex + (children) + i, "Lorem Ipsum", tda, 1, 0xFFA500, true, true);
//            setBounds(startIndex + (children) + i, (82), 3 + (40 * i), (children) + i, scroll);
//        }
//
//        for (int i = 0; i < children; i++) {
//            addText(startIndex + (children * 2) + i, "Lorem Ipsum", tda, 0, 0xFFA500, true, true);
//            setBounds(startIndex + (children * 2) + i, (82), 20 + (40 * i), (children * 2) + i, scroll);
//        }

        scroll.width = 160;
        scroll.height = 190;
        scroll.scrollMax = 40 * children + 200;// + totalSkills * 4;
    }

//    private static void addSkillTab(TextDrawingArea[] tda) {
//        final String path = "Interfaces/tab/skill/SPRITE";
//        RSInterface tab = addTabInterface(57800);
//        RSInterface scroll = addTabInterface(57820);
//
//        addText(57801, "Scroll to view", tda, 1, 0xFFA500, true, true);
//
//        final int totalSkills = SkillDictionary.Skill.values().length;
//        final int startIndex = 57821;
//        setChildren(2,tab);
//        setBounds(57820, 4, 4, 0, tab);
//        setBounds(57801, 100, 240, 1, tab);
//        setChildren(totalSkills * 5, scroll);
//        for (int i = 0; i < totalSkills; i++) {
//            addClickableSprites(startIndex + i,SkillDictionary.Skill.values()[i].toString(),path,1,0);
//            setBounds(startIndex + i,0,4 + (i * 35),i,scroll);
//        }
//        for (int i = 0; i < totalSkills; i++) {
//            addTransparentSprite(startIndex + totalSkills + i, i, "Interfaces/tab/skill/icon/SPRITE");
//            setBounds(startIndex + totalSkills + i,10,14 + (i * 35),totalSkills + i,scroll);
//        }
//
//        for (int i = 0; i < totalSkills; i++) {
//            System.out.println(startIndex + (totalSkills * 2) + i);
//            addProgressBar(startIndex + (totalSkills * 2) + i,151,16,new int[]{RunehubUtils.RS2HSB_to_RGB(RunehubUtils.getBaseColorForSkill(SkillDictionary.Skill.values()[i])),RunehubUtils.RS2HSB_to_RGB(RunehubUtils.getBaseColorForSkill(SkillDictionary.Skill.values()[i]))});
//            setBounds(startIndex + (totalSkills * 2) + i,24,8 + (i * 35),(totalSkills * 2) + i,scroll);
//        }
//        for (int i = 0; i < totalSkills; i++) {
//            addProgressBar(startIndex + (totalSkills * 3) + i,125,9,new int[]{RunehubUtils.RS2HSB_to_RGB(RunehubUtils.getBaseColorForSkill(SkillDictionary.Skill.values()[i])),RunehubUtils.RS2HSB_to_RGB(RunehubUtils.getBaseColorForSkill(SkillDictionary.Skill.values()[i]))});
//            setBounds(startIndex + (totalSkills * 3) + i,24,27 + (i * 35),(totalSkills * 3) + i,scroll);
//        }
//        for (int i = 0; i < totalSkills; i++) {
//            addText(startIndex + (totalSkills * 4) + i,"Next Level",tda,0,0xFFA500, true, true);
//            setBounds(startIndex + (totalSkills * 4) + i,100,12 + (i * 35),(totalSkills * 4) + i,scroll);
//        }
//        scroll.width = tab.width;
//        scroll.height = 232;
//        scroll.scrollMax = totalSkills * 35 + 5;// + totalSkills * 4;
//    }

    private static int getRSIID(int skillId) {
        switch (skillId) {
            case 0:
                return 14918;
            case 1:
                return 14920;
            case 2:
                return 14919;
            case 3:
                return 14926;
            case 4:
                return 14921;
            case 5:
                return 14922;
        }
        return 14925;
    }

    private static void addSkillTab(TextDrawingArea[] tda) {
        final String path = "Interfaces/runehub/tab/skill/SPRITE";
        RSInterface tab = addTabInterface(57800);
        RSInterface scroll = addTabInterface(57805);

        addSprite(57801, 4, path);
        addSprite(57802, 100, path);
        addText(57803, "Total Level: ", tda, 1, 0xFFA500, false, true);
        addText(57804, "2000", tda, 1, 0xFFA500, false, true);

        final int totalSkills = SkillDictionary.Skill.values().length;
        final int startIndex = 57806;
        final int skillHeight = 50;
        setChildren(5, tab);
        setBounds(57805, 8, 6, 0, tab);
        setBounds(57802, 4, 2, 2, tab);
        setBounds(57801, 30, 235, 1, tab);
        setBounds(57803, 55, 240, 3, tab);
        setBounds(57804, 120, 240, 4, tab);
        setChildren(totalSkills * 8, scroll);
        for (int i = 0; i < totalSkills; i++) {
            addClickableSprites(startIndex + i, RunehubUtils.getSkillName(i), path, 2, 0);
            setBounds(startIndex + i, 0, 4 + (i * 50), i, scroll);
        }
        for (int i = 0; i < totalSkills; i++) {
//            addCachedSprite(startIndex + totalSkills + i,getRSIID(i));
            addSprite(startIndex + totalSkills + i, i, "Interfaces/runehub/tab/skill/icon/SPRITE");
            setBounds(startIndex + totalSkills + i, 10, 20 + (i * skillHeight), (totalSkills * 2) + i, scroll);
        }
      //  System.out.println("-----Progress Bar-----");
        for (int i = 0; i < totalSkills; i++) {
         //   System.out.println(startIndex + (totalSkills * 2) + i);
            addProgressBar(startIndex + (totalSkills * 2) + i, 158, 48, new int[]{RunehubUtils.RS2HSB_to_RGB(RunehubUtils.getBaseColorForSkill(i)), RunehubUtils.RS2HSB_to_RGB(RunehubUtils.getBaseColorForSkill(i))}, 120);
            setBounds(startIndex + (totalSkills * 2) + i, 9, 5 + (i * skillHeight), totalSkills + i, scroll);
        }
      //  System.out.println("-----[END]-----");
        for (int i = 0; i < totalSkills; i++) {
            addProgressBar(startIndex + (totalSkills * 3) + i, 125, 9, new int[]{RunehubUtils.RS2HSB_to_RGB(RunehubUtils.getBaseColorForSkill(i)), RunehubUtils.RS2HSB_to_RGB(RunehubUtils.getBaseColorForSkill(i))});
            setBounds(startIndex + (totalSkills * 3) + i, 24, 27 + (i * skillHeight), (totalSkills * 3) + i, scroll);
        }
//        for (int i = 0; i < totalSkills; i++) {
//            addText(startIndex + (totalSkills * 4) + i,"99",tda,0,0xFFA500, true, true);
//            setBounds(startIndex + (totalSkills * 4) + i,160,8 + (i * 40),(totalSkills * 4) + i,scroll);
//        }
//        for (int i = 0; i < totalSkills; i++) {
//            addSprite(startIndex + (totalSkills * 5) + i, 3, path);
//            setBounds(startIndex + (totalSkills * 5) + i,154,20 + (i * 40),(totalSkills * 5) + i,scroll);
//        }
//        for (int i = 0; i < totalSkills; i++) {
//            addText(startIndex + (totalSkills * 6) + i,"99",tda,0,0xFFA500, true, true);
//            setBounds(startIndex + (totalSkills * 6) + i,160,26 + (i * 40),(totalSkills * 6) + i,scroll);
//        }
      //  System.out.println("-----Skill Name/Level-----");
        for (int i = 0; i < totalSkills; i++) {
        //    System.out.println(startIndex + (totalSkills * 4) + i);
            addText(startIndex + (totalSkills * 4) + i, "Skill Name 99/99", tda, 0, 0xFFA500, true, true);
            setBounds(startIndex + (totalSkills * 4) + i, 90, 6 + (i * skillHeight), (totalSkills * 4) + i, scroll);
        }
  //      System.out.println("-----[END]-----");
    //    System.out.println("-----Total XP-----");
        for (int i = 0; i < totalSkills; i++) {
          //  System.out.println(startIndex + (totalSkills * 5) + i);
            addText(startIndex + (totalSkills * 5) + i, "Total XP: 200,000,000", tda, 0, 0xFFA500, false, true);
            setBounds(startIndex + (totalSkills * 5) + i, 38, 17 + (i * skillHeight), (totalSkills * 5) + i, scroll);
        }
     //   System.out.println("-----[END]-----");
   //     System.out.println("-----Bonus XP-----");
        for (int i = 0; i < totalSkills; i++) {
         //   System.out.println(startIndex + (totalSkills * 6) + i);
            addText(startIndex + (totalSkills * 6) + i, "Bonus XP: 200,000,000", tda, 0, 0xFFA500, false, true);
            setBounds(startIndex + (totalSkills * 6) + i, 38, 28 + (i * skillHeight), (totalSkills * 6) + i, scroll);
        }
     //   System.out.println("-----[END]-----");
    //    System.out.println("-----Next Level-----");
        for (int i = 0; i < totalSkills; i++) {
       //     System.out.println(startIndex + (totalSkills * 7) + i);
            addText(startIndex + (totalSkills * 7) + i, "Next Level: 1,000,000", tda, 0, 0xFFA500, false, true);
            setBounds(startIndex + (totalSkills * 7) + i, 38, 39 + (i * skillHeight), (totalSkills * 7) + i, scroll);
        }
    //    System.out.println("-----[END]-----");
        scroll.width = tab.width - 2;
        scroll.height = 220;
        scroll.scrollMax = totalSkills * skillHeight + 10;// + totalSkills * 4;
    }

//	private static void addQuestTab(TextDrawingArea[] tda) {
//		final String path = "Interfaces/tab/player/SPRITE";
//		RSInterface tab = addTabInterface(57100);
//		addClickableSprites(57101,"Summary",path,2,1);
//		addSprite(57106,0,path);
//		addText(57107, "Player Summary", tda, 2, 0xFFA500, false, true);
//		addSprite(57110,9,path);
//		addSprite(57108,8,path);
//		addSprite(57109,8,path);
//		addText(57111, "Lorem Ipsum", tda, 1, 0xFFA500, true, true);
//		addText(57112, "Combat Level", tda, 1, 0xFFA500, true, true);
//		addText(57113, "Total Level", tda, 1, 0xFFA500, true, true);
//		addSprite(57114,11,path);
//		addSprite(57115,12,path);
//
//		addText(57116, "126", tda, 1, 0x0DC10D, true, true);
//		addText(57117, String.valueOf(2000), tda, 1, 0x0DC10D, false, true);
//
//		addSprite(57118,7,path);
//		addSprite(57119,10,path);
//		addText(57120, "Total XP:", tda, 1, 0xFFA500, false, true);
//		addText(57121, NumberFormat.getInstance().format(20000000), tda, 1, 0x0DC10D, false, true);
//
//		addSprite(57122,7,path);
//		addSprite(57123,6,path);
//		addText(57124,"Membership:", tda, 1, 0xFFA500, false, true);
//		addText(57125, "0 Days", tda, 1, 0x0DC10D, false, true);
//
//		addProgressBar(57126,167,21,new int[] {0xA67711,0x005F00});
////		addSprite(57127,14,path);
//		addClickableSprites(57127,"View Play Pass",path,14,14);
//		addText(57128, "Play Pass", tda, 2, 0xffffff, true, false);
//
//		addSprite(57129,20,path);
//		addSprite(57130,15,path);
//		addSprite(57131,16,path);
//		addSprite(57132,17,path);
//		addSprite(57133,18,path);
//
//		addSprite(57134,7,path);
//		addText(57135,"Time Played:", tda, 1, 0xFFA500, false, true);
//		addText(57136, "0 Days", tda, 1, 0x0DC10D, false, true);
//
//		for (int i = 1; i < 5; i++) {
//			String tooltip = "Coming Soon";
//			if (i == 1)
//				tooltip = "Quests";
//			else if (i == 2)
//				tooltip = "Achievements";
//			addClickableSprites(57101 + i,tooltip,path,1,2);
//		}
//
//		setChildren(36,tab);
//		setBounds(57106,4,30,0,tab);
//		setBounds(57107,8,33,1,tab);
//		setBounds(57110,4,56,2,tab);
//		setBounds(57109,4,80,3,tab);
//		setBounds(57108,97,80,4,tab);
//		setBounds(57111,95,58,5,tab);
//		setBounds(57112,49,82,6,tab);
//		setBounds(57113,143,82,7,tab);
//		setBounds(57114,14,99,8,tab);
//		setBounds(57115,113,99,9,tab);
//		setBounds(57116,40,97,10,tab);
//		setBounds(57117,133,97,11,tab);
//
//		setBounds(57118,4,118,12,tab);
//		setBounds(57119,13,121,13,tab);
//		setBounds(57120,31,121,14,tab);
//		setBounds(57121,81,121,15,tab);
//
//		setBounds(57122,4,140,16,tab);
//		setBounds(57123,13,143,17,tab);
//		setBounds(57124,31,143,18,tab);
//		setBounds(57125,105,143,19,tab);
//
//		setBounds(57127,4,185,20,tab);
//		setBounds(57126,13,193,21,tab);
//		setBounds(57128,90,197,22,tab);
//
//		setBounds(57129,12,8,28,tab);
//		setBounds(57130,50,8,29,tab);
//		setBounds(57131,87,8,30,tab);
//		setBounds(57132,125,8,31,tab);
//		setBounds(57133,163,8,32,tab);
//
//		setBounds(57134,4,162,33,tab);
//		setBounds(57135,13,165,34,tab);
//		setBounds(57136,85,165,35,tab);
//
//		for (int i = 0; i < 5; i++) {
//			setBounds(57101 + i, 4 + (i * 37), 5, 23 +i, tab);
//		}
//	}

    private static int getXFromBase(int base, int x) {
        return base + x;
    }

    private static int getYFromBase(int base, int y) {
        return base + y;
    }

    private static final String LOREM_IPSUM_PARAGRAPH = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Dignissim convallis aenean et tortor at risus.";

    private static void addRiftSelection(TextDrawingArea[] tda) {
        RSInterface rsi = addInterface(50000);
        String dir = "Interfaces/runehub/rift/SPRITE";

        final int baseX = 30;
        final int baseY = 25;

        final int panel1X = 17;
        final int panel2X = 240;
        final int panelY = 40;

        addSprite(50001, 0, dir);
        addText(50002, "Open Rift", tda, 2, 0xFFA500, true, true);

        addClickableSprites(50003, "Select Nephalem Rift", dir, 5, 5);
        addClickableSprites(50004, "Select Greater Rift", dir, 5, 5);

        addText(50005, "Nephalem Rift", tda, 1, 0xFFA500, true, true);
        addText(50006, "Greater Rift", tda, 1, 0xFFA500, true, true);

        addSprite(50007, 6, dir);
        addSprite(50008, 6, dir);

        addWrappingText(50009, LOREM_IPSUM_PARAGRAPH, tda, 0, 0xFFA500, false, false, 170);
        addWrappingText(50010, LOREM_IPSUM_PARAGRAPH, tda, 0, 0xFFA500, false, false, 170);

        addToItemGroup(50011, 10, 1, 15, 215, false, null, null, null);
        addToItemGroup(50012, 10, 1, 15, 215, false, null, null, null);

        rsi.totalChildren(8);
//            rsi.child(0,50001,baseX,baseY);
//            rsi.child(0, 50002, getXFromBase(baseX,235), getYFromBase(baseY,5));

        rsi.child(0, 50003, getXFromBase(baseX, panel1X), getYFromBase(baseY, panelY)); //panel 1
        rsi.child(1, 50004, getXFromBase(baseX, panel2X), getYFromBase(baseY, panelY)); //panel 2

        rsi.child(2, 50005, getXFromBase(baseX, 115), getYFromBase(baseY, 45)); //panel 1 title
        rsi.child(3, 50006, getXFromBase(baseX, 340), getYFromBase(baseY, 45)); //panel 2 title

        rsi.child(4, 50007, getXFromBase(getXFromBase(baseX, panel1X), 10), getYFromBase(getYFromBase(baseY, 40), 100)); //panel 1 textbox sprite
        rsi.child(5, 50008, getXFromBase(getXFromBase(baseX, panel2X), 10), getYFromBase(getYFromBase(baseY, 40), 100)); //panel 2 textbox sprite

        rsi.child(6, 50009, getXFromBase(getXFromBase(getXFromBase(baseX, panel1X), 10), 5), getYFromBase(getYFromBase(getYFromBase(baseY, 40), 100), 3)); //panel 1 textbox text
        rsi.child(7, 50010, getXFromBase(getXFromBase(getXFromBase(baseX, panel2X), 10), 5), getYFromBase(getYFromBase(getYFromBase(baseY, 40), 100), 3)); //panel 2 textbox text

    }
    
    public static void skillActionUI(TextDrawingArea[] tda) {
        final RSInterface rsi = addInterface(49000);
        final RSInterface leftScroll = addTabInterface(49005);
        final String dir = "Interfaces/runehub/skill-action/SPRITE";
        final int baseX = 30;
        final int baseY = 25;

        addSprite(49001, 0, dir);
        addText(49002, "Lorem Ipsum", tda, 2, 0xFFA500, true, true);
        addButton(49003, 1, dir, "Close");

        addText(49004, "Lorem Ipsum", tda, 2, 0xFFA500, true, true);
        addToItemGroup(49006, 4, 10, 289, 167, true, "Select", null, null);

        rsi.totalChildren(5);

        rsi.child(0, 49001, baseX, baseY);
        rsi.child(1, 49002, getXFromBase(baseX, 235), getYFromBase(baseY, 5));
        rsi.child(2, 49003, getXFromBase(baseX, 426), getYFromBase(baseY, 5));
        rsi.child(3, 49004, getXFromBase(baseX, 90), getYFromBase(baseY, 20));
        rsi.child(4, 49005, getXFromBase(baseX, 8), getYFromBase(baseY, 30));

        leftScroll.totalChildren(1);

        leftScroll.child(0, 49006, getXFromBase(baseX, 12), getYFromBase(baseY, 30));

        leftScroll.width = 180;
        leftScroll.height = 230;
        leftScroll.scrollMax = 300;
    }

//    private static void addSailingTradeSelectionUI(TextDrawingArea[] tda) {
//        final RSInterface baseUI = addInterface(50100);
//        final String baseDir = "Interfaces/runehub/sailing/SPRITE";
//        final int baseX = 30;
//        final int baseY = 25;
//
//        addSprite(50101, 0, baseDir);
//        addText(50102, "Select Trade Goods", tda, 2, 0xFFA500, true, true);
//        //buy offer slots
//        addToItemGroup(50103, 1, 5, 160, 40, 0, 14);
//        //sell offer slots
//        addToItemGroup(50141, 1, 5, 410, 40, 0, 14);
//        //Membership stars
//        addSprite(50104, 6, baseDir);
//        addSprite(50105, 6, baseDir);
//        addSprite(50106, 6, baseDir);
//        addSprite(50107, 6, baseDir);
//        addSprite(50108, 6, baseDir);
//        addSprite(50109, 6, baseDir);
//        //buy icons
//        addClickableSprites(50110, "Make Buy Request", baseDir, 1, 1);
//        addClickableSprites(50111, "Make Buy Request", baseDir, 1, 1);
//        addClickableSprites(50112, "Make Buy Request", baseDir, 1, 1);
//        addClickableSprites(50113, "Make Buy Request", baseDir, 1, 1);
//        addClickableSprites(50114, "Make Buy Request", baseDir, 1, 1);
//        //sell icons
//        addClickableSprites(50115, "Make Sell Request", baseDir, 1, 1);
//        addClickableSprites(50116, "Make Sell Request", baseDir, 1, 1);
//        addClickableSprites(50117, "Make Sell Request", baseDir, 1, 1);
//        addClickableSprites(50118, "Make Sell Request", baseDir, 1, 1);
//        addClickableSprites(50119, "Make Sell Request", baseDir, 1, 1);
//        //close button
//        addButton(50120, 3, baseDir, "Close");
//        //Voyage details
//        addText(50121, "Island Name", tda, 2, 0xFFA500, true, true);
//        addText(50122, "Region Name", tda, 2, 0xFFA500, true, true);
//        addText(50123, "Seafaring: 0/0", tda, 1, 0xFFA500, false, true);
//        addText(50124, "Combat: 0/0", tda, 1, 0xFFA500, false, true);
//        addText(50125, "Morale: 0/0", tda, 1, 0xFFA500, false, true);
//        addText(50126, "Distance: 100 Leagues", tda, 1, 0xFFA500, false, true);
//        addText(50127, "Cargo Stats", tda, 2, 0xFFA500, false, true);
//        addText(50128, "Voyage Stats", tda, 2, 0xFFA500, false, true);
//        addText(50140, "Weight: 0/0", tda, 1, 0xFFA500, false, true);
//        //voyage progress
//        addProgressBar(50129, 137, 28, new int[]{0xA67711, 0x005F00});
//        addClickableSprites(50130, "Voyage Progress", baseDir, 24, 24);
//        addText(50131, "Voyage Progress", tda, 2, 0xffffff, true, false);
//        //buttons
//        addButton(50132, 25, baseDir, "Start Voyage");
//        addButton(50133, 25, baseDir, "Cancel Voyage");
//        addButton(50134, 25, baseDir, "Claim Voyage");
//        addButton(50135, 25, baseDir, "Repair Ship");
//        addText(50136, "Start", tda, 1, 0xffffff, true, false);
//        addText(50137, "Cancel", tda, 1, 0xffffff, true, false);
//        addText(50138, "Claim", tda, 1, 0xffffff, true, false);
//        addText(50139, "Repair", tda, 1, 0xffffff, true, false);
//
//        baseUI.totalChildren(41);
//        baseUI.child(0, 50101, baseX, baseY);
//        baseUI.child(1, 50102, getXFromBase(baseX, 235), getYFromBase(baseY, 5));
//        baseUI.child(2, 50103, getXFromBase(baseX, 160), getYFromBase(baseY, 40));
//        baseUI.child(40, 50141, getXFromBase(baseX, 410), getYFromBase(baseY, 40));
//        //Membership stars
//        baseUI.child(3, 50104, getXFromBase(baseX, 168), getYFromBase(baseY, 247));
//        baseUI.child(4, 50105, getXFromBase(baseX, 168), getYFromBase(baseY, 200));
//        baseUI.child(5, 50106, getXFromBase(baseX, 168), getYFromBase(baseY, 154));
//        baseUI.child(6, 50107, getXFromBase(baseX, 418), getYFromBase(baseY, 247));
//        baseUI.child(7, 50108, getXFromBase(baseX, 418), getYFromBase(baseY, 200));
//        baseUI.child(8, 50109, getXFromBase(baseX, 418), getYFromBase(baseY, 154));
//        //buy icons
//        baseUI.child(9, 50110, getXFromBase(baseX, 250), getYFromBase(baseY, 38));
//        baseUI.child(10, 50111, getXFromBase(baseX, 250), getYFromBase(baseY, 84));
//        baseUI.child(11, 50112, getXFromBase(baseX, 250), getYFromBase(baseY, 130));
//        baseUI.child(12, 50113, getXFromBase(baseX, 250), getYFromBase(baseY, 176));
//        baseUI.child(13, 50114, getXFromBase(baseX, 250), getYFromBase(baseY, 222));
//        //sell icons
//        baseUI.child(14, 50115, getXFromBase(baseX, 307), getYFromBase(baseY, 38));
//        baseUI.child(15, 50116, getXFromBase(baseX, 307), getYFromBase(baseY, 84));
//        baseUI.child(16, 50117, getXFromBase(baseX, 307), getYFromBase(baseY, 130));
//        baseUI.child(17, 50118, getXFromBase(baseX, 307), getYFromBase(baseY, 176));
//        baseUI.child(18, 50119, getXFromBase(baseX, 307), getYFromBase(baseY, 222));
//        //close button
//        baseUI.child(19, 50120, 463, 28);
//        //voyage details
//        baseUI.child(20, 50121, getXFromBase(baseX, 72), getYFromBase(baseY, 28));
//        baseUI.child(21, 50122, getXFromBase(baseX, 72), getYFromBase(baseY, 41));
//        baseUI.child(22, 50123, getXFromBase(baseX, 10), getYFromBase(baseY, 78));
//        baseUI.child(23, 50124, getXFromBase(baseX, 10), getYFromBase(baseY, 93));
//        baseUI.child(24, 50125, getXFromBase(baseX, 10), getYFromBase(baseY, 108));
//        baseUI.child(25, 50126, getXFromBase(baseX, 10), getYFromBase(baseY, 123));
//        baseUI.child(26, 50127, getXFromBase(baseX, 10), getYFromBase(baseY, 138));
//        baseUI.child(27, 50128, getXFromBase(baseX, 10), getYFromBase(baseY, 60));
//        baseUI.child(39, 50140, getXFromBase(baseX, 10), getYFromBase(baseY, 153));
//        //voyage progress
//        baseUI.child(29, 50129, getXFromBase(baseX, 8), getYFromBase(baseY, 170));
//        baseUI.child(28, 50130, getXFromBase(baseX, 8), getYFromBase(baseY, 170));
//        baseUI.child(30, 50131, getXFromBase(baseX, 76), getYFromBase(baseY, 177));
//        //buttons
//        baseUI.child(31, 50132, getXFromBase(baseX, 8), getYFromBase(baseY, 200));
//        baseUI.child(32, 50133, getXFromBase(baseX, 77), getYFromBase(baseY, 200));//77 145
//        baseUI.child(33, 50134, getXFromBase(baseX, 8), getYFromBase(baseY, 232));
//        baseUI.child(34, 50135, getXFromBase(baseX, 77), getYFromBase(baseY, 232));
//        //button text
//        baseUI.child(35, 50136, getXFromBase(baseX, 43), getYFromBase(baseY, 205));
//        baseUI.child(36, 50137, getXFromBase(baseX, 110), getYFromBase(baseY, 205));//77 145
//        baseUI.child(37, 50138, getXFromBase(baseX, 43), getYFromBase(baseY, 237));
//        baseUI.child(38, 50139, getXFromBase(baseX, 110), getYFromBase(baseY, 237));
//    }

    private static void addSailingTradeSelectionUI(TextDrawingArea[] tda) {
        final RSInterface baseUI = addInterface(50100);
        final String baseDir = "Interfaces/runehub/sailing/SPRITE";
        final int baseX = 30;
        final int baseY = 25;

        //empty frame
        addSprite(50101, 7, baseDir);
        //frame title
        addText(50102, "Select Trade Goods", tda, 2, 0xFFA500, true, true);
        //close button
        addButton(50103, 3, baseDir, "Close");
        //item group titles
        addText(50104, "Selling", tda, 2, 0xFFA500, true, true);
        addText(50105, "Buying", tda, 2, 0xFFA500, true, true);
        //Item groups
        addToItemGroup(50106, 5, 2, 160, 40, 8, 8);
        addToItemGroup(50107, 5, 2, 160, 40, 8, 8);
        //clickable item sprites
        for (int i = 0; i < 10; i++) {
            int childId = 50108;
            addClickableSprites(childId + i, "Buy", baseDir, 8, 8);
        }
        for (int i = 0; i < 10; i++) {
            int childId = 50118;
            addClickableSprites(childId + i, "Sell", baseDir, 8, 8);
        }


        baseUI.totalChildren(27);
        //empty frame positioning
        baseUI.child(0, 50101, baseX, baseY);
        //frame title positioning
        baseUI.child(1, 50102, getXFromBase(baseX, 235), getYFromBase(baseY, 5));
        //exit button positioning
        baseUI.child(2, 50103, 463, 28);
        //selling text positioning
        baseUI.child(3, 50104, 300, 50);
        //buying text positioning
        baseUI.child(4, 50105, 300, 180);
        //Clickable item sprite positions
        for (int i = 0; i < 10; i++) {
            int index = 5;
            int childId = 50108;
            if (i < 5) {
                baseUI.child(index + i, childId + i, 275 + (i * 40), 75);
            } else {
                baseUI.child(index + i, childId + i, 275 + ((i - 5) * 40), 115);
            }
        }
        //selling item group positioning
        baseUI.child(15, 50106, 280, 79);
        for (int i = 0; i < 10; i++) {
            int childId = 50118;
            int index = 16;
            if (i < 5) {
                baseUI.child(index + i, childId + i, 275 + (i * 40), 205);
            } else {
                baseUI.child(index + i, childId + i, 275 + ((i - 5) * 40), 245);
            }
            System.out.println("Index: " + (index + i));
        }
        //buying item group positioning
        baseUI.child(26, 50107, 280, 209);
    }

    private static void runehubTeleport(TextDrawingArea[] tda) {
        RSInterface rsi = addInterface(50100);
        String dir = "Interfaces/runehub/teleport/SPRITE";

        final int baseX = 30;
        final int baseY = 25;

        addSprite(50101, 0, dir);
        addText(50102, "Open Rift", tda, 2, 0xFFA500, true, true);
        addToItemGroup(50103, 5, 3, 289, 167, false, null, null, null);

        rsi.totalChildren(3);
        rsi.child(0, 50101, baseX, baseY);
        rsi.child(1, 50102, getXFromBase(baseX, 235), getYFromBase(baseY, 5));
        rsi.child(2, 50103, getXFromBase(baseX, 289), getYFromBase(baseY, 167));

//        RSInterface itemScroll = addTabInterface(50130);
//
//
//
//        itemScroll.width = 159;
//        itemScroll.height = 96;
//        itemScroll.scrollMax = 96;
    }

    private static void playPass(TextDrawingArea[] tda) {
        RSInterface rsi = addInterface(55100);

        addSprite(55101, 0, "Interfaces/runehub/play-pass/SPRITE");
        addText(55102, ClientProperties.getInstance().getGameName() + " Play Pass", tda, 2, 0xFFA500, true, true);
        addToItemGroup(55103, 10, 1, 15, 215, false, null, null, null);
        addButton(55104, 1, "Interfaces/runehub/play-pass/SPRITE", "Close");
        addButton(55105, 3, "Interfaces/runehub/play-pass/SPRITE", "Back");
        addButton(55106, 4, "Interfaces/runehub/play-pass/SPRITE", "Next");
        addText(56200, "Page 1 (1/5)", tda, 1, 0xFFA500, true, false);
        addButton(56201, 5, "Interfaces/runehub/play-pass/SPRITE", "Free");
        addText(56202, "Lorem Ipsum", tda, 2, 0xFFA500, true, true);
        addText(56203, "Lorem Ipsum", tda, 1, 0xFFA500, true, false);
        addButton(56204, 810, "Interfaces/runehub/play-pass/SPRITE", "Claim Prize");
        addText(56205, "Claim", tda, 1, 0xFFA500, true, false);
        addToItemGroup(56206, 3, 1, 12, 45, true, "Examine", null, null);
        addButton(56207, 5, "Interfaces/runehub/play-pass/SPRITE", "Members");
        addButton(56208, 5, "Interfaces/runehub/play-pass/SPRITE", "Members");
        addSprite(56209, 99, "Interfaces/runehub/play-pass/SPRITE");
        addSprite(56210, 99, "Interfaces/runehub/play-pass/SPRITE");
        addText(56222, "Welcome to the " + ClientProperties.getInstance().getGameName() + " Play Pass", tda, 2, 0xFFA500, true, false);
        addText(56223, "Season 1", tda, 1, 0xFFA500, true, false);
        addWrappingText(56224, "Level up your Play Pass passively by training skills, fighting enemies, completing tasks, and playing minigames. With each levelup you will be able to claim a reward. Members may be able to claim additional rewards. Members will also receives a +20% Play Pass XP Boost.", tda, 1, 0xFFA500, true, false, 330);
        addText(56225, "Your are currently level: 0", tda, 2, 0xFFA500, true, false);
        addText(56237, "Next season starts in 0", tda, 1, 0xFFA500, true, false);
        for (int i = 0; i < 10; i++) {
            addButton(55107 + i, 5, "Interfaces/runehub/play-pass/SPRITE", "View");
            addText(56118 + i, "Locked", tda, 1, 0xFFA500, true, false);
            addSprite(56211 + i, 7, "Interfaces/runehub/play-pass/SPRITE");
            addProgressBar(56238 + i, 44, 16, new int[]{0xA67711, 0x005F00});
            addSprite(56226 + i, 9, "Interfaces/runehub/play-pass/SPRITE");
//			addConfigButton(49005, 49000, 8, 9, "Interfaces/play-pass/SPRITE", 16, 20, "", 1, 1, 800);
        }

        setChildren(72, rsi);
        setBounds(55101, 10, 10, 0, rsi);
        setBounds(55102, 253, 15, 1, rsi);
        setBounds(55103, 27, 195, 12, rsi);
        setBounds(55104, 473, 14, 13, rsi);
        setBounds(55105, 23, 265, 14, rsi);
        setBounds(55106, 455, 265, 15, rsi);
        setBounds(56200, 255, 265, 26, rsi);
        setBounds(56201, 65, 45, 27, rsi);
        setBounds(56202, 85, 100, 28, rsi);
        setBounds(56203, 85, 120, 29, rsi);
        setBounds(56204, 52, 140, 30, rsi);
        setBounds(56205, 88, 148, 31, rsi);
        setBounds(56206, 28, 53, 34, rsi);
        setBounds(56207, 21, 45, 32, rsi);
        setBounds(56208, 109, 45, 33, rsi);
        setBounds(56209, 36, 79, 35, rsi);
        setBounds(56210, 124, 79, 36, rsi);
        setBounds(56222, 330, 39, 47, rsi);
        setBounds(56223, 330, 55, 48, rsi);
        setBounds(56224, 163, 70, 49, rsi);
        setBounds(56225, 330, 150, 50, rsi);
        setBounds(56237, 255, 280, 61, rsi);
        for (int i = 0; i < 10; i++) {
            setBounds(55107 + i, 21 + (i * 47), 185, 2 + i, rsi);
            setBounds(56118 + i, 43 + (i * 47), 236, 62 + i, rsi);
            setBounds(56211 + i, 21 + (i * 47), 235, 16 + i, rsi);
            setBounds(56238 + i, 21 + (i * 47), 235, 37 + i, rsi);
            setBounds(56226 + i, 35 + (i * 47), 185, 51 + i, rsi);
        }
    }


    private static void caelTournamentSupplies(TextDrawingArea[] tda) {
        RSInterface main = addInterface(55100);

        RSInterface widget = addInterface(55106);

        addSprite(55101, 0, "Interfaces/twbase/sprite");

        addHoverButton(55102, "Interfaces/twbase/sprite", 1, 16, 16,
                "Close Window", 0, 55104, 4);
        addHoveredButton(55104, "Interfaces/twbase/sprite", 2, 16, 16, 55103);

        addText(55105, "Tournament Supplies", tda, 2, 0xE68A00, true, true);

        addInputField(55120, 50, 0xE68A00, "Search", 132, 23, false, true);

        addToItemGroup(55121, 8, 80, 25, 10, true, "Get 1", "Get 5", "Get 10", "Get 50", "Get 100", "Get X");

        setChildren(6, main);
        main.child(0, 55101, 13, 10);
        main.child(1, 55102, 475, 18);
        main.child(2, 55104, 475, 18);
        main.child(3, 55105, 250, 19);
        main.child(4, 55120, 180, 279);
        main.child(5, 55106, 12, 57);

        setChildren(1, widget);
        widget.child(0, 55121, 12, 12);

        widget.width = 450;

        widget.height = 223;

        widget.scrollMax = 450;
    }

    private static void wrathRune() {
        RSInterface rune = addTabInterface(28226);
        rune.totalChildren(1);
        addSprite(28228, 0, "Magic/wrath");
        setBounds(28228, 0, 0, 0, rune);
    }
    private static void LoginInterface() {
        RSInterface rsi = addInterface(54000);
        
        // Adding the "Close" button
        addButton(54004, 1, "Interfaces/Og Panda/SPRITE", "Close");
        
        // Adding main interface sprite
        addSprite(54005, 0, "Interfaces/Og Panda/SPRITE");
        
        // Set bounds for all elements in the interface
        rsi.totalChildren(2);  // The interface has two children: the main sprite and the close button
        rsi.child(0, 54005, 20, 30);  // Main interface bounds
        rsi.child(1, 54004, 225, 275); // Close button bounds
    }
    	
    	
    	/*
        RSInterface rune = addTabInterface(54000);
        rune.totalChildren(1);
        addSprite(54005, 0, "Magic/log");
        setBounds(54005, 20, 30, 0, rune);
        String dir = "/Interfaces/Exp Lock/SPRITE";
        addSprite(54006, 0, dir);
        addButton(55104, 1, "Interfaces/runehub/play-pass/SPRITE", "Close");
        addHoverButton(54007, dir, 1, 16, 16, "Close", -1, 54008, 1);
        addHoveredButton(54008, dir, 2, 16, 16, 54009);

    }
*/        
       /* log.totalChildren(1);
        addSprite(54001, 0, "Start/login");
        setBounds(54001, 0, 0, 0, log);
    } */
    private static void normals(TextDrawingArea[] tda) {
        RSInterface p = addTabInterface(938);
        RSInterface rsinterface = interfaceCache[1151];
        RSInterface rsinterface2 = interfaceCache[12424];
        rsinterface2.height = 250;
        for (int i = 57; i < 58; i++) {

            // earth wave
            rsinterface2.childX[36] = 96;
            rsinterface2.childY[36] = 168;

            // enfeeble
            rsinterface2.childX[46] = 120;
            rsinterface2.childY[46] = 168;

            // teleother lumbridge
            rsinterface2.childX[53] = 144;
            rsinterface2.childY[53] = 168;

            // fire wave
            rsinterface2.childX[37] = 1;
            rsinterface2.childY[37] = 192;

            // entangle
            rsinterface2.childX[50] = 23;
            rsinterface2.childY[50] = 192;

            // stun
            rsinterface2.childX[47] = 47;
            rsinterface2.childY[47] = 193;

            // charge
            rsinterface2.childX[41] = 71;
            rsinterface2.childY[41] = 192;

            // teleother falador
            rsinterface2.childX[54] = 120;
            rsinterface2.childY[54] = 192;

            // teleblock
            rsinterface2.childX[55] = 0;
            rsinterface2.childY[55] = 218;

            // lvl-6 enchant
            rsinterface2.childX[57] = 47;
            rsinterface2.childY[57] = 218;

            // teleother camelot
            rsinterface2.childX[56] = 71;
            rsinterface2.childY[56] = 218;
        }
        rsinterface.childY[1] = 12;
        rsinterface.childX[1] = 14;
        addSpellSmall2_3(31674 + 975, 563, 566, 555, 554, 2, 2, 4, 5, 30012, 30015, 30004, 30003, 68, "Teleport to Kourend",
                "Teleports you to Kourend", tda, 10, 7, 5);
        addSpellLarge2(13674 + 975, 563, 560, 562, 1, 1, 1, 30012, 30009, 30011, 84, "Teleport to Bounty\\nTarget",
                "Teleports you near your Bounty\\nHunter Target", tda, 8, 7, 5);

        addSpellSmall2(22674 + 975, 565, 566, 564, 20, 20, 1, 30014, 30015, 30013, 92, "Lvl-7 Enchant",
                "For use on zenyte jewellery", tda, 12, 8, 5);

        addSpellSmaller(22644 + 975, 556, 21880, 7, 1, 30005, 28226, 80, "Wind Surge",
                "A very high level Air missile", tda, 0, 10, 2);

        addSpellSmall(22658 + 975, 555, 556, 21880, 10, 7, 1, 30004, 30005, 28226, 84, "Water Surge",
                "A very high level Water missile", tda, 2, 10, 2);

        addSpellSmall(22628 + 975, 557, 556, 21880, 10, 7, 1, 30006, 30005, 28226, 89, "Earth Surge",
                "A very high level Earth missile", tda, 4, 10, 2);

        addSpellSmall(22608 + 975, 554, 556, 21880, 10, 7, 1, 30003, 30005, 28226, 94, "Fire Surge",
                "A very high level Fire missile", tda, 6, 10, 2);

        setChildren(15, p);
        setBounds(31674 + 975, 84, 178, 0, p);
        setBounds(13674 + 975, 35, 228, 1, p);
        setBounds(22674 + 975, 132, 227, 2, p);
        setBounds(22644 + 975, 108, 202, 3, p);
        setBounds(22658 + 975, 156, 202, 4, p);
        setBounds(22628 + 975, 108, 227, 5, p);
        setBounds(22608 + 975, 156, 227, 6, p);
        setBounds(1151, 0, 0, 7, p);
        setBounds(22609 + 975, 5, 5, 8, p);
        setBounds(22629 + 975, 5, 5, 9, p);
        setBounds(22659 + 975, 5, 5, 10, p);
        setBounds(22645 + 975, 5, 5, 11, p);
        setBounds(31675 + 975, 5, 5, 12, p);
        setBounds(13675 + 975, 5, 5, 13, p);
        setBounds(22675 + 975, 5, 5, 14, p);
    }

    private static void closeButton(int id, int sprite2, int sprite1) {
        RSInterface tab = addInterface(id);
        tab.atActionType = 0;
        tab.type = 0;
        tab.sprite2 = Client.cacheSprite3[sprite2];
        tab.sprite1 = Client.cacheSprite3[sprite1];
        tab.width = tab.sprite1.myWidth;
        tab.height = tab.sprite2.myHeight;
        // tab.toggled = false;
        // tab.spriteOpacity = 255;d
    }

    private static void createSkillHover(int id, int x) {
        RSInterface hover = addInterface(id);
        hover.inventoryhover = true;
        hover.type = 8;
        hover.message = "TESTING!" + x;
        hover.contentType = x;
        hover.width = 60;
        hover.height = 32;
    }

    private static void skillTabWithHovers(TextDrawingArea[] tda) {
        int[] firstRow = {-1,

                /** First row (enx. index 9) **/
                14918, 14919, 14920, 14921, 14922, 14923, 14924, 14933

        };
        int[] secondRow = {

                /** Second row (enx. index 8) **/
                14926, 14927, 14928, 14929, 14930, 14931, 14932, 14925

        };
        int[] thirdRow = {

                /** Third row (enx. index 8) **/
                14934, 14935, 14936, 14937, 14938, 14939, 14940

        };

        RSInterface tab = addInterface(13917);
        tab.totalChildren(firstRow.length + secondRow.length + thirdRow.length);
        setBounds(3917, 0, 0, 0, tab);
        for (int i = 1; i < firstRow.length; i++) {
            createSkillHover(firstRow[i], 205 + i);
            setBounds(firstRow[i], 0, 2 + (32 * i) - 32, i, tab);
        }
        for (int i = 0; i < secondRow.length; i++) {
            createSkillHover(secondRow[i], 214 + i);
            setBounds(secondRow[i], 60, 2 + (32 * i), 9 + i, tab);
        }
        for (int i = 0; i < thirdRow.length; i++) {
            createSkillHover(thirdRow[i], 223 + i);
            setBounds(thirdRow[i], 120, 2 + (32 * i), 17 + i, tab);
        }
    }

    private static void equipmentScreen(TextDrawingArea[] wid) {
        RSInterface Interface = RSInterface.interfaceCache[1644];
        addButton(19144, 140, "Show Equipment Stats");
        removeSomething(19145);
        removeSomething(19146);
        removeSomething(19147);
        setBounds(19145, 40, 210, 24, Interface);
        setBounds(19146, 40, 210, 25, Interface);
        setBounds(19147, 40, 210, 26, Interface);
        RSInterface tab = addTabInterface(15106);
        addSprite3(15107, 116);

        addHoverButton_sprite_loader(15210, 142, 21, 21, "Close", 250, 15211, 3);
        addHoveredButton_sprite_loader(15211, 143, 21, 21, 15212);

        addText(15111, "Equip Your Character...", wid, 2, 0xFF9300, false, true);
        addText(15112, "Attack bonus", wid, 2, 0xFF9300, false, true);
        addText(15113, "Defence bonus", wid, 2, 0xFF9300, false, true);
        addText(15114, "Other bonuses", wid, 2, 0xFF9300, false, true);

        addText(16117, "0kg", wid, 1, 0xFF9300, false, true);

        for (int i = 1675; i <= 1684; i++) {
            textSize(i, wid, 1);
        }
        textSize(1686, wid, 1);
        textSize(1687, wid, 1);
        addChar(15125);
        tab.totalChildren(45);
        tab.child2(0, 15107, 5, 5);
        tab.child2(1, 15210, 477, 12);
        tab.child2(2, 15211, 477, 12);
        tab.child2(3, 15111, 15, 15);
        int Child = 4;
        int Y = 69;
        int xOff = 332;
        int xOff2 = 323;
        int yOff = 7;
        int yOff2 = 8;
        for (int i = 1675; i <= 1679; i++) {
            tab.child2(Child, i, 20 + xOff, Y - yOff2);
            Child++;
            Y += 14;
        }

        tab.child2(9, 1680, 20 + xOff, 161 - yOff2);
        tab.child2(10, 1681, 20 + xOff, 177 - yOff2);
        tab.child2(11, 1682, 20 + xOff, 192 - yOff2);
        tab.child2(12, 1683, 20 + xOff, 207 - yOff2);
        tab.child2(13, 1684, 20 + xOff, 221 - yOff2);
        tab.child2(14, 1686, 20 + xOff, 262 - yOff2);
        tab.child2(15, 15125, 192, 210);
        tab.child2(16, 15112, 16 + xOff, 55 - yOff2);
        tab.child2(17, 1687, 20 + xOff, 276 - yOff2);
        tab.child2(18, 15113, 16 + xOff, 147 - yOff2);
        tab.child2(19, 15114, 16 + xOff, 248 - yOff2);
        tab.child2(20, 1645, 104 + 295 - xOff2, 149 - 52 + yOff);
        tab.child2(21, 1646, 399 - xOff2, 163 + yOff);
        tab.child2(22, 1647, 399 - xOff2, 163 + yOff);
        tab.child2(23, 1648, 399 - xOff2, 58 + 146 + yOff);
        tab.child2(24, 1649, 26 + 22 + 297 - xOff2 - 2, 110 - 44 + 118 - 13 + 5 + yOff);
        tab.child2(25, 1650, 321 - xOff2 + 22, 58 + 154 + yOff);
        tab.child2(26, 1651, 321 - xOff2 + 134, 58 + 118 + yOff);
        tab.child2(27, 1652, 321 - xOff2 + 134, 58 + 154 + yOff);
        tab.child2(28, 1653, 321 - xOff2 + 48, 58 + 81 + yOff);
        tab.child2(29, 1654, 321 - xOff2 + 107, 58 + 81 + yOff);
        tab.child2(30, 1655, 321 - xOff2 + 58, 58 + 42 + yOff);
        tab.child2(31, 1656, 321 - xOff2 + 112, 58 + 41 + yOff);
        tab.child2(32, 1657, 321 - xOff2 + 78, 58 + 4 + yOff);
        tab.child2(33, 1658, 321 - xOff2 + 37, 58 + 43 + yOff);
        tab.child2(34, 1659, 321 - xOff2 + 78, 58 + 43 + yOff);
        tab.child2(35, 1660, 321 - xOff2 + 119, 58 + 43 + yOff);
        tab.child2(36, 1661, 321 - xOff2 + 22, 58 + 82 + yOff);
        tab.child2(37, 1662, 321 - xOff2 + 78, 58 + 82 + yOff);
        tab.child2(38, 1663, 321 - xOff2 + 134, 58 + 82 + yOff);
        tab.child2(39, 1664, 321 - xOff2 + 78, 58 + 122 + yOff);
        tab.child2(40, 1665, 321 - xOff2 + 78, 58 + 162 + yOff);
        tab.child2(41, 1666, 321 - xOff2 + 22, 58 + 162 + yOff);
        tab.child2(42, 1667, 321 - xOff2 + 134, 58 + 162 + yOff);
        tab.child2(43, 1688, 50 + 297 - xOff2 - 2, 110 - 13 + 5 + yOff);

        // Maxhits

        tab.child2(44, 16117, 87, 283);

        for (int i = 1675; i <= 1684; i++) {
            RSInterface rsi = interfaceCache[i];
            rsi.textColor = 0xFF9300;
            rsi.centerText = false;
        }
        for (int i = 1686; i <= 1687; i++) {
            RSInterface rsi = interfaceCache[i];
            rsi.textColor = 0xFF9300;
            rsi.centerText = false;
        }
    }

    private static void expLock(TextDrawingArea[] tda) {
        RSInterface tab = addInterface(37500);
        String dir = "/Interfaces/Exp Lock/SPRITE";
        String dir2 = "/Interfaces/Prestige/PlayerStats/skills/IMG";
        addSprite(37501, 0, dir);
        addHoverButton(37502, dir, 1, 16, 16, "Close", -1, 37503, 1);
        addHoveredButton(37503, dir, 2, 16, 16, 37504);
        addText(37505, "Exp Lock Manager", tda, 2, 0xFFA500, true, true);
        int x = 150, y = 10;
        tab.totalChildren(5);
        tab.child(0, 37501, x, y);
        tab.child(1, 37502, 180 + x, 4 + y);
        tab.child(2, 37503, 180 + x, 4 + y);
        tab.child(3, 37505, 100 + x, 5 + y);
        tab.child(4, 37510, 10 + x, 30 + y);

        final String[] skillNames = {"Attack", "Defence", "Strength", "Hitpoints", "Ranged", "Prayer", "Magic"};

        RSInterface over = addInterface(37510);
        addSprite(37527, 5, dir);
        int xx = 0, yy = 0;
        over.totalChildren(42);
        for (int i = 0; i < 7; i++) {
            addButton(37511 + i, 3, dir, "Toggle @lre@" + skillNames[i]);
            addSprite(37519 + i, i, dir2);
            addText(37528 + i, Client.capitalize(skillNames[i]) + ":", tda, 0, 16748608, false, true);
            addText(37536 + i, "@gre@Unlocked", tda, 0, 16777215, false, true);
            addText(37544 + i, "@gre@99", tda, 0, 16777215, false, true);
            int[] g = centerSkillSprite(interfaceCache[37519 + i].sprite1);
            over.child(i, 37511 + i, xx, yy);
            over.child(i + 7, 37519 + i, xx + g[0], yy + g[1]);
            over.child(i + 14, 37527, xx + 32, yy + 7);
            over.child(i + 21, 37528 + i, xx + 35, yy + 10);
            over.child(i + 28, 37536 + i, xx + 125, yy + 10);
            over.child(i + 35, 37544 + i, xx + 90, yy + 10);
            xx += 117;
            if (xx == 117) {
                xx = 0;
                yy += 39;
            }
        }
    }

    private static void settingsInterface(TextDrawingArea[] tda) {
        RSInterface tab = addInterface(39000);
        addSprite(39001, 1, "/Interfaces/Achievements/IMAGE");
        addText(39002, "Advanced Settings", tda, 2, 0xFFA500, true, true);
        addText(39020, "    Have something you would want to see added here? Please suggest it on our forums!", tda, 1, 0xFFA500, false, true);
        String dir = "/Interfaces/Prestige/SPRITE";
        addHoverButton(39021, dir, 1, 16, 16, "Close", -1, 39022, 1);
        addHoveredButton(39022, dir, 2, 16, 16, 39023);
        setChildren(6, tab);
        setBounds(39001, 0, 0, 0, tab);
        setBounds(39002, 253, 15, 1, tab);
        setBounds(39003, 60, 65, 2, tab);
        setBounds(39020, 5, 310, 3, tab);
        setBounds(39021, 490, 5, 5, tab);
        setBounds(39022, 490, 5, 4, tab);
        RSInterface scroll = addInterface(39003);
        scroll.width = 366;
        scroll.height = 238;
        scroll.scrollMax = 550;
        scroll.totalChildren(22);
        addText(39004, "Old Gameframe", tda, 2, 0xFFA500, false, true);
        addText(39005, "Game Timers", tda, 2, 0xFFA500, false, true);
        addText(39006, "Anti-aliasing", tda, 2, 0xFFA500, false, true);
        addText(39007, "Ground item names", tda, 2, 0xFFA500, false, true);
        addText(39008, "Fog", tda, 2, 0xFFA500, false, false);
        addText(39009, "Smooth shading", tda, 2, 0xFFA500, false, true);
        addText(39010, "Tile blending", tda, 2, 0xFFA500, false, true);
        addText(39019, "Inventory Menu", tda, 2, 0xFFA500, false, true);
        addText(39023, "Bounty Hunter", tda, 2, 0xFFA500, false, true);
        addText(39024, "Entity Target", tda, 2, 0xFFA500, false, true);
        addText(39028, "Chat effect", tda, 2, 0xFFA500, false, true);
        dropdownMenu(39011, 166, 1, new String[]{"On", "Off"}, Dropdown.OLD_GAMEFRAME, tda, 1);
        dropdownMenu(39012, 166, 0, new String[]{"On", "Off"}, Dropdown.GAME_TIMERS, tda, 1);
        dropdownMenu(39013, 166, 1, new String[]{"On", "Off"}, Dropdown.ANTI_ALIASING, tda, 1);
        dropdownMenu(39014, 166, 1, new String[]{"On", "Off"}, Dropdown.GROUND_ITEM_NAMES, tda, 1);
        dropdownMenu(39015, 166, 0, new String[]{"Off", "On(Grey)", "On(Sisle)", "On(Dark)", "On(Marroon)", "On(Rainbow?)"}, Dropdown.FOG, tda, 1);
        dropdownMenu(39016, 166, 0, new String[]{"On", "Off"}, Dropdown.SMOOTH_SHADING, tda, 1);
        dropdownMenu(39017, 166, 0, new String[]{"On", "Off"}, Dropdown.TILE_BLENDING, tda, 1);
        dropdownMenu(39018, 166, 1, new String[]{"Off", "On (Magenta)", "On (Lime green)", "On (Cyan)", "On (Red)"}, Dropdown.INVENTORY_CONTEXT_MENU, tda, 1);
        dropdownMenu(39025, 166, 0, new String[]{"On", "Off"}, Dropdown.BOUNTY_HUNTER, tda, 1);
        dropdownMenu(39026, 166, 0, new String[]{"On", "Off"}, Dropdown.TARGET_INTERFACE, tda, 1);
        dropdownMenu(39027, 166, 0, new String[]{"Yellow(Default)", "Red", "Green", "Cyan", "Purple", "White", "Flash 1", "Flash 2", "Flash 3", "Glow 1", "Glow 2", "Glow 3"}, Dropdown.CHAT_EFFECT, tda, 1);

        setBounds(39004, 3, 0, 0, scroll);
        setBounds(39005, 3, 25, 1, scroll);
        setBounds(39006, 3, 50, 2, scroll);
        setBounds(39007, 3, 75, 3, scroll);
        setBounds(39008, 3, 100, 4, scroll);
        setBounds(39009, 3, 125, 5, scroll);
        setBounds(39010, 3, 150, 6, scroll);
        setBounds(39028, 3, 250, 21, scroll);
        setBounds(39024, 3, 225, 20, scroll);
        setBounds(39023, 3, 200, 19, scroll);
        setBounds(39019, 3, 175, 18, scroll);
        setBounds(39011, 199, 0, 17, scroll);
        setBounds(39012, 199, 25, 16, scroll);
        setBounds(39013, 199, 50, 15, scroll);
        setBounds(39014, 199, 75, 14, scroll);
        setBounds(39015, 199, 100, 13, scroll);
        setBounds(39016, 199, 125, 12, scroll);
        setBounds(39017, 199, 150, 11, scroll);
        setBounds(39018, 199, 175, 10, scroll);
        setBounds(39025, 199, 200, 9, scroll);
        setBounds(39026, 199, 225, 8, scroll);
        setBounds(39027, 199, 250, 7, scroll);
    }



    private static void prestigeInterface(TextDrawingArea[] tda) {
        RSInterface tab = addInterface(37300);
        String dir = "/Interfaces/Prestige/SPRITE";
        String dir2 = "/Interfaces/Prestige/PlayerStats/skills/IMG";
        addSprite(37301, 0, dir);
        addHoverButton(37302, dir, 1, 16, 16, "Close", -1, 37303, 1);
        addHoveredButton(37303, dir, 2, 16, 16, 37304);
        addText(37305, "Prestige Manager", tda, 2, 0xFFA500, true, true);
        addSprite(37306, 6, dir);
        addText(37307, "Attack:", tda, 2, 0xFFA500, true, true);
        addText(37308, "Current Prestige: @whi@0", tda, 0, 16748608, false, true);
        addText(37309, "Reward: @whi@1000 Points", tda, 0, 16748608, false, true);
        addText(37390, "Can Prestige: @whi@...", tda, 0, 16748608, false, true);
        addHoverButton(37391, dir, 7, 80, 31, "Prestige selected skill", 0, 37392, 1);
        addHoveredButton(37392, dir, 8, 80, 31, 37393);
        addText(37394, "Prestige", tda, 2, 16777215, true, true);
        int x = 10, y = 10;
        tab.totalChildren(13);
        tab.child(0, 37301, x, y);
        tab.child(1, 37302, 463 + x, 4 + y);
        tab.child(2, 37303, 463 + x, 4 + y);
        tab.child(3, 37305, 243 + x, 5 + y);
        tab.child(4, 37310, 10 + x, 30 + y);
        tab.child(5, 37306, 258 + x, 222 + y);
        tab.child(6, 37307, 366 + x, 226 + y);
        tab.child(7, 37308, 263 + x, 242 + y);
        tab.child(8, 37309, 263 + x, 257 + y);
        tab.child(9, 37390, 263 + x, 273 + y);
        tab.child(10, 37391, 389 + x, 255 + y);
        tab.child(11, 37392, 389 + x, 255 + y);
        tab.child(12, 37394, 429 + x, 262 + y);

        final String[] skillNames = {"attack", "defence", "strength", "hitpoints", "ranged", "prayer", "magic",
                "cooking", "woodcutting", "fletching", "fishing", "firemaking", "crafting", "smithing", "mining",
                "herblore", "agility", "thieving", "slayer", "foraging", "runecraft", "hunter", "-unused-", "-unused-",
                "-unused-"};

        RSInterface over = addInterface(37310);
        addSprite(37359, 5, dir);
        int xx = 0, yy = 0, line = 0;
        over.totalChildren(110);
        for (int i = 0; i < 22; i++) {
            addButton(37311 + i, 3, dir, "Select @lre@" + skillNames[i]);
            addSprite(37335 + i, i, dir2);
            addText(37360 + i, Client.capitalize(skillNames[i]), tda, 0, 16748608, false, true);
            addText(37400 + i, "0", tda, 0, 16777215, false, true);
            int[] g = centerSkillSprite(interfaceCache[37335 + i].sprite1);
            int bonusY = 0;
            if (xx == 0 || xx == 117)
                bonusY = 5 * line;
            over.child(i, 37311 + i, xx, yy + bonusY);
            over.child(i + 22, 37335 + i, xx + g[0], yy + g[1] + bonusY);
            over.child(i + 44, 37359, xx + 32, yy + 7 + bonusY);
            over.child(i + 66, 37360 + i, xx + 35, yy + 10 + bonusY);
            over.child(i + 88, 37400 + i, xx + 102, yy + 10 + bonusY);
            xx += 117;
            if (xx == 468) {
                xx = 0;
                yy += 39;
                line++;
            }
        }
    }

    private static int[] centerSkillSprite(Sprite s) {
        int x = 15, y = 15;
        x -= (s.myWidth / 2);
        y -= (s.myHeight / 2);
        return new int[]{x, y};
    }

    private static void slayerOverlay(TextDrawingArea[] tda) {
        RSInterface rsInterface = addInterface(35424);
        addText(35425, "Abyssal Demon: 5", tda, 1, 0xF7FE2E, true, true); //child 1
        setChildren(1, rsInterface);
        rsInterface.child(0, 35425,
                Client.currentScreenMode == ScreenMode.FIXED ? 250 : (Client.currentGameWidth - 300), 10); // Assignment
    }

    public static void Teleporting(TextDrawingArea[] ryan) {
		int interfaceId = 31000;
		int selectScrollId = 31020; 
		int teleScrollId = 31050;
		String dir = "Interfaces/Teleporting/SPRITE";
		int index = 1;
		RSInterface main = addInterface(interfaceId);
		main.totalChildren(21);
		
		addSprite(interfaceId + index++, 0, dir);
		configHoverButton1(interfaceId + index, "Close", dir, 40, 41, 41, 41, false, new int[] { interfaceId + index++ });
		addText(interfaceId + index++, "", ryan, 2, 0xff9933, true, true);
		
		addText(interfaceId + index++, "Favorites", ryan, 2, 0xd9bc50, false, true);
		addText(interfaceId + index++, "Recent Visits", ryan, 2, 0xd9bc50, false, true);
		addText(interfaceId + index++, "Destination", ryan, 2, 0xd9bc50, false, true);
		addText(interfaceId + index++, "", ryan, 2, 0xd9bc50, false, true);
		addText(interfaceId + index++, "Threat Lvl", ryan, 2, 0xd9bc50, false, true);
		
		for(int i = 0; i < 8; i++) {
			addClickableText(interfaceId + index++, "Favourites", "Select", ryan, 1, 0xff9040, false, true, 133);		
		}
		for(int i = 0; i < 3; i++) {
			addClickableText(interfaceId + index++, "Recents Here ", "Select", ryan, 1, 0xff9040, false, true, 133);
		}
		
		int basex = 12, basey = 4;
		index = 0;
		
		main.child(index++, interfaceId + index, basex, basey);
		main.child(index++, interfaceId + index, basex + 463, basey + 6);
		main.child(index++, interfaceId + index, basex + 245, basey + 8);
		
		main.child(index++, interfaceId + index, basex + 6, basey + 75);
		main.child(index++, interfaceId + index, basex + 6, basey + 245);
		main.child(index++, interfaceId + index, basex + 152, basey + 76);
		main.child(index++, interfaceId + index, basex + 345, basey + 76);
		main.child(index++, interfaceId + index, basex + 411, basey + 76);
		
		main.child(index++, interfaceId + index, basex + 10, basey + 97);
		main.child(index++, interfaceId + index, basex + 10, basey + 98 + (17 * 1));
		main.child(index++, interfaceId + index, basex + 10, basey + 99 + (17 * 2));
		main.child(index++, interfaceId + index, basex + 10, basey + 100 + (17 * 3));
		main.child(index++, interfaceId + index, basex + 10, basey + 101 + (17 * 4));
		main.child(index++, interfaceId + index, basex + 10, basey + 102 + (17 * 5));
		main.child(index++, interfaceId + index, basex + 10, basey + 103 + (17 * 6));
		main.child(index++, interfaceId + index, basex + 10, basey + 104 + (17 * 7));
		
		main.child(index++, interfaceId + index, basex + 10, basey + 267);
		main.child(index++, interfaceId + index, basex + 10, basey + 270 + (17 * 1));
		main.child(index++, interfaceId + index, basex + 10, basey + 273 + (17 * 2));
		
		main.child(index++, selectScrollId, basex + 4, basey + 32);
		main.child(index++, teleScrollId, basex + 141, basey + 95);
		
		int boxes = 6;
        
        RSInterface selectScroll = addTabInterface(selectScrollId);
		
		selectScroll.totalChildren(boxes * 3);
		String[] names = {"Monsters", "Dungeons", "Bosses", "Minigames", "Skilling", "Locations"};
		int id = selectScrollId + 1, frame = 0;
		basex = 2; basey = 2;
		
		configHoverButton1(id, "Select", "Interfaces/Teleporting/SPRITE", 1, 2, 2, 2, false, new int[] { 31022, 31023, 31024, 31025, 31026 });
		selectScroll.child(frame++, id++, basex, basey);
		configHoverButton1(id, "Select", "Interfaces/Teleporting/SPRITE", 1, 2, 2, 2, false, new int[] { 31021, 31023, 31024, 31025, 31026 });
		selectScroll.child(frame++, id++, basex + 80, basey);
		configHoverButton1(id, "Select", "Interfaces/Teleporting/SPRITE", 1, 2, 2, 2, false, new int[] { 31021, 31022, 31024, 31025, 31026});
		selectScroll.child(frame++, id++, basex + 160, basey);
		configHoverButton1(id, "Select", "Interfaces/Teleporting/SPRITE", 1, 2, 2, 2, false, new int[] { 31021, 31022, 31023, 31025, 31026});
		selectScroll.child(frame++, id++, basex + 240, basey);
		configHoverButton1(id, "Select", "Interfaces/Teleporting/SPRITE", 1, 2, 2, 2, false, new int[] { 31021, 31022, 31023, 31024, 31026});
		selectScroll.child(frame++, id++, basex + 320, basey);
		configHoverButton1(id, "Select", "Interfaces/Teleporting/SPRITE", 1, 2, 2, 2, false, new int[] { 31021, 31022, 31023, 31024, 31025});
		selectScroll.child(frame++, id++, basex + 400, basey);
		
		for(int i = 1; i < boxes+1; i++) {
			addText(id, "" + names[i-1], ryan, 0, 0xff9933, true, true);
			selectScroll.child(frame, id, basex + 38, basey + 20);
			id++;
			frame++;
			addSprite(id, 29 + i, dir);
			selectScroll.child(frame, id, basex + 28, basey + 2);
			id++;
			frame++;
			basex += 80;
		}
		
		int boxes1 = 20;
        
        RSInterface teleScroll = addTabInterface(teleScrollId);
		teleScroll.scrollMax = 33 * boxes1;
		teleScroll.width = 330;
		teleScroll.height = 231;
		
		teleScroll.totalChildren(boxes1 * 5);
		
		id = teleScrollId + 1; frame = 0;
		basex = 1; basey = 0;
		for(int i = 1; i < boxes1+1; i++) {
			configHoverButton1(id, "Teleport","Interfaces/Teleporting/SPRITE", 3, 4, 344, 27, false, new int[] { id });
			teleScroll.child(frame, id, basex, basey);
			id++;
			frame++;
			addText(id, "Teleport Name", ryan, 1, 0xff9933, false, true);
			teleScroll.child(frame, id, basex + 22, basey + 8);
			id++;
			frame++;
			addText(id, "FREE", ryan, 1, 0xff9933, true, true);
			teleScroll.child(frame, id, basex + 219, basey + 8);
			id++;
			frame++;
			addText(id, "@gre@Safe Zone", ryan, 1, 0xff9933, true, true);
			teleScroll.child(frame, id, basex + 290, basey + 8);
			id++;
			frame++;
			addClickableSprites(id, "Favourites", "Interfaces/Teleporting/SPRITE", 6, 7, 6);
			teleScroll.child(frame, id, basex + 3, basey + 7);
			id++;
			frame++;
			basey += 33;
		}
	}
      

    /*
     * for (int i = 0; i < 10; i++) { if (i != 0) id++; //51 addHoverButton(id,
     * "Interfaces/Teleporting/Button", 0, 72, 32, "Teleport", 0, id++, 1); //52
     * addHoveredButton(id, "Interfaces/Teleporting/Button", 1, 72, 32, id++); //53
     * id++; //54 addText(id, ""+id+"", tda, 0, 0xff981f, true, true); //""+id+""
     * prints the id of the text id++; //55 addHoverButton(id,
     * "Interfaces/Teleporting/Button", 0, 72, 32, "Teleport", 0, id++, 1); //56
     * addHoveredButton(id, "Interfaces/Teleporting/Button", 1, 72, 32, id++); //57
     * id++; //58 addText(id, ""+id+"", tda, 0, 0xff981f, true, true); //""+id+""
     * prints the id of the text if (i!=0) count++; scroll.child(count, id - 7, 20,
     * 15 + y); // Button 1 scroll.child(count++, id - 6, 20, 15 + y); // Button 1 -
     * Hovered scroll.child(count++, id - 4, 88, 25 + y); // Button 1 text
     * scroll.child(count++, id - 3, 190, 15 + y); // Button 2 scroll.child(count++,
     * id - 2, 190, 15 + y); // Button 2 - Hov9ered scroll.child(count++, id, 255,
     * 25 + y); // Button 2 text y += 47; }
     */
    private static void skotizo(TextDrawingArea[] tda) {
        RSInterface tab = addInterface(29230);
        tab.totalChildren(5);
        addSprite(29231, 0, "Interfaces/Skotizo/SKOTIZOM");
        tab.child(0, 29231, 36, 141);
        addSprites(29232, "Interfaces/Skotizo/SKOTIZO", 3, 0);
        tab.child(1, 29232, 56, 128);
        addSprites(29233, "Interfaces/Skotizo/SKOTIZO", 3, 0);
        tab.child(2, 29233, 56, 193);
        addSprites(29234, "Interfaces/Skotizo/SKOTIZO", 3, 0);
        tab.child(3, 29234, 23, 160);
        addSprites(29235, "Interfaces/Skotizo/SKOTIZO", 3, 0);
        tab.child(4, 29235, 88, 160);
    }

    private static void tradingSelect(TextDrawingArea[] tda) {
        RSInterface Interface = addTabInterface(48599);
        RSInterface history = addTabInterface(48635);
        RSInterface offers = addTabInterface(48950);

        addSprite(48601, 7, "Trading/SPRITE");
        addHover(48602, 3, 0, 48603, 1, "Bank/BANK", 17, 17, "Close Window");
        addHovered(48603, 2, "Bank/BANK", 17, 17, 48604);

        addText(48605, "Trading Post", 0xff9933, true, true, -1, tda, 2);

        addText(48606, "Coffer", 0xff9933, true, true, -1, tda, 2);
        addHoverButton(48607, "Trading/SPRITE", 8, 143, 35, "Claim money", 0, 48608, 1);
        addHoveredButton(48608, "Trading/SPRITE", 9, 143, 35, 48609);
        addText(48610, "", 0xff9933, true, true, -1, tda, 0);

        addText(48611, "Search for...", 0xff9933, true, true, -1, tda, 2);
        addHoverButton(48612, "Trading/SPRITE", 10, 72, 32, "Search for a item", 0, 48613, 1);
        addHoveredButton(48613, "Trading/SPRITE", 11, 72, 32, 48614);

        addHoverButton(48615, "Trading/SPRITE", 10, 72, 32, "Search for a player", 0, 48616, 1);
        addHoveredButton(48616, "Trading/SPRITE", 11, 72, 32, 48617);

        addHoverButton(48618, "Trading/SPRITE", 10, 72, 32, "Recent offers", 0, 48619, 1);
        addHoveredButton(48619, "Trading/SPRITE", 11, 72, 32, 48620);

        addHoverButton(48621, "Trading/SPRITE", 12, 150, 35, "Click", 0, 48622, 1);
        addHoveredButton(48622, "Trading/SPRITE", 13, 150, 35, 48623);

        addText(48624, "History", 0xff9933, true, true, -1, tda, 2);
        addText(48625, "My Offers...", 0xff9933, true, true, -1, tda, 2);

        addText(48626, "Item", 0xff9933, true, true, -1, tda, 2);
        addText(48627, "Player", 0xff9933, true, true, -1, tda, 2);
        addText(48628, "Recent", 0xff9933, true, true, -1, tda, 2);
        addText(48629, "Cancel Listing", 0xff9933, true, true, -1, tda, 2);

        setChildren(25, Interface);

        setBounds(48601, 8, 10, 0, Interface); // Base
        setBounds(48602, 471, 18, 1, Interface); // Close
        setBounds(48603, 471, 18, 2, Interface);

        setBounds(48605, 262, 20, 3, Interface); // Title

        setBounds(48606, 40, 50, 4, Interface); // Coffer text
        setBounds(48607, 19, 68, 5, Interface); // Coffer Button
        setBounds(48608, 19, 68, 6, Interface);
        setBounds(48610, 75, 80, 7, Interface); // Amount in coffer

        setBounds(48611, 59, 250, 8, Interface); // Text search for...
        setBounds(48612, 19, 270, 9, Interface); // Item Button
        setBounds(48613, 19, 270, 10, Interface);

        setBounds(48615, 96, 270, 11, Interface); // Player Button
        setBounds(48616, 96, 270, 12, Interface);

        setBounds(48618, 173, 270, 13, Interface); // Recent Button
        setBounds(48619, 173, 270, 14, Interface);

        setBounds(48621, 293, 270, 15, Interface); // Long button
        setBounds(48622, 293, 270, 16, Interface);

        setBounds(48624, 42, 104, 17, Interface); // Text History
        setBounds(48625, 289, 50, 18, Interface); // TextMy offers

        setBounds(48626, 55, 279, 19, Interface); // Text Item
        setBounds(48627, 132, 279, 20, Interface); // Text Player
        setBounds(48628, 208, 279, 21, Interface); // Text Recent
        setBounds(48629, 367, 279, 22, Interface); // Text List

        setBounds(48635, 30, 128, 23, Interface); // Interface history
        setBounds(48950, 260, 75, 24, Interface); // Interface my offers

        setChildren(20, history);
        for (int i = 48636, y = 5, id = 0; i < 48656; i++) {
            addText(i, "", 0xff9933, true, true, -1, tda, 0);
            setBounds(i, 94, y, id, history);
            if (id == 1 || id == 3 || id == 5 || id == 7 || id == 9 || id == 11 || id == 13 || id == 15 || id == 17)
                y += 20;
            else
                y += 10;
            id++;
        }

        history.scrollMax = 300;
        history.width = 193;
        history.height = 116;

        addText(48951, "Select an item", 0xff9933, true, true, -1, tda, 2);
        addText(48952, "from your", 0xff9933, true, true, -1, tda, 2);
        addText(48953, "inventory.", 0xff9933, true, true, -1, tda, 2);

        setChildren(3, offers);

        setBounds(48951, 108, 66, 0, offers); // Name
        setBounds(48952, 108, 80, 1, offers); // Price
        setBounds(48953, 108, 94, 2, offers); // sold

        // offers.scrollMax = 300;
        offers.width = 203;
        offers.height = 181;
    }

    private static void tradingpost(TextDrawingArea[] tda) {
        RSInterface Interface = addTabInterface(48600);
        RSInterface history = addTabInterface(48635);
        RSInterface offers = addTabInterface(48786);

        addSprite(48601, 7, "Trading/SPRITE");
        addHover(48602, 3, 0, 48603, 1, "Bank/BANK", 17, 17, "Close Window");
        addHovered(48603, 2, "Bank/BANK", 17, 17, 48604);

        addText(48605, "Trading Post", 0xff9933, true, true, -1, tda, 2);

        addText(48606, "Coffer", 0xff9933, true, true, -1, tda, 2);
        addHoverButton(48607, "Trading/SPRITE", 8, 143, 35, "Claim money", 0, 48608, 1);
        addHoveredButton(48608, "Trading/SPRITE", 9, 143, 35, 48609);
        addText(48610, "100,000 GP", 0xff9933, true, true, -1, tda, 0);

        addText(48611, "Search for...", 0xff9933, true, true, -1, tda, 2);
        addHoverButton(48612, "Trading/SPRITE", 10, 72, 32, "Search for a item", 0, 48613, 1);
        addHoveredButton(48613, "Trading/SPRITE", 11, 72, 32, 48614);

        addHoverButton(48615, "Trading/SPRITE", 10, 72, 32, "Search for a player", 0, 48616, 1);
        addHoveredButton(48616, "Trading/SPRITE", 11, 72, 32, 48617);

        addHoverButton(48618, "Trading/SPRITE", 10, 72, 32, "Recent offers", 0, 48619, 1);
        addHoveredButton(48619, "Trading/SPRITE", 11, 72, 32, 48620);

        addHoverButton(48621, "Trading/SPRITE", 12, 150, 35, "Click", 0, 48622, 1);
        addHoveredButton(48622, "Trading/SPRITE", 13, 150, 35, 48623);

        addText(48624, "History", 0xff9933, true, true, -1, tda, 2);
        addText(48625, "My Offers...", 0xff9933, true, true, -1, tda, 2);

        addText(48626, "Item", 0xff9933, true, true, -1, tda, 2);
        addText(48627, "Player", 0xff9933, true, true, -1, tda, 2);
        addText(48648, "Recent", 0xff9933, true, true, -1, tda, 2);
        addText(48630, "List item for sale", 0xff9933, true, true, -1, tda, 2);

        setChildren(25, Interface);

        setBounds(48601, 8, 10, 0, Interface); // Base
        setBounds(48602, 471, 18, 1, Interface); // Close
        setBounds(48603, 471, 18, 2, Interface);

        setBounds(48605, 262, 20, 3, Interface); // Title

        setBounds(48606, 40, 50, 4, Interface); // Coffer text
        setBounds(48607, 19, 68, 5, Interface); // Coffer Button
        setBounds(48608, 19, 68, 6, Interface);
        setBounds(48610, 75, 80, 7, Interface); // Amount in coffer

        setBounds(48611, 59, 250, 8, Interface); // Text search for...
        setBounds(48612, 19, 270, 9, Interface); // Item Button
        setBounds(48613, 19, 270, 10, Interface);

        setBounds(48615, 96, 270, 11, Interface); // Player Button
        setBounds(48616, 96, 270, 12, Interface);

        setBounds(48618, 173, 270, 13, Interface); // Recent Button
        setBounds(48619, 173, 270, 14, Interface);

        setBounds(48621, 293, 270, 15, Interface); // Long button
        setBounds(48622, 293, 270, 16, Interface);

        setBounds(48624, 42, 104, 17, Interface); // Text History
        setBounds(48625, 289, 50, 18, Interface); // TextMy offers

        setBounds(48626, 55, 279, 19, Interface); // Text Item
        setBounds(48627, 132, 279, 20, Interface); // Text Player
        setBounds(48628, 208, 279, 21, Interface); // Text Recent
        setBounds(48630, 367, 279, 22, Interface); // Text List

        setBounds(48635, 30, 128, 23, Interface); // Interface history
        setBounds(48786, 260, 75, 24, Interface); // Interface my offers

        setChildren(20, history);
        for (int i = 48636, y = 5, id = 0; i < 48656; i++) {
            addText(i, "", 0xff9933, true, true, -1, tda, 0);
            setBounds(i, 94, y, id, history);
            if (id == 1 || id == 3 || id == 5 || id == 7 || id == 9 || id == 11 || id == 13 || id == 15 || id == 17)
                y += 20;
            else
                y += 10;
            id++;
        }

        history.scrollMax = 300;
        history.width = 193;
        history.height = 116;

        addListing(48847, false);
        addText(48788, "", 0xff9933, true, true, -1, tda, 0);
        addText(48789, "", 0xff9933, true, true, -1, tda, 0);
        addText(48790, "", 0xff9933, true, true, -1, tda, 0);

        addText(48792, "", 0xff9933, true, true, -1, tda, 0);
        addText(48793, "", 0xff9933, true, true, -1, tda, 0);
        addText(48794, "", 0xff9933, true, true, -1, tda, 0);

        addText(48796, "", 0xff9933, true, true, -1, tda, 0);
        addText(48797, "", 0xff9933, true, true, -1, tda, 0);
        addText(48798, "", 0xff9933, true, true, -1, tda, 0);

        addText(48800, "", 0xff9933, true, true, -1, tda, 0);
        addText(48801, "", 0xff9933, true, true, -1, tda, 0);
        addText(48802, "", 0xff9933, true, true, -1, tda, 0);

        addText(48804, "", 0xff9933, true, true, -1, tda, 0);
        addText(48805, "", 0xff9933, true, true, -1, tda, 0);
        addText(48806, "", 0xff9933, true, true, -1, tda, 0);

        addText(48808, "", 0xff9933, true, true, -1, tda, 0);
        addText(48809, "", 0xff9933, true, true, -1, tda, 0);
        addText(48810, "", 0xff9933, true, true, -1, tda, 0);

        addText(48812, "", 0xff9933, true, true, -1, tda, 0);
        addText(48813, "", 0xff9933, true, true, -1, tda, 0);
        addText(48814, "", 0xff9933, true, true, -1, tda, 0);

        addText(48816, "", 0xff9933, true, true, -1, tda, 0);
        addText(48817, "", 0xff9933, true, true, -1, tda, 0);
        addText(48818, "", 0xff9933, true, true, -1, tda, 0);

        addText(48820, "", 0xff9933, true, true, -1, tda, 0);
        addText(48821, "", 0xff9933, true, true, -1, tda, 0);
        addText(48822, "", 0xff9933, true, true, -1, tda, 0);

        addText(48824, "", 0xff9933, true, true, -1, tda, 0);
        addText(48825, "", 0xff9933, true, true, -1, tda, 0);
        addText(48826, "", 0xff9933, true, true, -1, tda, 0);

        addText(48828, "", 0xff9933, true, true, -1, tda, 0);
        addText(48829, "", 0xff9933, true, true, -1, tda, 0);
        addText(48830, "", 0xff9933, true, true, -1, tda, 0);

        addText(48832, "", 0xff9933, true, true, -1, tda, 0);
        addText(48833, "", 0xff9933, true, true, -1, tda, 0);
        addText(48834, "", 0xff9933, true, true, -1, tda, 0);

        addText(48836, "", 0xff9933, true, true, -1, tda, 0);
        addText(48837, "", 0xff9933, true, true, -1, tda, 0);
        addText(48838, "", 0xff9933, true, true, -1, tda, 0);

        addText(48840, "", 0xff9933, true, true, -1, tda, 0);
        addText(48841, "", 0xff9933, true, true, -1, tda, 0);
        addText(48842, "", 0xff9933, true, true, -1, tda, 0);

        addText(48844, "", 0xff9933, true, true, -1, tda, 0);
        addText(48845, "", 0xff9933, true, true, -1, tda, 0);
        addText(48846, "", 0xff9933, true, true, -1, tda, 0);

        setChildren(46, offers);

        setBounds(48788, 118, 10, 0, offers); // Name
        setBounds(48789, 51, 33, 1, offers); // Price
        setBounds(48790, 118, 23, 2, offers); // sold

        setBounds(48792, 118, 57, 3, offers); // Name y + 49
        setBounds(48793, 51, 80, 4, offers); // Price y + 48
        setBounds(48794, 118, 70, 5, offers); // sold y + 49

        setBounds(48796, 118, 104, 6, offers); // Name y + 49
        setBounds(48797, 51, 127, 7, offers); // Price y + 28
        setBounds(48798, 118, 117, 8, offers); // sold y + 49

        setBounds(48800, 118, 151, 9, offers); // Name y + 49
        setBounds(48801, 51, 174, 10, offers); // Price y + 28
        setBounds(48802, 118, 164, 11, offers); // sold y + 49

        setBounds(48804, 118, 198, 12, offers); // Name y + 49
        setBounds(48805, 51, 221, 13, offers); // Price y + 28
        setBounds(48806, 118, 211, 14, offers); // sold y + 49

        setBounds(48808, 118, 245, 15, offers); // Name y + 49
        setBounds(48809, 51, 268, 16, offers); // Price y + 48
        setBounds(48810, 118, 258, 17, offers); // sold y + 49

        setBounds(48812, 118, 292, 18, offers); // Name y + 49
        setBounds(48813, 51, 315, 19, offers); // Price y + 48
        setBounds(48814, 118, 305, 20, offers); // sold y + 49

        setBounds(48816, 118, 339, 21, offers); // Name y + 49
        setBounds(48817, 51, 362, 22, offers); // Price y + 48
        setBounds(48818, 118, 352, 23, offers); // sold y + 49

        setBounds(48820, 118, 386, 24, offers); // Name y + 49
        setBounds(48821, 51, 409, 25, offers); // Price y + 48
        setBounds(48822, 118, 399, 26, offers); // sold y + 49

        setBounds(48824, 118, 433, 27, offers); // Name y + 47
        setBounds(48825, 51, 456, 28, offers); // Price y + 47 fout
        setBounds(48826, 118, 446, 29, offers); // sold y + 47

        setBounds(48828, 118, 480, 30, offers); // Name y + 49
        setBounds(48829, 51, 503, 31, offers); // Price y + 48
        setBounds(48830, 118, 493, 32, offers); // sold y + 49

        setBounds(48832, 118, 527, 33, offers); // Name y + 49
        setBounds(48833, 51, 550, 34, offers); // Price y + 48
        setBounds(48834, 118, 540, 35, offers); // sold y + 49

        setBounds(48836, 118, 574, 36, offers); // Name y + 49
        setBounds(48837, 51, 597, 37, offers); // Price y + 48
        setBounds(48838, 118, 587, 38, offers); // sold y + 49

        setBounds(48840, 118, 621, 39, offers); // Name y + 49
        setBounds(48841, 51, 644, 40, offers); // Price y + 48
        setBounds(48842, 118, 634, 41, offers); // sold y + 49

        setBounds(48844, 118, 668, 42, offers); // Name y + 49
        setBounds(48845, 51, 691, 43, offers); // Price y + 48
        setBounds(48846, 118, 681, 44, offers); // sold y + 49

        setBounds(48847, 35, 2, 45, offers);

        offers.scrollMax = 710;
        offers.width = 203;
        offers.height = 181;
    }

    public static void offer(TextDrawingArea[] tda) {

        RSInterface rsi = addTabInterface(48500);
        addOffer(48501);
        rsi.totalChildren(1);
        rsi.child(0, 48501, 16, 8);
    }

    private static void addOffer(int index) {
        RSInterface rsi = interfaceCache[index] = new RSInterface();
        rsi.actions = new String[10];
        rsi.spritesX = new int[20];
        rsi.invStackSizes = new int[30];
        rsi.inv = new int[30];
        rsi.spritesY = new int[20];

        rsi.children = new int[0];
        rsi.childX = new int[0];
        rsi.childY = new int[0];

        rsi.actions[0] = "Offer 1";
        rsi.actions[1] = "Offer 5";
        rsi.actions[2] = "Offer 10";
        rsi.actions[3] = "Offer All";
        rsi.actions[4] = "Offer X";
        rsi.centerText = true;
        rsi.aBoolean227 = false;
        rsi.aBoolean235 = false;
        rsi.usableItemInterface = false;
        rsi.isInventoryInterface = false;
        rsi.aBoolean259 = true;
        rsi.textShadow = false;
        rsi.invSpritePadX = 10;
        rsi.invSpritePadY = 4;
        rsi.height = 7;
        rsi.width = 4;
        rsi.parentID = 48501;
        rsi.id = 48500;
        rsi.type = 2;
    }

    private static void tradingSelected(TextDrawingArea[] tda) {
        RSInterface Interface = addTabInterface(48598);
        RSInterface history = addTabInterface(48635);
        RSInterface offers = addTabInterface(48960);

        addSprite(48601, 7, "Trading/SPRITE");
        addHover(48602, 3, 0, 48603, 1, "Bank/BANK", 17, 17, "Close Window");
        addHovered(48603, 2, "Bank/BANK", 17, 17, 48604);

        addText(48605, "Trading Post", 0xff9933, true, true, -1, tda, 2);

        addText(48606, "Coffer", 0xff9933, true, true, -1, tda, 2);
        addHoverButton(48607, "Trading/SPRITE", 8, 143, 35, "Claim money", 0, 48608, 1);
        addHoveredButton(48608, "Trading/SPRITE", 9, 143, 35, 48609);
        addText(48610, "100,000 GP", 0xff9933, true, true, -1, tda, 0);

        addText(48611, "Search for...", 0xff9933, true, true, -1, tda, 2);
        addHoverButton(48612, "Trading/SPRITE", 10, 72, 32, "Search for a item", 0, 48613, 1);
        addHoveredButton(48613, "Trading/SPRITE", 11, 72, 32, 48614);

        addHoverButton(48615, "Trading/SPRITE", 10, 72, 32, "Search for a player", 0, 48616, 1);
        addHoveredButton(48616, "Trading/SPRITE", 11, 72, 32, 48617);

        addHoverButton(48618, "Trading/SPRITE", 10, 72, 32, "Recent offers", 0, 48619, 1);
        addHoveredButton(48619, "Trading/SPRITE", 11, 72, 32, 48620);

        addHoverButton(48621, "Trading/SPRITE", 12, 150, 35, "Click", 0, 48622, 1);
        addHoveredButton(48622, "Trading/SPRITE", 13, 150, 35, 48623);

        addText(48624, "History", 0xff9933, true, true, -1, tda, 2);
        addText(48625, "My Offers...", 0xff9933, true, true, -1, tda, 2);

        addText(48626, "Item", 0xff9933, true, true, -1, tda, 2);
        addText(48627, "Player", 0xff9933, true, true, -1, tda, 2);
        addText(48628, "Recent", 0xff9933, true, true, -1, tda, 2);
        addText(48629, "Cancel Listing", 0xff9933, true, true, -1, tda, 2);

        setChildren(25, Interface);

        setBounds(48601, 8, 10, 0, Interface); // Base
        setBounds(48602, 471, 18, 1, Interface); // Close
        setBounds(48603, 471, 18, 2, Interface);

        setBounds(48605, 262, 20, 3, Interface); // Title

        setBounds(48606, 40, 50, 4, Interface); // Coffer text
        setBounds(48607, 19, 68, 5, Interface); // Coffer Button
        setBounds(48608, 19, 68, 6, Interface);
        setBounds(48610, 75, 80, 7, Interface); // Amount in coffer

        setBounds(48611, 59, 250, 8, Interface); // Text search for...
        setBounds(48612, 19, 270, 9, Interface); // Item Button
        setBounds(48613, 19, 270, 10, Interface);

        setBounds(48615, 96, 270, 11, Interface); // Player Button
        setBounds(48616, 96, 270, 12, Interface);

        setBounds(48618, 173, 270, 13, Interface); // Recent Button
        setBounds(48619, 173, 270, 14, Interface);

        setBounds(48621, 293, 270, 15, Interface); // Long button
        setBounds(48622, 293, 270, 16, Interface);

        setBounds(48624, 42, 104, 17, Interface); // Text History
        setBounds(48625, 289, 50, 18, Interface); // TextMy offers

        setBounds(48626, 55, 279, 19, Interface); // Text Item
        setBounds(48627, 132, 279, 20, Interface); // Text Player
        setBounds(48628, 208, 279, 21, Interface); // Text Recent
        setBounds(48629, 367, 279, 22, Interface); // Text List

        setBounds(48635, 30, 128, 23, Interface); // Interface history
        setBounds(48960, 260, 75, 24, Interface); // Interface my offers

        setChildren(20, history);
        for (int i = 48636, y = 5, id = 0; i < 48656; i++) {
            addText(i, "", 0xff9933, true, true, -1, tda, 0);
            setBounds(i, 94, y, id, history);
            if (id == 1 || id == 3 || id == 5 || id == 7 || id == 9 || id == 11 || id == 13 || id == 15 || id == 17)
                y += 20;
            else
                y += 10;
            id++;
        }

        history.scrollMax = 300;
        history.width = 193;
        history.height = 116;

        addSprite(48961, 14, "Trading/SPRITE");
        addItemOnInterface(48962);
        addText(48963, "", 0xff9933, true, true, -1, tda, 2);
        addText(48964, "", 0xff9933, true, true, -1, tda, 1);
        addText(48965, "", 0xff9933, true, true, -1, tda, 1);
        addText(48966, "", 0xff9933, true, true, -1, tda, 0); // Guide: 50M
        addText(48967, "", 0xff9933, true, true, -1, tda, 0); // Listed: 0

        addHoverButton(48968, "Trading/SPRITE", 10, 72, 32, "Set price", 0, 48969, 1);
        addHoveredButton(48969, "Trading/SPRITE", 11, 72, 32, 48970);

        // addHoverButton(48971, "Trading/SPRITE", 10, 72, 32, "Set quantity", 0, 48972,
        // 1);
        // addHoveredButton(48972, "Trading/SPRITE", 11, 72, 32, 48973);

        addHoverButton(48974, "Trading/SPRITE", 10, 72, 32, "Confirm offer", 0, 48975, 1);
        addHoveredButton(48975, "Trading/SPRITE", 11, 72, 32, 48976);

        addText(48977, "Set", 0xff9933, true, true, -1, tda, 2);
        addText(48978, "price", 0xff9933, true, true, -1, tda, 2);
        // addText(48979, "Set", 0xff9933, true, true, -1, tda, 2);
        // addText(48980, "quantity", 0xff9933, true, true, -1, tda, 2);
        addText(48981, "Confirm", 0xff9933, true, true, -1, tda, 2);

        setChildren(14, offers);

        setBounds(48961, 0, 0, 0, offers); // background
        setBounds(48962, 91, 11, 1, offers); // item
        setBounds(48963, 108, 50, 2, offers); // name
        setBounds(48964, 108, 70, 3, offers); // price ea
        setBounds(48965, 108, 85, 4, offers); // quantity
        setBounds(48966, 175, 5, 5, offers); // guide
        setBounds(48967, 175, 20, 6, offers); // listed

        setBounds(48968, 72, 105, 7, offers); // Set price button
        setBounds(48969, 72, 105, 8, offers);

        // setBounds(48971, 114, 105, 9, offers); //Set quantity button
        // setBounds(48972, 114, 105, 10, offers);

        setBounds(48974, 72, 142, 9, offers); // confirm button
        setBounds(48975, 72, 142, 10, offers);

        setBounds(48977, 107, 108, 11, offers); // set
        setBounds(48978, 107, 118, 12, offers); // price
        // setBounds(48979, 149, 108, 13, offers); //set
        // setBounds(48980, 149, 118, 14, offers); //quantity

        setBounds(48981, 107, 151, 13, offers); // confirm

        // offers.scrollMax = 300;
        offers.width = 219;
        offers.height = 181;
    }

    private static void addItemOnInterface(int i) {
        RSInterface rsinterface = interfaceCache[i] = new RSInterface();
        rsinterface.actions = new String[5];
        rsinterface.spritesX = new int[20];
        rsinterface.invStackSizes = new int[30];
        rsinterface.inv = new int[30];
        rsinterface.spritesY = new int[20];
        rsinterface.children = new int[0];
        rsinterface.childX = new int[0];
        rsinterface.childY = new int[0];
        rsinterface.spritesY[0] = 0;
        // rsinterface.invStackSizes[0] = 0;
        for (int i2 = 0; i2 < 30; i2++)
            rsinterface.invStackSizes[i2] = 0;
        rsinterface.inv[0] = 0;
        rsinterface.spritesX[0] = 0;
        rsinterface.actions[0] = "Cancel";
        rsinterface.centerText = false;
        rsinterface.aBoolean227 = false;
        rsinterface.aBoolean235 = false;
        rsinterface.usableItemInterface = false;
        rsinterface.isInventoryInterface = false;
        rsinterface.aBoolean259 = false;
        rsinterface.textShadow = false;
        rsinterface.width = 6;
        rsinterface.mOverInterToTrigger = -1;
        rsinterface.invSpritePadX = 24;
        rsinterface.parentID = i;
        rsinterface.invSpritePadY = 24;
        rsinterface.type = 2;
        rsinterface.height = 5;
    }

    private static void listings(TextDrawingArea[] tda) {
        RSInterface Interface = addTabInterface(48000);
        RSInterface main = addTabInterface(48020);

        setChildren(18, Interface);
        addSprite(48001, 0, "Trading/SPRITE");

        addHover(48002, 3, 0, 48003, 1, "Bank/BANK", 17, 17, "Close Window");
        addHovered(48003, 2, "Bank/BANK", 17, 17, 48004);
        addHoverButton(48005, "Trading/SPRITE", 1, 88, 30, "Go back", 0, 48006, 1);
        addHoveredButton(48006, "Trading/SPRITE", 2, 88, 30, 48007);
        addHoverButton(48008, "Trading/SPRITE", 10, 72, 35, "Prev Page", 0, 48009, 1);
        addHoveredButton(48009, "Trading/SPRITE", 11, 72, 35, 48010);
        addHoverButton(48011, "Trading/SPRITE", 10, 72, 35, "Next Page", 0, 48012, 1);
        addHoveredButton(48012, "Trading/SPRITE", 11, 72, 35, 48013); // 48045

        addText(48046, "Prev Page", 0xff9933, true, true, -1, tda, 1);
        addText(48047, "Next Page", 0xff9933, true, true, -1, tda, 1);

        addText(48014, "Quantity", tda, 0, 0xff981f, false, false);
        addText(48015, "Name", tda, 0, 0xff981f, false, false);
        addText(48016, "Price", tda, 0, 0xff981f, false, false);
        addText(48017, "Seller", tda, 0, 0xff981f, false, false);
        addText(48018, "Total Sold", tda, 0, 0xff981f, false, false);
        // addText(48019, "Title", tda, 2, 0xff981f, true, true);
        addText(48019, "Trading post", 0xff9933, true, true, -1, tda, 2); // 262, 20

        setBounds(48001, 9, 2, 0, Interface);
        setBounds(48002, 471, 12, 1, Interface); // Close
        setBounds(48003, 471, 12, 2, Interface);
        setBounds(48005, 19, 281, 3, Interface); // Go back
        setBounds(48006, 19, 281, 4, Interface);
        setBounds(48008, 331, 281, 5, Interface); // Modify
        setBounds(48009, 331, 281, 6, Interface);
        setBounds(48011, 413, 281, 7, Interface); // Refresh
        setBounds(48012, 413, 281, 8, Interface);

        setBounds(48014, 23, 42, 9, Interface); // Quantity
        setBounds(48015, 117, 42, 10, Interface); // Name
        setBounds(48016, 217, 42, 11, Interface); // Price
        setBounds(48017, 317, 42, 12, Interface); // Seller
        setBounds(48018, 414, 42, 13, Interface); // Total sold
        setBounds(48019, 262, 12, 14, Interface); // Titel
        setBounds(48020, 21, 50, 15, Interface); // Scroll

        setBounds(48046, 366, 288, 16, Interface); // Prev page
        setBounds(48047, 449, 288, 17, Interface); // Next Page

        addListing(48021, true);
        for (int i = 48022; i < 48046; i++) {
            addText(i, "", tda, 0, 0xff981f, true, false);
        }
        /*
         * addItemOnInterface(28021); addText(28022, "Abyssal whip", tda, 0, 0xff981f,
         * true, false); addText(28023, "100,000", tda, 0, 0xff981f, true, false);
         * addText(28024, "Nighel", tda, 0, 0xff981f, true, false); addTextButton(28025,
         * "Buy", "Buy", 0xFF981F, false, true, tda, 0, 400);
         *
         * addItemOnInterface(28026); addText(28027, "Granite maul", tda, 0, 0xff981f,
         * true, false); addText(28028, "10,000", tda, 0, 0xff981f, true, false);
         * addText(28029, "Leroy the noob", tda, 0, 0xff981f, true, false);
         * addTextButton(28030, "Buy", "Buy", 0xFF981F, false, true, tda, 0, 400);
         */

        setChildren(25, main);

        setBounds(48021, 5, 10, 0, main); // Item

        setBounds(48022, 109, 20, 1, main); // Name
        setBounds(48023, 210, 20, 2, main); // Amount
        setBounds(48024, 310, 20, 3, main); // Seller
        setBounds(48025, 418, 20, 4, main); // Buy

        setBounds(48026, 109, 59, 5, main); // Name
        setBounds(48027, 210, 59, 6, main); // Amount
        setBounds(48028, 310, 59, 7, main); // Seller
        setBounds(48029, 418, 59, 8, main); // Buy

        setBounds(48030, 109, 95, 9, main); // Name
        setBounds(48031, 210, 95, 10, main); // Amount
        setBounds(48032, 310, 95, 11, main); // Seller
        setBounds(48033, 418, 95, 12, main); // Buy

        setBounds(48034, 109, 131, 13, main); // Name
        setBounds(48035, 210, 131, 14, main); // Amount
        setBounds(48036, 310, 131, 15, main); // Seller
        setBounds(48037, 418, 131, 16, main); // Buy

        setBounds(48038, 109, 170, 17, main); // Name
        setBounds(48039, 210, 170, 18, main); // Amount
        setBounds(48040, 310, 170, 19, main); // Seller
        setBounds(48041, 418, 170, 20, main); // Buy

        setBounds(48042, 109, 204, 21, main); // Name
        setBounds(48043, 210, 204, 22, main); // Amount
        setBounds(48044, 310, 204, 23, main); // Seller
        setBounds(48045, 418, 204, 24, main); // Buy

        main.width = 445;
        main.height = 227;
    }

    private static void addListing(int index, boolean search) {
        RSInterface rsi = interfaceCache[index] = new RSInterface();
        rsi.actions = new String[10];
        rsi.spritesX = new int[20];
        rsi.invStackSizes = new int[30];
        rsi.inv = new int[30];
        rsi.spritesY = new int[20];

        rsi.children = new int[0];
        rsi.childX = new int[0];
        rsi.childY = new int[0];
        if (!search)
            rsi.actions[0] = "Cancel";
        else {
            rsi.actions[0] = "Buy 1";
            rsi.actions[1] = "Buy 5";
            rsi.actions[2] = "Buy 10";
            rsi.actions[3] = "Buy All";
            rsi.actions[4] = "Buy X";
        }
        rsi.centerText = true;
        rsi.aBoolean227 = false;
        rsi.aBoolean235 = false;
        rsi.usableItemInterface = false;
        rsi.isInventoryInterface = false;
        rsi.aBoolean259 = true;
        rsi.textShadow = false; // 42, 82
        if (!search) {
            rsi.invSpritePadX = 0;
            rsi.invSpritePadY = 15;
        } else {
            rsi.invSpritePadX = 0;
            rsi.invSpritePadY = 5;
        }
        if (!search)
            rsi.height = 15;
        else
            rsi.height = 8;
        rsi.width = 1;
        rsi.parentID = index + 1;
        rsi.id = index;
        rsi.type = 2;
    }

    private static void groundItemCustomizing(TextDrawingArea[] tda) {
        RSInterface r = addInterface(37700);
        addSprite(37701, 2, "Interfaces/GroundItems/IMAGE");// they got saved as jpgs, need 2 convert lol il plz do
        addText(37702, "Ground items customizer", tda, 2, 0xFE9624, true, true);
        addHoverButton(37703, "Interfaces/GroundItems/IMAGE", 0, 16, 16, "Close", -1, 37704, 3);
        addHoveredButton(37704, "Interfaces/GroundItems/IMAGE", 1, 16, 16, 37705);
        addButton(37706, 4, "Interfaces/GroundItems/IMAGE", "Choose color");
        addText(37707, "Choose a color below!", tda, 2, 0xffffff, true, true);
        addButton(37708, 3, "Interfaces/GroundItems/IMAGE", "Enter Item Name");
        addText(37709, "Set Color To Item", tda, 0, 0xFE9624, true, true);
        addButton(37710, 3, "Interfaces/GroundItems/IMAGE", "Enter Minimum Item Value");
        addText(37711, "Enter Min. Value", tda, 0, 0xFE9624, true, true);
        addButton(37712, 3, "Interfaces/GroundItems/IMAGE", "Reset All Item Colors");
        addText(37713, "Reset All Colors", tda, 0, 0xFE9624, true, true);
        r.totalChildren(12);
        r.child(0, 37701, 130, 75);// opn skype need 2 send u some imgs
        r.child(1, 37702, 245, 85);
        r.child(2, 37703, 334, 85);
        r.child(3, 37704, 334, 85);
        r.child(4, 37706, 137, 215);
        r.child(5, 37707, 240, 195);
        r.child(6, 37708, 150, 120);
        r.child(7, 37709, 192, 125);
        r.child(8, 37710, 250, 120);
        r.child(9, 37711, 292, 125);
        r.child(10, 37712, 150, 150);
        r.child(11, 37713, 192, 155);
    }

    private static void helpDatabaseComponent(TextDrawingArea[] tda) {
        RSInterface widget = addInterface(59550);
        addSprite(59551, 8, "Interfaces/HelpInterface/IMAGE");
        addHoverButton(59552, "Interfaces/HelpInterface/IMAGE", 2, 16, 16, "Close", -1, 59553, 3);
        addHoveredButton(59553, "Interfaces/HelpInterface/IMAGE", 3, 16, 16, 59554);
        addText(59555, "Bug Database", tda, 2, 0xFF981F, true, true);
        addText(59556, "Username/Date", tda, 1, 0xFF981F, false, true);
        addText(59557, "Line2", tda, 1, 0xFF981F, true, true);
        addText(59558, "Line3", tda, 1, 0xFF981F, true, true);
        addText(59559, "Line4", tda, 1, 0xFF981F, true, true);
        addText(59560, "Line5", tda, 1, 0xFF981F, true, true);

        setChildren(10, widget);
        setBounds(59551, 0, 2, 0, widget);
        setBounds(59552, 375, 8, 1, widget);
        setBounds(59553, 375, 8, 2, widget);
        setBounds(59570, 120, 30, 3, widget);
        setBounds(59555, 256, 8, 4, widget);
        setBounds(59556, 20, 225, 5, widget);
        setBounds(59557, 256, 245, 6, widget);
        setBounds(59558, 256, 265, 7, widget);
        setBounds(59559, 256, 285, 8, widget);
        setBounds(59560, 256, 305, 9, widget);

        RSInterface scroll = addInterface(59570);
        scroll.scrollMax = 400;
        scroll.width = 255;
        scroll.height = 170;
        setChildren(60, scroll);

        int yPosition = 0;
        int index = 0;
        for (int i = 0; i < 80; i += 4) {
            addText(59573 + i, "", tda, 1, 0xFF981F, false, true);
            addButton(59574 + i, 10, "Interfaces/HelpInterface/IMAGE", 13, 10, "View Request", 1);
            addButton(59575 + i, 9, "Interfaces/HelpInterface/IMAGE", 16, 15, "Remove Request", 1);
            setBounds(59573 + i, 4, yPosition + 3, index++, scroll);
            setBounds(59574 + i, 225, yPosition + 5, index++, scroll);
            setBounds(59575 + i, 240, yPosition + 3, index++, scroll);
            yPosition += 20;
        }
    }

    private static void barrowsKillcount(TextDrawingArea[] tda) {
        RSInterface barrow = addInterface(27500);
        addText(27501, "Brothers", tda, 2, 0xFD851A, true, true);
        addText(27502, "Ahrim", tda, 0, 0xFD851A, true, true);
        addText(27503, "Dharok", tda, 0, 0xFD851A, true, true);
        addText(27504, "Guthan", tda, 0, 0xFD851A, true, true);
        addText(27505, "Karil", tda, 0, 0xFD851A, true, true);
        addText(27506, "Torag", tda, 0, 0xFD851A, true, true);
        addText(27507, "Verac", tda, 0, 0xFD851A, true, true);
        addText(27508, "Killcount", tda, 2, 0xFD851A, true, true);
        addText(27509, "0", tda, 0, 0xFD851A, true, true);
        setChildren(9, barrow);
        setBounds(27501, 470, 42, 0, barrow);
        for (int index = 1; index < 7; index++)
            setBounds(27501 + index, 470, 45 + index * 14, index, barrow);
        setBounds(27508, 470, 15, 7, barrow);
        setBounds(27509, 470, 30, 8, barrow);
    }

    private static final void addStaffSpecialWidget() {
        RSInterface magic = interfaceCache[328];
        RSInterface spec = addInterface(28500);
        setChildren(magic.children.length + 1, spec);
        spec.children[0] = 7800;
        spec.childX[0] = 22;
        spec.childY[0] = 202;
        for (int i = 0; i < magic.children.length; i++) {
            spec.children[1 + i] = magic.children[i];
            spec.childX[1 + i] = magic.childX[i];
            spec.childY[1 + i] = magic.childY[i];
        }
    }

    private static void pointCounter(TextDrawingArea[] tda) {
        RSInterface widget = addInterface(42300);
        setChildren(1, widget);
        addText(42302, "Points:", tda, 0, 0xFD851A, false, true);
        setBounds(42302, 15, 28, 0, widget);
    }

    private static void ironmanWidget(TextDrawingArea[] tda) {
        RSInterface widget = addInterface(42400);
        addSprite(42401, 1, "Interfaces/Ironman/IMAGE");
        addClickableSprites(42402, "Toggle", "Interfaces/Ironman/IMAGE", 2, 3, 4);
        addClickableSprites(42403, "Toggle", "Interfaces/Ironman/IMAGE", 2, 3, 4);
        addClickableSprites(42404, "Toggle", "Interfaces/Ironman/IMAGE", 2, 3, 4);
        addClickableSprites(42423, "Toggle", "Interfaces/Ironman/IMAGE", 2, 3, 4);
        addClickableSprites(42405, "Toggle", "Interfaces/Ironman/IMAGE", 2, 3, 4);
        addClickableSprites(42406, "Toggle", "Interfaces/Ironman/IMAGE", 2, 3, 4);

        addText(42407,
                "An Iron Man does not receive items\\n"
                        + "or assistance from other players.\\n"
                        + "They cannot trade, stake, receive PK loot,\\n"
                        + "nor scavenge dropped items.\\n",
                tda, 0, 0xFD851A, false, true);
        addText(42408, "In addition, an Ultimate Iron Man, \\n"
                + "cannot use banks.", tda, 0, 0xFD851A, false, true);
        addText(42409, "No Iron Man restrictions will apply to this account.", tda, 0, 0xFD851A, false, true);
        addText(42424, "    x1 experience rates within all skills.", tda, 0, 0xFD851A, false, true);
        addText(42410, "You must talk to an npc that, \\n"
                        + "will reset your mode after a \\n"
                        + "seven day delay.", tda, 0,
                0xFD851A, false, true);
        addText(42411, "The Iron Man restrictions, \\n"
                + "can never be removed.", tda, 0, 0xFD851A, false, true);
        addText(42412, "Standard Iron Man", tda, 0, 0xFFFFFF, false, true);
        addText(42413, "Ultimate Iron Man", tda, 0, 0xFFFFFF, false, true);
        addText(42422, "Extreme Mode", tda, 0, 0xFFFFFF, false, true);
        addText(42414, "None", tda, 0, 0xFFFFFF, false, true);
        addText(42415, "NPC", tda, 0, 0xFFFFFF, false, true);
        addText(42416, "Permanent", tda, 0, 0xFFFFFF, false, true);

        addText(42417, "Game Modes", tda, 1, 0xFFFFFF, false, true);
        addText(42418, "Restrictions", tda, 1, 0xFFFFFF, false, true);
        addText(42426, "BETA", tda, 0, 0xFFFFFF, false, true);
        addText(42427, "Welcome to OS-Revolution", tda, 0, 0xFFFFFF, false, true);
        addText(42428, "We hope you enjoy your stay and remember", tda, 0, 0xFFFFFF, false, true);
        addText(42429, "to register on www.os-revolution.com", tda, 0, 0xFFFFFF, false, true);

        addHoverButton(42419, "Interfaces/Ironman/IMAGE", 5, 23, 23, "Confirm and Continue", 0, 42420, 1);
        addHoveredButton(42420, "Interfaces/Ironman/IMAGE", 6, 23, 23, 42421);

        //EXTRA
        addText(42425, "Confirm Selection", tda, 0, 0xFFFFFF, false, true);
        //END EXTRA

        setChildren(28, widget);

        setBounds(42401, 15, 28, 0, widget);

        setBounds(42402, 30, 70, 1, widget); // Ironman toggle
        setBounds(42403, 30, 128, 2, widget); // Ult iron man toggle
        setBounds(42423, 30, 166, 21, widget); // OSRS Mode toggle
        setBounds(42404, 30, 190, 3, widget); // Reg mode toggle

        setBounds(42405, 308, 87, 4, widget); //toggle
        setBounds(42406, 308, 169, 5, widget); //toggle

        setBounds(42407, 50, 87, 6, widget); // Iron man text
        setBounds(42408, 50, 144, 7, widget); // Ult iron man text
        setBounds(42409, 48, 205, 8, widget); // Reg mode text
        setBounds(42424, 40, 180, 22, widget); // OSRS Mode text

        setBounds(42410, 325, 105, 9, widget);//
        setBounds(42411, 330, 185, 10, widget);

        setBounds(42412, 50, 74, 11, widget); // Standard iron man
        setBounds(42413, 50, 132, 12, widget); // Ultimate iron man
        setBounds(42422, 50, 170, 20, widget); // OSRS Mode

        setBounds(42414, 50, 194, 13, widget);
        setBounds(42415, 330, 90, 14, widget);
        setBounds(42416, 330, 172, 15, widget);
        setBounds(42417, 120, 55, 16, widget);
        setBounds(42418, 358, 55, 17, widget);
        setBounds(42419, 325, 245, 18, widget);
        setBounds(42420, 465, 34, 19, widget);
        setBounds(42426, 160, 235, 24, widget);//beta text
        setBounds(42427, 105, 250, 25, widget);//Welcome to OS-Revolution
        setBounds(42428, 70, 261, 26, widget);//We hope you enjoy your stay and remember
        setBounds(42429, 83, 272, 27, widget);//Register on www.os-revolution.com
        //EXTRA
        setBounds(42425, 360, 255, 23, widget);
        //END EXTRA
    }

    private static void slayerInterface(TextDrawingArea[] tda) {
        RSInterface rsInterface = addInterface(41000);
        addSprite(41001, 1, "Interfaces/SlayerInterface/IMAGE");
        addHoverButton(41002, "Interfaces/SlayerInterface/IMAGE", 4, 16, 16, "Close window", 0, 41003, 1);
        addHoveredButton(41003, "Interfaces/SlayerInterface/IMAGE", 5, 16, 16, 41004);
        addHoverButton(41005, "", 0, 80, 20, "Buy", 0, 41006, 1);
        addHoverButton(41007, "", 0, 75, 20, "Learn", 0, 41008, 1);
        addHoverButton(41009, "", 0, 80, 20, "Assignment", 0, 41010, 1);
        addText(41011, "Slayer Points: ", tda, 3, 0xFF981F);
        addTextButton(41012, "Slayer Experience(50)", "Buy Slayer Experience", 0xFF981F, false,
                true, tda, 1, 400);
        addTextButton(41013, "Slayer's Respite(25)", "Buy Slayer's Respite", 0xFF981F,
                false, true, tda, 1, 401);
        addTextButton(41014, "Slayer Darts(35)", "Buy Slayer Darts", 0xFF981F,
                false, true, tda, 1, 402);
        addTextButton(41015, "Broad Arrows(250)", "Buy Broad Arrows", 0xFF981F, false,
                true, tda, 1, 403);
        addTextButton(41016, "Imbue Slayer Helmet(No cost)", "Imbue Slayer Helmet", 0xFF981F,
                false, true, tda, 1, 406);
        addTextButton(41017, "Extend Boss Tasks(100)", "Extend Boss Tasks", 0xFF981F, false, true,
                tda, 1, 407);
        addTextButton(41018, "Recolor Slayer Helmet", "Recolor Slayer Helmet", 0xFF981F, false, true, tda, 1, 408);
        setChildren(14, rsInterface);
        rsInterface.child(0, 41001, 12, 10);
        rsInterface.child(1, 41002, 473, 20);
        rsInterface.child(2, 41003, 473, 20);
        rsInterface.child(3, 41005, 19, 23);
        rsInterface.child(4, 41007, 105, 23);
        rsInterface.child(5, 41009, 190, 23);
        rsInterface.child(6, 41011, 40, 58);
        rsInterface.child(7, 41012, 30, 115);
        rsInterface.child(8, 41013, 30, 140);
        rsInterface.child(9, 41014, 30, 165);
        rsInterface.child(10, 41015, 30, 190);
        rsInterface.child(11, 41016, 30, 215);
        rsInterface.child(12, 41017, 30, 240);
        rsInterface.child(13, 41018, 30, 265);

    }

    private static void slayerInterfaceSub1(TextDrawingArea[] tda) {
        RSInterface rsInterface = addInterface(41500);
        addSprite(41501, 2, "Interfaces/SlayerInterface/IMAGE");
        addHoverButton(41502, "Interfaces/SlayerInterface/IMAGE", 4, 16, 16, "Close window", 0, 41503, 1);
        addHoveredButton(41503, "Interfaces/SlayerInterface/IMAGE", 5, 16, 16, 41504);
        addHoverButton(41505, "", 0, 85, 20, "Buy", 0, 41506, 1);
        addHoverButton(41507, "", 0, 85, 20, "Learn", 0, 41508, 1);
        addHoverButton(41509, "", 0, 85, 20, "Assignment", 0, 41510, 1);
        addText(41511, "Slayer Points: ", tda, 3, 0xFF981F);
        addTextButton(41512, "Learn how to create\\n"
                        + "slayer helmet(350)", "Learn",
                0xFF981F, false, true, tda, 1, 404);

        addTextButton(41513, "Learn how to create slayer\\n"
                        + "helmet (imbued)(150)", "Learn", 0xFF981F,
                false, true, tda, 1, 405);

        addTextButton(41514, "Learn the route into\\n"
                        + "cerberus cave(1250)", "Learn", 0xFF981F, false,
                true, tda, 1, 406);

        addTextButton(41515, "Learn how to encounter\\n "
                        + "Superior Slayer NPCS(250)", "Learn", 0xFF981F,
                false, true, tda, 1, 407);

        setChildren(11, rsInterface);
        rsInterface.child(0, 41501, 12, 10);
        rsInterface.child(1, 41502, 473, 20);
        rsInterface.child(2, 41503, 473, 20);
        rsInterface.child(3, 41505, 21, 23);
        rsInterface.child(4, 41507, 107, 23);
        rsInterface.child(5, 41509, 193, 23);
        rsInterface.child(6, 41511, 40, 58);
        rsInterface.child(7, 41512, 40, 110);
        rsInterface.child(8, 41513, 40, 160);
        rsInterface.child(9, 41514, 40, 210);
        rsInterface.child(10, 41515, 40, 260);
    }

    private static void slayerInterfaceSub2(TextDrawingArea[] tda) {
        RSInterface rsInterface = addInterface(42000);
        addSprite(42001, 3, "Interfaces/SlayerInterface/IMAGE");
        addHoverButton(42002, "Interfaces/SlayerInterface/IMAGE", 4, 16, 16, "Close window", 0, 42003, 1);
        addHoveredButton(42003, "Interfaces/SlayerInterface/IMAGE", 5, 16, 16, 42004);
        addHoverButton(42005, "", 0, 85, 20, "Buy", 0, 42006, 1);
        addHoverButton(42007, "", 0, 85, 20, "Learn", 0, 42008, 1);
        addHoverButton(42009, "", 0, 85, 20, "Assignment", 0, 42010, 1);
        addText(42011, "Slayer Points: ", tda, 3, 0xFF981F);
        addTextButton(42012, "Cancel Task   -   Cancel current task, warning it will return later", "Cancel", 0xFF981F, false, true, tda,
                1, 300);
        addTextButton(42013, "Remove Task permanently -  This option will completely remove a task", "Remove", 0xFF981F, false,
                true, tda, 1, 305);
        addText(42014, "line 1", tda, 1, 0xFF981F);
        addText(42015, "line 2", tda, 1, 0xFF981F);
        addText(42016, "line 3", tda, 1, 0xFF981F);
        addText(42017, "line 4", tda, 1, 0xFF981F);
        addText(42022, "Warning\\n" + "By choosing to\\n" + "remove you are\\n" + "choosing to\\n" + "Never have the\\n" + "task again", tda, 1, 0xFF981F);
        addButton(42018, 6, "Interfaces/SlayerInterface/IMAGE", "Delete removed slayer task");
        addButton(42019, 6, "Interfaces/SlayerInterface/IMAGE", "Delete removed slayer task");
        addButton(42020, 6, "Interfaces/SlayerInterface/IMAGE", "Delete removed slayer task");
        addButton(42021, 6, "Interfaces/SlayerInterface/IMAGE", "Delete removed slayer task");
        setChildren(18, rsInterface);
        rsInterface.child(0, 42001, 12, 10);
        rsInterface.child(1, 42002, 473, 20);
        rsInterface.child(2, 42003, 473, 20);
        rsInterface.child(3, 42005, 21, 23);
        rsInterface.child(4, 42007, 107, 23);
        rsInterface.child(5, 42009, 193, 23);
        rsInterface.child(6, 42011, 40, 58);
        rsInterface.child(7, 42012, 75, 105);//Cancel task
        rsInterface.child(8, 42013, 60, 130);//Remove Task
        rsInterface.child(9, 42014, 32, 173);//text
        rsInterface.child(10, 42015, 32, 208);
        rsInterface.child(11, 42016, 32, 242);
        rsInterface.child(12, 42017, 32, 278);//end of text
        rsInterface.child(13, 42018, 340, 174);//exit
        rsInterface.child(14, 42019, 340, 208);
        rsInterface.child(15, 42020, 340, 243);
        rsInterface.child(16, 42021, 340, 278);//end of exit
        rsInterface.child(17, 42022, 385, 190);
    }

    private static void rift(TextDrawingArea[] tda) {
        RSInterface rsi = addInterface(53000);
        addText(53001, "Objectives", tda, 2, 0xFD851A, true, true);
        addText(53002, "", tda, 0, 0xFD851A, true, true);
        addText(53003, "", tda, 0, 0xFD851A, true, true);
        addText(53004, "", tda, 0, 0xFD851A, true, true);
        addText(53005, "", tda, 0, 0xFD851A, true, true);
        addText(53006, "", tda, 0, 0xFD851A, true, true);
        addText(53007, "", tda, 0, 0xFD851A, true, true);
        addText(53008, "Progress", tda, 2, 0xFFFFFF, true, false);
//		addText(53009, "0", tda, 0, 0xFD851A, true, true);
        addSprite(53009, 6, "Interfaces/Achievements/IMAGE");
        setChildren(9, rsi);
        setBounds(53001, 455, 55, 0, rsi);
        for (int index = 1; index < 7; index++)
            setBounds(53001 + index, 485, 60 + index * 14, index, rsi);
        setBounds(53008, 455, 35, 8, rsi);
        setBounds(53009, 360, 35, 7, rsi);
    }

    private static void achievements(TextDrawingArea[] tda) {
        RSInterface rsi = addInterface(49000);
        addSprite(49001, 1, "Interfaces/Achievements/IMAGE");
        addHoverButton(49002, "Interfaces/Achievements/IMAGE", 15, 16, 16, "Close Window", -1, 49003, 3);
        addHoveredButton(49003, "Interfaces/Achievements/IMAGE", 16, 16, 16, 49004);
        addConfigButton(49005, 49000, 12, 20, "Interfaces/Achievements/IMAGE", 71, 29, "Tier Tier I", 1, 1, 800);
        addConfigButton(49006, 49000, 13, 20, "Interfaces/Achievements/IMAGE", 71, 29, "Tier Tier II", 1, 1, 801);
        addConfigButton(49007, 49000, 14, 20, "Interfaces/Achievements/IMAGE", 71, 29, "View Tier III", 1, 1, 802);
        addSprite(49014, 11, "Interfaces/Achievements/IMAGE");
        addText(49016, "1000", tda, 0, 0xff981f, true, true);
        addText(49017, "Tier I", tda, 0, 0xff981f, false, true);
        addText(49018, "Tier II", tda, 0, 0xff981f, false, true);
        addText(49019, "Tier III", tda, 0, 0xff981f, false, true);
        addText(49020, "100", tda, 0, 0xff981f, false, true);

        setChildren(14, rsi);
        setBounds(49001, 0, 0, 0, rsi);
        setBounds(49002, 490, 6, 1, rsi);
        setBounds(49003, 490, 6, 2, rsi);

        setBounds(49005, 15, 10, 3, rsi);
        setBounds(49006, 90, 10, 4, rsi);
        setBounds(49007, 165, 10, 5, rsi);

        setBounds(49014, 415, 14, 6, rsi);
        setBounds(49016, 443, 19, 7, rsi);
        setBounds(49017, 37, 19, 8, rsi);
        setBounds(49018, 111, 19, 9, rsi);
        setBounds(49019, 184, 19, 10, rsi);

        setBounds(49100, 3, 48, 11, rsi);
        setBounds(51100, 3, 48, 12, rsi);
        setBounds(53100, 3, 48, 13, rsi);

        RSInterface scroll = addInterface(49100);
        setChildren(800, scroll);
        scroll.scrollMax = 6502;
        scroll.height = 281;
        scroll.width = 486;
        int y = 0;
        for (int i = 0; i < 100; i++) {
            addSprite(49101 + i, 10, "Interfaces/Achievements/IMAGE");
            addSprite(49201 + i, 2, "Interfaces/Achievements/IMAGE");
            addSprite(49301 + i, 5, "Interfaces/Achievements/IMAGE");
            addText(49401 + i, "", tda, 2, 0xFFFFFF, true, true);
            addText(49501 + i, "", tda, 2, 0xFFFFFF, false, true);
            addText(49601 + i, "", tda, 2, 0x425619, false, true);
            addSprite(49701 + i, 6, "Interfaces/Achievements/IMAGE");
            addText(49801 + i, "0/1", tda, 1, 0xFFFFFF, true, true);
            setBounds(49101 + i, 1, y, i, scroll);
            setBounds(49201 + i, 8, y + 5, 100 + i, scroll);
            setBounds(49301 + i, 430, y + 12, 200 + i, scroll);
            setBounds(49401 + i, 448, y + 24, 300 + i, scroll);
            setBounds(49501 + i, 65, y + 9, 400 + i, scroll);
            setBounds(49601 + i, 65, y + 24, 500 + i, scroll);
            setBounds(49701 + i, 65, y + 41, 600 + i, scroll);
            setBounds(49801 + i, 160, y + 43, 700 + i, scroll);
            y += 65;
        }
        RSInterface tier2 = addInterface(51100);
        setChildren(800, tier2);
        tier2.scrollMax = 6502;
        tier2.height = 281;
        tier2.width = 486;
        y = 0;
        for (int i = 0; i < 100; i++) {
            addSprite(51101 + i, 10, "Interfaces/Achievements/IMAGE");
            addSprite(51201 + i, 3, "Interfaces/Achievements/IMAGE");
            addSprite(51301 + i, 5, "Interfaces/Achievements/IMAGE");
            addText(51401 + i, "", tda, 2, 0xFFFFFF, true, true);
            addText(51501 + i, "", tda, 2, 0xFFFFFF, false, true);
            addText(51601 + i, "", tda, 2, 0x425619, false, true);
            addSprite(51701 + i, 6, "Interfaces/Achievements/IMAGE");
            addText(51801 + i, "0/1", tda, 1, 0xFFFFFF, true, true);
            setBounds(51101 + i, 1, y, i, tier2);
            setBounds(51201 + i, 8, y + 5, 100 + i, tier2);
            setBounds(51301 + i, 430, y + 12, 200 + i, tier2);
            setBounds(51401 + i, 448, y + 24, 300 + i, tier2);
            setBounds(51501 + i, 65, y + 9, 400 + i, tier2);
            setBounds(51601 + i, 65, y + 24, 500 + i, tier2);
            setBounds(51701 + i, 65, y + 41, 600 + i, tier2);
            setBounds(51801 + i, 160, y + 43, 700 + i, tier2);
            y += 65;
        }
        RSInterface tier3 = addInterface(53100);
        setChildren(800, tier3);
        tier3.scrollMax = 6502;
        tier3.height = 281;
        tier3.width = 486;
        y = 0;
        for (int i = 0; i < 100; i++) {
            addSprite(53101 + i, 10, "Interfaces/Achievements/IMAGE");
            addSprite(53201 + i, 4, "Interfaces/Achievements/IMAGE");
            addSprite(53301 + i, 5, "Interfaces/Achievements/IMAGE");
            addText(53401 + i, "", tda, 2, 0xFFFFFF, true, true);
            addText(53501 + i, "", tda, 2, 0xFFFFFF, false, true);
            addText(53601 + i, "", tda, 2, 0x425619, false, true);
            addSprite(53701 + i, 6, "Interfaces/Achievements/IMAGE");
            addText(53801 + i, "0/1", tda, 1, 0xFFFFFF, true, true);
            setBounds(53101 + i, 1, y, i, tier3);
            setBounds(53201 + i, 8, y + 5, 100 + i, tier3);
            setBounds(53301 + i, 430, y + 12, 200 + i, tier3);
            setBounds(53401 + i, 448, y + 24, 300 + i, tier3);
            setBounds(53501 + i, 65, y + 9, 400 + i, tier3);
            setBounds(53601 + i, 65, y + 24, 500 + i, tier3);
            setBounds(53701 + i, 65, y + 41, 600 + i, tier3);
            setBounds(53801 + i, 160, y + 43, 700 + i, tier3);
            y += 65;
        }
    }

    /*
     * public static void optionTab(TextDrawingArea[] tda) { RSInterface tab =
     * addTabInterface(904); RSInterface energy = interfaceCache[149];
     * energy.textColor = 0xff9933; addSprite(905, 9, "/Options/SPRITE");
     * addSprite(907, 18, "/Options/SPRITE"); addSprite(909, 29, "/Options/SPRITE");
     * addSprite(951, 32, "/Options/SPRITE"); addSprite(953, 33, "/Options/SPRITE");
     * addSprite(955, 34, "/Options/SPRITE"); addSprite(947, 36, "/Options/SPRITE");
     * addSprite(949, 35, "/Options/SPRITE"); addSprite(949, 35, "/Options/SPRITE");
     * // run button here addConfigButton(152, 904, 30, 31, "/Options/SPRITE", 40,
     * 40, "Toggle-run", 1, 5, 173); addConfigButton(906, 904, 10, 14,
     * "/Options/SPRITE", 32, 16, "Dark", 1, 5, 166); addConfigButton(908, 904, 11,
     * 15, "/Options/SPRITE", 32, 16, "Normal", 2, 5, 166); addConfigButton(910,
     * 904, 12, 16, "/Options/SPRITE", 32, 16, "Bright", 3, 5, 166);
     * addConfigButton(912, 904, 13, 17, "/Options/SPRITE", 32, 16, "Very Bright",
     * 4, 5, 166); addConfigButton(930, 904, 19, 24, "/Options/SPRITE", 26, 16,
     * "Music Off", 4, 5, 168); addConfigButton(931, 904, 20, 25, "/Options/SPRITE",
     * 26, 16, "Music Level-1", 3, 5, 168); addConfigButton(932, 904, 21, 26,
     * "/Options/SPRITE", 26, 16, "Music Level-2", 2, 5, 168); addConfigButton(933,
     * 904, 22, 27, "/Options/SPRITE", 26, 16, "Music Level-3", 1, 5, 168);
     * addConfigButton(934, 904, 23, 28, "/Options/SPRITE", 24, 16, "Music Level-4",
     * 0, 5, 168); addConfigButton(941, 904, 19, 24, "/Options/SPRITE", 26, 16,
     * "Sound Effects Off", 4, 5, 169); addConfigButton(942, 904, 20, 25,
     * "/Options/SPRITE", 26, 16, "Sound Effects Level-1", 3, 5, 169);
     * addConfigButton(943, 904, 21, 26, "/Options/SPRITE", 26, 16,
     * "Sound Effects Level-2", 2, 5, 169); addConfigButton(944, 904, 22, 27,
     * "/Options/SPRITE", 26, 16, "Sound Effects Level-3", 1, 5, 169);
     * addConfigButton(945, 904, 23, 28, "/Options/SPRITE", 24, 16,
     * "Sound Effects Level-4", 0, 5, 169); addConfigButton(913, 904, 30, 31,
     * "/Options/SPRITE", 40, 40, "Toggle-Orbs", 0, 5, 170); addConfigButton(915,
     * 904, 30, 31, "/Options/SPRITE", 40, 40, "Toggle-Chat Effects", 0, 5, 171);
     * addConfigButton(957, 904, 30, 31, "/Options/SPRITE", 40, 40,
     * "Toggle-Split Private Chat", 1, 5, 287); addConfigButton(12464, 904, 30, 31,
     * "/Options/SPRITE", 40, 40, "Toggle-Accept Aid", 0, 5, 427); addButton(17255,
     * 0, "/Options/OTHER", ""); addConfigButton(19998, 904, 30, 31,
     * "/Options/SPRITE", 40, 40, "Toggle-Left Click Attack", 0, 4, 430);
     * addSprite(19999, 37, "/Options/SPRITE"); tab.totalChildren(31); int x = 0;
     * int y = 2; tab.child(0, 905, 13 + x, 10 + y); tab.child(1, 906, 48 + x, 18 +
     * y); tab.child(2, 908, 80 + x, 18 + y); tab.child(3, 910, 112 + x, 18 + y);
     * tab.child(4, 912, 144 + x, 18 + y); tab.child(5, 907, 14 + x, 55 + y);
     * tab.child(6, 930, 49 + x, 61 + y); tab.child(7, 931, 75 + x, 61 + y);
     * tab.child(8, 932, 101 + x, 61 + y); tab.child(9, 933, 127 + x, 61 + y);
     * tab.child(10, 934, 151 + x, 61 + y); tab.child(11, 909, 13 + x, 99 + y);
     * tab.child(12, 941, 49 + x, 104 + y); tab.child(13, 942, 75 + x, 104 + y);
     * tab.child(14, 943, 101 + x, 104 + y); tab.child(15, 944, 127 + x, 104 + y);
     * tab.child(16, 945, 151 + x, 104 + y); tab.child(17, 913, 15, 153);
     * tab.child(18, 955, 19, 159); tab.child(19, 915, 75, 153); tab.child(20, 953,
     * 79, 160); tab.child(21, 957, 135, 153); tab.child(22, 951, 139, 159);
     * tab.child(23, 12464, 15, 208); tab.child(24, 949, 20, 213); tab.child(25,
     * 152, 75, 208); tab.child(26, 947, 87, 212); tab.child(27, 149, 80, 231);
     * tab.child(28, 17255, 135, 208); tab.child(29, 19998, 135, 208); tab.child(30,
     * 19999, 135, 208); }
     */

    private static final void addGodwarsWidget(TextDrawingArea[] tda) {
        RSInterface godwars = addInterface(16210);
        setChildren(9, godwars);
        addText(16211, "NPC Killcount", tda, 0, 0xFD851A, false, true);
        addText(16212, "Armadyl", tda, 0, 0xFD851A, false, true);
        addText(16213, "Bandos", tda, 0, 0xFD851A, false, true);
        addText(16214, "Saradomin", tda, 0, 0xFD851A, false, true);
        addText(16215, "Zamorak", tda, 0, 0xFD851A, false, true);
        addText(16216, "0", tda, 0, 0x66FFFF, false, true);
        addText(16217, "0", tda, 0, 0x66FFFF, false, true);
        addText(16218, "0", tda, 0, 0x66FFFF, false, true);
        addText(16219, "0", tda, 0, 0x66FFFF, false, true);
        setBounds(16211, 400, 20, 0, godwars);
        for (int index = 1; index <= 4; index++) {
            setBounds(16211 + index, 400, 20 + index * 13, index, godwars);
        }
        for (int index = 1; index <= 4; index++) {
            setBounds(16215 + index, 480, 20 + index * 13, index + 4, godwars);
        }
    }

    private static void keybindingDropdown(int id, int width, int defaultOption, String[] options, Dropdown d,
                                           boolean inverted) {
        RSInterface widget = addInterface(id);
        widget.type = TYPE_KEYBINDS_DROPDOWN;
        widget.dropdown = new DropdownMenu(width, true, defaultOption, options, d);
        widget.atActionType = OPTION_DROPDOWN;
        widget.inverted = inverted;
    }

    private static void keybinding(TextDrawingArea[] tda) {
        RSInterface tab = addTabInterface(53000);

        addSettingsSprite(53001, 63);
        addText(53002, "Keybinding", tda, 2, 0xff8a1f, false, true);
        closeButton(53003, 83, 84);

        hoverButton(Keybinding.RESTORE_DEFAULT, "Restore Defaults", 80, 81, "Restore Defaults", rsFont, 0xff8a1f,
                0xff8a1f, true);

        addText(53005, "Esc closes current interface", tda, 1, 0xff8a1f, false, true);
        configButton(Keybinding.ESCAPE_CONFIG, "Select", 62, 61);

        tab.totalChildren(48);
        int childNum = 0;

        setBounds(53001, 5, 17, childNum++, tab);
        setBounds(53002, 221, 27, childNum++, tab);
        setBounds(39021, 479, 24, childNum++, tab);
        setBounds(Keybinding.RESTORE_DEFAULT, 343, 275, childNum++, tab);
        setBounds(53005, 59, 284, childNum++, tab);
        setBounds(Keybinding.ESCAPE_CONFIG, 35, 285, childNum++, tab);

        /* Tabs and dropdowns */

        int x = 31;
        int y = 63;
        childNum = 47;

        for (int i = 0; i < 14; i++, y += 43) {

            addSettingsSprite(53007 + 3 * i, 64 + i);
            configButton(53008 + 3 * i, "", 79, 78);

            boolean inverted = i == 3 || i == 4 || i == 8 || i == 9 || i == 13;
            keybindingDropdown(53009 + 3 * i, 86, 0, Keybinding.OPTIONS, Dropdown.KEYBIND_SELECTION, inverted);

            setBounds(Keybinding.MIN_FRAME - 2 + 3 * i, x + stoneOffset(64 + i, true), y + stoneOffset(64 + i, false),
                    childNum--, tab);
            setBounds(Keybinding.MIN_FRAME - 1 + 3 * i, x, y, childNum--, tab);
            setBounds(Keybinding.MIN_FRAME + 3 * i, x + 39, y + 4, childNum--, tab);

            if (i == 4 || i == 9) {
                x += 160;
                y = 20;
            }
        }
    }

    private static int stoneOffset(int spriteId, boolean xOffset) {
        Sprite stone = Client.cacheSprite3[79];
        Sprite icon = Client.cacheSprite3[spriteId];

        if (xOffset) {
            return (stone.myWidth / 2) - icon.myWidth / 2;
        }
        return (stone.myHeight / 2) - icon.myHeight / 2;
    }

    private static void clanChatSetup(TextDrawingArea[] tda) {
        RSInterface rsi = addInterface(18300);
        rsi.totalChildren(12 + 15);
        int count = 0;
        /* Background */
        addSprite(18301, 1, "/Interfaces/Clan Chat/sprite");
        rsi.child(count++, 18301, 14, 18);
        /* Close button */
        addButton(18302, 0, "/Interfaces/Clan Chat/close", "Close");
        interfaceCache[18302].atActionType = 3;
        rsi.child(count++, 18302, 475, 26);
        /* Clan Setup title */
        addText(18303, "Clan Setup", tda, 2, 0xFF981F, true, true);
        rsi.child(count++, 18303, 256, 26);
        /* Setup buttons */
        String[] titles = {"Clan name:", "Who can enter chat?", "Who can talk on chat?", "Who can kick on chat?", "Who can ban on chat?"};
        String[] defaults = {"Chat Disabled", "Anyone", "Anyone", "Anyone", "Anyone"};
        String[] whoCan = {"Anyone", "Recruit", "Corporal", "Sergeant", "Lieutenant", "Captain", "General", "Only Me"};
        for (int index = 0, id = 18304, y = 50; index < titles.length; index++, id += 3, y += 40) {
            addButton(id, 2, "/Interfaces/Clan Chat/sprite", "");
            interfaceCache[id].atActionType = 0;
            if (index > 0) {
                interfaceCache[id].actions = whoCan;
            } else {
                interfaceCache[id].actions = new String[]{"Change title", "Delete clan"};
                ;
            }
            addText(id + 1, titles[index], tda, 0, 0xFF981F, true, true);
            addText(id + 2, defaults[index], tda, 1, 0xFFFFFF, true, true);
            rsi.child(count++, id, 25, y);
            rsi.child(count++, id + 1, 100, y + 4);
            rsi.child(count++, id + 2, 100, y + 17);
        }
        /* Table */
        addSprite(18319, 5, "/Interfaces/Clan Chat/sprite");
        rsi.child(count++, 18319, 197, 70);
        /* Labels */
        int id = 18320;
        int y = 74;
        addText(id, "Ranked Members", tda, 2, 0xFF981F, false, true);
        rsi.child(count++, id++, 202, y);
        addText(id, "Banned Members", tda, 2, 0xFF981F, false, true);
        rsi.child(count++, id++, 339, y);
        /* Ranked members list */
        RSInterface list = addInterface(id++);
        int lines = 100;
        list.totalChildren(lines);
        String[] ranks = {"Demote", "Recruit", "Corporal", "Sergeant", "Lieutenant", "Captain", "General", "Owner"};
        list.childY[0] = 2;
        // System.out.println(id);
        for (int index = id; index < id + lines; index++) {
            addText(index, "", tda, 1, 0xffffff, false, true);
            interfaceCache[index].actions = ranks;
            list.children[index - id] = index;
            list.childX[index - id] = 2;
            list.childY[index - id] = (index - id > 0 ? list.childY[index - id - 1] + 14 : 0);
        }
        id += lines;
        list.width = 119;
        list.height = 210;
        list.scrollMax = 2000;
        rsi.child(count++, list.id, 199, 92);
        /* Banned members list */
        list = addInterface(id++);
        list.totalChildren(lines);
        list.childY[0] = 2;
        // System.out.println(id);
        for (int index = id; index < id + lines; index++) {
            if (index == 18470) {
                index++;
                id++;
            }
            addText(index, "", tda, 1, 0xffffff, false, true);
            interfaceCache[index].actions = new String[]{"Unban"};
            list.children[index - id] = index;
            list.childX[index - id] = 0;
            list.childY[index - id] = (index - id > 0 ? list.childY[index - id - 1] + 14 : 0);
        }
        id += lines;
        list.width = 119;
        list.height = 210;
        list.scrollMax = 2000;
        rsi.child(count++, list.id, 339, 92);
        /* Table info text */
        y = 47;
        addText(id, "You can manage both ranked and banned members here.", tda, 0, 0xFF981F, true, true);
        rsi.child(count++, id++, 337, y);
        addText(id, "Right click on a name to edit the member.", tda, 0, 0xFF981F, true, true);
        rsi.child(count++, id++, 337, y + 11);
        /* Add ranked member button */
        y = 75;
        addButton(id, 0, "/Interfaces/Clan Chat/plus", "Add ranked member");
        interfaceCache[id].atActionType = 5;
        rsi.child(count++, id++, 319, y);
        /* Add banned member button */
        addButton(id, 0, "/Interfaces/Clan Chat/plus", "Add banned member");
        interfaceCache[id].atActionType = 5;
        rsi.child(count++, id++, 459, y);

        /* Hovers */
        int[] clanSetup = {18302, 18304, 18307, 18310, 18313, 18316, 18526, 18527};
        String[] names = {"close", "sprite", "sprite", "sprite", "sprite", "sprite", "plus", "plus"};
        int[] ids = {1, 3, 3, 3, 3, 3, 1, 1};
        for (int index = 0; index < clanSetup.length; index++) {
            rsi = interfaceCache[clanSetup[index]];
            rsi.disabledHover = imageLoader(ids[index], "/Interfaces/Clan Chat/" + names[index]);
        }
    }

    private static void Pestpanel(TextDrawingArea[] tda) {
        RSInterface RSinterface = addTab(21119);

        addText(21120, "Next Departure:", 0xCCCBCB, false, true, 52, tda, 1);
        addText(21121, "Players Ready:", 0x5BD230, false, true, 52, tda, 1);
        addText(21122, "(Need 5 to 25 players)", 0xDED36A, false, true, 52, tda, 1);
        addText(21123, "Pest Points:", 0x99FFFF, false, true, 52, tda, 1);
        int last = 4;
        RSinterface.children = new int[last];
        RSinterface.childX = new int[last];
        RSinterface.childY = new int[last];

        setBounds(21120, 5, 5, 0, RSinterface);
        setBounds(21121, 5, 20, 1, RSinterface);
        setBounds(21122, 5, 35, 2, RSinterface);
        setBounds(21123, 5, 50, 3, RSinterface);

        RSInterface rsi = interfaceCache[6114] = new RSInterface();
        rsi.type = 4;
        rsi.width = 390;
        rsi.centerText = true;
    }

    private static void Pestpanel2(TextDrawingArea[] tda) {
        RSInterface RSinterface = addInterface(21100);
        addSprite(21101, 0, "Interfaces/Pest Control/PEST1");
        addSprite(21102, 1, "Interfaces/Pest Control/PEST1");
        addSprite(21103, 2, "Interfaces/Pest Control/PEST1");
        addSprite(21104, 3, "Interfaces/Pest Control/PEST1");
        addSprite(21105, 4, "Interfaces/Pest Control/PEST1");
        addSprite(21106, 5, "Interfaces/Pest Control/PEST1");
        addText(21107, "", 0xCC00CC, false, true, 52, tda, 1);
        addText(21108, "", 0x0000FF, false, true, 52, tda, 1);
        addText(21109, "", 0xFFFF44, false, true, 52, tda, 1);
        addText(21110, "", 0xCC0000, false, true, 52, tda, 1);
        addText(21111, "", 0x99FF33, false, true, 52, tda, 1);// w purp
        addText(21112, "", 0x99FF33, false, true, 52, tda, 1);// e blue
        addText(21113, "", 0x99FF33, false, true, 52, tda, 1);// se yel
        addText(21114, "", 0x99FF33, false, true, 52, tda, 1);// sw red
        addText(21115, "200", 0x99FF33, false, true, 52, tda, 1);// attacks
        addText(21116, "", 0x99FF33, false, true, 52, tda, 1);// knights hp
        addText(21117, "Time Remaining:", 0xFFFFFF, false, true, 52, tda, 0);
        addText(21118, "", 0xFFFFFF, false, true, 52, tda, 0);
        int last = 18;
        RSinterface.children = new int[last];
        RSinterface.childX = new int[last];
        RSinterface.childY = new int[last];
        setBounds(21101, 361, 27, 0, RSinterface);
        setBounds(21102, 396, 27, 1, RSinterface);
        setBounds(21103, 436, 27, 2, RSinterface);
        setBounds(21104, 474, 27, 3, RSinterface);
        setBounds(21105, 3, 21, 4, RSinterface);
        setBounds(21106, 3, 50, 5, RSinterface);
        setBounds(21107, 371, 60, 6, RSinterface);
        setBounds(21108, 409, 60, 7, RSinterface);
        setBounds(21109, 443, 60, 8, RSinterface);
        setBounds(21110, 479, 60, 9, RSinterface);
        setBounds(21111, 362, 14, 10, RSinterface);
        setBounds(21112, 398, 14, 11, RSinterface);
        setBounds(21113, 436, 14, 12, RSinterface);
        setBounds(21114, 475, 14, 13, RSinterface);
        setBounds(21115, 32, 32, 14, RSinterface);
        setBounds(21116, 32, 62, 15, RSinterface);
        setBounds(21117, 8, 88, 16, RSinterface);
        setBounds(21118, 87, 88, 17, RSinterface);
    }

    private static void godWars(TextDrawingArea[] tda) {
        RSInterface rsinterface = addTabInterface(16210);
        addText(16211, "NPC killcount", tda, 0, 0xff9040, true, true);
        addText(16212, "Armadyl kills", tda, 0, 0xff9040, true, true);
        addText(16213, "Bandos kills", tda, 0, 0xff9040, true, true);
        addText(16214, "Saradomin kills", tda, 0, 0xff9040, true, true);
        addText(16215, "Zamorak kills", tda, 0, 0xff9040, true, true);
        addText(16216, "0", tda, 0, 0x66FFFF, true, true);// armadyl
        addText(16217, "0", tda, 0, 0x66FFFF, true, true);// bandos
        addText(16218, "0", tda, 0, 0x66FFFF, true, true);// saradomin
        addText(16219, "0", tda, 0, 0x66FFFF, true, true);// zamorak
        rsinterface.scrollMax = 0;
        rsinterface.children = new int[9];
        rsinterface.childX = new int[9];
        rsinterface.childY = new int[9];
        rsinterface.children[0] = 16211;
        rsinterface.childX[0] = -52 + 375 + 30;
        rsinterface.childY[0] = 7;
        rsinterface.children[1] = 16212;
        rsinterface.childX[1] = -52 + 375 + 30;
        rsinterface.childY[1] = 30;
        rsinterface.children[2] = 16213;
        rsinterface.childX[2] = -52 + 375 + 30;
        rsinterface.childY[2] = 44;
        rsinterface.children[3] = 16214;
        rsinterface.childX[3] = -52 + 375 + 30;
        rsinterface.childY[3] = 58;
        rsinterface.children[4] = 16215;
        rsinterface.childX[4] = -52 + 375 + 30;
        rsinterface.childY[4] = 73;
        rsinterface.children[5] = 16216;
        rsinterface.childX[5] = -52 + 460 + 60;
        rsinterface.childY[5] = 31;
        rsinterface.children[6] = 16217;
        rsinterface.childX[6] = -52 + 460 + 60;
        rsinterface.childY[6] = 45;
        rsinterface.children[7] = 16218;
        rsinterface.childX[7] = -52 + 460 + 60;
        rsinterface.childY[7] = 59;
        rsinterface.children[8] = 16219;
        rsinterface.childX[8] = -52 + 460 + 60;
        rsinterface.childY[8] = 74;
    }

    private static final int BEGIN_READING_PRAYER_INTERFACE = 6;// Amount of total custom prayers we've added
    private static final int CUSTOM_PRAYER_HOVERS = 3; // Amount of custom prayer hovers we've added

    public static final int PRAYER_INTERFACE_CHILDREN = 80 + BEGIN_READING_PRAYER_INTERFACE + CUSTOM_PRAYER_HOVERS;

    private static final int TYPE_SPRITE = 5;

    private static void addPrayerHover(TextDrawingArea[] tda, int idx, int ID, String hover, int xOffset, int yOffset) {
        // Adding hover box
        RSInterface p = addTabInterface(ID);
        p.inventoryhover = true;
        p.parentID = 5608;
        p.type = 8;
        p.width = 40;
        p.height = 32;
        p.hoverText = p.message = hover;
        p.textDrawingAreas = tda[idx];
        p.hoverXOffset = xOffset;
        p.hoverYOffset = yOffset;
        p.regularHoverBox = true;
    }

    private static void prayerBook(TextDrawingArea[] tda) {
        RSInterface tab = addTabInterface(15608);
        tab.totalChildren(10);
        RSInterface prayerBook = interfaceCache[5608];

        // Switches the Chivalry & Piety positions.
        //Chivalry
        int xMinus = 1;
        int minusX = 37;
        prayerBook.childX[50] = 41 - minusX;
        prayerBook.childY[50] = 195 - xMinus;
        prayerBook.childX[51] = 48 - minusX;
        prayerBook.childY[51] = 197 - xMinus;
        prayerBook.childX[63] = 41 - minusX;
        prayerBook.childY[63] = 200 - xMinus;

        // Piety
        prayerBook.childX[52] = 41;
        prayerBook.childY[52] = 195 - xMinus;
        prayerBook.childX[53] = 43;
        prayerBook.childY[53] = 206 - xMinus;
        prayerBook.childX[64] = 48;
        prayerBook.childY[64] = 197 - xMinus;

        addPrayer(39401, 0, 708, 55, 26, "Preserve");
        addPrayer(39404, 0, 710, 74, 27, "Rigour");
        addPrayer(39407, 0, 712, 77, 28, "Augury");
        addPrayerHover(tda, 1, 39409,
                "Level 77\\nAugury\\nIncreases your Magic attack\\nby 25% and your defence by\\n25%", -110, -100);
        addPrayerHover(tda, 1, 39403, "Level 55\\nPreserve\\nBoosted stats last 20%\nlonger.", -135, -60);
        addPrayerHover(tda, 1, 39406,
                "Level 74\\nRigour\\nIncreases your Ranged attack\\nby 20% and damage by 23%,\\nand your defence by 25%",
                -70, -100);
        setBounds(39401, 152, 158 - xMinus, 0, tab);
        setBounds(39404, 78, 195 - xMinus, 1, tab);
        setBounds(39407, 115, 195 - xMinus, 2, tab);
        setBounds(39402, 154, 158 - xMinus, 3, tab);
        setBounds(39405, 81, 198 - xMinus, 4, tab);
        setBounds(39408, 118, 198 - xMinus, 5, tab);
        setBounds(5608, 0, 0 - xMinus, 6, tab);
        setBounds(39403, 154, 158 - xMinus, 7, tab);
        setBounds(39406, 84, 198 - xMinus, 8, tab);
        setBounds(39409, 120, 198 - xMinus, 9, tab);

    }

    public static void ancients(TextDrawingArea[] tda) {
        RSInterface p = addTabInterface(838);
        RSInterface rsinterface = interfaceCache[12855];
        // rsinterface.childX[6] = 10;
        rsinterface.childY[22] = 153;
        rsinterface.childX[22] = 18;
        rsinterface.childY[30] = 153;
        rsinterface.childX[30] = 65;
        rsinterface.childY[44] = 153; // ANNAKARL
        rsinterface.childX[44] = 112;
        rsinterface.childY[46] = 180; // GHORROCK
        rsinterface.childX[46] = 65;
        rsinterface.childY[7] = 181; // ICE BARRAGE
        rsinterface.childX[7] = 18;
        rsinterface.childY[15] = 153; // BLOOD BARRAGE
        rsinterface.childX[15] = 152;

        addSpellBig2(34674, 563, 560, 562, 10, 10, 10, 30009, 30009, 30011, 85, "Teleport to Target",
                "Teleports you near your Bounty\\nHunter Target", tda, 9, 7, 5);
        setChildren(3, p);
        setBounds(12855, 0, 0, 0, p);
        setBounds(34674, 150, 123, 1, p);
        setBounds(34675, 5, -5, 2, p);
    }

    private static void configureLunar(TextDrawingArea[] TDA) {
        constructLunar();
        homeTeleport();
        drawRune(30003, 1, "Fire");
        drawRune(30004, 2, "Water");
        drawRune(30005, 3, "Air");
        drawRune(30006, 4, "Earth");
        drawRune(30007, 5, "Mind");
        drawRune(30008, 6, "Body");
        drawRune(30009, 7, "Death");
        drawRune(30010, 8, "Nature");
        drawRune(30011, 9, "Chaos");
        drawRune(30012, 10, "Law");
        drawRune(30013, 11, "Cosmic");
        drawRune(30014, 12, "Blood");
        drawRune(30015, 13, "Soul");
        drawRune(30016, 14, "Astral");
        addLunar3RunesSmallBox(30017, 9075, 554, 555, 0, 4, 3, 30003, 30004, 64, "Bake Pie",
                "Bake pies without a stove", TDA, 0, 16, 2);
        addLunar2RunesSmallBox(30025, 9075, 557, 0, 7, 30006, 65, "Cure Plant", "Cure disease on farming patch", TDA, 1,
                4, 2);
        addLunar3RunesBigBox(30032, 9075, 564, 558, 0, 0, 0, 30013, 30007, 65, "Monster Examine",
                "Detect the combat statistics of a\\nmonster", TDA, 2, 2, 2);
        addLunar3RunesSmallBox(30040, 9075, 564, 556, 0, 0, 1, 30013, 30005, 66, "NPC Contact",
                "Speak with varied NPCs", TDA, 3, 0, 2);
        addLunar3RunesSmallBox(30048, 9075, 563, 557, 0, 0, 9, 30012, 30006, 67, "Cure Other", "Cure poisoned players",
                TDA, 4, 8, 2);
        addLunar3RunesSmallBox(30056, 9075, 555, 554, 0, 2, 0, 30004, 30003, 67, "Humidify",
                "fills certain vessels with water", TDA, 5, 0, 5);
        addLunar3RunesSmallBox(30064, 9075, 563, 557, 1, 0, 1, 30012, 30006, 68, "Moonclan Teleport",
                "Teleports you to moonclan island", TDA, 6, 0, 5);
        addLunar3RunesBigBox(30075, 9075, 563, 557, 1, 0, 3, 30012, 30006, 69, "Tele Groun Moonclan",
                "Teleports players to Moonclan\\nisland", TDA, 7, 0, 5);
        addLunar3RunesSmallBox(30083, 9075, 563, 557, 1, 0, 5, 30012, 30006, 70, "Ourania Teleport",
                "Teleports you to ourania rune altar", TDA, 8, 0, 5);
        addLunar3RunesSmallBox(30091, 9075, 564, 563, 1, 1, 0, 30013, 30012, 70, "Cure Me", "Cures Poison", TDA, 9, 0,
                5);
        addLunar2RunesSmallBox(30099, 9075, 557, 1, 1, 30006, 70, "Hunter Kit", "Get a kit of hunting gear", TDA, 10, 0,
                5);
        addLunar3RunesSmallBox(30106, 9075, 563, 555, 1, 0, 0, 30012, 30004, 71, "Waterbirth Teleport",
                "Teleports you to Waterbirth island", TDA, 11, 0, 5);
        addLunar3RunesBigBox(30114, 9075, 563, 555, 1, 0, 4, 30012, 30004, 72, "Tele Group Waterbirth",
                "Teleports players to Waterbirth\\nisland", TDA, 12, 0, 5);
        addLunar3RunesSmallBox(30122, 9075, 564, 563, 1, 1, 1, 30013, 30012, 73, "Cure Group",
                "Cures Poison on players", TDA, 13, 0, 5);
        addLunar3RunesBigBox(30130, 9075, 564, 559, 1, 1, 4, 30013, 30008, 74, "Stat Spy",
                "Cast on another player to see their\\nskill levels", TDA, 14, 8, 2);
        addLunar3RunesBigBox(30138, 9075, 563, 554, 1, 1, 2, 30012, 30003, 74, "Barbarian Teleport",
                "Teleports you to the Barbarian\\noutpost", TDA, 15, 0, 5);
        addLunar3RunesBigBox(30146, 9075, 563, 554, 1, 1, 5, 30012, 30003, 75, "Tele Group Barbarian",
                "Teleports players to the Barbarian\\noutpost", TDA, 16, 0, 5);
        addLunar3RunesSmallBox(30154, 9075, 554, 556, 1, 5, 9, 30003, 30005, 76, "Superglass Make",
                "Make glass without a furnace", TDA, 17, 16, 2);
        addLunar3RunesSmallBox(30162, 9075, 563, 555, 1, 1, 3, 30012, 30004, 77, "Khazard Teleport",
                "Teleports you to Port khazard", TDA, 18, 0, 5);
        addLunar3RunesSmallBox(30170, 9075, 563, 555, 1, 1, 7, 30012, 30004, 78, "Tele Group Khazard",
                "Teleports players to Port khazard", TDA, 19, 0, 5);
        addLunar3RunesBigBox(30178, 9075, 564, 559, 1, 0, 4, 30013, 30008, 78, "Dream",
                "Take a rest and restore hitpoints 3\\n times faster", TDA, 20, 0, 5);
        addLunar3RunesSmallBox(30186, 9075, 557, 555, 1, 9, 4, 30006, 30004, 79, "String Jewellery",
                "String amulets without wool", TDA, 21, 0, 5);
        addLunar3RunesLargeBox(30194, 9075, 557, 555, 1, 9, 9, 30006, 30004, 80, "Stat Restore Pot\\nShare",
                "Share a potion with up to 4 nearby\\nplayers", TDA, 22, 0, 5);
        addLunar3RunesSmallBox(30202, 9075, 554, 555, 1, 6, 6, 30003, 30004, 81, "Magic Imbue",
                "Combine runes without a talisman", TDA, 23, 0, 5);
        addLunar3RunesBigBox(30210, 9075, 561, 557, 2, 1, 14, 30010, 30006, 82, "Fertile Soil",
                "Fertilise a farming patch with super\\ncompost", TDA, 24, 4, 2);
        addLunar3RunesBigBox(30218, 9075, 557, 555, 2, 11, 9, 30006, 30004, 83, "Boost Potion Share",
                "Shares a potion with up to 4 nearby\\nplayers", TDA, 25, 0, 5);
        addLunar3RunesSmallBox(30226, 9075, 563, 555, 2, 2, 9, 30012, 30004, 84, "Fishing Guild Teleport",
                "Teleports you to the fishing guild", TDA, 26, 0, 5);
        addSpellBig2(30234, 563, 560, 562, 1, 1, 1, 30009, 30012, 30004, 84, "Teleport to Target",
                "Teleports you near your Bounty\\nHunter Target", TDA, 9, 7, 5);
        addLunar3RunesSmallBox(30242, 9075, 557, 561, 2, 14, 0, 30006, 30010, 85, "Plank Make", "Turn Logs into planks",
                TDA, 28, 16, 5);
        //Cut Off Limit
        addLunar3RunesSmallBox(30250, 9075, 563, 555, 2, 2, 9, 30012, 30004, 86, "Catherby Teleport",
                "Teleports you to Catherby", TDA, 29, 0, 5);
        addLunar3RunesSmallBox(30258, 9075, 563, 555, 2, 2, 14, 30012, 30004, 87, "Tele Group Catherby",
                "Teleports players to Catherby", TDA, 30, 0, 5);
        addLunar3RunesSmallBox(30266, 9075, 563, 555, 2, 2, 7, 30012, 30004, 88, "Ice Plateau Teleport",
                "Teleports you to Ice Plateau", TDA, 31, 0, 5);
        addLunar3RunesBigBox(30274, 9075, 563, 555, 2, 2, 15, 30012, 30004, 89, "Tele Group Ice\\n Plateau",
                "\\nTeleports players to Ice Plateau", TDA, 32, 0, 5);
        addLunar3RunesBigBox(30282, 9075, 563, 561, 2, 1, 0, 30012, 30010, 90, "Energy Transfer",
                "Spend hitpoints and Energy to\\n give another player \\nhitpoints and run energy", TDA, 33, 8, 2);
        addLunar3RunesBigBox(30290, 9075, 563, 565, 2, 2, 0, 30012, 30014, 91, "Heal Other",
                "Transfer up to 75% of hitpoints\\n to another player", TDA, 34, 8, 2);
        addLunar3RunesBigBox(30298, 9075, 560, 557, 2, 1, 9, 30009, 30006, 92, "Vengeance Other",
                "Allows another player to rebound\\ndamage to an opponent", TDA, 35, 8, 2);
        addLunar3RunesSmallBox(30306, 9075, 560, 557, 3, 1, 9, 30009, 30006, 93, "Vengeance",
                "Rebound damage to an opponent", TDA, 36, 0, 5);
        addLunar3RunesBigBox(30314, 9075, 565, 563, 3, 2, 5, 30014, 30012, 94, "Heal Group",
                "Transfer up to 75% of hitpoints to a group", TDA, 37, 0, 5);
        addLunar3RunesBigBox(30322, 9075, 564, 563, 2, 1, 0, 30013, 30012, 95, "Spellbook Swap",
                "Change to another spellbook for 1\\nspell cast", TDA, 38, 0, 5);
    }

    private static void constructLunar() {
        RSInterface Interface = addInterface(29999);
        setChildren(80, Interface); // 71
        int[] Cid = {30000, 30017, 30025, 30032, 30040, 30048, 30056, 30064, 30075, 30083, 30091, 30099, 30106, 30114,
                30122, 30130, 30138, 30146, 30154, 30162, 30170, 30178, 30186, 30194, 30202, 30210, 30218, 30226, 30234,
                30242, 30250, 30258, 30266, 30274, 30282, 30290, 30298, 30306, 30314, 30322, 30001, 30018, 30026, 30033,
                30041, 30049, 30057, 30065, 30076, 30084, 30092, 30100, 30107, 30115, 30123, 30131, 30139, 30147, 30155,
                30163, 30171, 30179, 30187, 30195, 30203, 30211, 30219, 30227, 30235, 30243, 30251, 30259, 30267, 30275,
                30283, 30291, 30299, 30307, 30315, 30323};

        int[] xCord = {11, 40, 71, 103, 135, 165, 8, 39, 71, 103, 135, 165, 12, 42, 71, 103, 135, 165, 14, 42, 71, 101,
                135, 168, 11, 42, 74, 103, 135, 164, 10, 42, 71, 103, 136, 165, 13, 42, 71, 104, 6, 5, 5, 5, 5, 5, 5, 5,
                5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};

        int[] yCord = {9, 9, 12, 10, 12, 10, 39, 39, 39, 39, 39, 37, 68, 68, 68, 68, 68, 68, 97, 97, 97, 97, 98, 98,
                125, 124, 125, 125, 125, 126, 155, 155, 155, 155, 155, 155, 185, 185, 184, 184, 184, 176, 176, 163, 176,
                176, 176, 176, 163, 176, 176, 176, 176, 163, 176, 163, 163, 163, 176, 176, 176, 163, 176, 149, 176, 163,
                163, 176, 149, 176, 176, 176, 176, 176, 9, 9, 9, 9, 9, 9};

        for (int i = 0; i < Cid.length; i++) {
            setBounds(Cid[i], xCord[i], yCord[i], i, Interface);
        }
    }

    private static void emoteTab() {
        RSInterface tab = addTabInterface(147);
        RSInterface scroll = addTabInterface(148);
        tab.totalChildren(1);
        tab.child(0, 148, 0, 1);
        addButton(168, 0, "Emotes/EMOTE", "Yes");
        addButton(169, 1, "Emotes/EMOTE", "No");
        addButton(164, 2, "Emotes/EMOTE", "Bow");
        addButton(165, 3, "Emotes/EMOTE", "Angry");
        addButton(162, 4, "Emotes/EMOTE", "Think");
        addButton(163, 5, "Emotes/EMOTE", "Wave");
        addButton(13370, 6, "Emotes/EMOTE", "Shrug");
        addButton(171, 7, "Emotes/EMOTE", "Cheer");
        addButton(167, 8, "Emotes/EMOTE", "Beckon");
        addButton(170, 9, "Emotes/EMOTE", "Laugh");
        addButton(13366, 10, "Emotes/EMOTE", "Jump for Joy");
        addButton(13368, 11, "Emotes/EMOTE", "Yawn");
        addButton(166, 12, "Emotes/EMOTE", "Dance");
        addButton(13363, 13, "Emotes/EMOTE", "Jig");
        addButton(13364, 14, "Emotes/EMOTE", "Spin");
        addButton(13365, 15, "Emotes/EMOTE", "Headbang");
        addButton(161, 16, "Emotes/EMOTE", "Cry");
        addButton(11100, 17, "Emotes/EMOTE", "Blow kiss");
        addButton(13362, 18, "Emotes/EMOTE", "Panic");
        addButton(13367, 19, "Emotes/EMOTE", "Raspberry");
        addButton(172, 20, "Emotes/EMOTE", "Clap");
        addButton(13369, 21, "Emotes/EMOTE", "Salute");
        addButton(13383, 22, "Emotes/EMOTE", "Goblin Bow");
        addButton(13384, 23, "Emotes/EMOTE", "Goblin Salute");
        addButton(667, 24, "Emotes/EMOTE", "Glass Box");
        addButton(6503, 25, "Emotes/EMOTE", "Climb Rope");
        addButton(6506, 26, "Emotes/EMOTE", "Lean On Air");
        addButton(666, 27, "Emotes/EMOTE", "Glass Wall");
        addButton(18464, 28, "Emotes/EMOTE", "Zombie Walk");
        addButton(18465, 29, "Emotes/EMOTE", "Zombie Dance");
        addButton(15166, 30, "Emotes/EMOTE", "Scared");
        addButton(18686, 31, "Emotes/EMOTE", "Rabbit Hop");
        addConfigButton(154, 147, 32, 33, "Emotes/EMOTE", 41, 47, "Skillcape Emote", 0, 1, 700);
        scroll.totalChildren(33);
        scroll.child(0, 168, 10, 7);
        scroll.child(1, 169, 54, 7);
        scroll.child(2, 164, 98, 14);
        scroll.child(3, 165, 137, 7);
        scroll.child(4, 162, 9, 56);
        scroll.child(5, 163, 48, 56);
        scroll.child(6, 13370, 95, 56);
        scroll.child(7, 171, 137, 56);
        scroll.child(8, 167, 7, 105);
        scroll.child(9, 170, 51, 105);
        scroll.child(10, 13366, 95, 104);
        scroll.child(11, 13368, 139, 105);
        scroll.child(12, 166, 6, 154);
        scroll.child(13, 13363, 50, 154);
        scroll.child(14, 13364, 90, 154);
        scroll.child(15, 13365, 135, 154);
        scroll.child(16, 161, 8, 204);
        scroll.child(17, 11100, 51, 203);
        scroll.child(18, 13362, 99, 204);
        scroll.child(19, 13367, 137, 203);
        scroll.child(20, 172, 10, 253);
        scroll.child(21, 13369, 53, 253);
        scroll.child(22, 13383, 88, 258);
        scroll.child(23, 13384, 138, 252);
        scroll.child(24, 667, 2, 303);
        scroll.child(25, 6503, 49, 302);
        scroll.child(26, 6506, 93, 302);
        scroll.child(27, 666, 137, 302);
        scroll.child(28, 18464, 9, 352);
        scroll.child(29, 18465, 50, 352);
        scroll.child(30, 15166, 94, 356);
        scroll.child(31, 18686, 141, 353);
        scroll.child(32, 154, 5, 401);
        scroll.width = 173;
        scroll.height = 258;
        scroll.scrollMax = 450;
    }

    private static void removeConfig(int id) {
        @SuppressWarnings("unused")
        RSInterface rsi = interfaceCache[id] = new RSInterface();
    }

    private static void addHoverButton_sprite_loader(int i, int spriteId, int width, int height, String text,
                                                     int contentType, int hoverOver, int aT) {// hoverable
        // button
        RSInterface tab = addTabInterface(i);
        tab.id = i;
        tab.parentID = i;
        tab.type = 5;
        tab.atActionType = aT;
        tab.contentType = contentType;
        tab.opacity = 0;
        tab.hoverType = hoverOver;
        tab.sprite1 = Client.cacheSprite1[spriteId];
        tab.sprite2 = Client.cacheSprite1[spriteId];
        tab.width = width;
        tab.height = height;
        tab.tooltip = text;
    }

    private static void addHoveredButton_sprite_loader(int i, int spriteId, int w, int h, int IMAGEID) {// hoverable
        // button
        RSInterface tab = addTabInterface(i);
        tab.parentID = i;
        tab.id = i;
        tab.type = 0;
        tab.atActionType = 0;
        tab.width = w;
        tab.height = h;
        tab.isMouseoverTriggered = true;
        tab.opacity = 0;
        tab.hoverType = -1;
        tab.scrollMax = 0;
        addHoverImage_sprite_loader(IMAGEID, spriteId);
        tab.totalChildren(1);
        tab.child(0, IMAGEID, 0, 0);
    }

    static void addSprite3(int childId, int spriteId) {
        RSInterface rsi = interfaceCache[childId] = new RSInterface();
        rsi.id = childId;
        rsi.parentID = childId;
        rsi.type = 5;
        rsi.atActionType = 0;
        rsi.contentType = 0;
        rsi.sprite1 = Client.cacheSprite3[spriteId];
        rsi.sprite2 = Client.cacheSprite3[spriteId];
        rsi.width = rsi.sprite1.myWidth;
        rsi.height = rsi.sprite2.myHeight - 2;
    }

    private static void addButton(int id, int sid, String tooltip) {
        RSInterface tab = interfaceCache[id] = new RSInterface();
        tab.id = id;
        tab.parentID = id;
        tab.type = 5;
        tab.atActionType = 1;
        tab.contentType = 0;
        tab.opacity = (byte) 0;
        tab.hoverType = 52;
        tab.sprite1 = Client.cacheSprite1[sid];// imageLoader(sid, spriteName);
        tab.sprite2 = Client.cacheSprite1[sid];// imageLoader(sid, spriteName);
        tab.width = tab.sprite1.myWidth;
        tab.height = tab.sprite1.myHeight;
        tab.tooltip = tooltip;
    }

    private static void addHoverImage_sprite_loader(int i, int spriteId) {
        RSInterface tab = addTabInterface(i);
        tab.id = i;
        tab.parentID = i;
        tab.type = 5;
        tab.atActionType = 0;
        tab.contentType = 0;
        tab.width = 512;
        tab.height = 334;
        tab.opacity = 0;
        tab.hoverType = 52;
        tab.sprite1 = Client.cacheSprite1[spriteId];
        tab.sprite2 = Client.cacheSprite1[spriteId];
    }

    private static void equipmentTab(TextDrawingArea[] wid) {
        RSInterface Interface = interfaceCache[1644];
        addSprite(15101, 0, "Interfaces/Equipment/bl");// cheap hax
        addSprite(15102, 1, "Interfaces/Equipment/bl");// cheap hax
        addSprite(15109, 2, "Interfaces/Equipment/bl");// cheap hax
        removeConfig(21338);
        removeConfig(21344);
        removeConfig(21342);
        removeConfig(21341);
        removeConfig(21340);
        removeConfig(15103);
        removeConfig(15104);
        Interface.children[24] = 15102;
        Interface.childX[24] = 110;
        Interface.childY[24] = 205;
        Interface.children[25] = 15109;
        Interface.childX[25] = 39;
        Interface.childY[25] = 240;
        Interface.children[26] = 27650;
        Interface.childX[26] = 0;
        Interface.childY[26] = 0;
        Interface = addInterface(27650);

        addHoverButton(27651, "/Equipment/SPRITE", 6, 40, 40, "Price-checker", 550, 27652, 5);
        addHoveredButton(27652, "/Equipment/SPRITE", 7, 40, 40, 27658);

        addHoverButton(27653, "/Equipment/SPRITE", 8, 40, 40, "Show Equipment Stats", 550, 27655, 5);
        addHoveredButton(27655, "/Equipment/SPRITE", 9, 40, 40, 27665);

        addHoverButton(27654, "/Equipment/SPRITE", 10, 40, 40, "Show items kept on death", -1, 27657, 1);
        addHoveredButton(27657, "/Equipment/SPRITE", 11, 40, 40, 27666);

        addHoverButton(27660, "/Equipment/SPRITE", 12, 40, 40, "Call follower", -1, 27661, 1);
        addHoveredButton(27661, "/Equipment/SPRITE", 13, 40, 40, 27662);

        setChildren(8, Interface);
        setBounds(27651, 53, 205, 0, Interface);
        setBounds(27652, 53, 205, 1, Interface);
        setBounds(27653, 8, 205, 2, Interface);
        setBounds(27654, 98, 205, 3, Interface);
        setBounds(27655, 8, 205, 4, Interface);
        setBounds(27657, 98, 205, 5, Interface);

        setBounds(27660, 98 + 45, 205, 6, Interface);
        setBounds(27661, 98 + 45, 205, 7, Interface);
    }

    public static void itemsOnDeath(TextDrawingArea[] wid) {
        RSInterface rsinterface = addInterface(17100);
        addSprite(17101, 2, 2);
        addHover(17102, 3, 0, 10601, 1, "Interfaces/Equipment/SPRITE", 17, 17, "Close Window");
        addHovered(10601, 3, "Interfaces/Equipment/SPRITE", 17, 17, 10602);
        addText(17103, "Items kept on death", wid, 2, 0xff981f);
        addText(17104, "Items I will keep...", wid, 1, 0xff981f);
        addText(17105, "Items I will lose...", wid, 1, 0xff981f);
        addText(17106, "Info", wid, 1, 0xff981f);
        addText(17107, "RuneScape", wid, 1, 0xffcc33);
        addText(17108, "", wid, 1, 0xffcc33);
        rsinterface.scrollMax = 0;
        rsinterface.isMouseoverTriggered = false;
        rsinterface.children = new int[12];
        rsinterface.childX = new int[12];
        rsinterface.childY = new int[12];

        rsinterface.children[0] = 17101;
        rsinterface.childX[0] = 7;
        rsinterface.childY[0] = 8;
        rsinterface.children[1] = 17102;
        rsinterface.childX[1] = 480;
        rsinterface.childY[1] = 17;
        rsinterface.children[2] = 17103;
        rsinterface.childX[2] = 185;
        rsinterface.childY[2] = 18;
        rsinterface.children[3] = 17104;
        rsinterface.childX[3] = 22;
        rsinterface.childY[3] = 50;
        rsinterface.children[4] = 17105;
        rsinterface.childX[4] = 22;
        rsinterface.childY[4] = 110;
        rsinterface.children[5] = 17106;
        rsinterface.childX[5] = 347;
        rsinterface.childY[5] = 47;
        rsinterface.children[6] = 17107;
        rsinterface.childX[6] = 349;
        rsinterface.childY[6] = 270;
        rsinterface.children[7] = 17108;
        rsinterface.childX[7] = 398;
        rsinterface.childY[7] = 298;
        rsinterface.children[8] = 17115;
        rsinterface.childX[8] = 348;
        rsinterface.childY[8] = 64;
        rsinterface.children[9] = 10494;
        rsinterface.childX[9] = 26;
        rsinterface.childY[9] = 74;
        rsinterface.children[10] = 10600;
        rsinterface.childX[10] = 26;
        rsinterface.childY[10] = 133;
        rsinterface.children[11] = 10601;
        rsinterface.childX[11] = 480;
        rsinterface.childY[11] = 17;
        interfaceCache[10494].invSpritePadX = 8;
        interfaceCache[10600].invSpritePadX = 6;
        interfaceCache[10600].invSpritePadY = 6;
    }

    public static void itemsOnDeathDATA(TextDrawingArea[] wid) {
        RSInterface rsinterface = addInterface(17115);
        addText(17109, "a", wid, 0, 0xff981f);
        addText(17110, "b", wid, 0, 0xff981f);
        addText(17111, "c", wid, 0, 0xff981f);
        addText(17112, "d", wid, 0, 0xff981f);
        addText(17113, "e", wid, 0, 0xff981f);
        addText(17114, "f", wid, 0, 0xff981f);
        addText(17117, "g", wid, 0, 0xff981f);
        addText(17118, "h", wid, 0, 0xff981f);
        addText(17119, "i", wid, 0, 0xff981f);
        addText(17120, "j", wid, 0, 0xff981f);
        addText(17121, "k", wid, 0, 0xff981f);
        addText(17122, "l", wid, 0, 0xff981f);
        addText(17123, "m", wid, 0, 0xff981f);
        addText(17124, "n", wid, 0, 0xff981f);
        addText(17125, "o", wid, 0, 0xff981f);
        addText(17126, "p", wid, 0, 0xff981f);
        addText(17127, "q", wid, 0, 0xff981f);
        addText(17128, "r", wid, 0, 0xff981f);
        addText(17129, "s", wid, 0, 0xff981f);
        addText(17130, "t", wid, 0, 0xff981f);
        rsinterface.parentID = 17115;
        rsinterface.id = 17115;
        rsinterface.type = 0;
        rsinterface.atActionType = 0;
        rsinterface.contentType = 0;
        rsinterface.width = 130;
        rsinterface.height = 197;
        rsinterface.aByte254 = 0;
        rsinterface.mOverInterToTrigger = -1;
        rsinterface.scrollMax = 280;
        rsinterface.children = new int[20];
        rsinterface.childX = new int[20];
        rsinterface.childY = new int[20];
        rsinterface.children[0] = 17109;
        rsinterface.childX[0] = 0;
        rsinterface.childY[0] = 0;
        rsinterface.children[1] = 17110;
        rsinterface.childX[1] = 0;
        rsinterface.childY[1] = 12;
        rsinterface.children[2] = 17111;
        rsinterface.childX[2] = 0;
        rsinterface.childY[2] = 24;
        rsinterface.children[3] = 17112;
        rsinterface.childX[3] = 0;
        rsinterface.childY[3] = 36;
        rsinterface.children[4] = 17113;
        rsinterface.childX[4] = 0;
        rsinterface.childY[4] = 48;
        rsinterface.children[5] = 17114;
        rsinterface.childX[5] = 0;
        rsinterface.childY[5] = 60;
        rsinterface.children[6] = 17117;
        rsinterface.childX[6] = 0;
        rsinterface.childY[6] = 72;
        rsinterface.children[7] = 17118;
        rsinterface.childX[7] = 0;
        rsinterface.childY[7] = 84;
        rsinterface.children[8] = 17119;
        rsinterface.childX[8] = 0;
        rsinterface.childY[8] = 96;
        rsinterface.children[9] = 17120;
        rsinterface.childX[9] = 0;
        rsinterface.childY[9] = 108;
        rsinterface.children[10] = 17121;
        rsinterface.childX[10] = 0;
        rsinterface.childY[10] = 120;
        rsinterface.children[11] = 17122;
        rsinterface.childX[11] = 0;
        rsinterface.childY[11] = 132;
        rsinterface.children[12] = 17123;
        rsinterface.childX[12] = 0;
        rsinterface.childY[12] = 144;
        rsinterface.children[13] = 17124;
        rsinterface.childX[13] = 0;
        rsinterface.childY[13] = 156;
        rsinterface.children[14] = 17125;
        rsinterface.childX[14] = 0;
        rsinterface.childY[14] = 168;
        rsinterface.children[15] = 17126;
        rsinterface.childX[15] = 0;
        rsinterface.childY[15] = 180;
        rsinterface.children[16] = 17127;
        rsinterface.childX[16] = 0;
        rsinterface.childY[16] = 192;
        rsinterface.children[17] = 17128;
        rsinterface.childX[17] = 0;
        rsinterface.childY[17] = 204;
        rsinterface.children[18] = 17129;
        rsinterface.childX[18] = 0;
        rsinterface.childY[18] = 216;
        rsinterface.children[19] = 17130;
        rsinterface.childX[19] = 0;
        rsinterface.childY[19] = 228;
    }

    private static void clanChatTab(TextDrawingArea[] tda) {
        RSInterface tab = addTabInterface(18128);
        addHoverButton(18129, "/Clan Chat/SPRITE", 6, 72, 32, "Join Clan", 550, 18130, 5);
        addHoveredButton(18130, "/Clan Chat/SPRITE", 7, 72, 32, 18131);
        addHoverButton(18132, "/Clan Chat/SPRITE", 6, 72, 32, "Clan Setup", -1, 18133, 5);
        addHoveredButton(18133, "/Clan Chat/SPRITE", 7, 72, 32, 18134);
        addText(18135, "Join Clan", tda, 0, 0xff9b00, true, true);
        addText(18136, "Clan Setup", tda, 0, 0xff9b00, true, true);
        addSprite(18137, 37, "/Clan Chat/SPRITE");
        addText(18138, "Clan Chat", tda, 1, 0xff9b00, true, true);
        addText(18139, "Talking in: Not in clan", tda, 0, 0xff9b00, false, true);
        addText(18140, "Owner: None", tda, 0, 0xff9b00, false, true);
        addSprite(16126, 4, "/Clan Chat/SPRITE");
        tab.totalChildren(13);
        tab.child(0, 16126, 0, 221);
        tab.child(1, 16126, 0, 59);
        tab.child(2, 18137, 0, 62);
        tab.child(3, 18143, 0, 62);
        tab.child(4, 18129, 15, 226);
        tab.child(5, 18130, 15, 226);
        tab.child(6, 18132, 103, 226);
        tab.child(7, 18133, 103, 226);
        tab.child(8, 18135, 51, 237);
        tab.child(9, 18136, 139, 237);
        tab.child(10, 18138, 95, 1);
        tab.child(11, 18139, 10, 23);
        tab.child(12, 18140, 25, 38);
        /* Text area */
        RSInterface list = addTabInterface(18143);
        list.totalChildren(100);
        for (int i = 18144; i <= 18244; i++) {
            addText(i, "", tda, 0, 0xffffff, false, true);
        }
        for (int id = 18144, i = 0; id <= 18243 && i <= 99; id++, i++) {
            interfaceCache[id].actions = new String[]{"Edit Rank", "Kick", "Ban"};
            list.children[i] = id;
            list.childX[i] = 5;
            for (int id2 = 18144, i2 = 1; id2 <= 18243 && i2 <= 99; id2++, i2++) {
                list.childY[0] = 2;
                list.childY[i2] = list.childY[i2 - 1] + 14;
            }
        }
        list.height = 158;
        list.width = 174;
        list.scrollMax = 1405;
    }
}