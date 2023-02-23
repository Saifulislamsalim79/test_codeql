package p425j.p426a.p427a.p428a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.collections4.p594c.C14523c;
import p425j.p426a.p427a.p428a.AbstractC11119a;
/* compiled from: SectionedRecyclerViewAdapter.java */
/* renamed from: j.a.a.a.d */
/* loaded from: classes2.dex */
public class C11126d extends RecyclerView.AbstractC1623h<RecyclerView.AbstractC1620e0> {

    /* renamed from: a */
    private final transient C14523c<String, AbstractC11119a> f25177a = new C14523c<>();

    /* renamed from: b */
    private final transient Map<String, Integer> f25178b = new LinkedHashMap();

    /* renamed from: c */
    private final transient Map<AbstractC11119a, C11122b> f25179c = new HashMap();

    /* renamed from: d */
    private transient int f25180d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SectionedRecyclerViewAdapter.java */
    /* renamed from: j.a.a.a.d$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C11127a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25181a;

        static {
            int[] iArr = new int[AbstractC11119a.EnumC11121b.values().length];
            f25181a = iArr;
            try {
                iArr[AbstractC11119a.EnumC11121b.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25181a[AbstractC11119a.EnumC11121b.LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25181a[AbstractC11119a.EnumC11121b.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25181a[AbstractC11119a.EnumC11121b.EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: d */
    private void m11620d(String str) {
        this.f25178b.put(str, Integer.valueOf(this.f25180d));
        this.f25180d += 6;
    }

    /* renamed from: e */
    private String m11619e() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: g */
    private RecyclerView.AbstractC1620e0 m11617g(ViewGroup viewGroup, AbstractC11119a abstractC11119a) {
        View m11606r;
        if (abstractC11119a.isEmptyViewWillBeProvided()) {
            m11606r = abstractC11119a.getEmptyView(viewGroup);
            if (m11606r == null) {
                throw new NullPointerException("Section.getEmptyView() returned null");
            }
        } else {
            Integer emptyResourceId = abstractC11119a.getEmptyResourceId();
            if (emptyResourceId != null) {
                m11606r = m11606r(emptyResourceId.intValue(), viewGroup);
            } else {
                throw new NullPointerException("Missing 'empty' resource id");
            }
        }
        return abstractC11119a.getEmptyViewHolder(m11606r);
    }

    /* renamed from: h */
    private RecyclerView.AbstractC1620e0 m11616h(ViewGroup viewGroup, AbstractC11119a abstractC11119a) {
        View m11606r;
        if (abstractC11119a.isFailedViewWillBeProvided()) {
            m11606r = abstractC11119a.getFailedView(viewGroup);
            if (m11606r == null) {
                throw new NullPointerException("Section.getFailedView() returned null");
            }
        } else {
            Integer failedResourceId = abstractC11119a.getFailedResourceId();
            if (failedResourceId != null) {
                m11606r = m11606r(failedResourceId.intValue(), viewGroup);
            } else {
                throw new NullPointerException("Missing 'failed' resource id");
            }
        }
        return abstractC11119a.getFailedViewHolder(m11606r);
    }

    /* renamed from: i */
    private RecyclerView.AbstractC1620e0 m11615i(ViewGroup viewGroup, AbstractC11119a abstractC11119a) {
        View m11606r;
        if (abstractC11119a.isFooterViewWillBeProvided()) {
            m11606r = abstractC11119a.getFooterView(viewGroup);
            if (m11606r == null) {
                throw new NullPointerException("Section.getFooterView() returned null");
            }
        } else {
            Integer footerResourceId = abstractC11119a.getFooterResourceId();
            if (footerResourceId != null) {
                m11606r = m11606r(footerResourceId.intValue(), viewGroup);
            } else {
                throw new NullPointerException("Missing 'footer' resource id");
            }
        }
        return abstractC11119a.getFooterViewHolder(m11606r);
    }

    /* renamed from: j */
    private RecyclerView.AbstractC1620e0 m11614j(ViewGroup viewGroup, AbstractC11119a abstractC11119a) {
        View m11606r;
        if (abstractC11119a.isHeaderViewWillBeProvided()) {
            m11606r = abstractC11119a.getHeaderView(viewGroup);
            if (m11606r == null) {
                throw new NullPointerException("Section.getHeaderView() returned null");
            }
        } else {
            Integer headerResourceId = abstractC11119a.getHeaderResourceId();
            if (headerResourceId != null) {
                m11606r = m11606r(headerResourceId.intValue(), viewGroup);
            } else {
                throw new NullPointerException("Missing 'header' resource id");
            }
        }
        return abstractC11119a.getHeaderViewHolder(m11606r);
    }

    /* renamed from: k */
    private RecyclerView.AbstractC1620e0 m11613k(ViewGroup viewGroup, AbstractC11119a abstractC11119a) {
        View m11606r;
        if (abstractC11119a.isItemViewWillBeProvided()) {
            m11606r = abstractC11119a.getItemView(viewGroup);
            if (m11606r == null) {
                throw new NullPointerException("Section.getItemView() returned null");
            }
        } else {
            Integer itemResourceId = abstractC11119a.getItemResourceId();
            if (itemResourceId != null) {
                m11606r = m11606r(itemResourceId.intValue(), viewGroup);
            } else {
                throw new NullPointerException("Missing 'item' resource id");
            }
        }
        return abstractC11119a.getItemViewHolder(m11606r);
    }

    /* renamed from: l */
    private RecyclerView.AbstractC1620e0 m11612l(ViewGroup viewGroup, AbstractC11119a abstractC11119a) {
        View m11606r;
        if (abstractC11119a.isLoadingViewWillBeProvided()) {
            m11606r = abstractC11119a.getLoadingView(viewGroup);
            if (m11606r == null) {
                throw new NullPointerException("Section.getLoadingView() returned null");
            }
        } else {
            Integer loadingResourceId = abstractC11119a.getLoadingResourceId();
            if (loadingResourceId != null) {
                m11606r = m11606r(loadingResourceId.intValue(), viewGroup);
            } else {
                throw new NullPointerException("Missing 'loading' resource id");
            }
        }
        return abstractC11119a.getLoadingViewHolder(m11606r);
    }

    /* renamed from: s */
    private void m11605s(RecyclerView.AbstractC1620e0 abstractC1620e0, int i, List<Object> list) {
        int i2;
        int i3 = 0;
        for (Map.Entry<String, AbstractC11119a> entry : this.f25177a.entrySet()) {
            AbstractC11119a value = entry.getValue();
            if (value.isVisible()) {
                int sectionItemsTotal = value.getSectionItemsTotal();
                if (i >= i3 && i <= (i3 + sectionItemsTotal) - 1) {
                    if (value.hasHeader() && i == i3) {
                        if (list == null) {
                            m11610n(i).onBindHeaderViewHolder(abstractC1620e0);
                            return;
                        } else {
                            m11610n(i).onBindHeaderViewHolder(abstractC1620e0, list);
                            return;
                        }
                    } else if (!value.hasFooter() || i != i2) {
                        m11604t(m11610n(i), abstractC1620e0, i, list);
                        return;
                    } else if (list == null) {
                        m11610n(i).onBindFooterViewHolder(abstractC1620e0);
                        return;
                    } else {
                        m11610n(i).onBindFooterViewHolder(abstractC1620e0, list);
                        return;
                    }
                }
                i3 += sectionItemsTotal;
            }
        }
        throw new IndexOutOfBoundsException("Invalid position");
    }

    /* renamed from: t */
    private void m11604t(AbstractC11119a abstractC11119a, RecyclerView.AbstractC1620e0 abstractC1620e0, int i, List<Object> list) {
        int i2 = C11127a.f25181a[abstractC11119a.getState().ordinal()];
        if (i2 == 1) {
            if (list == null) {
                abstractC11119a.onBindLoadingViewHolder(abstractC1620e0);
            } else {
                abstractC11119a.onBindLoadingViewHolder(abstractC1620e0, list);
            }
        } else if (i2 == 2) {
            if (list == null) {
                abstractC11119a.onBindItemViewHolder(abstractC1620e0, m11611m(i));
            } else {
                abstractC11119a.onBindItemViewHolder(abstractC1620e0, m11611m(i), list);
            }
        } else if (i2 == 3) {
            if (list == null) {
                abstractC11119a.onBindFailedViewHolder(abstractC1620e0);
            } else {
                abstractC11119a.onBindFailedViewHolder(abstractC1620e0, list);
            }
        } else if (i2 != 4) {
            throw new IllegalStateException("Invalid state");
        } else {
            if (list == null) {
                abstractC11119a.onBindEmptyViewHolder(abstractC1620e0);
            } else {
                abstractC11119a.onBindEmptyViewHolder(abstractC1620e0, list);
            }
        }
    }

    /* renamed from: a */
    public String m11623a(AbstractC11119a abstractC11119a) {
        String m11619e = m11619e();
        m11621c(m11619e, abstractC11119a);
        return m11619e;
    }

    /* renamed from: b */
    public void m11622b(int i, String str, AbstractC11119a abstractC11119a) {
        this.f25177a.m1398e(i, str, abstractC11119a);
        m11620d(str);
        this.f25179c.put(abstractC11119a, new C11122b(this, abstractC11119a));
    }

    /* renamed from: c */
    public void m11621c(String str, AbstractC11119a abstractC11119a) {
        m11622b(this.f25177a.size(), str, abstractC11119a);
    }

    /* renamed from: f */
    public C11122b m11618f(AbstractC11119a abstractC11119a) {
        C11122b c11122b = this.f25179c.get(abstractC11119a);
        if (c11122b != null) {
            return c11122b;
        }
        throw new IllegalArgumentException("Invalid section");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        int i = 0;
        for (Map.Entry<String, AbstractC11119a> entry : this.f25177a.entrySet()) {
            AbstractC11119a value = entry.getValue();
            if (value.isVisible()) {
                i += value.getSectionItemsTotal();
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemViewType(int i) {
        int i2;
        int i3 = 0;
        for (Map.Entry<String, AbstractC11119a> entry : this.f25177a.entrySet()) {
            AbstractC11119a value = entry.getValue();
            if (value.isVisible()) {
                int sectionItemsTotal = value.getSectionItemsTotal();
                if (i >= i3 && i <= (i2 = (i3 + sectionItemsTotal) - 1)) {
                    int intValue = this.f25178b.get(entry.getKey()).intValue();
                    if (value.hasHeader() && i == i3) {
                        return intValue;
                    }
                    if (value.hasFooter() && i == i2) {
                        return intValue + 1;
                    }
                    int i4 = C11127a.f25181a[value.getState().ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    return intValue + 5;
                                }
                                throw new IllegalStateException("Invalid state");
                            }
                            return intValue + 4;
                        }
                        return intValue + 2;
                    }
                    return intValue + 3;
                }
                i3 += sectionItemsTotal;
            }
        }
        throw new IndexOutOfBoundsException("Invalid position");
    }

    /* renamed from: m */
    public int m11611m(int i) {
        int i2 = 0;
        for (Map.Entry<String, AbstractC11119a> entry : this.f25177a.entrySet()) {
            AbstractC11119a value = entry.getValue();
            if (value.isVisible()) {
                int sectionItemsTotal = value.getSectionItemsTotal();
                if (i >= i2 && i <= (i2 + sectionItemsTotal) - 1) {
                    return (i - i2) - (value.hasHeader() ? 1 : 0);
                }
                i2 += sectionItemsTotal;
            }
        }
        throw new IndexOutOfBoundsException("Invalid position");
    }

    /* renamed from: n */
    public AbstractC11119a m11610n(int i) {
        int i2 = 0;
        for (Map.Entry<String, AbstractC11119a> entry : this.f25177a.entrySet()) {
            AbstractC11119a value = entry.getValue();
            if (value.isVisible()) {
                int sectionItemsTotal = value.getSectionItemsTotal();
                if (i >= i2 && i <= (i2 + sectionItemsTotal) - 1) {
                    return value;
                }
                i2 += sectionItemsTotal;
            }
        }
        throw new IndexOutOfBoundsException("Invalid position");
    }

    /* renamed from: o */
    public int m11609o(int i) {
        return m11608p(getItemViewType(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public void onBindViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, int i) {
        m11605s(abstractC1620e0, i, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public RecyclerView.AbstractC1620e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.AbstractC1620e0 abstractC1620e0 = null;
        for (Map.Entry<String, Integer> entry : this.f25178b.entrySet()) {
            if (i >= entry.getValue().intValue() && i < entry.getValue().intValue() + 6) {
                AbstractC11119a abstractC11119a = this.f25177a.get(entry.getKey());
                int intValue = i - entry.getValue().intValue();
                if (intValue == 0) {
                    abstractC1620e0 = m11614j(viewGroup, abstractC11119a);
                } else if (intValue == 1) {
                    abstractC1620e0 = m11615i(viewGroup, abstractC11119a);
                } else if (intValue == 2) {
                    abstractC1620e0 = m11613k(viewGroup, abstractC11119a);
                } else if (intValue == 3) {
                    abstractC1620e0 = m11612l(viewGroup, abstractC11119a);
                } else if (intValue == 4) {
                    abstractC1620e0 = m11616h(viewGroup, abstractC11119a);
                } else if (intValue == 5) {
                    abstractC1620e0 = m11617g(viewGroup, abstractC11119a);
                } else {
                    throw new IllegalArgumentException("Invalid viewType");
                }
            }
        }
        return abstractC1620e0;
    }

    /* renamed from: p */
    public int m11608p(int i) {
        return i % 6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public C14523c<String, AbstractC11119a> m11607q() {
        return this.f25177a;
    }

    /* renamed from: r */
    public View m11606r(int i, ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
    }

    /* renamed from: u */
    public void m11603u() {
        this.f25177a.clear();
        this.f25178b.clear();
        this.f25179c.clear();
        this.f25180d = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public void onBindViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, int i, List<Object> list) {
        if (list.isEmpty()) {
            super.onBindViewHolder(abstractC1620e0, i, list);
        } else {
            m11605s(abstractC1620e0, i, list);
        }
    }
}
