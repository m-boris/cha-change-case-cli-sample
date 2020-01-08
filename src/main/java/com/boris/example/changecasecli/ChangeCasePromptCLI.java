package com.boris.example.changecasecli;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

@Component
public class ChangeCasePromptCLI implements PromptProvider {

    @Override
    public AttributedString getPrompt() {
        return new AttributedString("Enter command: ", AttributedStyle.DEFAULT);
    }
}
