package com.intercom.composer.input.text.options;

import android.view.View;
/* loaded from: classes2.dex */
public class InputOptionImageViewClickListener implements View.OnClickListener {
    private TextInputOption option;

    public InputOptionImageViewClickListener(TextInputOption textInputOption) {
        this.option = textInputOption;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.option.inputOptionClicked();
    }
}
