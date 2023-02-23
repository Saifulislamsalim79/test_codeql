package com.google.firebase.crashlytics.p112h.p122p;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.C4469m;
import com.google.android.gms.tasks.InterfaceC4462i;
import com.google.android.gms.tasks.j;
import com.google.firebase.crashlytics.p112h.C5335f;
import com.google.firebase.crashlytics.p112h.p115j.C5347a0;
import com.google.firebase.crashlytics.p112h.p115j.C5364i0;
import com.google.firebase.crashlytics.p112h.p115j.C5373n;
import com.google.firebase.crashlytics.p112h.p115j.C5406w;
import com.google.firebase.crashlytics.p112h.p115j.EnumC5407x;
import com.google.firebase.crashlytics.p112h.p115j.InterfaceC5405v;
import com.google.firebase.crashlytics.p112h.p119m.C5568b;
import com.google.firebase.crashlytics.p112h.p122p.p123i.C5591a;
import com.google.firebase.crashlytics.p112h.p122p.p123i.C5595e;
import com.google.firebase.crashlytics.p112h.p122p.p123i.C5596f;
import com.google.firebase.crashlytics.p112h.p122p.p123i.InterfaceC5594d;
import com.google.firebase.crashlytics.p112h.p122p.p124j.C5597a;
import com.google.firebase.crashlytics.p112h.p122p.p124j.InterfaceC5598b;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: SettingsController.java */
/* renamed from: com.google.firebase.crashlytics.h.p.d */
/* loaded from: classes2.dex */
public class C5585d implements InterfaceC5587e {

    /* renamed from: a */
    private final Context f13775a;

    /* renamed from: b */
    private final C5596f f13776b;

    /* renamed from: c */
    private final C5588f f13777c;

    /* renamed from: d */
    private final InterfaceC5405v f13778d;

    /* renamed from: e */
    private final C5582a f13779e;

    /* renamed from: f */
    private final InterfaceC5598b f13780f;

    /* renamed from: g */
    private final C5406w f13781g;

    /* renamed from: h */
    private final AtomicReference<InterfaceC5594d> f13782h = new AtomicReference<>();

    /* renamed from: i */
    private final AtomicReference<C4465k<C5591a>> f13783i = new AtomicReference<>(new C4465k());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.d$a */
    /* loaded from: classes2.dex */
    public class C5586a implements InterfaceC4462i<Void, Void> {
        C5586a() {
        }

        @Override // com.google.android.gms.tasks.InterfaceC4462i
        /* renamed from: b */
        public j<Void> mo20894a(Void r5) throws Exception {
            JSONObject mo24352a = C5585d.this.f13780f.mo24352a(C5585d.this.f13776b, true);
            if (mo24352a != null) {
                C5595e m24370b = C5585d.this.f13777c.m24370b(mo24352a);
                C5585d.this.f13779e.m24396c(m24370b.m24361d(), mo24352a);
                C5585d.this.m24376q(mo24352a, "Loaded settings: ");
                C5585d c5585d = C5585d.this;
                c5585d.m24375r(c5585d.f13776b.f13799f);
                C5585d.this.f13782h.set(m24370b);
                ((C4465k) C5585d.this.f13783i.get()).m27773e(m24370b.m24362c());
                C4465k c4465k = new C4465k();
                c4465k.m27773e(m24370b.m24362c());
                C5585d.this.f13783i.set(c4465k);
            }
            return C4469m.m27765f(null);
        }
    }

    C5585d(Context context, C5596f c5596f, InterfaceC5405v interfaceC5405v, C5588f c5588f, C5582a c5582a, InterfaceC5598b interfaceC5598b, C5406w c5406w) {
        this.f13775a = context;
        this.f13776b = c5596f;
        this.f13778d = interfaceC5405v;
        this.f13777c = c5588f;
        this.f13779e = c5582a;
        this.f13780f = interfaceC5598b;
        this.f13781g = c5406w;
        this.f13782h.set(C5583b.m24392e(interfaceC5405v));
    }

    /* renamed from: l */
    public static C5585d m24381l(Context context, String str, C5347a0 c5347a0, C5568b c5568b, String str2, String str3, C5406w c5406w) {
        String m25081g = c5347a0.m25081g();
        C5364i0 c5364i0 = new C5364i0();
        return new C5585d(context, new C5596f(str, c5347a0.m25080h(), c5347a0.m25079i(), c5347a0.m25078j(), c5347a0, C5373n.m24994h(C5373n.m24988n(context), str, str3, str2), str3, str2, EnumC5407x.m24838a(m25081g).m24837b()), c5364i0, new C5588f(c5364i0), new C5582a(context), new C5597a(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), c5568b), c5406w);
    }

    /* renamed from: m */
    private C5595e m24380m(EnumC5584c enumC5584c) {
        C5595e c5595e = null;
        try {
            if (!EnumC5584c.SKIP_CACHE_LOOKUP.equals(enumC5584c)) {
                JSONObject m24397b = this.f13779e.m24397b();
                if (m24397b != null) {
                    C5595e m24370b = this.f13777c.m24370b(m24397b);
                    if (m24370b != null) {
                        m24376q(m24397b, "Loaded cached settings: ");
                        long mo24847a = this.f13778d.mo24847a();
                        if (!EnumC5584c.IGNORE_CACHE_EXPIRATION.equals(enumC5584c) && m24370b.m24360e(mo24847a)) {
                            C5335f.m25102f().m25099i("Cached settings have expired.");
                        }
                        try {
                            C5335f.m25102f().m25099i("Returning cached settings.");
                            c5595e = m24370b;
                        } catch (Exception e) {
                            e = e;
                            c5595e = m24370b;
                            C5335f.m25102f().m25103e("Failed to get cached settings", e);
                            return c5595e;
                        }
                    } else {
                        C5335f.m25102f().m25103e("Failed to parse cached settings data.", null);
                    }
                } else {
                    C5335f.m25102f().m25106b("No cached settings data found.");
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return c5595e;
    }

    /* renamed from: n */
    private String m24379n() {
        return C5373n.m24984r(this.f13775a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m24376q(JSONObject jSONObject, String str) throws JSONException {
        C5335f m25102f = C5335f.m25102f();
        m25102f.m25106b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public boolean m24375r(String str) {
        SharedPreferences.Editor edit = C5373n.m24984r(this.f13775a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    @Override // com.google.firebase.crashlytics.p112h.p122p.InterfaceC5587e
    /* renamed from: a */
    public j<C5591a> mo24373a() {
        return this.f13783i.get().m27777a();
    }

    @Override // com.google.firebase.crashlytics.p112h.p122p.InterfaceC5587e
    /* renamed from: b */
    public InterfaceC5594d mo24372b() {
        return this.f13782h.get();
    }

    /* renamed from: k */
    boolean m24382k() {
        return !m24379n().equals(this.f13776b.f13799f);
    }

    /* renamed from: o */
    public j<Void> m24378o(EnumC5584c enumC5584c, Executor executor) {
        C5595e m24380m;
        if (!m24382k() && (m24380m = m24380m(enumC5584c)) != null) {
            this.f13782h.set(m24380m);
            this.f13783i.get().m27773e(m24380m.m24362c());
            return C4469m.m27765f(null);
        }
        C5595e m24380m2 = m24380m(EnumC5584c.IGNORE_CACHE_EXPIRATION);
        if (m24380m2 != null) {
            this.f13782h.set(m24380m2);
            this.f13783i.get().m27773e(m24380m2.m24362c());
        }
        return this.f13781g.m24839h(executor).r(executor, new C5586a());
    }

    /* renamed from: p */
    public j<Void> m24377p(Executor executor) {
        return m24378o(EnumC5584c.USE_CACHE, executor);
    }
}
