package com.google.firebase.crashlytics.p112h.p115j;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.firebase.crashlytics.p112h.C5335f;
import com.google.firebase.installations.InterfaceC6432h;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
/* compiled from: IdManager.java */
/* renamed from: com.google.firebase.crashlytics.h.j.a0 */
/* loaded from: classes2.dex */
public class C5347a0 implements InterfaceC5349b0 {

    /* renamed from: g */
    private static final Pattern f13197g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h */
    private static final String f13198h = Pattern.quote("/");

    /* renamed from: a */
    private final C5351c0 f13199a;

    /* renamed from: b */
    private final Context f13200b;

    /* renamed from: c */
    private final String f13201c;

    /* renamed from: d */
    private final InterfaceC6432h f13202d;

    /* renamed from: e */
    private final C5406w f13203e;

    /* renamed from: f */
    private String f13204f;

    public C5347a0(Context context, String str, InterfaceC6432h interfaceC6432h, C5406w c5406w) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str != null) {
            this.f13200b = context;
            this.f13201c = str;
            this.f13202d = interfaceC6432h;
            this.f13203e = c5406w;
            this.f13199a = new C5351c0();
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    /* renamed from: b */
    private synchronized String m25086b(String str, SharedPreferences sharedPreferences) {
        String m25083e;
        m25083e = m25083e(UUID.randomUUID().toString());
        C5335f m25102f = C5335f.m25102f();
        m25102f.m25099i("Created new Crashlytics installation ID: " + m25083e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", m25083e).putString("firebase.installation.id", str).apply();
        return m25083e;
    }

    /* renamed from: c */
    static String m25085c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    /* renamed from: d */
    private String m25084d() {
        try {
            return (String) C5368k0.m25018a(this.f13202d.mo22049h());
        } catch (Exception e) {
            C5335f.m25102f().m25096l("Failed to retrieve Firebase Installations ID.", e);
            return null;
        }
    }

    /* renamed from: e */
    private static String m25083e(String str) {
        if (str == null) {
            return null;
        }
        return f13197g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: k */
    static boolean m25077k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    /* renamed from: l */
    private String m25076l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    /* renamed from: m */
    private String m25075m(String str) {
        return str.replaceAll(f13198h, "");
    }

    @Override // com.google.firebase.crashlytics.p112h.p115j.InterfaceC5349b0
    /* renamed from: a */
    public synchronized String mo25073a() {
        if (this.f13204f != null) {
            return this.f13204f;
        }
        C5335f.m25102f().m25099i("Determining Crashlytics installation ID...");
        SharedPreferences m24984r = C5373n.m24984r(this.f13200b);
        String string = m24984r.getString("firebase.installation.id", null);
        C5335f m25102f = C5335f.m25102f();
        m25102f.m25099i("Cached Firebase Installation ID: " + string);
        if (this.f13203e.m24843d()) {
            String m25084d = m25084d();
            C5335f m25102f2 = C5335f.m25102f();
            m25102f2.m25099i("Fetched Firebase Installation ID: " + m25084d);
            if (m25084d == null) {
                m25084d = string == null ? m25085c() : string;
            }
            if (m25084d.equals(string)) {
                this.f13204f = m25076l(m24984r);
            } else {
                this.f13204f = m25086b(m25084d, m24984r);
            }
        } else if (m25077k(string)) {
            this.f13204f = m25076l(m24984r);
        } else {
            this.f13204f = m25086b(m25085c(), m24984r);
        }
        if (this.f13204f == null) {
            C5335f.m25102f().m25097k("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f13204f = m25086b(m25085c(), m24984r);
        }
        C5335f m25102f3 = C5335f.m25102f();
        m25102f3.m25099i("Crashlytics installation ID: " + this.f13204f);
        return this.f13204f;
    }

    /* renamed from: f */
    public String m25082f() {
        return this.f13201c;
    }

    /* renamed from: g */
    public String m25081g() {
        return this.f13199a.m25072a(this.f13200b);
    }

    /* renamed from: h */
    public String m25080h() {
        return String.format(Locale.US, "%s/%s", m25075m(Build.MANUFACTURER), m25075m(Build.MODEL));
    }

    /* renamed from: i */
    public String m25079i() {
        return m25075m(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: j */
    public String m25078j() {
        return m25075m(Build.VERSION.RELEASE);
    }
}
