package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.kj */
/* loaded from: classes2.dex */
public class C3299kj {

    /* renamed from: a */
    final String f8683a;

    /* renamed from: b */
    final C3111dk f8684b;

    public C3299kj(String str, C3111dk c3111dk) {
        this.f8683a = str;
        this.f8684b = c3111dk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final String m30840a(String str, String str2) {
        String str3 = this.f8683a;
        int length = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 5 + str.length() + String.valueOf(str2).length());
        sb.append(str3);
        sb.append(str);
        sb.append("?key=");
        sb.append(str2);
        return sb.toString();
    }
}
