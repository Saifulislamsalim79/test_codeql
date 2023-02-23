package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.internal.s;
import com.google.firebase.p170o.InterfaceC6560b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: com.google.mlkit.vision.common.internal.e */
/* loaded from: classes2.dex */
public class C6971e {

    /* renamed from: a */
    private final Map f16694a = new HashMap();

    /* compiled from: com.google.mlkit:vision-common@@17.0.0 */
    /* renamed from: com.google.mlkit.vision.common.internal.e$a */
    /* loaded from: classes2.dex */
    public static class C6972a {

        /* renamed from: a */
        private final Class f16695a;

        /* renamed from: b */
        private final InterfaceC6560b f16696b;

        /* renamed from: c */
        private final int f16697c;

        /* renamed from: a */
        final int m20407a() {
            return this.f16697c;
        }

        /* renamed from: b */
        final InterfaceC6560b m20406b() {
            return this.f16696b;
        }

        /* renamed from: c */
        final Class m20405c() {
            return this.f16695a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6971e(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C6972a c6972a = (C6972a) it.next();
            Class m20405c = c6972a.m20405c();
            if (this.f16694a.containsKey(m20405c)) {
                int m20407a = c6972a.m20407a();
                Integer num = (Integer) hashMap.get(m20405c);
                s.j(num);
                if (m20407a >= num.intValue()) {
                }
            }
            this.f16694a.put(m20405c, c6972a.m20406b());
            hashMap.put(m20405c, Integer.valueOf(c6972a.m20407a()));
        }
    }
}
