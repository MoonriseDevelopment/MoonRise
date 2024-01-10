package proclient.util;


import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.lax1dude.eaglercraft.v1_8.opengl.EaglercraftGPU;
import net.lax1dude.eaglercraft.v1_8.opengl.GlStateManager;

public class MobEspUtil {
	public static void entityESPBox(Entity entity, int mode) {
		GlStateManager.blendFunc(770, 771);
		GlStateManager.enableBlend();
		EaglercraftGPU.glLineWidth(2.0F);
		GlStateManager.disableTexture2D();
		GlStateManager.disableDepth();
		GlStateManager.depthMask(false);
		if(mode == 0) //Enemy
            GlStateManager.color(1,  0, 0, 0.5F);
					
		
		else if(mode == 1)//mob
            GlStateManager.color(0, 1, 0, 0.5F);
		else if(mode == 2)//other
            GlStateManager.color(1, 1, 0, 0.5F);

		Minecraft.getMinecraft().getRenderManager();
		RenderGlobal.func_181561_a(
				new AxisAlignedBB(
						entity.boundingBox.minX
							-0.05
							- entity.posX
							+ (entity.posX - Minecraft.getMinecraft().getRenderManager().renderPosX),
						entity.boundingBox.minY
							-0.05
							- entity.posY
							+ (entity.posY - Minecraft.getMinecraft().getRenderManager().renderPosY),
						entity.boundingBox.minZ
							-0.05
							- entity.posZ
							+ (entity.posZ - Minecraft.getMinecraft().getRenderManager().renderPosZ),
						entity.boundingBox.maxX
							+0.05
							- entity.posX
							+ (entity.posX - Minecraft.getMinecraft().getRenderManager().renderPosX),
						entity.boundingBox.maxY
							+0.1
							- entity.posY
							+ (entity.posY - Minecraft.getMinecraft().getRenderManager().renderPosY),
						entity.boundingBox.maxZ
							+0.05
							- entity.posZ
							+ (entity.posZ - Minecraft.getMinecraft().getRenderManager().renderPosZ)));
		
        GlStateManager.enableTexture2D();
		GlStateManager.enableDepth();
		GlStateManager.depthMask(true);
		GlStateManager.disableBlend();
					
					
		
		
		
	}

}