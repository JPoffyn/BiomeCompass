package com.morolas.biocomp.configuration;

import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        //Create the configuration object from the given configuration file
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try
        {
            // Load the configuration file
            configuration.load();

            //Read in properties from the configuration file
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true); //true is default value
        }
        catch (Exception e)
        {
            // Log the exception
        }
        finally //No matter what happens, this will save the config
        {
            //Save the configuration file
            configuration.save();
        }

        System.out.println("Configuration Test: " + configValue);

    }
}
