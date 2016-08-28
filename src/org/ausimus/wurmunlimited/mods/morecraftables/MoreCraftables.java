package org.ausimus.wurmunlimited.mods.morecraftables;
import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.combat.Armour;
import com.wurmonline.server.combat.Weapon;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modloader.interfaces.ItemTemplatesCreatedListener;
import org.gotti.wurmunlimited.modloader.interfaces.ServerStartedListener;
import org.gotti.wurmunlimited.modloader.interfaces.WurmServerMod;
import com.wurmonline.server.skills.SkillList;
import java.io.IOException;
import java.util.Properties;
import org.gotti.wurmunlimited.modloader.interfaces.Configurable;
public class MoreCraftables implements WurmServerMod, ServerStartedListener, Configurable, ItemTemplatesCreatedListener {
    //Mod Activation
    public boolean  CanCraftSOL;
    public boolean  CanCraftMasks;
    public boolean  CanCraftChallengeHelms;
    public boolean  CanCraftChallengeStatues;
    public boolean  CanCraftCrowns;
    public boolean  CanCraftMockArtifacts;
    public boolean  CanCraftEpicStructures;
    public boolean  CanCraftFancys;
    public boolean  CanCraftFireWorks;
    public boolean  CanCraftHoTAStatues;
    //Staff of Land
    public int      SOL_TemplateID;
    public float    SOL_CraftingDifficulty;
    public float    SOL_damage;
    public float    SOL_swingTimer;
    public float    SOL_critChance;
    public float    SOL_parryChance;
    public double   SOL_CRNurf;
    //Masks
    public int      MOC_TemplateID;
    public float    MOC_CraftingDifficulty;
    public int      MOE_TemplateID;
    public float    MOE_CraftingDifficulty;
    public int      MOR_TemplateID;
    public float    MOR_CraftingDifficulty;
    public int      MOS_TemplateID;
    public float    MOS_CraftingDifficulty;
    public int      MOReturner_TemplateID;
    public float    MOReturner_CraftingDifficulty;
    //Challenge Helms
    public int      HHOG_TemplateID;
    public float    HHOG_CraftingDifficulty;
    public int      PHOH_TemplateID;
    public float    PHOH_CraftingDifficulty;
    //Challenge Statues
    public int      CSG_TemplateID;
    public float    CSG_CraftingDifficulty;
    public int      CSS_TemplateID;
    public float    CSS_CraftingDifficulty;
    public int      CSB_TemplateID;
    public float    CSB_CraftingDifficulty;
    public int      CSM_TemplateID;
    public float    CSM_CraftingDifficulty;
    //Royal Crowns
    public int      JKC_TemplateID;
    public int      MRC_TemplateID;
    public int      BLC_TemplateID;
    public float    RC_CraftingDifficulty;
    //MockArtifacts
    public int      SOMA_TemplateID;
    public int      HOMA_TemplateID;
    public int      SOLA_TemplateID;
    public int      COMA_TemplateID;
    public int      SOAA_TemplateID;
    public float    Art_CraftingDifficulty;
    //EpicSttructures
    public int      NewPylon_TemplateID;
    public float    NewPylon_CraftingDifficulty;
    public int      NewObelisk_TemplateID;
    public float    NewObelisk_CraftingDifficulty;
    public int      NewShrine_TemplateID;
    public float    NewShrine_CraftingDifficulty;
    public int      NewSpiritGate_TemplateID;
    public float    NewSpiritGate_CraftingDifficulty;
    //SummerHat
    public int SummerHat_TemplateID;
    //Hota Statues
    public int      HOTA_DeerTemplateID;
    public int      HOTA_BearfightingBullTemplateID;
    public int      HOTA_DogFightingBoarTemplateID;
    public int      HOTA_FemaleFightingAnacondaTemplateID;
    public int      HOTA_LadyofTheLakeTemplateID;
    public int      HOTA_ManFightingBearTemplateID;
    public int      HOTA_NoGumpTemplateID;
    public int      HOTA_ScorpionTemplateID;
    public int      HOTA_SolDemonTemplateID;
    public int      HOTA_WolfFightingBisonTemplateID;
    public int      HOTA_DragonTemplateID;
    public float    HOTAStatue_CraftingDifficulty;

    @Override
    public void configure(Properties properties) {
        //Staff of Land
        SOL_TemplateID                  = Integer.parseInt(properties.getProperty       ("SOL_TemplateID",                  Integer.toString (SOL_TemplateID)));
        SOL_CraftingDifficulty          = Float.parseFloat(properties.getProperty       ("SOL_CraftingDifficulty",          Float.toString(SOL_CraftingDifficulty)));
        SOL_damage                      = Float.parseFloat(properties.getProperty       ("SOL_damage",                      Float.toString(SOL_damage)));
        SOL_swingTimer                  = Float.parseFloat(properties.getProperty       ("SOL_swingTimer",                  Float.toString(SOL_swingTimer)));
        SOL_critChance                  = Float.parseFloat(properties.getProperty       ("SOL_critChance",                  Float.toString(SOL_critChance)));
        SOL_parryChance                 = Float.parseFloat(properties.getProperty       ("SOL_parryChance",                 Float.toString(SOL_parryChance)));
        SOL_CRNurf                      = Double.parseDouble(properties.getProperty     ("SOL_CRNurf",                      Double.toString(SOL_CRNurf)));
        //Masks
        MOC_TemplateID                  = Integer.parseInt(properties.getProperty       ("MOC_TemplateID",                  Integer.toString (MOC_TemplateID)));
        MOC_CraftingDifficulty          = Float.parseFloat(properties.getProperty       ("MOC_CraftingDifficulty",          Float.toString(MOC_CraftingDifficulty)));
        MOR_TemplateID                  = Integer.parseInt(properties.getProperty       ("MOR_TemplateID",                  Integer.toString (MOR_TemplateID)));
        MOR_CraftingDifficulty          = Float.parseFloat(properties.getProperty       ("MOR_CraftingDifficulty",          Float.toString(MOR_CraftingDifficulty)));
        MOE_TemplateID                  = Integer.parseInt(properties.getProperty       ("MOE_TemplateID",                  Integer.toString (MOE_TemplateID)));
        MOE_CraftingDifficulty          = Float.parseFloat(properties.getProperty       ("MOE_CraftingDifficulty",          Float.toString(MOE_CraftingDifficulty)));
        MOS_TemplateID                  = Integer.parseInt(properties.getProperty       ("MOS_TemplateID",                  Integer.toString (MOS_TemplateID)));
        MOS_CraftingDifficulty          = Float.parseFloat(properties.getProperty       ("MOS_CraftingDifficulty",          Float.toString(MOS_CraftingDifficulty)));
        MOReturner_TemplateID           = Integer.parseInt(properties.getProperty       ("MOReturner_TemplateID",           Integer.toString (MOReturner_TemplateID)));
        MOReturner_CraftingDifficulty   = Float.parseFloat(properties.getProperty       ("MOReturner_CraftingDifficulty",   Float.toString(MOReturner_CraftingDifficulty)));
        //Horned Helm of Gold
        HHOG_TemplateID                 = Integer.parseInt(properties.getProperty       ("HHOG_TemplateID",                 Integer.toString (HHOG_TemplateID)));
        HHOG_CraftingDifficulty         = Float.parseFloat(properties.getProperty       ("HHOG_CraftingDifficulty",         Float.toString(HHOG_CraftingDifficulty)));
        //Plumed Helm of The Hunt
        PHOH_TemplateID                 = Integer.parseInt(properties.getProperty       ("PHOH_TemplateID",                 Integer.toString (PHOH_TemplateID)));
        PHOH_CraftingDifficulty         = Float.parseFloat(properties.getProperty       ("PHOH_CraftingDifficulty",         Float.toString(PHOH_CraftingDifficulty)));
        //Challenge Statues
        CSG_TemplateID                  = Integer.parseInt(properties.getProperty       ("CSG_TemplateID",                  Integer.toString (CSG_TemplateID)));
        CSG_CraftingDifficulty          = Float.parseFloat(properties.getProperty       ("CSG_CraftingDifficulty",          Float.toString(CSG_CraftingDifficulty)));
        CSS_TemplateID                  = Integer.parseInt(properties.getProperty       ("CSS_TemplateID",                  Integer.toString (CSS_TemplateID)));
        CSS_CraftingDifficulty          = Float.parseFloat(properties.getProperty       ("CSS_CraftingDifficulty",          Float.toString(CSS_CraftingDifficulty)));
        CSB_TemplateID                  = Integer.parseInt(properties.getProperty       ("CSB_TemplateID",                  Integer.toString (CSB_TemplateID)));
        CSB_CraftingDifficulty          = Float.parseFloat(properties.getProperty       ("CSB_CraftingDifficulty",          Float.toString(CSB_CraftingDifficulty)));
        CSM_TemplateID                  = Integer.parseInt(properties.getProperty       ("CSM_TemplateID",                  Integer.toString (CSM_TemplateID)));
        CSM_CraftingDifficulty          = Float.parseFloat(properties.getProperty       ("CSM_CraftingDifficulty",          Float.toString(CSM_CraftingDifficulty)));
        //Royal Crowns
        JKC_TemplateID                  = Integer.parseInt(properties.getProperty       ("JKC_TemplateID",                  Integer.toString (JKC_TemplateID)));
        MRC_TemplateID                  = Integer.parseInt(properties.getProperty       ("MRC_TemplateID",                  Integer.toString (MRC_TemplateID)));
        BLC_TemplateID                  = Integer.parseInt(properties.getProperty       ("BLC_TemplateID",                  Integer.toString (BLC_TemplateID)));
        RC_CraftingDifficulty           = Float.parseFloat(properties.getProperty       ("RC_CraftingDifficulty",           Float.toString(RC_CraftingDifficulty)));
        //MockArtifacts
        SOMA_TemplateID                 = Integer.parseInt(properties.getProperty       ("SOMA_TemplateID",                  Integer.toString (SOMA_TemplateID)));
        HOMA_TemplateID                 = Integer.parseInt(properties.getProperty       ("HOMA_TemplateID",                  Integer.toString (HOMA_TemplateID)));
        SOLA_TemplateID                 = Integer.parseInt(properties.getProperty       ("SOLA_TemplateID",                  Integer.toString (SOLA_TemplateID)));
        COMA_TemplateID                 = Integer.parseInt(properties.getProperty       ("COMA_TemplateID",                  Integer.toString (COMA_TemplateID)));
        SOAA_TemplateID                 = Integer.parseInt(properties.getProperty       ("SOAA_TemplateID",                  Integer.toString (SOAA_TemplateID)));
        SummerHat_TemplateID            = Integer.parseInt(properties.getProperty       ("SummerHat_TemplateID",             Integer.toString (SummerHat_TemplateID)));
        Art_CraftingDifficulty          = Float.parseFloat(properties.getProperty       ("Art_CraftingDifficulty",           Float.toString(Art_CraftingDifficulty)));

        //EpicStructures
        NewPylon_TemplateID                 = Integer.parseInt(properties.getProperty       ("NewPylon_TemplateID",                     Integer.toString (NewPylon_TemplateID)));
        NewPylon_CraftingDifficulty         = Float.parseFloat(properties.getProperty       ("NewPylon_CraftingDifficulty",             Float.toString(NewPylon_CraftingDifficulty)));
        NewObelisk_TemplateID               = Integer.parseInt(properties.getProperty       ("NewObelisk_TemplateID",                   Integer.toString (NewObelisk_TemplateID)));
        NewObelisk_CraftingDifficulty       = Float.parseFloat(properties.getProperty       ("NewObelisk_CraftingDifficulty",           Float.toString(NewObelisk_CraftingDifficulty)));
        NewShrine_TemplateID                = Integer.parseInt(properties.getProperty       ("NewShrine_TemplateID",                    Integer.toString (NewShrine_TemplateID)));
        NewShrine_CraftingDifficulty        = Float.parseFloat(properties.getProperty       ("NewShrine_CraftingDifficulty",            Float.toString(NewShrine_CraftingDifficulty)));
        NewSpiritGate_TemplateID            = Integer.parseInt(properties.getProperty       ("NewSpiritGate_TemplateID",                Integer.toString (NewSpiritGate_TemplateID)));
        NewSpiritGate_CraftingDifficulty    = Float.parseFloat(properties.getProperty       ("NewSpiritGate_CraftingDifficulty",        Float.toString(NewSpiritGate_CraftingDifficulty)));
        //Hota Statues
        HOTA_BearfightingBullTemplateID         = Integer.parseInt(properties.getProperty       ("HOTA_BearfightingBullTemplateID",                     Integer.toString    (HOTA_BearfightingBullTemplateID)));
        HOTA_DeerTemplateID                     = Integer.parseInt(properties.getProperty       ("HOTA_DeerTemplateID",                                 Integer.toString    (HOTA_DeerTemplateID)));
        HOTA_DogFightingBoarTemplateID          = Integer.parseInt(properties.getProperty       ("HOTA_DogFightingBoarTemplateID",                      Integer.toString    (HOTA_DogFightingBoarTemplateID)));
        HOTA_FemaleFightingAnacondaTemplateID   = Integer.parseInt(properties.getProperty       ("HOTA_FemaleFightingAnacondaTemplateID",               Integer.toString    (HOTA_FemaleFightingAnacondaTemplateID)));
        HOTA_LadyofTheLakeTemplateID            = Integer.parseInt(properties.getProperty       ("HOTA_LadyofTheLakeTemplateID",                        Integer.toString    (HOTA_LadyofTheLakeTemplateID)));
        HOTA_ManFightingBearTemplateID          = Integer.parseInt(properties.getProperty       ("HOTA_ManFightingBearTemplateID",                      Integer.toString    (HOTA_ManFightingBearTemplateID)));
        HOTA_NoGumpTemplateID                   = Integer.parseInt(properties.getProperty       ("HOTA_NoGumpTemplateID",                               Integer.toString    (HOTA_NoGumpTemplateID)));
        HOTA_ScorpionTemplateID                 = Integer.parseInt(properties.getProperty       ("HOTA_ScorpionTemplateID",                             Integer.toString    (HOTA_ScorpionTemplateID)));
        HOTA_SolDemonTemplateID                 = Integer.parseInt(properties.getProperty       ("HOTA_SolDemonTemplateID",                             Integer.toString    (HOTA_SolDemonTemplateID)));
        HOTA_WolfFightingBisonTemplateID        = Integer.parseInt(properties.getProperty       ("HOTA_WolfFightingBisonTemplateID",                    Integer.toString    (HOTA_WolfFightingBisonTemplateID)));
        HOTA_DragonTemplateID                   = Integer.parseInt(properties.getProperty       ("HOTA_DragonTemplateID",                               Integer.toString    (HOTA_DragonTemplateID)));
        HOTAStatue_CraftingDifficulty           = Float.parseFloat(properties.getProperty       ("HOTAStatue_CraftingDifficulty",                       Float.toString      (HOTAStatue_CraftingDifficulty)));

        //Main Mod Activation
        CanCraftSOL                     = Boolean.parseBoolean(properties.getProperty   ("CanCraftSOL",                     Boolean.toString(CanCraftSOL)));
        CanCraftMasks                   = Boolean.parseBoolean(properties.getProperty   ("CanCraftMasks",                   Boolean.toString(CanCraftMasks)));
        CanCraftChallengeHelms          = Boolean.parseBoolean(properties.getProperty   ("CanCraftChallengeHelms",          Boolean.toString(CanCraftChallengeHelms)));
        CanCraftChallengeStatues        = Boolean.parseBoolean(properties.getProperty   ("CanCraftChallengeStatues",        Boolean.toString(CanCraftChallengeStatues)));
        CanCraftCrowns                  = Boolean.parseBoolean(properties.getProperty   ("CanCraftCrowns",                  Boolean.toString(CanCraftCrowns)));
        CanCraftMockArtifacts           = Boolean.parseBoolean(properties.getProperty   ("CanCraftMockArtifacts",           Boolean.toString(CanCraftMockArtifacts)));
        CanCraftEpicStructures          = Boolean.parseBoolean(properties.getProperty   ("CanCraftEpicStructures",          Boolean.toString(CanCraftEpicStructures)));
        CanCraftFancys                  = Boolean.parseBoolean(properties.getProperty   ("CanCraftFancys",                  Boolean.toString(CanCraftFancys)));
        CanCraftFireWorks               = Boolean.parseBoolean(properties.getProperty   ("CanCraftFireWorks",               Boolean.toString(CanCraftFireWorks)));
        CanCraftHoTAStatues             = Boolean.parseBoolean(properties.getProperty   ("CanCraftHoTAStatues",             Boolean.toString(CanCraftHoTAStatues)));
    }
    @Override
    public void onItemTemplatesCreated() {
        try {
            //Staff of Land
            ItemTemplateCreator.createItemTemplate(SOL_TemplateID,          "staff of land", "staves", "fresh", "dry", "brittle", "rotten","A rare and masterfully crafted staff. The staff looks intimidating and though the finer detailing looks brittle at first, it is surprisingly strong and sharp.",
                    new short[]{44, 133, 22, 14, 37, 84}, (short) 646, (short) 1, 45, 9223372036854775807L, 3, 4, 150, 10090, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.weapon.staffOfLand.", SOL_CraftingDifficulty, 3000, (byte) 9, 10000, true);
            //Mask of the Challenger
            ItemTemplateCreator.createItemTemplate(MOC_TemplateID, 3,       "mask of the challenger", "masks", "excellent", "good", "ok", "poor","The expression of the mask is that of a predator daring anyone to challenge the wearer in combat.",
                    new short[]{108, 44, 22, 4}, (short)60, (short)1, 0, 9223372036854775807L, 1, 10, 20, -10, new byte[]{(byte)29}, "model.armour.head.mask.challenge.", MOC_CraftingDifficulty, 200, (byte)8, 10000, true, 0);
            //Mask of The Enlightened
            ItemTemplateCreator.createItemTemplate(MOE_TemplateID, 3,       "mask of the enlightened", "masks", "excellent", "good", "ok", "poor","At first glance the mask looks brittle, it is however surprisingly sturdy and the materials used are of the highest quality.",
                    new short[]{108, 44, 23, 4}, (short)60, (short)1, 0, 9223372036854775807L, 1, 10, 20, -10, new byte[]{(byte)29}, "model.armour.head.mask.enlightened.", MOE_CraftingDifficulty, 200, (byte)16, 10000, true, 0);
            //Mask of The Ravager
            ItemTemplateCreator.createItemTemplate(MOR_TemplateID, 3,       "mask of the ravager", "masks", "excellent", "good", "ok", "poor","Strikingly intricate leatherwork makes this mask stand out as rare and of high quality.",
                    new short[]{108, 44, 23, 4}, (short)60, (short)1, 0, 9223372036854775807L, 1, 10, 20, -10, new byte[]{(byte)29}, "model.armour.head.mask.ravager.", MOR_CraftingDifficulty, 200, (byte)16, 10000, true, 0);
            //Mask of The Shadow
            ItemTemplateCreator.createItemTemplate(MOS_TemplateID, 3,       "mask of the shadow", "masks", "excellent", "good", "ok", "poor","A dark mask concealing its wearers features.",
                    new short[]{108, 44, 23, 4}, (short)60, (short)1, 0, 9223372036854775807L, 1, 10, 20, -10, new byte[]{(byte)29}, "model.armour.head.mask.shadow.", MOS_CraftingDifficulty, 200, (byte)16, 10000, true, 0);
            //Mask of The Returner
            ItemTemplateCreator.createItemTemplate(MOReturner_TemplateID, 3,"mask of the returner", "masks", "excellent", "good", "ok", "poor","A mask.",
                    new short[]{108, 44, 23, 4}, (short) 60, (short) 1, 0, 9223372036854775807L, 1, 10, 20, -10, new byte[]{(byte) 29}, "model.armour.head.mask.returner.", MOReturner_CraftingDifficulty, 200, (byte) 16, 10000, true, 0);
            //Horned Helmet of Gold
            ItemTemplateCreator.createItemTemplate(HHOG_TemplateID, 3,      "horned helmet of gold", "horned helmets", "excellent", "good", "ok", "poor","A horned helmet that inspires respect. It looks dangerous, heavy and robust.",
                    new short[]{108, 44, 22, 4}, (short)968, (short)1, 0, 9223372036854775807L, 1, 10, 20, -10, new byte[]{(byte)1, (byte)28}, "model.armour.head.greathelmHornedOfGold.", HHOG_CraftingDifficulty, 1700, (byte)9, 10000, true, 4);
            //Plumed Helm of The Hunt
            ItemTemplateCreator.createItemTemplate(PHOH_TemplateID, 3,      "plumed helm of the hunt", "plumed helmets", "excellent", "good", "ok", "poor","An open-faced round-top helm.",
                    new short[]{108, 44, 22, 4}, (short)966, (short)1, 0, 3024000L, 1, 10, 20, -10, new byte[]{(byte)1, (byte)28}, "model.armour.head.openhelmplumedhunt.", PHOH_CraftingDifficulty, 1100, (byte)9, 10000, true, 4);
            //Challenge Statues
            ItemTemplateCreator.createItemTemplate(CSG_TemplateID,          "challenge statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish","The golden statue of challenges.", new short[]{108, 22, 51, 52, 176, 178, 44, 199}, (short) 60, (short) 1, 0, 9223372036854775807L, 20, 30, 160, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.challenge.", CSG_CraftingDifficulty, 6400, (byte) 7);
            ItemTemplateCreator.createItemTemplate(CSS_TemplateID,          "challenge statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish","The silver statue of challenges.", new short[]{108, 22, 51, 52, 176, 178, 44, 199}, (short) 60, (short) 1, 0, 9223372036854775807L, 20, 30, 160, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.challenge.", CSS_CraftingDifficulty, 6400, (byte) 8);
            ItemTemplateCreator.createItemTemplate(CSB_TemplateID,          "challenge statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish","The bronze statue of challenges.", new short[]{108, 22, 51, 52, 176, 44, 199}, (short) 60, (short) 1, 0, 9223372036854775807L, 20, 30, 160, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.challenge.", CSB_CraftingDifficulty, 6400, (byte) 31);
            ItemTemplateCreator.createItemTemplate(CSM_TemplateID,          "challenge statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish","The marble statue of challenges.", new short[]{108, 25, 51, 52, 176, 178, 44, 199}, (short) 60, (short) 1, 0, 9223372036854775807L, 20, 30, 160, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.challenge.", CSM_CraftingDifficulty, 6400, (byte)62);
            //JK Crown
            ItemTemplateCreator.createItemTemplate(JKC_TemplateID, 3,       "royal crown", "crowns", "excellent", "good", "ok", "poor", "A heavy gold crown covered in blue and green gems.",
                    new short[]{52, 22, 4, 44}, (short) 60, (short) 1, 0, 9223372036854775807L, 5, 20, 20, -10, new byte[]{(byte) 1, (byte) 28}, "model.decoration.crown." , RC_CraftingDifficulty, 1500, (byte) 7, 5000000, false, 10);
            //MR Crown
            ItemTemplateCreator.createItemTemplate(MRC_TemplateID, 3,       "circlet", "circlets", "excellent", "good", "ok", "poor", "A simple yet stunningly fashionable silver circlet.",
                    new short[]{52, 22, 4, 44}, (short) 60, (short) 1, 0, 9223372036854775807L, 5, 20, 20, -10, new byte[]{(byte) 1, (byte) 28}, "model.decoration.crown.", RC_CraftingDifficulty, 1500, (byte) 8, 5000000, false, 10);
            //HoTS Crown
            ItemTemplateCreator.createItemTemplate(BLC_TemplateID, 3,       "cage crown", "crowns", "excellent", "good", "ok", "poor", "A crown in the form of an egg made from steel bands that cage the head of the wearer.",
                    new short[]{52, 22, 4, 44}, (short) 60, (short) 1, 0, 9223372036854775807L, 5, 20, 20, -10, new byte[]{(byte) 1, (byte) 28}, "model.decoration.crown.", RC_CraftingDifficulty, 1500, (byte) 9, 5000000, false, 10);
            //Mock Sword of Magranon
            ItemTemplateCreator.createItemTemplate(SOMA_TemplateID, "Sword of Magranon", "swords of magranon", "excellent", "good", "ok", "poor", "A heavy two-handed sword of incredible quality made from steel and with a comfortable hilt of leather bound silver filigran. ",
                    new short[]{52, 37, 2, 84, 16, 44, 133, 22}, (short) 1319, (short) 35, 70, 9223372036854775807L, 5, 10, 180, 10028, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.artifact.swordtwo.", Art_CraftingDifficulty, 4000, (byte) 9, 3000000, false);
            //Mock Hammer of Magranon
            ItemTemplateCreator.createItemTemplate(HOMA_TemplateID, "Hammer of Magranon", "hammers of magranon", "excellent", "good", "ok", "poor", "A huge brutal warhammer made totally from bronze.",
                    new short[]{52, 37, 14, 44, 133, 22}, (short)1339, (short)35, 80, 9223372036854775807L, 5, 10, 80, 10070, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.artifact.hammerhuge.", Art_CraftingDifficulty, 5000, (byte)31, 3000000, false);
            //Mock Scale of Libila
            ItemTemplateCreator.createItemTemplate(SOLA_TemplateID, "Scale of Libila", "scales of libila", "excellent", "good", "ok", "poor", "This looks somewhat like a huge black leaf, except that it is made from dark shiny iron.",
                    new short[]{52, 3, 44, 22}, (short)839, (short)35, 0, 9223372036854775807L, 1, 25, 45, 10006, new byte[]{(byte)3, (byte)44}, "model.artifact.scale.", Art_CraftingDifficulty, 3000, (byte)11, 3000000, false);
            //Mock Crown of Might
            ItemTemplateCreator.createItemTemplate(COMA_TemplateID, 3, "Crown of Might", "crowns of might", "excellent", "good", "ok", "poor", "A thick heavy gold crown covered in green and red gems.",
                    new short[]{52, 22, 4, 44}, (short) 974, (short) 35, 0, 9223372036854775807L, 5, 20, 20, -10, new byte[]{(byte) 1, (byte) 28}, "model.artifact.crownmight.", Art_CraftingDifficulty, 1500, (byte) 7, 5000000, false, 10);
            //Mock Sceptre of Ascension
            ItemTemplateCreator.createItemTemplate(SOAA_TemplateID, "Sceptre of Ascension", "sceptres of ascension", "excellent", "good", "ok", "poor", "A large bulky sceptre, made from shiny white steel with black steel thorns attached to the head.",
                    new short[]{52, 37, 14, 44, 133, 22, 84}, (short) 1279, (short) 35, 80, 9223372036854775807L, 5, 5, 60, 10061, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.artifact.sceptreascension.", Art_CraftingDifficulty, 5000, (byte) 9, 5000000, false);
            //Epic Structures
            ItemTemplateCreator.createItemTemplate(NewPylon_TemplateID, "pylon", "pylons", "excellent", "good", "ok", "poor", "This monumental structure is said to represent two hills between which the sun rises and sets. It is commonly associated with recreation and birth.",
                    new short[]{25, 31, 52, 44, 67, 109, 178, 123, 195, 194}, (short)60, (short)1, 0, 9223372036854775807L, 300, 500, 1500, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.pylon.", NewPylon_CraftingDifficulty, 2000000, (byte)15, 10000, false);
            ItemTemplateCreator.createItemTemplate(NewObelisk_TemplateID, "obelisk", "obelisk", "excellent", "good", "ok", "poor", "A large obelisk. These monuments represent the sun.",
                    new short[]{25, 31, 52, 44, 67, 109, 178, 194, 123, 195}, (short) 60, (short) 1, 0, 9223372036854775807L, 100, 100, 1000, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.obelisque.", NewObelisk_CraftingDifficulty, 1500000, (byte) 15, 10000, false);
            ItemTemplateCreator.createItemTemplate(NewShrine_TemplateID, "shrine", "shrine", "excellent", "good", "ok", "poor", "A small shrine for worshipping spirits, large enough to enter but not much more.",
                    new short[]{31, 52, 44, 67, 98, 194, 109, 123}, (short)60, (short)1, 0, 9223372036854775807L, 400, 400, 400, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.shrine.", NewShrine_CraftingDifficulty, 1500000, (byte)0, 10000, false);
            ItemTemplateCreator.createItemTemplate(NewSpiritGate_TemplateID, "spirit gate", "spirit gate", "excellent", "good", "ok", "poor", "These spirit gates marks the transition between the normal world and the sacred. They are usually placed near the entrance to shrines.",
                    new short[]{49, 31, 52, 44, 67, 109, 195, 194, 178}, (short)60, (short)1, 0, 9223372036854775807L, 100, 400, 500, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.spiritgate.", NewSpiritGate_CraftingDifficulty, 500000, (byte)0, 10000, false);
            //SummerHat
            ItemTemplateCreator.createItemTemplate(SummerHat_TemplateID, 3, "summer hat", "hats", "excellent", "good", "ok", "poor", "A beautiful hat, glistening in the sun. It is made from a strange green fabric and decorated with flowers that never seem to wither.",
                    new short[]{24, 4, 44}, (short) 973, (short) 1, 0, 9223372036854775807L, 5, 20, 20, -10, new byte[]{(byte) 1}, "model.armour.summerhat.", Art_CraftingDifficulty, 300, (byte) 8, 5000000, true, 9);
            //Hota Statues
            //Deer
            ItemTemplateCreator.createItemTemplate(HOTA_DeerTemplateID, "Deer hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short)60, (short)1, 0, 12096000L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.deer.", HOTAStatue_CraftingDifficulty, 150000, (byte)7);
            //Bear fighting Pig
            ItemTemplateCreator.createItemTemplate(HOTA_BearfightingBullTemplateID, "Bear and Bull hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short)60, (short)1, 0, 12096000L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.bearfightingbull.", HOTAStatue_CraftingDifficulty, 150000, (byte)7);
            //Dog Fighting Boar
            ItemTemplateCreator.createItemTemplate(HOTA_DogFightingBoarTemplateID, "Dog and Pig hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short)60, (short)1, 0, 12096000L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.dogsfightingboar.", HOTAStatue_CraftingDifficulty, 150000, (byte)7);
            //Female Fighting Snake
            ItemTemplateCreator.createItemTemplate(HOTA_FemaleFightingAnacondaTemplateID, "Woman and Snake hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short)60, (short)1, 0, 12096000L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.femalefightinganaconda.", HOTAStatue_CraftingDifficulty, 150000, (byte)7);
            //Lady of The Lake
            ItemTemplateCreator.createItemTemplate(HOTA_LadyofTheLakeTemplateID, "Lady of The Lake hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short)60, (short)1, 0, 12096000L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.ladylake.", HOTAStatue_CraftingDifficulty, 150000, (byte)7);
            //Man Fights Bear
            ItemTemplateCreator.createItemTemplate(HOTA_ManFightingBearTemplateID, "Man and Bear hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short)60, (short)1, 0, 12096000L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.manfightingbear.", HOTAStatue_CraftingDifficulty, 150000, (byte)7);
            //NoGump
            ItemTemplateCreator.createItemTemplate(HOTA_NoGumpTemplateID, "Nogump hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short)60, (short)1, 0, 12096000L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.nogump.", HOTAStatue_CraftingDifficulty, 150000, (byte)7);
            //Scorpion
            ItemTemplateCreator.createItemTemplate(HOTA_ScorpionTemplateID, "Scorpion hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short)60, (short)1, 0, 12096000L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.scorpion.", HOTAStatue_CraftingDifficulty, 150000, (byte)7);
            //Sol Demon
            ItemTemplateCreator.createItemTemplate(HOTA_SolDemonTemplateID, "Sol Demon hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short)60, (short)1, 0, 12096000L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.soldemon.", HOTAStatue_CraftingDifficulty, 150000, (byte)7);
            //Wolf Fights Bison
            ItemTemplateCreator.createItemTemplate(HOTA_WolfFightingBisonTemplateID, "Wolf and Bison hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short)60, (short)1, 0, 12096000L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.wolffightingbison.", HOTAStatue_CraftingDifficulty, 150000, (byte)7);
            //Black Dragon
            ItemTemplateCreator.createItemTemplate(HOTA_DragonTemplateID, "Dragon hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short)60, (short)1, 0, 12096000L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.blackdragon.", HOTAStatue_CraftingDifficulty, 150000, (byte)7);
        } catch (IOException ignored) {
        }
    }
    @Override
    public void onServerStarted() {
        //Staff of Land
        if (CanCraftSOL)
        {
            CreationEntryCreator.createSimpleEntry(SkillList.GROUP_SMITHING_WEAPONSMITHING, ItemList.steelBar, ItemList.staffSteel, SOL_TemplateID, true, true, 0.0f, false, false, CreationCategories.WEAPONS);
            new Weapon(SOL_TemplateID, SOL_damage, SOL_swingTimer, SOL_critChance, 3, 3, SOL_parryChance, SOL_CRNurf);
        }
        if (CanCraftMasks) {
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_GOLDSMITHING, ItemList.anvilLarge, ItemList.silverBar, MOC_TemplateID, false, true, 0.0f, false, false, CreationCategories.CLOTHES);
            CreationEntryCreator.createSimpleEntry(SkillList.LEATHERWORKING,        ItemList.needleIron, ItemList.leather, MOE_TemplateID, false, true, 0.0f, false, false, CreationCategories.CLOTHES);
            CreationEntryCreator.createSimpleEntry(SkillList.LEATHERWORKING,        ItemList.needleIron, ItemList.leather, MOR_TemplateID, false, true, 0.0f, false, false, CreationCategories.CLOTHES);
            CreationEntryCreator.createSimpleEntry(SkillList.LEATHERWORKING,        ItemList.needleIron, ItemList.leather, MOS_TemplateID, false, true, 0.0f, false, false, CreationCategories.CLOTHES);
            CreationEntryCreator.createSimpleEntry(SkillList.LEATHERWORKING,        ItemList.needleIron, ItemList.leather, MOReturner_TemplateID, false, true, 0.0f, false, false, CreationCategories.CLOTHES);
        }
        if (CanCraftChallengeHelms)
        {
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_ARMOUR_PLATE, ItemList.anvilLarge, ItemList.steelBar, HHOG_TemplateID, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
            new Armour(HHOG_TemplateID, 0.09F, -0.3F);
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_ARMOUR_PLATE, ItemList.anvilLarge, ItemList.steelBar, PHOH_TemplateID, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
            new Armour(PHOH_TemplateID, 0.09F, -0.3F);
        }
        if (CanCraftChallengeStatues)
        {
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_GOLDSMITHING, ItemList.anvilLarge,    ItemList.goldBar,       CSG_TemplateID, false, true, 0.0f, false, true, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_GOLDSMITHING, ItemList.anvilLarge,    ItemList.silverBar,     CSS_TemplateID, false, true, 0.0f, false, true, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_GOLDSMITHING, ItemList.anvilLarge,    ItemList.bronzeBar,     CSB_TemplateID, false, true, 0.0f, false, true, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING,          ItemList.stoneChisel,   ItemList.marbleShard,   CSM_TemplateID, false, true, 0.0f, false, true, CreationCategories.STATUES);
        }
        if (CanCraftCrowns)
        {
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_GOLDSMITHING, ItemList.anvilLarge, ItemList.goldBar, JKC_TemplateID, false, true, 0.0f, false, false, CreationCategories.JEWELRY);
            new Armour(JKC_TemplateID, 0.001F, 0.3F);
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_GOLDSMITHING, ItemList.anvilLarge, ItemList.silverBar, MRC_TemplateID, false, true, 0.0f, false, false, CreationCategories.JEWELRY);
            new Armour(MRC_TemplateID, 0.001F, 0.3F);
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_GOLDSMITHING, ItemList.anvilLarge, ItemList.steelBar, BLC_TemplateID, false, true, 0.0f, false, false, CreationCategories.JEWELRY);
            new Armour(BLC_TemplateID, 0.001F, 0.3F);
        }
        if (CanCraftMockArtifacts)
        {
            CreationEntryCreator.createSimpleEntry(SkillList.GROUP_SMITHING_WEAPONSMITHING, ItemList.woodenHandleSword, ItemList.swordBladeTwoHanded, SOMA_TemplateID, true, true, 0.0f, false, false, CreationCategories.WEAPONS);
            new Weapon(SOMA_TemplateID, 15.0F, 5.0F, 0.08F, 4, 3, 1.0F, 0.0D);
            CreationEntryCreator.createSimpleEntry(SkillList.GROUP_SMITHING_WEAPONSMITHING, ItemList.shaft, ItemList.maulHeadLarge, HOMA_TemplateID, true, true, 0.0f, false, false, CreationCategories.WEAPONS);
            new Weapon(HOMA_TemplateID, 18.0F, 6.0F, 0.08F, 4, 4, 1.0F, 0.0D);
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_SHIELDS, ItemList.anvilLarge, ItemList.ironBar, SOLA_TemplateID, false, true, 0.0f, false, false, CreationCategories.SHIELDS);
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_GOLDSMITHING, ItemList.anvilLarge, ItemList.goldBar, COMA_TemplateID, false, true, 0.0f, false, false, CreationCategories.JEWELRY);
            new Armour(COMA_TemplateID, 0.009F, 0.3F);
            CreationEntryCreator.createSimpleEntry(SkillList.GROUP_SMITHING_WEAPONSMITHING, ItemList.anvilLarge, ItemList.steelBar, SOAA_TemplateID, false, true, 0.0f, false, false, CreationCategories.WEAPONS);
            new Weapon(SOAA_TemplateID, 18.0F, 6.0F, 0.08F, 4, 4, 1.0F, 0.0D);
        }
        if (CanCraftEpicStructures)
        {
            //Pylon
            AdvancedCreationEntry pylon = CreationEntryCreator.createAdvancedEntry(1013, 406, 130, NewPylon_TemplateID, false, false, 0.0F, true, true, CreationCategories.EPIC);
            pylon.addRequirement(new CreationRequirement(1, 406, 100, true));
            pylon.addRequirement(new CreationRequirement(2, 130, 1999, true));
            pylon.addRequirement(new CreationRequirement(3, 132, 1000, true));
            pylon.addRequirement(new CreationRequirement(4, 221, 1000, true));
            //Obelisk
            AdvancedCreationEntry obelisk = CreationEntryCreator.createAdvancedEntry(1013, 132, 130, NewObelisk_TemplateID, false, false, 0.0F, true, true, CreationCategories.EPIC);
            obelisk.addRequirement(new CreationRequirement(1, 132, 1000, true));
            obelisk.addRequirement(new CreationRequirement(2, 130, 1000, true));
            obelisk.addRequirement(new CreationRequirement(3, 223, 100, true));
            //Shrine
            AdvancedCreationEntry shrine = CreationEntryCreator.createAdvancedEntry(1005, 406, 130, NewShrine_TemplateID, false, false, 0.0F, true, true, CreationCategories.EPIC);
            shrine.addRequirement(new CreationRequirement(1, 406, 10, true));
            shrine.addRequirement(new CreationRequirement(2, 22, 100, true));
            shrine.addRequirement(new CreationRequirement(3, 218, 10, true));
            shrine.addRequirement(new CreationRequirement(4, 221, 100, true));
            shrine.addRequirement(new CreationRequirement(5, 502, 10, true));
            //SpiritGate
            AdvancedCreationEntry spiritgate = CreationEntryCreator.createAdvancedEntry(1013, 132, 130, NewSpiritGate_TemplateID, false, false, 0.0F, true, true, CreationCategories.EPIC);
            spiritgate.addRequirement(new CreationRequirement(1, 132, 1000, true));
            spiritgate.addRequirement(new CreationRequirement(2, 130, 1000, true));
            spiritgate.addRequirement(new CreationRequirement(3, 44, 1000, true));
        }
        if (CanCraftFancys)
        {
            CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, SummerHat_TemplateID, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
            new Armour(SummerHat_TemplateID, 0.001F, 0.3F);
            CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, ItemList.tent, false, true, 0.0f, false, false, CreationCategories.TENTS);
            CreationEntryCreator.createSimpleEntry(SkillList.GARDENING, ItemList.flowerpotPottery, ItemList.flowerRose, ItemList.valentines, true, true, 0.0f, false, false, CreationCategories.DECORATION);
            CreationEntryCreator.createSimpleEntry(SkillList.DIGGING, ItemList.shovel, ItemList.emeraldStar, ItemList.wandSculpting, true, true, 0.0f, false, false, CreationCategories.MAGIC);
            CreationEntryCreator.createSimpleEntry(SkillList.DIGGING, ItemList.shovel, ItemList.rubyStar, ItemList.wandSculpting, true, true, 0.0f, false, false, CreationCategories.MAGIC);
            CreationEntryCreator.createSimpleEntry(SkillList.DIGGING, ItemList.shovel, ItemList.sapphireStar, ItemList.wandSculpting, true, true, 0.0f, false, false, CreationCategories.MAGIC);
            CreationEntryCreator.createSimpleEntry(SkillList.DIGGING, ItemList.shovel, ItemList.diamondStar, ItemList.wandSculpting, true, true, 0.0f, false, false, CreationCategories.MAGIC);
            CreationEntryCreator.createSimpleEntry(SkillList.DIGGING, ItemList.shovel, ItemList.opalBlack, ItemList.wandSculpting, true, true, 0.0f, false, false, CreationCategories.MAGIC);
            CreationEntryCreator.createSimpleEntry(SkillList.LEATHERWORKING, ItemList.skinWater, ItemList.dragonScale, ItemList.bagKeeping, true, true, 0.0f, false, false, CreationCategories.CONTAINER);
        }
        if(CanCraftFireWorks)
        {
            CreationEntryCreator.createSimpleEntry(SkillList.ALCHEMY_NATURAL, ItemList.charcoal, ItemList.sourceSalt, ItemList.fireworks, true, true, 0.0f, false, false, CreationCategories.MAGIC);
        }
        if (CanCraftHoTAStatues)
        {
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, HOTA_DeerTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, HOTA_BearfightingBullTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, HOTA_DogFightingBoarTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, HOTA_FemaleFightingAnacondaTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, HOTA_LadyofTheLakeTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, HOTA_ManFightingBearTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, HOTA_NoGumpTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, HOTA_ScorpionTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, HOTA_SolDemonTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, HOTA_WolfFightingBisonTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, HOTA_DragonTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
        }
    }
}