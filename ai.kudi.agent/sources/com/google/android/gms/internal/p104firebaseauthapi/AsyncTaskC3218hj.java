package com.google.android.gms.internal.p104firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.p099l.C2946a;
import com.google.firebase.auth.internal.C5227i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.hj */
/* loaded from: classes2.dex */
public final class AsyncTaskC3218hj extends AsyncTask<Void, Void, C3191gj> {

    /* renamed from: f */
    private static final C2946a f8543f = new C2946a("FirebaseAuth", "GetAuthDomainTask");

    /* renamed from: a */
    private final String f8544a;

    /* renamed from: b */
    private final String f8545b;

    /* renamed from: c */
    private final WeakReference<InterfaceC3272jj> f8546c;

    /* renamed from: d */
    private final Uri.Builder f8547d;

    /* renamed from: e */
    private final String f8548e;

    public AsyncTaskC3218hj(String str, String str2, Intent intent, InterfaceC3272jj interfaceC3272jj) {
        s.f(str);
        this.f8544a = str;
        s.f(str2);
        s.j(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        s.f(stringExtra);
        Uri.Builder buildUpon = Uri.parse(interfaceC3272jj.mo25353b(stringExtra)).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendPath("getProjectConfig").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        s.j(str2);
        appendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.f8545b = buildUpon.build().toString();
        this.f8546c = new WeakReference<>(interfaceC3272jj);
        this.f8547d = interfaceC3272jj.mo25354a(intent, str, str2);
        this.f8548e = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(C3191gj c3191gj) {
        String str;
        Uri.Builder builder;
        InterfaceC3272jj interfaceC3272jj = this.f8546c.get();
        String str2 = null;
        if (c3191gj != null) {
            str2 = c3191gj.m31094c();
            str = c3191gj.m31093d();
        } else {
            str = null;
        }
        if (interfaceC3272jj == null) {
            f8543f.m31583c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (!TextUtils.isEmpty(str2) && (builder = this.f8547d) != null) {
            builder.authority(str2);
            interfaceC3272jj.mo25351d(this.f8547d.build(), this.f8544a);
        } else {
            interfaceC3272jj.mo25350e(this.f8544a, C5227i.m25323a(str));
        }
    }

    /* renamed from: b */
    private static byte[] m31047b(InputStream inputStream, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e1 A[Catch: zzpz -> 0x00fc, NullPointerException -> 0x0124, IOException -> 0x014c, TryCatch #3 {IOException -> 0x014c, blocks: (B:6:0x0014, B:19:0x009f, B:20:0x00be, B:21:0x00db, B:23:0x00e1, B:25:0x00ef, B:27:0x00f7, B:18:0x0078), top: B:38:0x0014 }] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ com.google.android.gms.internal.p104firebaseauthapi.C3191gj doInBackground(java.lang.Void[] r7) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p104firebaseauthapi.AsyncTaskC3218hj.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onCancelled(C3191gj c3191gj) {
        onPostExecute(null);
    }
}
