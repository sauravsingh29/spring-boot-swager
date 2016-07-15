package com.ss.poc;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class Greeting {
	private final long id;
    private final String user;
 
    public Greeting(long id, String user) {
        this.id = id;
        this.user = user;
    }
 
    public long getId() {
        return id;
    }
 
    @JsonProperty(required = true)
    @ApiModelProperty(notes = "The name of the user", required = true)
    public String getContent() {
        return user;
    }
}
