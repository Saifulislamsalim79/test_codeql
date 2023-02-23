package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.b */
/* loaded from: classes2.dex */
public class C2850b {
    /* renamed from: a */
    public static ApiException m31817a(Status status) {
        if (status.m32095l()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
