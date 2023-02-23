package ai.kudi.dip.library.keypad;

import ai.kudi.dip.library.keypad.PinpadView;
import androidx.appcompat.widget.AppCompatTextView;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.e0.d.l;
import kotlin.p549l0.C13277t;
/* compiled from: PinTextView.kt */
/* renamed from: ai.kudi.dip.library.keypad.b */
/* loaded from: classes2.dex */
public final class C0839b extends AppCompatTextView implements PinpadView.InterfaceC0836d {
    @Override // ai.kudi.dip.library.keypad.PinpadView.InterfaceC0836d
    public void onAppendChar(String str) {
        l.f(str, "char");
        setText(((Object) getText()) + str);
    }

    @Override // ai.kudi.dip.library.keypad.PinpadView.InterfaceC0836d
    public void onDeleteChar() {
        int m5410Q;
        CharSequence text = getText();
        l.e(text, AttributeType.TEXT);
        CharSequence text2 = getText();
        l.e(text2, AttributeType.TEXT);
        m5410Q = C13277t.m5410Q(text2);
        setText(text.subSequence(0, m5410Q).toString());
    }

    public void setNumDigits(int i) {
    }
}
