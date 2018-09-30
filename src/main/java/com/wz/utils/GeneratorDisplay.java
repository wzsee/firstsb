package com.wz.utils;

import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GeneratorDisplay {

    public void gennerator() throws Exception{
        List<String> warnings = new ArrayList<>();
        boolean overide =  true;
        File configFile = new File("generatorConfig.xml");
//        Configuration config = new ConfigurationParser(warnings);
    }

}
