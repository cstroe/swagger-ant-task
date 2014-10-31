package com.github.cstroe.swagger.docgen.task;

import com.github.kongchen.swagger.docgen.mavenplugin.ApiSourceInfo;
import org.apache.tools.ant.Project;

/**
 * Created by chekong on 8/15/14.
 */
public class AntApiSourceInfo extends ApiSourceInfo {

    private final Project project;

    public AntApiSourceInfo(Project project) {
        this.project = project;
    }

    public WriteBack createTitle() {
        return new WriteBack(project, this, "title");
    }

    public WriteBack createDescription() {
        return new WriteBack(project, this, "description");
    }

    public WriteBack createTermsOfServiceUrl() {
        return new WriteBack(project, this, "termsOfServiceUrl");
    }

    public WriteBack createContact() {
        return new WriteBack(project, this, "contact");
    }

    public WriteBack createLicense() {
        return new WriteBack(project, this, "license");
    }

    public WriteBack createLicenseUrl() {
        return new WriteBack(project, this, "licenceUrl");
    }
}
