package proclient.module.render;

import proclient.Dragon;
import proclient.module.Category;
import proclient.module.Module;
import proclient.settings.Setting;

import java.util.ArrayList;

import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

public class ClickGui extends Module {
    public ClickGui clickgui;

    public ClickGui() {
        super("ClickGui", KeyboardConstants.KEY_RSHIFT, Category.RENDER);
    }

    public void onEnable() {
    	if(this.clickgui == null)
    		this.clickgui = new ClickGui();
    	
        mc.displayGuiScreen(Dragon.getClickgui());
    	super.onEnable();
        }

    public void onDisable() {
        super.onDisable();
        mc.displayGuiScreen((GuiScreen) null);
        mc.setIngameFocus();
    }
}
