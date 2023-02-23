package kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p509n.C12256f;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.C12470a;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12901q;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12969c0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13118t;
/* compiled from: JavaFlexibleTypeDeserializer.kt */
/* renamed from: kotlin.j0.o.c.p0.d.b.g */
/* loaded from: classes3.dex */
public final class C12431g implements InterfaceC12901q {

    /* renamed from: a */
    public static final C12431g f27610a = new C12431g();

    private C12431g() {
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12901q
    /* renamed from: a */
    public AbstractC12965b0 mo6457a(C12555q c12555q, String str, AbstractC13010i0 abstractC13010i0, AbstractC13010i0 abstractC13010i02) {
        l.f(c12555q, "proto");
        l.f(str, "flexibleId");
        l.f(abstractC13010i0, "lowerBound");
        l.f(abstractC13010i02, "upperBound");
        if (!l.b(str, "kotlin.jvm.PlatformType")) {
            AbstractC13010i0 m5811j = C13118t.m5811j("Error java flexible type with id: " + str + ". (" + abstractC13010i0 + ".." + abstractC13010i02 + ')');
            l.e(m5811j, "createErrorType(\"Error java flexible type with id: $flexibleId. ($lowerBound..$upperBound)\")");
            return m5811j;
        } else if (c12555q.m4425x(C12470a.f27658g)) {
            return new C12256f(abstractC13010i0, abstractC13010i02);
        } else {
            C12969c0 c12969c0 = C12969c0.f29026a;
            return C12969c0.m6314d(abstractC13010i0, abstractC13010i02);
        }
    }
}
