package ai.kudi.dip.library.edittext;

import ai.kudi.dip.library.C0786e;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
/* compiled from: KudiInputField.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, m10421d2 = {"Lai/kudi/dip/library/edittext/KudiInputField;", "Lai/kudi/dip/library/edittext/BaseKudiInputField;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "layoutResource", "kudi-dip-library_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class KudiInputField extends AbstractC0790c {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KudiInputField(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        l.f(context, "context");
    }

    public /* synthetic */ KudiInputField(Context context, AttributeSet attributeSet, int i, int i2, g gVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // ai.kudi.dip.library.edittext.AbstractC0790c
    public int layoutResource() {
        return C0786e.view_kudi_edittext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KudiInputField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
    }
}
