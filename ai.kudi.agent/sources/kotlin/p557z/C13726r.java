package kotlin.p557z;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p491i0.C11837e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Collections.kt */
/* renamed from: kotlin.z.r */
/* loaded from: classes3.dex */
public class C13726r extends C13724q {
    /* renamed from: c */
    public static <T> ArrayList<T> m3893c(T... tArr) {
        l.f(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new C13701h(tArr, true));
    }

    /* renamed from: d */
    public static final <T> Collection<T> m3892d(T[] tArr) {
        l.f(tArr, "$this$asCollection");
        return new C13701h(tArr, false);
    }

    /* renamed from: e */
    public static <T> List<T> m3891e() {
        return C13674b0.f30124c;
    }

    /* renamed from: f */
    public static C11837e m3890f(Collection<?> collection) {
        l.f(collection, "$this$indices");
        return new C11837e(0, collection.size() - 1);
    }

    /* renamed from: g */
    public static <T> int m3889g(List<? extends T> list) {
        l.f(list, "$this$lastIndex");
        return list.size() - 1;
    }

    /* renamed from: h */
    public static <T> List<T> m3888h(T... tArr) {
        List<T> m3891e;
        List<T> m4067d;
        l.f(tArr, "elements");
        if (tArr.length > 0) {
            m4067d = C13712m.m4067d(tArr);
            return m4067d;
        }
        m3891e = m3891e();
        return m3891e;
    }

    /* renamed from: i */
    public static <T> List<T> m3887i(T t) {
        List<T> m3891e;
        List<T> m3901b;
        if (t != null) {
            m3901b = C13724q.m3901b(t);
            return m3901b;
        }
        m3891e = m3891e();
        return m3891e;
    }

    /* renamed from: j */
    public static <T> List<T> m3886j(T... tArr) {
        List<T> m4004u;
        l.f(tArr, "elements");
        m4004u = C13715n.m4004u(tArr);
        return m4004u;
    }

    /* renamed from: k */
    public static <T> List<T> m3885k(T... tArr) {
        l.f(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C13701h(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public static <T> List<T> m3884l(List<? extends T> list) {
        List<T> m3891e;
        List<T> m3901b;
        l.f(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        if (size == 0) {
            m3891e = m3891e();
            return m3891e;
        } else if (size != 1) {
            return list;
        } else {
            m3901b = C13724q.m3901b(list.get(0));
            return m3901b;
        }
    }

    /* renamed from: m */
    public static void m3883m() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: n */
    public static void m3882n() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
