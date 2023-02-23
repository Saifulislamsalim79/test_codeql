package retrofit2.adapter.rxjava2;

import j.e.v;
import java.lang.reflect.Type;
import retrofit2.InterfaceC14802c;
/* compiled from: RxJava2CallAdapter.java */
/* renamed from: retrofit2.adapter.rxjava2.f */
/* loaded from: classes3.dex */
final class C14799f<R> implements InterfaceC14802c<R, Object> {

    /* renamed from: a */
    private final Type f33069a;

    /* renamed from: b */
    private final v f33070b;

    /* renamed from: c */
    private final boolean f33071c;

    /* renamed from: d */
    private final boolean f33072d;

    /* renamed from: e */
    private final boolean f33073e;

    /* renamed from: f */
    private final boolean f33074f;

    /* renamed from: g */
    private final boolean f33075g;

    /* renamed from: h */
    private final boolean f33076h;

    /* renamed from: i */
    private final boolean f33077i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14799f(Type type, v vVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f33069a = type;
        this.f33070b = vVar;
        this.f33071c = z;
        this.f33072d = z2;
        this.f33073e = z3;
        this.f33074f = z4;
        this.f33075g = z5;
        this.f33076h = z6;
        this.f33077i = z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    @Override // retrofit2.InterfaceC14802c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo324a(retrofit2.InterfaceC14801b<R> r2) {
        /*
            r1 = this;
            boolean r0 = r1.f33071c
            if (r0 == 0) goto La
            retrofit2.adapter.rxjava2.b r0 = new retrofit2.adapter.rxjava2.b
            r0.<init>(r2)
            goto Lf
        La:
            retrofit2.adapter.rxjava2.c r0 = new retrofit2.adapter.rxjava2.c
            r0.<init>(r2)
        Lf:
            boolean r2 = r1.f33072d
            if (r2 == 0) goto L1a
            retrofit2.adapter.rxjava2.e r2 = new retrofit2.adapter.rxjava2.e
            r2.<init>(r0)
        L18:
            r0 = r2
            goto L24
        L1a:
            boolean r2 = r1.f33073e
            if (r2 == 0) goto L24
            retrofit2.adapter.rxjava2.a r2 = new retrofit2.adapter.rxjava2.a
            r2.<init>(r0)
            goto L18
        L24:
            j.e.v r2 = r1.f33070b
            if (r2 == 0) goto L2c
            j.e.p r0 = r0.m10511h0(r2)
        L2c:
            boolean r2 = r1.f33074f
            if (r2 == 0) goto L37
            j.e.a r2 = p425j.p444e.EnumC11269a.LATEST
            j.e.f r2 = r0.m10497o0(r2)
            return r2
        L37:
            boolean r2 = r1.f33075g
            if (r2 == 0) goto L40
            j.e.w r2 = r0.m10519a0()
            return r2
        L40:
            boolean r2 = r1.f33076h
            if (r2 == 0) goto L49
            j.e.k r2 = r0.m10520Z()
            return r2
        L49:
            boolean r2 = r1.f33077i
            if (r2 == 0) goto L52
            j.e.b r2 = r0.m10533M()
            return r2
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.adapter.rxjava2.C14799f.mo324a(retrofit2.b):java.lang.Object");
    }

    @Override // retrofit2.InterfaceC14802c
    public Type responseType() {
        return this.f33069a;
    }
}
