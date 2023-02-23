package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.c0 */
/* loaded from: classes2.dex */
final class C3730c0 implements Comparator<q> {

    /* renamed from: c */
    final /* synthetic */ AbstractC3838j f9213c;

    /* renamed from: d */
    final /* synthetic */ C3968r4 f9214d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3730c0(AbstractC3838j abstractC3838j, C3968r4 c3968r4) {
        this.f9213c = abstractC3838j;
        this.f9214d = c3968r4;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(q qVar, q qVar2) {
        q qVar3 = qVar;
        q qVar4 = qVar2;
        AbstractC3838j abstractC3838j = this.f9213c;
        C3968r4 c3968r4 = this.f9214d;
        if (qVar3 instanceof C4027v) {
            return !(qVar4 instanceof C4027v) ? 1 : 0;
        } else if (qVar4 instanceof C4027v) {
            return -1;
        } else {
            if (abstractC3838j == null) {
                return qVar3.h().compareTo(qVar4.h());
            }
            return (int) C3969r5.m29044a(abstractC3838j.mo28520a(c3968r4, Arrays.asList(qVar3, qVar4)).b().doubleValue());
        }
    }
}
