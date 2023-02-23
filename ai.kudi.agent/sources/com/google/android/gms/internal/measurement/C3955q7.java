package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.q7 */
/* loaded from: classes2.dex */
public final class C3955q7 {

    /* renamed from: a */
    final Map<String, Callable<? extends AbstractC3838j>> f9630a = new HashMap();

    /* renamed from: a */
    public final void m29083a(String str, Callable<? extends AbstractC3838j> callable) {
        this.f9630a.put(str, callable);
    }
}
