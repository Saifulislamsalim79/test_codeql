package p272h.p286c.p287a.p300b.p307d.p317j;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.j1 */
/* loaded from: classes2.dex */
public final class C8958j1 extends AbstractC9077r0 {

    /* renamed from: f */
    final transient Object[] f21013f;

    /* renamed from: w */
    private final transient int f21014w;

    private C8958j1(Object obj, Object[] objArr, int i) {
        this.f21013f = objArr;
        this.f21014w = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static C8958j1 m15695i(int i, Object[] objArr, C9062q0 c9062q0) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        C9135v.m15526b(obj, obj2);
        return new C8958j1(null, objArr, 1);
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC9077r0
    /* renamed from: a */
    final AbstractC8972k0 mo15560a() {
        return new C8943i1(this.f21013f, 1, this.f21014w);
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC9077r0
    /* renamed from: e */
    final AbstractC9091s0 mo15557e() {
        return new C8913g1(this, this.f21013f, 0, this.f21014w);
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC9077r0
    /* renamed from: g */
    final AbstractC9091s0 mo15556g() {
        return new C8928h1(this, new C8943i1(this.f21013f, 0, this.f21014w));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[RETURN] */
    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC9077r0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f21013f
            int r1 = r4.f21014w
            r2 = 0
            if (r5 != 0) goto L9
        L7:
            r5 = r2
            goto L1d
        L9:
            r3 = 1
            if (r1 != r3) goto L7
            r1 = 0
            r1 = r0[r1]
            r1.getClass()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L7
            r5 = r0[r3]
            r5.getClass()
        L1d:
            if (r5 != 0) goto L20
            return r2
        L20:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p272h.p286c.p287a.p300b.p307d.p317j.C8958j1.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f21014w;
    }
}
