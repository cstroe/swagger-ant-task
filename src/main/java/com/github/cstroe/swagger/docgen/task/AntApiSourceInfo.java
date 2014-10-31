package com.github.cstroe.swagger.docgen.task;

import com.github.kongchen.swagger.docgen.mavenplugin.ApiSourceInfo;

/**
 * Created by chekong on 8/15/14.
 */
public class AntApiSourceInfo extends ApiSourceInfo {

    public WriteBack createTitle() {
        return new WriteBack(this, "title");
    }

    public WriteBack createDescription() {
        return new WriteBack(this, "description");
    }

    public WriteBack createTermsOfServiceUrl() {
        return new WriteBack(this, "termsOfServiceUrl");
    }

    public WriteBack createContact() {
        return new WriteBack(this, "contact");
    }

    public WriteBack createLicense() {
        return new WriteBack(this, "license");
    }

    public WriteBack createLicenseUrl() {
        return new WriteBack(this, "licenceUrl");
    }
}
