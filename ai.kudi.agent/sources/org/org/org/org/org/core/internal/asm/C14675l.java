package org.org.org.org.org.core.internal.asm;

import android.view.View;
import android.widget.Space;
import kotlin.p483e0.p485d.Log_OC;
/* renamed from: org.org.org.org.org.core.internal.asm.l */
/* loaded from: classes.dex */
public final class C14675l implements InterfaceC14676x {

    /* renamed from: e */
    public final /* synthetic */ C14673h f32677e;

    public C14675l(C14673h c14673h) {
        this.f32677e = c14673h;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.core.internal.asm.InterfaceC14676x
    /* renamed from: a */
    public boolean mo793a(View view) {
        Log_OC.getArray(view, "view");
        C14673h $r2 = this.f32677e;
        boolean $z0 = $r2.m804a(view);
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
