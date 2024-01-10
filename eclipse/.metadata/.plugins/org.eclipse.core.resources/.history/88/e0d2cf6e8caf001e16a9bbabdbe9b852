package proclient.module.render;



import net.lax1dude.eaglercraft.v1_8.opengl.GlStateManager;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import proclient.event.Event;
import proclient.event.events.EventRender2D;
import proclient.module.Category;
import proclient.module.Module;
import proclient.module.RenderModule;

public class Radar extends RenderModule {

	public Radar() {
		super("Radar", 0, Category.RENDER, 0, 0, 50, 50);
	}
	
	public void onEvent(Event e) {
		if(e instanceof EventRender2D) {
			GlStateManager.pushMatrix();
			int x = this.x + 4;
			int y = this.y - 46;
			int size = 70;
			Gui.drawRect(x, y, x + size, y + size, 0x90000000);
			for(Entity ent : mc.theWorld.loadedEntityList) {
				if(ent instanceof EntityLivingBase) {
					double posX = mc.thePlayer.posX - ent.posX;
					double posZ = mc.thePlayer.posZ - ent.posZ;
					if(posX <= size /2 && posX >= -size /2 && posZ <= size /2 && posZ >= -size /2)
						if(ent == mc.thePlayer) {
							Gui.drawRect(posX - 1 + x + (size / 2), posZ - 1 + y + (size / 2), posX + 1 + x + (size / 2), posZ + 1 + y + (size / 2), 0xFF00FF00);
						}
						else
							if(!ent.isInvisible() && ent instanceof EntityPlayer) 
								Gui.drawRect(posX - 0.5 + x + (size / 2), posZ - 0.5 + y + (size / 2), posX + 0.5 + x + (size / 2), posZ + 0.5 + y + (size / 2), 0xFFFF0000);
			}
			GlStateManager.popMatrix();
		}
	  }
	}
}