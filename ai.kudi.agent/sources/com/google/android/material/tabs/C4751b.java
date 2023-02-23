package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C4696r;
import com.google.android.material.tabs.TabLayout;
import p272h.p286c.p287a.p323c.p328m.C9278a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TabIndicatorInterpolator.java */
/* renamed from: com.google.android.material.tabs.b */
/* loaded from: classes2.dex */
public class C4751b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static RectF m26477a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.m26537y() && (view instanceof TabLayout.C4747i)) {
            return m26476b((TabLayout.C4747i) view, 24);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: b */
    static RectF m26476b(TabLayout.C4747i c4747i, int i) {
        int contentWidth = c4747i.getContentWidth();
        int contentHeight = c4747i.getContentHeight();
        int m26687b = (int) C4696r.m26687b(c4747i.getContext(), i);
        if (contentWidth < m26687b) {
            contentWidth = m26687b;
        }
        int left = (c4747i.getLeft() + c4747i.getRight()) / 2;
        int top = (c4747i.getTop() + c4747i.getBottom()) / 2;
        int i2 = contentWidth / 2;
        return new RectF(left - i2, top - (contentHeight / 2), i2 + left, top + (left / 2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo26475c(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF m26477a = m26477a(tabLayout, view);
        RectF m26477a2 = m26477a(tabLayout, view2);
        drawable.setBounds(C9278a.m15236b((int) m26477a.left, (int) m26477a2.left, f), drawable.getBounds().top, C9278a.m15236b((int) m26477a.right, (int) m26477a2.right, f), drawable.getBounds().bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m26474d(TabLayout tabLayout, View view, Drawable drawable) {
        RectF m26477a = m26477a(tabLayout, view);
        drawable.setBounds((int) m26477a.left, drawable.getBounds().top, (int) m26477a.right, drawable.getBounds().bottom);
    }
}
