package p272h.p286c.p287a.p300b.p307d.p315h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: h.c.a.b.d.h.t */
/* loaded from: classes2.dex */
public final class C8523t extends AbstractC8507l {

    /* renamed from: f */
    final transient Object[] f20235f;

    /* renamed from: w */
    private final transient int f20236w;

    private C8523t(Object obj, Object[] objArr, int i) {
        this.f20235f = objArr;
        this.f20236w = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static C8523t m16001i(int i, Object[] objArr, C8505k c8505k) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        C8493e.m16033a(obj, obj2);
        return new C8523t(null, objArr, 1);
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8507l
    /* renamed from: a */
    final AbstractC8497g mo16004a() {
        return new C8521s(this.f20235f, 1, this.f20236w);
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8507l
    /* renamed from: e */
    final AbstractC8509m mo16003e() {
        return new C8517q(this, this.f20235f, 0, this.f20236w);
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8507l
    /* renamed from: g */
    final AbstractC8509m mo16002g() {
        return new C8519r(this, new C8521s(this.f20235f, 0, this.f20236w));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[RETURN] */
    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8507l, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f20235f
            int r1 = r4.f20236w
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
        throw new UnsupportedOperationException("Method not decompiled: p272h.p286c.p287a.p300b.p307d.p315h.C8523t.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f20236w;
    }
}
