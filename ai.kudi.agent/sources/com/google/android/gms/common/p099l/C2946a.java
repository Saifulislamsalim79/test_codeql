package com.google.android.gms.common.p099l;

import android.util.Log;
import com.google.android.gms.common.internal.C2886k;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.l.a */
/* loaded from: classes2.dex */
public class C2946a {

    /* renamed from: a */
    private final String f8117a;

    /* renamed from: b */
    private final String f8118b;

    /* renamed from: c */
    private final int f8119c;

    public C2946a(String str, String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.f8118b = sb;
        this.f8117a = str;
        new C2886k(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.f8117a, i)) {
            i++;
        }
        this.f8119c = i;
    }

    /* renamed from: a */
    public void m31585a(String str, Object... objArr) {
        if (m31580f(3)) {
            Log.d(this.f8117a, m31582d(str, objArr));
        }
    }

    /* renamed from: b */
    public void m31584b(String str, Throwable th, Object... objArr) {
        Log.e(this.f8117a, m31582d(str, objArr), th);
    }

    /* renamed from: c */
    public void m31583c(String str, Object... objArr) {
        Log.e(this.f8117a, m31582d(str, objArr));
    }

    /* renamed from: d */
    protected String m31582d(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f8118b.concat(str);
    }

    /* renamed from: e */
    public void m31581e(String str, Object... objArr) {
        Log.i(this.f8117a, m31582d(str, objArr));
    }

    /* renamed from: f */
    public boolean m31580f(int i) {
        return this.f8119c <= i;
    }

    /* renamed from: g */
    public void m31579g(String str, Object... objArr) {
        if (m31580f(2)) {
            Log.v(this.f8117a, m31582d(str, objArr));
        }
    }

    /* renamed from: h */
    public void m31578h(String str, Object... objArr) {
        Log.w(this.f8117a, m31582d(str, objArr));
    }

    /* renamed from: i */
    public void m31577i(String str, Throwable th, Object... objArr) {
        Log.wtf(this.f8117a, m31582d(str, objArr), th);
    }

    /* renamed from: j */
    public void m31576j(Throwable th) {
        Log.wtf(this.f8117a, th);
    }
}
