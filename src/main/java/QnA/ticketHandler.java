package QnA;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import java.awt.*;
import java.util.ArrayList;

public class ticketHandler {
    public static ArrayList<Ticket> tickets = new ArrayList();
    public static long logChannelID = 0;
    public static Guild g;

    public static void addTicket(Ticket t){
        tickets.add(t);
        EmbedBuilder embed = new EmbedBuilder().setTitle("Ticket " + t.getTicketNum() + "\nUser: " + t.getUser())
                .setDescription(t.getProblem() + "\nresolved: " + t.getIsResolved());
        embed.setColor(Color.RED);
        g.getTextChannelById(logChannelID).sendMessage(embed.build()).queue();
    }

    public static void resolveTicket(int index){
        Ticket temp = tickets.get(index);
        temp.setIsResolved();
        tickets.set(index, temp);
    }

    public static void getTicket(int index, GuildMessageReceivedEvent e){
        EmbedBuilder embed = new EmbedBuilder().setTitle("Ticket " + tickets.get(index).getTicketNum() + "\nUser: " + tickets.get(index).getUser())
                .setDescription(tickets.get(index).getProblem() + "\nresolved: " + tickets.get(index).getIsResolved());
        embed.setColor(Color.RED);
        e.getChannel().sendMessage(embed.build()).queue();
    }

    public static void setLogChannelID(long id){
        logChannelID = id;
    }
}
