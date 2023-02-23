package org.org.org.org.org.initializer;

import e.a.a.a.c.o.a;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import org.org.org.org.android.util.C14559f;
import org.org.org.org.org.core.Buffer;
import org.org.org.org.org.core.internal.asm.C14671f;
import org.org.org.org.org.data.Label;
import org.org.org.org.org.menu.C14711c;
import org.org.org.org.org.menu.C14714h;
/* loaded from: classes.dex */
public final class a$e0 extends AbstractC11802m implements InterfaceC11756a<a> {

    /* renamed from: b */
    public static final a$e0 f32782b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        a$e0 $r0 = new a$e0();
        f32782b = $r0;
    }

    public a$e0() {
        super(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Buffer getView() {
        C14708f $r2 = C14708f.f32807a;
        C14714h $r3 = $r2.m655a();
        C14711c $r4 = $r2.getIcon();
        C14671f $r5 = $r2.m648f();
        Label $r6 = $r2.size();
        C14559f $r7 = $r2.getValue();
        Buffer $r1 = new Buffer($r3, $r4, $r5, $r6, $r7);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ a invoke() {
        Buffer $r1 = getView();
        return $r1;
    }
}
