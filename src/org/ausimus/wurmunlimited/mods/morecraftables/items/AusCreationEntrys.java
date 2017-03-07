package org.ausimus.wurmunlimited.mods.morecraftables.items;

import com.wurmonline.server.combat.Armour;
import com.wurmonline.server.combat.Weapon;
import com.wurmonline.server.items.*;
import com.wurmonline.server.skills.SkillList;
import org.ausimus.wurmunlimited.mods.morecraftables.configurator.Constants;
public class AusCreationEntrys {
    public AusCreationEntrys() {
        //Staff of Land
        if (Constants.CanCraftSOL) {
            CreationEntryCreator.createSimpleEntry(SkillList.GROUP_SMITHING_WEAPONSMITHING, ItemList.steelBar, ItemList.staffSteel, Constants.SOL_TemplateID, true, true, 0.0f, false, false, CreationCategories.WEAPONS);
            new Weapon(Constants.SOL_TemplateID, Constants.SOL_damage, Constants.SOL_swingTimer, Constants.SOL_critChance, 3, 3, Constants.SOL_parryChance, Constants.SOL_CRNurf);
        }
        if (Constants.CanCraftMasks) {
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_GOLDSMITHING, ItemList.anvilLarge, ItemList.silverBar, Constants.MOC_TemplateID, false, true, 0.0f, false, false, CreationCategories.CLOTHES);
            CreationEntryCreator.createSimpleEntry(SkillList.LEATHERWORKING, ItemList.needleIron, ItemList.leather, Constants.MOE_TemplateID, false, true, 0.0f, false, false, CreationCategories.CLOTHES);
            CreationEntryCreator.createSimpleEntry(SkillList.LEATHERWORKING, ItemList.needleIron, ItemList.leather, Constants.MOR_TemplateID, false, true, 0.0f, false, false, CreationCategories.CLOTHES);
            CreationEntryCreator.createSimpleEntry(SkillList.LEATHERWORKING, ItemList.needleIron, ItemList.leather, Constants.MOS_TemplateID, false, true, 0.0f, false, false, CreationCategories.CLOTHES);
            CreationEntryCreator.createSimpleEntry(SkillList.LEATHERWORKING, ItemList.needleIron, ItemList.leather, Constants.MOReturner_TemplateID, false, true, 0.0f, false, false, CreationCategories.CLOTHES);
        }
        if (Constants.CanCraftChallengeHelms) {
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_ARMOUR_PLATE, ItemList.anvilLarge, ItemList.steelBar, Constants.HHOG_TemplateID, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
            new Armour(Constants.HHOG_TemplateID, 0.09F, -0.3F);
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_ARMOUR_PLATE, ItemList.anvilLarge, ItemList.steelBar, Constants.PHOH_TemplateID, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
            new Armour(Constants.PHOH_TemplateID, 0.09F, -0.3F);
        }
        if (Constants.CanCraftChallengeStatues) {
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_GOLDSMITHING, ItemList.anvilLarge, ItemList.goldBar, Constants.CSG_TemplateID, false, true, 0.0f, false, true, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_GOLDSMITHING, ItemList.anvilLarge, ItemList.silverBar, Constants.CSS_TemplateID, false, true, 0.0f, false, true, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_GOLDSMITHING, ItemList.anvilLarge, ItemList.bronzeBar, Constants.CSB_TemplateID, false, true, 0.0f, false, true, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.marbleShard, Constants.CSM_TemplateID, false, true, 0.0f, false, true, CreationCategories.STATUES);
        }
        if (Constants.CanCraftCrowns) {
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_GOLDSMITHING, ItemList.anvilLarge, ItemList.goldBar, Constants.JKC_TemplateID, false, true, 0.0f, false, false, CreationCategories.JEWELRY);
            new Armour(Constants.JKC_TemplateID, 0.001F, 0.3F);
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_GOLDSMITHING, ItemList.anvilLarge, ItemList.silverBar, Constants.MRC_TemplateID, false, true, 0.0f, false, false, CreationCategories.JEWELRY);
            new Armour(Constants.MRC_TemplateID, 0.001F, 0.3F);
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_GOLDSMITHING, ItemList.anvilLarge, ItemList.steelBar, Constants.BLC_TemplateID, false, true, 0.0f, false, false, CreationCategories.JEWELRY);
            new Armour(Constants.BLC_TemplateID, 0.001F, 0.3F);
        }
        if (Constants.CanCraftMockArtifacts) {
            CreationEntryCreator.createSimpleEntry(SkillList.GROUP_SMITHING_WEAPONSMITHING, ItemList.woodenHandleSword, ItemList.swordBladeTwoHanded, Constants.SOMA_TemplateID, true, true, 0.0f, false, false, CreationCategories.WEAPONS);
            new Weapon(Constants.SOMA_TemplateID, 15.0F, 5.0F, 0.08F, 4, 3, 1.0F, 0.0D);
            CreationEntryCreator.createSimpleEntry(SkillList.GROUP_SMITHING_WEAPONSMITHING, ItemList.shaft, ItemList.maulHeadLarge, Constants.HOMA_TemplateID, true, true, 0.0f, false, false, CreationCategories.WEAPONS);
            new Weapon(Constants.HOMA_TemplateID, 18.0F, 6.0F, 0.08F, 4, 4, 1.0F, 0.0D);
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_SHIELDS, ItemList.anvilLarge, ItemList.ironBar, Constants.SOLA_TemplateID, false, true, 0.0f, false, false, CreationCategories.SHIELDS);
            CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_GOLDSMITHING, ItemList.anvilLarge, ItemList.goldBar, Constants.COMA_TemplateID, false, true, 0.0f, false, false, CreationCategories.JEWELRY);
            new Armour(Constants.COMA_TemplateID, 0.009F, 0.3F);
            CreationEntryCreator.createSimpleEntry(SkillList.GROUP_SMITHING_WEAPONSMITHING, ItemList.anvilLarge, ItemList.steelBar, Constants.SOAA_TemplateID, false, true, 0.0f, false, false, CreationCategories.WEAPONS);
            new Weapon(Constants.SOAA_TemplateID, 18.0F, 6.0F, 0.08F, 4, 4, 1.0F, 0.0D);
        }
        if (Constants.CanCraftEpicStructures) {
            //Pylon
            AdvancedCreationEntry pylon = CreationEntryCreator.createAdvancedEntry(1013, 406, 130, Constants.NewPylon_TemplateID, false, false, 0.0F, true, true, CreationCategories.EPIC);
            pylon.addRequirement(new CreationRequirement(1, 406, 100, true));
            pylon.addRequirement(new CreationRequirement(2, 130, 1999, true));
            pylon.addRequirement(new CreationRequirement(3, 132, 1000, true));
            pylon.addRequirement(new CreationRequirement(4, 221, 1000, true));
            //Obelisk
            AdvancedCreationEntry obelisk = CreationEntryCreator.createAdvancedEntry(1013, 132, 130, Constants.NewObelisk_TemplateID, false, false, 0.0F, true, true, CreationCategories.EPIC);
            obelisk.addRequirement(new CreationRequirement(1, 132, 1000, true));
            obelisk.addRequirement(new CreationRequirement(2, 130, 1000, true));
            obelisk.addRequirement(new CreationRequirement(3, 223, 100, true));
            //Shrine
            AdvancedCreationEntry shrine = CreationEntryCreator.createAdvancedEntry(1005, 406, 130, Constants.NewShrine_TemplateID, false, false, 0.0F, true, true, CreationCategories.EPIC);
            shrine.addRequirement(new CreationRequirement(1, 406, 10, true));
            shrine.addRequirement(new CreationRequirement(2, 22, 100, true));
            shrine.addRequirement(new CreationRequirement(3, 218, 10, true));
            shrine.addRequirement(new CreationRequirement(4, 221, 100, true));
            shrine.addRequirement(new CreationRequirement(5, 502, 10, true));
            //SpiritGate
            AdvancedCreationEntry spiritgate = CreationEntryCreator.createAdvancedEntry(1013, 132, 130, Constants.NewSpiritGate_TemplateID, false, false, 0.0F, true, true, CreationCategories.EPIC);
            spiritgate.addRequirement(new CreationRequirement(1, 132, 1000, true));
            spiritgate.addRequirement(new CreationRequirement(2, 130, 1000, true));
            spiritgate.addRequirement(new CreationRequirement(3, 44, 1000, true));
        }
        if (Constants.CanCraftFancys) {
            CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.SummerHat_TemplateID, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
            new Armour(Constants.SummerHat_TemplateID, 0.001F, 0.3F);
            CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, ItemList.tent, false, true, 0.0f, false, false, CreationCategories.TENTS);
            CreationEntryCreator.createSimpleEntry(SkillList.GARDENING, ItemList.flowerpotPottery, ItemList.flowerRose, ItemList.valentines, true, true, 0.0f, false, false, CreationCategories.DECORATION);
            CreationEntryCreator.createSimpleEntry(SkillList.DIGGING, ItemList.shovel, ItemList.emeraldStar, ItemList.wandSculpting, true, true, 0.0f, false, false, CreationCategories.MAGIC);
            CreationEntryCreator.createSimpleEntry(SkillList.DIGGING, ItemList.shovel, ItemList.rubyStar, ItemList.wandSculpting, true, true, 0.0f, false, false, CreationCategories.MAGIC);
            CreationEntryCreator.createSimpleEntry(SkillList.DIGGING, ItemList.shovel, ItemList.sapphireStar, ItemList.wandSculpting, true, true, 0.0f, false, false, CreationCategories.MAGIC);
            CreationEntryCreator.createSimpleEntry(SkillList.DIGGING, ItemList.shovel, ItemList.diamondStar, ItemList.wandSculpting, true, true, 0.0f, false, false, CreationCategories.MAGIC);
            CreationEntryCreator.createSimpleEntry(SkillList.DIGGING, ItemList.shovel, ItemList.opalBlack, ItemList.wandSculpting, true, true, 0.0f, false, false, CreationCategories.MAGIC);
            AdvancedCreationEntry BOK = CreationEntryCreator.createAdvancedEntry(SkillList.LEATHERWORKING, ItemList.skinWater, ItemList.dragonScale, ItemList.bagKeeping, true, false, 0.0F, false, false, CreationCategories.CONTAINER);
            BOK.addRequirement(new CreationRequirement(1, ItemList.blood, 1, true));
            CreationEntryCreator.createSimpleEntry(SkillList.MASONRY, ItemList.stoneChisel, ItemList.rock, Constants.GardenGnomeTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.MASONRY, ItemList.stoneChisel, ItemList.rock, Constants.GardenGnomeGreenTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
        }
        if (Constants.CanCraftFireWorks) {
            CreationEntryCreator.createSimpleEntry(SkillList.ALCHEMY_NATURAL, ItemList.charcoal, ItemList.sourceSalt, ItemList.fireworks, true, true, 0.0f, false, false, CreationCategories.MAGIC);
        }
        if (Constants.CanCraftHoTAStatues) {
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, Constants.HOTA_DeerTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, Constants.HOTA_BearfightingBullTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, Constants.HOTA_DogFightingBoarTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, Constants.HOTA_FemaleFightingAnacondaTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, Constants.HOTA_LadyofTheLakeTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, Constants.HOTA_ManFightingBearTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, Constants.HOTA_NoGumpTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, Constants.HOTA_ScorpionTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, Constants.HOTA_SolDemonTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, Constants.HOTA_WolfFightingBisonTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
            CreationEntryCreator.createSimpleEntry(SkillList.STONECUTTING, ItemList.stoneChisel, ItemList.rock, Constants.HOTA_DragonTemplateID, false, true, 0.0f, false, false, CreationCategories.STATUES);
        }
        if (Constants.CanCraftConstructionMaterials) {
            CreationEntryCreator.createSimpleEntry(SkillList.MASONRY, ItemList.rock, ItemList.clay, ItemList.concrete, true, true, 0.0f, false, false, CreationCategories.CONSTRUCTION_MATERIAL);
        }
        if (Constants.CanCraftPotions) {
            AdvancedCreationEntry POM = CreationEntryCreator.createAdvancedEntry(SkillList.MINING, ItemList.rock, ItemList.potion, ItemList.potionMining, true, true, 0.0f, false, false, CreationCategories.MAGIC);
            POM.addRequirement(new CreationRequirement(1, ItemList.potion, Constants.HowManyPotionsREQ, true));
            AdvancedCreationEntry POW = CreationEntryCreator.createAdvancedEntry(SkillList.WOODCUTTING, ItemList.scrapwood, ItemList.potion, ItemList.potionWoodcutting, true, true, 0.0f, false, false, CreationCategories.MAGIC);
            POW.addRequirement(new CreationRequirement(1, ItemList.potion, Constants.HowManyPotionsREQ, true));
        }
        if (Constants.CanCraftSeasonalItems) {
            AdvancedCreationEntry YuleGoat = CreationEntryCreator.createAdvancedEntry(SkillList.THATCHING, ItemList.metalWires, ItemList.thatch, Constants.YuleGoatTemplateID, true, true, 0.0f, false, false, CreationCategories.DECORATION);
            YuleGoat.addRequirement(new CreationRequirement(1, ItemList.thatch, 10, true));
            YuleGoat.addRequirement(new CreationRequirement(2, ItemList.metalWires, 4, true));
            AdvancedCreationEntry YuleRainDeer = CreationEntryCreator.createAdvancedEntry(SkillList.THATCHING, ItemList.metalWires, ItemList.thatch, Constants.YuleRainDeerTemplateID, true, true, 0.0f, false, false, CreationCategories.DECORATION);
            YuleRainDeer.addRequirement(new CreationRequirement(1, ItemList.thatch, 10, true));
            YuleRainDeer.addRequirement(new CreationRequirement(2, ItemList.metalWires, 4, true));
            CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, ItemList.santaHat, false, true, 0.0f, false, false, CreationCategories.CLOTHES);
            AdvancedCreationEntry SnowLantern = CreationEntryCreator.createAdvancedEntry(SkillList.SMITHING_GOLDSMITHING, ItemList.anvilLarge, ItemList.silverBar, ItemList.snowLantern, false, true, 0.0f, false, false, CreationCategories.LIGHTS_AND_LAMPS);
            SnowLantern.addRequirement(new CreationRequirement(1, ItemList.silverBar, 10, true));
        }
        if (Constants.CanCraftGraniteWand) {
            CreationEntryCreator.createAdvancedEntry(SkillList.MASONRY, ItemList.staffSteel, ItemList.slateShard, ItemList.wandNature, true, true, 0.0f, false, false, CreationCategories.MAGIC);
        }
        if (Constants.CanCraftCavHelm) {
            CreationEntryCreator.createAdvancedEntry(SkillList.SMITHING_ARMOUR_PLATE, ItemList.blackWolfRug, ItemList.helmetGreat, Constants.CavalierHelmetTemplateID, true, true, 0.0f, false, false, CreationCategories.ARMOUR);
            new Armour(Constants.CavalierHelmetTemplateID, 0.07F, -0.3F);
        }
        if (Constants.CanCraftGreatAltars) {
            AdvancedCreationEntry AOT = CreationEntryCreator.createAdvancedEntry(SkillList.MASONRY, ItemList.marbleBrick, ItemList.clay, Constants.AltarofThreeTemplateID, true, true, 0.0f, false, false, CreationCategories.ALTAR);
            AOT.addRequirement(new CreationRequirement(1, ItemList.marbleBrick, 500, true));
            AOT.addRequirement(new CreationRequirement(2, ItemList.clay, 500, true));
            AOT.addRequirement(new CreationRequirement(3, ItemList.papyrusSheet, 1, true));
        }
    }
}