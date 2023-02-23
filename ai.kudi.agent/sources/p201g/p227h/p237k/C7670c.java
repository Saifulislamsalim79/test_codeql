package p201g.p227h.p237k;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: ObjectsCompat.java */
/* renamed from: g.h.k.c */
/* loaded from: classes2.dex */
public class C7670c {
    /* renamed from: a */
    public static boolean m17875a(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m17874b(Object... objArr) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash(objArr);
        }
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static String m17873c(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
