package ru.kulemeevag.excel.demo.model;

import lombok.Getter;
import lombok.Setter;
import ru.kulemeevag.excel.demo.annotations.SheetColumn;

@Getter
@Setter
public class ExcelData {
    private Integer rowNum;

    @SheetColumn("RULE")
    private String rule;

    @SheetColumn("RULE_TYPE")
    private String ruleType;

    @SheetColumn("RESULT")
    private String result;
}
