package com.org.config;

public final class ConfigFactory { // supplies configs, no one can extend this as it is final class
    protected static FrameworkConfig config; // least scope that is possible to give any reference
    private ConfigFactory(){}// no one can instantiate object of this class
    public static FrameworkConfig getConfig(){
        config = org.aeonbits.owner.ConfigFactory.create(FrameworkConfig.class);
        return config;
    }
}
