package com.google.android.gms.common.api;

import com.google.android.gms.common.C2830d;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: c */
    private final C2830d f7700c;

    public UnsupportedApiCallException(C2830d c2830d) {
        this.f7700c = c2830d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String valueOf = String.valueOf(this.f7700c);
        String.valueOf(valueOf).length();
        return "Missing ".concat(String.valueOf(valueOf));
    }
}
