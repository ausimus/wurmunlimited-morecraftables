package com.wurmonline.server.spells;
import com.wurmonline.server.items.ItemList;
import org.ausimus.wurmunlimited.mods.morecraftables.configurator.Constants;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;
import com.wurmonline.server.behaviours.ActionEntry;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import com.wurmonline.server.skills.Skill;
import java.io.IOException;
import java.util.logging.Level;
public class RechargeTargetItem extends ReligiousSpell
{
    public RechargeTargetItem()
    {
        //String aName, int aNum, int aCastingTime, int aCost, int aDifficulty, int aLevel, long cooldown
        super(
                "Recharge Item",
                ModActions.getNextActionId(),
                Constants.RechargeCastTimer,
                Constants.RechargeCost,
                Constants.RechargeDifficulty,
                Constants.RechargeLevel,
                Constants.RechargeCoolDown);
        this.targetItem = true;
        this.description = "Recharges an item.";
        this.effectdesc = "blah, blah, blah, yacady, smackady.";
        ActionEntry actionEntry = ActionEntry.createEntry((short) number, name, "Recharging",
                new int[]{2 ,36,48});
        ModActions.registerAction(actionEntry);
    }
    @Override
    boolean precondition(final Skill castSkill, final Creature performer, final Item target)
    {
        if (target.getTemplateId() == 526)
        {
            if (performer.getFavor() < target.getAuxData())
            {
                performer.getCommunicator().sendNormalServerMessage("You cannot store more charge than you have in favor.", (byte) 3);
                return false;
            }
            if (target.getAuxData() > (byte) 99)
            {
                performer.getCommunicator().sendNormalServerMessage("The item cannot hold any more charge right now.", (byte) 3);
                return false;
            }
            else
            {
                return true;
            }
        }
        else
        {
            performer.getCommunicator().sendNormalServerMessage("This spell can only be cast on select items.", (byte) 3);
            return false;
        }
    }
    @Override
    boolean precondition(final Skill castSkill, final Creature performer, final Creature target)
    {
        return false;
    }
    @Override
    void doEffect(final Skill castSkill, double power, final Creature performer, final Item target)
    {
        if (target.getTemplateId() == ItemList.wandNature)
        {
            int favorStored = ((int) performer.getFavor());
            target.setAuxData((byte) favorStored);
            try
            {
                performer.setFavor(performer.getFavor() - (float) favorStored);
            } catch (IOException var9)
            {
                logger.log(Level.WARNING, performer.getName() + ":" + var9.getMessage(), var9);
            }
            if (performer.getDeity().getNumber() > 0)
            {
                performer.getCommunicator().sendNormalServerMessage("" + target.getName() + " now has " + target.getAuxData() + " charges left.", (byte) 2);
            }
            else
            {
                performer.getCommunicator().sendNormalServerMessage("" + target.getName() + " now has " + target.getAuxData() + " charges left.", (byte) 2);
            }
        }
    }
}