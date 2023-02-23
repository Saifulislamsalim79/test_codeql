package com.google.android.gms.internal.p104firebaseauthapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.p099l.C2946a;
import java.net.HttpURLConnection;
import java.net.URL;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jj */
/* loaded from: classes2.dex */
public interface InterfaceC3272jj {

    /* renamed from: h */
    public static final C2946a f8638h = new C2946a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    /* renamed from: a */
    Uri.Builder mo25354a(Intent intent, String str, String str2);

    /* renamed from: b */
    String mo25353b(String str);

    /* renamed from: c */
    HttpURLConnection mo25352c(URL url);

    /* renamed from: d */
    void mo25351d(Uri uri, String str);

    /* renamed from: e */
    void mo25350e(String str, Status status);

    Context zza();
}
