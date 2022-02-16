/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.eventhandler.SubscribeEvent
 *  cpw.mods.fml.common.gameevent.PlayerEvent$PlayerLoggedInEvent
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.IChatComponent
 */
package net.divinerpg.utils.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import java.io.IOException;
import net.divinerpg.utils.MessageLocalizer;
import net.divinerpg.utils.Util;
import net.divinerpg.utils.config.ConfigurationHelper;
import net.divinerpg.utils.events.UpdateChecker;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IChatComponent;

public class EventClientLogin {
    @SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent evt) {
        EntityPlayer p = evt.player;
        if (!p.worldObj.isRemote) {
            if (!UpdateChecker.isOnline() && !ConfigurationHelper.canShowOverlay) {
                if (Util.isDeveloperName(p.getCommandSenderName())) {
                    p.addChatMessage(Util.getChatComponent(MessageLocalizer.normal("message.developer")));
                } else {
                    p.addChatMessage((IChatComponent)Util.addChatMessage(MessageLocalizer.standard(p.getDisplayName()), new Object[0]));
                }
                p.addChatMessage((IChatComponent)Util.addChatMessage(MessageLocalizer.normal("message.version.internet", Util.LIGHT_PURPLE), new Object[0]));
            } else if (UpdateChecker.isOnline() && UpdateChecker.isUpdateAvailable() && !ConfigurationHelper.canShowOverlay) {
                p.addChatMessage((IChatComponent)Util.addChatMessage(MessageLocalizer.standard(p.getDisplayName()), new Object[0]));
                p.addChatMessage((IChatComponent)Util.addChatMessage("message.version.update", Util.RED));
                try {
                    p.addChatMessage((IChatComponent)Util.addChatMessage(MessageLocalizer.version(UpdateChecker.getCurrentVersion()), new Object[0]));
                }
                catch (IOException e) {
                    p.addChatMessage((IChatComponent)Util.addChatMessage(MessageLocalizer.normal("message.version.unable", Util.RED), new Object[0]));
                }
            } else {
                p.addChatMessage((IChatComponent)Util.addChatMessage(MessageLocalizer.standard(p.getDisplayName()), new Object[0]));
            }
        }
    }
}

