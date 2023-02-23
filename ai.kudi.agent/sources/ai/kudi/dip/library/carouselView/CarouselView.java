package ai.kudi.dip.library.carouselView;

import ai.kudi.dip.library.C0785d;
import ai.kudi.dip.library.C0786e;
import ai.kudi.dip.library.C0799g;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.AbstractC1753z;
import androidx.recyclerview.widget.C1735p;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.e0.d.l;
/* compiled from: CarouselView.kt */
@Metadata(m10422d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010;\u001a\u00020<H\u0002J\u000e\u0010&\u001a\u00020<2\u0006\u0010=\u001a\u00020\bJ\b\u0010>\u001a\u0004\u0018\u00010!J\b\u0010?\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010@\u001a\u00020\u00162\u0006\u0010A\u001a\u00020\u000eH\u0002J\u0012\u0010B\u001a\u00020<2\b\u0010C\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010D\u001a\u00020<H\u0014J\b\u0010E\u001a\u00020<H\u0002J\u0010\u0010F\u001a\u00020<2\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010G\u001a\u00020<2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\b\u0010H\u001a\u00020<H\u0002J\u0006\u0010I\u001a\u00020<J\b\u0010J\u001a\u00020<H\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0012R\u000e\u0010&\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\n\"\u0004\b,\u0010\fR$\u0010-\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0010\"\u0004\b/\u0010\u0012R\u001a\u00100\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\n\"\u0004\b2\u0010\fR$\u00103\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0010\"\u0004\b5\u0010\u0012R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00108\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0010\"\u0004\b:\u0010\u0012¨\u0006K"}, m10421d2 = {"Lai/kudi/dip/library/carouselView/CarouselView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "autoPlay", "", "getAutoPlay", "()Z", "setAutoPlay", "(Z)V", "autoPlayDelay", "", "getAutoPlayDelay", "()I", "setAutoPlayDelay", "(I)V", "autoPlayHandler", "Landroid/os/Handler;", "offsetType", "Lai/kudi/dip/library/carouselView/OffsetType;", "carouselOffset", "getCarouselOffset", "()Lai/kudi/dip/library/carouselView/OffsetType;", "setCarouselOffset", "(Lai/kudi/dip/library/carouselView/OffsetType;)V", "carouselRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "carouselScrollListener", "Lai/kudi/dip/library/carouselView/ScrollListener;", "carouselViewListener", "Lai/kudi/dip/library/carouselView/CarouselViewListener;", "item", "currentItem", "getCurrentItem", "setCurrentItem", "enableSnapping", "isResourceSet", "layoutManager", "Lai/kudi/dip/library/carouselView/CarouselLayoutManager;", "recycleItems", "getRecycleItems", "setRecycleItems", "resource", "getResource", "setResource", "scaleOnScroll", "getScaleOnScroll", "setScaleOnScroll", "size", "getSize", "setSize", "snapHelper", "Landroidx/recyclerview/widget/SnapHelper;", "spacing", "getSpacing", "setSpacing", "enableAutoPlay", "", "enable", "getCarouselListener", "getCarouselScrollListener", "getOffset", "value", "initializeAttributes", "attributeSet", "onDetachedFromWindow", "setAdapter", "setCarouselListener", "setCarouselScrollListener", "setScrollListener", "show", "validate", "kudi-dip-library_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CarouselView extends FrameLayout {

    /* renamed from: A */
    private int f2186A;

    /* renamed from: B */
    private Handler f2187B;

    /* renamed from: C */
    private boolean f2188C;

    /* renamed from: D */
    private boolean f2189D;

    /* renamed from: E */
    private int f2190E;

    /* renamed from: F */
    private int f2191F;

    /* renamed from: G */
    private int f2192G;

    /* renamed from: H */
    private int f2193H;

    /* renamed from: I */
    private boolean f2194I;

    /* renamed from: c */
    private RecyclerView f2195c;

    /* renamed from: d */
    private CarouselLayoutManager f2196d;

    /* renamed from: e */
    private InterfaceC0781d f2197e;

    /* renamed from: f */
    private InterfaceC0784g f2198f;

    /* renamed from: w */
    private EnumC0783f f2199w;

    /* renamed from: x */
    private AbstractC1753z f2200x;

    /* renamed from: y */
    private boolean f2201y;

    /* renamed from: z */
    private boolean f2202z;

    /* compiled from: CarouselView.kt */
    /* renamed from: ai.kudi.dip.library.carouselView.CarouselView$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0772a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2203a;

        static {
            int[] iArr = new int[EnumC0783f.values().length];
            iArr[EnumC0783f.CENTER.ordinal()] = 1;
            iArr[EnumC0783f.START.ordinal()] = 2;
            f2203a = iArr;
        }
    }

    /* compiled from: CarouselView.kt */
    /* renamed from: ai.kudi.dip.library.carouselView.CarouselView$b */
    /* loaded from: classes2.dex */
    public static final class RunnableC0773b implements Runnable {
        RunnableC0773b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CarouselView.this.getAutoPlay()) {
                CarouselView carouselView = CarouselView.this;
                carouselView.setCurrentItem(carouselView.getSize() + (-1) == CarouselView.this.getCurrentItem() ? 0 : CarouselView.this.getCurrentItem() + 1);
                Handler handler = CarouselView.this.f2187B;
                l.d(handler);
                handler.postDelayed(this, CarouselView.this.getAutoPlayDelay());
            }
        }
    }

    /* compiled from: CarouselView.kt */
    /* renamed from: ai.kudi.dip.library.carouselView.CarouselView$c */
    /* loaded from: classes2.dex */
    public static final class C0774c extends RecyclerView.AbstractC1644u {
        C0774c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1644u
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            InterfaceC0784g interfaceC0784g;
            l.f(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (CarouselView.this.f2196d != null) {
                AbstractC1753z abstractC1753z = CarouselView.this.f2200x;
                View mo34223h = abstractC1753z == null ? null : abstractC1753z.mo34223h(CarouselView.this.f2196d);
                if (mo34223h != null) {
                    CarouselLayoutManager carouselLayoutManager = CarouselView.this.f2196d;
                    l.d(carouselLayoutManager);
                    int m35110n0 = carouselLayoutManager.m35110n0(mo34223h);
                    if (CarouselView.this.f2198f != null && (interfaceC0784g = CarouselView.this.f2198f) != null) {
                        interfaceC0784g.m37988a(recyclerView, i, m35110n0);
                    }
                    if (i == 0) {
                        CarouselView.this.setCurrentItem(m35110n0);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1644u
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            InterfaceC0784g interfaceC0784g;
            l.f(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (CarouselView.this.f2198f == null || (interfaceC0784g = CarouselView.this.f2198f) == null) {
                return;
            }
            interfaceC0784g.m37987b(recyclerView, i, i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        l.f(attributeSet, "attrs");
        this.f2189D = true;
        View inflate = LayoutInflater.from(context).inflate(C0786e.view_carousel, this);
        l.e(inflate, "inflater.inflate(R.layout.view_carousel, this)");
        this.f2195c = (RecyclerView) inflate.findViewById(C0785d.recyclerView_carousel);
        this.f2187B = new Handler();
        RecyclerView recyclerView = this.f2195c;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(false);
        }
        m38000h(attributeSet);
    }

    /* renamed from: e */
    private final void m38003e() {
        Handler handler = this.f2187B;
        l.d(handler);
        handler.postDelayed(new RunnableC0773b(), this.f2186A);
    }

    /* renamed from: g */
    private final EnumC0783f m38001g(int i) {
        if (i != 0) {
            if (i != 1) {
                return EnumC0783f.START;
            }
            return EnumC0783f.CENTER;
        }
        return EnumC0783f.START;
    }

    /* renamed from: h */
    private final void m38000h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C0799g.CarouselView, 0, 0);
            m38002f(obtainStyledAttributes.getBoolean(C0799g.CarouselView_enableSnapping, true));
            this.f2188C = obtainStyledAttributes.getBoolean(C0799g.CarouselView_scaleOnScroll, false);
            this.f2202z = obtainStyledAttributes.getBoolean(C0799g.CarouselView_setAutoPlay, false);
            this.f2186A = obtainStyledAttributes.getInteger(C0799g.CarouselView_setAutoPlayDelay, 2500);
            setCarouselOffset(m38001g(obtainStyledAttributes.getInteger(C0799g.CarouselView_carouselOffset, 0)));
            int resourceId = obtainStyledAttributes.getResourceId(C0799g.CarouselView_resource, 0);
            if (resourceId != 0) {
                setResource(resourceId);
            }
            setSize(obtainStyledAttributes.getInteger(C0799g.CarouselView_size, 0));
            this.f2192G = obtainStyledAttributes.getInteger(C0799g.CarouselView_spacing, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: i */
    private final void m37999i() {
        RecyclerView recyclerView;
        RecyclerView.C1645v recycledViewPool;
        CarouselLayoutManager carouselLayoutManager;
        CarouselLayoutManager carouselLayoutManager2 = new CarouselLayoutManager(getContext(), 0, false);
        this.f2196d = carouselLayoutManager2;
        if (carouselLayoutManager2 != null) {
            carouselLayoutManager2.m38009T2(getCarouselOffset() == EnumC0783f.START);
        }
        if (this.f2188C && (carouselLayoutManager = this.f2196d) != null) {
            carouselLayoutManager.m38008U2(true);
        }
        RecyclerView recyclerView2 = this.f2195c;
        if (recyclerView2 != null) {
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(this.f2196d);
            }
            RecyclerView recyclerView3 = this.f2195c;
            if (recyclerView3 != null) {
                InterfaceC0781d interfaceC0781d = this.f2197e;
                int i = this.f2190E;
                int i2 = this.f2191F;
                l.d(recyclerView3);
                recyclerView3.setAdapter(new C0779c(interfaceC0781d, i, i2, recyclerView3, this.f2192G, getCarouselOffset() == EnumC0783f.CENTER));
            }
            if (!this.f2189D && (recyclerView = this.f2195c) != null && (recycledViewPool = recyclerView.getRecycledViewPool()) != null) {
                recycledViewPool.m35065k(1, 0);
            }
            if (this.f2201y) {
                RecyclerView recyclerView4 = this.f2195c;
                if (recyclerView4 != null) {
                    recyclerView4.setOnFlingListener(null);
                }
                AbstractC1753z abstractC1753z = this.f2200x;
                l.d(abstractC1753z);
                abstractC1753z.mo34559b(this.f2195c);
            }
            m37998j();
            m38003e();
        }
    }

    /* renamed from: j */
    private final void m37998j() {
        RecyclerView recyclerView = this.f2195c;
        l.d(recyclerView);
        recyclerView.m35282l(new C0774c());
    }

    /* renamed from: l */
    private final void m37996l() {
        if (!this.f2194I) {
            throw new RuntimeException("Please add a resource layout to populate the carouselview");
        }
    }

    /* renamed from: f */
    public final void m38002f(boolean z) {
        this.f2201y = z;
    }

    public final boolean getAutoPlay() {
        return this.f2202z;
    }

    public final int getAutoPlayDelay() {
        return this.f2186A;
    }

    public final InterfaceC0781d getCarouselListener() {
        return this.f2197e;
    }

    public final EnumC0783f getCarouselOffset() {
        return this.f2199w;
    }

    public final InterfaceC0784g getCarouselScrollListener() {
        return this.f2198f;
    }

    public final int getCurrentItem() {
        return this.f2193H;
    }

    public final boolean getRecycleItems() {
        return this.f2189D;
    }

    public final int getResource() {
        return this.f2190E;
    }

    public final boolean getScaleOnScroll() {
        return this.f2188C;
    }

    public final int getSize() {
        return this.f2191F;
    }

    public final int getSpacing() {
        return this.f2192G;
    }

    /* renamed from: k */
    public final void m37997k() {
        m37996l();
        m37999i();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2202z = false;
    }

    public final void setAutoPlay(boolean z) {
        this.f2202z = z;
    }

    public final void setAutoPlayDelay(int i) {
        this.f2186A = i;
    }

    public final void setCarouselListener(InterfaceC0781d interfaceC0781d) {
        this.f2197e = interfaceC0781d;
    }

    public final void setCarouselOffset(EnumC0783f enumC0783f) {
        this.f2199w = enumC0783f;
        int i = enumC0783f == null ? -1 : C0772a.f2203a[enumC0783f.ordinal()];
        if (i == 1) {
            this.f2200x = new C1735p();
        } else if (i != 2) {
        } else {
            this.f2200x = new C0777b();
        }
    }

    public final void setCarouselScrollListener(InterfaceC0784g interfaceC0784g) {
        this.f2198f = interfaceC0784g;
    }

    public final void setCurrentItem(int i) {
        if (i < 0) {
            i = 0;
        } else {
            int i2 = this.f2191F;
            if (i >= i2) {
                i = i2 - 1;
            }
        }
        this.f2193H = i;
        RecyclerView recyclerView = this.f2195c;
        l.d(recyclerView);
        recyclerView.m35253u1(this.f2193H);
    }

    public final void setRecycleItems(boolean z) {
        this.f2189D = z;
    }

    public final void setResource(int i) {
        this.f2190E = i;
        this.f2194I = true;
    }

    public final void setScaleOnScroll(boolean z) {
        this.f2188C = z;
    }

    public final void setSize(int i) {
        this.f2191F = i;
    }

    public final void setSpacing(int i) {
        this.f2192G = i;
    }
}
