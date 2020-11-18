/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cmdbuild.utils.cli.commands;

import java.util.Iterator;
import java.util.Map;
import org.apache.commons.cli.CommandLine;
import org.cmdbuild.utils.cli.utils.CliAction;

import org.cmdbuild.utils.cli.utils.CliCommandParser;


public class AlfrescoCommandRunner extends AbstractCommandRunner {

    private final Map<String, CliAction> actions;

    public AlfrescoCommandRunner() {
        super("alfresco", "alfresco utils");
        actions = new CliCommandParser().parseActions(this);
    }

    @Override
    protected void exec(CommandLine cmd) throws Exception {

    }

}
