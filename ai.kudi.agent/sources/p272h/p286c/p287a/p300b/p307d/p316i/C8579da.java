package p272h.p286c.p287a.p300b.p307d.p316i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.da */
/* loaded from: classes2.dex */
public final class C8579da extends AbstractC8787w9 {

    /* renamed from: f */
    final transient Object[] f20279f;

    /* renamed from: w */
    private final transient int f20280w;

    private C8579da(Object obj, Object[] objArr, int i) {
        this.f20279f = objArr;
        this.f20280w = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static C8579da m15977i(int i, Object[] objArr, C8776v9 c8776v9) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        C8611g7.m15963a(obj, obj2);
        return new C8579da(null, objArr, 1);
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8787w9
    /* renamed from: a */
    final AbstractC8721q9 mo15858a() {
        return new C8568ca(this.f20279f, 1, this.f20280w);
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8787w9
    /* renamed from: e */
    final AbstractC8798x9 mo15855e() {
        return new C8544aa(this, this.f20279f, 0, this.f20280w);
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8787w9
    /* renamed from: g */
    final AbstractC8798x9 mo15854g() {
        return new C8556ba(this, new C8568ca(this.f20279f, 0, this.f20280w));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[RETURN] */
    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8787w9, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f20279f
            int r1 = r4.f20280w
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
        throw new UnsupportedOperationException("Method not decompiled: p272h.p286c.p287a.p300b.p307d.p316i.C8579da.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f20280w;
    }
}
