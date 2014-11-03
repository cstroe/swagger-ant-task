package com.github.cstroe.swagger.docgen.task;

import com.github.kongchen.swagger.docgen.mavenplugin.ApiSource;
import org.apache.tools.ant.Project;

public class AntApiSource extends ApiSource {

    private final Project project;

    public AntApiSource(Project project) {
        this.project = project;
    }

    @SuppressWarnings("unused")
    public AntApiSourceInfo createApiInfo() {
        return new AntApiSourceInfo(project);
    }

    @SuppressWarnings("unused")
    public WriteBack createLocations() {
        return new WriteBack(project, this, "locations");
    }

    @SuppressWarnings("unused")
    public WriteBack createApiVersion() {
        return new WriteBack(project, this, "apiVersion");
    }

    @SuppressWarnings("unused")
    public WriteBack createBasePath() {
        return new WriteBack(project, this, "basePath");
    }

    @SuppressWarnings("unused")
    public WriteBack createOverridingModels() {
        return new WriteBack(project, this, "overridingModels");
    }

    @SuppressWarnings("unused")
    public WriteBack createSwaggerInternalFilter() {
        return new WriteBack(project, this, "swaggerInternalFilter");
    }

    @SuppressWarnings("unused")
    public WriteBack createOutputTemplate() {
        return new WriteBack(project, this, "outputTemplate");
    }

    @SuppressWarnings("unused")
    public WriteBack createMustacheFileRoot() {
        return new WriteBack(project, this, "mustacheFileRoot");
    }

    @SuppressWarnings("unused")
    public WriteBack createOutputPath() {
        return new WriteBack(project, this, "outputPath");
    }

    @SuppressWarnings("unused")
    public WriteBack createSwaggerDirectory() {
        return new WriteBack(project, this, "swaggerDirectory");
    }

    @SuppressWarnings("unused")
    public WriteBack createSwaggerUIDocBasePath() {
        return new WriteBack(project, this, "swaggerUIDocBasePath");
    }

    @SuppressWarnings("unused")
    public WriteBack createUseOutputFlatStructure() {
        return new WriteBack(project, this, "useOutputFlatStructure");
    }

    @Override
    public String toString() {
        return "locations  = " + getLocations() + "\n" +
               "apiInfo    = " + getApiInfo() + "\n" +
               "apiVersion = " + getApiVersion() + "\n" +
               "basePath   = " + getBasePath();
    }
}