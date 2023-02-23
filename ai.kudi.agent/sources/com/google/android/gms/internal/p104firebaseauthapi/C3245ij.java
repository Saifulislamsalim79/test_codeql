package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ij */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3245ij {
    /* renamed from: a */
    public static String m30961a(InterfaceC3272jj interfaceC3272jj, String str) {
        try {
            String str2 = new String(MessageDigest.getInstance("SHA-256").digest(str.getBytes()));
            int length = str2.length();
            int i = 0;
            while (i < length) {
                if (C3474rb.m30380a(str2.charAt(i))) {
                    char[] charArray = str2.toCharArray();
                    while (i < length) {
                        char c = charArray[i];
                        if (C3474rb.m30380a(c)) {
                            charArray[i] = (char) (c ^ ' ');
                        }
                        i++;
                    }
                    return String.valueOf(charArray);
                }
                i++;
            }
            return str2;
        } catch (NoSuchAlgorithmException unused) {
            InterfaceC3272jj.f8638h.m31583c("Failed to get SHA-256 MessageDigest", new Object[0]);
            return null;
        }
    }
}
