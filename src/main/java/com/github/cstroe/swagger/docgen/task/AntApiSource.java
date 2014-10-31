package com.github.cstroe.swagger.docgen.task;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.github.kongchen.swagger.docgen.mavenplugin.ApiSource;
import com.wordnik.swagger.annotations.Api;
import org.apache.tools.ant.BuildException;
import org.reflections.Reflections;

/**
 * Created with IntelliJ IDEA.
 * User: kongchen
 * Date: 3/7/13
 */
public class AntApiSource extends ApiSource {

    public AntApiSourceInfo createApiInfo() {
        return new AntApiSourceInfo();
    }

    public WriteBack createLocations() {
        return new WriteBack(this, "locations");
    }

    public WriteBack createApiVersion() {
        return new WriteBack(this, "apiVersion");
    }

    public WriteBack createBasePath() {
        return new WriteBack(this, "basePath");
    }

    public WriteBack createOverridingModels() {
        return new WriteBack(this, "overridingModels");
    }

    public WriteBack createSwaggerInternalFilter() {
        return new WriteBack(this, "swaggerInternalFilter");
    }

    public WriteBack createOutputTemplate() {
        return new WriteBack(this, "outputTemplate");
    }

    public WriteBack createMustacheFileRoot() {
        return new WriteBack(this, "mustacheFileRoot");
    }

    public WriteBack createOutputPath() {
        return new WriteBack(this, "outputPath");
    }

    public WriteBack createSwaggerDirectory() {
        return new WriteBack(this, "swaggerDirectory");
    }

    public WriteBack createSwaggerUIDocBasePath() {
        return new WriteBack(this, "swaggerUIDocBasePath");
    }

    public WriteBack createUseOutputFlatStructure() {
        return new WriteBack(this, "useOutputFlatStructure");
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