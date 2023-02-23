package kotlin.p493j0.p494o.p495c.p497p0;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.C12386v;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p557z.C13726r;
/* compiled from: SpecialJvmAnnotations.kt */
/* renamed from: kotlin.j0.o.c.p0.a */
/* loaded from: classes3.dex */
public final class C12034a {

    /* renamed from: a */
    public static final C12034a f26752a = new C12034a();

    /* renamed from: b */
    private static final Set<C12608b> f26753b;

    static {
        List<C12609c> m3888h;
        m3888h = C13726r.m3888h(C12386v.f27468a, C12386v.f27475h, C12386v.f27476i, C12386v.f27470c, C12386v.f27471d, C12386v.f27473f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C12609c c12609c : m3888h) {
            linkedHashSet.add(C12608b.m7384m(c12609c));
        }
        f26753b = linkedHashSet;
    }

    private C12034a() {
    }

    /* renamed from: a */
    public final Set<C12608b> m9961a() {
        return f26753b;
    }
}
