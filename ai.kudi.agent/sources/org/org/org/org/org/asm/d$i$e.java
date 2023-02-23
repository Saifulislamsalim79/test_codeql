package org.org.org.org.org.asm;

import android.app.Activity;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* loaded from: classes.dex */
public final class d$i$e extends AbstractC11802m implements InterfaceC11756a<C13666w> {

    /* renamed from: b */
    public final /* synthetic */ Activity f32498b;

    /* renamed from: o */
    public final /* synthetic */ ActivityLifecycleCallbacksWrapper f32499o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d$i$e(ActivityLifecycleCallbacksWrapper activityLifecycleCallbacksWrapper, Activity activity) {
        super(0);
        this.f32499o = activityLifecycleCallbacksWrapper;
        this.f32498b = activity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m971d() {
        ActivityLifecycleCallbacksWrapper $r3 = this.f32499o;
        C14635f $r4 = $r3.f32479x;
        ByteVector $r2 = $r4.m963b();
        Activity $r1 = this.f32498b;
        $r2.read($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ C13666w invoke() {
        m971d();
        C13666w r1 = C13666w.f30112a;
        return r1;
    }
}
