package com.google.firebase.inappmessaging.display.internal.layout.p147b;

import android.view.View;
import com.google.firebase.inappmessaging.display.internal.C6065m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: VerticalViewGroupMeasure.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.layout.b.c */
/* loaded from: classes2.dex */
public class C6062c {

    /* renamed from: a */
    private List<C6064d> f14811a = new ArrayList();

    /* renamed from: b */
    private int f14812b = 0;

    /* renamed from: c */
    private int f14813c = 0;

    /* compiled from: VerticalViewGroupMeasure.java */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.layout.b.c$a */
    /* loaded from: classes2.dex */
    class C6063a implements Comparator<C6064d> {
        C6063a(C6062c c6062c) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C6064d c6064d, C6064d c6064d2) {
            if (c6064d.m22827a() > c6064d2.m22827a()) {
                return -1;
            }
            return c6064d.m22827a() < c6064d2.m22827a() ? 1 : 0;
        }
    }

    /* renamed from: a */
    public void m22834a(View view, boolean z) {
        C6064d c6064d = new C6064d(view, z);
        c6064d.m22822f(this.f14812b, this.f14813c);
        this.f14811a.add(c6064d);
    }

    /* renamed from: b */
    public void m22833b(int i) {
        float f;
        ArrayList<C6064d> arrayList = new ArrayList();
        for (C6064d c6064d : this.f14811a) {
            if (c6064d.m22824d()) {
                arrayList.add(c6064d);
            }
        }
        Collections.sort(arrayList, new C6063a(this));
        int i2 = 0;
        for (C6064d c6064d2 : arrayList) {
            i2 += c6064d2.m22827a();
        }
        int size = arrayList.size();
        if (size < 6) {
            float f2 = 1.0f - ((size - 1) * 0.2f);
            C6065m.m22818d("VVGM (minFrac, maxFrac)", 0.2f, f2);
            float f3 = 0.0f;
            for (C6064d c6064d3 : arrayList) {
                float m22827a = c6064d3.m22827a() / i2;
                if (m22827a > f2) {
                    f3 += m22827a - f2;
                    f = f2;
                } else {
                    f = m22827a;
                }
                if (m22827a < 0.2f) {
                    float min = Math.min(0.2f - m22827a, f3);
                    f3 -= min;
                    f = m22827a + min;
                }
                C6065m.m22818d("\t(desired, granted)", m22827a, f);
                c6064d3.m22822f(this.f14812b, (int) (f * i));
            }
            return;
        }
        throw new IllegalStateException("VerticalViewGroupMeasure only supports up to 5 children");
    }

    /* renamed from: c */
    public int m22832c() {
        int i = 0;
        for (C6064d c6064d : this.f14811a) {
            if (!c6064d.m22824d()) {
                i += c6064d.m22827a();
            }
        }
        return i;
    }

    /* renamed from: d */
    public int m22831d() {
        int i = 0;
        for (C6064d c6064d : this.f14811a) {
            i += c6064d.m22827a();
        }
        return i;
    }

    /* renamed from: e */
    public List<C6064d> m22830e() {
        return this.f14811a;
    }

    /* renamed from: f */
    public void m22829f(int i, int i2) {
        this.f14812b = i;
        this.f14813c = i2;
        this.f14811a = new ArrayList();
    }
}
