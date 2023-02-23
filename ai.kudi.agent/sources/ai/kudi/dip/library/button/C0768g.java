package ai.kudi.dip.library.button;

import ai.kudi.dip.library.C0786e;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.e0.d.l;
/* compiled from: ImageUploadButton.kt */
/* renamed from: ai.kudi.dip.library.button.g */
/* loaded from: classes2.dex */
public final class C0768g extends AbstractC0765e {
    public /* synthetic */ C0768g(Context context, AttributeSet attributeSet, int i, int i2, kotlin.e0.d.g gVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // ai.kudi.dip.library.button.AbstractC0765e
    /* renamed from: i */
    public int mo38013i() {
        return C0786e.layout_special_custom_open_button;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0768g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
    }
}
