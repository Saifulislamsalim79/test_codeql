package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.l0 */
/* loaded from: classes2.dex */
public final class C3871l0 extends AbstractC4059x {
    @Override // com.google.android.gms.internal.measurement.AbstractC4059x
    /* renamed from: a */
    public final q mo28588a(String str, C3968r4 c3968r4, List<q> list) {
        if (str != null && !str.isEmpty() && c3968r4.m29045h(str)) {
            q m29049d = c3968r4.m29049d(str);
            if (m29049d instanceof AbstractC3838j) {
                return ((AbstractC3838j) m29049d).mo28520a(c3968r4, list);
            }
            throw new IllegalArgumentException(String.format("Function %s is not defined", str));
        }
        throw new IllegalArgumentException(String.format("Command not found: %s", str));
    }
}
