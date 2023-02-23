package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.w */
/* loaded from: classes2.dex */
public final class C4043w extends AbstractC4059x {
    public C4043w() {
        this.f9831a.add(EnumC3902n0.BITWISE_AND);
        this.f9831a.add(EnumC3902n0.BITWISE_LEFT_SHIFT);
        this.f9831a.add(EnumC3902n0.BITWISE_NOT);
        this.f9831a.add(EnumC3902n0.BITWISE_OR);
        this.f9831a.add(EnumC3902n0.BITWISE_RIGHT_SHIFT);
        this.f9831a.add(EnumC3902n0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f9831a.add(EnumC3902n0.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4059x
    /* renamed from: a */
    public final q mo28588a(String str, C3968r4 c3968r4, List<q> list) {
        EnumC3902n0 enumC3902n0 = EnumC3902n0.ADD;
        switch (C3969r5.m29040e(str).ordinal()) {
            case 4:
                C3969r5.m29037h(EnumC3902n0.BITWISE_AND.name(), 2, list);
                return new C3822i(Double.valueOf(C3969r5.m29043b(c3968r4.m29051b(list.get(0)).b().doubleValue()) & C3969r5.m29043b(c3968r4.m29051b(list.get(1)).b().doubleValue())));
            case 5:
                C3969r5.m29037h(EnumC3902n0.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C3822i(Double.valueOf(C3969r5.m29043b(c3968r4.m29051b(list.get(0)).b().doubleValue()) << ((int) (C3969r5.m29041d(c3968r4.m29051b(list.get(1)).b().doubleValue()) & 31))));
            case 6:
                C3969r5.m29037h(EnumC3902n0.BITWISE_NOT.name(), 1, list);
                return new C3822i(Double.valueOf(C3969r5.m29043b(c3968r4.m29051b(list.get(0)).b().doubleValue()) ^ (-1)));
            case 7:
                C3969r5.m29037h(EnumC3902n0.BITWISE_OR.name(), 2, list);
                return new C3822i(Double.valueOf(C3969r5.m29043b(c3968r4.m29051b(list.get(0)).b().doubleValue()) | C3969r5.m29043b(c3968r4.m29051b(list.get(1)).b().doubleValue())));
            case 8:
                C3969r5.m29037h(EnumC3902n0.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C3822i(Double.valueOf(C3969r5.m29043b(c3968r4.m29051b(list.get(0)).b().doubleValue()) >> ((int) (C3969r5.m29041d(c3968r4.m29051b(list.get(1)).b().doubleValue()) & 31))));
            case 9:
                C3969r5.m29037h(EnumC3902n0.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C3822i(Double.valueOf(C3969r5.m29041d(c3968r4.m29051b(list.get(0)).b().doubleValue()) >>> ((int) (C3969r5.m29041d(c3968r4.m29051b(list.get(1)).b().doubleValue()) & 31))));
            case 10:
                C3969r5.m29037h(EnumC3902n0.BITWISE_XOR.name(), 2, list);
                return new C3822i(Double.valueOf(C3969r5.m29043b(c3968r4.m29051b(list.get(0)).b().doubleValue()) ^ C3969r5.m29043b(c3968r4.m29051b(list.get(1)).b().doubleValue())));
            default:
                super.m28671b(str);
                throw null;
        }
    }
}
