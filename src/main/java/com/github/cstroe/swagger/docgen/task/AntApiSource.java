package com.github.cstroe.swagger.docgen.task;

import com.github.kongchen.swagger.docgen.mavenplugin.ApiSource;
import org.apache.tools.ant.Project;

/**
 * Created with IntelliJ IDEA.
 * User: kongchen
 * Date: 3/7/13
 */
public class AntApiSource extends ApiSource {

    private final Project project;

    public AntApiSource(Project project) {
        this.project = project;
    }

    public AntApiSourceInfo createApiInfo() {
        return new AntApiSourceInfo(project);
    }

    public WriteBack createLocations() {
        return new WriteBack(project, this, "locations");
    }

    public WriteBack createApiVersion() {
        return new WriteBack(project, this, "apiVersion");
    }

    public WriteBack createBasePath() {
        return new WriteBack(project, this, "basePath");
    }

    public WriteBack createOverridingModels() {
        return new WriteBack(project, this, "overridingModels");
    }

    public WriteBack createSwaggerInternalFilter() {
        return new WriteBack(project, this, "swaggerInternalFilter");
    }

    public WriteBack createOutputTemplate() {
        return new WriteBack(project, this, "outputTemplate");
    }

    public WriteBack createMustacheFileRoot() {
        return new WriteBack(project, this, "mustacheFileRoot");
    }

    public WriteBack createOutputPath() {
        return new WriteBack(project, this, "outputPath");
    }

    public WriteBack createSwaggerDirectory() {
        return new WriteBack(project, this, "swaggerDirectory");
    }

    public WriteBack createSwaggerUIDocBasePath() {
        return new WriteBack(project, this, "swaggerUIDocBasePath");
    }

    public WriteBack createUseOutputFlatStructure() {
        return new WriteBack(project, this, "useOutputFlatStructure");
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("locations  = ").append(getLocations());
        b.append("apiInfo    = ").append(getApiInfo());
        b.append("apiVersion = ").append(getApiVersion());
        b.append("basePath   = ").append(getBasePath());
        return b.toString();
    }
}