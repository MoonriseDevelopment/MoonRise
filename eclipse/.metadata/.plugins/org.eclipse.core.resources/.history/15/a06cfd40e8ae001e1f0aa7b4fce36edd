package proclient.util;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;

public class PlayerUtils3 {
   public static boolean isMoving() {
      return Minecraft.getMinecraft().thePlayer.lastTickPosX != Minecraft.getMinecraft().thePlayer.posX && Minecraft.getMinecraft().thePlayer.lastTickPosZ != Minecraft.getMinecraft().thePlayer.posZ || Minecraft.getMinecraft().thePlayer.motionX != 0.0D || Minecraft.getMinecraft().thePlayer.motionY != 0.0D || Minecraft.getMinecraft().thePlayer.motionZ != 0.0D;
   }

   public static boolean isInventoryFull() {
      for(int index = 9; index <= 44; ++index) {
         ItemStack stack = Minecraft.getMinecraft().thePlayer.inventoryContainer.getSlot(index).getStack();
         if (stack == null) {
            return false;
         }
      }

      return true;
   }

   public static double getDistanceToFall() {
      double distance = 0.0D;

      double i;
      for(i = Minecraft.getMinecraft().thePlayer.posY; i > 0.0D; --i) {
         Block block = BlockUtils.getBlock(new BlockPos(Minecraft.getMinecraft().thePlayer.posX, i, Minecraft.getMinecraft().thePlayer.posZ));
         if (block.getMaterial() != Material.air && block.isFullCube() && block.isCollidable()) {
            distance = i;
            break;
         }

         if (i < 0.0D) {
            break;
         }
      }

      i = Minecraft.getMinecraft().thePlayer.posY - distance - 1.0D;
      return i;
   }

   public static boolean MovementInput() {
      return Minecraft.getMinecraft().gameSettings.keyBindForward.isPressed() || Minecraft.getMinecraft().gameSettings.keyBindBack.isPressed() || Minecraft.getMinecraft().gameSettings.keyBindLeft.isPressed() || Minecraft.getMinecraft().gameSettings.keyBindRight.isPressed() || Minecraft.getMinecraft().gameSettings.keyBindSneak.isPressed();
   }

   public static float[] aimAtLocation(double x, double y, double z, EnumFacing facing) {
      EntitySnowball temp = new EntitySnowball(Minecraft.getMinecraft().theWorld);
      temp.posX = x + 0.5D;
      temp.posY = y + 0.5D;
      temp.posZ = z + 0.5D;
      temp.posX += (double)facing.getDirectionVec().getX() * 0.25D;
      temp.posY += (double)facing.getDirectionVec().getY() * 0.25D;
      temp.posZ += (double)facing.getDirectionVec().getZ() * 0.25D;
      return aimAtLocation(temp.posX, temp.posY, temp.posZ);
   }

   public static float[] aimAtLocation(double positionX, double positionY, double positionZ) {
      double x = positionX - Minecraft.getMinecraft().thePlayer.posX;
      double y = positionY - Minecraft.getMinecraft().thePlayer.posY;
      double z = positionZ - Minecraft.getMinecraft().thePlayer.posZ;
      double distance = (double)MathHelper.sqrt_double(x * x + z * z);
      return new float[]{(float)(Math.atan2(z, x) * 180.0D / 3.141592653589793D) - 90.0F, (float)(-(Math.atan2(y, distance) * 180.0D / 3.141592653589793D))};
   }
}