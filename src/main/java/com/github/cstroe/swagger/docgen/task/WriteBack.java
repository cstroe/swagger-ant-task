package com.github.cstroe.swagger.docgen.task;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

import java.lang.reflect.InvocationTargetException;

/**
 * This is a clunky way to deal with nested XML elements of the <apiSource> tag.
 */
public class WriteBack {
    private final Project project;
    private String property;
    private Object parent;

    public WriteBack(Project project, Object parent, String property) {
        this.project = project;
        this.parent = parent;
        this.property = property;
    }

    public void addText(String text) {
        try {
            BeanUtils.setProperty(parent, property, project.replaceProperties(text));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new BuildException(e);
        }
    }
}
