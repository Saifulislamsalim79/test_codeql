package com.google.firebase.crashlytics.p112h.p121o;

import android.content.Context;
import com.google.android.datatransport.cct.C2583c;
import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.j;
import com.google.firebase.crashlytics.p112h.p115j.AbstractC5402t;
import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
import com.google.firebase.crashlytics.p112h.p117l.p118d0.C5509g;
import p272h.p286c.p287a.p288a.AbstractC8237c;
import p272h.p286c.p287a.p288a.C8236b;
import p272h.p286c.p287a.p288a.InterfaceC8239e;
import p272h.p286c.p287a.p288a.InterfaceC8240f;
import p272h.p286c.p287a.p288a.InterfaceC8242h;
import p272h.p286c.p287a.p288a.p289i.C8357t;
/* compiled from: DataTransportCrashlyticsReportSender.java */
/* renamed from: com.google.firebase.crashlytics.h.o.c */
/* loaded from: classes2.dex */
public class C5581c {

    /* renamed from: b */
    private static final C5509g f13765b = new C5509g();

    /* renamed from: c */
    private static final String f13766c = m24400d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d */
    private static final String f13767d = m24400d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e */
    private static final InterfaceC8239e<AbstractC5448a0, byte[]> f13768e = C5579a.f13762a;

    /* renamed from: a */
    private final InterfaceC8240f<AbstractC5448a0> f13769a;

    C5581c(InterfaceC8240f<AbstractC5448a0> interfaceC8240f, InterfaceC8239e<AbstractC5448a0, byte[]> interfaceC8239e) {
        this.f13769a = interfaceC8240f;
    }

    /* renamed from: a */
    public static C5581c m24403a(Context context) {
        C8357t.m16222f(context);
        return new C5581c(C8357t.m16225c().m16221g(new C2583c(f13766c, f13767d)).mo16231b("FIREBASE_CRASHLYTICS_REPORT", AbstractC5448a0.class, C8236b.m16444b("json"), f13768e), f13768e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ void m24402b(C4465k c4465k, AbstractC5402t abstractC5402t, Exception exc) {
        if (exc != null) {
            c4465k.m27774d(exc);
        } else {
            c4465k.m27773e(abstractC5402t);
        }
    }

    /* renamed from: d */
    private static String m24400d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str.length() + str2.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                if (str2.length() > i) {
                    sb.append(str2.charAt(i));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    /* renamed from: e */
    public j<AbstractC5402t> m24399e(final AbstractC5402t abstractC5402t) {
        AbstractC5448a0 mo24852b = abstractC5402t.mo24852b();
        final C4465k c4465k = new C4465k();
        this.f13769a.mo16229b(AbstractC8237c.m16438f(mo24852b), new InterfaceC8242h() { // from class: com.google.firebase.crashlytics.h.o.b
            @Override // p272h.p286c.p287a.p288a.InterfaceC8242h
            /* renamed from: a */
            public final void mo16437a(Exception exc) {
                C5581c.m24402b(C4465k.this, abstractC5402t, exc);
            }
        });
        return c4465k.m27777a();
    }
}
