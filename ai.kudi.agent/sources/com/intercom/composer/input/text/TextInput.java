package com.intercom.composer.input.text;

import android.widget.EditText;
import com.intercom.composer.input.IconProvider;
import com.intercom.composer.input.Input;
import com.intercom.composer.input.InputFragment;
import com.intercom.composer.input.text.options.TextInputOption;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class TextInput<T extends InputFragment> extends Input<T> {
    private EditText editText;
    private final List<TextInputOption> options;
    private SendTextCallback sendTextCallback;

    public TextInput(String str, IconProvider iconProvider, SendTextCallback sendTextCallback) {
        this(str, iconProvider, sendTextCallback, null);
    }

    protected abstract EditText createEditText();

    public EditText getEditText() {
        if (this.editText == null) {
            this.editText = createEditText();
        }
        return this.editText;
    }

    public List<TextInputOption> getOptions() {
        return this.options;
    }

    public void sendTextBack(CharSequence charSequence) {
        this.sendTextCallback.textToBeSent(this, charSequence);
    }

    public TextInput(String str, IconProvider iconProvider, SendTextCallback sendTextCallback, List<TextInputOption> list) {
        super(str, iconProvider);
        this.sendTextCallback = sendTextCallback;
        this.options = list;
    }
}
