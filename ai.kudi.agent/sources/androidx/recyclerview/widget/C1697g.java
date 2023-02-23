package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;
/* compiled from: ConcatAdapter.java */
/* renamed from: androidx.recyclerview.widget.g */
/* loaded from: classes2.dex */
public final class C1697g extends RecyclerView.AbstractC1623h<RecyclerView.AbstractC1620e0> {

    /* renamed from: a */
    private final C1700h f5194a;

    /* compiled from: ConcatAdapter.java */
    /* renamed from: androidx.recyclerview.widget.g$a */
    /* loaded from: classes2.dex */
    public static final class C1698a {

        /* renamed from: c */
        public static final C1698a f5195c = new C1698a(true, EnumC1699a.NO_STABLE_IDS);

        /* renamed from: a */
        public final boolean f5196a;

        /* renamed from: b */
        public final EnumC1699a f5197b;

        /* compiled from: ConcatAdapter.java */
        /* renamed from: androidx.recyclerview.widget.g$a$a */
        /* loaded from: classes2.dex */
        public enum EnumC1699a {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        C1698a(boolean z, EnumC1699a enumC1699a) {
            this.f5196a = z;
            this.f5197b = enumC1699a;
        }
    }

    @SafeVarargs
    public C1697g(RecyclerView.AbstractC1623h<? extends RecyclerView.AbstractC1620e0>... abstractC1623hArr) {
        this(C1698a.f5195c, abstractC1623hArr);
    }

    /* renamed from: a */
    public boolean m34771a(RecyclerView.AbstractC1623h<? extends RecyclerView.AbstractC1620e0> abstractC1623h) {
        return this.f5194a.m34764h(abstractC1623h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m34770b(RecyclerView.AbstractC1623h.EnumC1624a enumC1624a) {
        super.setStateRestorationPolicy(enumC1624a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int findRelativeAdapterPositionIn(RecyclerView.AbstractC1623h<? extends RecyclerView.AbstractC1620e0> abstractC1623h, RecyclerView.AbstractC1620e0 abstractC1620e0, int i) {
        return this.f5194a.m34756p(abstractC1623h, abstractC1620e0, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        return this.f5194a.m34755q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public long getItemId(int i) {
        return this.f5194a.m34758n(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemViewType(int i) {
        return this.f5194a.m34757o(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f5194a.m34750v(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public void onBindViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, int i) {
        this.f5194a.m34749w(abstractC1620e0, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public RecyclerView.AbstractC1620e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f5194a.m34748x(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f5194a.m34747y(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public boolean onFailedToRecycleView(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        return this.f5194a.m34746z(abstractC1620e0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public void onViewAttachedToWindow(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        this.f5194a.m34769A(abstractC1620e0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public void onViewDetachedFromWindow(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        this.f5194a.m34768B(abstractC1620e0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public void onViewRecycled(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        this.f5194a.m34767C(abstractC1620e0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public void setStateRestorationPolicy(RecyclerView.AbstractC1623h.EnumC1624a enumC1624a) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    @SafeVarargs
    public C1697g(C1698a c1698a, RecyclerView.AbstractC1623h<? extends RecyclerView.AbstractC1620e0>... abstractC1623hArr) {
        this(c1698a, Arrays.asList(abstractC1623hArr));
    }

    public C1697g(C1698a c1698a, List<? extends RecyclerView.AbstractC1623h<? extends RecyclerView.AbstractC1620e0>> list) {
        this.f5194a = new C1700h(this, c1698a);
        for (RecyclerView.AbstractC1623h<? extends RecyclerView.AbstractC1620e0> abstractC1623h : list) {
            m34771a(abstractC1623h);
        }
        super.setHasStableIds(this.f5194a.m34753s());
    }
}
