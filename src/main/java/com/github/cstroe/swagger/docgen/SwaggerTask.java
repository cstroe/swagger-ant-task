package com.github.cstroe.swagger.docgen;

import com.github.cstroe.swagger.docgen.task.AntApiSources;
import com.github.cstroe.swagger.docgen.task.MavenToAntLogProxy;
import com.github.kongchen.swagger.docgen.mavenplugin.ApiDocumentMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

/**
 * Wraps an {@link com.github.kongchen.swagger.docgen.mavenplugin.ApiDocumentMojo}.
 */
public class SwaggerTask extends Task {

    private AntApiSources sources;

    /**
     * Execute the Swagger task.
     */
    @Override
    public void execute() throws BuildException {
        if (sources == null) {
            getProject().log("No api sources defined.");
            return;
        }

        ApiDocumentMojo mojo = new ApiDocumentMojo();
        mojo.setApiSources(sources.getSources());
        mojo.setLog(new MavenToAntLogProxy(getProject()));
        try {
            mojo.execute();
        } catch (MojoExecutionException | MojoFailureException e) {
            throw new BuildException(e);
        }
    }

    @SuppressWarnings("unused")
    public AntApiSources createApiSources() {
        this.sources = new AntApiSources(getProject());
        return this.sources;
    }
}
