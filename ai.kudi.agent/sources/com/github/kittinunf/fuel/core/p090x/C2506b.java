package com.github.kittinunf.fuel.core.p090x;

import com.github.kittinunf.fuel.core.EnumC2462o;
import com.github.kittinunf.fuel.core.InterfaceC2464q;
import java.net.URL;
import java.util.List;
import kotlin.C13287o;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
/* compiled from: ParameterEncoder.kt */
/* renamed from: com.github.kittinunf.fuel.core.x.b */
/* loaded from: classes2.dex */
public final class C2506b implements InterfaceC11767l<InterfaceC11767l<? super InterfaceC2464q, ? extends InterfaceC2464q>, InterfaceC11767l<? super InterfaceC2464q, ? extends InterfaceC2464q>> {

    /* renamed from: c */
    public static final C2506b f7131c = new C2506b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ParameterEncoder.kt */
    /* renamed from: com.github.kittinunf.fuel.core.x.b$a */
    /* loaded from: classes2.dex */
    public static final class C2507a extends AbstractC11802m implements InterfaceC11767l<C13287o<? extends String, ? extends String>, CharSequence> {

        /* renamed from: c */
        public static final C2507a f7132c = new C2507a();

        C2507a() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final CharSequence invoke(C13287o<String, String> c13287o) {
            boolean m5440u;
            l.g(c13287o, "<name for destructuring parameter 0>");
            String m5366a = c13287o.m5366a();
            String m5365b = c13287o.m5365b();
            l.c(m5365b, "value");
            m5440u = C13276s.m5440u(m5365b);
            if (m5440u) {
                return m5366a;
            }
            return m5366a + '=' + m5365b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ParameterEncoder.kt */
    /* renamed from: com.github.kittinunf.fuel.core.x.b$b */
    /* loaded from: classes2.dex */
    public static final class C2508b extends AbstractC11802m implements InterfaceC11767l<InterfaceC2464q, InterfaceC2464q> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC11767l f7133c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2508b(InterfaceC11767l interfaceC11767l) {
            super(1);
            this.f7133c = interfaceC11767l;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
            if (r1 != false) goto L20;
         */
        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.github.kittinunf.fuel.core.InterfaceC2464q invoke(com.github.kittinunf.fuel.core.InterfaceC2464q r9) {
            /*
                r8 = this;
                java.lang.String r0 = "request"
                kotlin.e0.d.l.g(r9, r0)
                java.lang.String r0 = "Content-Type"
                java.util.Collection r1 = r9.mo32774b(r0)
                java.lang.Object r1 = kotlin.p557z.C13722p.m3942d0(r1)
                java.lang.String r1 = (java.lang.String) r1
                r2 = 1
                r3 = 2
                r4 = 0
                r5 = 0
                if (r1 == 0) goto L28
                java.lang.String r6 = "multipart/form-data"
                boolean r6 = kotlin.p549l0.C13265j.m5507E(r1, r6, r4, r3, r5)
                if (r6 != r2) goto L28
                kotlin.e0.c.l r0 = r8.f7133c
                java.lang.Object r9 = r0.invoke(r9)
                com.github.kittinunf.fuel.core.q r9 = (com.github.kittinunf.fuel.core.InterfaceC2464q) r9
                return r9
            L28:
                com.github.kittinunf.fuel.core.a r6 = r9.mo32761o()
                boolean r6 = r6.isEmpty()
                if (r6 == 0) goto L74
                com.github.kittinunf.fuel.core.x.b r6 = com.github.kittinunf.fuel.core.p090x.C2506b.f7131c
                com.github.kittinunf.fuel.core.o r7 = r9.mo32765k()
                boolean r6 = com.github.kittinunf.fuel.core.p090x.C2506b.m32713a(r6, r7)
                if (r6 == 0) goto L74
                if (r1 == 0) goto L48
                boolean r6 = kotlin.p549l0.C13265j.m5470u(r1)
                if (r6 == 0) goto L47
                goto L48
            L47:
                r2 = 0
            L48:
                java.lang.String r6 = "application/x-www-form-urlencoded"
                if (r2 != 0) goto L52
                boolean r1 = kotlin.p549l0.C13265j.m5507E(r1, r6, r4, r3, r5)
                if (r1 == 0) goto L74
            L52:
                kotlin.e0.c.l r1 = r8.f7133c
                com.github.kittinunf.fuel.core.q r0 = r9.mo32762n(r0, r6)
                com.github.kittinunf.fuel.core.x.b r2 = com.github.kittinunf.fuel.core.p090x.C2506b.f7131c
                java.util.List r9 = r9.mo32773c()
                java.lang.String r9 = com.github.kittinunf.fuel.core.p090x.C2506b.m32712b(r2, r9)
                com.github.kittinunf.fuel.core.q r9 = com.github.kittinunf.fuel.core.InterfaceC2464q.C2465a.m32818a(r0, r9, r5, r3, r5)
                java.util.List r0 = kotlin.p557z.C13722p.m3941e()
                r9.mo32759q(r0)
                java.lang.Object r9 = r1.invoke(r9)
                com.github.kittinunf.fuel.core.q r9 = (com.github.kittinunf.fuel.core.InterfaceC2464q) r9
                return r9
            L74:
                kotlin.e0.c.l r0 = r8.f7133c
                com.github.kittinunf.fuel.core.x.b r1 = com.github.kittinunf.fuel.core.p090x.C2506b.f7131c
                java.net.URL r2 = r9.mo32766j()
                java.util.List r3 = r9.mo32773c()
                java.net.URL r1 = com.github.kittinunf.fuel.core.p090x.C2506b.m32711c(r1, r2, r3)
                r9.mo32772d(r1)
                java.util.List r1 = kotlin.p557z.C13722p.m3941e()
                r9.mo32759q(r1)
                java.lang.Object r9 = r0.invoke(r9)
                com.github.kittinunf.fuel.core.q r9 = (com.github.kittinunf.fuel.core.InterfaceC2464q) r9
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.kittinunf.fuel.core.p090x.C2506b.C2508b.invoke(com.github.kittinunf.fuel.core.q):com.github.kittinunf.fuel.core.q");
        }
    }

    private C2506b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m32710e(EnumC2462o enumC2462o) {
        int i = C2505a.f7130a[enumC2462o.ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        r2 = kotlin.p557z.C13742z.m3825B0(r2);
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m32709f(java.util.List<? extends kotlin.C13287o<java.lang.String, ? extends java.lang.Object>> r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r13 = r13.iterator()
        L9:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r13.next()
            r2 = r1
            kotlin.o r2 = (kotlin.C13287o) r2
            java.lang.Object r2 = r2.m5365b()
            if (r2 != 0) goto L1e
            r2 = 1
            goto L1f
        L1e:
            r2 = 0
        L1f:
            if (r2 != 0) goto L9
            r0.add(r1)
            goto L9
        L25:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r13 = r0.iterator()
        L2e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto Lc2
            java.lang.Object r0 = r13.next()
            kotlin.o r0 = (kotlin.C13287o) r0
            java.lang.Object r1 = r0.m5366a()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.m5365b()
            boolean r2 = r0 instanceof java.lang.Iterable
            r4 = 0
            if (r2 != 0) goto L4b
            r2 = r4
            goto L4c
        L4b:
            r2 = r0
        L4c:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            if (r2 == 0) goto L58
            java.util.List r2 = kotlin.p557z.C13722p.m3972B0(r2)
            if (r2 == 0) goto L58
            r4 = r2
            goto L67
        L58:
            boolean r2 = r0 instanceof java.lang.Object[]
            if (r2 != 0) goto L5e
            r2 = r4
            goto L5f
        L5e:
            r2 = r0
        L5f:
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            if (r2 == 0) goto L67
            java.util.List r4 = kotlin.p557z.C13706j.m4097Z(r2)
        L67:
            java.lang.String r2 = "UTF-8"
            if (r4 == 0) goto La9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)
            r0.append(r1)
            java.lang.String r1 = "[]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.ArrayList r1 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.p557z.C13722p.m3921o(r4, r5)
            r1.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L8f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lbd
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = java.net.URLEncoder.encode(r5, r2)
            kotlin.o r5 = kotlin.C13664u.m4227a(r0, r5)
            r1.add(r5)
            goto L8f
        La9:
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r2)
            kotlin.o r0 = kotlin.C13664u.m4227a(r1, r0)
            java.util.List r1 = kotlin.p557z.C13722p.m3946b(r0)
        Lbd:
            kotlin.p557z.C13722p.m3910v(r3, r1)
            goto L2e
        Lc2:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            com.github.kittinunf.fuel.core.x.b$a r9 = com.github.kittinunf.fuel.core.p090x.C2506b.C2507a.f7132c
            r10 = 30
            r11 = 0
            java.lang.String r4 = "&"
            java.lang.String r13 = kotlin.p557z.C13722p.m3947a0(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.kittinunf.fuel.core.p090x.C2506b.m32709f(java.util.List):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final URL m32707h(URL url, List<? extends C13287o<String, ? extends Object>> list) {
        boolean m5423I;
        String str;
        String m32709f = f7131c.m32709f(list);
        if (m32709f.length() == 0) {
            return url;
        }
        String externalForm = url.toExternalForm();
        l.c(externalForm, "toExternalForm()");
        m5423I = C13277t.m5423I(externalForm, '?', false, 2, null);
        if (m5423I) {
            String query = url.getQuery();
            l.c(query, "query");
            str = query.length() > 0 ? "&" : "";
        } else {
            str = "?";
        }
        return new URL(url.toExternalForm() + str + m32709f);
    }

    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    /* renamed from: g */
    public InterfaceC11767l<InterfaceC2464q, InterfaceC2464q> invoke(InterfaceC11767l<? super InterfaceC2464q, ? extends InterfaceC2464q> interfaceC11767l) {
        l.g(interfaceC11767l, "next");
        return new C2508b(interfaceC11767l);
    }
}
