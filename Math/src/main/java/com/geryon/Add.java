
package com.geryon;

import java.util.List;

import org.apache.karaf.shell.api.action.Action;
import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.Option;
import org.apache.karaf.shell.api.action.lifecycle.Service;

@Command(scope = "Math", name = "add", description = "Adds simple whole digits together")
@Service
public class Add implements Action {

    @Option(name = "-o", aliases = { "--option" }, description = "An option to the command", required = false, multiValued = false)
    private String option;

    @Argument(name = "-d", description = "Argument to the command", required = false, multiValued = true)
    private List<Integer> digits;

    @Override
    public Object execute() throws Exception {
        //  System.out.println("Executing command add");
        //  System.out.println("Option: " + option);
         System.out.println("Digits: \n");
         for(Integer digit:digits)
         {
            System.out.print(digit + "\n");
         }
         return null;
    }
}
