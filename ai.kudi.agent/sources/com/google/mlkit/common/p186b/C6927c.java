package com.google.mlkit.common.p186b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2886k;
import com.google.android.gms.common.util.C2974l;
import java.util.Locale;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: com.google.mlkit.common.b.c */
/* loaded from: classes2.dex */
public class C6927c {

    /* renamed from: a */
    private static final C2886k f16619a = new C2886k("CommonUtils", "");

    /* renamed from: a */
    public static String m20457a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            f16619a.m31713c("CommonUtils", "Exception thrown when trying to get app version ".concat(e.toString()));
            return "";
        }
    }

    /* renamed from: b */
    public static String m20456b(Locale locale) {
        if (C2974l.m31517f()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb.append("-");
            sb.append(locale.getVariant());
        }
        return sb.toString();
    }
}
