package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import kotlin.C13668y;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: TypeSubstitution.kt */
/* renamed from: kotlin.j0.o.c.p0.l.z */
/* loaded from: classes3.dex */
public final class C13139z extends AbstractC13137y0 {

    /* renamed from: b */
    private final InterfaceC13562z0[] f29221b;

    /* renamed from: c */
    private final InterfaceC13131v0[] f29222c;

    /* renamed from: d */
    private final boolean f29223d;

    public /* synthetic */ C13139z(InterfaceC13562z0[] interfaceC13562z0Arr, InterfaceC13131v0[] interfaceC13131v0Arr, boolean z, int i, g gVar) {
        this(interfaceC13562z0Arr, interfaceC13131v0Arr, (i & 4) != 0 ? false : z);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0
    /* renamed from: b */
    public boolean mo5746b() {
        return this.f29223d;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0
    /* renamed from: e */
    public InterfaceC13131v0 mo5745e(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "key");
        InterfaceC13334h mo5206d = abstractC12965b0.mo5779W0().mo5206d();
        InterfaceC13562z0 interfaceC13562z0 = mo5206d instanceof InterfaceC13562z0 ? (InterfaceC13562z0) mo5206d : null;
        if (interfaceC13562z0 == null) {
            return null;
        }
        int mo4650h = interfaceC13562z0.mo4650h();
        InterfaceC13562z0[] interfaceC13562z0Arr = this.f29221b;
        if (mo4650h >= interfaceC13562z0Arr.length || !l.b(interfaceC13562z0Arr[mo4650h].mo4649n(), interfaceC13562z0.mo4649n())) {
            return null;
        }
        return this.f29222c[mo4650h];
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0
    /* renamed from: f */
    public boolean mo5744f() {
        return this.f29222c.length == 0;
    }

    /* renamed from: h */
    public final InterfaceC13131v0[] m5743h() {
        return this.f29222c;
    }

    /* renamed from: i */
    public final InterfaceC13562z0[] m5742i() {
        return this.f29221b;
    }

    public C13139z(InterfaceC13562z0[] interfaceC13562z0Arr, InterfaceC13131v0[] interfaceC13131v0Arr, boolean z) {
        l.f(interfaceC13562z0Arr, "parameters");
        l.f(interfaceC13131v0Arr, "arguments");
        this.f29221b = interfaceC13562z0Arr;
        this.f29222c = interfaceC13131v0Arr;
        this.f29223d = z;
        boolean z2 = interfaceC13562z0Arr.length <= interfaceC13131v0Arr.length;
        if (!C13668y.f30115a || z2) {
            return;
        }
        throw new AssertionError("Number of arguments should not be less than number of parameters, but: parameters=" + m5742i().length + ", args=" + m5743h().length);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C13139z(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0> r9, java.util.List<? extends kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "parameters"
            kotlin.e0.d.l.f(r9, r0)
            java.lang.String r0 = "argumentsList"
            kotlin.e0.d.l.f(r10, r0)
            r0 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.z0[] r1 = new kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0[r0]
            java.lang.Object[] r9 = r9.toArray(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            if (r9 == 0) goto L31
            r3 = r9
            kotlin.reflect.jvm.internal.impl.descriptors.z0[] r3 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0[]) r3
            kotlin.j0.o.c.p0.l.v0[] r9 = new kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0[r0]
            java.lang.Object[] r9 = r10.toArray(r9)
            if (r9 == 0) goto L2b
            r4 = r9
            kotlin.j0.o.c.p0.l.v0[] r4 = (kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0[]) r4
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
        L2b:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r1)
            throw r9
        L31:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p538l.C13139z.<init>(java.util.List, java.util.List):void");
    }
}
