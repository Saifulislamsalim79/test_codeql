package com.google.common.collect;

import com.google.common.base.InterfaceC5039g;
import java.util.Comparator;
/* compiled from: Ordering.java */
/* renamed from: com.google.common.collect.s */
/* loaded from: classes2.dex */
public abstract class AbstractC5125s<T> implements Comparator<T> {
    /* renamed from: a */
    public static <T> AbstractC5125s<T> m25579a(Comparator<T> comparator) {
        if (comparator instanceof AbstractC5125s) {
            return (AbstractC5125s) comparator;
        }
        return new C5070f(comparator);
    }

    /* renamed from: b */
    public <F> AbstractC5125s<F> m25578b(InterfaceC5039g<F, ? extends T> interfaceC5039g) {
        return new C5067c(interfaceC5039g, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);
}
