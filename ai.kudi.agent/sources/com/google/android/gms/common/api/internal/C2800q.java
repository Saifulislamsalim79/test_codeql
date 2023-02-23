package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C4465k;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.q */
/* loaded from: classes2.dex */
public class C2800q {
    /* renamed from: a */
    public static void m31926a(Status status, C4465k<Void> c4465k) {
        m31925b(status, null, c4465k);
    }

    /* renamed from: b */
    public static <TResult> void m31925b(Status status, TResult tresult, C4465k<TResult> c4465k) {
        if (status.m32094s()) {
            c4465k.m27775c(tresult);
        } else {
            c4465k.m27776b(new ApiException(status));
        }
    }
}
