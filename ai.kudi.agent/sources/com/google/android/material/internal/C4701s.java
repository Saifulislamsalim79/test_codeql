package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
/* compiled from: VisibilityAwareImageButton.java */
/* renamed from: com.google.android.material.internal.s */
/* loaded from: classes2.dex */
public class C4701s extends ImageButton {

    /* renamed from: c */
    private int f11784c;

    public C4701s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public final void m26680b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f11784c = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f11784c;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        m26680b(i, true);
    }

    public C4701s(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11784c = getVisibility();
    }
}
