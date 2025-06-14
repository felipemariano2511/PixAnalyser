package br.com.unicuritiba.pixanalyzer.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DictApiResponseDto {
    private String keyType;

    private String keyValue;

    private Account account;

    private Owner owner;

    private String createdAt;

    public String getInstitution() {
        return account != null ? account.getInstitution() : null;
    }

    @Getter
    @Setter
    public static class Account {
        private String institution;
        private String branch;
        private String number;
        private String type;
    }

    @Getter
    @Setter
    public static class Owner {
        private String type;
        private String name;
        private String taxIdNumber;
    }
}