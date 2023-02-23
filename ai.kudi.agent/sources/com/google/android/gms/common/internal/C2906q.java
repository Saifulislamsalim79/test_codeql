package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.q */
/* loaded from: classes2.dex */
public final class C2906q {

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* renamed from: com.google.android.gms.common.internal.q$a */
    /* loaded from: classes2.dex */
    public static final class C2907a {

        /* renamed from: a */
        private final java.util.List<String> f8054a;

        /* renamed from: b */
        private final Object f8055b;

        /* synthetic */ C2907a(Object obj, C2870e1 c2870e1) {
            s.j(obj);
            this.f8055b = obj;
            this.f8054a = new ArrayList();
        }

        /* renamed from: a */
        public C2907a m31698a(String str, Object obj) {
            java.util.List<String> list = this.f8054a;
            s.j(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f8055b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f8054a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f8054a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m31701a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m31700b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static C2907a m31699c(Object obj) {
        return new C2907a(obj, null);
    }
}
