package org.org.org.org.org.asm;

import android.app.Activity;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* renamed from: org.org.org.org.org.asm.b */
/* loaded from: classes.dex */
public final class C14631b extends AbstractC11802m implements InterfaceC11756a<C13666w> {

    /* renamed from: b */
    public final /* synthetic */ Activity f32491b;

    /* renamed from: c */
    public final /* synthetic */ C14635f f32492c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14631b(C14635f c14635f, Activity activity) {
        super(0);
        this.f32492c = c14635f;
        this.f32491b = activity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m981d() {
        C14635f $r3 = this.f32492c;
        ByteVector $r2 = $r3.m963b();
        Activity $r1 = this.f32491b;
        $r2.m984a($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ C13666w invoke() {
        m981d();
        C13666w r1 = C13666w.f30112a;
        return r1;
    }
}
