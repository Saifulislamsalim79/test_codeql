package com.google.firebase.installations;

import com.google.firebase.FirebaseException;
/* loaded from: classes2.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* renamed from: com.google.firebase.installations.FirebaseInstallationsException$a */
    /* loaded from: classes2.dex */
    public enum EnumC6420a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(EnumC6420a enumC6420a) {
    }

    public FirebaseInstallationsException(String str, EnumC6420a enumC6420a) {
        super(str);
    }
}
