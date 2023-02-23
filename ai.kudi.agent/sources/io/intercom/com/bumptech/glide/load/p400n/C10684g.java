package io.intercom.com.bumptech.glide.load.p400n;

import android.net.Uri;
import android.text.TextUtils;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
/* compiled from: GlideUrl.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.g */
/* loaded from: classes3.dex */
public class C10684g implements InterfaceC10622g {

    /* renamed from: b */
    private final InterfaceC10685h f24481b;

    /* renamed from: c */
    private final URL f24482c;

    /* renamed from: d */
    private final String f24483d;

    /* renamed from: e */
    private String f24484e;

    /* renamed from: f */
    private URL f24485f;

    /* renamed from: g */
    private volatile byte[] f24486g;

    /* renamed from: h */
    private int f24487h;

    public C10684g(URL url) {
        this(url, InterfaceC10685h.f24488a);
    }

    /* renamed from: b */
    private byte[] m12524b() {
        if (this.f24486g == null) {
            this.f24486g = m12525a().getBytes(InterfaceC10622g.f24418a);
        }
        return this.f24486g;
    }

    /* renamed from: d */
    private String m12522d() {
        if (TextUtils.isEmpty(this.f24484e)) {
            String str = this.f24483d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.f24482c;
                C10892h.m12014d(url);
                str = url.toString();
            }
            this.f24484e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f24484e;
    }

    /* renamed from: e */
    private URL m12521e() throws MalformedURLException {
        if (this.f24485f == null) {
            this.f24485f = new URL(m12522d());
        }
        return this.f24485f;
    }

    /* renamed from: a */
    public String m12525a() {
        String str = this.f24483d;
        if (str != null) {
            return str;
        }
        URL url = this.f24482c;
        C10892h.m12014d(url);
        return url.toString();
    }

    /* renamed from: c */
    public Map<String, String> m12523c() {
        return this.f24481b.mo12519a();
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public boolean equals(Object obj) {
        if (obj instanceof C10684g) {
            C10684g c10684g = (C10684g) obj;
            return m12525a().equals(c10684g.m12525a()) && this.f24481b.equals(c10684g.f24481b);
        }
        return false;
    }

    /* renamed from: f */
    public URL m12520f() throws MalformedURLException {
        return m12521e();
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public int hashCode() {
        if (this.f24487h == 0) {
            int hashCode = m12525a().hashCode();
            this.f24487h = hashCode;
            this.f24487h = (hashCode * 31) + this.f24481b.hashCode();
        }
        return this.f24487h;
    }

    public String toString() {
        return m12525a();
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(m12524b());
    }

    public C10684g(String str) {
        this(str, InterfaceC10685h.f24488a);
    }

    public C10684g(URL url, InterfaceC10685h interfaceC10685h) {
        C10892h.m12014d(url);
        this.f24482c = url;
        this.f24483d = null;
        C10892h.m12014d(interfaceC10685h);
        this.f24481b = interfaceC10685h;
    }

    public C10684g(String str, InterfaceC10685h interfaceC10685h) {
        this.f24482c = null;
        C10892h.m12016b(str);
        this.f24483d = str;
        C10892h.m12014d(interfaceC10685h);
        this.f24481b = interfaceC10685h;
    }
}
