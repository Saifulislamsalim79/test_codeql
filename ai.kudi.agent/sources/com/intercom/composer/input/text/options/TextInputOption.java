package com.intercom.composer.input.text.options;
/* loaded from: classes2.dex */
public class TextInputOption {
    private final int iconResource;
    private final InputOptionClickListener inputOptionClickListener;

    public TextInputOption(int i, InputOptionClickListener inputOptionClickListener) {
        this.iconResource = i;
        this.inputOptionClickListener = inputOptionClickListener;
    }

    public int getResourceId() {
        return this.iconResource;
    }

    public void inputOptionClicked() {
        this.inputOptionClickListener.onInputOptionClicked();
    }
}
