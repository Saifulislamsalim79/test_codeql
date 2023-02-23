package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.C2730a;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.z */
/* loaded from: classes2.dex */
public class C2938z implements C2730a.InterfaceC2734d {

    /* renamed from: d */
    public static final C2938z f8105d = m31594c().m31592a();

    /* renamed from: c */
    private final String f8106c;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.internal.z$a */
    /* loaded from: classes2.dex */
    public static class C2939a {

        /* renamed from: a */
        private String f8107a;

        /* synthetic */ C2939a(C2864d0 c2864d0) {
        }

        /* renamed from: a */
        public C2938z m31592a() {
            return new C2938z(this.f8107a, null);
        }

        /* renamed from: b */
        public C2939a m31591b(String str) {
            this.f8107a = str;
            return this;
        }
    }

    /* synthetic */ C2938z(String str, C2869e0 c2869e0) {
        this.f8106c = str;
    }

    /* renamed from: c */
    public static C2939a m31594c() {
        return new C2939a(null);
    }

    /* renamed from: d */
    public final Bundle m31593d() {
        Bundle bundle = new Bundle();
        String str = this.f8106c;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2938z) {
            return C2906q.m31701a(this.f8106c, ((C2938z) obj).f8106c);
        }
        return false;
    }

    public final int hashCode() {
        return C2906q.m31700b(this.f8106c);
    }
}
