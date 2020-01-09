package me.moose.Chat;

import mindustry.gen.Call;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Discord extends ListenerAdapter{
	public JDA jda;
    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
    	String Message = (e.getAuthor().getName() + " " + e.getMessage());
    	Call.sendMessage(Message);
    }
}
