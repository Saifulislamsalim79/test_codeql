package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.theme.p106a.C4804a;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p342z.C9320b;
import p272h.p286c.p287a.p323c.p342z.C9321c;
/* loaded from: classes2.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* renamed from: c */
    private void m26270c(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C9277l.MaterialTextAppearance);
        int m26267h = m26267h(getContext(), obtainStyledAttributes, C9277l.MaterialTextAppearance_android_lineHeight, C9277l.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (m26267h >= 0) {
            setLineHeight(m26267h);
        }
    }

    /* renamed from: f */
    private static boolean m26269f(Context context) {
        return C9320b.m15056b(context, C9233b.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: g */
    private static int m26268g(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C9277l.MaterialTextView, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C9277l.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: h */
    private static int m26267h(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = C9321c.m15051c(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: i */
    private static boolean m26266i(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C9277l.MaterialTextView, i, i2);
        int m26267h = m26267h(context, obtainStyledAttributes, C9277l.MaterialTextView_android_lineHeight, C9277l.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        return m26267h != -1;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m26269f(context)) {
            m26270c(context.getTheme(), i);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C4804a.m26258c(context, attributeSet, i, i2), attributeSet, i);
        int m26268g;
        Context context2 = getContext();
        if (m26269f(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (m26266i(context2, theme, attributeSet, i, i2) || (m26268g = m26268g(theme, attributeSet, i, i2)) == -1) {
                return;
            }
            m26270c(theme, m26268g);
        }
    }
}
