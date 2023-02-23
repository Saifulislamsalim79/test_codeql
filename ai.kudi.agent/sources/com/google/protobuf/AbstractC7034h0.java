package com.google.protobuf;

import com.google.protobuf.C6997a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListFieldSchema.java */
/* renamed from: com.google.protobuf.h0 */
/* loaded from: classes2.dex */
public abstract class AbstractC7034h0 {

    /* renamed from: a */
    private static final AbstractC7034h0 f16812a = new C7036b();

    /* renamed from: b */
    private static final AbstractC7034h0 f16813b = new C7037c();

    /* compiled from: ListFieldSchema.java */
    /* renamed from: com.google.protobuf.h0$b */
    /* loaded from: classes2.dex */
    private static final class C7036b extends AbstractC7034h0 {

        /* renamed from: c */
        private static final Class<?> f16814c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private C7036b() {
            super();
        }

        /* renamed from: f */
        static <E> List<E> m20109f(Object obj, long j) {
            return (List) C7102r1.m19700G(obj, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        private static <L> List<L> m20108g(Object obj, long j, int i) {
            C7028f0 c7028f0;
            List<L> arrayList;
            List<L> m20109f = m20109f(obj, j);
            if (m20109f.isEmpty()) {
                if (m20109f instanceof InterfaceC7031g0) {
                    arrayList = new C7028f0(i);
                } else if ((m20109f instanceof InterfaceC7010b1) && (m20109f instanceof C6997a0.InterfaceC7006i)) {
                    arrayList = ((C6997a0.InterfaceC7006i) m20109f).mo19330j(i);
                } else {
                    arrayList = new ArrayList<>(i);
                }
                C7102r1.m19685V(obj, j, arrayList);
                return arrayList;
            }
            if (f16814c.isAssignableFrom(m20109f.getClass())) {
                ArrayList arrayList2 = new ArrayList(m20109f.size() + i);
                arrayList2.addAll(m20109f);
                C7102r1.m19685V(obj, j, arrayList2);
                c7028f0 = arrayList2;
            } else if (m20109f instanceof C7095q1) {
                C7028f0 c7028f02 = new C7028f0(m20109f.size() + i);
                c7028f02.addAll((C7095q1) m20109f);
                C7102r1.m19685V(obj, j, c7028f02);
                c7028f0 = c7028f02;
            } else if ((m20109f instanceof InterfaceC7010b1) && (m20109f instanceof C6997a0.InterfaceC7006i)) {
                C6997a0.InterfaceC7006i interfaceC7006i = (C6997a0.InterfaceC7006i) m20109f;
                if (interfaceC7006i.mo20222c0()) {
                    return m20109f;
                }
                C6997a0.InterfaceC7006i mo19330j = interfaceC7006i.mo19330j(m20109f.size() + i);
                C7102r1.m19685V(obj, j, mo19330j);
                return mo19330j;
            } else {
                return m20109f;
            }
            return c7028f0;
        }

        @Override // com.google.protobuf.AbstractC7034h0
        /* renamed from: c */
        void mo20107c(Object obj, long j) {
            Object unmodifiableList;
            List list = (List) C7102r1.m19700G(obj, j);
            if (list instanceof InterfaceC7031g0) {
                unmodifiableList = ((InterfaceC7031g0) list).mo19726q();
            } else if (f16814c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof InterfaceC7010b1) && (list instanceof C6997a0.InterfaceC7006i)) {
                    C6997a0.InterfaceC7006i interfaceC7006i = (C6997a0.InterfaceC7006i) list;
                    if (interfaceC7006i.mo20222c0()) {
                        interfaceC7006i.mo20220y();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            C7102r1.m19685V(obj, j, unmodifiableList);
        }

        @Override // com.google.protobuf.AbstractC7034h0
        /* renamed from: d */
        <E> void mo20106d(Object obj, Object obj2, long j) {
            List m20109f = m20109f(obj2, j);
            List m20108g = m20108g(obj, j, m20109f.size());
            int size = m20108g.size();
            int size2 = m20109f.size();
            if (size > 0 && size2 > 0) {
                m20108g.addAll(m20109f);
            }
            if (size > 0) {
                m20109f = m20108g;
            }
            C7102r1.m19685V(obj, j, m20109f);
        }

        @Override // com.google.protobuf.AbstractC7034h0
        /* renamed from: e */
        <L> List<L> mo20105e(Object obj, long j) {
            return m20108g(obj, j, 10);
        }
    }

    /* compiled from: ListFieldSchema.java */
    /* renamed from: com.google.protobuf.h0$c */
    /* loaded from: classes2.dex */
    private static final class C7037c extends AbstractC7034h0 {
        private C7037c() {
            super();
        }

        /* renamed from: f */
        static <E> C6997a0.InterfaceC7006i<E> m20104f(Object obj, long j) {
            return (C6997a0.InterfaceC7006i) C7102r1.m19700G(obj, j);
        }

        @Override // com.google.protobuf.AbstractC7034h0
        /* renamed from: c */
        void mo20107c(Object obj, long j) {
            m20104f(obj, j).mo20220y();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        @Override // com.google.protobuf.AbstractC7034h0
        /* renamed from: d */
        <E> void mo20106d(Object obj, Object obj2, long j) {
            C6997a0.InterfaceC7006i<E> m20104f = m20104f(obj, j);
            C6997a0.InterfaceC7006i<E> m20104f2 = m20104f(obj2, j);
            int size = m20104f.size();
            int size2 = m20104f2.size();
            C6997a0.InterfaceC7006i<E> interfaceC7006i = m20104f;
            interfaceC7006i = m20104f;
            if (size > 0 && size2 > 0) {
                boolean mo20222c0 = m20104f.mo20222c0();
                C6997a0.InterfaceC7006i<E> interfaceC7006i2 = m20104f;
                if (!mo20222c0) {
                    interfaceC7006i2 = m20104f.mo19330j(size2 + size);
                }
                interfaceC7006i2.addAll(m20104f2);
                interfaceC7006i = interfaceC7006i2;
            }
            if (size > 0) {
                m20104f2 = interfaceC7006i;
            }
            C7102r1.m19685V(obj, j, m20104f2);
        }

        @Override // com.google.protobuf.AbstractC7034h0
        /* renamed from: e */
        <L> List<L> mo20105e(Object obj, long j) {
            C6997a0.InterfaceC7006i m20104f = m20104f(obj, j);
            if (m20104f.mo20222c0()) {
                return m20104f;
            }
            int size = m20104f.size();
            C6997a0.InterfaceC7006i mo19330j = m20104f.mo19330j(size == 0 ? 10 : size * 2);
            C7102r1.m19685V(obj, j, mo19330j);
            return mo19330j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC7034h0 m20111a() {
        return f16812a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC7034h0 m20110b() {
        return f16813b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo20107c(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract <L> void mo20106d(Object obj, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract <L> List<L> mo20105e(Object obj, long j);

    private AbstractC7034h0() {
    }
}
