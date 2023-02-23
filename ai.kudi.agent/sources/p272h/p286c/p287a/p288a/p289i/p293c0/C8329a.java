package p272h.p286c.p287a.p288a.p289i.p293c0;

import android.util.SparseArray;
import java.util.HashMap;
import p272h.p286c.p287a.p288a.EnumC8238d;
/* compiled from: PriorityMapping.java */
/* renamed from: h.c.a.a.i.c0.a */
/* loaded from: classes2.dex */
public final class C8329a {

    /* renamed from: a */
    private static SparseArray<EnumC8238d> f19963a = new SparseArray<>();

    /* renamed from: b */
    private static HashMap<EnumC8238d, Integer> f19964b;

    static {
        HashMap<EnumC8238d, Integer> hashMap = new HashMap<>();
        f19964b = hashMap;
        hashMap.put(EnumC8238d.DEFAULT, 0);
        f19964b.put(EnumC8238d.VERY_LOW, 1);
        f19964b.put(EnumC8238d.HIGHEST, 2);
        for (EnumC8238d enumC8238d : f19964b.keySet()) {
            f19963a.append(f19964b.get(enumC8238d).intValue(), enumC8238d);
        }
    }

    /* renamed from: a */
    public static int m16294a(EnumC8238d enumC8238d) {
        Integer num = f19964b.get(enumC8238d);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC8238d);
    }

    /* renamed from: b */
    public static EnumC8238d m16293b(int i) {
        EnumC8238d enumC8238d = f19963a.get(i);
        if (enumC8238d != null) {
            return enumC8238d;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
