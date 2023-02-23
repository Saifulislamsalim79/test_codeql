package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.k0 */
/* loaded from: classes2.dex */
public final class C3855k0 extends AbstractC4059x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C3855k0() {
        this.f9831a.add(EnumC3902n0.ADD);
        this.f9831a.add(EnumC3902n0.DIVIDE);
        this.f9831a.add(EnumC3902n0.MODULUS);
        this.f9831a.add(EnumC3902n0.MULTIPLY);
        this.f9831a.add(EnumC3902n0.NEGATE);
        this.f9831a.add(EnumC3902n0.POST_DECREMENT);
        this.f9831a.add(EnumC3902n0.POST_INCREMENT);
        this.f9831a.add(EnumC3902n0.PRE_DECREMENT);
        this.f9831a.add(EnumC3902n0.PRE_INCREMENT);
        this.f9831a.add(EnumC3902n0.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4059x
    /* renamed from: a */
    public final q mo28588a(String str, C3968r4 c3968r4, List<q> list) {
        EnumC3902n0 enumC3902n0 = EnumC3902n0.ADD;
        int ordinal = C3969r5.m29040e(str).ordinal();
        if (ordinal == 0) {
            C3969r5.m29037h(EnumC3902n0.ADD.name(), 2, list);
            q m29051b = c3968r4.m29051b(list.get(0));
            q m29051b2 = c3968r4.m29051b(list.get(1));
            if (!(m29051b instanceof m) && !(m29051b instanceof C4011u) && !(m29051b2 instanceof m) && !(m29051b2 instanceof C4011u)) {
                return new C3822i(Double.valueOf(m29051b.b().doubleValue() + m29051b2.b().doubleValue()));
            }
            String valueOf = String.valueOf(m29051b.h());
            String valueOf2 = String.valueOf(m29051b2.h());
            return new C4011u(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        } else if (ordinal == 21) {
            C3969r5.m29037h(EnumC3902n0.DIVIDE.name(), 2, list);
            return new C3822i(Double.valueOf(c3968r4.m29051b(list.get(0)).b().doubleValue() / c3968r4.m29051b(list.get(1)).b().doubleValue()));
        } else if (ordinal == 59) {
            C3969r5.m29037h(EnumC3902n0.SUBTRACT.name(), 2, list);
            return new C3822i(Double.valueOf(c3968r4.m29051b(list.get(0)).b().doubleValue() + new C3822i(Double.valueOf(-c3968r4.m29051b(list.get(1)).b().doubleValue())).b().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            C3969r5.m29037h(str, 2, list);
            q m29051b3 = c3968r4.m29051b(list.get(0));
            c3968r4.m29051b(list.get(1));
            return m29051b3;
        } else if (ordinal != 55 && ordinal != 56) {
            switch (ordinal) {
                case 44:
                    C3969r5.m29037h(EnumC3902n0.MODULUS.name(), 2, list);
                    return new C3822i(Double.valueOf(c3968r4.m29051b(list.get(0)).b().doubleValue() % c3968r4.m29051b(list.get(1)).b().doubleValue()));
                case 45:
                    C3969r5.m29037h(EnumC3902n0.MULTIPLY.name(), 2, list);
                    return new C3822i(Double.valueOf(c3968r4.m29051b(list.get(0)).b().doubleValue() * c3968r4.m29051b(list.get(1)).b().doubleValue()));
                case 46:
                    C3969r5.m29037h(EnumC3902n0.NEGATE.name(), 1, list);
                    return new C3822i(Double.valueOf(-c3968r4.m29051b(list.get(0)).b().doubleValue()));
                default:
                    super.m28671b(str);
                    throw null;
            }
        } else {
            C3969r5.m29037h(str, 1, list);
            return c3968r4.m29051b(list.get(0));
        }
    }
}
