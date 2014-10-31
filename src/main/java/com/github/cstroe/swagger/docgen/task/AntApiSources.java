package com.github.cstroe.swagger.docgen.task;

import com.github.kongchen.swagger.docgen.mavenplugin.ApiSource;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by cosmin on 10/31/14.
 */
public class AntApiSources {
    private List<ApiSource> apiSources = new LinkedList<>();

    public AntApiSource createApiSource() {
        AntApiSource source = new AntApiSource();
        apiSources.add(source);
        return source;
    }

    public List<ApiSource> getSources() {
        return this.apiSources;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append(apiSources.size()).append(" api source(s).");
        int i = 1;
        for (ApiSource source : apiSources) {
            b.append(i).append(". ==============");
            b.append(source);
        }
        return b.toString();
    }
}
