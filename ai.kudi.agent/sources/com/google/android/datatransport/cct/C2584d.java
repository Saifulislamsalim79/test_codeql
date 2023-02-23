package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.cct.C2584d;
import com.google.android.datatransport.cct.p096f.AbstractC2588a;
import com.google.android.datatransport.cct.p096f.AbstractC2614j;
import com.google.android.datatransport.cct.p096f.AbstractC2615k;
import com.google.android.datatransport.cct.p096f.AbstractC2618l;
import com.google.android.datatransport.cct.p096f.AbstractC2620m;
import com.google.android.datatransport.cct.p096f.AbstractC2622n;
import com.google.android.datatransport.cct.p096f.AbstractC2623o;
import com.google.android.datatransport.cct.p096f.EnumC2627p;
import com.google.android.datatransport.runtime.backends.AbstractC2635f;
import com.google.android.datatransport.runtime.backends.AbstractC2637g;
import com.google.android.datatransport.runtime.backends.InterfaceC2645m;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC5960a;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p272h.p286c.p287a.p288a.C8236b;
import p272h.p286c.p287a.p288a.p289i.AbstractC8342j;
import p272h.p286c.p287a.p288a.p289i.C8341i;
import p272h.p286c.p287a.p288a.p289i.p292b0.InterfaceC8318a;
import p272h.p286c.p287a.p288a.p289i.p298y.C8379a;
import p272h.p286c.p287a.p288a.p289i.p299z.C8381b;
import p272h.p286c.p287a.p288a.p289i.p299z.InterfaceC8380a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CctTransportBackend.java */
/* renamed from: com.google.android.datatransport.cct.d */
/* loaded from: classes2.dex */
public final class C2584d implements InterfaceC2645m {

    /* renamed from: a */
    private final InterfaceC5960a f7223a;

    /* renamed from: b */
    private final ConnectivityManager f7224b;

    /* renamed from: c */
    private final Context f7225c;

    /* renamed from: d */
    final URL f7226d;

    /* renamed from: e */
    private final InterfaceC8318a f7227e;

    /* renamed from: f */
    private final InterfaceC8318a f7228f;

    /* renamed from: g */
    private final int f7229g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CctTransportBackend.java */
    /* renamed from: com.google.android.datatransport.cct.d$a */
    /* loaded from: classes2.dex */
    public static final class C2585a {

        /* renamed from: a */
        final URL f7230a;

        /* renamed from: b */
        final AbstractC2614j f7231b;

        /* renamed from: c */
        final String f7232c;

        C2585a(URL url, AbstractC2614j abstractC2614j, String str) {
            this.f7230a = url;
            this.f7231b = abstractC2614j;
            this.f7232c = str;
        }

        /* renamed from: a */
        C2585a m32568a(URL url) {
            return new C2585a(url, this.f7231b, this.f7232c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CctTransportBackend.java */
    /* renamed from: com.google.android.datatransport.cct.d$b */
    /* loaded from: classes2.dex */
    public static final class C2586b {

        /* renamed from: a */
        final int f7233a;

        /* renamed from: b */
        final URL f7234b;

        /* renamed from: c */
        final long f7235c;

        C2586b(int i, URL url, long j) {
            this.f7233a = i;
            this.f7234b = url;
            this.f7235c = j;
        }
    }

    C2584d(Context context, InterfaceC8318a interfaceC8318a, InterfaceC8318a interfaceC8318a2, int i) {
        this.f7223a = AbstractC2614j.m32533b();
        this.f7225c = context;
        this.f7224b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f7226d = m32569m(C2583c.f7215c);
        this.f7227e = interfaceC8318a2;
        this.f7228f = interfaceC8318a;
        this.f7229g = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public C2586b m32579c(C2585a c2585a) throws IOException {
        C8379a.m16167a("CctTransportBackend", "Making request to: %s", c2585a.f7230a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) c2585a.f7230a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f7229g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = c2585a.f7232c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f7223a.mo23153a(c2585a.f7231b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                C8379a.m16163e("CctTransportBackend", "Status Code: " + responseCode);
                C8379a.m16163e("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                C8379a.m16163e("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new C2586b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                }
                if (responseCode != 200) {
                    return new C2586b(responseCode, null, 0L);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream m32570l = m32570l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    C2586b c2586b = new C2586b(responseCode, null, AbstractC2622n.m32488b(new BufferedReader(new InputStreamReader(m32570l))).mo32487c());
                    if (m32570l != null) {
                        m32570l.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return c2586b;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (EncodingException e) {
            e = e;
            C8379a.m16165c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C2586b(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            C8379a.m16165c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C2586b(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            C8379a.m16165c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C2586b(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            C8379a.m16165c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C2586b(400, null, 0L);
        }
    }

    /* renamed from: d */
    private static int m32578d(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC2623o.EnumC2625b.UNKNOWN_MOBILE_SUBTYPE.m32479b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return AbstractC2623o.EnumC2625b.COMBINED.m32479b();
        }
        if (AbstractC2623o.EnumC2625b.m32480a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    /* renamed from: e */
    private static int m32577e(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC2623o.EnumC2626c.NONE.m32477b();
        }
        return networkInfo.getType();
    }

    /* renamed from: f */
    private static int m32576f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            C8379a.m16165c("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    /* renamed from: g */
    private AbstractC2614j m32575g(AbstractC2635f abstractC2635f) {
        AbstractC2618l.AbstractC2619a m32516j;
        HashMap hashMap = new HashMap();
        for (AbstractC8342j abstractC8342j : abstractC2635f.mo32475b()) {
            String mo16276j = abstractC8342j.mo16276j();
            if (!hashMap.containsKey(mo16276j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC8342j);
                hashMap.put(mo16276j, arrayList);
            } else {
                ((List) hashMap.get(mo16276j)).add(abstractC8342j);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC8342j abstractC8342j2 = (AbstractC8342j) ((List) entry.getValue()).get(0);
            AbstractC2620m.AbstractC2621a m32507a = AbstractC2620m.m32507a();
            m32507a.mo32494f(EnumC2627p.DEFAULT);
            m32507a.mo32493g(this.f7228f.mo16295a());
            m32507a.mo32492h(this.f7227e.mo16295a());
            AbstractC2615k.AbstractC2616a m32531a = AbstractC2615k.m32531a();
            m32531a.mo32526c(AbstractC2615k.EnumC2617b.ANDROID_FIREBASE);
            AbstractC2588a.AbstractC2589a m32566a = AbstractC2588a.m32566a();
            m32566a.mo32535m(Integer.valueOf(abstractC8342j2.m16279g("sdk-version")));
            m32566a.mo32538j(abstractC8342j2.m16284b("model"));
            m32566a.mo32542f(abstractC8342j2.m16284b("hardware"));
            m32566a.mo32544d(abstractC8342j2.m16284b("device"));
            m32566a.mo32536l(abstractC8342j2.m16284b("product"));
            m32566a.mo32537k(abstractC8342j2.m16284b("os-uild"));
            m32566a.mo32540h(abstractC8342j2.m16284b("manufacturer"));
            m32566a.mo32543e(abstractC8342j2.m16284b("fingerprint"));
            m32566a.mo32545c(abstractC8342j2.m16284b("country"));
            m32566a.mo32541g(abstractC8342j2.m16284b("locale"));
            m32566a.mo32539i(abstractC8342j2.m16284b("mcc_mnc"));
            m32566a.mo32546b(abstractC8342j2.m16284b("application_build"));
            m32531a.mo32527b(m32566a.mo32547a());
            m32507a.mo32498b(m32531a.mo32528a());
            try {
                m32507a.m32491i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                m32507a.m32490j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC8342j abstractC8342j3 : (List) entry.getValue()) {
                C8341i mo16281e = abstractC8342j3.mo16281e();
                C8236b m16286b = mo16281e.m16286b();
                if (m16286b.equals(C8236b.m16444b("proto"))) {
                    m32516j = AbstractC2618l.m32516j(mo16281e.m16287a());
                } else if (m16286b.equals(C8236b.m16444b("json"))) {
                    m32516j = AbstractC2618l.m32517i(new String(mo16281e.m16287a(), Charset.forName("UTF-8")));
                } else {
                    C8379a.m16162f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", m16286b);
                }
                m32516j.mo32513c(abstractC8342j3.mo16280f());
                m32516j.mo32512d(abstractC8342j3.mo16275k());
                m32516j.mo32508h(abstractC8342j3.m16278h("tz-offset"));
                AbstractC2623o.AbstractC2624a m32486a = AbstractC2623o.m32486a();
                m32486a.mo32481c(AbstractC2623o.EnumC2626c.m32478a(abstractC8342j3.m16279g("net-type")));
                m32486a.mo32482b(AbstractC2623o.EnumC2625b.m32480a(abstractC8342j3.m16279g("mobile-subtype")));
                m32516j.mo32511e(m32486a.mo32483a());
                if (abstractC8342j3.mo16282d() != null) {
                    m32516j.mo32514b(abstractC8342j3.mo16282d());
                }
                arrayList3.add(m32516j.mo32515a());
            }
            m32507a.mo32497c(arrayList3);
            arrayList2.add(m32507a.mo32499a());
        }
        return AbstractC2614j.m32534a(arrayList2);
    }

    /* renamed from: h */
    private static TelephonyManager m32574h(Context context) {
        return (TelephonyManager) context.getSystemService(AttributeType.PHONE);
    }

    /* renamed from: i */
    static long m32573i() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static /* synthetic */ C2585a m32571k(C2585a c2585a, C2586b c2586b) {
        URL url = c2586b.f7234b;
        if (url != null) {
            C8379a.m16167a("CctTransportBackend", "Following redirect to: %s", url);
            return c2585a.m32568a(c2586b.f7234b);
        }
        return null;
    }

    /* renamed from: l */
    private static InputStream m32570l(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* renamed from: m */
    private static URL m32569m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.InterfaceC2645m
    /* renamed from: a */
    public AbstractC2637g mo32447a(AbstractC2635f abstractC2635f) {
        AbstractC2614j m32575g = m32575g(abstractC2635f);
        URL url = this.f7226d;
        if (abstractC2635f.mo32474c() != null) {
            try {
                C2583c m32582d = C2583c.m32582d(abstractC2635f.mo32474c());
                r3 = m32582d.m32581e() != null ? m32582d.m32581e() : null;
                if (m32582d.m32580f() != null) {
                    url = m32569m(m32582d.m32580f());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC2637g.m32470a();
            }
        }
        try {
            C2586b c2586b = (C2586b) C8381b.m16160a(5, new C2585a(url, m32575g, r3), new InterfaceC8380a() { // from class: com.google.android.datatransport.cct.a
                @Override // p272h.p286c.p287a.p288a.p289i.p299z.InterfaceC8380a
                /* renamed from: a */
                public final Object mo16161a(Object obj) {
                    C2584d.C2586b m32579c;
                    m32579c = C2584d.this.m32579c((C2584d.C2585a) obj);
                    return m32579c;
                }
            }, C2582b.f7214a);
            if (c2586b.f7233a == 200) {
                return AbstractC2637g.m32466e(c2586b.f7235c);
            }
            if (c2586b.f7233a < 500 && c2586b.f7233a != 404) {
                if (c2586b.f7233a == 400) {
                    return AbstractC2637g.m32467d();
                }
                return AbstractC2637g.m32470a();
            }
            return AbstractC2637g.m32465f();
        } catch (IOException e) {
            C8379a.m16165c("CctTransportBackend", "Could not make request to the backend", e);
            return AbstractC2637g.m32465f();
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.InterfaceC2645m
    /* renamed from: b */
    public AbstractC8342j mo32446b(AbstractC8342j abstractC8342j) {
        NetworkInfo activeNetworkInfo = this.f7224b.getActiveNetworkInfo();
        AbstractC8342j.AbstractC8343a m16274l = abstractC8342j.m16274l();
        m16274l.m16273a("sdk-version", Build.VERSION.SDK_INT);
        m16274l.m16271c("model", Build.MODEL);
        m16274l.m16271c("hardware", Build.HARDWARE);
        m16274l.m16271c("device", Build.DEVICE);
        m16274l.m16271c("product", Build.PRODUCT);
        m16274l.m16271c("os-uild", Build.ID);
        m16274l.m16271c("manufacturer", Build.MANUFACTURER);
        m16274l.m16271c("fingerprint", Build.FINGERPRINT);
        m16274l.m16272b("tz-offset", m32573i());
        m16274l.m16273a("net-type", m32577e(activeNetworkInfo));
        m16274l.m16273a("mobile-subtype", m32578d(activeNetworkInfo));
        m16274l.m16271c("country", Locale.getDefault().getCountry());
        m16274l.m16271c("locale", Locale.getDefault().getLanguage());
        m16274l.m16271c("mcc_mnc", m32574h(this.f7225c).getSimOperator());
        m16274l.m16271c("application_build", Integer.toString(m32576f(this.f7225c)));
        return m16274l.mo16270d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2584d(Context context, InterfaceC8318a interfaceC8318a, InterfaceC8318a interfaceC8318a2) {
        this(context, interfaceC8318a, interfaceC8318a2, 40000);
    }
}
