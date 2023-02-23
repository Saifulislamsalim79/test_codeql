package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: LazyStringArrayList.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.l */
/* loaded from: classes3.dex */
public class C13596l extends AbstractList<String> implements RandomAccess, InterfaceC13597m {

    /* renamed from: d */
    public static final InterfaceC13597m f29984d = new C13596l().mo4316q();

    /* renamed from: c */
    private final List<Object> f29985c;

    public C13596l() {
        this.f29985c = new ArrayList();
    }

    /* renamed from: e */
    private static AbstractC13570d m4396e(Object obj) {
        if (obj instanceof AbstractC13570d) {
            return (AbstractC13570d) obj;
        }
        if (obj instanceof String) {
            return AbstractC13570d.m4533l((String) obj);
        }
        return AbstractC13570d.m4535h((byte[]) obj);
    }

    /* renamed from: f */
    private static String m4395f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC13570d) {
            return ((AbstractC13570d) obj).m4539d0();
        }
        return C13588i.m4406b((byte[]) obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13597m
    /* renamed from: M */
    public AbstractC13570d mo4321M(int i) {
        Object obj = this.f29985c.get(i);
        AbstractC13570d m4396e = m4396e(obj);
        if (m4396e != obj) {
            this.f29985c.set(i, m4396e);
        }
        return m4396e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13597m
    /* renamed from: Y */
    public void mo4320Y(AbstractC13570d abstractC13570d) {
        this.f29985c.add(abstractC13570d);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f29985c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d */
    public void add(int i, String str) {
        this.f29985c.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h */
    public String get(int i) {
        Object obj = this.f29985c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC13570d) {
            AbstractC13570d abstractC13570d = (AbstractC13570d) obj;
            String m4539d0 = abstractC13570d.m4539d0();
            if (abstractC13570d.mo4373F()) {
                this.f29985c.set(i, m4539d0);
            }
            return m4539d0;
        }
        byte[] bArr = (byte[]) obj;
        String m4406b = C13588i.m4406b(bArr);
        if (C13588i.m4407a(bArr)) {
            this.f29985c.set(i, m4406b);
        }
        return m4406b;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k */
    public String remove(int i) {
        Object remove = this.f29985c.remove(i);
        ((AbstractList) this).modCount++;
        return m4395f(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: l */
    public String set(int i, String str) {
        return m4395f(this.f29985c.set(i, str));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13597m
    /* renamed from: p */
    public List<?> mo4317p() {
        return Collections.unmodifiableList(this.f29985c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13597m
    /* renamed from: q */
    public InterfaceC13597m mo4316q() {
        return new C13620u(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f29985c.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof InterfaceC13597m) {
            collection = ((InterfaceC13597m) collection).mo4317p();
        }
        boolean addAll = this.f29985c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public C13596l(InterfaceC13597m interfaceC13597m) {
        this.f29985c = new ArrayList(interfaceC13597m.size());
        addAll(interfaceC13597m);
    }
}
