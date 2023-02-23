package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.C4469m;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p272h.p286c.p287a.p300b.p307d.p313f.C8443l;
import p272h.p286c.p287a.p300b.p307d.p313f.C8444m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.d0 */
/* loaded from: classes2.dex */
public class C6487d0 implements Closeable {

    /* renamed from: c */
    private final URL f15654c;

    /* renamed from: d */
    private com.google.android.gms.tasks.j<Bitmap> f15655d;

    /* renamed from: e */
    private volatile InputStream f15656e;

    private C6487d0(URL url) {
        this.f15654c = url;
    }

    /* renamed from: g */
    private byte[] m21860g() throws IOException {
        URLConnection openConnection = this.f15654c.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                this.f15656e = inputStream;
                byte[] m16100b = C8443l.m16100b(C8443l.m16101a(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    String valueOf = String.valueOf(this.f15654c);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("Downloaded ");
                    sb.append(m16100b.length);
                    sb.append(" bytes from ");
                    sb.append(valueOf);
                    Log.v("FirebaseMessaging", sb.toString());
                }
                if (m16100b.length <= 1048576) {
                    return m16100b;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    /* renamed from: m */
    public static C6487d0 m21859m(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C6487d0(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(valueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    /* renamed from: F */
    public com.google.android.gms.tasks.j<Bitmap> m21863F() {
        com.google.android.gms.tasks.j<Bitmap> jVar = this.f15655d;
        com.google.android.gms.common.internal.s.j(jVar);
        return jVar;
    }

    /* renamed from: I */
    public void m21862I(Executor executor) {
        this.f15655d = C4469m.m27768c(executor, new Callable() { // from class: com.google.firebase.messaging.c0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6487d0.this.m21861c();
            }
        });
    }

    /* renamed from: c */
    public Bitmap m21861c() throws IOException {
        String valueOf = String.valueOf(this.f15654c);
        String.valueOf(valueOf).length();
        Log.i("FirebaseMessaging", "Starting download of: ".concat(String.valueOf(valueOf)));
        byte[] m21860g = m21860g();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m21860g, 0, m21860g.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf2 = String.valueOf(this.f15654c);
                String.valueOf(valueOf2).length();
                Log.d("FirebaseMessaging", "Successfully downloaded image: ".concat(String.valueOf(valueOf2)));
            }
            return decodeByteArray;
        }
        String valueOf3 = String.valueOf(this.f15654c);
        String.valueOf(valueOf3).length();
        throw new IOException("Failed to decode image: ".concat(String.valueOf(valueOf3)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            C8444m.m16098a(this.f15656e);
        } catch (NullPointerException e) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e);
        }
    }
}
