package proclient.util;


import net.lax1dude.eaglercraft.v1_8.opengl.EaglercraftGPU;
import net.lax1dude.eaglercraft.v1_8.opengl.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;

public class ChestEspUtil {
	
	public static void blockESPBox(BlockPos blockPos) {
		
		double x =
				blockPos.getX()
					- Minecraft.getMinecraft().getRenderManager().renderPosX;
		double y =
				blockPos.getY()
					- Minecraft.getMinecraft().getRenderManager().renderPosY;
		double z =
				blockPos.getZ()
					- Minecraft.getMinecraft().getRenderManager().renderPosZ;
		
        GlStateManager.blendFunc(770, 771);
		GlStateManager.enableBlend();
		EaglercraftGPU.glLineWidth(2.0F);
		GlStateManager.color(1, 1, 0, 0.15F);
		GlStateManager.disableTexture2D();
		GlStateManager.disableDepth();
		GlStateManager.depthMask(false);
		
		//Box
		GlStateManager.color(0, 0, 1, 0.5F);
		RenderGlobal.func_181561_a(new AxisAlignedBB(x, y, z, x + 1.0, y + 1.0, z + 1.0));
		GlStateManager.enableTexture2D();
		GlStateManager.enableDepth();
		GlStateManager.depthMask(true);
		GlStateManager.disableBlend();
		
		
		
	}

}