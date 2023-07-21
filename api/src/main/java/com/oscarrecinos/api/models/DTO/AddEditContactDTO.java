package com.oscarrecinos.api.models.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class AddEditContactDTO {
    @NotBlank
    private String name;
    @NotBlank
    private String phone;

    public AddEditContactDTO(){}

    public AddEditContactDTO(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
