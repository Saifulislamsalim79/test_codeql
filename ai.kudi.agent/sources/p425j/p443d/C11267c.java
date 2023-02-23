package p425j.p443d;
/* compiled from: PerfMark.java */
/* renamed from: j.d.c */
/* loaded from: classes3.dex */
public final class C11267c {

    /* renamed from: a */
    private static final C11265a f25399a;

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0016 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    static {
        /*
            java.util.logging.Level r0 = java.util.logging.Level.WARNING
            r1 = 0
            java.lang.String r2 = "io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> Lb java.lang.ClassNotFoundException -> Le
            r3 = r1
            goto L14
        Lb:
            r2 = move-exception
            r3 = r2
            goto L13
        Le:
            r0 = move-exception
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            r3 = r0
            r0 = r2
        L13:
            r2 = r1
        L14:
            if (r2 == 0) goto L38
            java.lang.Class<j.d.a> r4 = p425j.p443d.C11265a.class
            java.lang.Class r2 = r2.asSubclass(r4)     // Catch: java.lang.Throwable -> L36
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L36
            java.lang.Class<j.d.d> r6 = p425j.p443d.C11268d.class
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L36
            java.lang.reflect.Constructor r2 = r2.getConstructor(r5)     // Catch: java.lang.Throwable -> L36
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L36
            j.d.d r5 = p425j.p443d.C11265a.f25397a     // Catch: java.lang.Throwable -> L36
            r4[r7] = r5     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r2.newInstance(r4)     // Catch: java.lang.Throwable -> L36
            j.d.a r2 = (p425j.p443d.C11265a) r2     // Catch: java.lang.Throwable -> L36
            r1 = r2
            goto L38
        L36:
            r2 = move-exception
            r3 = r2
        L38:
            if (r1 == 0) goto L3d
            p425j.p443d.C11267c.f25399a = r1
            goto L46
        L3d:
            j.d.a r1 = new j.d.a
            j.d.d r2 = p425j.p443d.C11265a.f25397a
            r1.<init>(r2)
            p425j.p443d.C11267c.f25399a = r1
        L46:
            if (r3 == 0) goto L57
            java.lang.Class<j.d.c> r1 = p425j.p443d.C11267c.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            java.lang.String r2 = "Error during PerfMark.<clinit>"
            r1.log(r0, r2, r3)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p425j.p443d.C11267c.<clinit>():void");
    }

    private C11267c() {
    }

    /* renamed from: a */
    public static C11268d m11259a(String str) {
        return f25399a.m11267a(str, Long.MIN_VALUE);
    }

    /* renamed from: b */
    public static C11268d m11258b(String str, long j) {
        return f25399a.m11267a(str, j);
    }

    /* renamed from: c */
    public static void m11257c(String str, C11268d c11268d) {
        f25399a.m11266b(str, c11268d);
    }

    /* renamed from: d */
    public static void m11256d(C11266b c11266b) {
        f25399a.m11265c(c11266b);
    }

    /* renamed from: e */
    public static C11266b m11255e() {
        return f25399a.m11264d();
    }

    /* renamed from: f */
    public static void m11254f(String str) {
        f25399a.m11263e(str);
    }

    /* renamed from: g */
    public static void m11253g(String str, C11268d c11268d) {
        f25399a.m11262f(str, c11268d);
    }

    /* renamed from: h */
    public static void m11252h(String str) {
        f25399a.m11261g(str);
    }

    /* renamed from: i */
    public static void m11251i(String str, C11268d c11268d) {
        f25399a.m11260h(str, c11268d);
    }
}
