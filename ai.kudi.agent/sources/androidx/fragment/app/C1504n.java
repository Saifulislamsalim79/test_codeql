package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p201g.p218e.C7534g;
/* compiled from: FragmentFactory.java */
/* renamed from: androidx.fragment.app.n */
/* loaded from: classes2.dex */
public class C1504n {

    /* renamed from: a */
    private static final C7534g<ClassLoader, C7534g<String, Class<?>>> f4621a = new C7534g<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m35683b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m35682c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m35682c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C7534g<String, Class<?>> c7534g = f4621a.get(classLoader);
        if (c7534g == null) {
            c7534g = new C7534g<>();
            f4621a.put(classLoader, c7534g);
        }
        Class<?> cls = c7534g.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            c7534g.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m35681d(ClassLoader classLoader, String str) {
        try {
            return m35682c(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    /* renamed from: a */
    public Fragment mo35684a(ClassLoader classLoader, String str) {
        throw null;
    }
}
