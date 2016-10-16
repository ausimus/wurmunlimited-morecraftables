package org.ausimus.wurmunlimited.mods.morecraftables.items;
import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.ItemTemplateCreator;
import org.ausimus.wurmunlimited.mods.morecraftables.configurator.Constants;
import java.io.IOException;
public class AusItemTemplateCreator {
    public AusItemTemplateCreator() {
        try {
            //Staff of Land
            ItemTemplateCreator.createItemTemplate(Constants.SOL_TemplateID, "staff of land", "staves", "fresh", "dry", "brittle", "rotten", "A rare and masterfully crafted staff. The staff looks intimidating and though the finer detailing looks brittle at first, it is surprisingly strong and sharp.",
                    new short[]{44, 133, 22, 14, 37, 84}, (short) 646, (short) 1, 45, 9223372036854775807L, 3, 4, 150, 10090, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.weapon.staffOfLand.", Constants.SOL_CraftingDifficulty, 3000, (byte) 9, 10000, true);
            //Mask of the Challenger
            ItemTemplateCreator.createItemTemplate(Constants.MOC_TemplateID, 3, "mask of the challenger", "masks", "excellent", "good", "ok", "poor", "The expression of the mask is that of a predator daring anyone to challenge the wearer in combat.",
                    new short[]{108, 44, 22, 4}, (short) 60, (short) 1, 0, 9223372036854775807L, 1, 10, 20, -10, new byte[]{(byte) 29}, "model.armour.head.mask.challenge.", Constants.MOC_CraftingDifficulty, 200, (byte) 8, 10000, true, 0);
            //Mask of The Enlightened
            ItemTemplateCreator.createItemTemplate(Constants.MOE_TemplateID, 3, "mask of the enlightened", "masks", "excellent", "good", "ok", "poor", "At first glance the mask looks brittle, it is however surprisingly sturdy and the materials used are of the highest quality.",
                    new short[]{108, 44, 23, 4}, (short) 60, (short) 1, 0, 9223372036854775807L, 1, 10, 20, -10, new byte[]{(byte) 29}, "model.armour.head.mask.enlightened.", Constants.MOE_CraftingDifficulty, 200, (byte) 16, 10000, true, 0);
            //Mask of The Ravager
            ItemTemplateCreator.createItemTemplate(Constants.MOR_TemplateID, 3, "mask of the ravager", "masks", "excellent", "good", "ok", "poor", "Strikingly intricate leatherwork makes this mask stand out as rare and of high quality.",
                    new short[]{108, 44, 23, 4}, (short) 60, (short) 1, 0, 9223372036854775807L, 1, 10, 20, -10, new byte[]{(byte) 29}, "model.armour.head.mask.ravager.", Constants.MOR_CraftingDifficulty, 200, (byte) 16, 10000, true, 0);
            //Mask of The Shadow
            ItemTemplateCreator.createItemTemplate(Constants.MOS_TemplateID, 3, "mask of the shadow", "masks", "excellent", "good", "ok", "poor", "A dark mask concealing its wearers features.",
                    new short[]{108, 44, 23, 4}, (short) 60, (short) 1, 0, 9223372036854775807L, 1, 10, 20, -10, new byte[]{(byte) 29}, "model.armour.head.mask.shadow.", Constants.MOS_CraftingDifficulty, 200, (byte) 16, 10000, true, 0);
            //Mask of The Returner
            ItemTemplateCreator.createItemTemplate(Constants.MOReturner_TemplateID, 3, "mask of the returner", "masks", "excellent", "good", "ok", "poor", "A mask.",
                    new short[]{108, 44, 23, 4}, (short) 60, (short) 1, 0, 9223372036854775807L, 1, 10, 20, -10, new byte[]{(byte) 29}, "model.armour.head.mask.returner.", Constants.MOReturner_CraftingDifficulty, 200, (byte) 16, 10000, true, 0);
            //Horned Helmet of Gold
            ItemTemplateCreator.createItemTemplate(Constants.HHOG_TemplateID, 3, "horned helmet of gold", "horned helmets", "excellent", "good", "ok", "poor", "A horned helmet that inspires respect. It looks dangerous, heavy and robust.",
                    new short[]{108, 44, 22, 4}, (short) 968, (short) 1, 0, 9223372036854775807L, 1, 10, 20, -10, new byte[]{(byte) 1, (byte) 28}, "model.armour.head.greathelmHornedOfGold.", Constants.HHOG_CraftingDifficulty, 1700, (byte) 9, 10000, true, 4);
            //Plumed Helm of The Hunt
            ItemTemplateCreator.createItemTemplate(Constants.PHOH_TemplateID, 3, "plumed helm of the hunt", "plumed helmets", "excellent", "good", "ok", "poor", "An open-faced round-top helm.",
                    new short[]{108, 44, 22, 4}, (short) 966, (short) 1, 0, 3024000L, 1, 10, 20, -10, new byte[]{(byte) 1, (byte) 28}, "model.armour.head.openhelmplumedhunt.", Constants.PHOH_CraftingDifficulty, 1100, (byte) 9, 10000, true, 4);
            //Challenge Statues
            ItemTemplateCreator.createItemTemplate(Constants.CSG_TemplateID, "challenge statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "The golden statue of challenges.", new short[]{108, 22, 51, 52, 176, 178, 44, 199}, (short) 60, (short) 1, 0, 9223372036854775807L, 20, 30, 160, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.challenge.", Constants.CSG_CraftingDifficulty, 6400, (byte) 7);
            ItemTemplateCreator.createItemTemplate(Constants.CSS_TemplateID, "challenge statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "The silver statue of challenges.", new short[]{108, 22, 51, 52, 176, 178, 44, 199}, (short) 60, (short) 1, 0, 9223372036854775807L, 20, 30, 160, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.challenge.", Constants.CSS_CraftingDifficulty, 6400, (byte) 8);
            ItemTemplateCreator.createItemTemplate(Constants.CSB_TemplateID, "challenge statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "The bronze statue of challenges.", new short[]{108, 22, 51, 52, 176, 44, 199}, (short) 60, (short) 1, 0, 9223372036854775807L, 20, 30, 160, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.challenge.", Constants.CSB_CraftingDifficulty, 6400, (byte) 31);
            ItemTemplateCreator.createItemTemplate(Constants.CSM_TemplateID, "challenge statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "The marble statue of challenges.", new short[]{108, 25, 51, 52, 176, 178, 44, 199}, (short) 60, (short) 1, 0, 9223372036854775807L, 20, 30, 160, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.challenge.", Constants.CSM_CraftingDifficulty, 6400, (byte) 62);
            //JK Crown
            ItemTemplateCreator.createItemTemplate(Constants.JKC_TemplateID, 3, "royal crown", "crowns", "excellent", "good", "ok", "poor", "A heavy gold crown covered in blue and green gems.",
                    new short[]{52, 22, 4, 44}, (short) 60, (short) 1, 0, 9223372036854775807L, 5, 20, 20, -10, new byte[]{(byte) 1, (byte) 28}, "model.decoration.crown.", Constants.RC_CraftingDifficulty, 1500, (byte) 7, 5000000, false, 10);
            //MR Crown
            ItemTemplateCreator.createItemTemplate(Constants.MRC_TemplateID, 3, "circlet", "circlets", "excellent", "good", "ok", "poor", "A simple yet stunningly fashionable silver circlet.",
                    new short[]{52, 22, 4, 44}, (short) 60, (short) 1, 0, 9223372036854775807L, 5, 20, 20, -10, new byte[]{(byte) 1, (byte) 28}, "model.decoration.crown.", Constants.RC_CraftingDifficulty, 1500, (byte) 8, 5000000, false, 10);
            //HoTS Crown
            ItemTemplateCreator.createItemTemplate(Constants.BLC_TemplateID, 3, "cage crown", "crowns", "excellent", "good", "ok", "poor", "A crown in the form of an egg made from steel bands that cage the head of the wearer.",
                    new short[]{52, 22, 4, 44}, (short) 60, (short) 1, 0, 9223372036854775807L, 5, 20, 20, -10, new byte[]{(byte) 1, (byte) 28}, "model.decoration.crown.", Constants.RC_CraftingDifficulty, 1500, (byte) 9, 5000000, false, 10);
            //Mock Sword of Magranon
            ItemTemplateCreator.createItemTemplate(Constants.SOMA_TemplateID, "Sword of Magranon", "swords of magranon", "excellent", "good", "ok", "poor", "A heavy two-handed sword of incredible quality made from steel and with a comfortable hilt of leather bound silver filigran. ",
                    new short[]{52, 37, 2, 84, 16, 44, 133, 22}, (short) 1319, (short) 35, 70, 9223372036854775807L, 5, 10, 180, 10028, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.artifact.swordtwo.", Constants.Art_CraftingDifficulty, 4000, (byte) 9, 3000000, false);
            //Mock Hammer of Magranon
            ItemTemplateCreator.createItemTemplate(Constants.HOMA_TemplateID, "Hammer of Magranon", "hammers of magranon", "excellent", "good", "ok", "poor", "A huge brutal warhammer made totally from bronze.",
                    new short[]{52, 37, 14, 44, 133, 22}, (short) 1339, (short) 35, 80, 9223372036854775807L, 5, 10, 80, 10070, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.artifact.hammerhuge.", Constants.Art_CraftingDifficulty, 5000, (byte) 31, 3000000, false);
            //Mock Scale of Libila
            ItemTemplateCreator.createItemTemplate(Constants.SOLA_TemplateID, "Scale of Libila", "scales of libila", "excellent", "good", "ok", "poor", "This looks somewhat like a huge black leaf, except that it is made from dark shiny iron.",
                    new short[]{52, 3, 44, 22}, (short) 839, (short) 35, 0, 9223372036854775807L, 1, 25, 45, 10006, new byte[]{(byte) 3, (byte) 44}, "model.artifact.scale.", Constants.Art_CraftingDifficulty, 3000, (byte) 11, 3000000, false);
            //Mock Crown of Might
            ItemTemplateCreator.createItemTemplate(Constants.COMA_TemplateID, 3, "Crown of Might", "crowns of might", "excellent", "good", "ok", "poor", "A thick heavy gold crown covered in green and red gems.",
                    new short[]{52, 22, 4, 44}, (short) 974, (short) 35, 0, 9223372036854775807L, 5, 20, 20, -10, new byte[]{(byte) 1, (byte) 28}, "model.artifact.crownmight.", Constants.Art_CraftingDifficulty, 1500, (byte) 7, 5000000, false, 10);
            //Mock Sceptre of Ascension
            ItemTemplateCreator.createItemTemplate(Constants.SOAA_TemplateID, "Sceptre of Ascension", "sceptres of ascension", "excellent", "good", "ok", "poor", "A large bulky sceptre, made from shiny white steel with black steel thorns attached to the head.",
                    new short[]{52, 37, 14, 44, 133, 22, 84}, (short) 1279, (short) 35, 80, 9223372036854775807L, 5, 5, 60, 10061, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.artifact.sceptreascension.", Constants.Art_CraftingDifficulty, 5000, (byte) 9, 5000000, false);
            //Epic Structures
            ItemTemplateCreator.createItemTemplate(Constants.NewPylon_TemplateID, "pylon", "pylons", "excellent", "good", "ok", "poor", "This monumental structure is said to represent two hills between which the sun rises and sets. It is commonly associated with recreation and birth.",
                    new short[]{25, 31, 52, 44, 67, 109, 178, 123, 195, 194}, (short) 60, (short) 1, 0, 9223372036854775807L, 300, 500, 1500, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.pylon.", Constants.NewPylon_CraftingDifficulty, 2000000, (byte) 15, 10000, false);
            ItemTemplateCreator.createItemTemplate(Constants.NewObelisk_TemplateID, "obelisk", "obelisk", "excellent", "good", "ok", "poor", "A large obelisk. These monuments represent the sun.",
                    new short[]{25, 31, 52, 44, 67, 109, 178, 194, 123, 195}, (short) 60, (short) 1, 0, 9223372036854775807L, 100, 100, 1000, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.obelisque.", Constants.NewObelisk_CraftingDifficulty, 1500000, (byte) 15, 10000, false);
            ItemTemplateCreator.createItemTemplate(Constants.NewShrine_TemplateID, "shrine", "shrine", "excellent", "good", "ok", "poor", "A small shrine for worshipping spirits, large enough to enter but not much more.",
                    new short[]{31, 52, 44, 67, 98, 194, 109, 123}, (short) 60, (short) 1, 0, 9223372036854775807L, 400, 400, 400, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.shrine.", Constants.NewShrine_CraftingDifficulty, 1500000, (byte) 0, 10000, false);
            ItemTemplateCreator.createItemTemplate(Constants.NewSpiritGate_TemplateID, "spirit gate", "spirit gate", "excellent", "good", "ok", "poor", "These spirit gates marks the transition between the normal world and the sacred. They are usually placed near the entrance to shrines.",
                    new short[]{49, 31, 52, 44, 67, 109, 195, 194, 178}, (short) 60, (short) 1, 0, 9223372036854775807L, 100, 400, 500, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.spiritgate.", Constants.NewSpiritGate_CraftingDifficulty, 500000, (byte) 0, 10000, false);
            //SummerHat
            ItemTemplateCreator.createItemTemplate(Constants.SummerHat_TemplateID, 3, "summer hat", "hats", "excellent", "good", "ok", "poor", "A beautiful hat, glistening in the sun. It is made from a strange green fabric and decorated with flowers that never seem to wither.",
                    new short[]{24, 4, 44}, (short) 973, (short) 1, 0, 9223372036854775807L, 5, 20, 20, -10, new byte[]{(byte) 1}, "model.armour.summerhat.", Constants.Art_CraftingDifficulty, 300, (byte) 8, 5000000, true, 9);
            //Hota Statues
            //Deer
            ItemTemplateCreator.createItemTemplate(Constants.HOTA_DeerTemplateID, "Deer hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short) 60, (short) 1, 0, 9223372036854775807L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.deer.", Constants.HOTAStatue_CraftingDifficulty, 150000, (byte) 7);
            //Bear fighting Pig
            ItemTemplateCreator.createItemTemplate(Constants.HOTA_BearfightingBullTemplateID, "Bear and Bull hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short) 60, (short) 1, 0, 9223372036854775807L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.bearfightingbull.", Constants.HOTAStatue_CraftingDifficulty, 150000, (byte) 7);
            //Dog Fighting Boar
            ItemTemplateCreator.createItemTemplate(Constants.HOTA_DogFightingBoarTemplateID, "Dog and Pig hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short) 60, (short) 1, 0, 9223372036854775807L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.dogsfightingboar.", Constants.HOTAStatue_CraftingDifficulty, 150000, (byte) 7);
            // Female Fighting Snake
            ItemTemplateCreator.createItemTemplate(Constants.HOTA_FemaleFightingAnacondaTemplateID, "Woman and Snake hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short) 60, (short) 1, 0, 9223372036854775807L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.femalefightinganaconda.", Constants.HOTAStatue_CraftingDifficulty, 150000, (byte) 7);
            //Lady of The Lake
            ItemTemplateCreator.createItemTemplate(Constants.HOTA_LadyofTheLakeTemplateID, "Lady of The Lake hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short) 60, (short) 1, 0, 9223372036854775807L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.ladylake.", Constants.HOTAStatue_CraftingDifficulty, 150000, (byte) 7);
            //Man Fights Bear
            ItemTemplateCreator.createItemTemplate(Constants.HOTA_ManFightingBearTemplateID, "Man and Bear hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short) 60, (short) 1, 0, 9223372036854775807L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.manfightingbear.", Constants.HOTAStatue_CraftingDifficulty, 150000, (byte) 7);
            //NoGump
            ItemTemplateCreator.createItemTemplate(Constants.HOTA_NoGumpTemplateID, "Nogump hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short) 60, (short) 1, 0, 9223372036854775807L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.nogump.", Constants.HOTAStatue_CraftingDifficulty, 150000, (byte) 7);
            //Scorpion
            ItemTemplateCreator.createItemTemplate(Constants.HOTA_ScorpionTemplateID, "Scorpion hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short) 60, (short) 1, 0, 9223372036854775807L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.scorpion.", Constants.HOTAStatue_CraftingDifficulty, 150000, (byte) 7);
            //Sol Demon
            ItemTemplateCreator.createItemTemplate(Constants.HOTA_SolDemonTemplateID, "Sol Demon hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short) 60, (short) 1, 0, 9223372036854775807L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.soldemon.", Constants.HOTAStatue_CraftingDifficulty, 150000, (byte) 7);
            //Wolf Fights Bison
            ItemTemplateCreator.createItemTemplate(Constants.HOTA_WolfFightingBisonTemplateID, "Wolf and Bison hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short) 60, (short) 1, 0, 9223372036854775807L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.wolffightingbison.", Constants.HOTAStatue_CraftingDifficulty, 150000, (byte) 7);
            //Black Dragon
            ItemTemplateCreator.createItemTemplate(Constants.HOTA_DragonTemplateID, "Dragon hota statue", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "This statue is the prize of a Hota tournament.",
                    new short[]{108, 22, 51, 52, 92, 1, 32, 176, 199, 178, 44}, (short) 60, (short) 1, 0, 9223372036854775807L, 40, 40, 260, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.hota.blackdragon.", Constants.HOTAStatue_CraftingDifficulty, 150000, (byte) 7);
            //Gnomes
            ItemTemplateCreator.createItemTemplate(Constants.GardenGnomeTemplateID, "garden gnome", "gnomes", "almost full", "somewhat occupied", "half-full", "emptyish", "A small serious gnome stands here ready for christmas.", new short[]{(short) 108, (short) 51, (short) 52, (short) 67, (short) 92, (short) 89, (short) 1, (short) 33, (short) 40, (short) 178}, (short) 60, (short) 1, 0, 604800L, 10, 10, 40, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.garden.", 10.0F, 20000, (byte) 18);
            ItemTemplateCreator.createItemTemplate(Constants.GardenGnomeGreenTemplateID, "green garden gnome", "gnomes", "almost full", "somewhat occupied", "half-full", "emptyish", "A small serious green gnome stands here ready for christmas.", new short[]{(short) 108, (short) 51, (short) 52, (short) 67, (short) 1, (short) 33, (short) 40, (short) 178}, (short) 60, (short) 1, 0, 2419200L, 10, 10, 40, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.statue.garden.green.", 10.0F, 20000, (byte) 18);

            //Seasonal Items
            ItemTemplateCreator.createItemTemplate(Constants.YuleGoatTemplateID, "yule goat", "goats", "excellent", "good", "ok", "poor", "A popular christmas decoration is a goat made from straw. To be placed by the christmas tree.", new short[]{(short) 108, (short) 51, (short) 52, (short) 40}, (short) 60, (short) 1, 0, 9223372036854775807L, 10, 40, 40, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.bucketthree.", 10.0F, 500, (byte) 70);
            ItemTemplateCreator.createItemTemplate(Constants.YuleRainDeerTemplateID, "yule reindeer", "reindeers", "excellent", "good", "ok", "poor", "This years fad is a reindeer made from straw. Best friend of the yule goat.", new short[]{(short) 108, (short) 51, (short) 52, (short) 40}, (short) 60, (short) 1, 0, 9223372036854775807L, 10, 40, 40, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.bucketfour.", 10.0F, 500, (byte) 70);
        } catch (IOException ignored) {
        }
    }
}
