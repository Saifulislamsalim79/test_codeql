package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: LazyStringArrayList.java */
/* renamed from: com.google.protobuf.f0 */
/* loaded from: classes2.dex */
public class C7028f0 extends AbstractC7011c<String> implements InterfaceC7031g0, RandomAccess {

    /* renamed from: e */
    private static final C7028f0 f16803e;

    /* renamed from: d */
    private final List<Object> f16804d;

    static {
        C7028f0 c7028f0 = new C7028f0();
        f16803e = c7028f0;
        c7028f0.mo20220y();
    }

    public C7028f0() {
        this(10);
    }

    /* renamed from: f */
    private static String m20132f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC7039i) {
            return ((AbstractC7039i) obj).m20098d0();
        }
        return C6997a0.m20226j((byte[]) obj);
    }

    @Override // com.google.protobuf.InterfaceC7031g0
    /* renamed from: A */
    public void mo19731A(AbstractC7039i abstractC7039i) {
        m20221d();
        this.f16804d.add(abstractC7039i);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.InterfaceC7031g0
    /* renamed from: U */
    public Object mo19730U(int i) {
        return this.f16804d.get(i);
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m20221d();
        this.f16804d.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public void add(int i, String str) {
        m20221d();
        this.f16804d.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h */
    public String get(int i) {
        Object obj = this.f16804d.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC7039i) {
            AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
            String m20098d0 = abstractC7039i.m20098d0();
            if (abstractC7039i.mo19324E()) {
                this.f16804d.set(i, m20098d0);
            }
            return m20098d0;
        }
        byte[] bArr = (byte[]) obj;
        String m20226j = C6997a0.m20226j(bArr);
        if (C6997a0.m20229g(bArr)) {
            this.f16804d.set(i, m20226j);
        }
        return m20226j;
    }

    @Override // com.google.protobuf.C6997a0.InterfaceC7006i
    /* renamed from: k */
    public C7028f0 mo19330j(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f16804d);
            return new C7028f0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.List
    /* renamed from: l */
    public String remove(int i) {
        m20221d();
        Object remove = this.f16804d.remove(i);
        ((AbstractList) this).modCount++;
        return m20132f(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m */
    public String set(int i, String str) {
        m20221d();
        return m20132f(this.f16804d.set(i, str));
    }

    @Override // com.google.protobuf.InterfaceC7031g0
    /* renamed from: p */
    public List<?> mo19727p() {
        return Collections.unmodifiableList(this.f16804d);
    }

    @Override // com.google.protobuf.InterfaceC7031g0
    /* renamed from: q */
    public InterfaceC7031g0 mo19726q() {
        return mo20222c0() ? new C7095q1(this) : this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f16804d.size();
    }

    public C7028f0(int i) {
        this(new ArrayList(i));
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        m20221d();
        if (collection instanceof InterfaceC7031g0) {
            collection = ((InterfaceC7031g0) collection).mo19727p();
        }
        boolean addAll = this.f16804d.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    private C7028f0(ArrayList<Object> arrayList) {
        this.f16804d = arrayList;
    }
}
