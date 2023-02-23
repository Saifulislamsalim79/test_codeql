package io.intercom.android.sdk.conversation.composer.textinput;

import android.widget.EditText;
import com.intercom.composer.input.IconProvider;
import com.intercom.composer.input.InputFragment;
import com.intercom.composer.input.empty.EmptyFragment;
import com.intercom.composer.input.text.SendTextCallback;
import com.intercom.composer.input.text.TextInput;
/* loaded from: classes.dex */
public class MessengerTextInput extends TextInput<EmptyFragment> {
    private final EditText editText;

    public MessengerTextInput(String str, IconProvider iconProvider, CharSequence charSequence, CharSequence charSequence2, SendTextCallback sendTextCallback, EditText editText) {
        super(str, iconProvider, sendTextCallback, null);
        this.editText = editText;
        editText.setHint(charSequence);
        editText.setText(charSequence2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.composer.input.text.TextInput
    public EditText createEditText() {
        EditText r1 = this.editText;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.composer.input.Input
    public /* bridge */ /* synthetic */ InputFragment createFragment() {
        EmptyFragment $r1 = createFragment();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.composer.input.Input
    public EmptyFragment createFragment() {
        EmptyFragment $r1 = new EmptyFragment();
        return $r1;
    }
}
