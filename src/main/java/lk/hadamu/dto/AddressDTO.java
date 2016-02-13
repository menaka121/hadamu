package lk.hadamu.dto;

import javax.validation.constraints.NotNull;

public class AddressDTO {

    @NotNull
    private String addressLine1;

    @NotNull
    private String addressLine2;

    @NotNull
    private String addressLine3;

    @NotNull
    private String city;

    @NotNull
    private String district;

    @NotNull
    private String telephone;
}
