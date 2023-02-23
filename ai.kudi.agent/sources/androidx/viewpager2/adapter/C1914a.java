package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p227h.p238l.C7759x;
/* compiled from: FragmentViewHolder.java */
/* renamed from: androidx.viewpager2.adapter.a */
/* loaded from: classes2.dex */
public final class C1914a extends RecyclerView.AbstractC1620e0 {
    private C1914a(FrameLayout frameLayout) {
        super(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1914a m34269a(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(C7759x.m17509k());
        frameLayout.setSaveEnabled(false);
        return new C1914a(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public FrameLayout m34268b() {
        return (FrameLayout) this.itemView;
    }
}
