package com.with.you.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

/**
 * NoteBean
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoteBean {
    @NotBlank(message = "title 不能为空")
    private String title;
    @NotBlank(message = "text 不能为空")
    private String text;
}
