package com.github.cstroe.swagger.docgen;

import org.apache.tools.ant.BuildFileTest;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by cosmin on 10/31/14.
 */
public class SwaggerTaskTest extends BuildFileTest {

    @Before
    public void setUp() {
        configureProject("src/test/resources/swagger-task-01.xml");
    }

    @Test
    public void testSimple() {
        executeTarget("swaggertask.first");
    }

}
