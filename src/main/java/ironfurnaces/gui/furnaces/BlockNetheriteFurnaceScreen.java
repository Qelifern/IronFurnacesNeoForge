package ironfurnaces.gui.furnaces;

import ironfurnaces.container.furnaces.BlockNetheriteFurnaceContainer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;


public class BlockNetheriteFurnaceScreen extends BlockIronFurnaceScreenBase<BlockNetheriteFurnaceContainer> {


    public BlockNetheriteFurnaceScreen(BlockNetheriteFurnaceContainer container, Inventory inv, Component name) {
        super(container, inv, name);
        GUI = GUI_NETHERITE;
    }

}
