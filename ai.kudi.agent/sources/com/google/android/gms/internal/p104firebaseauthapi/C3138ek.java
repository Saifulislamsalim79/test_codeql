package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.Locale;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ek */
/* loaded from: classes2.dex */
public final class C3138ek {
    /* renamed from: a */
    public static String m31181a() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        m31180b(sb, locale);
        if (!locale.equals(Locale.US)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            m31180b(sb, Locale.US);
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static void m31180b(StringBuilder sb, Locale locale) {
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append("-");
                sb.append(country);
            }
        }
    }
}
