package p425j.p426a.p427a.p428a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: Section.java */
/* renamed from: j.a.a.a.a */
/* loaded from: classes2.dex */
public abstract class AbstractC11119a {
    private final Integer emptyResourceId;
    private final boolean emptyViewWillBeProvided;
    private final Integer failedResourceId;
    private final boolean failedViewWillBeProvided;
    private final Integer footerResourceId;
    private final boolean footerViewWillBeProvided;
    private boolean hasFooter;
    private boolean hasHeader;
    private final Integer headerResourceId;
    private final boolean headerViewWillBeProvided;
    private final Integer itemResourceId;
    private final boolean itemViewWillBeProvided;
    private final Integer loadingResourceId;
    private final boolean loadingViewWillBeProvided;
    private EnumC11121b state = EnumC11121b.LOADED;
    private boolean visible = true;

    /* compiled from: Section.java */
    /* renamed from: j.a.a.a.a$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C11120a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25145a;

        static {
            int[] iArr = new int[EnumC11121b.values().length];
            f25145a = iArr;
            try {
                iArr[EnumC11121b.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25145a[EnumC11121b.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25145a[EnumC11121b.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25145a[EnumC11121b.LOADED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: Section.java */
    /* renamed from: j.a.a.a.a$b */
    /* loaded from: classes2.dex */
    public enum EnumC11121b {
        LOADING,
        LOADED,
        FAILED,
        EMPTY
    }

    public AbstractC11119a(C11123c c11123c) {
        boolean z = true;
        this.itemResourceId = c11123c.f25153a;
        Integer num = c11123c.f25154b;
        this.headerResourceId = num;
        this.footerResourceId = c11123c.f25155c;
        this.loadingResourceId = c11123c.f25156d;
        this.failedResourceId = c11123c.f25157e;
        this.emptyResourceId = c11123c.f25158f;
        this.itemViewWillBeProvided = c11123c.f25159g;
        boolean z2 = c11123c.f25160h;
        this.headerViewWillBeProvided = z2;
        this.footerViewWillBeProvided = c11123c.f25161i;
        this.loadingViewWillBeProvided = c11123c.f25162j;
        this.failedViewWillBeProvided = c11123c.f25163k;
        this.emptyViewWillBeProvided = c11123c.f25164l;
        this.hasHeader = num != null || z2;
        if (this.footerResourceId == null && !this.footerViewWillBeProvided) {
            z = false;
        }
        this.hasFooter = z;
    }

    public abstract int getContentItemsTotal();

    public final Integer getEmptyResourceId() {
        return this.emptyResourceId;
    }

    public View getEmptyView(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("You need to implement getEmptyView() if you set emptyViewWillBeProvided");
    }

    public RecyclerView.AbstractC1620e0 getEmptyViewHolder(View view) {
        throw new UnsupportedOperationException("You need to implement getEmptyViewHolder() if you set emptyResourceId");
    }

    public final Integer getFailedResourceId() {
        return this.failedResourceId;
    }

    public View getFailedView(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("You need to implement getFailedView() if you set failedViewWillBeProvided");
    }

    public RecyclerView.AbstractC1620e0 getFailedViewHolder(View view) {
        throw new UnsupportedOperationException("You need to implement getFailedViewHolder() if you set failedResourceId");
    }

    public final Integer getFooterResourceId() {
        return this.footerResourceId;
    }

    public View getFooterView(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("You need to implement getFooterView() if you set footerViewWillBeProvided");
    }

    public RecyclerView.AbstractC1620e0 getFooterViewHolder(View view) {
        throw new UnsupportedOperationException("You need to implement getFooterViewHolder() if you set footerResourceId");
    }

    public final Integer getHeaderResourceId() {
        return this.headerResourceId;
    }

    public View getHeaderView(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("You need to implement getHeaderView() if you set headerViewWillBeProvided");
    }

    public RecyclerView.AbstractC1620e0 getHeaderViewHolder(View view) {
        throw new UnsupportedOperationException("You need to implement getHeaderViewHolder() if you set headerResourceId");
    }

    public final Integer getItemResourceId() {
        return this.itemResourceId;
    }

    public View getItemView(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("You need to implement getItemView() if you set itemViewWillBeProvided");
    }

    public abstract RecyclerView.AbstractC1620e0 getItemViewHolder(View view);

    public final Integer getLoadingResourceId() {
        return this.loadingResourceId;
    }

    public View getLoadingView(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("You need to implement getLoadingView() if you set loadingViewWillBeProvided");
    }

    public RecyclerView.AbstractC1620e0 getLoadingViewHolder(View view) {
        throw new UnsupportedOperationException("You need to implement getLoadingViewHolder() if you set loadingResourceId");
    }

    public final int getSectionItemsTotal() {
        int i = C11120a.f25145a[this.state.ordinal()];
        int i2 = 1;
        if (i != 1 && i != 2 && i != 3) {
            if (i == 4) {
                i2 = getContentItemsTotal();
            } else {
                throw new IllegalStateException("Invalid state");
            }
        }
        return i2 + (this.hasHeader ? 1 : 0) + (this.hasFooter ? 1 : 0);
    }

    public final EnumC11121b getState() {
        return this.state;
    }

    public final boolean hasFooter() {
        return this.hasFooter;
    }

    public final boolean hasHeader() {
        return this.hasHeader;
    }

    public final boolean isEmptyViewWillBeProvided() {
        return this.emptyViewWillBeProvided;
    }

    public final boolean isFailedViewWillBeProvided() {
        return this.failedViewWillBeProvided;
    }

    public final boolean isFooterViewWillBeProvided() {
        return this.footerViewWillBeProvided;
    }

    public final boolean isHeaderViewWillBeProvided() {
        return this.headerViewWillBeProvided;
    }

    public final boolean isItemViewWillBeProvided() {
        return this.itemViewWillBeProvided;
    }

    public final boolean isLoadingViewWillBeProvided() {
        return this.loadingViewWillBeProvided;
    }

    public final boolean isVisible() {
        return this.visible;
    }

    public void onBindEmptyViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0) {
    }

    public void onBindEmptyViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, List<Object> list) {
        onBindEmptyViewHolder(abstractC1620e0);
    }

    public void onBindFailedViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0) {
    }

    public void onBindFailedViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, List<Object> list) {
        onBindFailedViewHolder(abstractC1620e0);
    }

    public void onBindFooterViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0) {
    }

    public void onBindFooterViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, List<Object> list) {
        onBindFooterViewHolder(abstractC1620e0);
    }

    public void onBindHeaderViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0) {
    }

    public void onBindHeaderViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, List<Object> list) {
        onBindHeaderViewHolder(abstractC1620e0);
    }

    public abstract void onBindItemViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, int i);

    public void onBindItemViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, int i, List<Object> list) {
        onBindItemViewHolder(abstractC1620e0, i);
    }

    public void onBindLoadingViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0) {
    }

    public void onBindLoadingViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, List<Object> list) {
        onBindLoadingViewHolder(abstractC1620e0);
    }

    public final void setHasFooter(boolean z) {
        this.hasFooter = z;
    }

    public final void setHasHeader(boolean z) {
        this.hasHeader = z;
    }

    public final void setState(EnumC11121b enumC11121b) {
        int i = C11120a.f25145a[enumC11121b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && this.emptyResourceId == null && !this.emptyViewWillBeProvided) {
                    throw new IllegalStateException("Resource id for 'empty state' should be provided or 'emptyViewWillBeProvided' should be set");
                }
            } else if (this.failedResourceId == null && !this.failedViewWillBeProvided) {
                throw new IllegalStateException("Resource id for 'failed state' should be provided or 'failedViewWillBeProvided' should be set");
            }
        } else if (this.loadingResourceId == null && !this.loadingViewWillBeProvided) {
            throw new IllegalStateException("Resource id for 'loading state' should be provided or 'loadingViewWillBeProvided' should be set");
        }
        this.state = enumC11121b;
    }

    public final void setVisible(boolean z) {
        this.visible = z;
    }
}
