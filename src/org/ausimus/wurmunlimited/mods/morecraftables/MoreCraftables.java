package org.ausimus.wurmunlimited.mods.morecraftables;
import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.combat.Armour;
import com.wurmonline.server.combat.Weapon;
import com.wurmonline.server.items.*;
import com.wurmonline.server.kingdom.Kingdoms;
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
        MOR_CraftingDifficulty          = Float.parseFloat(properties.getProperty       ("MOR_CraftingDifficulty", Float.toString(MOR_CraftingDifficulty)));
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
        RC_CraftingDifficulty           = Float.parseFloat(properties.getProperty       ("RC_CraftingDifficulty",          Float.toString(RC_CraftingDifficulty)));
        //Main Mod Activation
        CanCraftSOL                     = Boolean.parseBoolean(properties.getProperty   ("CanCraftSOL",                     Boolean.toString(CanCraftSOL)));
        CanCraftMasks                   = Boolean.parseBoolean(properties.getProperty   ("CanCraftMasks",                   Boolean.toString(CanCraftMasks)));
        CanCraftChallengeHelms          = Boolean.parseBoolean(properties.getProperty   ("CanCraftChallengeHelms",          Boolean.toString(CanCraftChallengeHelms)));
        CanCraftChallengeStatues        = Boolean.parseBoolean(properties.getProperty   ("CanCraftChallengeStatues",        Boolean.toString(CanCraftChallengeStatues)));
        CanCraftCrowns                  = Boolean.parseBoolean(properties.getProperty   ("CanCraftCrowns",                  Boolean.toString(CanCraftCrowns)));
    }
	@Override
	public void onItemTemplatesCreated() {
		try {
            //Staff of Land
            ItemTemplateCreator.createItemTemplate(SOL_TemplateID,          "staff of land", "staves", "fresh", "dry", "brittle", "rotten","A rare and masterfully crafted staff. The staff looks intimidating and though the finer detailing looks brittle at first, it is surprisingly strong and sharp.",
                            new short[]{44, 133, 22, 14, 37, 84, 129}, (short) 646, (short) 1, 45, 9223372036854775807L, 3, 4, 150, 10090, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.weapon.staffOfLand.", SOL_CraftingDifficulty, 3000, (byte) 9, 10000, true);
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
        }catch(IOException ignored){
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
    }
}