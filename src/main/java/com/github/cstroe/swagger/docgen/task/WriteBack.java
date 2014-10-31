package com.github.cstroe.swagger.docgen.task;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.tools.ant.BuildException;

import java.lang.reflect.InvocationTargetException;

/**
 * This is a clunky way to deal with nested XML elements of the <apiSource> tag.
 */
public class WriteBack {
    private String property;
    private Object parent;

    public WriteBack(Object parent, String property) {
        this.parent = parent;
        this.property = property;
    }

    public void addText(String text) {
        try {
            BeanUtils.setProperty(parent, property, text);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new BuildException(e);
        }
    }
}
