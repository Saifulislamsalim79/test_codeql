package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.h */
/* loaded from: classes2.dex */
public final class C3198h extends AbstractC3590vn<String> implements RandomAccess, InterfaceC3225i {

    /* renamed from: e */
    private static final C3198h f8521e;

    /* renamed from: d */
    private final List<Object> f8522d;

    static {
        C3198h c3198h = new C3198h(10);
        f8521e = c3198h;
        c3198h.zzb();
    }

    public C3198h() {
        this(10);
    }

    /* renamed from: f */
    private static String m31088f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC3223ho) {
            return ((AbstractC3223ho) obj).m31018X(C3117e.f8412a);
        }
        return C3117e.m31218h((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3225i
    /* renamed from: a */
    public final InterfaceC3225i mo31007a() {
        return mo30107c() ? new C3119e1(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        m30106d();
        this.f8522d.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        m30106d();
        if (collection instanceof InterfaceC3225i) {
            collection = ((InterfaceC3225i) collection).mo31006b();
        }
        boolean addAll = this.f8522d.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3225i
    /* renamed from: b */
    public final List<?> mo31006b() {
        return Collections.unmodifiableList(this.f8522d);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m30106d();
        this.f8522d.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public final String get(int i) {
        Object obj = this.f8522d.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC3223ho) {
            AbstractC3223ho abstractC3223ho = (AbstractC3223ho) obj;
            String m31018X = abstractC3223ho.m31018X(C3117e.f8412a);
            if (abstractC3223ho.mo31025E()) {
                this.f8522d.set(i, m31018X);
            }
            return m31018X;
        }
        byte[] bArr = (byte[]) obj;
        String m31218h = C3117e.m31218h(bArr);
        if (C3117e.m31217i(bArr)) {
            this.f8522d.set(i, m31218h);
        }
        return m31218h;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3090d
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ InterfaceC3090d mo29876i(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f8522d);
            return new C3198h(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3225i
    /* renamed from: n */
    public final Object mo31005n(int i) {
        return this.f8522d.get(i);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m30106d();
        Object remove = this.f8522d.remove(i);
        ((AbstractList) this).modCount++;
        return m31088f(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        m30106d();
        return m31088f(this.f8522d.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8522d.size();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3225i
    /* renamed from: w */
    public final void mo31004w(AbstractC3223ho abstractC3223ho) {
        m30106d();
        this.f8522d.add(abstractC3223ho);
        ((AbstractList) this).modCount++;
    }

    public C3198h(int i) {
        this.f8522d = new ArrayList(i);
    }

    private C3198h(ArrayList<Object> arrayList) {
        this.f8522d = arrayList;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
