package com.google.android.gms.internal.measurement;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.f6 */
/* loaded from: classes2.dex */
public final class C3781f6 extends AbstractC3892m6<Long> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3781f6(C3845j6 c3845j6, String str, Long l, boolean z) {
        super(c3845j6, str, l, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3892m6
    /* renamed from: a */
    final /* bridge */ /* synthetic */ Long mo29401a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String m29399c = super.m29399c();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(m29399c).length() + 25 + str.length());
            sb.append("Invalid long value for ");
            sb.append(m29399c);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
