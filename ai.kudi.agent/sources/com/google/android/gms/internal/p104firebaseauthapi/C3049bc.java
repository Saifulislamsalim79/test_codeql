package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.bc */
/* loaded from: classes2.dex */
public final class C3049bc implements InterfaceC3672z1 {

    /* renamed from: g */
    private static final byte[] f8225g = new byte[0];

    /* renamed from: a */
    private final ECPrivateKey f8226a;

    /* renamed from: b */
    private final C3103dc f8227b;

    /* renamed from: c */
    private final String f8228c;

    /* renamed from: d */
    private final byte[] f8229d;

    /* renamed from: e */
    private final InterfaceC3022ac f8230e;

    /* renamed from: f */
    private final int f8231f;

    public C3049bc(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i, InterfaceC3022ac interfaceC3022ac) throws GeneralSecurityException {
        this.f8226a = eCPrivateKey;
        this.f8227b = new C3103dc(eCPrivateKey);
        this.f8229d = bArr;
        this.f8228c = str;
        this.f8231f = i;
        this.f8230e = interfaceC3022ac;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3672z1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] mo29912a(byte[] r10, byte[] r11) throws java.security.GeneralSecurityException {
        /*
            r9 = this;
            java.security.interfaces.ECPrivateKey r11 = r9.f8226a
            java.security.spec.ECParameterSpec r11 = r11.getParams()
            java.security.spec.EllipticCurve r11 = r11.getCurve()
            int r0 = r9.f8231f
            int r11 = com.google.android.gms.internal.p104firebaseauthapi.C3130ec.m31194a(r11)
            int r0 = r0 + (-1)
            if (r0 == 0) goto L1a
            r1 = 2
            if (r0 == r1) goto L18
            goto L1b
        L18:
            int r11 = r11 + r11
            goto L1d
        L1a:
            int r11 = r11 + r11
        L1b:
            int r11 = r11 + 1
        L1d:
            int r0 = r10.length
            if (r0 < r11) goto L49
            r1 = 0
            byte[] r3 = java.util.Arrays.copyOfRange(r10, r1, r11)
            com.google.android.gms.internal.firebase-auth-api.dc r2 = r9.f8227b
            java.lang.String r4 = r9.f8228c
            byte[] r5 = r9.f8229d
            com.google.android.gms.internal.firebase-auth-api.ac r1 = r9.f8230e
            int r7 = r1.zza()
            int r8 = r9.f8231f
            r6 = 0
            byte[] r1 = r2.m31250a(r3, r4, r5, r6, r7, r8)
            com.google.android.gms.internal.firebase-auth-api.ac r2 = r9.f8230e
            com.google.android.gms.internal.firebase-auth-api.i5 r1 = r2.mo31084a(r1)
            byte[] r10 = java.util.Arrays.copyOfRange(r10, r11, r0)
            byte[] r11 = com.google.android.gms.internal.p104firebaseauthapi.C3049bc.f8225g
            byte[] r10 = r1.m30982a(r10, r11)
            return r10
        L49:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "ciphertext too short"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p104firebaseauthapi.C3049bc.mo29912a(byte[], byte[]):byte[]");
    }
}
