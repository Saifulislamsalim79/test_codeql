package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.InterfaceC1572l;
import androidx.lifecycle.o;
import java.lang.reflect.Field;
/* loaded from: classes2.dex */
final class ImmLeaksCleaner implements InterfaceC1572l {

    /* renamed from: d */
    private static int f2372d;

    /* renamed from: e */
    private static Field f2373e;

    /* renamed from: f */
    private static Field f2374f;

    /* renamed from: w */
    private static Field f2375w;

    /* renamed from: c */
    private Activity f2376c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmLeaksCleaner(Activity activity) {
        this.f2376c = activity;
    }

    /* renamed from: a */
    private static void m37881a() {
        try {
            f2372d = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f2374f = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f2375w = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f2373e = declaredField3;
            declaredField3.setAccessible(true);
            f2372d = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.InterfaceC1572l
    /* renamed from: m */
    public void mo34271m(o oVar, AbstractC1565i.b bVar) {
        if (bVar != AbstractC1565i.b.ON_DESTROY) {
            return;
        }
        if (f2372d == 0) {
            m37881a();
        }
        if (f2372d == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f2376c.getSystemService("input_method");
            try {
                Object obj = f2373e.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f2374f.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f2375w.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
