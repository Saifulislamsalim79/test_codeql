package org.org.org.org.org.initializer;

import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import org.org.org.org.android.util.common.net.Attribute;
import org.org.org.org.org.asm.C14635f;
import org.org.org.org.org.asm.C14637i;
import org.org.org.org.org.common.Buffer;
import org.org.org.org.org.menu.C14714h;
/* loaded from: classes.dex */
public final class ClassWriter extends AbstractC11802m implements InterfaceC11756a<e.a.a.a.a.b.d.c.c> {

    /* renamed from: b */
    public static final ClassWriter f32768b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        ClassWriter $r0 = new ClassWriter();
        f32768b = $r0;
    }

    public ClassWriter() {
        super(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Attribute m682a() {
        C14708f $r2 = C14708f.f32807a;
        C14635f $r3 = $r2.getResources();
        Buffer $r4 = $r2.get();
        org.org.org.org.org.common.Logger $r5 = $r2.m649e();
        C14637i $r6 = $r2.m642p();
        C14714h $r7 = $r2.m655a();
        Attribute $r1 = new Attribute($r3, $r4, $r5, $r6, $r7);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ e.a.a.a.a.b.d.c.c invoke() {
        Attribute $r1 = m682a();
        return $r1;
    }
}
