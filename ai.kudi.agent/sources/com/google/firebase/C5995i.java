package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2906q;
import com.google.android.gms.common.internal.C2926v;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.util.n;
/* compiled from: FirebaseOptions.java */
/* renamed from: com.google.firebase.i */
/* loaded from: classes2.dex */
public final class C5995i {

    /* renamed from: a */
    private final String f14672a;

    /* renamed from: b */
    private final String f14673b;

    /* renamed from: c */
    private final String f14674c;

    /* renamed from: d */
    private final String f14675d;

    /* renamed from: e */
    private final String f14676e;

    /* renamed from: f */
    private final String f14677f;

    /* renamed from: g */
    private final String f14678g;

    private C5995i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        s.n(!n.b(str), "ApplicationId must be set.");
        this.f14673b = str;
        this.f14672a = str2;
        this.f14674c = str3;
        this.f14675d = str4;
        this.f14676e = str5;
        this.f14677f = str6;
        this.f14678g = str7;
    }

    /* renamed from: a */
    public static C5995i m23070a(Context context) {
        C2926v c2926v = new C2926v(context);
        String m31618a = c2926v.m31618a("google_app_id");
        if (TextUtils.isEmpty(m31618a)) {
            return null;
        }
        return new C5995i(m31618a, c2926v.m31618a("google_api_key"), c2926v.m31618a("firebase_database_url"), c2926v.m31618a("ga_trackingId"), c2926v.m31618a("gcm_defaultSenderId"), c2926v.m31618a("google_storage_bucket"), c2926v.m31618a("project_id"));
    }

    /* renamed from: b */
    public String m23069b() {
        return this.f14672a;
    }

    /* renamed from: c */
    public String m23068c() {
        return this.f14673b;
    }

    /* renamed from: d */
    public String m23067d() {
        return this.f14674c;
    }

    /* renamed from: e */
    public String m23066e() {
        return this.f14676e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5995i) {
            C5995i c5995i = (C5995i) obj;
            return C2906q.m31701a(this.f14673b, c5995i.f14673b) && C2906q.m31701a(this.f14672a, c5995i.f14672a) && C2906q.m31701a(this.f14674c, c5995i.f14674c) && C2906q.m31701a(this.f14675d, c5995i.f14675d) && C2906q.m31701a(this.f14676e, c5995i.f14676e) && C2906q.m31701a(this.f14677f, c5995i.f14677f) && C2906q.m31701a(this.f14678g, c5995i.f14678g);
        }
        return false;
    }

    /* renamed from: f */
    public String m23065f() {
        return this.f14678g;
    }

    public int hashCode() {
        return C2906q.m31700b(this.f14673b, this.f14672a, this.f14674c, this.f14675d, this.f14676e, this.f14677f, this.f14678g);
    }

    public String toString() {
        C2906q.C2907a m31699c = C2906q.m31699c(this);
        m31699c.m31698a("applicationId", this.f14673b);
        m31699c.m31698a("apiKey", this.f14672a);
        m31699c.m31698a("databaseUrl", this.f14674c);
        m31699c.m31698a("gcmSenderId", this.f14676e);
        m31699c.m31698a("storageBucket", this.f14677f);
        m31699c.m31698a("projectId", this.f14678g);
        return m31699c.toString();
    }
}
