package com.google.firebase.crashlytics.p112h.p126r;

import android.content.Context;
import com.google.firebase.crashlytics.p112h.C5335f;
import com.google.firebase.crashlytics.p112h.p115j.C5373n;
/* compiled from: ResourceUnityVersionProvider.java */
/* renamed from: com.google.firebase.crashlytics.h.r.a */
/* loaded from: classes2.dex */
public class C5604a implements InterfaceC5605b {

    /* renamed from: b */
    private static boolean f13815b = false;

    /* renamed from: c */
    private static String f13816c;

    /* renamed from: a */
    private final Context f13817a;

    public C5604a(Context context) {
        this.f13817a = context;
    }

    /* renamed from: b */
    public static synchronized String m24348b(Context context) {
        synchronized (C5604a.class) {
            if (f13815b) {
                return f13816c;
            }
            int m24985q = C5373n.m24985q(context, "com.google.firebase.crashlytics.unity_version", "string");
            if (m24985q != 0) {
                f13816c = context.getResources().getString(m24985q);
                f13815b = true;
                C5335f m25102f = C5335f.m25102f();
                m25102f.m25099i("Unity Editor version is: " + f13816c);
            }
            return f13816c;
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p126r.InterfaceC5605b
    /* renamed from: a */
    public String mo24347a() {
        return m24348b(this.f13817a);
    }
}
