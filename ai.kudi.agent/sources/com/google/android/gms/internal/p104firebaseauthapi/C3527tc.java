package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.tc */
/* loaded from: classes2.dex */
public final class C3527tc implements InterfaceC3070c6 {

    /* renamed from: a */
    private final ThreadLocal<Mac> f8977a = new C3501sc(this);

    /* renamed from: b */
    private final String f8978b;

    /* renamed from: c */
    private final Key f8979c;

    /* renamed from: d */
    private final int f8980d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C3527tc(String str, Key key) throws GeneralSecurityException {
        char c;
        int i;
        this.f8978b = str;
        this.f8979c = key;
        if (key.getEncoded().length >= 16) {
            switch (str.hashCode()) {
                case -1823053428:
                    if (str.equals("HMACSHA1")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 392315023:
                    if (str.equals("HMACSHA224")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 392315118:
                    if (str.equals("HMACSHA256")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 392316170:
                    if (str.equals("HMACSHA384")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 392317873:
                    if (str.equals("HMACSHA512")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                i = 20;
            } else if (c == 1) {
                i = 28;
            } else if (c == 2) {
                i = 32;
            } else if (c != 3) {
                if (c != 4) {
                    throw new NoSuchAlgorithmException(str.length() != 0 ? "unknown Hmac algorithm: ".concat(str) : new String("unknown Hmac algorithm: "));
                }
                this.f8980d = 64;
                this.f8977a.get();
                return;
            } else {
                i = 48;
            }
            this.f8980d = i;
            this.f8977a.get();
            return;
        }
        throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3070c6
    /* renamed from: a */
    public final byte[] mo30216a(byte[] bArr, int i) throws GeneralSecurityException {
        if (i <= this.f8980d) {
            this.f8977a.get().update(bArr);
            return Arrays.copyOf(this.f8977a.get().doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
