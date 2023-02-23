package p201g.p259r;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlinx.coroutines.p559q2.C13971f;
import kotlinx.coroutines.p559q2.C13978g0;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import kotlinx.coroutines.p559q2.InterfaceC14022s;
import p201g.p259r.AbstractC8061y;
/* compiled from: MutableCombinedLoadStateCollection.kt */
/* renamed from: g.r.d0 */
/* loaded from: classes2.dex */
public final class C7848d0 {

    /* renamed from: a */
    private boolean f18780a;

    /* renamed from: b */
    private final CopyOnWriteArrayList<InterfaceC11767l<C7904j, C13666w>> f18781b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private AbstractC8061y f18782c = AbstractC8061y.C8064c.f19411b.m16800b();

    /* renamed from: d */
    private AbstractC8061y f18783d = AbstractC8061y.C8064c.f19411b.m16800b();

    /* renamed from: e */
    private AbstractC8061y f18784e = AbstractC8061y.C8064c.f19411b.m16800b();

    /* renamed from: f */
    private C7825a0 f18785f = C7825a0.f18693d.m17214a();

    /* renamed from: g */
    private C7825a0 f18786g;

    /* renamed from: h */
    private final InterfaceC14022s<C7904j> f18787h;

    /* renamed from: i */
    private final InterfaceC13964d<C7904j> f18788i;

    public C7848d0() {
        InterfaceC14022s<C7904j> m3302a = C13978g0.m3302a(null);
        this.f18787h = m3302a;
        this.f18788i = C13971f.m3321m(m3302a);
    }

    /* renamed from: b */
    private final AbstractC8061y m17152b(AbstractC8061y abstractC8061y, AbstractC8061y abstractC8061y2, AbstractC8061y abstractC8061y3, AbstractC8061y abstractC8061y4) {
        return abstractC8061y4 == null ? abstractC8061y3 : (!(abstractC8061y instanceof AbstractC8061y.C8063b) || ((abstractC8061y2 instanceof AbstractC8061y.C8064c) && (abstractC8061y4 instanceof AbstractC8061y.C8064c)) || (abstractC8061y4 instanceof AbstractC8061y.C8062a)) ? abstractC8061y4 : abstractC8061y;
    }

    /* renamed from: j */
    private final C7904j m17144j() {
        if (this.f18780a) {
            return new C7904j(this.f18782c, this.f18783d, this.f18784e, this.f18785f, this.f18786g);
        }
        return null;
    }

    /* renamed from: k */
    private final void m17143k() {
        AbstractC8061y abstractC8061y = this.f18782c;
        AbstractC8061y m17216g = this.f18785f.m17216g();
        AbstractC8061y m17216g2 = this.f18785f.m17216g();
        C7825a0 c7825a0 = this.f18786g;
        this.f18782c = m17152b(abstractC8061y, m17216g, m17216g2, c7825a0 == null ? null : c7825a0.m17216g());
        AbstractC8061y abstractC8061y2 = this.f18783d;
        AbstractC8061y m17216g3 = this.f18785f.m17216g();
        AbstractC8061y m17217f = this.f18785f.m17217f();
        C7825a0 c7825a02 = this.f18786g;
        this.f18783d = m17152b(abstractC8061y2, m17216g3, m17217f, c7825a02 == null ? null : c7825a02.m17217f());
        AbstractC8061y abstractC8061y3 = this.f18784e;
        AbstractC8061y m17216g4 = this.f18785f.m17216g();
        AbstractC8061y m17218e = this.f18785f.m17218e();
        C7825a0 c7825a03 = this.f18786g;
        this.f18784e = m17152b(abstractC8061y3, m17216g4, m17218e, c7825a03 != null ? c7825a03.m17218e() : null);
        C7904j m17144j = m17144j();
        if (m17144j != null) {
            this.f18787h.setValue(m17144j);
            Iterator<T> it = this.f18781b.iterator();
            while (it.hasNext()) {
                ((InterfaceC11767l) it.next()).invoke(m17144j);
            }
        }
    }

    /* renamed from: a */
    public final void m17153a(InterfaceC11767l<? super C7904j, C13666w> interfaceC11767l) {
        l.f(interfaceC11767l, "listener");
        this.f18781b.add(interfaceC11767l);
        C7904j m17144j = m17144j();
        if (m17144j == null) {
            return;
        }
        interfaceC11767l.invoke(m17144j);
    }

    /* renamed from: c */
    public final AbstractC8061y m17151c(EnumC7830b0 enumC7830b0, boolean z) {
        l.f(enumC7830b0, "type");
        C7825a0 c7825a0 = z ? this.f18786g : this.f18785f;
        if (c7825a0 == null) {
            return null;
        }
        return c7825a0.m17219d(enumC7830b0);
    }

    /* renamed from: d */
    public final InterfaceC13964d<C7904j> m17150d() {
        return this.f18788i;
    }

    /* renamed from: e */
    public final C7825a0 m17149e() {
        return this.f18786g;
    }

    /* renamed from: f */
    public final C7825a0 m17148f() {
        return this.f18785f;
    }

    /* renamed from: g */
    public final void m17147g(InterfaceC11767l<? super C7904j, C13666w> interfaceC11767l) {
        l.f(interfaceC11767l, "listener");
        this.f18781b.remove(interfaceC11767l);
    }

    /* renamed from: h */
    public final void m17146h(C7825a0 c7825a0, C7825a0 c7825a02) {
        l.f(c7825a0, "sourceLoadStates");
        this.f18780a = true;
        this.f18785f = c7825a0;
        this.f18786g = c7825a02;
        m17143k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (kotlin.e0.d.l.b(r4, r5) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (kotlin.e0.d.l.b(r4, r5) == false) goto L9;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m17145i(p201g.p259r.EnumC7830b0 r4, boolean r5, p201g.p259r.AbstractC8061y r6) {
        /*
            r3 = this;
            java.lang.String r0 = "type"
            kotlin.e0.d.l.f(r4, r0)
            java.lang.String r0 = "state"
            kotlin.e0.d.l.f(r6, r0)
            r0 = 1
            r3.f18780a = r0
            r1 = 0
            if (r5 == 0) goto L29
            g.r.a0 r5 = r3.f18786g
            if (r5 != 0) goto L1b
            g.r.a0$a r2 = p201g.p259r.C7825a0.f18693d
            g.r.a0 r2 = r2.m17214a()
            goto L1c
        L1b:
            r2 = r5
        L1c:
            g.r.a0 r4 = r2.m17215h(r4, r6)
            r3.f18786g = r4
            boolean r4 = kotlin.e0.d.l.b(r4, r5)
            if (r4 != 0) goto L38
            goto L39
        L29:
            g.r.a0 r5 = r3.f18785f
            g.r.a0 r4 = r5.m17215h(r4, r6)
            r3.f18785f = r4
            boolean r4 = kotlin.e0.d.l.b(r4, r5)
            if (r4 != 0) goto L38
            goto L39
        L38:
            r0 = 0
        L39:
            r3.m17143k()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7848d0.m17145i(g.r.b0, boolean, g.r.y):boolean");
    }
}
