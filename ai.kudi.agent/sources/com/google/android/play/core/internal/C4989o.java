package com.google.android.play.core.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import p272h.p286c.p287a.p343d.p344a.p347c.C9357a;
/* renamed from: com.google.android.play.core.internal.o */
/* loaded from: classes2.dex */
public final class C4989o {

    /* renamed from: a */
    private static final C4957a f12646a = new C4957a("PhoneskyVerificationUtils");

    /* renamed from: a */
    public static boolean m25903a(Context context) {
        Signature[] signatureArr;
        try {
            signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (signatureArr == null || (r1 = signatureArr.length) == 0) {
            f12646a.m25953g("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            return false;
        }
        for (Signature signature : signatureArr) {
            String m14969b = C9357a.m14969b(signature.toByteArray());
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(m14969b)) {
                return true;
            }
            if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(m14969b)) {
                return true;
            }
        }
        return false;
    }
}
