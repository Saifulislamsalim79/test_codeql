package ai.kudi.dip.library.edittext;

import ai.kudi.dip.library.C0786e;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p549l0.C13262h;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13722p;
/* compiled from: KudiNairaInputField.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0002¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/dip/library/edittext/KudiNairaInputField;", "Lai/kudi/dip/library/edittext/BaseKudiInputField;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "formatPriceWithDecimal", "", "priceText", "layoutResource", "parseAmount", "", "price", "kudi-dip-library_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class KudiNairaInputField extends AbstractC0790c {

    /* compiled from: KudiNairaInputField.kt */
    /* renamed from: ai.kudi.dip.library.edittext.KudiNairaInputField$a */
    /* loaded from: classes2.dex */
    public static final class C0787a implements TextWatcher {
        C0787a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            KudiNairaInputField.this.getEditText().removeTextChangedListener(this);
            String formatPriceWithDecimal = KudiNairaInputField.this.formatPriceWithDecimal(String.valueOf(editable));
            KudiNairaInputField.this.getEditText().setText(formatPriceWithDecimal);
            KudiNairaInputField.this.getEditText().addTextChangedListener(this);
            KudiNairaInputField.this.getEditText().setSelection(formatPriceWithDecimal.length());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KudiNairaInputField(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        l.f(context, "context");
    }

    public /* synthetic */ KudiNairaInputField(Context context, AttributeSet attributeSet, int i, int i2, g gVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final double parseAmount(String str) {
        try {
            return Double.parseDouble(new C13262h("[^\\d.]").m5521f(str, ""));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public final String formatPriceWithDecimal(String str) {
        List m5384q0;
        l.f(str, "priceText");
        double parseAmount = parseAmount(str);
        if (parseAmount == 0.0d) {
            return "";
        }
        String format = new DecimalFormat("###,###,##0").format(Integer.valueOf((int) parseAmount));
        m5384q0 = C13277t.m5384q0(str, new char[]{'.'}, false, 0, 6, null);
        String str2 = (String) C13722p.m3951U(m5384q0, 1);
        if (str2 == null) {
            l.e(format, "{\n            formatted\n        }");
            return format;
        }
        if (str2.length() > 2) {
            str2 = str2.substring(0, 2);
            l.e(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) format);
        sb.append('.');
        sb.append((Object) str2);
        return sb.toString();
    }

    @Override // ai.kudi.dip.library.edittext.AbstractC0790c
    public int layoutResource() {
        return C0786e.view_kudi_naira_edittext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KudiNairaInputField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        getEditText().addTextChangedListener(new C0787a());
    }
}
