package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.InterfaceC3754d8;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.e8 */
/* loaded from: classes2.dex */
final class C3769e8<T extends InterfaceC3754d8<T>> {

    /* renamed from: d */
    private static final C3769e8 f9273d = new C3769e8(true);

    /* renamed from: a */
    final C3849ja<T, Object> f9274a = new C3740ca(16);

    /* renamed from: b */
    private boolean f9275b;

    /* renamed from: c */
    private boolean f9276c;

    private C3769e8() {
    }

    /* renamed from: a */
    public static <T extends InterfaceC3754d8<T>> C3769e8<T> m29639a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m29636d(T r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.measurement.db r0 = r4.zzb()
            com.google.android.gms.internal.measurement.C4004t8.m28905e(r5)
            com.google.android.gms.internal.measurement.db r1 = com.google.android.gms.internal.measurement.EnumC3757db.DOUBLE
            com.google.android.gms.internal.measurement.eb r1 = com.google.android.gms.internal.measurement.EnumC3772eb.INT
            com.google.android.gms.internal.measurement.eb r0 = r0.m29676a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L39;
                case 1: goto L36;
                case 2: goto L33;
                case 3: goto L30;
                case 4: goto L2d;
                case 5: goto L2a;
                case 6: goto L21;
                case 7: goto L1c;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L3e
        L17:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.InterfaceC3927o9
            if (r0 != 0) goto L3d
            goto L3e
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L3d
            goto L3e
        L21:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.AbstractC3909n7
            if (r0 != 0) goto L3d
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L3e
            goto L3d
        L2a:
            boolean r0 = r5 instanceof java.lang.String
            goto L3b
        L2d:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3b
        L30:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3b
        L33:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3b
        L36:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3b
        L39:
            boolean r0 = r5 instanceof java.lang.Integer
        L3b:
            if (r0 == 0) goto L3e
        L3d:
            return
        L3e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.internal.measurement.db r4 = r4.zzb()
            com.google.android.gms.internal.measurement.eb r4 = r4.m29676a()
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3769e8.m29636d(com.google.android.gms.internal.measurement.d8, java.lang.Object):void");
    }

    /* renamed from: b */
    public final void m29638b() {
        if (this.f9275b) {
            return;
        }
        this.f9274a.mo29448a();
        this.f9275b = true;
    }

    /* renamed from: c */
    public final void m29637c(T t, Object obj) {
        if (t.m29677c()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    m29636d(t, arrayList.get(i));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m29636d(t, obj);
        }
        this.f9274a.put(t, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C3769e8 c3769e8 = new C3769e8();
        for (int i = 0; i < this.f9274a.m29447b(); i++) {
            Map.Entry<T, Object> m29442i = this.f9274a.m29442i(i);
            c3769e8.m29637c(m29442i.getKey(), m29442i.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f9274a.m29446c()) {
            c3769e8.m29637c(entry.getKey(), entry.getValue());
        }
        c3769e8.f9276c = this.f9276c;
        return c3769e8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3769e8) {
            return this.f9274a.equals(((C3769e8) obj).f9274a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9274a.hashCode();
    }

    private C3769e8(boolean z) {
        m29638b();
        m29638b();
    }
}
