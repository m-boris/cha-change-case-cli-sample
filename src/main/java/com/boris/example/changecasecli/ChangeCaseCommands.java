package com.boris.example.changecasecli;

import com.boris.example.changecasecli.model.StatisticsReport;
import com.boris.example.changecasecli.service.StatisticsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class ChangeCaseCommands {

    @Autowired
    StatisticsService statisticsService;

    @ShellMethod( "To upper case" )
    public String u( @ShellOption( {"-s", "--string"} ) String text ){
        return text.toUpperCase();
    }

    @ShellMethod( "To lower case" )
    public String l( @ShellOption( {"-s", "--string"} ) String text ){
        return text.toUpperCase();
    }

    @ShellMethod( "Inverse case" )
    public String i(  @ShellOption( {"-s", "--string"} ) String text ){
        return StringUtils.swapCase( text );
    }

    @ShellMethod( "file statistics report" )
    public StatisticsReport fs(@ShellOption( {"-i", "--input"} ) String inputFilePath) {
        return statisticsService.getStaticsReport( inputFilePath );
    }
}
