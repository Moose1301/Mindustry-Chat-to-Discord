package me.moose.Chat;

import javax.security.auth.login.LoginException;

import arc.*;
import arc.util.*;
import mindustry.game.EventType;
import mindustry.plugin.Plugin;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main extends Plugin{
	public static JDA jda;
    //register event handlers and create variables in the constructor
    public Main(){
    	startBot();
    	Events.on(EventType.PlayerJoin.class, (event) -> {
    		String PlayerNameJoin = event.player.name;
    		jda.getTextChannelById("664926990591197203").sendMessage(PlayerNameJoin);
    	});
    	Events.on(EventType.PlayerLeave.class, (event) -> {
    		String PlayerNameLeave = event.player.name;
    		jda.getTextChannelById("664926990591197203").sendMessage(PlayerNameLeave);
    	});
    }	
	private void startBot() {
        try {
			jda = new JDABuilder(AccountType.BOT).setToken("NjY0OTI3MTUzMTU4MDk0OTA3.XheLsw.cRPrC2qOqLVp0czJNHbQ0YTR-Uo").build();
			jda.addEventListener(new Chat());
			jda.addEventListener(new Discord());
		} catch (LoginException e) {
			System.out.print("ERROR");
			e.printStackTrace();
			System.out.print("ERROR");
		}
}

    //register commands that run on the server
    @Override
    public void registerServerCommands(CommandHandler handler){

    }

    //register commands that player can invoke in-game
    @Override
    public void registerClientCommands(CommandHandler handler){
    }
}
