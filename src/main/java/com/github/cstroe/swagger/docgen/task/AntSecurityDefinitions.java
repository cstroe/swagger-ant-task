package com.github.cstroe.swagger.docgen.task;

import com.github.kongchen.swagger.docgen.mavenplugin.SecurityDefinition;
import org.apache.tools.ant.Project;

import java.util.ArrayList;

/**
 * AntSecurityDefinitions
 * <p/>
 *
 * @author $Author$
 * @version $Revision$
 *          <p>Copyright (c) 2003 - 2016 CGI IT Czech Republic s.r.o. </p>
 */
public class AntSecurityDefinitions extends ArrayList<SecurityDefinition> {
    private final Project project;

    public AntSecurityDefinitions(Project project) {
        this.project = project;
    }

    @SuppressWarnings("unused")
    public AntSecurityDefinition createSecurityDefinition() {
        AntSecurityDefinition antSecurityDefinition = new AntSecurityDefinition(project);
        add(antSecurityDefinition);
        return antSecurityDefinition;
    }
}
