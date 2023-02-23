package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1565i;
import androidx.savedstate.SavedStateRegistry;
/* loaded from: classes2.dex */
final class SavedStateHandleController implements InterfaceC1572l {

    /* renamed from: c */
    private final String f4724c;

    /* renamed from: d */
    private boolean f4725d = false;

    /* renamed from: e */
    private final C1545b0 f4726e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    /* loaded from: classes2.dex */
    public static final class C1536a implements SavedStateRegistry.InterfaceC1865a {
        C1536a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1865a
        /* renamed from: a */
        public void mo34394a(androidx.savedstate.c cVar) {
            if (cVar instanceof j0) {
                C1566i0 viewModelStore = ((j0) cVar).getViewModelStore();
                SavedStateRegistry savedStateRegistry = cVar.getSavedStateRegistry();
                for (String str : viewModelStore.m35515c()) {
                    SavedStateHandleController.m35574a(viewModelStore.m35516b(str), savedStateRegistry, cVar.getLifecycle());
                }
                if (viewModelStore.m35515c().isEmpty()) {
                    return;
                }
                savedStateRegistry.m34395e(C1536a.class);
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    SavedStateHandleController(String str, C1545b0 c1545b0) {
        this.f4724c = str;
        this.f4726e = c1545b0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m35574a(d0 d0Var, SavedStateRegistry savedStateRegistry, AbstractC1565i abstractC1565i) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) d0Var.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.m35570f()) {
            return;
        }
        savedStateHandleController.m35573b(savedStateRegistry, abstractC1565i);
        m35569h(savedStateRegistry, abstractC1565i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static SavedStateHandleController m35572d(SavedStateRegistry savedStateRegistry, AbstractC1565i abstractC1565i, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C1545b0.m35551a(savedStateRegistry.m34399a(str), bundle));
        savedStateHandleController.m35573b(savedStateRegistry, abstractC1565i);
        m35569h(savedStateRegistry, abstractC1565i);
        return savedStateHandleController;
    }

    /* renamed from: h */
    private static void m35569h(final SavedStateRegistry savedStateRegistry, final AbstractC1565i abstractC1565i) {
        AbstractC1565i.c mo35505b = abstractC1565i.mo35505b();
        if (mo35505b != AbstractC1565i.c.d && !mo35505b.a(AbstractC1565i.c.f)) {
            abstractC1565i.mo35506a(new InterfaceC1572l() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.InterfaceC1572l
                /* renamed from: m */
                public void mo34271m(o oVar, AbstractC1565i.b bVar) {
                    if (bVar == AbstractC1565i.b.ON_START) {
                        AbstractC1565i.this.mo35504c(this);
                        savedStateRegistry.m34395e(C1536a.class);
                    }
                }
            });
        } else {
            savedStateRegistry.m34395e(C1536a.class);
        }
    }

    /* renamed from: b */
    void m35573b(SavedStateRegistry savedStateRegistry, AbstractC1565i abstractC1565i) {
        if (!this.f4725d) {
            this.f4725d = true;
            abstractC1565i.mo35506a(this);
            savedStateRegistry.m34396d(this.f4724c, this.f4726e.m35550b());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C1545b0 m35571e() {
        return this.f4726e;
    }

    /* renamed from: f */
    boolean m35570f() {
        return this.f4725d;
    }

    @Override // androidx.lifecycle.InterfaceC1572l
    /* renamed from: m */
    public void mo34271m(o oVar, AbstractC1565i.b bVar) {
        if (bVar == AbstractC1565i.b.ON_DESTROY) {
            this.f4725d = false;
            oVar.getLifecycle().mo35504c(this);
        }
    }
}
