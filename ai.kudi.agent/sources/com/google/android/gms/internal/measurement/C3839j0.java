package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.j0 */
/* loaded from: classes2.dex */
public final class C3839j0 extends AbstractC4059x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C3839j0() {
        this.f9831a.add(EnumC3902n0.FOR_IN);
        this.f9831a.add(EnumC3902n0.FOR_IN_CONST);
        this.f9831a.add(EnumC3902n0.FOR_IN_LET);
        this.f9831a.add(EnumC3902n0.FOR_LET);
        this.f9831a.add(EnumC3902n0.FOR_OF);
        this.f9831a.add(EnumC3902n0.FOR_OF_CONST);
        this.f9831a.add(EnumC3902n0.FOR_OF_LET);
        this.f9831a.add(EnumC3902n0.WHILE);
    }

    /* renamed from: c */
    private static q m29502c(InterfaceC3807h0 interfaceC3807h0, Iterator<q> it, q qVar) {
        if (it != null) {
            while (it.hasNext()) {
                q m29050c = interfaceC3807h0.mo29533a(it.next()).m29050c((f) qVar);
                if (m29050c instanceof C3806h) {
                    C3806h c3806h = (C3806h) m29050c;
                    if ("break".equals(c3806h.m29576c())) {
                        return q.i;
                    }
                    if ("return".equals(c3806h.m29576c())) {
                        return c3806h;
                    }
                }
            }
        }
        return q.i;
    }

    /* renamed from: d */
    private static q m29501d(InterfaceC3807h0 interfaceC3807h0, q qVar, q qVar2) {
        return m29502c(interfaceC3807h0, qVar.l(), qVar2);
    }

    /* renamed from: e */
    private static q m29500e(InterfaceC3807h0 interfaceC3807h0, q qVar, q qVar2) {
        if (qVar instanceof Iterable) {
            return m29502c(interfaceC3807h0, ((Iterable) qVar).iterator(), qVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4059x
    /* renamed from: a */
    public final q mo28588a(String str, C3968r4 c3968r4, List<q> list) {
        EnumC3902n0 enumC3902n0 = EnumC3902n0.ADD;
        int ordinal = C3969r5.m29040e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    C3969r5.m29037h(EnumC3902n0.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof C4011u) {
                        String h = list.get(0).h();
                        return m29501d(new C3823i0(c3968r4, h), c3968r4.m29051b(list.get(1)), c3968r4.m29051b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    C3969r5.m29037h(EnumC3902n0.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof C4011u) {
                        String h2 = list.get(0).h();
                        return m29501d(new C3776f0(c3968r4, h2), c3968r4.m29051b(list.get(1)), c3968r4.m29051b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    C3969r5.m29037h(EnumC3902n0.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof C4011u) {
                        String h3 = list.get(0).h();
                        return m29501d(new C3791g0(c3968r4, h3), c3968r4.m29051b(list.get(1)), c3968r4.m29051b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    C3969r5.m29037h(EnumC3902n0.FOR_LET.name(), 4, list);
                    f m29051b = c3968r4.m29051b(list.get(0));
                    if (m29051b instanceof f) {
                        f fVar = m29051b;
                        q qVar = list.get(1);
                        q qVar2 = list.get(2);
                        q m29051b2 = c3968r4.m29051b(list.get(3));
                        C3968r4 m29052a = c3968r4.m29052a();
                        for (int i = 0; i < fVar.E(); i++) {
                            String h4 = fVar.F(i).h();
                            m29052a.m29046g(h4, c3968r4.m29049d(h4));
                        }
                        while (c3968r4.m29051b(qVar).f().booleanValue()) {
                            q m29050c = c3968r4.m29050c((f) m29051b2);
                            if (m29050c instanceof C3806h) {
                                C3806h c3806h = (C3806h) m29050c;
                                if ("break".equals(c3806h.m29576c())) {
                                    return q.i;
                                }
                                if ("return".equals(c3806h.m29576c())) {
                                    return c3806h;
                                }
                            }
                            C3968r4 m29052a2 = c3968r4.m29052a();
                            for (int i2 = 0; i2 < fVar.E(); i2++) {
                                String h5 = fVar.F(i2).h();
                                m29052a2.m29046g(h5, m29052a.m29049d(h5));
                            }
                            m29052a2.m29051b(qVar2);
                            m29052a = m29052a2;
                        }
                        return q.i;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    C3969r5.m29037h(EnumC3902n0.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof C4011u) {
                        String h6 = list.get(0).h();
                        return m29500e(new C3823i0(c3968r4, h6), c3968r4.m29051b(list.get(1)), c3968r4.m29051b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    C3969r5.m29037h(EnumC3902n0.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof C4011u) {
                        String h7 = list.get(0).h();
                        return m29500e(new C3776f0(c3968r4, h7), c3968r4.m29051b(list.get(1)), c3968r4.m29051b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    C3969r5.m29037h(EnumC3902n0.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof C4011u) {
                        String h8 = list.get(0).h();
                        return m29500e(new C3791g0(c3968r4, h8), c3968r4.m29051b(list.get(1)), c3968r4.m29051b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    super.m28671b(str);
                    throw null;
            }
        }
        C3969r5.m29037h(EnumC3902n0.WHILE.name(), 4, list);
        q qVar3 = list.get(0);
        q qVar4 = list.get(1);
        q m29051b3 = c3968r4.m29051b(list.get(3));
        if (c3968r4.m29051b(list.get(2)).f().booleanValue()) {
            q m29050c2 = c3968r4.m29050c((f) m29051b3);
            if (m29050c2 instanceof C3806h) {
                C3806h c3806h2 = (C3806h) m29050c2;
                if ("break".equals(c3806h2.m29576c())) {
                    return q.i;
                }
                if ("return".equals(c3806h2.m29576c())) {
                    return c3806h2;
                }
            }
        }
        while (c3968r4.m29051b(qVar3).f().booleanValue()) {
            q m29050c3 = c3968r4.m29050c((f) m29051b3);
            if (m29050c3 instanceof C3806h) {
                C3806h c3806h3 = (C3806h) m29050c3;
                if ("break".equals(c3806h3.m29576c())) {
                    return q.i;
                }
                if ("return".equals(c3806h3.m29576c())) {
                    return c3806h3;
                }
            }
            c3968r4.m29051b(qVar4);
        }
        return q.i;
    }
}
