package p201g.p259r;

import java.util.List;
import kotlin.e0.d.l;
import p201g.p259r.AbstractC8041v0;
/* compiled from: PagingState.kt */
/* renamed from: g.r.w0 */
/* loaded from: classes2.dex */
public final class C8053w0<Key, Value> {

    /* renamed from: a */
    private final List<AbstractC8041v0.AbstractC8048b.C8050b<Key, Value>> f19392a;

    /* renamed from: b */
    private final Integer f19393b;

    /* renamed from: c */
    private final C8003q0 f19394c;

    /* renamed from: d */
    private final int f19395d;

    public C8053w0(List<AbstractC8041v0.AbstractC8048b.C8050b<Key, Value>> list, Integer num, C8003q0 c8003q0, int i) {
        l.f(list, "pages");
        l.f(c8003q0, "config");
        this.f19392a = list;
        this.f19393b = num;
        this.f19394c = c8003q0;
        this.f19395d = i;
    }

    /* JADX WARN: Incorrect condition in loop: B:18:0x003b */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p201g.p259r.AbstractC8041v0.AbstractC8048b.C8050b<Key, Value> m16816b(int r5) {
        /*
            r4 = this;
            java.util.List<g.r.v0$b$b<Key, Value>> r0 = r4.f19392a
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Lf
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lf
            goto L2a
        Lf:
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            g.r.v0$b$b r1 = (p201g.p259r.AbstractC8041v0.AbstractC8048b.C8050b) r1
            java.util.List r1 = r1.m16823c()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L13
            r3 = 0
        L2a:
            if (r3 == 0) goto L2e
            r5 = 0
            return r5
        L2e:
            int r0 = m16817a(r4)
            int r5 = r5 - r0
        L33:
            java.util.List r0 = r4.m16814d()
            int r0 = kotlin.p557z.C13722p.m3937g(r0)
            if (r2 >= r0) goto L67
            java.util.List r0 = r4.m16814d()
            java.lang.Object r0 = r0.get(r2)
            g.r.v0$b$b r0 = (p201g.p259r.AbstractC8041v0.AbstractC8048b.C8050b) r0
            java.util.List r0 = r0.m16823c()
            int r0 = kotlin.p557z.C13722p.m3937g(r0)
            if (r5 <= r0) goto L67
            java.util.List r0 = r4.m16814d()
            java.lang.Object r0 = r0.get(r2)
            g.r.v0$b$b r0 = (p201g.p259r.AbstractC8041v0.AbstractC8048b.C8050b) r0
            java.util.List r0 = r0.m16823c()
            int r0 = r0.size()
            int r5 = r5 - r0
            int r2 = r2 + 1
            goto L33
        L67:
            if (r5 >= 0) goto L74
            java.util.List r5 = r4.m16814d()
            java.lang.Object r5 = kotlin.p557z.C13722p.m3954R(r5)
            g.r.v0$b$b r5 = (p201g.p259r.AbstractC8041v0.AbstractC8048b.C8050b) r5
            goto L7e
        L74:
            java.util.List r5 = r4.m16814d()
            java.lang.Object r5 = r5.get(r2)
            g.r.v0$b$b r5 = (p201g.p259r.AbstractC8041v0.AbstractC8048b.C8050b) r5
        L7e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C8053w0.m16816b(int):g.r.v0$b$b");
    }

    /* renamed from: c */
    public final Integer m16815c() {
        return this.f19393b;
    }

    /* renamed from: d */
    public final List<AbstractC8041v0.AbstractC8048b.C8050b<Key, Value>> m16814d() {
        return this.f19392a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8053w0) {
            C8053w0 c8053w0 = (C8053w0) obj;
            if (l.b(this.f19392a, c8053w0.f19392a) && l.b(this.f19393b, c8053w0.f19393b) && l.b(this.f19394c, c8053w0.f19394c) && this.f19395d == c8053w0.f19395d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f19392a.hashCode();
        Integer num = this.f19393b;
        return hashCode + (num != null ? num.hashCode() : 0) + this.f19394c.hashCode() + this.f19395d;
    }

    public String toString() {
        return "PagingState(pages=" + this.f19392a + ", anchorPosition=" + this.f19393b + ", config=" + this.f19394c + ", leadingPlaceholderCount=" + this.f19395d + ')';
    }
}
