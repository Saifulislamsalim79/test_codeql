package p425j.p444e.p451f0.p467j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: ArrayListSupplier.java */
/* renamed from: j.e.f0.j.b */
/* loaded from: classes3.dex */
public enum EnumC11655b implements Callable<List<Object>>, InterfaceC11291f<Object, List<Object>> {
    INSTANCE;

    /* renamed from: e */
    public static <T> Callable<List<T>> m10661e() {
        return INSTANCE;
    }

    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: b */
    public List<Object> mo10663a(Object obj) throws Exception {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: g */
    public List<Object> call() throws Exception {
        return new ArrayList();
    }
}
