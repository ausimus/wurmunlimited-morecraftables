package org.ausimus.wurmunlimited.mods.morecraftables;
import com.wurmonline.server.deities.Deities;
import com.wurmonline.server.deities.Deity;
import com.wurmonline.server.spells.RechargeTargetItem;
import com.wurmonline.server.spells.Spells;
import org.ausimus.wurmunlimited.mods.morecraftables.configurator.Constants;
import org.ausimus.wurmunlimited.mods.morecraftables.items.AusCreationEntrys;
import org.ausimus.wurmunlimited.mods.morecraftables.items.AusItemTemplateCreator;
import org.gotti.wurmunlimited.modloader.ReflectionUtil;
import org.gotti.wurmunlimited.modloader.interfaces.*;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
public class Initiator implements WurmServerMod, ServerStartedListener, ItemTemplatesCreatedListener, Configurable {

    @Override
    public void onItemTemplatesCreated() {
        new AusItemTemplateCreator();
    }

    @Override
    public void onServerStarted() {
        new AusCreationEntrys();
        new Runnable() {
            @Override
            public void run() {
                if (Constants.AddCS) {
                    final RechargeTargetItem RechargeTargetItem = new RechargeTargetItem();
                    try {
                        ReflectionUtil.callPrivateMethod(Spells.class, ReflectionUtil.getMethod(Spells.class, "addSpell"), RechargeTargetItem);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
                            | NoSuchMethodException e) {
                        throw new RuntimeException(e);
                    }
                    if (Constants.CS_all) {
                        for (final Deity deity : Deities.getDeities()) {
                            deity.addSpell(RechargeTargetItem);
                        }
                    } else {
                        if (Constants.CS_fo) {
                            Deities.getDeity(Deities.DEITY_FO).addSpell(RechargeTargetItem);
                        }
                        if (Constants.CS_mag) {
                            Deities.getDeity(Deities.DEITY_MAGRANON).addSpell(RechargeTargetItem);
                        }
                        if (Constants.CS_vyn) {
                            Deities.getDeity(Deities.DEITY_VYNORA).addSpell(RechargeTargetItem);
                        }
                        if (Constants.CS_lib) {
                            Deities.getDeity(Deities.DEITY_LIBILA).addSpell(RechargeTargetItem);
                        }
                    }
                }
            }
        }.run();
    }

    @Override
    public void configure(Properties properties) {
        {
            //Staff of Land
            Constants.SOL_TemplateID = Integer.parseInt(properties.getProperty("SOL_TemplateID", Integer.toString(Constants.SOL_TemplateID)));
            Constants.SOL_CraftingDifficulty = Float.parseFloat(properties.getProperty("SOL_CraftingDifficulty", Float.toString(Constants.SOL_CraftingDifficulty)));
            Constants.SOL_damage = Float.parseFloat(properties.getProperty("SOL_damage", Float.toString(Constants.SOL_damage)));
            Constants.SOL_swingTimer = Float.parseFloat(properties.getProperty("SOL_swingTimer", Float.toString(Constants.SOL_swingTimer)));
            Constants.SOL_critChance = Float.parseFloat(properties.getProperty("SOL_critChance", Float.toString(Constants.SOL_critChance)));
            Constants.SOL_parryChance = Float.parseFloat(properties.getProperty("SOL_parryChance", Float.toString(Constants.SOL_parryChance)));
            Constants.SOL_CRNurf = Double.parseDouble(properties.getProperty("SOL_CRNurf", Double.toString(Constants.SOL_CRNurf)));
            //Masks
            Constants.MOC_TemplateID = Integer.parseInt(properties.getProperty("MOC_TemplateID", Integer.toString(Constants.MOC_TemplateID)));
            Constants.MOC_CraftingDifficulty = Float.parseFloat(properties.getProperty("MOC_CraftingDifficulty", Float.toString(Constants.MOC_CraftingDifficulty)));
            Constants.MOR_TemplateID = Integer.parseInt(properties.getProperty("MOR_TemplateID", Integer.toString(Constants.MOR_TemplateID)));
            Constants.MOR_CraftingDifficulty = Float.parseFloat(properties.getProperty("MOR_CraftingDifficulty", Float.toString(Constants.MOR_CraftingDifficulty)));
            Constants.MOE_TemplateID = Integer.parseInt(properties.getProperty("MOE_TemplateID", Integer.toString(Constants.MOE_TemplateID)));
            Constants.MOE_CraftingDifficulty = Float.parseFloat(properties.getProperty("MOE_CraftingDifficulty", Float.toString(Constants.MOE_CraftingDifficulty)));
            Constants.MOS_TemplateID = Integer.parseInt(properties.getProperty("MOS_TemplateID", Integer.toString(Constants.MOS_TemplateID)));
            Constants.MOS_CraftingDifficulty = Float.parseFloat(properties.getProperty("MOS_CraftingDifficulty", Float.toString(Constants.MOS_CraftingDifficulty)));
            Constants.MOReturner_TemplateID = Integer.parseInt(properties.getProperty("MOReturner_TemplateID", Integer.toString(Constants.MOReturner_TemplateID)));
            Constants.MOReturner_CraftingDifficulty = Float.parseFloat(properties.getProperty("MOReturner_CraftingDifficulty", Float.toString(Constants.MOReturner_CraftingDifficulty)));
            //Horned Helm of Gold
            Constants.HHOG_TemplateID = Integer.parseInt(properties.getProperty("HHOG_TemplateID", Integer.toString(Constants.HHOG_TemplateID)));
            Constants.HHOG_CraftingDifficulty = Float.parseFloat(properties.getProperty("HHOG_CraftingDifficulty", Float.toString(Constants.HHOG_CraftingDifficulty)));
            //Plumed Helm of The Hunt
            Constants.PHOH_TemplateID = Integer.parseInt(properties.getProperty("PHOH_TemplateID", Integer.toString(Constants.PHOH_TemplateID)));
            Constants.PHOH_CraftingDifficulty = Float.parseFloat(properties.getProperty("PHOH_CraftingDifficulty", Float.toString(Constants.PHOH_CraftingDifficulty)));
            //Challenge Statues
            Constants.CSG_TemplateID = Integer.parseInt(properties.getProperty("CSG_TemplateID", Integer.toString(Constants.CSG_TemplateID)));
            Constants.CSG_CraftingDifficulty = Float.parseFloat(properties.getProperty("CSG_CraftingDifficulty", Float.toString(Constants.CSG_CraftingDifficulty)));
            Constants.CSS_TemplateID = Integer.parseInt(properties.getProperty("CSS_TemplateID", Integer.toString(Constants.CSS_TemplateID)));
            Constants.CSS_CraftingDifficulty = Float.parseFloat(properties.getProperty("CSS_CraftingDifficulty", Float.toString(Constants.CSS_CraftingDifficulty)));
            Constants.CSB_TemplateID = Integer.parseInt(properties.getProperty("CSB_TemplateID", Integer.toString(Constants.CSB_TemplateID)));
            Constants.CSB_CraftingDifficulty = Float.parseFloat(properties.getProperty("CSB_CraftingDifficulty", Float.toString(Constants.CSB_CraftingDifficulty)));
            Constants.CSM_TemplateID = Integer.parseInt(properties.getProperty("CSM_TemplateID", Integer.toString(Constants.CSM_TemplateID)));
            Constants.CSM_CraftingDifficulty = Float.parseFloat(properties.getProperty("CSM_CraftingDifficulty", Float.toString(Constants.CSM_CraftingDifficulty)));
            //Royal Crowns
            Constants.JKC_TemplateID = Integer.parseInt(properties.getProperty("JKC_TemplateID", Integer.toString(Constants.JKC_TemplateID)));
            Constants.MRC_TemplateID = Integer.parseInt(properties.getProperty("MRC_TemplateID", Integer.toString(Constants.MRC_TemplateID)));
            Constants.BLC_TemplateID = Integer.parseInt(properties.getProperty("BLC_TemplateID", Integer.toString(Constants.BLC_TemplateID)));
            Constants.RC_CraftingDifficulty = Float.parseFloat(properties.getProperty("RC_CraftingDifficulty", Float.toString(Constants.RC_CraftingDifficulty)));
            //MockArtifacts
            Constants.SOMA_TemplateID = Integer.parseInt(properties.getProperty("SOMA_TemplateID", Integer.toString(Constants.SOMA_TemplateID)));
            Constants.HOMA_TemplateID = Integer.parseInt(properties.getProperty("HOMA_TemplateID", Integer.toString(Constants.HOMA_TemplateID)));
            Constants.SOLA_TemplateID = Integer.parseInt(properties.getProperty("SOLA_TemplateID", Integer.toString(Constants.SOLA_TemplateID)));
            Constants.COMA_TemplateID = Integer.parseInt(properties.getProperty("COMA_TemplateID", Integer.toString(Constants.COMA_TemplateID)));
            Constants.SOAA_TemplateID = Integer.parseInt(properties.getProperty("SOAA_TemplateID", Integer.toString(Constants.SOAA_TemplateID)));
            Constants.SummerHat_TemplateID = Integer.parseInt(properties.getProperty("SummerHat_TemplateID", Integer.toString(Constants.SummerHat_TemplateID)));
            Constants.Art_CraftingDifficulty = Float.parseFloat(properties.getProperty("Art_CraftingDifficulty", Float.toString(Constants.Art_CraftingDifficulty)));
            //EpicStructures
            Constants.NewPylon_TemplateID = Integer.parseInt(properties.getProperty("NewPylon_TemplateID", Integer.toString(Constants.NewPylon_TemplateID)));
            Constants.NewPylon_CraftingDifficulty = Float.parseFloat(properties.getProperty("NewPylon_CraftingDifficulty", Float.toString(Constants.NewPylon_CraftingDifficulty)));
            Constants.NewObelisk_TemplateID = Integer.parseInt(properties.getProperty("NewObelisk_TemplateID", Integer.toString(Constants.NewObelisk_TemplateID)));
            Constants.NewObelisk_CraftingDifficulty = Float.parseFloat(properties.getProperty("NewObelisk_CraftingDifficulty", Float.toString(Constants.NewObelisk_CraftingDifficulty)));
            Constants.NewShrine_TemplateID = Integer.parseInt(properties.getProperty("NewShrine_TemplateID", Integer.toString(Constants.NewShrine_TemplateID)));
            Constants.NewShrine_CraftingDifficulty = Float.parseFloat(properties.getProperty("NewShrine_CraftingDifficulty", Float.toString(Constants.NewShrine_CraftingDifficulty)));
            Constants.NewSpiritGate_TemplateID = Integer.parseInt(properties.getProperty("NewSpiritGate_TemplateID", Integer.toString(Constants.NewSpiritGate_TemplateID)));
            Constants.NewSpiritGate_CraftingDifficulty = Float.parseFloat(properties.getProperty("NewSpiritGate_CraftingDifficulty", Float.toString(Constants.NewSpiritGate_CraftingDifficulty)));
            //Hota Statues
            Constants.HOTA_BearfightingBullTemplateID = Integer.parseInt(properties.getProperty("HOTA_BearfightingBullTemplateID", Integer.toString(Constants.HOTA_BearfightingBullTemplateID)));
            Constants.HOTA_DeerTemplateID = Integer.parseInt(properties.getProperty("HOTA_DeerTemplateID", Integer.toString(Constants.HOTA_DeerTemplateID)));
            Constants.HOTA_DogFightingBoarTemplateID = Integer.parseInt(properties.getProperty("HOTA_DogFightingBoarTemplateID", Integer.toString(Constants.HOTA_DogFightingBoarTemplateID)));
            Constants.HOTA_FemaleFightingAnacondaTemplateID = Integer.parseInt(properties.getProperty("HOTA_FemaleFightingAnacondaTemplateID", Integer.toString(Constants.HOTA_FemaleFightingAnacondaTemplateID)));
            Constants.HOTA_LadyofTheLakeTemplateID = Integer.parseInt(properties.getProperty("HOTA_LadyofTheLakeTemplateID", Integer.toString(Constants.HOTA_LadyofTheLakeTemplateID)));
            Constants.HOTA_ManFightingBearTemplateID = Integer.parseInt(properties.getProperty("HOTA_ManFightingBearTemplateID", Integer.toString(Constants.HOTA_ManFightingBearTemplateID)));
            Constants.HOTA_NoGumpTemplateID = Integer.parseInt(properties.getProperty("HOTA_NoGumpTemplateID", Integer.toString(Constants.HOTA_NoGumpTemplateID)));
            Constants.HOTA_ScorpionTemplateID = Integer.parseInt(properties.getProperty("HOTA_ScorpionTemplateID", Integer.toString(Constants.HOTA_ScorpionTemplateID)));
            Constants.HOTA_SolDemonTemplateID = Integer.parseInt(properties.getProperty("HOTA_SolDemonTemplateID", Integer.toString(Constants.HOTA_SolDemonTemplateID)));
            Constants.HOTA_WolfFightingBisonTemplateID = Integer.parseInt(properties.getProperty("HOTA_WolfFightingBisonTemplateID", Integer.toString(Constants.HOTA_WolfFightingBisonTemplateID)));
            Constants.HOTA_DragonTemplateID = Integer.parseInt(properties.getProperty("HOTA_DragonTemplateID", Integer.toString(Constants.HOTA_DragonTemplateID)));
            Constants.HOTAStatue_CraftingDifficulty = Float.parseFloat(properties.getProperty("HOTAStatue_CraftingDifficulty", Float.toString(Constants.HOTAStatue_CraftingDifficulty)));
            //Potions
            Constants.HowManyPotionsREQ = Integer.parseInt(properties.getProperty("HowManyPotionsREQ", Integer.toString(Constants.HowManyPotionsREQ)));
            //Garden Gnomes
            Constants.GardenGnomeTemplateID = Integer.parseInt(properties.getProperty("GardenGnomeTemplateID", Integer.toString(Constants.GardenGnomeTemplateID)));
            Constants.GardenGnomeGreenTemplateID = Integer.parseInt(properties.getProperty("GardenGnomeGreenTemplateID", Integer.toString(Constants.GardenGnomeGreenTemplateID)));
            //Seasonal Items
            Constants.YuleGoatTemplateID = Integer.parseInt(properties.getProperty("YuleGoatTemplateID", Integer.toString(Constants.YuleGoatTemplateID)));
            Constants.YuleRainDeerTemplateID = Integer.parseInt(properties.getProperty("YuleRainDeerTemplateID", Integer.toString(Constants.YuleRainDeerTemplateID)));
            //Main Mod Activation
            Constants.CanCraftCavHelm = Boolean.parseBoolean(properties.getProperty("CanCraftCavHelm", Boolean.toString(Constants.CanCraftCavHelm)));
            Constants.CanCraftSOL = Boolean.parseBoolean(properties.getProperty("CanCraftSOL", Boolean.toString(Constants.CanCraftSOL)));
            Constants.CanCraftMasks = Boolean.parseBoolean(properties.getProperty("CanCraftMasks", Boolean.toString(Constants.CanCraftMasks)));
            Constants.CanCraftChallengeHelms = Boolean.parseBoolean(properties.getProperty("CanCraftChallengeHelms", Boolean.toString(Constants.CanCraftChallengeHelms)));
            Constants.CanCraftChallengeStatues = Boolean.parseBoolean(properties.getProperty("CanCraftChallengeStatues", Boolean.toString(Constants.CanCraftChallengeStatues)));
            Constants.CanCraftCrowns = Boolean.parseBoolean(properties.getProperty("CanCraftCrowns", Boolean.toString(Constants.CanCraftCrowns)));
            Constants.CanCraftMockArtifacts = Boolean.parseBoolean(properties.getProperty("CanCraftMockArtifacts", Boolean.toString(Constants.CanCraftMockArtifacts)));
            Constants.CanCraftEpicStructures = Boolean.parseBoolean(properties.getProperty("CanCraftEpicStructures", Boolean.toString(Constants.CanCraftEpicStructures)));
            Constants.CanCraftFancys = Boolean.parseBoolean(properties.getProperty("CanCraftFancys", Boolean.toString(Constants.CanCraftFancys)));
            Constants.CanCraftFireWorks = Boolean.parseBoolean(properties.getProperty("CanCraftFireWorks", Boolean.toString(Constants.CanCraftFireWorks)));
            Constants.CanCraftHoTAStatues = Boolean.parseBoolean(properties.getProperty("CanCraftHoTAStatues", Boolean.toString(Constants.CanCraftHoTAStatues)));
            Constants.CanCraftConstructionMaterials = Boolean.parseBoolean(properties.getProperty("CanCraftConstructionMaterials", Boolean.toString(Constants.CanCraftConstructionMaterials)));
            Constants.CanCraftPotions = Boolean.parseBoolean(properties.getProperty("CanCraftPotions", Boolean.toString(Constants.CanCraftPotions)));
            Constants.CanCraftSeasonalItems = Boolean.parseBoolean(properties.getProperty("CanCraftSeasonalItems", Boolean.toString(Constants.CanCraftSeasonalItems)));
            Constants.CanCraftGraniteWand = Boolean.parseBoolean(properties.getProperty("CanCraftGraniteWand", Boolean.toString(Constants.CanCraftGraniteWand)));
            Constants.Debug = Boolean.parseBoolean(properties.getProperty("Debug", Boolean.toString(Constants.Debug)));
            //Spell Shit
            Constants.RechargeCoolDown = Long.parseLong(properties.getProperty("RechargeCoolDown", Long.toString(Constants.RechargeCoolDown)));
            Constants.RechargeDifficulty = Integer.parseInt(properties.getProperty("RechargeDifficulty", Integer.toString(Constants.RechargeDifficulty)));
            Constants.RechargeLevel = Integer.parseInt(properties.getProperty("RechargeLevel", Integer.toString(Constants.RechargeLevel)));
            Constants.RechargeCastTimer = Integer.parseInt(properties.getProperty("RechargeCastTimer", Integer.toString(Constants.RechargeCastTimer)));
            Constants.RechargeCost = Integer.parseInt(properties.getProperty("RechargeCost", Integer.toString(Constants.RechargeCost)));
            Constants.AddCS = Boolean.parseBoolean(properties.getProperty("AddCS", Boolean.toString(Constants.AddCS)));
            Constants.CS_vyn = Boolean.parseBoolean(properties.getProperty("CS_vyn", Boolean.toString(Constants.CS_vyn)));
            Constants.CS_mag = Boolean.parseBoolean(properties.getProperty("CS_mag", Boolean.toString(Constants.CS_mag)));
            Constants.CS_lib = Boolean.parseBoolean(properties.getProperty("CS_lib", Boolean.toString(Constants.CS_lib)));
            Constants.CS_fo = Boolean.parseBoolean(properties.getProperty("CS_fo", Boolean.toString(Constants.CS_fo)));
            Constants.CS_all = Boolean.parseBoolean(properties.getProperty("CS_all", Boolean.toString(Constants.CS_all)));
            //Cavalier Helmet
            Constants.CavalierHelmetTemplateID = Integer.parseInt(properties.getProperty("CavalierHelmetTemplateID", Integer.toString(Constants.CavalierHelmetTemplateID)));
            //The End
        }
    }
}