package com.github.cstroe.swagger.docgen;

import com.github.cstroe.swagger.docgen.task.AntApiSources;
import com.github.cstroe.swagger.docgen.task.MavenToAntLogProxy;
import com.github.kongchen.swagger.docgen.mavenplugin.ApiDocumentMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.MatchingTask;

/**
 * Wraps an {@link com.github.kongchen.swagger.docgen.mavenplugin.ApiDocumentMojo}.
 */
public class SwaggerTask extends MatchingTask {

    private boolean verbose = false;
    private boolean debug = false;

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

    public boolean getVerbose() {
        return verbose;
    }
    public void setVerbose(boolean verbose) {
        this.verbose = verbose;
    }

    public boolean getDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public AntApiSources createApiSources() {
        this.sources = new AntApiSources();
        return this.sources;
    }
}
