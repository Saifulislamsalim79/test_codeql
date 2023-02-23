package kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z;

import java.util.ArrayList;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12569t;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13728s;
/* compiled from: TypeTable.kt */
/* renamed from: kotlin.j0.o.c.p0.e.z.g */
/* loaded from: classes3.dex */
public final class C12598g {

    /* renamed from: a */
    private final List<C12555q> f28349a;

    public C12598g(C12569t c12569t) {
        int m3867o;
        l.f(c12569t, "typeTable");
        List<C12555q> m7603B = c12569t.m7603B();
        if (c12569t.m7602C()) {
            int m7589y = c12569t.m7589y();
            List<C12555q> m7603B2 = c12569t.m7603B();
            l.e(m7603B2, "typeTable.typeList");
            m3867o = C13728s.m3867o(m7603B2, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            int i = 0;
            for (Object obj : m7603B2) {
                int i2 = i + 1;
                if (i >= 0) {
                    C12555q c12555q = (C12555q) obj;
                    if (i >= m7589y) {
                        C12555q.C12561c mo4386b = c12555q.mo4386b();
                        mo4386b.m7734W(true);
                        c12555q = mo4386b.build();
                    }
                    arrayList.add(c12555q);
                    i = i2;
                } else {
                    C13722p.m3923n();
                    throw null;
                }
            }
            m7603B = arrayList;
        }
        l.e(m7603B, "run {\n        val originalTypes = typeTable.typeList\n        if (typeTable.hasFirstNullable()) {\n            val firstNullable = typeTable.firstNullable\n            typeTable.typeList.mapIndexed { i, type ->\n                if (i >= firstNullable) {\n                    type.toBuilder().setNullable(true).build()\n                } else type\n            }\n        } else originalTypes\n    }");
        this.f28349a = m7603B;
    }

    /* renamed from: a */
    public final C12555q m7412a(int i) {
        return this.f28349a.get(i);
    }
}
