package lombok.org.asm;

import a.a.a.h0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.p476c0.C11718f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11771p;
import lombok.org.asm.asm.Paint;
import lombok.org.asm.tree.C14310n;
/* loaded from: classes.dex */
public abstract class MethodWriter<T> extends h0 implements a.a.a.t, InterfaceC11714d<T>, a.a.a.w {

    /* renamed from: d */
    public final InterfaceC11719g f31293d;

    /* renamed from: v */
    public final InterfaceC11719g f31294v;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MethodWriter(InterfaceC11719g interfaceC11719g, boolean z) {
        super(z);
        this.f31294v = interfaceC11719g;
        MethodWriter<T> r2 = this;
        InterfaceC11719g $r1 = interfaceC11719g.plus(r2);
        this.f31293d = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m2366a(EnumC14265c enumC14265c, java.lang.Object obj, InterfaceC11771p interfaceC11771p) {
        m2364c();
        int $i0 = enumC14265c.ordinal();
        if ($i0 == 0) {
            lombok.org.asm.tree.Label.m2170a(interfaceC11771p, obj, this, null);
        } else if ($i0 != 1) {
            if ($i0 == 2) {
                C11718f.m10402a(interfaceC11771p, obj, this);
            } else if ($i0 == 3) {
                C14310n.m2169a(interfaceC11771p, obj, this);
            } else {
                Throwable r5 = new NoWhenBranchMatchedException();
                Throwable r6 = r5;
                throw r6;
            }
        }
    }

    /* renamed from: b */
    public void m2365b() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public final void m2364c() {
        InterfaceC11719g $r3 = this.f31294v;
        Token $r1 = Label.f31291c;
        InterfaceC11719g.InterfaceC11722b $r2 = $r3.get($r1);
        Label $r4 = (Label) $r2;
        m2395a($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public String m2363d() {
        StringBuilder $r1 = new StringBuilder();
        Class $r2 = getClass();
        String $r3 = $r2.getSimpleName();
        $r1.append($r3);
        $r1.append(" was cancelled");
        String $r32 = $r1.toString();
        return $r32;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public InterfaceC11719g m2362e() {
        InterfaceC11719g r1 = this.f31293d;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final void m2361e(java.lang.Object obj) {
        boolean $z0 = obj instanceof C14264b;
        if ($z0) {
            C14264b $r2 = (C14264b) obj;
            Throwable th = $r2.f31379a;
            $r2.write();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final void m2360e(Throwable th) {
        InterfaceC11719g $r2 = this.f31293d;
        ClassReader.m2380a($r2, th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String get() {
        /*
            r17 = this;
            r0 = r17
            kotlin.c0.g r1 = r0.f31293d
            r17 = r0
            boolean r2 = lombok.org.asm.C14275l.f31408c
            boolean r2 = lombok.org.asm.Item.f31287a
            if (r2 != 0) goto Ld
            goto L3c
        Ld:
            lombok.org.asm.Generator r3 = lombok.org.asm.Attribute.f31266g
            kotlin.c0.g$b r4 = r1.get(r3)
            r6 = r4
            lombok.org.asm.Attribute r6 = (lombok.org.asm.Attribute) r6
            r5 = r6
            if (r5 == 0) goto L3c
            lombok.org.asm.Target r7 = lombok.org.asm.MimeType.f31295a
            kotlin.c0.g$b r4 = r1.get(r7)
            r9 = r4
            lombok.org.asm.MimeType r9 = (lombok.org.asm.MimeType) r9
            r8 = r9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "coroutine"
            r10.append(r11)
            r12 = 35
            r10.append(r12)
            long r13 = r5.f31267a
            r10.append(r13)
            java.lang.String r15 = r10.toString()
            goto L3d
        L3c:
            r15 = 0
        L3d:
            if (r15 == 0) goto L65
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r12 = 34
            r10.append(r12)
            r10.append(r15)
            java.lang.String r11 = "\":"
            r10.append(r11)
            r0 = r17
            java.lang.Class r16 = r0.getClass()
            r0 = r16
            java.lang.String r15 = r0.getSimpleName()
            r10.append(r15)
            java.lang.String r15 = r10.toString()
            return r15
        L65:
            r0 = r17
            java.lang.Class r16 = r0.getClass()
            r0 = r16
            java.lang.String r15 = r0.getSimpleName()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.MethodWriter.get():java.lang.String");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.InterfaceC11714d
    public final InterfaceC11719g getContext() {
        InterfaceC11719g r1 = this.f31293d;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean put() {
        boolean $z0 = super.put();
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.InterfaceC11714d
    public final void resumeWith(java.lang.Object obj) {
        java.lang.Object $r1 = m2388b(AnnotationVisitor.m2405a(obj, null));
        Paint $r2 = Plot.f31302e;
        if ($r1 == $r2) {
            return;
        }
        visitLdcInsn($r1);
    }

    public void visitLdcInsn(java.lang.Object obj) {
        append(obj);
    }

    public final void visitMethodInsn() {
        m2365b();
    }
}
