package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.util.Base64;
import com.google.android.play.core.internal.C5004x;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import p272h.p286c.p287a.p343d.p344a.p347c.C9357a;
/* renamed from: com.google.android.play.core.assetpacks.v1 */
/* loaded from: classes2.dex */
public final class C4932v1 {

    /* renamed from: a */
    private static InterfaceC4849d f12552a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized InterfaceC4849d m25999a(Context context) {
        InterfaceC4849d interfaceC4849d;
        synchronized (C4932v1.class) {
            if (f12552a == null) {
                C4903o0 c4903o0 = new C4903o0(null);
                c4903o0.m26055b(new C4838a3(C9357a.m14970a(context)));
                f12552a = c4903o0.m26056a();
            }
            interfaceC4849d = f12552a;
        }
        return interfaceC4849d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m25998b(List<File> list) throws NoSuchAlgorithmException, IOException {
        int read;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        for (File file : list) {
            FileInputStream fileInputStream = new FileInputStream(file);
            do {
                try {
                    read = fileInputStream.read(bArr);
                    if (read > 0) {
                        messageDigest.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        C5004x.m25877a(th, th2);
                    }
                    throw th;
                }
            } while (read != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(messageDigest.digest(), 11);
    }

    /* renamed from: c */
    public static boolean m25997c(int i) {
        return i == 1 || i == 7 || i == 2 || i == 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m25996d(int i, int i2) {
        if (i == 5) {
            if (i2 != 5) {
                return true;
            }
            i = 5;
        }
        if (i != 6 || i2 == 6 || i2 == 5) {
            if (i != 4 || i2 == 4) {
                if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
                    return true;
                }
                if (i == 2) {
                    return i2 == 1 || i2 == 8;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static long m25995e(byte[] bArr, int i) {
        return ((m25993g(bArr, i + 2) << 16) | m25993g(bArr, i)) & 4294967295L;
    }

    /* renamed from: f */
    public static boolean m25994f(int i) {
        return i == 5 || i == 6 || i == 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m25993g(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: h */
    public static boolean m25992h(int i) {
        return i == 2 || i == 7 || i == 3;
    }
}
