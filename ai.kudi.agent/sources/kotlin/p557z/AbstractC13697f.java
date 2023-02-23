package kotlin.p557z;

import java.util.AbstractList;
import java.util.List;
/* compiled from: AbstractMutableList.kt */
/* renamed from: kotlin.z.f */
/* loaded from: classes3.dex */
public abstract class AbstractC13697f<E> extends AbstractList<E> implements List<E>, Object {
    /* renamed from: e */
    public abstract int mo3853e();

    /* renamed from: h */
    public abstract E mo3852h(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return mo3852h(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo3853e();
    }
}
