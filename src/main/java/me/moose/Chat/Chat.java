package me.moose.Chat;

import arc.Events;
import mindustry.game.EventType;
import net.dv8tion.jda.api.JDA;

public class Chat {
	public JDA jda;
	public Chat() {
	Events.on(EventType.PlayerChatEvent.class, (event) -> {
		String Chat = (event.player.name + event.message);
		jda.getTextChannelById("664926990591197203").sendMessage(Chat);
	});
}
}