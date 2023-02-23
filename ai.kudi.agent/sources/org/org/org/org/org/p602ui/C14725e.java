package org.org.org.org.org.p602ui;

import android.graphics.Rect;
import android.text.StaticLayout;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* renamed from: org.org.org.org.org.ui.e */
/* loaded from: classes.dex */
public final class C14725e extends AbstractC11802m implements InterfaceC11767l<Integer, Rect> {

    /* renamed from: d */
    public final /* synthetic */ C14724c f32913d;

    /* renamed from: e */
    public final /* synthetic */ StaticLayout f32914e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14725e(C14724c c14724c, StaticLayout staticLayout) {
        super(1);
        this.f32913d = c14724c;
        this.f32914e = staticLayout;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Rect m493a(int i) {
        C14724c $r1 = this.f32913d;
        StaticLayout $r2 = this.f32914e;
        Rect $r3 = $r1.m502a($r2, i);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ Rect invoke(Integer num) {
        Integer $r2 = num;
        int $i0 = $r2.intValue();
        Rect $r3 = m493a($i0);
        return $r3;
    }
}
