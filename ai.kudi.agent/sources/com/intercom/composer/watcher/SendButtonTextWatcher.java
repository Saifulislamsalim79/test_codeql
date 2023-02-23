package com.intercom.composer.watcher;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
/* loaded from: classes2.dex */
public class SendButtonTextWatcher implements TextWatcher {
    private final OnSendButtonStateChangedListener listener;

    public SendButtonTextWatcher(OnSendButtonStateChangedListener onSendButtonStateChangedListener) {
        this.listener = onSendButtonStateChangedListener;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.listener.animateSendButtonVisibility(!TextUtils.isEmpty(editable.toString().trim()));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
