package proclient.module.render;

import java.util.ArrayList;

import proclient.module.Category;
import proclient.module.Module;
import proclient.module.ModuleManager;
import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import net.minecraft.block.Block;

public class Xray extends Module {
    public static boolean enabled;
    private float oldGamma;
    public ArrayList<Block> xrayBlocks = new ArrayList<Block>();
    public Xray() {
        super("X-Ray", KeyboardConstants.KEY_NONE, Category.RENDER);
    }

	public void onUpdate(){
    if(!this.isToggled()){
        return;
    }
    Xray.enabled = true;
    this.oldGamma = mc.gameSettings.gammaSetting;
    mc.gameSettings.gammaSetting = 10.0f;
    mc.gameSettings.ambientOcclusion = 0;
    mc.renderGlobal.loadRenderers();
    }

    public void onDisable() {
        Xray.enabled = false;
        mc.gameSettings.gammaSetting = oldGamma;
        mc.gameSettings.ambientOcclusion = 1;
        mc.renderGlobal.loadRenderers();
    }

    public boolean shouldXrayBlock(Block blockid) {
        if(this.xrayBlocks.contains(blockid)) {
            return true;
        }
        return false;

    }


    
}
