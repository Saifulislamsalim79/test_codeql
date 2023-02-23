package com.bumptech.glide.load.p070m;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.EnumC1949f;
import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.p070m.InterfaceC2130d;
import com.bumptech.glide.load.p072n.C2186g;
import com.bumptech.glide.p086q.C2371c;
import com.bumptech.glide.p086q.C2376f;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
/* compiled from: HttpUrlFetcher.java */
/* renamed from: com.bumptech.glide.load.m.j */
/* loaded from: classes2.dex */
public class C2140j implements InterfaceC2130d<InputStream> {

    /* renamed from: y */
    static final InterfaceC2142b f6438y = new C2141a();

    /* renamed from: c */
    private final C2186g f6439c;

    /* renamed from: d */
    private final int f6440d;

    /* renamed from: e */
    private final InterfaceC2142b f6441e;

    /* renamed from: f */
    private HttpURLConnection f6442f;

    /* renamed from: w */
    private InputStream f6443w;

    /* renamed from: x */
    private volatile boolean f6444x;

    /* compiled from: HttpUrlFetcher.java */
    /* renamed from: com.bumptech.glide.load.m.j$a */
    /* loaded from: classes2.dex */
    private static class C2141a implements InterfaceC2142b {
        C2141a() {
        }

        @Override // com.bumptech.glide.load.p070m.C2140j.InterfaceC2142b
        /* renamed from: a */
        public HttpURLConnection mo33642a(URL url) throws IOException {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpUrlFetcher.java */
    /* renamed from: com.bumptech.glide.load.m.j$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC2142b {
        /* renamed from: a */
        HttpURLConnection mo33642a(URL url) throws IOException;
    }

    public C2140j(C2186g c2186g, int i) {
        this(c2186g, i, f6438y);
    }

    /* renamed from: c */
    private InputStream m33646c(HttpURLConnection httpURLConnection) throws IOException {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f6443w = C2371c.m33153g(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
            }
            this.f6443w = httpURLConnection.getInputStream();
        }
        return this.f6443w;
    }

    /* renamed from: d */
    private static boolean m33645d(int i) {
        return i / 100 == 2;
    }

    /* renamed from: f */
    private static boolean m33644f(int i) {
        return i / 100 == 3;
    }

    /* renamed from: g */
    private InputStream m33643g(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f6442f = this.f6441e.mo33642a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f6442f.addRequestProperty(entry.getKey(), entry.getValue());
            }
            this.f6442f.setConnectTimeout(this.f6440d);
            this.f6442f.setReadTimeout(this.f6440d);
            this.f6442f.setUseCaches(false);
            this.f6442f.setDoInput(true);
            this.f6442f.setInstanceFollowRedirects(false);
            this.f6442f.connect();
            this.f6443w = this.f6442f.getInputStream();
            if (this.f6444x) {
                return null;
            }
            int responseCode = this.f6442f.getResponseCode();
            if (m33645d(responseCode)) {
                return m33646c(this.f6442f);
            }
            if (!m33644f(responseCode)) {
                if (responseCode == -1) {
                    throw new HttpException(responseCode);
                }
                throw new HttpException(this.f6442f.getResponseMessage(), responseCode);
            }
            String headerField = this.f6442f.getHeaderField("Location");
            if (!TextUtils.isEmpty(headerField)) {
                URL url3 = new URL(url, headerField);
                mo33506b();
                return m33643g(url3, i + 1, url, map);
            }
            throw new HttpException("Received empty or null redirect url");
        }
        throw new HttpException("Too many (> 5) redirects!");
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    /* renamed from: a */
    public Class<InputStream> mo33507a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    /* renamed from: b */
    public void mo33506b() {
        InputStream inputStream = this.f6443w;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f6442f;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f6442f = null;
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    public void cancel() {
        this.f6444x = true;
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    /* renamed from: e */
    public void mo33503e(EnumC1949f enumC1949f, InterfaceC2130d.InterfaceC2131a<? super InputStream> interfaceC2131a) {
        StringBuilder sb;
        long m33145b = C2376f.m33145b();
        try {
            try {
                interfaceC2131a.mo33545d(m33643g(this.f6439c.m33576g(), 0, null, this.f6439c.m33579d()));
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                interfaceC2131a.mo33546c(e);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
                sb = new StringBuilder();
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(C2376f.m33146a(m33145b));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + C2376f.m33146a(m33145b));
            }
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    public EnumC1993a getDataSource() {
        return EnumC1993a.REMOTE;
    }

    C2140j(C2186g c2186g, int i, InterfaceC2142b interfaceC2142b) {
        this.f6439c = c2186g;
        this.f6440d = i;
        this.f6441e = interfaceC2142b;
    }
}
