package proclient.module.render;

import proclient.module.Category;
import proclient.module.Module;
import proclient.util.MobEspUtil;
import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class PlayerEsp extends Module {
    public PlayerEsp() {
        super("PlayerEsp", KeyboardConstants.KEY_NONE, Category.RENDER);
    }

	public void onRender() {
		if(this.isToggled()) {
			for(Object e : mc.theWorld.loadedEntityList) {
				if(e instanceof EntityPlayer) {
					MobEspUtil.entityESPBox((Entity)e, 0);
				}
			}
		}
    }
}
