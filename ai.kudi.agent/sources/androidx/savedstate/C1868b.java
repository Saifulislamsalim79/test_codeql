package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1565i;
/* compiled from: SavedStateRegistryController.java */
/* renamed from: androidx.savedstate.b */
/* loaded from: classes2.dex */
public final class C1868b {

    /* renamed from: a */
    private final c f5658a;

    /* renamed from: b */
    private final SavedStateRegistry f5659b = new SavedStateRegistry();

    private C1868b(c cVar) {
        this.f5658a = cVar;
    }

    /* renamed from: a */
    public static C1868b m34393a(c cVar) {
        return new C1868b(cVar);
    }

    /* renamed from: b */
    public SavedStateRegistry m34392b() {
        return this.f5659b;
    }

    /* renamed from: c */
    public void m34391c(Bundle bundle) {
        AbstractC1565i lifecycle = this.f5658a.getLifecycle();
        if (lifecycle.mo35505b() == AbstractC1565i.c.d) {
            lifecycle.mo35506a(new Recreator(this.f5658a));
            this.f5659b.m34398b(lifecycle, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: d */
    public void m34390d(Bundle bundle) {
        this.f5659b.m34397c(bundle);
    }
}
