package com.github.cstroe.swagger.docgen.task;

import org.apache.maven.plugin.logging.Log;
import org.apache.tools.ant.Project;

public class MavenToAntLogProxy implements Log {

    private final Project project;

    public MavenToAntLogProxy(Project project) {
        this.project = project;
    }

    @Override
    public boolean isDebugEnabled() {
        return true;
    }

    @Override
    public void debug(CharSequence charSequence) {
        project.log(charSequence.toString(), Project.MSG_DEBUG);
    }

    @Override
    public void debug(CharSequence charSequence, Throwable throwable) {
        project.log(charSequence.toString(), throwable, Project.MSG_DEBUG);
    }

    @Override
    public void debug(Throwable throwable) {
        project.log("", throwable, Project.MSG_DEBUG);
    }

    @Override
    public boolean isInfoEnabled() {
        return true;
    }

    @Override
    public void info(CharSequence charSequence) {
        project.log(charSequence.toString(), Project.MSG_INFO);
    }

    @Override
    public void info(CharSequence charSequence, Throwable throwable) {
        project.log(charSequence.toString(), throwable, Project.MSG_INFO);
    }

    @Override
    public void info(Throwable throwable) {
        project.log("", throwable, Project.MSG_INFO);
    }

    @Override
    public boolean isWarnEnabled() {
        return true;
    }

    @Override
    public void warn(CharSequence charSequence) {
        project.log(charSequence.toString(), Project.MSG_WARN);
    }

    @Override
    public void warn(CharSequence charSequence, Throwable throwable) {
        project.log(charSequence.toString(), throwable, Project.MSG_WARN);
    }

    @Override
    public void warn(Throwable throwable) {
        project.log("", throwable, Project.MSG_WARN);
    }

    @Override
    public boolean isErrorEnabled() {
        return true;
    }

    @Override
    public void error(CharSequence charSequence) {
        project.log(charSequence.toString(), Project.MSG_ERR);
    }

    @Override
    public void error(CharSequence charSequence, Throwable throwable) {
        project.log(charSequence.toString(), throwable, Project.MSG_ERR);
    }

    @Override
    public void error(Throwable throwable) {
        project.log("", throwable, Project.MSG_ERR);
    }
}
