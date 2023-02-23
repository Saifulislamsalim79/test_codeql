package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12287q;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12616h;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13333g1;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.InterfaceC13481f;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.InterfaceC13504t;
/* compiled from: ReflectJavaMember.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.r */
/* loaded from: classes3.dex */
public abstract class AbstractC13502r extends AbstractC13498n implements InterfaceC13481f, InterfaceC13504t, InterfaceC12287q {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.InterfaceC13481f
    /* renamed from: C */
    public AnnotatedElement mo4788C() {
        return (AnnotatedElement) mo4807c0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.InterfaceC13504t
    /* renamed from: K */
    public int mo4800K() {
        return mo4807c0().getModifiers();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12290s
    /* renamed from: P */
    public boolean mo4817P() {
        return InterfaceC13504t.C13505a.m4798b(this);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12290s
    /* renamed from: Y */
    public boolean mo4815Y() {
        return InterfaceC13504t.C13505a.m4796d(this);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: Z */
    public C13477c mo4777r(C12609c c12609c) {
        return InterfaceC13481f.C13482a.m4874a(this, c12609c);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: a0 */
    public List<C13477c> mo4770y() {
        return InterfaceC13481f.C13482a.m4873b(this);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12291t
    /* renamed from: b */
    public C12614f mo4785b() {
        String name = mo4807c0().getName();
        C12614f m7349i = name == null ? null : C12614f.m7349i(name);
        if (m7349i == null) {
            C12614f c12614f = C12616h.f28387a;
            l.e(c12614f, "NO_NAME_PROVIDED");
            return c12614f;
        }
        return m7349i;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12287q
    /* renamed from: b0 */
    public C13486j mo4816X() {
        Class<?> declaringClass = mo4807c0().getDeclaringClass();
        l.e(declaringClass, "member.declaringClass");
        return new C13486j(declaringClass);
    }

    /* renamed from: c0 */
    public abstract Member mo4807c0();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068 A[LOOP:0: B:13:0x0038->B:26:0x0068, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae A[EDGE_INSN: B:30:0x00ae->B:29:0x00ae ?: BREAK  , SYNTHETIC] */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12267a0> m4811d0(java.lang.reflect.Type[] r13, java.lang.annotation.Annotation[][] r14, boolean r15) {
        /*
            r12 = this;
            java.lang.String r0 = "parameterTypes"
            kotlin.e0.d.l.f(r13, r0)
            java.lang.String r0 = "parameterAnnotations"
            kotlin.e0.d.l.f(r14, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r13.length
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.l1.b.a r1 = kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.C13472a.f29827a
            java.lang.reflect.Member r2 = r12.mo4807c0()
            java.util.List r1 = r1.m4896b(r2)
            r2 = 0
            if (r1 != 0) goto L1f
            r3 = r2
            goto L27
        L1f:
            int r3 = r1.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L27:
            r4 = 0
            if (r3 != 0) goto L2c
            r3 = 0
            goto L32
        L2c:
            int r3 = r3.intValue()
            int r5 = r13.length
            int r3 = r3 - r5
        L32:
            int r5 = r13.length
            int r5 = r5 + (-1)
            if (r5 < 0) goto Lae
            r6 = 0
        L38:
            int r7 = r6 + 1
            kotlin.reflect.jvm.internal.impl.descriptors.l1.b.w$a r8 = kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.AbstractC13508w.f29866a
            r9 = r13[r6]
            kotlin.reflect.jvm.internal.impl.descriptors.l1.b.w r8 = r8.m4789a(r9)
            if (r1 != 0) goto L46
            r9 = r2
            goto L50
        L46:
            int r9 = r6 + r3
            java.lang.Object r9 = kotlin.p557z.C13722p.m3951U(r1, r9)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L6a
        L50:
            if (r15 == 0) goto L5a
            int r10 = kotlin.p557z.C13706j.m4074z(r13)
            if (r6 != r10) goto L5a
            r10 = 1
            goto L5b
        L5a:
            r10 = 0
        L5b:
            kotlin.reflect.jvm.internal.impl.descriptors.l1.b.y r11 = new kotlin.reflect.jvm.internal.impl.descriptors.l1.b.y
            r6 = r14[r6]
            r11.<init>(r8, r6, r9, r10)
            r0.add(r11)
            if (r7 <= r5) goto L68
            goto Lae
        L68:
            r6 = r7
            goto L38
        L6a:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "No parameter with index "
            r13.append(r14)
            r13.append(r6)
            r14 = 43
            r13.append(r14)
            r13.append(r3)
            java.lang.String r14 = " (name="
            r13.append(r14)
            kotlin.j0.o.c.p0.f.f r14 = r12.mo4785b()
            r13.append(r14)
            java.lang.String r14 = " type="
            r13.append(r14)
            r13.append(r8)
            java.lang.String r14 = ") in "
            r13.append(r14)
            r13.append(r1)
            java.lang.String r14 = "@ReflectJavaMember"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        Lae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.AbstractC13502r.m4811d0(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.List");
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC13502r) && l.b(mo4807c0(), ((AbstractC13502r) obj).mo4807c0());
    }

    public int hashCode() {
        return mo4807c0().hashCode();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12290s
    /* renamed from: i */
    public AbstractC13333g1 mo4810i() {
        return InterfaceC13504t.C13505a.m4799a(this);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: q */
    public boolean mo4771q() {
        return InterfaceC13481f.C13482a.m4872c(this);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12290s
    /* renamed from: t */
    public boolean mo4809t() {
        return InterfaceC13504t.C13505a.m4797c(this);
    }

    public String toString() {
        return getClass().getName() + ": " + mo4807c0();
    }
}
