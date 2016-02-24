package com.github.cstroe.swagger.docgen.task;

import io.swagger.models.Info;
import org.apache.tools.ant.Project;

public class AntInfo extends Info {

    private final Project project;

    public AntInfo(Project project) {
        this.project = project;
    }

    @SuppressWarnings("unused")
    public WriteBack createTitle() {
        return new WriteBack(project, this, "title");
    }

    @SuppressWarnings("unused")
    public WriteBack createVersion() {
        return new WriteBack(project, this, "version");
    }

    @SuppressWarnings("unused")
    public WriteBack createDescription() {
        return new WriteBack(project, this, "description");
    }

    @SuppressWarnings("unused")
    public WriteBack createTermsOfService() {
        return new WriteBack(project, this, "termsOfService");
    }

    @SuppressWarnings("unused")
    public AntInfoContact createContact() {
        AntInfoContact antInfoContact = new AntInfoContact(project);
        setContact(antInfoContact);
        return antInfoContact;
    }

    @SuppressWarnings("unused")
    public AntInfoLicense createLicense() {
        AntInfoLicense antInfoLicense = new AntInfoLicense(project);
        setLicense(antInfoLicense);
        return antInfoLicense;
    }

}
