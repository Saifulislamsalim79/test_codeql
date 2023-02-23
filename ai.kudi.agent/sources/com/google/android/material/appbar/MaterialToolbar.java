package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.C1365a;
import com.google.android.material.internal.C4695q;
import com.google.android.material.theme.p106a.C4804a;
import p201g.p227h.p238l.C7759x;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9276k;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p326c0.C9243g;
import p272h.p286c.p287a.p323c.p326c0.C9247h;
/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: d */
    private static final int f11000d = C9276k.Widget_MaterialComponents_Toolbar;

    /* renamed from: c */
    private Integer f11001c;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9233b.toolbarStyle);
    }

    /* renamed from: a */
    private void m27633a(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C9243g c9243g = new C9243g();
            c9243g.m15409X(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            c9243g.m15420M(context);
            c9243g.m15410W(C7759x.m17485w(this));
            C7759x.m17492s0(this, c9243g);
        }
    }

    /* renamed from: b */
    private Drawable m27632b(Drawable drawable) {
        if (drawable == null || this.f11001c == null) {
            return drawable;
        }
        Drawable m36184r = C1365a.m36184r(drawable);
        C1365a.m36188n(m36184r, this.f11001c.intValue());
        return m36184r;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9247h.m15367e(this);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C9247h.m15368d(this, f);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m27632b(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.f11001c = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(C4804a.m26258c(context, attributeSet, i, f11000d), attributeSet, i);
        Context context2 = getContext();
        TypedArray m26690h = C4695q.m26690h(context2, attributeSet, C9277l.MaterialToolbar, i, f11000d, new int[0]);
        if (m26690h.hasValue(C9277l.MaterialToolbar_navigationIconTint)) {
            setNavigationIconTint(m26690h.getColor(C9277l.MaterialToolbar_navigationIconTint, -1));
        }
        m26690h.recycle();
        m27633a(context2);
    }
}
