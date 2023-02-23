package kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13130v;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12969c0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12977d0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13113r;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13118t;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13136y;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13728s;
/* compiled from: IntersectionType.kt */
/* renamed from: kotlin.j0.o.c.p0.l.j1.e */
/* loaded from: classes3.dex */
public final class C13021e {
    /* renamed from: a */
    public static final AbstractC13005g1 m6109a(List<? extends AbstractC13005g1> list) {
        int m3867o;
        int m3867o2;
        AbstractC13010i0 m5777e1;
        l.f(list, "types");
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                m3867o = C13728s.m3867o(list, 10);
                ArrayList arrayList = new ArrayList(m3867o);
                boolean z = false;
                boolean z2 = false;
                for (AbstractC13005g1 abstractC13005g1 : list) {
                    z = z || C12977d0.m6274a(abstractC13005g1);
                    if (abstractC13005g1 instanceof AbstractC13010i0) {
                        m5777e1 = (AbstractC13010i0) abstractC13005g1;
                    } else if (abstractC13005g1 instanceof AbstractC13130v) {
                        if (C13113r.m5831a(abstractC13005g1)) {
                            return abstractC13005g1;
                        }
                        m5777e1 = ((AbstractC13130v) abstractC13005g1).m5777e1();
                        z2 = true;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add(m5777e1);
                }
                if (z) {
                    AbstractC13010i0 m5811j = C13118t.m5811j(l.m("Intersection of error types: ", list));
                    l.e(m5811j, "createErrorType(\"Intersection of error types: $types\")");
                    return m5811j;
                } else if (!z2) {
                    return C13048x.f29139a.m6042c(arrayList);
                } else {
                    m3867o2 = C13728s.m3867o(list, 10);
                    ArrayList arrayList2 = new ArrayList(m3867o2);
                    for (AbstractC13005g1 abstractC13005g12 : list) {
                        arrayList2.add(C13136y.m5752d(abstractC13005g12));
                    }
                    C12969c0 c12969c0 = C12969c0.f29026a;
                    return C12969c0.m6314d(C13048x.f29139a.m6042c(arrayList), C13048x.f29139a.m6042c(arrayList2));
                }
            }
            return (AbstractC13005g1) C13722p.m3918q0(list);
        }
        throw new IllegalStateException("Expected some types".toString());
    }
}
