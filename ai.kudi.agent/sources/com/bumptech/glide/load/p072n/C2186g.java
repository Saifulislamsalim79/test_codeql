package com.bumptech.glide.load.p072n;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.InterfaceC2118f;
import com.bumptech.glide.p086q.C2380j;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
/* compiled from: GlideUrl.java */
/* renamed from: com.bumptech.glide.load.n.g */
/* loaded from: classes2.dex */
public class C2186g implements InterfaceC2118f {

    /* renamed from: b */
    private final InterfaceC2187h f6485b;

    /* renamed from: c */
    private final URL f6486c;

    /* renamed from: d */
    private final String f6487d;

    /* renamed from: e */
    private String f6488e;

    /* renamed from: f */
    private URL f6489f;

    /* renamed from: g */
    private volatile byte[] f6490g;

    /* renamed from: h */
    private int f6491h;

    public C2186g(URL url) {
        this(url, InterfaceC2187h.f6492a);
    }

    /* renamed from: c */
    private byte[] m33580c() {
        if (this.f6490g == null) {
            this.f6490g = m33581b().getBytes(InterfaceC2118f.f6413a);
        }
        return this.f6490g;
    }

    /* renamed from: e */
    private String m33578e() {
        if (TextUtils.isEmpty(this.f6488e)) {
            String str = this.f6487d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.f6486c;
                C2380j.m33129d(url);
                str = url.toString();
            }
            this.f6488e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f6488e;
    }

    /* renamed from: f */
    private URL m33577f() throws MalformedURLException {
        if (this.f6489f == null) {
            this.f6489f = new URL(m33578e());
        }
        return this.f6489f;
    }

    /* renamed from: b */
    public String m33581b() {
        String str = this.f6487d;
        if (str != null) {
            return str;
        }
        URL url = this.f6486c;
        C2380j.m33129d(url);
        return url.toString();
    }

    /* renamed from: d */
    public Map<String, String> m33579d() {
        return this.f6485b.mo33575a();
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public boolean equals(Object obj) {
        if (obj instanceof C2186g) {
            C2186g c2186g = (C2186g) obj;
            return m33581b().equals(c2186g.m33581b()) && this.f6485b.equals(c2186g.f6485b);
        }
        return false;
    }

    /* renamed from: g */
    public URL m33576g() throws MalformedURLException {
        return m33577f();
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public int hashCode() {
        if (this.f6491h == 0) {
            int hashCode = m33581b().hashCode();
            this.f6491h = hashCode;
            this.f6491h = (hashCode * 31) + this.f6485b.hashCode();
        }
        return this.f6491h;
    }

    public String toString() {
        return m33581b();
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(m33580c());
    }

    public C2186g(String str) {
        this(str, InterfaceC2187h.f6492a);
    }

    public C2186g(URL url, InterfaceC2187h interfaceC2187h) {
        C2380j.m33129d(url);
        this.f6486c = url;
        this.f6487d = null;
        C2380j.m33129d(interfaceC2187h);
        this.f6485b = interfaceC2187h;
    }

    public C2186g(String str, InterfaceC2187h interfaceC2187h) {
        this.f6486c = null;
        C2380j.m33131b(str);
        this.f6487d = str;
        C2380j.m33129d(interfaceC2187h);
        this.f6485b = interfaceC2187h;
    }
}
