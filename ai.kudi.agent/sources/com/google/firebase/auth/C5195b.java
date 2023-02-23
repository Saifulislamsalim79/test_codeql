package com.google.firebase.auth;

import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import android.net.Uri;
import java.util.Set;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.b */
/* loaded from: classes2.dex */
public class C5195b {

    /* renamed from: a */
    private final String f12958a;

    /* renamed from: b */
    private final String f12959b;

    static {
        new C5202e0();
    }

    private C5195b(String str) {
        String m25374d = m25374d(str, "apiKey");
        String m25374d2 = m25374d(str, "oobCode");
        String m25374d3 = m25374d(str, WalletTopUpActivity.EXTRA_MODE);
        if (m25374d != null && m25374d2 != null && m25374d3 != null) {
            com.google.android.gms.common.internal.s.f(m25374d);
            com.google.android.gms.common.internal.s.f(m25374d2);
            this.f12958a = m25374d2;
            com.google.android.gms.common.internal.s.f(m25374d3);
            m25374d(str, "continueUrl");
            m25374d(str, "languageCode");
            this.f12959b = m25374d(str, "tenantId");
            return;
        }
        throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", WalletTopUpActivity.EXTRA_MODE));
    }

    /* renamed from: b */
    public static C5195b m25376b(String str) {
        com.google.android.gms.common.internal.s.f(str);
        try {
            return new C5195b(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static String m25374d(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                String queryParameter = parse.getQueryParameter("link");
                com.google.android.gms.common.internal.s.f(queryParameter);
                return Uri.parse(queryParameter).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public String m25377a() {
        return this.f12958a;
    }

    /* renamed from: c */
    public final String m25375c() {
        return this.f12959b;
    }
}
