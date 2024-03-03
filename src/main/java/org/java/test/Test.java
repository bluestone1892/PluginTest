package org.java.test;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.java.test.command.CustomCommand;
import org.java.test.event.JoinEvent;
import org.java.test.event.BreakEvent;

import java.util.logging.Logger;

public final class Test extends JavaPlugin {

    PluginDescriptionFile pdf = this.getDescription(); //또는 getDescription();


    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new JoinEvent(), this);
        getServer().getPluginManager().registerEvents(new BreakEvent(), this);
        getCommand("test").setExecutor(new CustomCommand());
        Logger log = this.getLogger(); //또는 getLogger();
        log.info("엄 플러그인이 활성화 되었습니다(버젼 : " + pdf.getVersion() + ")");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Logger log = this.getLogger(); //또는 getLogger();
        log.info("엄 플러그인이 비활성화 되었습니다.");
    }
}