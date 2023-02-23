package org.org.org.org.org.initializer;

import e.a.a.a.c.f.a;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import lombok.org.libs.org.objectweb.tree.C14335c;
import org.org.org.org.asm.signature.InterfaceC14613a;
import org.org.org.org.org.C14705f;
import org.org.org.org.org.common.screens.C14646h;
import org.org.org.org.org.data.Attribute;
import org.org.org.org.org.data.Label;
import org.org.org.org.org.menu.C14714h;
/* loaded from: classes.dex */
public final class Direction extends AbstractC11802m implements InterfaceC11756a<a> {

    /* renamed from: N */
    public static final Direction f32769N;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Direction $r0 = new Direction();
        f32769N = $r0;
    }

    public Direction() {
        super(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Label m679a() {
        C14708f $r1 = C14708f.f32807a;
        Label $r3 = C14708f.f32827v;
        if ($r3 != null) {
            return $r3;
        }
        C14335c $r4 = $r1.getText();
        C14706b $r5 = C14706b.f32798c;
        InterfaceC14613a $r6 = $r5.m658a();
        Attribute $r7 = $r1.m644k();
        C14705f $r2 = C14705f.f32765a;
        org.org.org.org.asm.collision.Type $r8 = $r1.create();
        C14714h $r9 = $r1.m655a();
        C14646h $r10 = $r1.m651c();
        return new Label($r4, $r6, $r7, $r2, $r8, $r9, $r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ a invoke() {
        Label $r1 = m679a();
        return $r1;
    }
}
