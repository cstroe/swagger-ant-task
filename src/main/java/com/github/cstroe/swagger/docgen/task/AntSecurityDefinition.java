package com.github.cstroe.swagger.docgen.task;

import com.github.kongchen.swagger.docgen.mavenplugin.SecurityDefinition;
import org.apache.tools.ant.Project;

/**
 * AntSecurityDefinition
 * <p/>
 *
 * @author $Author$
 * @version $Revision$
 *          <p>Copyright (c) 2003 - 2016 CGI IT Czech Republic s.r.o. </p>
 */
public class AntSecurityDefinition extends SecurityDefinition {
    private final Project project;

    public AntSecurityDefinition(Project project) {
        this.project = project;
    }

    @SuppressWarnings("unused")
    public WriteBack createName() {
        return new WriteBack(project, this, "name");
    }

    @SuppressWarnings("unused")
    public WriteBack createType() {
        return new WriteBack(project, this, "type");
    }

    @SuppressWarnings("unused")
    public WriteBack createDescription() {
        return new WriteBack(project, this, "description");
    }

    @SuppressWarnings("unused")
    public WriteBack createJson() {
        return new WriteBack(project, this, "json");
    }
}
