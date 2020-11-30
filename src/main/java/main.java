import QnA.QnA;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import javax.security.auth.login.LoginException;

public class main {
    public static void main(String[] args) throws LoginException {
        JDABuilder jdabuilder = new JDABuilder("Insert Token Here")
                .setActivity(Activity.playing("type \"!fisd help\", if you have questions!"));
        JDA jda = jdabuilder.build();

        jda.addEventListener(new QnA());
    }
}
