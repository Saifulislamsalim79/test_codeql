package org.org.org.org.org.core.internal.asm;

import android.view.View;
import android.widget.Space;
import kotlin.p483e0.p485d.Log_OC;
/* renamed from: org.org.org.org.org.core.internal.asm.g */
/* loaded from: classes.dex */
public final class C14672g implements InterfaceC14676x {

    /* renamed from: a */
    public final /* synthetic */ Plot f32669a;

    public C14672g(Plot plot) {
        this.f32669a = plot;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.core.internal.asm.InterfaceC14676x
    /* renamed from: a */
    public boolean mo793a(View view) {
        Log_OC.getArray(view, "view");
        Plot $r2 = this.f32669a;
        boolean $z0 = $r2.m829a(view);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.core.internal.asm.InterfaceC14676x
    public boolean onSaveInstanceState(View view) {
        Log_OC.getArray(view, "view");
        boolean $z0 = view instanceof Space;
        return $z0;
    }
}
