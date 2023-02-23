package com.google.mlkit.common;

import com.google.android.gms.common.internal.s;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* loaded from: classes2.dex */
public class MlKitException extends Exception {

    /* renamed from: c */
    private final int f16604c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(String str, int i) {
        super(str);
        s.g(str, "Provided message must not be empty.");
        this.f16604c = i;
    }

    /* renamed from: a */
    public int m20462a() {
        return this.f16604c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(String str, int i, Throwable th) {
        super(str, th);
        s.g(str, "Provided message must not be empty.");
        this.f16604c = i;
    }
}
