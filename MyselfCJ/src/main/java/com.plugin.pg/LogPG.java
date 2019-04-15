package com.plugin.pg;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name="log")
public class LogPG extends AbstractMojo {
    @Parameter(property = "log.name",defaultValue = "tom")
    private Object name;
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("hello,"+name+"this is myself log");
    }
}
