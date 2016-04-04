package com.github.cstroe.swagger.docgen.task;

import io.swagger.models.Contact;
import org.apache.tools.ant.Project;

public class AntInfoContact extends Contact {

    private final Project project;

    public AntInfoContact(Project project) {
        this.project = project;
    }

    @SuppressWarnings("unused")
    public WriteBack createName() {
        return new WriteBack(project, this, "name");
    }

    @SuppressWarnings("unused")
    public WriteBack createUrl() {
        return new WriteBack(project, this, "url");
    }

    @SuppressWarnings("unused")
    public WriteBack createEmail() {
        return new WriteBack(project, this, "email");
    }
}
