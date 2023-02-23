package org.org.org.org.android.http.filter;

import com.smartlook.sdk.smartlook.analytic.interceptor.model.UrlMask;
import java.util.List;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.p557z.C13726r;
/* renamed from: org.org.org.org.android.http.filter.f */
/* loaded from: classes.dex */
public abstract class AbstractC14532f {
    public static final List<String> mVisibleItems;

    /* renamed from: a */
    public final InterfaceC11824h f32081a;

    /* renamed from: e */
    public final List<String> f32082e;

    /* renamed from: f */
    public final List<UrlMask> f32083f;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        List $r1;
        String[] $r0 = {".*csrf.*", ".*token.*", ".*auth.*", ".*key.*", ".*cookie.*"};
        $r1 = C13726r.m3888h($r0);
        mVisibleItems = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC14532f(List list, List list2) {
        InterfaceC11824h $r2;
        this.f32083f = list;
        this.f32082e = list2;
        C14531b $r4 = new C14531b(this);
        $r2 = C13218k.m5625b($r4);
        this.f32081a = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final List m1391a() {
        InterfaceC11824h $r2 = this.f32081a;
        Object $r1 = $r2.getValue();
        List $r3 = (List) $r1;
        return $r3;
    }

    /* renamed from: a */
    public abstract String m1389a(int i, int i2);

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
        if (r11 != false) goto L8;
     */
    /* JADX WARN: Incorrect condition in loop: B:12:0x0056 */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0029 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m1390a(int r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            int r2 = r0.m1382f(r1)
            r4 = 0
            kotlin.i0.e r3 = kotlin.p491i0.C11839f.m10272j(r4, r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = r5
            r8 = r3
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r7 = r8
            r4 = 10
            int r2 = kotlin.p557z.C13722p.m3921o(r7, r4)
            r5.<init>(r2)
            r9 = r3
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r7 = r9
            java.util.Iterator r10 = r7.iterator()
        L25:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L98
            r13 = r10
            kotlin.z.l0 r13 = (kotlin.p557z.AbstractC13711l0) r13
            r12 = r13
            int r2 = r12.mo4069b()
            r0 = r24
            r1 = r25
            java.lang.String r14 = r0.m1389a(r1, r2)
            r0 = r24
            java.util.List r15 = r0.m1391a()
            boolean r11 = r15 instanceof java.util.Collection
            if (r11 == 0) goto L4c
            boolean r11 = r15.isEmpty()
            if (r11 == 0) goto L4c
            goto L6e
        L4c:
            java.util.Iterator r16 = r15.iterator()
        L50:
            r0 = r16
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L6e
            r0 = r16
            java.lang.Object r17 = r0.next()
            r19 = r17
            kotlin.l0.h r19 = (kotlin.p549l0.C13262h) r19
            r18 = r19
            r0 = r18
            boolean r11 = r0.m5522e(r14)
            if (r11 == 0) goto L50
            r11 = 1
            goto L6f
        L6e:
            r11 = 0
        L6f:
            if (r11 != 0) goto L85
            org.org.org.org.android.http.util.Element r20 = new org.org.org.org.android.http.util.Element
            r21 = r20
            r0 = r24
            r1 = r25
            java.lang.String r22 = r0.m1386b(r1, r2)
            r0 = r20
            r1 = r22
            r0.<init>(r14, r1)
            goto L92
        L85:
            org.org.org.org.android.http.util.Element r20 = new org.org.org.org.android.http.util.Element
            r21 = r20
            java.lang.String r23 = ""
            r0 = r20
            r1 = r23
            r0.<init>(r14, r1)
        L92:
            r0 = r21
            r6.add(r0)
            goto L25
        L98:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.http.filter.AbstractC14532f.m1390a(int):java.util.List");
    }

    /* renamed from: b */
    public abstract String m1387b();

    /* renamed from: b */
    public abstract String m1386b(int i, int i2);

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final String m1385d() {
        String $r1 = m1381h();
        return $r1;
    }

    /* renamed from: e */
    public abstract String m1384e();

    /* renamed from: f */
    public abstract int m1382f(int i);

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0011 */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m1383f() {
        /*
            r9 = this;
            java.lang.String r0 = r9.m1387b()
            r1 = r0
            java.util.List<com.smartlook.sdk.smartlook.analytic.interceptor.model.UrlMask> r2 = r9.f32083f
            if (r2 == 0) goto L28
            java.util.Iterator r3 = r2.iterator()
        Ld:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L29
            java.lang.Object r5 = r3.next()
            r7 = r5
            com.smartlook.sdk.smartlook.analytic.interceptor.model.UrlMask r7 = (com.smartlook.sdk.smartlook.analytic.interceptor.model.UrlMask) r7
            r6 = r7
            kotlin.l0.h r8 = r6.getRegex()
            java.lang.String r0 = r6.getReplaceWith()
            java.lang.String r1 = r8.m5521f(r1, r0)
            goto Ld
        L28:
            return r0
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.http.filter.AbstractC14532f.m1383f():java.lang.String");
    }

    public abstract String getResources();

    /* renamed from: h */
    public abstract String m1381h();

    /* renamed from: i */
    public abstract int m1380i();

    /* renamed from: l */
    public abstract boolean m1379l();
}
