package proclient.module.render;

import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import net.lax1dude.eaglercraft.v1_8.opengl.EaglercraftGPU;
import net.lax1dude.eaglercraft.v1_8.opengl.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import proclient.Dragon;
import proclient.event.Event;
import proclient.event.events.EventRenderNametag;
import proclient.event.events.EventRenderWorld;
import proclient.module.Category;
import proclient.module.Module;
import proclient.settings.Setting;


@SuppressWarnings("rawtypes")
public class Nametags extends Module {
    private final Setting Enchants = new Setting("Enchants", this, true);
    public Nametags() {
        super("Nametags", KeyboardConstants.KEY_NONE, Category.RENDER);
        addAll(Enchants);
    }

    public static void renderItem(ItemStack stack, int x, int y) {
        GlStateManager.pushMatrix();
        GlStateManager.depthMask(true);
        GlStateManager.clear(256);
        RenderHelper.enableGUIStandardItemLighting();
        Minecraft.getMinecraft().getRenderItem().zLevel = -100.0f;
        GlStateManager.scale(1.0f, 1.0f, 0.01f);
        GlStateManager.enableDepth();
        Minecraft.getMinecraft().getRenderItem().renderItemAndEffectIntoGUI(stack, x, y + 8);
        Minecraft.getMinecraft().getRenderItem().renderItemOverlayIntoGUI(Minecraft.getMinecraft().fontRendererObj, stack, x - 1, y + 10, null);
        Minecraft.getMinecraft().getRenderItem().zLevel = 0.0f;
        GlStateManager.scale(1.0f, 1.0f, 1.0f);
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableCull();
        GlStateManager.enableAlpha();
        GlStateManager.disableBlend();
        GlStateManager.disableLighting();
        GlStateManager.scale(0.5, 0.5, 0.5);
        GlStateManager.disableDepth();
        if (!Dragon.setmgr.getSettingByName("Enchants").isEnabled()) {
        Nametags.renderEnchantmentText(stack, x, y);
     }
        GlStateManager.enableDepth();
        GlStateManager.scale(2.0f, 2.0f, 2.0f);
        GlStateManager.popMatrix();
    }

    public static void renderEnchantmentText(ItemStack stack, int x, int y) {
        int enchantmentY = y - 24;
        if (stack.getEnchantmentTagList() != null && stack.getEnchantmentTagList().tagCount() >= 6) {
           Minecraft.getMinecraft().fontRendererObj.drawString("god", x * 2, enchantmentY, -43177);
        } else {
           int color = 0xFFFFFF;
           int sharpnessLevel;
           int knockbackLevel;
           int fireAspectLevel;
           if (stack.getItem() instanceof ItemArmor) {
              sharpnessLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.protection.effectId, stack);
              knockbackLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.projectileProtection.effectId, stack);
              fireAspectLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.blastProtection.effectId, stack);
              int fireProtectionLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.fireProtection.effectId, stack);
              int thornsLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.thorns.effectId, stack);
              int featherFallingLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.featherFalling.effectId, stack);
              int unbreakingLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, stack);
              if (sharpnessLevel > 0) {
                Minecraft.getMinecraft().fontRendererObj.drawString("prot" + sharpnessLevel, x * 2, enchantmentY, color);
                 enchantmentY += 8;
              }
  
              if (unbreakingLevel > 0) {
                Minecraft.getMinecraft().fontRendererObj.drawString("unbr" + unbreakingLevel, x * 2, enchantmentY, color);
                 enchantmentY += 8;
              }
  
              if (knockbackLevel > 0) {
                Minecraft.getMinecraft().fontRendererObj.drawString("proj" + knockbackLevel, x * 2, enchantmentY, color);
                 enchantmentY += 8;
              }
  
              if (fireAspectLevel > 0) {
                Minecraft.getMinecraft().fontRendererObj.drawString("blast" + fireAspectLevel, x * 2, enchantmentY, color);
                 enchantmentY += 8;
              }
  
              if (fireProtectionLevel > 0) {
                Minecraft.getMinecraft().fontRendererObj.drawString("firep" + fireProtectionLevel, x * 2, enchantmentY, color);
                 enchantmentY += 8;
              }
  
              if (thornsLevel > 0) {
                Minecraft.getMinecraft().fontRendererObj.drawString("thorn" + thornsLevel, x * 2, enchantmentY, color);
                 enchantmentY += 8;
              }
  
              if (featherFallingLevel > 0) {
                Minecraft.getMinecraft().fontRendererObj.drawString("feather" + featherFallingLevel, x * 2, enchantmentY, color);
                 enchantmentY += 8;
              }
           }
  
           if (stack.getItem() instanceof ItemBow) {
              sharpnessLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);
              knockbackLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);
              fireAspectLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack);
              if (sharpnessLevel > 0) {
                Minecraft.getMinecraft().fontRendererObj.drawString("pow" + sharpnessLevel, x * 2, enchantmentY, color);
                 enchantmentY += 8;
              }
  
              if (knockbackLevel > 0) {
                Minecraft.getMinecraft().fontRendererObj.drawString("punch" + knockbackLevel, x * 2, enchantmentY, color);
                 enchantmentY += 8;
              }
  
              if (fireAspectLevel > 0) {
                Minecraft.getMinecraft().fontRendererObj.drawString("flame" + fireAspectLevel, x * 2, enchantmentY, color);
                 enchantmentY += 8;
              }
           }
  
           if (stack.getItem() instanceof ItemPickaxe) {
              sharpnessLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.efficiency.effectId, stack);
              knockbackLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, stack);
              if (sharpnessLevel > 0) {
                Minecraft.getMinecraft().fontRendererObj.drawString("effi" + sharpnessLevel, x * 2, enchantmentY, color);
                 enchantmentY += 8;
              }
  
              if (knockbackLevel > 0) {
                Minecraft.getMinecraft().fontRendererObj.drawString("fort" + knockbackLevel, x * 2, enchantmentY, color);
                 enchantmentY += 8;
              }
           }
  
           if (stack.getItem() instanceof ItemAxe) {
              sharpnessLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, stack);
              knockbackLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, stack);
              fireAspectLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.efficiency.effectId, stack);
              if (sharpnessLevel > 0) {
                Minecraft.getMinecraft().fontRendererObj.drawString("sharp" + sharpnessLevel, x * 2, enchantmentY, color);
                 enchantmentY += 8;
              }
  
              if (knockbackLevel > 0) {
                Minecraft.getMinecraft().fontRendererObj.drawString("fire" + knockbackLevel, x * 2, enchantmentY, color);
                 enchantmentY += 8;
              }
  
              if (fireAspectLevel > 0) {
                Minecraft.getMinecraft().fontRendererObj.drawString("effi" + fireAspectLevel, x * 2, enchantmentY, color);
                 enchantmentY += 8;
              }
           }
  
           if (stack.getItem() instanceof ItemSword) {
              sharpnessLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, stack);
              knockbackLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, stack);
              fireAspectLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, stack);
              if (sharpnessLevel > 0) {
                Minecraft.getMinecraft().fontRendererObj.drawString("sharp" + sharpnessLevel, x * 2, enchantmentY, color);
                 enchantmentY += 8;
              }
  
              if (knockbackLevel > 0) {
                Minecraft.getMinecraft().fontRendererObj.drawString("knock" + knockbackLevel, x * 2, enchantmentY, color);
                 enchantmentY += 8;
              }
  
              if (fireAspectLevel > 0) {
                Minecraft.getMinecraft().fontRendererObj.drawString("fire" + fireAspectLevel, x * 2, enchantmentY, color);
                 enchantmentY += 8;
              }
           }
  
           if (stack.getItem() == Items.golden_apple && stack.hasEffect()) {
            Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow("god", (float)(x * 2), (float)enchantmentY, -3977919);
           }
        }
    }

    public void onEvent(Event e) {
        if (e instanceof EventRenderNametag) {
            e.setCancelled(true);
        }
        if (e instanceof EventRenderWorld) {
            FontRenderer fr = Minecraft.getMinecraft().fontRendererObj;

            for (EntityPlayer entity : mc.theWorld.playerEntities) {

                if (entity.isInvisible() || entity == mc.thePlayer)
                    continue;

                GlStateManager.pushMatrix();


                double x = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * mc.timer.renderPartialTicks - mc.getRenderManager().renderPosX;
                double y = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * mc.timer.renderPartialTicks - mc.getRenderManager().renderPosY;
                double z = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * mc.timer.renderPartialTicks - mc.getRenderManager().renderPosZ;
                //float distance = mc.thePlayer.getDistanceToEntity(entity);


                GlStateManager.translate(x, y + entity.getEyeHeight() + 1.7, z);
                EaglercraftGPU.glNormal3f(0, 1, 0);
                if (mc.gameSettings.thirdPersonView == 2) {
                    GlStateManager.rotate(-mc.getRenderManager().playerViewY, 0, 1, 0);
                    GlStateManager.rotate(-mc.getRenderManager().playerViewX, 1, 0, 0);
                } else {
                    GlStateManager.rotate(-mc.thePlayer.rotationYaw, 0, 1, 0);
                    GlStateManager.rotate(mc.thePlayer.rotationPitch, 1, 0, 0);
                }
                float distance = mc.thePlayer.getDistanceToEntity(entity),
                        scaleConst_1 = 0.02672f, scaleConst_2 = 0.10f;
                double maxDist = 7.0;


                float scaleFactor = (float) (distance <= maxDist ? maxDist * scaleConst_2 : (double) (distance * scaleConst_2));
                scaleConst_1 *= scaleFactor;

                float scaleBet = (float) (5 * 10E-3);
                scaleConst_1 = Math.min(scaleBet, scaleConst_1);


                GlStateManager.scale(-scaleConst_1, -scaleConst_1, .2f);

                GlStateManager.disableLighting();
                GlStateManager.depthMask(false);
                GlStateManager.disableDepth();


                String colorCode = entity.getHealth() > 15 ? "\247a" : entity.getHealth() > 10 ? "\247e" : entity.getHealth() > 7 ? "\2476" : "\247c";
                int colorrectCode = entity.getHealth() > 15 ? 0xff4DF75B : entity.getHealth() > 10 ? 0xffF1F74D : entity.getHealth() > 7 ? 0xffF7854D : 0xffF7524D;
                String thing = entity.getName() + " " + colorCode + (int) entity.getHealth();
                float namewidth = (float) fr.getStringWidth(thing);


                Gui.drawRect(-namewidth / 2 - 2, 42, namewidth / 2 + 2, 40, 0x90080808);
                    Gui.drawRect(-namewidth / 2 - 15, 42, namewidth / 2 + 15 - (1 - (entity.getHealth() / entity.getMaxHealth())) * (namewidth + 4), 40, colorrectCode);
                    Gui.drawRect(-namewidth / 2 - 15, 20, namewidth / 2 + 15, 40, 0x90202020);


                fr.drawStringWithShadow(entity.getName(), -20, 23, -1);
                fr.drawStringWithShadow(colorCode + (int) entity.getHealth(), namewidth / 2, 23, -1);

                GlStateManager.disableBlend();
                GlStateManager.depthMask(true);
                GlStateManager.enableDepth();


                double movingArmor = 1.2;

                if (namewidth <= 65) {
                    movingArmor = 2;
                }
                if (namewidth <= 85) {
                    movingArmor = 1.2;
                }

                if (namewidth <= 100) {
                    movingArmor = 1.1;
                }
                    for (int index = 0; index < 5; index++) {

                        if (entity.getEquipmentInSlot(index) == null)
                            continue;


                        renderItem(entity.getEquipmentInSlot(index), (int) (index * 19 / movingArmor) - 30, -10);


                    }

                GlStateManager.popMatrix();

            }
        }

    }

}
