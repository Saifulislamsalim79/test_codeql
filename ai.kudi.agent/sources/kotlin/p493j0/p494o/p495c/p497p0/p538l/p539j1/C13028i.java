package kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1;

import java.util.ArrayList;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.C13302b0;
/* compiled from: KotlinTypeRefiner.kt */
/* renamed from: kotlin.j0.o.c.p0.l.j1.i */
/* loaded from: classes3.dex */
public final class C13028i {

    /* renamed from: a */
    private static final C13302b0<C13041q<AbstractC13026h>> f29110a = new C13302b0<>("KotlinTypeRefiner");

    /* renamed from: a */
    public static final C13302b0<C13041q<AbstractC13026h>> m6097a() {
        return f29110a;
    }

    /* renamed from: b */
    public static final List<AbstractC12965b0> m6096b(AbstractC13026h abstractC13026h, Iterable<? extends AbstractC12965b0> iterable) {
        int m3867o;
        l.f(abstractC13026h, "<this>");
        l.f(iterable, "types");
        m3867o = C13728s.m3867o(iterable, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (AbstractC12965b0 abstractC12965b0 : iterable) {
            abstractC13026h.mo6099g(abstractC12965b0);
            arrayList.add(abstractC12965b0);
        }
        return arrayList;
    }
}
