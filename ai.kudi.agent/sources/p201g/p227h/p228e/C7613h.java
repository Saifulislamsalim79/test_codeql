package p201g.p227h.p228e;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: TypefaceCompatApi28Impl.java */
/* renamed from: g.h.e.h */
/* loaded from: classes2.dex */
public class C7613h extends C7612g {
    @Override // p201g.p227h.p228e.C7612g
    /* renamed from: l */
    protected Typeface mo18016l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f18293g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f18299m.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p201g.p227h.p228e.C7612g
    /* renamed from: x */
    protected Method mo18015x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
