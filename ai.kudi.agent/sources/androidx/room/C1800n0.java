package androidx.room;

import android.content.Context;
import androidx.room.AbstractC1802o0;
/* compiled from: Room.java */
/* renamed from: androidx.room.n0 */
/* loaded from: classes2.dex */
public class C1800n0 {
    /* renamed from: a */
    public static <T extends AbstractC1802o0> AbstractC1802o0.C1803a<T> m34493a(Context context, Class<T> cls, String str) {
        if (str != null && str.trim().length() != 0) {
            return new AbstractC1802o0.C1803a<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    /* renamed from: b */
    public static <T, C> T m34492b(Class<C> cls, String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str3 = canonicalName.replace('.', '_') + str;
        try {
            if (name.isEmpty()) {
                str2 = str3;
            } else {
                str2 = name + "." + str3;
            }
            return (T) Class.forName(str2, true, cls.getClassLoader()).newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }
}
