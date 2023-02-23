package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.a0 */
/* loaded from: classes2.dex */
public final class C3697a0 extends AbstractC4059x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C3697a0() {
        this.f9831a.add(EnumC3902n0.APPLY);
        this.f9831a.add(EnumC3902n0.BLOCK);
        this.f9831a.add(EnumC3902n0.BREAK);
        this.f9831a.add(EnumC3902n0.CASE);
        this.f9831a.add(EnumC3902n0.DEFAULT);
        this.f9831a.add(EnumC3902n0.CONTINUE);
        this.f9831a.add(EnumC3902n0.DEFINE_FUNCTION);
        this.f9831a.add(EnumC3902n0.FN);
        this.f9831a.add(EnumC3902n0.IF);
        this.f9831a.add(EnumC3902n0.QUOTE);
        this.f9831a.add(EnumC3902n0.RETURN);
        this.f9831a.add(EnumC3902n0.SWITCH);
        this.f9831a.add(EnumC3902n0.TERNARY);
    }

    /* renamed from: c */
    private static q m29857c(C3968r4 c3968r4, List<q> list) {
        C3969r5.m29036i(EnumC3902n0.FN.name(), 2, list);
        q m29051b = c3968r4.m29051b(list.get(0));
        f m29051b2 = c3968r4.m29051b(list.get(1));
        if (m29051b2 instanceof f) {
            List O = m29051b2.O();
            List<q> arrayList = new ArrayList<>();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new C3933p(m29051b.h(), O, arrayList, c3968r4);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", m29051b2.getClass().getCanonicalName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0129, code lost:
        if (r9.equals("continue") == false) goto L67;
     */
    @Override // com.google.android.gms.internal.measurement.AbstractC4059x
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.q mo28588a(java.lang.String r9, com.google.android.gms.internal.measurement.C3968r4 r10, java.util.List<com.google.android.gms.internal.measurement.q> r11) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3697a0.mo28588a(java.lang.String, com.google.android.gms.internal.measurement.r4, java.util.List):com.google.android.gms.internal.measurement.q");
    }
}
