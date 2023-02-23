package org.org.org.org.org.initializer;

import e.a.a.a.a.b.a;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import org.org.org.org.android.util.C14559f;
import org.org.org.org.android.util.common.C14554f;
import org.org.org.org.android.util.common.C14555i;
import org.org.org.org.android.util.common.net.Attribute;
import org.org.org.org.android.util.common.net.C14557h;
/* loaded from: classes.dex */
public final class Button extends AbstractC11802m implements InterfaceC11756a<a> {

    /* renamed from: b */
    public static final Button f32767b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Button $r0 = new Button();
        f32767b = $r0;
    }

    public Button() {
        super(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final C14559f m683a() {
        C14708f $r2 = C14708f.f32807a;
        org.org.org.org.org.common.Logger $r3 = $r2.m649e();
        C14555i $r4 = $r2.m646g();
        Attribute $r5 = $r2.getTitle();
        C14557h $r6 = $r2.getVisibleItems();
        C14554f $r7 = $r2.clear();
        C14559f $r1 = new C14559f($r3, $r4, $r5, $r6, $r7);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ a invoke() {
        C14559f $r1 = m683a();
        return $r1;
    }
}
