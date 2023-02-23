package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.InterfaceC1572l;
import androidx.lifecycle.o;
import androidx.savedstate.Recreator;
import java.util.Map;
import p201g.p210b.p211a.p213b.C7504b;
/* loaded from: classes2.dex */
public final class SavedStateRegistry {

    /* renamed from: b */
    private Bundle f5653b;

    /* renamed from: c */
    private boolean f5654c;

    /* renamed from: d */
    private Recreator.C1863a f5655d;

    /* renamed from: a */
    private C7504b<String, InterfaceC1866b> f5652a = new C7504b<>();

    /* renamed from: e */
    boolean f5656e = true;

    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC1865a {
        /* renamed from: a */
        void mo34394a(c cVar);
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC1866b {
        Bundle saveState();
    }

    /* renamed from: a */
    public Bundle m34399a(String str) {
        if (this.f5654c) {
            Bundle bundle = this.f5653b;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle(str);
                this.f5653b.remove(str);
                if (this.f5653b.isEmpty()) {
                    this.f5653b = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m34398b(AbstractC1565i abstractC1565i, Bundle bundle) {
        if (!this.f5654c) {
            if (bundle != null) {
                this.f5653b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            abstractC1565i.mo35506a(new InterfaceC1572l() { // from class: androidx.savedstate.SavedStateRegistry.1
                @Override // androidx.lifecycle.InterfaceC1572l
                /* renamed from: m */
                public void mo34271m(o oVar, AbstractC1565i.b bVar) {
                    if (bVar == AbstractC1565i.b.ON_START) {
                        SavedStateRegistry.this.f5656e = true;
                    } else if (bVar == AbstractC1565i.b.ON_STOP) {
                        SavedStateRegistry.this.f5656e = false;
                    }
                }
            });
            this.f5654c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m34397c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f5653b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C7504b<String, InterfaceC1866b>.C7508d m18538f = this.f5652a.m18538f();
        while (m18538f.hasNext()) {
            Map.Entry next = m18538f.next();
            bundle2.putBundle((String) next.getKey(), ((InterfaceC1866b) next.getValue()).saveState());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: d */
    public void m34396d(String str, InterfaceC1866b interfaceC1866b) {
        if (this.f5652a.mo18535l(str, interfaceC1866b) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: e */
    public void m34395e(Class<? extends InterfaceC1865a> cls) {
        if (this.f5656e) {
            if (this.f5655d == null) {
                this.f5655d = new Recreator.C1863a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f5655d.m34400a(cls.getName());
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
}
