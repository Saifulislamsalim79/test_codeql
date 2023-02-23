package lombok.org.asm.menu;

import lombok.org.asm.PositionMetric$a;
import lombok.org.asm.asm.MethodVisitor;
import lombok.org.asm.asm.Paint;
/* renamed from: lombok.org.asm.menu.m */
/* loaded from: classes.dex */
public final class C14289m<E> extends a.a.a.a2.q implements a.a.a.a2.p<E> {

    /* renamed from: e */
    public final Throwable f31452e;

    public C14289m(Throwable th) {
        this.f31452e = th;
    }

    /* renamed from: a */
    public java.lang.Object m2208a() {
        return this;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public Paint m2207a(java.lang.Object obj, MethodVisitor methodVisitor) {
        Paint r3 = PositionMetric$a.f31306a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public Paint m2206a(MethodVisitor methodVisitor) {
        Paint r2 = PositionMetric$a.f31306a;
        return r2;
    }

    /* renamed from: b */
    public java.lang.Object m2205b() {
        return this;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public void m2204b(C14289m c14289m) {
        boolean $z0 = lombok.org.asm.Item.f31289c;
        if ($z0) {
            AssertionError $r2 = new AssertionError();
            throw $r2;
        }
    }

    /* renamed from: d */
    public void m2203d() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r1 = new StringBuilder();
        $r1.append("Closed@");
        int $i0 = System.identityHashCode(this);
        String $r2 = Integer.toHexString($i0);
        $r1.append($r2);
        $r1.append('[');
        Throwable $r3 = this.f31452e;
        $r1.append($r3);
        $r1.append(']');
        String $r22 = $r1.toString();
        return $r22;
    }

    public void toString(java.lang.Object obj) {
    }
}
