package com.panitz.techblog;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by vilterpanitz on 19/09/16.
 */
public class User {

    private final long id;
    private final String name;


    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @ApiModelProperty(notes = "Generated dynamically")
    public long getId() {
        return id;
    }

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "The name of the user", required = true)
    public String getName() {
        return name;
    }

}
