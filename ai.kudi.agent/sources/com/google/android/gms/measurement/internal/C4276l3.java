package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.l3 */
/* loaded from: classes2.dex */
public final class C4276l3 {

    /* renamed from: b */
    protected static final AtomicReference<String[]> f10442b = new AtomicReference<>();

    /* renamed from: c */
    protected static final AtomicReference<String[]> f10443c = new AtomicReference<>();

    /* renamed from: d */
    protected static final AtomicReference<String[]> f10444d = new AtomicReference<>();

    /* renamed from: a */
    private final InterfaceC4264k3 f10445a;

    public C4276l3(InterfaceC4264k3 interfaceC4264k3) {
        this.f10445a = interfaceC4264k3;
    }

    /* renamed from: g */
    private static final String m28043g(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        com.google.android.gms.common.internal.s.j(strArr);
        com.google.android.gms.common.internal.s.j(strArr2);
        com.google.android.gms.common.internal.s.j(atomicReference);
        com.google.android.gms.common.internal.s.a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (ia.Z(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: a */
    protected final String m28049a(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = m28048b((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(valueOf);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final String m28048b(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.f10445a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(m28045e(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = m28049a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = m28049a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = m28049a(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb.append(valueOf);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final String m28047c(C4379u c4379u) {
        String m28048b;
        if (!this.f10445a.zza()) {
            return c4379u.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(c4379u.f10700e);
        sb.append(",name=");
        sb.append(m28046d(c4379u.f10698c));
        sb.append(",params=");
        C4355s c4355s = c4379u.f10699d;
        if (c4355s == null) {
            m28048b = null;
        } else if (!this.f10445a.zza()) {
            m28048b = c4355s.toString();
        } else {
            m28048b = m28048b(c4355s.m27977k());
        }
        sb.append(m28048b);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final String m28046d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f10445a.zza() ? str : m28043g(str, C4441z5.f10856c, C4441z5.f10854a, f10442b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final String m28045e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f10445a.zza() ? str : m28043g(str, C4153a6.f10001b, C4153a6.f10000a, f10443c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final String m28044f(String str) {
        if (str == null) {
            return null;
        }
        if (this.f10445a.zza()) {
            if (str.startsWith("_exp_")) {
                return "experiment_id(" + str + ")";
            }
            return m28043g(str, C4164b6.f10035b, C4164b6.f10034a, f10444d);
        }
        return str;
    }
}
