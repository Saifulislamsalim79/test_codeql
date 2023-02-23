package com.google.android.gms.internal.p104firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C2900o;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.bk */
/* loaded from: classes2.dex */
public final class C3057bk {

    /* renamed from: a */
    private final int f8249a;

    public C3057bk(String str) {
        int i = -1;
        try {
            List<String> m30291d = C3490s1.m30292c("[.-]").m30291d(str);
            if (m30291d.size() == 1) {
                i = Integer.parseInt(str);
                str = str;
            } else {
                str = str;
                if (m30291d.size() >= 3) {
                    int parseInt = (Integer.parseInt(m30291d.get(0)) * 1000000) + (Integer.parseInt(m30291d.get(1)) * 1000);
                    int parseInt2 = Integer.parseInt(m30291d.get(2));
                    i = parseInt + parseInt2;
                    str = parseInt2;
                }
            }
        } catch (IllegalArgumentException e) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e));
            }
        }
        this.f8249a = i;
    }

    /* renamed from: a */
    public static C3057bk m31380a() {
        return new C3057bk(m31378c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m31378c() {
        String m31703b = C2900o.m31704a().m31703b("firebase-auth");
        return (TextUtils.isEmpty(m31703b) || m31703b.equals("UNKNOWN")) ? "-1" : m31703b;
    }

    /* renamed from: b */
    public final String m31379b() {
        return String.format("X%s", Integer.toString(this.f8249a));
    }
}
