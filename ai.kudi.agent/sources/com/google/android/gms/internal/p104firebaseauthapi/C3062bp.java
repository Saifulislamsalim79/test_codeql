package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3035ap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.bp */
/* loaded from: classes2.dex */
final class C3062bp<T extends InterfaceC3035ap<T>> {

    /* renamed from: d */
    private static final C3062bp f8271d = new C3062bp(true);

    /* renamed from: a */
    final C3567v0<T, Object> f8272a = new C3385o0(16);

    /* renamed from: b */
    private boolean f8273b;

    /* renamed from: c */
    private boolean f8274c;

    private C3062bp() {
    }

    /* renamed from: a */
    public static <T extends InterfaceC3035ap<T>> C3062bp<T> m31353a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m31350d(T r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.firebase-auth-api.p1 r0 = r4.zzb()
            com.google.android.gms.internal.p104firebaseauthapi.C3117e.m31221e(r5)
            com.google.android.gms.internal.firebase-auth-api.p1 r1 = com.google.android.gms.internal.p104firebaseauthapi.EnumC3412p1.DOUBLE
            com.google.android.gms.internal.firebase-auth-api.q1 r1 = com.google.android.gms.internal.p104firebaseauthapi.EnumC3438q1.INT
            com.google.android.gms.internal.firebase-auth-api.q1 r0 = r0.m30480a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                case 5: goto L2e;
                case 6: goto L25;
                case 7: goto L1c;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L42
        L17:
            boolean r0 = r5 instanceof com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3644y
            if (r0 != 0) goto L41
            goto L42
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3305kp
            if (r0 == 0) goto L42
            goto L41
        L25:
            boolean r0 = r5 instanceof com.google.android.gms.internal.p104firebaseauthapi.AbstractC3223ho
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L42
            goto L41
        L2e:
            boolean r0 = r5 instanceof java.lang.String
            goto L3f
        L31:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3f
        L34:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3f
        L37:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3f
        L3a:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3f
        L3d:
            boolean r0 = r5 instanceof java.lang.Integer
        L3f:
            if (r0 == 0) goto L42
        L41:
            return
        L42:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.internal.firebase-auth-api.p1 r4 = r4.zzb()
            com.google.android.gms.internal.firebase-auth-api.q1 r4 = r4.m30480a()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p104firebaseauthapi.C3062bp.m31350d(com.google.android.gms.internal.firebase-auth-api.ap, java.lang.Object):void");
    }

    /* renamed from: b */
    public final void m31352b() {
        if (this.f8273b) {
            return;
        }
        this.f8272a.mo30160a();
        this.f8273b = true;
    }

    /* renamed from: c */
    public final void m31351c(T t, Object obj) {
        if (t.m31414c()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    m31350d(t, arrayList.get(i));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m31350d(t, obj);
        }
        this.f8272a.put(t, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C3062bp c3062bp = new C3062bp();
        for (int i = 0; i < this.f8272a.m30159b(); i++) {
            Map.Entry<T, Object> m30154i = this.f8272a.m30154i(i);
            c3062bp.m31351c(m30154i.getKey(), m30154i.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f8272a.m30158c()) {
            c3062bp.m31351c(entry.getKey(), entry.getValue());
        }
        c3062bp.f8274c = this.f8274c;
        return c3062bp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3062bp) {
            return this.f8272a.equals(((C3062bp) obj).f8272a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8272a.hashCode();
    }

    private C3062bp(boolean z) {
        m31352b();
        m31352b();
    }
}
