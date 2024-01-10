package proclient.module.render;

import proclient.module.Category;
import proclient.module.Module;
import proclient.util.MobEspUtil;
import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;

public class ItemEsp extends Module {
    public ItemEsp() {
        super("ItemEsp", KeyboardConstants.KEY_NONE, Category.RENDER);
    }

    public void onRender() {
		if(this.isToggled()) {
			for(Object h : mc.theWorld.loadedEntityList) {
				if(h instanceof EntityItem) {
					MobEspUtil.entityESPBox((Entity)h, 2);
				}
			}
		}
    }
}
