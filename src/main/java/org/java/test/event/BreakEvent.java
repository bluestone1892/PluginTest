package org.java.test.event;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BreakEvent implements Listener {

    private ItemStack dia = new ItemStack(Material.DIAMOND, 1);

    @EventHandler
    public void breakDirt(BlockBreakEvent e) {
        Material brBlock = e.getBlock().getBlockData().getMaterial();
        if(brBlock == Material.DIRT || brBlock == Material.GRASS_BLOCK){
            Player p = e.getPlayer();
            p.getInventory().addItem(dia);
            p.sendMessage("다이아를 획득했습니다.");
            }
        }
    }



