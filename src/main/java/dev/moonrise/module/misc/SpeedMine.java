package dev.moonrise.module.misc;

import dev.moonrise.module.Category;
import dev.moonrise.module.Module;
import org.lwjgl.input.Keyboard;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.PotionEffect;

public class SpeedMine extends Module {
  public SpeedMine() {
    super("SpeedMine", Keyboard.KEY_NONE, Category.MISC);
  }
  
  public void onEnable() {
    Minecraft.getMinecraft().thePlayer.addPotionEffect(new PotionEffect(3, 999999999, 1));
  }
  
  public void onDisable() {
    Minecraft.getMinecraft().thePlayer.removePotionEffect(3);
  }
}