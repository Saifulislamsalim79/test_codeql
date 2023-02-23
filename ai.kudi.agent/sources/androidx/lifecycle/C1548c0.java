package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C1556g0;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
/* compiled from: SavedStateViewModelFactory.java */
/* renamed from: androidx.lifecycle.c0 */
/* loaded from: classes2.dex */
public final class C1548c0 extends C1556g0.AbstractC1560c {

    /* renamed from: f */
    private static final Class<?>[] f4749f = {Application.class, C1545b0.class};

    /* renamed from: g */
    private static final Class<?>[] f4750g = {C1545b0.class};

    /* renamed from: a */
    private final Application f4751a;

    /* renamed from: b */
    private final C1556g0.InterfaceC1559b f4752b;

    /* renamed from: c */
    private final Bundle f4753c;

    /* renamed from: d */
    private final AbstractC1565i f4754d;

    /* renamed from: e */
    private final SavedStateRegistry f4755e;

    public C1548c0(Application application, androidx.savedstate.c cVar, Bundle bundle) {
        C1556g0.InterfaceC1559b m35523c;
        this.f4755e = cVar.getSavedStateRegistry();
        this.f4754d = cVar.getLifecycle();
        this.f4753c = bundle;
        this.f4751a = application;
        if (application != null) {
            m35523c = C1556g0.C1557a.m35529f(application);
        } else {
            m35523c = C1556g0.C1561d.m35523c();
        }
        this.f4752b = m35523c;
    }

    /* renamed from: c */
    private static <T> Constructor<T> m35547c(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            if (Arrays.equals(clsArr, constructor2.getParameterTypes())) {
                return constructor2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.lifecycle.C1556g0.C1563e
    /* renamed from: a */
    public void mo35521a(d0 d0Var) {
        SavedStateHandleController.m35574a(d0Var, this.f4755e, this.f4754d);
    }

    @Override // androidx.lifecycle.C1556g0.AbstractC1560c
    /* renamed from: b */
    public <T extends d0> T mo35526b(String str, Class<T> cls) {
        Constructor m35547c;
        T t;
        boolean isAssignableFrom = C1538a.class.isAssignableFrom(cls);
        if (isAssignableFrom && this.f4751a != null) {
            m35547c = m35547c(cls, f4749f);
        } else {
            m35547c = m35547c(cls, f4750g);
        }
        if (m35547c == null) {
            return (T) this.f4752b.create(cls);
        }
        SavedStateHandleController m35572d = SavedStateHandleController.m35572d(this.f4755e, this.f4754d, str, this.f4753c);
        if (isAssignableFrom) {
            try {
                if (this.f4751a != null) {
                    t = (T) m35547c.newInstance(this.f4751a, m35572d.m35571e());
                    t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", m35572d);
                    return t;
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to access " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
            }
        }
        t = (T) m35547c.newInstance(m35572d.m35571e());
        t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", m35572d);
        return t;
    }

    @Override // androidx.lifecycle.C1556g0.AbstractC1560c, androidx.lifecycle.C1556g0.InterfaceC1559b
    public <T extends d0> T create(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) mo35526b(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
