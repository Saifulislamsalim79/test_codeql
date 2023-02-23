package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.InterfaceC1572l;
import androidx.lifecycle.o;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Recreator implements InterfaceC1572l {

    /* renamed from: c */
    private final c f5650c;

    /* renamed from: androidx.savedstate.Recreator$a */
    /* loaded from: classes2.dex */
    static final class C1863a implements SavedStateRegistry.InterfaceC1866b {

        /* renamed from: a */
        final Set<String> f5651a = new HashSet();

        /* JADX INFO: Access modifiers changed from: package-private */
        public C1863a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.m34396d("androidx.savedstate.Restarter", this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m34400a(String str) {
            this.f5651a.add(str);
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1866b
        public Bundle saveState() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f5651a));
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Recreator(c cVar) {
        this.f5650c = cVar;
    }

    /* renamed from: a */
    private void m34401a(String str) {
        Class cls;
        try {
            try {
                Constructor declaredConstructor = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.InterfaceC1865a.class).getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.InterfaceC1865a) declaredConstructor.newInstance(new Object[0])).mo34394a(this.f5650c);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1572l
    /* renamed from: m */
    public void mo34271m(o oVar, AbstractC1565i.b bVar) {
        if (bVar == AbstractC1565i.b.ON_CREATE) {
            oVar.getLifecycle().mo35504c(this);
            Bundle m34399a = this.f5650c.getSavedStateRegistry().m34399a("androidx.savedstate.Restarter");
            if (m34399a == null) {
                return;
            }
            ArrayList<String> stringArrayList = m34399a.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    m34401a(it.next());
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
