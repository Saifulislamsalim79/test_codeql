package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FlexLine.java */
/* renamed from: com.google.android.flexbox.c */
/* loaded from: classes2.dex */
public class C2689c {

    /* renamed from: e */
    int f7585e;

    /* renamed from: f */
    int f7586f;

    /* renamed from: g */
    int f7587g;

    /* renamed from: h */
    int f7588h;

    /* renamed from: i */
    int f7589i;

    /* renamed from: j */
    float f7590j;

    /* renamed from: k */
    float f7591k;

    /* renamed from: l */
    int f7592l;

    /* renamed from: m */
    int f7593m;

    /* renamed from: o */
    int f7595o;

    /* renamed from: p */
    int f7596p;

    /* renamed from: a */
    int f7581a = Integer.MAX_VALUE;

    /* renamed from: b */
    int f7582b = Integer.MAX_VALUE;

    /* renamed from: c */
    int f7583c = Integer.MIN_VALUE;

    /* renamed from: d */
    int f7584d = Integer.MIN_VALUE;

    /* renamed from: n */
    List<Integer> f7594n = new ArrayList();

    /* renamed from: a */
    public int m32219a() {
        return this.f7587g;
    }

    /* renamed from: b */
    public int m32218b() {
        return this.f7588h;
    }

    /* renamed from: c */
    public int m32217c() {
        return this.f7588h - this.f7589i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m32216d(View view, int i, int i2, int i3, int i4) {
        InterfaceC2688b interfaceC2688b = (InterfaceC2688b) view.getLayoutParams();
        this.f7581a = Math.min(this.f7581a, (view.getLeft() - interfaceC2688b.mo32222f0()) - i);
        this.f7582b = Math.min(this.f7582b, (view.getTop() - interfaceC2688b.mo32221o0()) - i2);
        this.f7583c = Math.max(this.f7583c, view.getRight() + interfaceC2688b.mo32231H0() + i3);
        this.f7584d = Math.max(this.f7584d, view.getBottom() + interfaceC2688b.mo32223b0() + i4);
    }
}
