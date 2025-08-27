package com.ivan.generate.clazz.json.usecasses.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class Person {
    private Long id;
    private String name;
    private LocalDate dateBirth;
    private List<JobHistory> jobHistoryList;
}
