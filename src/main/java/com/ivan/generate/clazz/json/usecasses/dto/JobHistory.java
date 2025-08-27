package com.ivan.generate.clazz.json.usecasses.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class JobHistory {
    private String organisationName;
    private String position;
    private LocalDate dateStart;
    private LocalDate dateEnd;
}
