package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.cc */
/* loaded from: classes2.dex */
public final class C3076cc implements InterfaceC3012a2 {
    public C3076cc(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, InterfaceC3022ac interfaceC3022ac) throws GeneralSecurityException {
        C3130ec.m31191d(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }
}
