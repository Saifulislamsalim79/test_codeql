package p201g.p227h.p238l;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: NestedScrollingParentHelper.java */
/* renamed from: g.h.l.p */
/* loaded from: classes2.dex */
public class C7751p {

    /* renamed from: a */
    private int f18506a;

    /* renamed from: b */
    private int f18507b;

    public C7751p(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int m17578a() {
        return this.f18506a | this.f18507b;
    }

    /* renamed from: b */
    public void m17577b(View view, View view2, int i) {
        m17576c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void m17576c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f18507b = i;
        } else {
            this.f18506a = i;
        }
    }

    /* renamed from: d */
    public void m17575d(View view) {
        m17574e(view, 0);
    }

    /* renamed from: e */
    public void m17574e(View view, int i) {
        if (i == 1) {
            this.f18507b = 0;
        } else {
            this.f18506a = 0;
        }
    }
}
