package p201g.p227h.p238l.p239h0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: AccessibilityClickableSpanCompat.java */
/* renamed from: g.h.l.h0.a */
/* loaded from: classes2.dex */
public final class C7714a extends ClickableSpan {

    /* renamed from: c */
    private final int f18467c;

    /* renamed from: d */
    private final C7716c f18468d;

    /* renamed from: e */
    private final int f18469e;

    public C7714a(int i, C7716c c7716c, int i2) {
        this.f18467c = i;
        this.f18468d = c7716c;
        this.f18469e = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f18467c);
        this.f18468d.m17704Q(this.f18469e, bundle);
    }
}
