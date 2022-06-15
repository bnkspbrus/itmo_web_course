package ru.itmo.wp.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class PostForm {
    @NotEmpty
    @NotNull
    @Size(max = 6500)
    private String text;

    @NotNull
    @NotEmpty
    @Size(max = 50)
    private String title;

    @Size(max = 100)
    @Pattern(regexp = "[a-zA-Z\\s]*", message = "Expected only Latin letters")
    private String tags;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
