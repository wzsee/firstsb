package com.wz.pojo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class VaildSampleForm {

    @NotBlank
    @Size(max = 5)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
