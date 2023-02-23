package kotlin.p480d0;

import java.lang.reflect.Method;
import kotlin.e0.d.l;
import kotlin.p489h0.AbstractC11828c;
import kotlin.p489h0.C11826b;
/* compiled from: PlatformImplementations.kt */
/* renamed from: kotlin.d0.a */
/* loaded from: classes3.dex */
public class C11747a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlatformImplementations.kt */
    /* renamed from: kotlin.d0.a$a */
    /* loaded from: classes3.dex */
    public static final class C11748a {

        /* renamed from: a */
        public static final Method f26470a;

        /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[LOOP:0: B:3:0x000e->B:13:0x003e, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[EDGE_INSN: B:23:0x0042->B:15:0x0042 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.e0.d.l.e(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            Le:
                java.lang.String r5 = "it"
                if (r4 >= r2) goto L41
                r6 = r1[r4]
                kotlin.e0.d.l.e(r6, r5)
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.e0.d.l.b(r7, r8)
                if (r7 == 0) goto L3a
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                kotlin.e0.d.l.e(r7, r8)
                java.lang.Object r7 = kotlin.p557z.C13706j.m4105O(r7)
                java.lang.Class r7 = (java.lang.Class) r7
                boolean r7 = kotlin.e0.d.l.b(r7, r0)
                if (r7 == 0) goto L3a
                r7 = 1
                goto L3b
            L3a:
                r7 = 0
            L3b:
                if (r7 == 0) goto L3e
                goto L42
            L3e:
                int r4 = r4 + 1
                goto Le
            L41:
                r6 = 0
            L42:
                kotlin.p480d0.C11747a.C11748a.f26470a = r6
                int r0 = r1.length
            L45:
                if (r3 >= r0) goto L5c
                r2 = r1[r3]
                kotlin.e0.d.l.e(r2, r5)
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = kotlin.e0.d.l.b(r2, r4)
                if (r2 == 0) goto L59
                goto L5c
            L59:
                int r3 = r3 + 1
                goto L45
            L5c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p480d0.C11747a.C11748a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo10367a(Throwable th, Throwable th2) {
        l.f(th, "cause");
        l.f(th2, "exception");
        Method method = C11748a.f26470a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    /* renamed from: b */
    public AbstractC11828c mo10366b() {
        return new C11826b();
    }
}
