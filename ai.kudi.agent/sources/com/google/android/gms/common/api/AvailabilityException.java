package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.api.internal.C2754b;
import com.google.android.gms.common.internal.s;
import java.util.ArrayList;
import p201g.p218e.C7521a;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public class AvailabilityException extends Exception {

    /* renamed from: c */
    private final C7521a<C2754b<?>, C2826b> f7687c;

    public AvailabilityException(C7521a<C2754b<?>, C2826b> c7521a) {
        this.f7687c = c7521a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C2754b<?> c2754b : this.f7687c.keySet()) {
            C2826b c2826b = this.f7687c.get(c2754b);
            s.j(c2826b);
            C2826b c2826b2 = c2826b;
            z &= !c2826b2.m31879s();
            String m32050b = c2754b.m32050b();
            String valueOf = String.valueOf(c2826b2);
            StringBuilder sb = new StringBuilder(String.valueOf(m32050b).length() + 2 + String.valueOf(valueOf).length());
            sb.append(m32050b);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
