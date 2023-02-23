package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.p */
/* loaded from: classes2.dex */
public final class C4320p {

    /* renamed from: a */
    final String f10565a;

    /* renamed from: b */
    final String f10566b;

    /* renamed from: c */
    final String f10567c;

    /* renamed from: d */
    final long f10568d;

    /* renamed from: e */
    final long f10569e;

    /* renamed from: f */
    final C4355s f10570f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4320p(b5 b5Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        C4355s c4355s;
        com.google.android.gms.common.internal.s.f(str2);
        com.google.android.gms.common.internal.s.f(str3);
        this.f10565a = str2;
        this.f10566b = str3;
        this.f10567c = true == TextUtils.isEmpty(str) ? null : str;
        this.f10568d = j;
        this.f10569e = j2;
        if (j2 != 0 && j2 > j) {
            b5Var.b().w().m28013b("Event created with reverse previous/current timestamps. appId", q3.z(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    b5Var.b().r().m28014a("Param name can't be null");
                    it.remove();
                } else {
                    Object o = b5Var.N().o(next, bundle2.get(next));
                    if (o == null) {
                        b5Var.b().w().m28013b("Param value can't be null", b5Var.D().m28045e(next));
                        it.remove();
                    } else {
                        b5Var.N().B(bundle2, next, o);
                    }
                }
            }
            c4355s = new C4355s(bundle2);
        } else {
            c4355s = new C4355s(new Bundle());
        }
        this.f10570f = c4355s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C4320p m28006a(b5 b5Var, long j) {
        return new C4320p(b5Var, this.f10567c, this.f10565a, this.f10566b, this.f10568d, j, this.f10570f);
    }

    public final String toString() {
        String str = this.f10565a;
        String str2 = this.f10566b;
        String c4355s = this.f10570f.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + c4355s.length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(c4355s);
        sb.append('}');
        return sb.toString();
    }

    private C4320p(b5 b5Var, String str, String str2, String str3, long j, long j2, C4355s c4355s) {
        com.google.android.gms.common.internal.s.f(str2);
        com.google.android.gms.common.internal.s.f(str3);
        com.google.android.gms.common.internal.s.j(c4355s);
        this.f10565a = str2;
        this.f10566b = str3;
        this.f10567c = true == TextUtils.isEmpty(str) ? null : str;
        this.f10568d = j;
        this.f10569e = j2;
        if (j2 != 0 && j2 > j) {
            b5Var.b().w().m28012c("Event created with reverse previous/current timestamps. appId, name", q3.z(str2), q3.z(str3));
        }
        this.f10570f = c4355s;
    }
}
