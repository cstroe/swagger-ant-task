package com.github.cstroe.swagger.docgen.task;

import com.github.kongchen.swagger.docgen.mavenplugin.ApiSource;
import org.apache.tools.ant.Project;

public class AntApiSource extends ApiSource {

    private final Project project;

    public AntApiSource(Project project) {
        this.project = project;
    }

    @SuppressWarnings("unused")
    public AntInfo createInfo() {
        AntInfo antInfo = new AntInfo(project);
        setInfo(antInfo);
        return antInfo;
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

    @SuppressWarnings("unused")
    public WriteBack createSpringmvc() {
        return new WriteBack(project, this, "springmvc");
    }

    @SuppressWarnings("unused")
    public WriteBack createSchemes() {
        return new WriteBack(project, this, "schemes");
    }

    @SuppressWarnings("unused")
    public WriteBack createHost() {
        return new WriteBack(project, this, "host");
    }

    @SuppressWarnings("unused")
    public WriteBack createTemplatePath() {
        return new WriteBack(project, this, "templatePath");
    }

    @SuppressWarnings("unused")
    public WriteBack createAttachSwaggerArtifact() {
        return new WriteBack(project, this, "attachSwaggerArtifact");
    }

    @SuppressWarnings("unused")
    public WriteBack createModelSubstitute() {
        return new WriteBack(project, this, "modelSubstitute");
    }

    @SuppressWarnings("unused")
    public WriteBack createApiSortComparator() {
        return new WriteBack(project, this, "apiSortComparator");
    }

    @SuppressWarnings("unused")
    public WriteBack createSwaggerApiReader() {
        return new WriteBack(project, this, "swaggerApiReader");
    }

    @SuppressWarnings("unused")
    public WriteBack createUseJAXBAnnotationProcessor() {
        return new WriteBack(project, this, "useJAXBAnnotationProcessor");
    }

    @SuppressWarnings("unused")
    public WriteBack createSwaggerSchemaConverter() {
        return new WriteBack(project, this, "swaggerSchemaConverter");
    }
    
    // typesToSkip
    
    // apiModelPropertyAccessExclusions

    @SuppressWarnings("unused")
    public WriteBack createJsonExampleValues() {
        return new WriteBack(project, this, "jsonExampleValues");
    }

    @SuppressWarnings("unused")
    public WriteBack createDescriptionFile() {
        return new WriteBack(project, this, "descriptionFile");
    }
    
    // modelConverters
    

    @SuppressWarnings("unused")
    public AntSecurityDefinitions createSecurityDefinitions() {
        AntSecurityDefinitions antSecurityDefinitions = new AntSecurityDefinitions(project);
        setSecurityDefinitions(antSecurityDefinitions);
        return antSecurityDefinitions;
    }

    @Override
    public String toString() {
        return "locations  = " + getLocations() + "\n" +
                "basePath   = " + getBasePath();
    }
}