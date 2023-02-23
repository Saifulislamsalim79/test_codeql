package org.org.org.org.org.data;

import a.a.a.w;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.asm.Number;
import lombok.org.libs.org.objectweb.tree.C14335c;
@f(c = "com.smartlook.sdk.smartlook.core.configuration.ConfigurationHandler$fetchConfigFromServer$1", f = "ConfigurationHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: org.org.org.org.org.data.e */
/* loaded from: classes.dex */
public final class C14698e extends AbstractC11745k implements InterfaceC11771p<w, InterfaceC11714d<? super C13666w>, Object> {

    /* renamed from: c */
    public final /* synthetic */ Label f32742c;

    /* renamed from: g */
    public final /* synthetic */ String f32743g;

    /* renamed from: h */
    public final /* synthetic */ String f32744h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14698e(Label label, String str, String str2, InterfaceC11714d interfaceC11714d) {
        super(2, interfaceC11714d);
        this.f32742c = label;
        this.f32744h = str;
        this.f32743g = str2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public final InterfaceC11714d create(Object obj, InterfaceC11714d interfaceC11714d) {
        Log_OC.getArray(interfaceC11714d, "completion");
        Label $r2 = this.f32742c;
        String $r3 = this.f32744h;
        String $r4 = this.f32743g;
        InterfaceC11714d r8 = new C14698e($r2, $r3, $r4, interfaceC11714d);
        Number number = (Number) obj;
        InterfaceC11714d $r1 = r8;
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public final Object invoke(w wVar, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        InterfaceC11714d<? super C13666w> $r3 = interfaceC11714d;
        C14698e $r0 = (C14698e) create(wVar, $r3);
        C13666w $r4 = C13666w.f30112a;
        Object $r1 = $r0.invokeSuspend($r4);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public final Object invokeSuspend(Object obj) {
        C11734d.m10387d();
        C13291q.m5357b(obj);
        Label $r4 = this.f32742c;
        C14335c $r5 = $r4.f32725f;
        Label $r42 = this.f32742c;
        String $r6 = $r42.getText();
        String $r1 = this.f32744h;
        a$b$a $r2 = new a$b$a(this);
        $r5.m2090a($r6, $r1, $r2);
        Label $r43 = this.f32742c;
        AtomicBoolean $r7 = $r43.f32727i;
        $r7.set(false);
        C13666w r8 = C13666w.f30112a;
        return r8;
    }
}
