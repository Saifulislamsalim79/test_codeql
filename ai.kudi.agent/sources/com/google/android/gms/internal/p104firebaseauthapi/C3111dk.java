package com.google.android.gms.internal.p104firebaseauthapi;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import java.net.URLConnection;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.dk */
/* loaded from: classes2.dex */
public final class C3111dk {

    /* renamed from: a */
    private final Context f8397a;

    /* renamed from: b */
    private C3509sk f8398b;

    /* renamed from: c */
    private final String f8399c;

    /* renamed from: d */
    private boolean f8400d = false;

    /* renamed from: e */
    private String f8401e;

    public C3111dk(Context context, String str) {
        s.j(context);
        this.f8397a = context.getApplicationContext();
        this.f8399c = String.format("Android/%s/%s", "Fallback", str);
    }

    /* renamed from: a */
    public final void m31237a(URLConnection uRLConnection) {
        String sb;
        if (this.f8400d) {
            String str = this.f8399c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 19);
            sb2.append(str);
            sb2.append("/FirebaseUI-Android");
            sb = sb2.toString();
        } else {
            String str2 = this.f8399c;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 21);
            sb3.append(str2);
            sb3.append("/FirebaseCore-Android");
            sb = sb3.toString();
        }
        if (this.f8398b == null) {
            Context context = this.f8397a;
            this.f8398b = new C3509sk(context, context.getPackageName());
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.f8398b.m30272b());
        uRLConnection.setRequestProperty("X-Android-Cert", this.f8398b.m30273a());
        uRLConnection.setRequestProperty("Accept-Language", C3138ek.m31181a());
        uRLConnection.setRequestProperty("X-Client-Version", sb);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.f8401e);
        this.f8401e = null;
    }

    /* renamed from: b */
    public final void m31236b(String str) {
        this.f8400d = !TextUtils.isEmpty(str);
    }

    /* renamed from: c */
    public final void m31235c(String str) {
        this.f8401e = str;
    }
}
