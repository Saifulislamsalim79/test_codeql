package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.e0 */
/* loaded from: classes2.dex */
public final class C3762e0 extends AbstractC4059x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C3762e0() {
        this.f9831a.add(EnumC3902n0.AND);
        this.f9831a.add(EnumC3902n0.NOT);
        this.f9831a.add(EnumC3902n0.OR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4059x
    /* renamed from: a */
    public final q mo28588a(String str, C3968r4 c3968r4, List<q> list) {
        EnumC3902n0 enumC3902n0 = EnumC3902n0.ADD;
        int ordinal = C3969r5.m29040e(str).ordinal();
        if (ordinal == 1) {
            C3969r5.m29037h(EnumC3902n0.AND.name(), 2, list);
            q m29051b = c3968r4.m29051b(list.get(0));
            return !m29051b.f().booleanValue() ? m29051b : c3968r4.m29051b(list.get(1));
        } else if (ordinal == 47) {
            C3969r5.m29037h(EnumC3902n0.NOT.name(), 1, list);
            return new C3790g(Boolean.valueOf(!c3968r4.m29051b(list.get(0)).f().booleanValue()));
        } else if (ordinal == 50) {
            C3969r5.m29037h(EnumC3902n0.OR.name(), 2, list);
            q m29051b2 = c3968r4.m29051b(list.get(0));
            return m29051b2.f().booleanValue() ? m29051b2 : c3968r4.m29051b(list.get(1));
        } else {
            super.m28671b(str);
            throw null;
        }
    }
}
