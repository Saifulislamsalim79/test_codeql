package io.intercom.com.bumptech.glide.p412p.p414l;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import io.intercom.com.bumptech.glide.p412p.p414l.InterfaceC10878d;
/* compiled from: DrawableCrossFadeTransition.java */
/* renamed from: io.intercom.com.bumptech.glide.p.l.b */
/* loaded from: classes3.dex */
public class C10875b implements InterfaceC10878d<Drawable> {

    /* renamed from: a */
    private final int f24838a;

    /* renamed from: b */
    private final boolean f24839b;

    public C10875b(int i, boolean z) {
        this.f24838a = i;
        this.f24839b = z;
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p414l.InterfaceC10878d
    /* renamed from: b */
    public boolean mo12048a(Drawable drawable, InterfaceC10878d.InterfaceC10879a interfaceC10879a) {
        Drawable mo12046b = interfaceC10879a.mo12046b();
        if (mo12046b == null) {
            mo12046b = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{mo12046b, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f24839b);
        transitionDrawable.startTransition(this.f24838a);
        interfaceC10879a.mo12047a(transitionDrawable);
        return true;
    }
}
