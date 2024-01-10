package proclient.module.render;

import proclient.module.Category;
import proclient.module.Module;
import proclient.util.ChestEspUtil;
import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import net.minecraft.tileentity.TileEntityBeacon;
import net.minecraft.tileentity.TileEntityBrewingStand;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityEnchantmentTable;
import net.minecraft.tileentity.TileEntityFurnace;

public class StorageEsp extends Module {
    public StorageEsp() {
        super("StorageEsp", KeyboardConstants.KEY_NONE, Category.RENDER);
    }

    public void onRender() {
        if(this.isToggled()) {
            for(Object o: mc.theWorld.loadedTileEntityList) {
                if(o instanceof TileEntityChest) {
                    ChestEspUtil.blockESPBox(((TileEntityChest)o).getPos());
                }else if(o instanceof TileEntityBeacon) {
				    ChestEspUtil.blockESPBox(((TileEntityBeacon)o).getPos());
				}else if(o instanceof TileEntityFurnace) {
				    ChestEspUtil.blockESPBox(((TileEntityFurnace)o).getPos());
                }else if(o instanceof TileEntityEnchantmentTable) {
                    ChestEspUtil.blockESPBox(((TileEntityEnchantmentTable)o).getPos());
                }else if(o instanceof TileEntityBrewingStand) {
				    ChestEspUtil.blockESPBox(((TileEntityBrewingStand)o).getPos());
        }
    }
}
}
}
