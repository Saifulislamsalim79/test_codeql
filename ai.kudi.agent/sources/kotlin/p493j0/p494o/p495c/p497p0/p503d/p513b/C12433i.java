package kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12536l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.C12470a;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.C12494e;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12596e;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.InterfaceC12593c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.C12756d;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12903r;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.EnumC12844e;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.InterfaceC12845f;
import kotlin.p549l0.C13277t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13548v0;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h;
/* compiled from: JvmPackagePartSource.kt */
/* renamed from: kotlin.j0.o.c.p0.d.b.i */
/* loaded from: classes3.dex */
public final class C12433i implements InterfaceC12845f {

    /* renamed from: b */
    private final C12756d f27611b;

    /* renamed from: c */
    private final C12756d f27612c;

    /* renamed from: d */
    private final InterfaceC12447o f27613d;

    public C12433i(C12756d c12756d, C12756d c12756d2, C12536l c12536l, InterfaceC12593c interfaceC12593c, C12903r<C12494e> c12903r, boolean z, EnumC12844e enumC12844e, InterfaceC12447o interfaceC12447o) {
        l.f(c12756d, "className");
        l.f(c12536l, "packageProto");
        l.f(interfaceC12593c, "nameResolver");
        l.f(enumC12844e, "abiStability");
        this.f27611b = c12756d;
        this.f27612c = c12756d2;
        this.f27613d = interfaceC12447o;
        AbstractC13580h.C13587f<C12536l, Integer> c13587f = C12470a.f27664m;
        l.e(c13587f, "packageModuleName");
        Integer num = (Integer) C12596e.m7430a(c12536l, c13587f);
        if (num == null) {
            return;
        }
        interfaceC12593c.getString(num.intValue());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0
    /* renamed from: a */
    public InterfaceC13548v0 mo4706a() {
        InterfaceC13548v0 interfaceC13548v0 = InterfaceC13548v0.f29904a;
        l.e(interfaceC13548v0, "NO_SOURCE_FILE");
        return interfaceC13548v0;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.InterfaceC12845f
    /* renamed from: c */
    public String mo6634c() {
        return "Class '" + m8923d().m7395b().m7382b() + '\'';
    }

    /* renamed from: d */
    public final C12608b m8923d() {
        return new C12608b(this.f27611b.m6830g(), m8920g());
    }

    /* renamed from: e */
    public final C12756d m8922e() {
        return this.f27612c;
    }

    /* renamed from: f */
    public final InterfaceC12447o m8921f() {
        return this.f27613d;
    }

    /* renamed from: g */
    public final C12614f m8920g() {
        String m5430E0;
        String m6831f = this.f27611b.m6831f();
        l.e(m6831f, "className.internalName");
        m5430E0 = C13277t.m5430E0(m6831f, '/', null, 2, null);
        C12614f m7349i = C12614f.m7349i(m5430E0);
        l.e(m7349i, "identifier(className.internalName.substringAfterLast('/'))");
        return m7349i;
    }

    public String toString() {
        return ((Object) C12433i.class.getSimpleName()) + ": " + this.f27611b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12433i(kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o r11, kotlin.p493j0.p494o.p495c.p497p0.p515e.C12536l r12, kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.InterfaceC12593c r13, kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12903r<kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.C12494e> r14, boolean r15, kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.EnumC12844e r16) {
        /*
            r10 = this;
            java.lang.String r0 = "kotlinClass"
            r9 = r11
            kotlin.e0.d.l.f(r11, r0)
            java.lang.String r0 = "packageProto"
            r4 = r12
            kotlin.e0.d.l.f(r12, r0)
            java.lang.String r0 = "nameResolver"
            r5 = r13
            kotlin.e0.d.l.f(r13, r0)
            java.lang.String r0 = "abiStability"
            r8 = r16
            kotlin.e0.d.l.f(r8, r0)
            kotlin.j0.o.c.p0.f.b r0 = r11.mo4922h()
            kotlin.j0.o.c.p0.i.u.d r2 = kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.C12756d.m6835b(r0)
            java.lang.String r0 = "byClassId(kotlinClass.classId)"
            kotlin.e0.d.l.e(r2, r0)
            kotlin.j0.o.c.p0.d.b.a0.a r0 = r11.mo4926a()
            java.lang.String r0 = r0.m8995e()
            r1 = 0
            if (r0 != 0) goto L33
        L31:
            r3 = r1
            goto L43
        L33:
            int r3 = r0.length()
            if (r3 <= 0) goto L3b
            r3 = 1
            goto L3c
        L3b:
            r3 = 0
        L3c:
            if (r3 == 0) goto L31
            kotlin.j0.o.c.p0.i.u.d r1 = kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.C12756d.m6833d(r0)
            goto L31
        L43:
            r1 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12433i.<init>(kotlin.j0.o.c.p0.d.b.o, kotlin.j0.o.c.p0.e.l, kotlin.j0.o.c.p0.e.z.c, kotlin.j0.o.c.p0.j.b.r, boolean, kotlin.j0.o.c.p0.j.b.d0.e):void");
    }
}
