package com.josemarcellio.evelynresourcepack.command;

import com.josemarcellio.evelynresourcepack.Main;
import com.josemarcellio.evelynresourcepack.configuration.EvelynConfiguration;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ResourcePackCommand implements CommandExecutor
{
    public Main plugin;
    public ResourcePackCommand(Main instance) {
        this.plugin = instance;
    }

    public boolean onCommand(final @NotNull CommandSender sender, final @NotNull Command command, final @NotNull String label, final String[] args) {
        if (sender instanceof Player) {
            final Player p = (Player)sender;
            new EvelynConfiguration(this.plugin).send(p);
        }
        return false;
    }
}
