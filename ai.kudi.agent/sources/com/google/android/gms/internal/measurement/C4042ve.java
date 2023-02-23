package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.ve */
/* loaded from: classes2.dex */
public final class C4042ve extends AbstractC3838j {

    /* renamed from: e */
    private final Callable<Object> f9803e;

    public C4042ve(String str, Callable<Object> callable) {
        super("internal.appMetadata");
        this.f9803e = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3838j
    /* renamed from: a */
    public final q mo28520a(C3968r4 c3968r4, List<q> list) {
        try {
            return C3986s6.m28974b(this.f9803e.call());
        } catch (Exception unused) {
            return q.i;
        }
    }
}
