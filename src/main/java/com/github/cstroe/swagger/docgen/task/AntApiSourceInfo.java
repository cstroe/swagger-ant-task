package com.github.cstroe.swagger.docgen.task;

import com.github.kongchen.swagger.docgen.mavenplugin.ApiSourceInfo;
import org.apache.tools.ant.Project;

public class AntApiSourceInfo extends ApiSourceInfo {

    private final Project project;

    public AntApiSourceInfo(Project project) {
        this.project = project;
    }

    @SuppressWarnings("unused")
    public WriteBack createTitle() {
        return new WriteBack(project, this, "title");
    }

    @SuppressWarnings("unused")
    public WriteBack createDescription() {
        return new WriteBack(project, this, "description");
    }

    @SuppressWarnings("unused")
    public WriteBack createTermsOfServiceUrl() {
        return new WriteBack(project, this, "termsOfServiceUrl");
    }

    @SuppressWarnings("unused")
    public WriteBack createContact() {
        return new WriteBack(project, this, "contact");
    }

    @SuppressWarnings("unused")
    public WriteBack createLicense() {
        return new WriteBack(project, this, "license");
    }

    @SuppressWarnings("unused")
    public WriteBack createLicenseUrl() {
        return new WriteBack(project, this, "licenceUrl");
    }
}
