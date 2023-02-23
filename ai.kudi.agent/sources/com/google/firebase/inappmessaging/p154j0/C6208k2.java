package com.google.firebase.inappmessaging.p154j0;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.C5988g;
import com.google.firebase.inappmessaging.p152i0.InterfaceC6142a;
import com.google.firebase.inappmessaging.p154j0.p158t3.InterfaceC6332a;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p272h.p286c.p351c.p352a.p353a.p354a.C9365b;
import p272h.p286c.p355d.p356a.p357a.p358a.p359e.C9379b;
import p272h.p286c.p355d.p356a.p357a.p358a.p359e.C9382c;
import p272h.p286c.p355d.p356a.p357a.p358a.p359e.C9385d;
import p272h.p286c.p355d.p356a.p357a.p358a.p359e.C9388e;
/* compiled from: ApiClient.java */
/* renamed from: com.google.firebase.inappmessaging.j0.k2 */
/* loaded from: classes2.dex */
public class C6208k2 {

    /* renamed from: a */
    private final InterfaceC6142a<C6341v2> f15082a;

    /* renamed from: b */
    private final C5988g f15083b;

    /* renamed from: c */
    private final Application f15084c;

    /* renamed from: d */
    private final InterfaceC6332a f15085d;

    /* renamed from: e */
    private final C6186g3 f15086e;

    public C6208k2(InterfaceC6142a<C6341v2> interfaceC6142a, C5988g c5988g, Application application, InterfaceC6332a interfaceC6332a, C6186g3 c6186g3) {
        this.f15082a = interfaceC6142a;
        this.f15083b = c5988g;
        this.f15084c = application;
        this.f15085d = interfaceC6332a;
        this.f15086e = c6186g3;
    }

    /* renamed from: a */
    private C9382c m22573a(AbstractC6158b3 abstractC6158b3) {
        C9382c.C9384b m14897V = C9382c.m14897V();
        m14897V.m14891H(this.f15083b.m23089m().m23068c());
        m14897V.m14893F(abstractC6158b3.mo22553b());
        m14897V.m14892G(abstractC6158b3.mo22552c().mo22047b());
        return m14897V.build();
    }

    /* renamed from: b */
    private C9365b m22572b() {
        C9365b.C9366a m14953W = C9365b.m14953W();
        m14953W.m14946H(String.valueOf(Build.VERSION.SDK_INT));
        m14953W.m14947G(Locale.getDefault().toString());
        m14953W.m14945I(TimeZone.getDefault().getID());
        String m22570d = m22570d();
        if (!TextUtils.isEmpty(m22570d)) {
            m14953W.m14948F(m22570d);
        }
        return m14953W.build();
    }

    /* renamed from: d */
    private String m22570d() {
        try {
            return this.f15084c.getPackageManager().getPackageInfo(this.f15084c.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            C6163c3.m22620b("Error finding versionName : " + e.getMessage());
            return null;
        }
    }

    /* renamed from: e */
    private C9388e m22569e(C9388e c9388e) {
        if (c9388e.m14870U() < this.f15085d.mo22281a() + TimeUnit.MINUTES.toMillis(1L) || c9388e.m14870U() > this.f15085d.mo22281a() + TimeUnit.DAYS.toMillis(3L)) {
            C9388e.C9390b mo19353b = c9388e.mo19353b();
            mo19353b.m14865F(this.f15085d.mo22281a() + TimeUnit.DAYS.toMillis(1L));
            return mo19353b.build();
        }
        return c9388e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C9388e m22571c(AbstractC6158b3 abstractC6158b3, C9379b c9379b) {
        C6163c3.m22619c("Fetching campaigns from service.");
        this.f15086e.m22595a();
        C9385d.C9387b m14882Z = C9385d.m14882Z();
        m14882Z.m14876H(this.f15083b.m23089m().m23066e());
        m14882Z.m14878F(c9379b.m14907V());
        m14882Z.m14877G(m22572b());
        m14882Z.m14875I(m22573a(abstractC6158b3));
        return m22569e(this.f15082a.get().m22278a(m14882Z.build()));
    }
}
