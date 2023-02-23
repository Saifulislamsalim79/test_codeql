package com.intercom.composer.input.text.listener;

import android.view.View;
import android.widget.EditText;
/* loaded from: classes2.dex */
public class SendButtonClickListener implements View.OnClickListener {
    private final EditText editText;
    private final OnSendButtonClickedListener listener;

    public SendButtonClickListener(OnSendButtonClickedListener onSendButtonClickedListener, EditText editText) {
        this.listener = onSendButtonClickedListener;
        this.editText = editText;
    }

    void clearEditText() {
        this.editText.setText("");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.listener.onSendButtonClicked(this.editText.getText());
        clearEditText();
    }
}
