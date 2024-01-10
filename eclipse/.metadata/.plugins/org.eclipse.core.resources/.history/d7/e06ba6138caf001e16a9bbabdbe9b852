package proclient.module.render;

import proclient.module.Category;
import proclient.module.Module;
import proclient.util.MobEspUtil;
import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;

public class MobEsp extends Module{
    public MobEsp() {
        super("MobEsp", KeyboardConstants.KEY_NONE, Category.RENDER);
    }

    public void onRender() {
		if(this.isToggled()) {
			for(Object h : mc.theWorld.loadedEntityList) {
				if(h instanceof EntityMob) {
					MobEspUtil.entityESPBox((Entity)h, 1);
				}else if( h instanceof EntityAnimal) {
					MobEspUtil.entityESPBox((Entity)h, 1);
				}
			}
		}
    }
}
