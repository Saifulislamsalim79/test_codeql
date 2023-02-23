package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.z */
/* loaded from: classes2.dex */
public final class C4091z extends AbstractC4059x {
    public C4091z() {
        this.f9831a.add(EnumC3902n0.EQUALS);
        this.f9831a.add(EnumC3902n0.GREATER_THAN);
        this.f9831a.add(EnumC3902n0.GREATER_THAN_EQUALS);
        this.f9831a.add(EnumC3902n0.IDENTITY_EQUALS);
        this.f9831a.add(EnumC3902n0.IDENTITY_NOT_EQUALS);
        this.f9831a.add(EnumC3902n0.LESS_THAN);
        this.f9831a.add(EnumC3902n0.LESS_THAN_EQUALS);
        this.f9831a.add(EnumC3902n0.NOT_EQUALS);
    }

    /* renamed from: c */
    private static boolean m28587c(q qVar, q qVar2) {
        if (qVar.getClass().equals(qVar2.getClass())) {
            if ((qVar instanceof C4027v) || (qVar instanceof C3917o)) {
                return true;
            }
            if (qVar instanceof C3822i) {
                return (Double.isNaN(qVar.b().doubleValue()) || Double.isNaN(qVar2.b().doubleValue()) || qVar.b().doubleValue() != qVar2.b().doubleValue()) ? false : true;
            } else if (qVar instanceof C4011u) {
                return qVar.h().equals(qVar2.h());
            } else {
                if (qVar instanceof C3790g) {
                    return qVar.f().equals(qVar2.f());
                }
                return qVar == qVar2;
            }
        } else if (((qVar instanceof C4027v) || (qVar instanceof C3917o)) && ((qVar2 instanceof C4027v) || (qVar2 instanceof C3917o))) {
            return true;
        } else {
            boolean z = qVar instanceof C3822i;
            if (z && (qVar2 instanceof C4011u)) {
                return m28587c(qVar, new C3822i(qVar2.b()));
            }
            boolean z2 = qVar instanceof C4011u;
            if (z2 && (qVar2 instanceof C3822i)) {
                return m28587c(new C3822i(qVar.b()), qVar2);
            }
            if (qVar instanceof C3790g) {
                return m28587c(new C3822i(qVar.b()), qVar2);
            }
            if (qVar2 instanceof C3790g) {
                return m28587c(qVar, new C3822i(qVar2.b()));
            }
            if ((!z2 && !z) || !(qVar2 instanceof m)) {
                if ((qVar instanceof m) && ((qVar2 instanceof C4011u) || (qVar2 instanceof C3822i))) {
                    return m28587c(new C4011u(qVar.h()), qVar2);
                }
                return false;
            }
            return m28587c(qVar, new C4011u(qVar2.h()));
        }
    }

    /* renamed from: d */
    private static boolean m28586d(q qVar, q qVar2) {
        if (qVar instanceof m) {
            qVar = new C4011u(qVar.h());
        }
        if (qVar2 instanceof m) {
            qVar2 = new C4011u(qVar2.h());
        }
        if ((qVar instanceof C4011u) && (qVar2 instanceof C4011u)) {
            return qVar.h().compareTo(qVar2.h()) < 0;
        }
        double doubleValue = qVar.b().doubleValue();
        double doubleValue2 = qVar2.b().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    /* renamed from: e */
    private static boolean m28585e(q qVar, q qVar2) {
        if (qVar instanceof m) {
            qVar = new C4011u(qVar.h());
        }
        if (qVar2 instanceof m) {
            qVar2 = new C4011u(qVar2.h());
        }
        return (((qVar instanceof C4011u) && (qVar2 instanceof C4011u)) || !(Double.isNaN(qVar.b().doubleValue()) || Double.isNaN(qVar2.b().doubleValue()))) && !m28586d(qVar2, qVar);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4059x
    /* renamed from: a */
    public final q mo28588a(String str, C3968r4 c3968r4, List<q> list) {
        boolean m28587c;
        boolean m28587c2;
        C3969r5.m29037h(C3969r5.m29040e(str).name(), 2, list);
        q m29051b = c3968r4.m29051b(list.get(0));
        q m29051b2 = c3968r4.m29051b(list.get(1));
        int ordinal = C3969r5.m29040e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                m28587c2 = m28587c(m29051b, m29051b2);
            } else if (ordinal == 42) {
                m28587c = m28586d(m29051b, m29051b2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        m28587c = m28586d(m29051b2, m29051b);
                        break;
                    case 38:
                        m28587c = m28585e(m29051b2, m29051b);
                        break;
                    case 39:
                        m28587c = C3969r5.m29033l(m29051b, m29051b2);
                        break;
                    case 40:
                        m28587c2 = C3969r5.m29033l(m29051b, m29051b2);
                        break;
                    default:
                        super.m28671b(str);
                        throw null;
                }
            } else {
                m28587c = m28585e(m29051b, m29051b2);
            }
            m28587c = !m28587c2;
        } else {
            m28587c = m28587c(m29051b, m29051b2);
        }
        return m28587c ? q.n : q.o;
    }
}
