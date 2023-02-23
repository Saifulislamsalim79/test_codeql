package kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r;

import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13118t;
import kotlin.reflect.jvm.internal.impl.descriptors.C13550w;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
/* compiled from: constantValues.kt */
/* renamed from: kotlin.j0.o.c.p0.i.r.j */
/* loaded from: classes3.dex */
public final class C12717j extends AbstractC12712g<C13287o<? extends C12608b, ? extends C12614f>> {

    /* renamed from: b */
    private final C12608b f28576b;

    /* renamed from: c */
    private final C12614f f28577c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12717j(C12608b c12608b, C12614f c12614f) {
        super(C13664u.m4227a(c12608b, c12614f));
        l.f(c12608b, "enumClassId");
        l.f(c12614f, "enumEntryName");
        this.f28576b = c12608b;
        this.f28577c = c12614f;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g
    /* renamed from: a */
    public AbstractC12965b0 mo6871a(InterfaceC13305c0 interfaceC13305c0) {
        l.f(interfaceC13305c0, "module");
        InterfaceC13312e m4703a = C13550w.m4703a(interfaceC13305c0, this.f28576b);
        AbstractC13010i0 abstractC13010i0 = null;
        if (m4703a != null) {
            if (!C12673d.m7047A(m4703a)) {
                m4703a = null;
            }
            if (m4703a != null) {
                abstractC13010i0 = m4703a.mo5010x();
            }
        }
        if (abstractC13010i0 == null) {
            AbstractC13010i0 m5811j = C13118t.m5811j("Containing class for error-class based enum entry " + this.f28576b + '.' + this.f28577c);
            l.e(m5811j, "createErrorType(\"Containing class for error-class based enum entry $enumClassId.$enumEntryName\")");
            return m5811j;
        }
        return abstractC13010i0;
    }

    /* renamed from: c */
    public final C12614f m6906c() {
        return this.f28577c;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28576b.m7387j());
        sb.append('.');
        sb.append(this.f28577c);
        return sb.toString();
    }
}
