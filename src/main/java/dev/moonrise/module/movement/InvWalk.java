package dev.moonrise.module.movement;


import org.lwjgl.input.Keyboard;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.settings.GameSettings;
import dev.moonrise.event.Event;
import dev.moonrise.module.Category;
import dev.moonrise.module.Module;

public class InvWalk extends Module {
    public InvWalk() {
        super("invMove", Keyboard.KEY_NONE, Category.MOVEMENT);
    }

    public void onEvent(Event e) {

        // TODO: Use arrow keys to control camera

        if ((mc.currentScreen instanceof GuiContainer)) {
            mc.gameSettings.keyBindForward.pressed = GameSettings.isKeyDown(mc.gameSettings.keyBindForward);
            mc.gameSettings.keyBindBack.pressed = GameSettings.isKeyDown(mc.gameSettings.keyBindBack);
            mc.gameSettings.keyBindRight.pressed = GameSettings.isKeyDown(mc.gameSettings.keyBindRight);
            mc.gameSettings.keyBindLeft.pressed = GameSettings.isKeyDown(mc.gameSettings.keyBindLeft);
            mc.gameSettings.keyBindJump.pressed = GameSettings.isKeyDown(mc.gameSettings.keyBindJump);
            mc.gameSettings.keyBindSprint.pressed = GameSettings.isKeyDown(mc.gameSettings.keyBindSprint);
        }
    }

    public void onDisable() {
        if (!GameSettings.isKeyDown(mc.gameSettings.keyBindForward) || mc.currentScreen != null)
            mc.gameSettings.keyBindForward.pressed = false;
        if (!GameSettings.isKeyDown(mc.gameSettings.keyBindBack) || mc.currentScreen != null)
            mc.gameSettings.keyBindBack.pressed = false;
        if (!GameSettings.isKeyDown(mc.gameSettings.keyBindRight) || mc.currentScreen != null)
            mc.gameSettings.keyBindRight.pressed = false;
        if (!GameSettings.isKeyDown(mc.gameSettings.keyBindLeft) || mc.currentScreen != null)
            mc.gameSettings.keyBindLeft.pressed = false;
        if (!GameSettings.isKeyDown(mc.gameSettings.keyBindJump) || mc.currentScreen != null)
            mc.gameSettings.keyBindJump.pressed = false;
        if (!GameSettings.isKeyDown(mc.gameSettings.keyBindSprint) || mc.currentScreen != null)
            mc.gameSettings.keyBindSprint.pressed = false;
        super.onDisable();
    }
}