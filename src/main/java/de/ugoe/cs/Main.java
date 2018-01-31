/*
 * Copyright (C) 2017 University of Goettingen, Germany
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.ugoe.cs;

import com.lexicalscope.jewel.cli.CliFactory;
import de.ugoe.cs.smartshark.CLIArguments;
import de.ugoe.cs.smartshark.SmartSHARKPlugin;
import java.io.IOException;
import org.eclipse.jgit.api.errors.GitAPIException;

/**
 * @author Fabian Trautsch
 */
public class Main {

    public static void main(String[] args) {
        try {
            CLIArguments cliArguments = CliFactory.parseArguments(CLIArguments.class, args);
            SmartSHARKPlugin smartSHARKPlugin = new SmartSHARKPlugin(cliArguments);
            smartSHARKPlugin.storeDataViaBugfixCommits();
        } catch (IOException | GitAPIException e) {
            e.printStackTrace();
        }

    }


}