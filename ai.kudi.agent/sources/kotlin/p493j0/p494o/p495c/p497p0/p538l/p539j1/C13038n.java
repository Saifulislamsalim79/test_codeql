package kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1;

import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12681j;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12979e;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13024g;
/* compiled from: NewKotlinTypeChecker.kt */
/* renamed from: kotlin.j0.o.c.p0.l.j1.n */
/* loaded from: classes3.dex */
public final class C13038n implements InterfaceC13036m {

    /* renamed from: c */
    private final AbstractC13026h f29130c;

    /* renamed from: d */
    private final AbstractC13024g f29131d;

    /* renamed from: e */
    private final C12681j f29132e;

    public C13038n(AbstractC13026h abstractC13026h, AbstractC13024g abstractC13024g) {
        l.f(abstractC13026h, "kotlinTypeRefiner");
        l.f(abstractC13024g, "kotlinTypePreparator");
        this.f29130c = abstractC13026h;
        this.f29131d = abstractC13024g;
        C12681j m6967n = C12681j.m6967n(mo6072c());
        l.e(m6967n, "createWithTypeRefiner(kotlinTypeRefiner)");
        this.f29132e = m6967n;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.InterfaceC13036m
    /* renamed from: a */
    public C12681j mo6074a() {
        return this.f29132e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.InterfaceC13022f
    /* renamed from: b */
    public boolean mo6073b(AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02) {
        l.f(abstractC12965b0, "a");
        l.f(abstractC12965b02, "b");
        return m6070e(new C13014a(false, false, false, mo6072c(), m6069f(), null, 38, null), abstractC12965b0.mo6202Z0(), abstractC12965b02.mo6202Z0());
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.InterfaceC13036m
    /* renamed from: c */
    public AbstractC13026h mo6072c() {
        return this.f29130c;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.InterfaceC13022f
    /* renamed from: d */
    public boolean mo6071d(AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02) {
        l.f(abstractC12965b0, "subtype");
        l.f(abstractC12965b02, "supertype");
        return m6068g(new C13014a(true, false, false, mo6072c(), m6069f(), null, 38, null), abstractC12965b0.mo6202Z0(), abstractC12965b02.mo6202Z0());
    }

    /* renamed from: e */
    public final boolean m6070e(C13014a c13014a, AbstractC13005g1 abstractC13005g1, AbstractC13005g1 abstractC13005g12) {
        l.f(c13014a, "<this>");
        l.f(abstractC13005g1, "a");
        l.f(abstractC13005g12, "b");
        return C12979e.f29045a.m6264i(c13014a, abstractC13005g1, abstractC13005g12);
    }

    /* renamed from: f */
    public AbstractC13024g m6069f() {
        return this.f29131d;
    }

    /* renamed from: g */
    public final boolean m6068g(C13014a c13014a, AbstractC13005g1 abstractC13005g1, AbstractC13005g1 abstractC13005g12) {
        l.f(c13014a, "<this>");
        l.f(abstractC13005g1, "subType");
        l.f(abstractC13005g12, "superType");
        return C12979e.m6257p(C12979e.f29045a, c13014a, abstractC13005g1, abstractC13005g12, false, 8, null);
    }

    public /* synthetic */ C13038n(AbstractC13026h abstractC13026h, AbstractC13024g abstractC13024g, int i, g gVar) {
        this(abstractC13026h, (i & 2) != 0 ? AbstractC13024g.C13025a.f29108a : abstractC13024g);
    }
}
