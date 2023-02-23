package com.google.android.gms.internal.measurement;

import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.m0 */
/* loaded from: classes2.dex */
public final class C3886m0 extends AbstractC4059x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C3886m0() {
        this.f9831a.add(EnumC3902n0.ASSIGN);
        this.f9831a.add(EnumC3902n0.CONST);
        this.f9831a.add(EnumC3902n0.CREATE_ARRAY);
        this.f9831a.add(EnumC3902n0.CREATE_OBJECT);
        this.f9831a.add(EnumC3902n0.EXPRESSION_LIST);
        this.f9831a.add(EnumC3902n0.GET);
        this.f9831a.add(EnumC3902n0.GET_INDEX);
        this.f9831a.add(EnumC3902n0.GET_PROPERTY);
        this.f9831a.add(EnumC3902n0.NULL);
        this.f9831a.add(EnumC3902n0.SET_PROPERTY);
        this.f9831a.add(EnumC3902n0.TYPEOF);
        this.f9831a.add(EnumC3902n0.UNDEFINED);
        this.f9831a.add(EnumC3902n0.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4059x
    /* renamed from: a */
    public final q mo28588a(String str, C3968r4 c3968r4, List<q> list) {
        String str2;
        EnumC3902n0 enumC3902n0 = EnumC3902n0.ADD;
        int ordinal = C3969r5.m29040e(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            C3969r5.m29037h(EnumC3902n0.ASSIGN.name(), 2, list);
            q m29051b = c3968r4.m29051b(list.get(0));
            if (m29051b instanceof C4011u) {
                if (c3968r4.m29045h(m29051b.h())) {
                    q m29051b2 = c3968r4.m29051b(list.get(1));
                    c3968r4.m29046g(m29051b.h(), m29051b2);
                    return m29051b2;
                }
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", m29051b.h()));
            }
            throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", m29051b.getClass().getCanonicalName()));
        } else if (ordinal == 14) {
            C3969r5.m29036i(EnumC3902n0.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                for (int i2 = 0; i2 < list.size() - 1; i2 += 2) {
                    q m29051b3 = c3968r4.m29051b(list.get(i2));
                    if (m29051b3 instanceof C4011u) {
                        c3968r4.m29047f(m29051b3.h(), c3968r4.m29051b(list.get(i2 + 1)));
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", m29051b3.getClass().getCanonicalName()));
                    }
                }
                return q.i;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        } else if (ordinal == 24) {
            C3969r5.m29036i(EnumC3902n0.EXPRESSION_LIST.name(), 1, list);
            q qVar = q.i;
            while (i < list.size()) {
                qVar = c3968r4.m29051b(list.get(i));
                if (qVar instanceof C3806h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i++;
            }
            return qVar;
        } else if (ordinal == 33) {
            C3969r5.m29037h(EnumC3902n0.GET.name(), 1, list);
            q m29051b4 = c3968r4.m29051b(list.get(0));
            if (m29051b4 instanceof C4011u) {
                return c3968r4.m29049d(m29051b4.h());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", m29051b4.getClass().getCanonicalName()));
        } else if (ordinal == 49) {
            C3969r5.m29037h(EnumC3902n0.NULL.name(), 0, list);
            return q.j;
        } else if (ordinal == 58) {
            C3969r5.m29037h(EnumC3902n0.SET_PROPERTY.name(), 3, list);
            f m29051b5 = c3968r4.m29051b(list.get(0));
            q m29051b6 = c3968r4.m29051b(list.get(1));
            q m29051b7 = c3968r4.m29051b(list.get(2));
            if (m29051b5 != q.i && m29051b5 != q.j) {
                if ((m29051b5 instanceof f) && (m29051b6 instanceof C3822i)) {
                    m29051b5.Z(m29051b6.b().intValue(), m29051b7);
                } else if (m29051b5 instanceof m) {
                    ((m) m29051b5).k(m29051b6.h(), m29051b7);
                }
                return m29051b7;
            }
            throw new IllegalStateException(String.format("Can't set property %s of %s", m29051b6.h(), m29051b5.h()));
        } else if (ordinal == 17) {
            if (list.isEmpty()) {
                return new f();
            }
            f fVar = new f();
            for (q qVar2 : list) {
                q m29051b8 = c3968r4.m29051b(qVar2);
                if (!(m29051b8 instanceof C3806h)) {
                    fVar.Z(i, m29051b8);
                    i++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return fVar;
        } else if (ordinal == 18) {
            if (list.isEmpty()) {
                return new C3901n();
            }
            if (list.size() % 2 == 0) {
                C3901n c3901n = new C3901n();
                while (i < list.size() - 1) {
                    q m29051b9 = c3968r4.m29051b(list.get(i));
                    q m29051b10 = c3968r4.m29051b(list.get(i + 1));
                    if (!(m29051b9 instanceof C3806h) && !(m29051b10 instanceof C3806h)) {
                        c3901n.m29370k(m29051b9.h(), m29051b10);
                        i += 2;
                    } else {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                }
                return c3901n;
            }
            throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        } else if (ordinal != 35 && ordinal != 36) {
            switch (ordinal) {
                case 62:
                    C3969r5.m29037h(EnumC3902n0.TYPEOF.name(), 1, list);
                    q m29051b11 = c3968r4.m29051b(list.get(0));
                    if (m29051b11 instanceof C4027v) {
                        str2 = "undefined";
                    } else if (m29051b11 instanceof C3790g) {
                        str2 = AttributeType.BOOLEAN;
                    } else if (m29051b11 instanceof C3822i) {
                        str2 = AttributeType.NUMBER;
                    } else if (m29051b11 instanceof C4011u) {
                        str2 = "string";
                    } else if (m29051b11 instanceof C3933p) {
                        str2 = "function";
                    } else if ((m29051b11 instanceof C3963r) || (m29051b11 instanceof C3806h)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", m29051b11));
                    } else {
                        str2 = "object";
                    }
                    return new C4011u(str2);
                case 63:
                    C3969r5.m29037h(EnumC3902n0.UNDEFINED.name(), 0, list);
                    return q.i;
                case 64:
                    C3969r5.m29036i(EnumC3902n0.VAR.name(), 1, list);
                    for (q qVar3 : list) {
                        q m29051b12 = c3968r4.m29051b(qVar3);
                        if (m29051b12 instanceof C4011u) {
                            c3968r4.m29048e(m29051b12.h(), q.i);
                        } else {
                            throw new IllegalArgumentException(String.format("Expected string for var name. got %s", m29051b12.getClass().getCanonicalName()));
                        }
                    }
                    return q.i;
                default:
                    super.m28671b(str);
                    throw null;
            }
        } else {
            C3969r5.m29037h(EnumC3902n0.GET_PROPERTY.name(), 2, list);
            f m29051b13 = c3968r4.m29051b(list.get(0));
            q m29051b14 = c3968r4.m29051b(list.get(1));
            if ((m29051b13 instanceof f) && C3969r5.m29034k(m29051b14)) {
                return m29051b13.F(m29051b14.b().intValue());
            }
            if (m29051b13 instanceof m) {
                return ((m) m29051b13).m(m29051b14.h());
            }
            if (m29051b13 instanceof C4011u) {
                if ("length".equals(m29051b14.h())) {
                    return new C3822i(Double.valueOf(m29051b13.h().length()));
                }
                if (C3969r5.m29034k(m29051b14) && m29051b14.b().doubleValue() < m29051b13.h().length()) {
                    return new C4011u(String.valueOf(m29051b13.h().charAt(m29051b14.b().intValue())));
                }
            }
            return q.i;
        }
    }
}
