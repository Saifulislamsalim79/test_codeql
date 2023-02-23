package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.s1 */
/* loaded from: classes2.dex */
public final class C2915s1 {

    /* renamed from: f */
    private static final Uri f8062f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    private final String f8063a;

    /* renamed from: b */
    private final String f8064b;

    /* renamed from: c */
    private final ComponentName f8065c;

    /* renamed from: d */
    private final int f8066d;

    /* renamed from: e */
    private final boolean f8067e;

    public C2915s1(String str, String str2, int i, boolean z) {
        s.f(str);
        this.f8063a = str;
        s.f(str2);
        this.f8064b = str2;
        this.f8065c = null;
        this.f8066d = i;
        this.f8067e = z;
    }

    /* renamed from: a */
    public final int m31693a() {
        return this.f8066d;
    }

    /* renamed from: b */
    public final ComponentName m31692b() {
        return this.f8065c;
    }

    /* renamed from: c */
    public final Intent m31691c(Context context) {
        Bundle bundle;
        if (this.f8063a != null) {
            if (this.f8067e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.f8063a);
                try {
                    bundle = context.getContentResolver().call(f8062f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    bundle = null;
                }
                r2 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
                if (r2 == null) {
                    String valueOf = String.valueOf(this.f8063a);
                    Log.w("ConnectionStatusConfig", valueOf.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(valueOf) : new String("Dynamic lookup for intent failed for action: "));
                }
            }
            return r2 != null ? r2 : new Intent(this.f8063a).setPackage(this.f8064b);
        }
        return new Intent().setComponent(this.f8065c);
    }

    /* renamed from: d */
    public final String m31690d() {
        return this.f8064b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2915s1) {
            C2915s1 c2915s1 = (C2915s1) obj;
            return C2906q.m31701a(this.f8063a, c2915s1.f8063a) && C2906q.m31701a(this.f8064b, c2915s1.f8064b) && C2906q.m31701a(this.f8065c, c2915s1.f8065c) && this.f8066d == c2915s1.f8066d && this.f8067e == c2915s1.f8067e;
        }
        return false;
    }

    public final int hashCode() {
        return C2906q.m31700b(this.f8063a, this.f8064b, this.f8065c, Integer.valueOf(this.f8066d), Boolean.valueOf(this.f8067e));
    }

    public final String toString() {
        String str = this.f8063a;
        if (str == null) {
            s.j(this.f8065c);
            return this.f8065c.flattenToString();
        }
        return str;
    }
}
