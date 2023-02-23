package org.org.org.org.org.initializer;

import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import org.org.org.org.org.common.Buffer;
/* loaded from: classes.dex */
public final class Element extends AbstractC11802m implements InterfaceC11756a<e.a.a.a.c.m.b> {

    /* renamed from: b */
    public static final Element f32770b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Element $r0 = new Element();
        f32770b = $r0;
    }

    public Element() {
        super(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final org.org.org.org.org.common.Logger add() {
        C14708f $r2 = C14708f.f32807a;
        Buffer $r3 = $r2.get();
        org.org.org.org.android.model.Log $r4 = $r2.getInstance();
        org.org.org.org.org.common.Logger $r1 = new org.org.org.org.org.common.Logger($r3, $r4);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ e.a.a.a.c.m.b invoke() {
        org.org.org.org.org.common.Logger $r1 = add();
        return $r1;
    }
}
