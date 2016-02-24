package com.github.cstroe.swagger.docgen.task;

import io.swagger.models.License;
import org.apache.tools.ant.Project;

public class AntInfoLicense extends License {

    private final Project project;

    public AntInfoLicense(Project project) {
        this.project = project;
    }

    @SuppressWarnings("unused")
    public WriteBack createUrl() {
        return new WriteBack(project, this, "url");
    }

    @SuppressWarnings("unused")
    public WriteBack createName() {
        return new WriteBack(project, this, "name");
    }
}
