package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.common.p102o.C2956c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.util.a */
/* loaded from: classes2.dex */
public class C2963a {
    @Deprecated
    /* renamed from: a */
    public static byte[] m31546a(Context context, String str) throws PackageManager.NameNotFoundException {
        MessageDigest m31545b;
        PackageInfo m31551e = C2956c.m31548a(context).m31551e(str, 64);
        Signature[] signatureArr = m31551e.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (m31545b = m31545b("SHA1")) == null) {
            return null;
        }
        return m31545b.digest(m31551e.signatures[0].toByteArray());
    }

    /* renamed from: b */
    public static MessageDigest m31545b(String str) {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
