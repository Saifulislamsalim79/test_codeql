package ai.kudi.dip.library.carouselView;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.e0.d.l;
/* compiled from: CarouselOffset.kt */
/* renamed from: ai.kudi.dip.library.carouselView.a */
/* loaded from: classes2.dex */
public final class C0775a {

    /* compiled from: CarouselOffset.kt */
    /* renamed from: ai.kudi.dip.library.carouselView.a$a */
    /* loaded from: classes2.dex */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC0776a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: c */
        final /* synthetic */ RecyclerView f2206c;

        /* renamed from: d */
        final /* synthetic */ boolean f2207d;

        /* renamed from: e */
        final /* synthetic */ View f2208e;

        /* renamed from: f */
        final /* synthetic */ int f2209f;

        ViewTreeObserver$OnGlobalLayoutListenerC0776a(RecyclerView recyclerView, boolean z, View view, int i) {
            this.f2206c = recyclerView;
            this.f2207d = z;
            this.f2208e = view;
            this.f2209f = i;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f2206c.getItemDecorationCount() > 0) {
                this.f2206c.m35310b1(0);
            }
            if (this.f2207d) {
                this.f2206c.m35291i(new C0782e(this.f2208e.getWidth(), this.f2209f), 0);
            } else {
                this.f2206c.m35291i(new C0782e(0, this.f2209f), 0);
            }
            this.f2208e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: a */
    public final void m37995a(RecyclerView recyclerView, View view, int i, boolean z) {
        l.f(recyclerView, "recyclerView");
        l.f(view, "view");
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC0776a(recyclerView, z, view, i));
    }
}
