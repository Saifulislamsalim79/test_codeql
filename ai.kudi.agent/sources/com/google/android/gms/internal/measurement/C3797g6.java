package com.google.android.gms.internal.measurement;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.g6 */
/* loaded from: classes2.dex */
public final class C3797g6 extends AbstractC3892m6<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3797g6(C3845j6 c3845j6, String str, Boolean bool, boolean z) {
        super(c3845j6, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.AbstractC3892m6
    /* renamed from: a */
    final /* bridge */ /* synthetic */ Boolean mo29401a(Object obj) {
        if (C3891m5.f9472c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (C3891m5.f9473d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String m29399c = super.m29399c();
        String str = (String) obj;
        StringBuilder sb = new StringBuilder(String.valueOf(m29399c).length() + 28 + str.length());
        sb.append("Invalid boolean value for ");
        sb.append(m29399c);
        sb.append(": ");
        sb.append(str);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
