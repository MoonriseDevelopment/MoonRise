package proclient.util;


import net.lax1dude.eaglercraft.v1_8.opengl.EaglercraftGPU;
import net.lax1dude.eaglercraft.v1_8.opengl.GlStateManager;
import net.lax1dude.eaglercraft.v1_8.opengl.RealOpenGLEnums;
import net.lax1dude.eaglercraft.v1_8.opengl.WorldRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;

import java.awt.Color;

public class ResentUtils {


    public static void drawOtherRoundedRect(float paramXStart, float paramYStart, float paramXEnd, float paramYEnd, float radius, int color, boolean popPush) {
        float alpha = (color >> 24 & 0xFF) / 255.0F;
        float red = (color >> 16 & 0xFF) / 255.0F;
        float green = (color >> 8 & 0xFF) / 255.0F;
        float blue = (color & 0xFF) / 255.0F;

        float z = 0;
        if (paramXStart > paramXEnd) {
            z = paramXStart;
            paramXStart = paramXEnd;
            paramXEnd = z;
        }

        if (paramYStart > paramYEnd) {
            z = paramYStart;
            paramYStart = paramYEnd;
            paramYEnd = z;
        }

        double x1 = (double) (paramXStart + radius);
        double y1 = (double) (paramYStart + radius);
        double x2 = (double) (paramXEnd - radius);
        double y2 = (double) (paramYEnd - radius);

        if (popPush) GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.enableTexture2D();
        GlStateManager.blendFunc(RealOpenGLEnums.GL_SRC_ALPHA, RealOpenGLEnums.GL_ONE_MINUS_SRC_ALPHA);
        EaglercraftGPU.glLineWidth(1);
        //glEnable(GL_LINE_SMOOTH);

        GlStateManager.color(red, green, blue, alpha);

        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldrenderer = tessellator.getWorldRenderer();

        worldrenderer.begin(RealOpenGLEnums.GL_POLYGON, DefaultVertexFormats.POSITION_TEX);
        worldrenderer.begin(RealOpenGLEnums.GL_LINE_SMOOTH, DefaultVertexFormats.POSITION_TEX);

        double degree = Math.PI / 180;
        for (double i = 0; i <= 90; i += 1) glVertex2d(x2 + Math.sin(i * degree) * radius, y2 + Math.cos(i * degree) * radius);
        for (double i = 90; i <= 180; i += 1) glVertex2d(x2 + Math.sin(i * degree) * radius, y1 + Math.cos(i * degree) * radius);
        for (double i = 180; i <= 270; i += 1) glVertex2d(x1 + Math.sin(i * degree) * radius, y1 + Math.cos(i * degree) * radius);
        for (double i = 270; i <= 360; i += 1) glVertex2d(x1 + Math.sin(i * degree) * radius, y2 + Math.cos(i * degree) * radius);
        EaglercraftGPU.glEndList();

        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        //glDisable(GL_LINE_SMOOTH);
        if (popPush) GlStateManager.popMatrix();
    }

    public static void glVertex2d(double idk, double idk2) {
        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldrenderer = tessellator.getWorldRenderer();
        worldrenderer.pos(idk, idk2, 0);
    }

    public static void drawRoundedRect(final float left, final float top, final float right, final float bottom, final float radius, final int color, boolean... forceOverride) {
        final float f1 = (color >> 24 & 0xFF) / 255.0f;
        final float f2 = (color >> 16 & 0xFF) / 255.0f;
        final float f3 = (color >> 8 & 0xFF) / 255.0f;
        final float f4 = (color & 0xFF) / 255.0f;
        GlStateManager.color(f2, f3, f4, f1);
            Gui.drawRect((int) left, (int) top, (int) right, (int) bottom, color);
        }

    public static void drawRoundedRect(final float paramFloat1, final float paramFloat2, final float paramFloat3, final float paramFloat4, final float paramFloat5) {
        final int i = 18;
        final float f1 = 90.0f / i;

        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldrenderer = tessellator.getWorldRenderer();

        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableCull();
        GlStateManager.enableColorMaterial();
        GlStateManager.blendFunc(770, 771);
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.shadeModel(7425);
        worldrenderer.begin(5, DefaultVertexFormats.POSITION_TEX);

        worldrenderer.pos(paramFloat1 + paramFloat5, paramFloat2, 0).endVertex();
        worldrenderer.pos(paramFloat1 + paramFloat5, paramFloat4, 0).endVertex();
        worldrenderer.pos(paramFloat3 - paramFloat5, paramFloat2, 0).endVertex();
        worldrenderer.pos(paramFloat3 - paramFloat5, paramFloat4, 0).endVertex();
        tessellator.draw();
        worldrenderer.begin(5, DefaultVertexFormats.POSITION_TEX);
        worldrenderer.pos(paramFloat1, paramFloat2 + paramFloat5, 0).endVertex();
        worldrenderer.pos(paramFloat1 + paramFloat5, paramFloat2 + paramFloat5, 0).endVertex();
        worldrenderer.pos(paramFloat1, paramFloat4 - paramFloat5, 0).endVertex();
        worldrenderer.pos(paramFloat1 + paramFloat5, paramFloat4 - paramFloat5, 0).endVertex();
        tessellator.draw();
        worldrenderer.begin(5, DefaultVertexFormats.POSITION_TEX);
        worldrenderer.pos(paramFloat3, paramFloat2 + paramFloat5, 0).endVertex();
        worldrenderer.pos(paramFloat3 - paramFloat5, paramFloat2 + paramFloat5, 0).endVertex();
        worldrenderer.pos(paramFloat3, paramFloat4 - paramFloat5, 0).endVertex();
        worldrenderer.pos(paramFloat3 - paramFloat5, paramFloat4 - paramFloat5, 0).endVertex();
        tessellator.draw();
        worldrenderer.begin(6, DefaultVertexFormats.POSITION_TEX);
        float f2 = paramFloat3 - paramFloat5;
        float f3 = paramFloat2 + paramFloat5;
        worldrenderer.pos(f2, f3, 0).endVertex();
        for (int j = 0; j <= i; ++j) {
            final float f4 = j * f1;
            worldrenderer.pos((float) (f2 + paramFloat5 * Math.cos(Math.toRadians(f4))), (float) (f3 - paramFloat5 * Math.sin(Math.toRadians(f4))), 0).endVertex();
        }
        tessellator.draw();
        worldrenderer.begin(6, DefaultVertexFormats.POSITION_TEX);
        f2 = paramFloat1 + paramFloat5;
        f3 = paramFloat2 + paramFloat5;
        worldrenderer.pos(f2, f3, 0).endVertex();
        for (int j = 0; j <= i; ++j) {
            final float f4 = j * f1;
            worldrenderer.pos((float) (f2 - paramFloat5 * Math.cos(Math.toRadians(f4))), (float) (f3 - paramFloat5 * Math.sin(Math.toRadians(f4))), 0).endVertex();
        }
        tessellator.draw();
        worldrenderer.begin(6, DefaultVertexFormats.POSITION_TEX);
        f2 = paramFloat1 + paramFloat5;
        f3 = paramFloat4 - paramFloat5;
        worldrenderer.pos(f2, f3, 0).endVertex();
        for (int j = 0; j <= i; ++j) {
            final float f4 = j * f1;
            worldrenderer.pos((float) (f2 - paramFloat5 * Math.cos(Math.toRadians(f4))), (float) (f3 + paramFloat5 * Math.sin(Math.toRadians(f4))), 0).endVertex();
        }
        tessellator.draw();
        worldrenderer.begin(6, DefaultVertexFormats.POSITION_TEX);
        f2 = paramFloat3 - paramFloat5;
        f3 = paramFloat4 - paramFloat5;
        worldrenderer.pos(f2, f3, 0).endVertex();
        for (int j = 0; j <= i; ++j) {
            final float f4 = j * f1;
            worldrenderer.pos((float) (f2 + paramFloat5 * Math.cos(Math.toRadians(f4))), (float) (f3 + paramFloat5 * Math.sin(Math.toRadians(f4))), 0).endVertex();
        }
        tessellator.draw();
        GlStateManager.shadeModel(7424);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.disableColorMaterial();
        GlStateManager.enableTexture2D();
    }

    public static void drawRectOutline(double param1, double param2, double width1, double height1, int color) {
        Gui.drawRect(param1, param2, width1, param2 + 1, color);
        Gui.drawRect(param1, param2, param1 + 1, height1, color);
        Gui.drawRect(width1 - 1, param2, width1, height1, color);
        Gui.drawRect(param1, height1 - 1, width1, height1, color);
    }

    public static int getRainbow(float seconds, float saturation, float brightness) {
        float hue = (System.currentTimeMillis()) % (int) (seconds * 1000) / (seconds * 1000);
        int color = Color.HSBtoRGB(hue, saturation, brightness);
        return color;
    }

    public static int getRainbow1(int delay) {
        double rainbowState = Math.ceil((System.currentTimeMillis() + delay) / 20.0);
        rainbowState %= 360;
        return Color.HSBtoRGB((float) (rainbowState / 360.0f), 0.8f, 0.7f);
    }
}