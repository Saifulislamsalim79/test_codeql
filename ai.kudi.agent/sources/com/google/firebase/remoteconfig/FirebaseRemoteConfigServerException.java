package com.google.firebase.remoteconfig;
/* loaded from: classes2.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: c */
    private final int f16189c;

    public FirebaseRemoteConfigServerException(int i, String str) {
        super(str);
        this.f16189c = i;
    }

    /* renamed from: a */
    public int m20930a() {
        return this.f16189c;
    }

    public FirebaseRemoteConfigServerException(int i, String str, Throwable th) {
        super(str, th);
        this.f16189c = i;
    }
}
