#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * ${robotName} generated free by NoraUi Oraganization https://github.com/NoraUi
 * ${robotName} is licensed under the licence BSD.
 * 
 * CAUTION: ${robotName} use NoraUi library. This project is licensed under the licence GNU AFFERO GENERAL PUBLIC LICENSE
 */
package ${package}.main;

import ${package}.utils.${robotName}Context;

import com.github.noraui.main.ScenarioInitiator;

public class ScenarioInitiatorRunner {

    public static void main(String[] args) {
        ${robotName}Context.getInstance().initializeEnv("${robotName}.properties");
        new ScenarioInitiator().start(args);
    }

}
