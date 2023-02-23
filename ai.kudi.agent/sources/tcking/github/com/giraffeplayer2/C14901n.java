package tcking.github.com.giraffeplayer2;

import android.os.Build;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: SoInstaller.java */
/* renamed from: tcking.github.com.giraffeplayer2.n */
/* loaded from: classes3.dex */
public class C14901n {

    /* compiled from: SoInstaller.java */
    /* renamed from: tcking.github.com.giraffeplayer2.n$a */
    /* loaded from: classes3.dex */
    private static final class C14902a {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m47b(ClassLoader classLoader, File file) throws Exception {
            C14901n.m52d(C14901n.m51e(classLoader, "pathList").get(classLoader), "nativeLibraryDirectories", new File[]{file});
        }
    }

    /* compiled from: SoInstaller.java */
    /* renamed from: tcking.github.com.giraffeplayer2.n$b */
    /* loaded from: classes3.dex */
    private static final class C14903b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m45b(ClassLoader classLoader, File file) throws Exception {
            Object obj = C14901n.m51e(classLoader, "pathList").get(classLoader);
            List list = (List) C14901n.m51e(obj, "nativeLibraryDirectories").get(obj);
            list.add(0, file);
            Method m50f = C14901n.m50f(obj, "makePathElements", List.class, File.class, List.class);
            ArrayList arrayList = new ArrayList();
            list.addAll((List) C14901n.m51e(obj, "systemNativeLibraryDirectories").get(obj));
            Object[] objArr = {list, null, arrayList};
            Field m51e = C14901n.m51e(obj, "nativeLibraryPathElements");
            m51e.setAccessible(true);
            m51e.set(obj, (Object[]) m50f.invoke(obj, objArr));
        }
    }

    /* compiled from: SoInstaller.java */
    /* renamed from: tcking.github.com.giraffeplayer2.n$c */
    /* loaded from: classes3.dex */
    private static final class C14904c {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m43b(ClassLoader classLoader, File file) throws Exception {
            Object obj = C14901n.m51e(classLoader, "pathList").get(classLoader);
            List list = (List) C14901n.m51e(obj, "nativeLibraryDirectories").get(obj);
            list.add(0, file);
            Method m50f = C14901n.m50f(obj, "makePathElements", List.class);
            list.addAll((List) C14901n.m51e(obj, "systemNativeLibraryDirectories").get(obj));
            Object[] objArr = {list};
            Field m51e = C14901n.m51e(obj, "nativeLibraryPathElements");
            m51e.setAccessible(true);
            m51e.set(obj, (Object[]) m50f.invoke(obj, objArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m52d(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field m51e = m51e(obj, str);
        Object[] objArr2 = (Object[]) m51e.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
        System.arraycopy(objArr2, 0, objArr3, objArr.length, objArr2.length);
        m51e.set(obj, objArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static Field m51e(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static Method m50f(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* renamed from: g */
    public static void m49g(ClassLoader classLoader, File file) throws Exception {
        if (file == null || !file.exists()) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 25) {
            try {
                C14904c.m43b(classLoader, file);
            } catch (Throwable unused) {
                C14903b.m45b(classLoader, file);
            }
        } else if (i >= 23) {
            try {
                C14903b.m45b(classLoader, file);
            } catch (Throwable unused2) {
                C14902a.m47b(classLoader, file);
            }
        } else {
            C14902a.m47b(classLoader, file);
        }
    }
}
