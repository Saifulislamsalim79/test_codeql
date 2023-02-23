package ai.kudi.dip.library.carouselView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.e0.d.l;
/* compiled from: CarouselViewAdapter.kt */
/* renamed from: ai.kudi.dip.library.carouselView.c */
/* loaded from: classes2.dex */
public final class C0779c extends RecyclerView.AbstractC1623h<C0780a> {

    /* renamed from: a */
    private final InterfaceC0781d f2216a;

    /* renamed from: b */
    private final int f2217b;

    /* renamed from: c */
    private final int f2218c;

    /* renamed from: d */
    private final RecyclerView f2219d;

    /* renamed from: e */
    private final int f2220e;

    /* renamed from: f */
    private final boolean f2221f;

    /* renamed from: g */
    private final C0775a f2222g;

    /* compiled from: CarouselViewAdapter.kt */
    /* renamed from: ai.kudi.dip.library.carouselView.c$a */
    /* loaded from: classes2.dex */
    public static final class C0780a extends RecyclerView.AbstractC1620e0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0780a(View view) {
            super(view);
            l.f(view, "itemView");
        }
    }

    public C0779c(InterfaceC0781d interfaceC0781d, int i, int i2, RecyclerView recyclerView, int i3, boolean z) {
        l.f(recyclerView, "recyclerView");
        this.f2216a = interfaceC0781d;
        this.f2217b = i;
        this.f2218c = i2;
        this.f2219d = recyclerView;
        this.f2220e = i3;
        this.f2221f = z;
        this.f2222g = new C0775a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    /* renamed from: a */
    public void onBindViewHolder(C0780a c0780a, int i) {
        l.f(c0780a, "holder");
        InterfaceC0781d interfaceC0781d = this.f2216a;
        if (interfaceC0781d != null) {
            interfaceC0781d.onBindView(c0780a.itemView, i);
        }
        C0775a c0775a = this.f2222g;
        RecyclerView recyclerView = this.f2219d;
        View view = c0780a.itemView;
        l.e(view, "holder.itemView");
        c0775a.m37995a(recyclerView, view, this.f2220e, this.f2221f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    /* renamed from: b */
    public C0780a onCreateViewHolder(ViewGroup viewGroup, int i) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f2217b, viewGroup, false);
        l.e(inflate, "view");
        return new C0780a(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        return this.f2218c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemViewType(int i) {
        return 1;
    }
}
