package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p557z.C13722p;
/* compiled from: javaLoading.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.f0.p */
/* loaded from: classes3.dex */
public final class C12286p {
    /* renamed from: a */
    private static final boolean m9269a(InterfaceC12288r interfaceC12288r) {
        C12609c mo4850f;
        InterfaceC12267a0 interfaceC12267a0 = (InterfaceC12267a0) C13722p.m3915s0(interfaceC12288r.mo4803k());
        InterfaceC12295x mo4779c = interfaceC12267a0 == null ? null : interfaceC12267a0.mo4779c();
        InterfaceC12280j interfaceC12280j = mo4779c instanceof InterfaceC12280j ? (InterfaceC12280j) mo4779c : null;
        if (interfaceC12280j == null) {
            return false;
        }
        InterfaceC12279i mo4828g = interfaceC12280j.mo4828g();
        return (mo4828g instanceof InterfaceC12277g) && (mo4850f = ((InterfaceC12277g) mo4828g).mo4850f()) != null && l.b(mo4850f.m7382b(), "java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0.equals("hashCode") == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r0.equals("toString") == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        return r3.mo4803k().isEmpty();
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean m9268b(kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12288r r3) {
        /*
            kotlin.j0.o.c.p0.f.f r0 = r3.mo4785b()
            java.lang.String r0 = r0.m7353b()
            int r1 = r0.hashCode()
            r2 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r1 == r2) goto L33
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r1 == r2) goto L25
            r2 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r1 == r2) goto L1c
            goto L3b
        L1c:
            java.lang.String r1 = "hashCode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d
            goto L3b
        L25:
            java.lang.String r1 = "equals"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            goto L3b
        L2e:
            boolean r3 = m9269a(r3)
            goto L45
        L33:
            java.lang.String r1 = "toString"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d
        L3b:
            r3 = 0
            goto L45
        L3d:
            java.util.List r3 = r3.mo4803k()
            boolean r3 = r3.isEmpty()
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.C12286p.m9268b(kotlin.j0.o.c.p0.d.a.f0.r):boolean");
    }

    /* renamed from: c */
    public static final boolean m9267c(InterfaceC12287q interfaceC12287q) {
        l.f(interfaceC12287q, "<this>");
        return interfaceC12287q.mo4816X().mo4863O() && (interfaceC12287q instanceof InterfaceC12288r) && m9268b((InterfaceC12288r) interfaceC12287q);
    }
}
