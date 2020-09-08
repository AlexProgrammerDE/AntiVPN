package dev.brighten.pl.commands;

import cc.funkemunky.api.Atlas;
import cc.funkemunky.api.commands.ancmd.Command;
import cc.funkemunky.api.commands.ancmd.CommandAdapter;
import cc.funkemunky.api.utils.Init;
import dev.brighten.pl.AntiVPN;

@Init(commands = true)
public class VpnCommand {

    @Command(name = "kaurivpn", description = "The Kauri AntiVPN main command.",
            aliases = {"antivpn"}, permission = "kvpn.command")
    public void onCommand(CommandAdapter cmd) {
        Atlas.getInstance().getCommandManager(AntiVPN.INSTANCE).runHelpMessage(cmd,
                cmd.getSender(), Atlas.getInstance().getCommandManager(AntiVPN.INSTANCE).getDefaultScheme());
    }
}
