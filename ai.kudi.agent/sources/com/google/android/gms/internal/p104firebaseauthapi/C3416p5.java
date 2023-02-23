package com.google.android.gms.internal.p104firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.p5 */
/* loaded from: classes2.dex */
public final class C3416p5 {

    /* renamed from: a */
    private final SharedPreferences f8841a;

    /* renamed from: b */
    private final String f8842b = "GenericIdpKeyset";

    public C3416p5(Context context, String str, String str2) throws IOException {
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f8841a = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        } else {
            this.f8841a = applicationContext.getSharedPreferences(str2, 0);
        }
    }

    /* renamed from: c */
    private final byte[] m30473c() throws IOException {
        try {
            String string = this.f8841a.getString(this.f8842b, null);
            if (string != null) {
                if (string.length() % 2 == 0) {
                    int length = string.length() / 2;
                    byte[] bArr = new byte[length];
                    for (int i = 0; i < length; i++) {
                        int i2 = i + i;
                        int digit = Character.digit(string.charAt(i2), 16);
                        int digit2 = Character.digit(string.charAt(i2 + 1), 16);
                        if (digit != -1 && digit2 != -1) {
                            bArr[i] = (byte) ((digit * 16) + digit2);
                        } else {
                            throw new IllegalArgumentException("input is not hexadecimal");
                        }
                    }
                    return bArr;
                }
                throw new IllegalArgumentException("Expected a string of even length");
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", this.f8842b));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", this.f8842b));
        }
    }

    /* renamed from: a */
    public final C3208h9 m30475a() throws IOException {
        return C3208h9.m31073B(m30473c(), C3617wo.m30072a());
    }

    /* renamed from: b */
    public final C3236ia m30474b() throws IOException {
        return C3236ia.m30969E(m30473c(), C3617wo.m30072a());
    }
}
