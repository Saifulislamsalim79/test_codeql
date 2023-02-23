package ai.kudi.dip.library.p047k;

import ai.kudi.dip.library.C0756b;
import ai.kudi.dip.library.p045i.C0827f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C1335a;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p557z.C13722p;
/* compiled from: RatingBarAdapter.kt */
/* renamed from: ai.kudi.dip.library.k.b */
/* loaded from: classes2.dex */
public final class C0830b extends RecyclerView.AbstractC1623h<C0831a> {

    /* renamed from: a */
    private List<C0832c> f2331a;

    /* renamed from: b */
    private final Context f2332b;

    /* renamed from: c */
    private InterfaceC11767l<? super Integer, C13666w> f2333c;

    /* renamed from: d */
    private int f2334d;

    /* compiled from: RatingBarAdapter.kt */
    /* renamed from: ai.kudi.dip.library.k.b$a */
    /* loaded from: classes2.dex */
    public final class C0831a extends RecyclerView.AbstractC1620e0 {

        /* renamed from: a */
        private final C0827f f2335a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0831a(C0830b c0830b, C0827f c0827f) {
            super(c0827f.getRoot());
            l.f(c0830b, "this$0");
            l.f(c0827f, "binding");
            this.f2335a = c0827f;
        }

        /* renamed from: a */
        public final C0827f m37910a() {
            return this.f2335a;
        }
    }

    public C0830b(List<C0832c> list, Context context, InterfaceC11767l<? super Integer, C13666w> interfaceC11767l) {
        l.f(list, AttributeType.LIST);
        l.f(context, "context");
        this.f2331a = list;
        this.f2332b = context;
        this.f2333c = interfaceC11767l;
        this.f2334d = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m37915c(C0830b c0830b, int i, C0832c c0832c, View view) {
        l.f(c0830b, "this$0");
        l.f(c0832c, "$value");
        if (c0830b.f2333c != null) {
            c0830b.m37913e(i);
            InterfaceC11767l<? super Integer, C13666w> interfaceC11767l = c0830b.f2333c;
            if (interfaceC11767l == null) {
                return;
            }
            interfaceC11767l.invoke(Integer.valueOf(c0832c.m37909a()));
        }
    }

    /* renamed from: e */
    private final void m37913e(int i) {
        m37911g();
        int i2 = 0;
        for (Object obj : this.f2331a) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C13722p.m3923n();
                throw null;
            }
            C0832c c0832c = (C0832c) obj;
            if (i2 <= i) {
                c0832c.m37907c(true);
            }
            i2 = i3;
        }
        int i4 = this.f2334d;
        if (i4 != -1) {
            notifyItemRangeChanged(0, i4 + 1);
        }
        notifyItemRangeChanged(0, i + 1);
        this.f2334d = i;
    }

    /* renamed from: g */
    private final void m37911g() {
        for (C0832c c0832c : this.f2331a) {
            c0832c.m37907c(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    /* renamed from: b */
    public void onBindViewHolder(C0831a c0831a, final int i) {
        l.f(c0831a, "holder");
        final C0832c c0832c = this.f2331a.get(i);
        if (c0832c.m37908b()) {
            c0831a.m37910a().f2327b.setImageDrawable(C1335a.m36322f(this.f2332b, C0756b.ic_star_yellow));
        } else {
            c0831a.m37910a().f2327b.setImageDrawable(C1335a.m36322f(this.f2332b, C0756b.ic_star_inactive));
        }
        c0831a.m37910a().f2327b.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.dip.library.k.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0830b.m37915c(C0830b.this, i, c0832c, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    /* renamed from: d */
    public C0831a onCreateViewHolder(ViewGroup viewGroup, int i) {
        l.f(viewGroup, "parent");
        C0827f m37919c = C0827f.m37919c(LayoutInflater.from(this.f2332b), viewGroup, false);
        l.e(m37919c, "inflate(LayoutInflater.from(context), parent, false)");
        return new C0831a(this, m37919c);
    }

    /* renamed from: f */
    public final void m37912f(int i, boolean z) {
        m37913e(i);
        if (z) {
            this.f2333c = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        return this.f2331a.size();
    }
}
