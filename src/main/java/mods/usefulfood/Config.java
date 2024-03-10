package mods.usefulfood;
import java.io.File;
import net.minecraftforge.common.config.Configuration;

public class Config {
    public static boolean meatDropSheep = true;
    public static boolean meatDropSquid = true;

    public static void synchronizeConfiguration(File configFile) {
        Configuration configuration = new Configuration(configFile);

        meatDropSheep = configuration.get(Configuration.CATEGORY_GENERAL, "meatDropSheep", "true", "Whether sheep will drop mutton").getBoolean();
	meatDropSquid = configuration.get(Configuration.CATEGORY_GENERAL, "meatDropSquid", "true", "Whether squid will drop tentacles").getBoolean();

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}
