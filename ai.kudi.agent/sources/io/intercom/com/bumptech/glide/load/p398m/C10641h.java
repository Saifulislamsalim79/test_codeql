package io.intercom.com.bumptech.glide.load.p398m;

import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.intercom.com.bumptech.glide.EnumC10482g;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.HttpException;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b;
import io.intercom.com.bumptech.glide.load.p400n.C10684g;
import io.intercom.com.bumptech.glide.p416r.C10886b;
import io.intercom.com.bumptech.glide.p416r.C10888d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
/* compiled from: HttpUrlFetcher.java */
/* renamed from: io.intercom.com.bumptech.glide.load.m.h */
/* loaded from: classes3.dex */
public class C10641h implements InterfaceC10631b<InputStream> {

    /* renamed from: y */
    static final InterfaceC10643b f24436y = new C10642a();

    /* renamed from: c */
    private final C10684g f24437c;

    /* renamed from: d */
    private final int f24438d;

    /* renamed from: e */
    private final InterfaceC10643b f24439e;

    /* renamed from: f */
    private HttpURLConnection f24440f;

    /* renamed from: w */
    private InputStream f24441w;

    /* renamed from: x */
    private volatile boolean f24442x;

    /* compiled from: HttpUrlFetcher.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.m.h$a */
    /* loaded from: classes3.dex */
    private static class C10642a implements InterfaceC10643b {
        C10642a() {
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.C10641h.InterfaceC10643b
        /* renamed from: a */
        public HttpURLConnection mo12581a(URL url) throws IOException {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpUrlFetcher.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.m.h$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC10643b {
        /* renamed from: a */
        HttpURLConnection mo12581a(URL url) throws IOException;
    }

    public C10641h(C10684g c10684g, int i) {
        this(c10684g, i, f24436y);
    }

    /* renamed from: c */
    private InputStream m12583c(HttpURLConnection httpURLConnection) throws IOException {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f24441w = C10886b.m12037g(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
            }
            this.f24441w = httpURLConnection.getInputStream();
        }
        return this.f24441w;
    }

    /* renamed from: d */
    private InputStream m12582d(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f24440f = this.f24439e.mo12581a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f24440f.addRequestProperty(entry.getKey(), entry.getValue());
            }
            this.f24440f.setConnectTimeout(this.f24438d);
            this.f24440f.setReadTimeout(this.f24438d);
            this.f24440f.setUseCaches(false);
            this.f24440f.setDoInput(true);
            this.f24440f.setInstanceFollowRedirects(false);
            this.f24440f.connect();
            this.f24441w = this.f24440f.getInputStream();
            if (this.f24442x) {
                return null;
            }
            int responseCode = this.f24440f.getResponseCode();
            int i2 = responseCode / 100;
            if (i2 == 2) {
                return m12583c(this.f24440f);
            }
            if (i2 != 3) {
                if (responseCode == -1) {
                    throw new HttpException(responseCode);
                }
                throw new HttpException(this.f24440f.getResponseMessage(), responseCode);
            }
            String headerField = this.f24440f.getHeaderField("Location");
            if (!TextUtils.isEmpty(headerField)) {
                URL url3 = new URL(url, headerField);
                mo12473b();
                return m12582d(url3, i + 1, url, map);
            }
            throw new HttpException("Received empty or null redirect url");
        }
        throw new HttpException("Too many (> 5) redirects!");
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    /* renamed from: a */
    public Class<InputStream> mo12474a() {
        return InputStream.class;
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    /* renamed from: b */
    public void mo12473b() {
        InputStream inputStream = this.f24441w;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f24440f;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f24440f = null;
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    public void cancel() {
        this.f24442x = true;
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    /* renamed from: e */
    public void mo12472e(EnumC10482g enumC10482g, InterfaceC10631b.InterfaceC10632a<? super InputStream> interfaceC10632a) {
        long m12031b = C10888d.m12031b();
        try {
            InputStream m12582d = m12582d(this.f24437c.m12520f(), 0, null, this.f24437c.m12523c());
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + C10888d.m12032a(m12031b) + " ms and loaded " + m12582d);
            }
            interfaceC10632a.mo12496d(m12582d);
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            interfaceC10632a.mo12497c(e);
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    public EnumC10507a getDataSource() {
        return EnumC10507a.REMOTE;
    }

    C10641h(C10684g c10684g, int i, InterfaceC10643b interfaceC10643b) {
        this.f24437c = c10684g;
        this.f24438d = i;
        this.f24439e = interfaceC10643b;
    }
}
