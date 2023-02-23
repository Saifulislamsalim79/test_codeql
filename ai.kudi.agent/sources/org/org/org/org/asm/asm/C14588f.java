package org.org.org.org.asm.asm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C13287o;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13736w;
/* renamed from: org.org.org.org.asm.asm.f */
/* loaded from: classes.dex */
public final class C14588f<H> {

    /* renamed from: f */
    public final List<C13287o<Class<?>, H>> f32339f;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14588f() {
        ArrayList $r1 = new ArrayList();
        this.f32339f = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final Object m1127a(Class cls) {
        C13287o c13287o;
        Log_OC.getArray(cls, "clazz");
        List $r2 = this.f32339f;
        Iterator $r3 = $r2.iterator();
        while (true) {
            boolean $z0 = $r3.hasNext();
            if (!$z0) {
                c13287o = null;
                break;
            }
            Object $r4 = $r3.next();
            c13287o = $r4;
            Class $r7 = (Class) ((C13287o) $r4).m5364c();
            boolean $z02 = $r7.isAssignableFrom(cls);
            if ($z02) {
                break;
            }
        }
        C13287o $r6 = c13287o;
        if ($r6 != null) {
            Object $r5 = $r6.m5363d();
            return $r5;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0010 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1126a(java.lang.Class r13, java.lang.Object r14) {
        /*
            r12 = this;
            java.lang.String r0 = "clazz"
            kotlin.p483e0.p485d.Log_OC.getArray(r13, r0)
            java.util.List<kotlin.o<java.lang.Class<?>, H>> r1 = r12.f32339f
            java.util.Iterator r2 = r1.iterator()
            r3 = 0
        Lc:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5c
            java.lang.Object r5 = r2.next()
            if (r3 < 0) goto L51
            r7 = r5
            kotlin.o r7 = (kotlin.C13287o) r7
            r6 = r7
            java.lang.Object r5 = r6.m5364c()
            r9 = r5
            java.lang.Class r9 = (java.lang.Class) r9
            r8 = r9
            boolean r4 = kotlin.p483e0.p485d.Log_OC.append(r8, r13)
            if (r4 == 0) goto L35
            java.util.List<kotlin.o<java.lang.Class<?>, H>> r1 = r12.f32339f
            kotlin.o r6 = new kotlin.o
            r6.<init>(r13, r14)
            r1.set(r3, r6)
            return
        L35:
            java.lang.Object r5 = r6.m5364c()
            r10 = r5
            java.lang.Class r10 = (java.lang.Class) r10
            r8 = r10
            boolean r4 = r8.isAssignableFrom(r13)
            if (r4 == 0) goto L4e
            java.util.List<kotlin.o<java.lang.Class<?>, H>> r1 = r12.f32339f
            kotlin.o r6 = new kotlin.o
            r6.<init>(r13, r14)
            r1.add(r3, r6)
            return
        L4e:
            int r3 = r3 + 1
            goto Lc
        L51:
            kotlin.p557z.C13722p.m3923n()
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r0 = "Null throw statement replaced by Soot"
            r11.<init>(r0)
            throw r11
        L5c:
            java.util.List<kotlin.o<java.lang.Class<?>, H>> r1 = r12.f32339f
            kotlin.o r6 = new kotlin.o
            r6.<init>(r13, r14)
            r1.add(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.asm.C14588f.m1126a(java.lang.Class, java.lang.Object):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean add(Class cls) {
        boolean $z0;
        Log_OC.getArray(cls, "clazz");
        List $r3 = this.f32339f;
        C14587e $r1 = new C14587e(cls);
        $z0 = C13736w.m3846z($r3, $r1);
        return $z0;
    }
}
