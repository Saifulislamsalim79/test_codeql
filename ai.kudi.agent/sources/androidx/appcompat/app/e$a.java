package androidx.appcompat.app;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
/* compiled from: AppCompatActivity.java */
/* loaded from: classes2.dex */
class e$a implements SavedStateRegistry.InterfaceC1866b {

    /* renamed from: a */
    final /* synthetic */ e f2560a;

    e$a(e eVar) {
        this.f2560a = eVar;
    }

    @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1866b
    public Bundle saveState() {
        Bundle bundle = new Bundle();
        this.f2560a.getDelegate().v(bundle);
        return bundle;
    }
}
