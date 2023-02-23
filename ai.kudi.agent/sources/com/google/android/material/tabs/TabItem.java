package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C1138r0;
import p272h.p286c.p287a.p323c.C9277l;
/* loaded from: classes2.dex */
public class TabItem extends View {

    /* renamed from: c */
    public final CharSequence f11871c;

    /* renamed from: d */
    public final Drawable f11872d;

    /* renamed from: e */
    public final int f11873e;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1138r0 m37027u = C1138r0.m37027u(context, attributeSet, C9277l.TabItem);
        this.f11871c = m37027u.m37032p(C9277l.TabItem_android_text);
        this.f11872d = m37027u.m37041g(C9277l.TabItem_android_icon);
        this.f11873e = m37027u.m37034n(C9277l.TabItem_android_layout, 0);
        m37027u.m37025w();
    }
}
