package com.wurmonline.server.behaviours;
import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import com.wurmonline.server.items.ItemTypes;
import com.wurmonline.server.players.Player;
import org.ausimus.wurmunlimited.mods.morecraftables.configurator.Constants;
import org.gotti.wurmunlimited.modloader.interfaces.WurmServerMod;
import org.gotti.wurmunlimited.modsupport.actions.ActionPerformer;
import org.gotti.wurmunlimited.modsupport.actions.BehaviourProvider;
import org.gotti.wurmunlimited.modsupport.actions.ModAction;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;
import java.util.Collections;
import java.util.List;

public class AusAltarPray implements WurmServerMod, ItemTypes, MiscConstants, ModAction, BehaviourProvider, ActionPerformer {

    private static short PRAYID;
    private static ActionEntry PRAYActionEntry;

    public AusAltarPray() {
        PRAYID = (short) ModActions.getNextActionId();
        PRAYActionEntry = ActionEntry.createEntry(PRAYID, "Pray", "Converting", new int[]{});
        ModActions.registerAction(PRAYActionEntry);
    }

    @Override
    public BehaviourProvider getBehaviourProvider() {
        return this;
    }

    @Override
    public ActionPerformer getActionPerformer() {
        return this;
    }

    @Override
    public short getActionId() {
        return PRAYID;
    }


    @Override
    public List<ActionEntry> getBehavioursFor(Creature performer, Item source, Item target) {
        return getBehavioursFor(performer, target);
    }

    @Override
    public List<ActionEntry> getBehavioursFor(Creature performer, Item target) {
        if (performer instanceof Player) {
            if (target.getTemplateId() == Constants.AltarofThreeTemplateID) {
                return Collections.singletonList(PRAYActionEntry);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public boolean action(Action act, Creature performer, Item source, Item target, short action, float counter) {
        return action(act, performer, target, action, counter);
    }

    @Override
    public boolean action(Action act, Creature performer, Item target, short action, float counter) {
        boolean done = false;
        if(action == PRAYID && target.getTemplateId() == Constants.AltarofThreeTemplateID) {
            done = MethodsReligion.pray(act, performer, target, counter);
        }
        return done;
    }
}