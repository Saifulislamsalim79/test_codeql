package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.logging.Logger;
import java.util.regex.Pattern;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.om */
/* loaded from: classes2.dex */
final class C3407om {
    static {
        Logger.getLogger(C3407om.class.getName());
    }

    private C3407om() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC3351mi m30494a(String str) {
        return new C3456qj(Pattern.compile("[.-]"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m30493b(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m30492c(String str) {
        return str == null || str.isEmpty();
    }
}
