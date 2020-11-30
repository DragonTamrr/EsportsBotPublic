package QnA;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class QnA extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent e){
        String[] message = e.getMessage().getContentRaw().split(" ");
        EmbedBuilder embed = new EmbedBuilder();
        embed.setColor(Color.RED);
        if(message[0].equalsIgnoreCase("!fisd") && message[1].equalsIgnoreCase("SetDefaultGuild")) {
            ticketHandler.g = e.getGuild();
            embed.setTitle("Default Guild Set!");
            e.getChannel().sendMessage(embed.build()).queue();
        }
        if(message[0].equalsIgnoreCase("!fisd") && message[1].equalsIgnoreCase("help") && message.length == 2) {
            embed.setTitle("Need some help? Here's some common questions type:\n\"!fisd help [number of question]\" for an answer!\n" +
                    " If you still need help please submit a help ticket using [!fisd help ticket] along with the question you have.");
            embed.setDescription("[1]What is FISD E-Sports?\n[2]How do I contact my school's club admin/sponsor?" +
                    "\n[3]How will matches works?" +
                    "\n[4]How do I join a team?\n[5]When are tryouts?\n[6]When is the next club meeting?" +
                    "\n[7]Why aren't Rainbow Six Siege and CS:GO on the roster?\n[8]Why isn't my favorite game on the roster?" +
                    "\n[9]How do I become a coach/team captain/club admin?\n[10]I have friends outside my school " +
                    "who play, are they allowed to join my team?\n[11]How do I get verified on the discord?" +
                    "\n[12]What contributes to eligibility to participate?\n[13]What is Battle.fy and how do I register?\n[14]What is Guilded and how do I register?" +
                    "\n[15]What do I do if my question isn't listed?");
            e.getChannel().sendMessage(embed.build()).queue();
        }



        else if(message[0].equalsIgnoreCase("!fisd") && message[1].equalsIgnoreCase("help")) {
            message[2] = message[2].toLowerCase();
            switch (message[2]) {
                case "1":
                    embed.setTitle("What is FISD E-Sports?").setDescription("We are a (mostly)student run organization working to push for E-Sports" +
                            "within Frisco ISD! Our mission is to bring an opportunity for students to compete and get their foot in the door in the E-Sports industry!");
                    e.getChannel().sendMessage(embed.build()).queue();
                    break;
                case "2":
                    embed.setTitle("How do I contact my school's club admin/sponsor?").setDescription("please message an admin for help figuring out your schools admin/sponsor.");
                    e.getChannel().sendMessage(embed.build()).queue();
                    break;
                case "3":
                    embed.setTitle("How will matches work?").setDescription("Once we begin our competitive season we will roll out team schedules using" +
                            "Battle.fy and Guilded.gg to keep you up to date with Wins/Losses for teams and the schedules for your matches!");
                    e.getChannel().sendMessage(embed.build()).queue();
                    break;
                case "4":
                    embed.setTitle("How do I join a team?").setDescription("You'll need to contact your club's administrator/sponsor for information on how to join a team as we don't run" +
                            " your club.");
                    e.getChannel().sendMessage(embed.build()).queue();
                    break;
                case "5":
                    embed.setTitle("When are tryouts?").setDescription("You'll need to contact your club's administrator/sponsor for information on tryouts as tryouts for teams are handled" +
                            " differently for each school.");
                    e.getChannel().sendMessage(embed.build()).queue();
                    break;
                case "6":
                    embed.setTitle("When is the next club meeting?").setDescription("We always send out an announcement before our meetings! check #announcements for information on our next meeting.");
                    e.getChannel().sendMessage(embed.build()).queue();
                    break;
                case "7":
                    embed.setTitle("Why aren't Rainbow Six Siege and CS:GO on the roster?").setDescription("Unfortunately due to their rating and violence/gore we are unable to add these games to our roster." +
                            " This was mandated by the district so we cannot overturn this decision.");
                    e.getChannel().sendMessage(embed.build()).queue();
                    break;
                case "8":
                    embed.setTitle("Why isn't my favorite game on the roster?").setDescription("For now we've only selected a handful of games to begin with, this list may expand as time goes on but the current selection of games include" +
                            " Overwatch, Smash Bros, Rocket League, Call of Duty, Fortnite, League of Legends, NBA2K, Madden, and Valorant.");
                    e.getChannel().sendMessage(embed.build()).queue();
                    break;
                case "9":
                    embed.setTitle("How do I become a coach/team captain/club admin?").setDescription("To become a leader for your club contact your club admin to see if any positions are available, and to start" +
                            " the application process!");
                    e.getChannel().sendMessage(embed.build()).queue();
                    break;
                case "10":
                    embed.setTitle("I have friends outside my school who play, are they allowed to join my team?").setDescription("Students outside of your school are ineligible to join your team, if your team" +
                            " recruits a member from outside of FISD your team will be ineligible to compete.");
                    e.getChannel().sendMessage(embed.build()).queue();
                    break;
                case "11":
                    embed.setTitle("How do I get verified on the discord?").setDescription("Fill out the verification form and then be patient! We have to manually review all applications so it may take a while for" +
                            " you to receive the verified role.");
                    e.getChannel().sendMessage(embed.build()).queue();
                    break;
                case "12":
                    embed.setTitle("What contributes to eligibility to participate?").setDescription("In order to participate you must A: be a FISD student, and B: Passing all of your classes.");
                    e.getChannel().sendMessage(embed.build()).queue();
                    break;
                case "13":
                    embed.setTitle("What is Battle.fy and how do I register?").setDescription("Battle.fy is what we're using to organize our season and matches, sign up by visiting battle.fy " +
                            "you can register an account using either your school email or your personal email.");
                    e.getChannel().sendMessage(embed.build()).queue();
                    break;
                case "14":
                    embed.setTitle("What is Guilded and how do I register?").setDescription("Guilded is a companion app to discord that we're using to organize our season and matches, sign up by visiting guilded.gg" +
                            " you can register an account using either your school email or your personal email.");
                    e.getChannel().sendMessage(embed.build()).queue();
                    break;
                case "15":
                    embed.setTitle("What do I do if my question isn't listed?").setDescription("If your question isn't listed please leave a support ticket! you can do so by typing: !fisd help ticket [insert your query here]\nExample: " +
                            "!fisd help ticket I need help what do I do?");
                    e.getChannel().sendMessage(embed.build()).queue();
                    break;
                case "ticket": embed.setTitle("Ticket Created!");
                String temp = "";
                for(int i = 3; i < message.length; i++){
                    temp += message[i] + " ";
                }
                    Ticket t = new Ticket(e.getAuthor().getName(), temp);
                    ticketHandler.addTicket(t);
                    e.getChannel().sendMessage(embed.build()).queue();
                    break;
                case "setid": ticketHandler.setLogChannelID(Long.parseLong(message[3]));
                embed.setTitle("Default channel set!");
                    e.getChannel().sendMessage(embed.build()).queue();
                break;
                case "resolve": embed.setTitle("Ticket " + message[3] + " resolved!");
                    e.getChannel().sendMessage(embed.build()).queue();
                ticketHandler.resolveTicket(Integer.parseInt(message[3]));
                break;
                case "getticket": ticketHandler.getTicket(Integer.parseInt(message[3]), e);
                break;
            }
        }
    }
}