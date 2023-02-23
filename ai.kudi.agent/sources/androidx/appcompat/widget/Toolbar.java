package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.view.menu.C0999g;
import androidx.appcompat.view.menu.C1003i;
import androidx.appcompat.view.menu.InterfaceC1014m;
import androidx.appcompat.view.menu.SubMenuC1023r;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.List;
import p201g.p202a.C7452a;
import p201g.p202a.C7461j;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p202a.p209o.C7492g;
import p201g.p202a.p209o.InterfaceC7487c;
import p201g.p227h.p238l.C7693e;
import p201g.p227h.p238l.C7713h;
import p201g.p227h.p238l.C7759x;
import p201g.p243j.p244a.AbstractC7781a;
/* loaded from: classes2.dex */
public class Toolbar extends ViewGroup {
    private static final String TAG = "Toolbar";
    private InterfaceC1014m.InterfaceC1015a mActionMenuPresenterCallback;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private C1115j0 mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private C1060d mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    private C0999g.InterfaceC1000a mMenuBuilderCallback;
    private ActionMenuView mMenuView;
    private final ActionMenuView.InterfaceC1035e mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    InterfaceC1062f mOnMenuItemClickListener;
    private C1073c mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private ColorStateList mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private ColorStateList mTitleTextColor;
    private TextView mTitleTextView;
    private C1140s0 mWrapper;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    /* loaded from: classes2.dex */
    class C1057a implements ActionMenuView.InterfaceC1035e {
        C1057a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1035e
        public boolean onMenuItemClick(MenuItem menuItem) {
            InterfaceC1062f interfaceC1062f = Toolbar.this.mOnMenuItemClickListener;
            if (interfaceC1062f != null) {
                return interfaceC1062f.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    /* loaded from: classes2.dex */
    class RunnableC1058b implements Runnable {
        RunnableC1058b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.showOverflowMenu();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC1059c implements View.OnClickListener {
        View$OnClickListenerC1059c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.collapseActionView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    /* loaded from: classes2.dex */
    public class C1060d implements InterfaceC1014m {

        /* renamed from: c */
        C0999g f3210c;

        /* renamed from: d */
        C1003i f3211d;

        C1060d() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m
        /* renamed from: a */
        public void mo26766a(C0999g c0999g, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m
        /* renamed from: h */
        public int mo26759h() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m
        /* renamed from: i */
        public void mo26758i(boolean z) {
            if (this.f3211d != null) {
                C0999g c0999g = this.f3210c;
                boolean z2 = false;
                if (c0999g != null) {
                    int size = c0999g.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f3210c.getItem(i) == this.f3211d) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                mo26756k(this.f3210c, this.f3211d);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m
        /* renamed from: j */
        public boolean mo26757j() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m
        /* renamed from: k */
        public boolean mo26756k(C0999g c0999g, C1003i c1003i) {
            View view = Toolbar.this.mExpandedActionView;
            if (view instanceof InterfaceC7487c) {
                ((InterfaceC7487c) view).mo18598f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.mExpandedActionView);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.mCollapseButtonView);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.mExpandedActionView = null;
            toolbar3.addChildrenForExpandedActionView();
            this.f3211d = null;
            Toolbar.this.requestLayout();
            c1003i.m37487r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m
        /* renamed from: l */
        public boolean mo26755l(C0999g c0999g, C1003i c1003i) {
            Toolbar.this.ensureCollapseButtonView();
            ViewParent parent = Toolbar.this.mCollapseButtonView.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.mCollapseButtonView);
            }
            Toolbar.this.mExpandedActionView = c1003i.getActionView();
            this.f3211d = c1003i;
            ViewParent parent2 = Toolbar.this.mExpandedActionView.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.mExpandedActionView);
                }
                C1061e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f2538a = 8388611 | (toolbar4.mButtonGravity & 112);
                generateDefaultLayoutParams.f3213b = 2;
                toolbar4.mExpandedActionView.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.mExpandedActionView);
            }
            Toolbar.this.removeChildrenForExpandedActionView();
            Toolbar.this.requestLayout();
            c1003i.m37487r(true);
            View view = Toolbar.this.mExpandedActionView;
            if (view instanceof InterfaceC7487c) {
                ((InterfaceC7487c) view).mo18599c();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m
        /* renamed from: m */
        public void mo26754m(InterfaceC1014m.InterfaceC1015a interfaceC1015a) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m
        /* renamed from: n */
        public void mo26753n(Context context, C0999g c0999g) {
            C1003i c1003i;
            C0999g c0999g2 = this.f3210c;
            if (c0999g2 != null && (c1003i = this.f3211d) != null) {
                c0999g2.mo37443f(c1003i);
            }
            this.f3210c = c0999g;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m
        /* renamed from: o */
        public void mo26752o(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m
        /* renamed from: q */
        public boolean mo26750q(SubMenuC1023r subMenuC1023r) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m
        /* renamed from: r */
        public Parcelable mo26749r() {
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC1062f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private void addCustomViewsWithGravity(List<View> list, int i) {
        boolean z = C7759x.m17563C(this) == 1;
        int childCount = getChildCount();
        int m17805b = C7693e.m17805b(i, C7759x.m17563C(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C1061e c1061e = (C1061e) childAt.getLayoutParams();
                if (c1061e.f3213b == 0 && shouldLayout(childAt) && getChildHorizontalGravity(c1061e.f2538a) == m17805b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C1061e c1061e2 = (C1061e) childAt2.getLayoutParams();
            if (c1061e2.f3213b == 0 && shouldLayout(childAt2) && getChildHorizontalGravity(c1061e2.f2538a) == m17805b) {
                list.add(childAt2);
            }
        }
    }

    private void addSystemView(View view, boolean z) {
        C1061e c1061e;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c1061e = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            c1061e = generateLayoutParams(layoutParams);
        } else {
            c1061e = (C1061e) layoutParams;
        }
        c1061e.f3213b = 1;
        if (z && this.mExpandedActionView != null) {
            view.setLayoutParams(c1061e);
            this.mHiddenViews.add(view);
            return;
        }
        addView(view, c1061e);
    }

    private void ensureContentInsets() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new C1115j0();
        }
    }

    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext());
        }
    }

    private void ensureMenu() {
        ensureMenuView();
        if (this.mMenuView.m37399N() == null) {
            C0999g c0999g = (C0999g) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new C1060d();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            c0999g.m37532c(this.mExpandedMenuPresenter, this.mPopupContext);
        }
    }

    private void ensureMenuView() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.m37398O(this.mActionMenuPresenterCallback, this.mMenuBuilderCallback);
            C1061e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2538a = 8388613 | (this.mButtonGravity & 112);
            this.mMenuView.setLayoutParams(generateDefaultLayoutParams);
            addSystemView(this.mMenuView, false);
        }
    }

    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new AppCompatImageButton(getContext(), null, C7452a.toolbarNavigationButtonStyle);
            C1061e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2538a = 8388611 | (this.mButtonGravity & 112);
            this.mNavButtonView.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int getChildHorizontalGravity(int i) {
        int m17563C = C7759x.m17563C(this);
        int m17805b = C7693e.m17805b(i, m17563C) & 7;
        return (m17805b == 1 || m17805b == 3 || m17805b == 5) ? m17805b : m17563C == 1 ? 5 : 3;
    }

    private int getChildTop(View view, int i) {
        C1061e c1061e = (C1061e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int childVerticalGravity = getChildVerticalGravity(c1061e.f2538a);
        if (childVerticalGravity != 48) {
            if (childVerticalGravity != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i4 = ((ViewGroup.MarginLayoutParams) c1061e).topMargin;
                if (i3 < i4) {
                    i3 = i4;
                } else {
                    int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
                    int i6 = ((ViewGroup.MarginLayoutParams) c1061e).bottomMargin;
                    if (i5 < i6) {
                        i3 = Math.max(0, i3 - (i6 - i5));
                    }
                }
                return paddingTop + i3;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c1061e).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    private int getChildVerticalGravity(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.mGravity & 112;
    }

    private int getHorizontalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C7713h.m17730b(marginLayoutParams) + C7713h.m17731a(marginLayoutParams);
    }

    private MenuInflater getMenuInflater() {
        return new C7492g(getContext());
    }

    private int getVerticalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int getViewListMeasuredWidth(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            C1061e c1061e = (C1061e) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) c1061e).leftMargin - i;
            int i6 = ((ViewGroup.MarginLayoutParams) c1061e).rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    private boolean isChildOrHidden(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    private int layoutChildLeft(View view, int i, int[] iArr, int i2) {
        C1061e c1061e = (C1061e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1061e).leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, childTop, max + measuredWidth, view.getMeasuredHeight() + childTop);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) c1061e).rightMargin;
    }

    private int layoutChildRight(View view, int i, int[] iArr, int i2) {
        C1061e c1061e = (C1061e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1061e).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, childTop, max, view.getMeasuredHeight() + childTop);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c1061e).leftMargin);
    }

    private int measureChildCollapseMargins(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void measureChildConstrained(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void postShowOverflowMenu() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    private boolean shouldCollapse() {
        if (this.mCollapsible) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (shouldLayout(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean shouldLayout(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView(this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.mMenuView) != null && actionMenuView.m37402K();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1061e);
    }

    public void collapseActionView() {
        C1060d c1060d = this.mExpandedMenuPresenter;
        C1003i c1003i = c1060d == null ? null : c1060d.f3211d;
        if (c1003i != null) {
            c1003i.collapseActionView();
        }
    }

    public void dismissPopupMenus() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.m37411B();
        }
    }

    void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, C7452a.toolbarNavigationButtonStyle);
            this.mCollapseButtonView = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            C1061e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2538a = 8388611 | (this.mButtonGravity & 112);
            generateDefaultLayoutParams.f3213b = 2;
            this.mCollapseButtonView.setLayoutParams(generateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new View$OnClickListenerC1059c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C1115j0 c1115j0 = this.mContentInsets;
        if (c1115j0 != null) {
            return c1115j0.m37112a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.mContentInsetEndWithActions;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C1115j0 c1115j0 = this.mContentInsets;
        if (c1115j0 != null) {
            return c1115j0.m37111b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C1115j0 c1115j0 = this.mContentInsets;
        if (c1115j0 != null) {
            return c1115j0.m37110c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C1115j0 c1115j0 = this.mContentInsets;
        if (c1115j0 != null) {
            return c1115j0.m37109d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.mContentInsetStartWithNavigation;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0999g m37399N;
        ActionMenuView actionMenuView = this.mMenuView;
        if ((actionMenuView == null || (m37399N = actionMenuView.m37399N()) == null || !m37399N.hasVisibleItems()) ? false : true) {
            return Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (C7759x.m17563C(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C7759x.m17563C(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        ensureMenu();
        return this.mMenuView.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C1073c getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    public Drawable getOverflowIcon() {
        ensureMenu();
        return this.mMenuView.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.mPopupContext;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public InterfaceC1173z getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new C1140s0(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        C1060d c1060d = this.mExpandedMenuPresenter;
        return (c1060d == null || c1060d.f3211d == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.m37405H();
    }

    public void inflateMenu(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.m37404I();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.m37403J();
    }

    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a3 A[LOOP:0: B:104:0x02a1->B:105:0x02a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c5 A[LOOP:1: B:107:0x02c3->B:108:0x02c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fe A[LOOP:2: B:116:0x02fc->B:117:0x02fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0229  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.mTempMargins;
        if (C1170x0.m36903b(this)) {
            c = 1;
            c2 = 0;
        } else {
            c = 0;
            c2 = 1;
        }
        if (shouldLayout(this.mNavButtonView)) {
            measureChildConstrained(this.mNavButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            i3 = this.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(this.mNavButtonView);
            i4 = Math.max(0, this.mNavButtonView.getMeasuredHeight() + getVerticalMargins(this.mNavButtonView));
            i5 = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (shouldLayout(this.mCollapseButtonView)) {
            measureChildConstrained(this.mCollapseButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            i3 = this.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(this.mCollapseButtonView);
            i4 = Math.max(i4, this.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(this.mCollapseButtonView));
            i5 = View.combineMeasuredStates(i5, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i3);
        iArr[c] = Math.max(0, currentContentInsetStart - i3);
        if (shouldLayout(this.mMenuView)) {
            measureChildConstrained(this.mMenuView, i, max, i2, 0, this.mMaxButtonHeight);
            i6 = this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
            i4 = Math.max(i4, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
            i5 = View.combineMeasuredStates(i5, this.mMenuView.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i6);
        if (shouldLayout(this.mExpandedActionView)) {
            max2 += measureChildCollapseMargins(this.mExpandedActionView, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
            i5 = View.combineMeasuredStates(i5, this.mExpandedActionView.getMeasuredState());
        }
        if (shouldLayout(this.mLogoView)) {
            max2 += measureChildCollapseMargins(this.mLogoView, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.mLogoView.getMeasuredHeight() + getVerticalMargins(this.mLogoView));
            i5 = View.combineMeasuredStates(i5, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (((C1061e) childAt.getLayoutParams()).f3213b == 0 && shouldLayout(childAt)) {
                max2 += measureChildCollapseMargins(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + getVerticalMargins(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i11 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i12 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (shouldLayout(this.mTitleTextView)) {
            measureChildCollapseMargins(this.mTitleTextView, i, max2 + i12, i2, i11, iArr);
            int measuredWidth = this.mTitleTextView.getMeasuredWidth() + getHorizontalMargins(this.mTitleTextView);
            i9 = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
            i7 = View.combineMeasuredStates(i5, this.mTitleTextView.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = i5;
            i8 = 0;
            i9 = 0;
        }
        if (shouldLayout(this.mSubtitleTextView)) {
            i8 = Math.max(i8, measureChildCollapseMargins(this.mSubtitleTextView, i, max2 + i12, i2, i9 + i11, iArr));
            i9 += this.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(this.mSubtitleTextView);
            i7 = View.combineMeasuredStates(i7, this.mSubtitleTextView.getMeasuredState());
        }
        int max3 = Math.max(i4, i9);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i8 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & i7), shouldCollapse() ? 0 : View.resolveSizeAndState(Math.max(max3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i7 << 16));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C1063g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1063g c1063g = (C1063g) parcelable;
        super.onRestoreInstanceState(c1063g.m17424a());
        ActionMenuView actionMenuView = this.mMenuView;
        C0999g m37399N = actionMenuView != null ? actionMenuView.m37399N() : null;
        int i = c1063g.f3214e;
        if (i != 0 && this.mExpandedMenuPresenter != null && m37399N != null && (findItem = m37399N.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (c1063g.f3215f) {
            postShowOverflowMenu();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        ensureContentInsets();
        this.mContentInsets.m37107f(i == 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C1003i c1003i;
        C1063g c1063g = new C1063g(super.onSaveInstanceState());
        C1060d c1060d = this.mExpandedMenuPresenter;
        if (c1060d != null && (c1003i = c1060d.f3211d) != null) {
            c1063g.f3214e = c1003i.getItemId();
        }
        c1063g.f3215f = isOverflowMenuShowing();
        return c1063g;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C1061e) childAt.getLayoutParams()).f3213b != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C7462a.m18690d(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.m37108e(i, i2);
    }

    public void setContentInsetsRelative(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.m37106g(i, i2);
    }

    public void setLogo(int i) {
        setLogo(C7462a.m18690d(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setMenu(C0999g c0999g, C1073c c1073c) {
        if (c0999g == null && this.mMenuView == null) {
            return;
        }
        ensureMenuView();
        C0999g m37399N = this.mMenuView.m37399N();
        if (m37399N == c0999g) {
            return;
        }
        if (m37399N != null) {
            m37399N.m37544Q(this.mOuterActionMenuPresenter);
            m37399N.m37544Q(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new C1060d();
        }
        c1073c.m37257J(true);
        if (c0999g != null) {
            c0999g.m37532c(c1073c, this.mPopupContext);
            c0999g.m37532c(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            c1073c.mo26753n(this.mPopupContext, null);
            this.mExpandedMenuPresenter.mo26753n(this.mPopupContext, null);
            c1073c.mo26758i(true);
            this.mExpandedMenuPresenter.mo26758i(true);
        }
        this.mMenuView.setPopupTheme(this.mPopupTheme);
        this.mMenuView.setPresenter(c1073c);
        this.mOuterActionMenuPresenter = c1073c;
    }

    public void setMenuCallbacks(InterfaceC1014m.InterfaceC1015a interfaceC1015a, C0999g.InterfaceC1000a interfaceC1000a) {
        this.mActionMenuPresenterCallback = interfaceC1015a;
        this.mMenuBuilderCallback = interfaceC1000a;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.m37398O(interfaceC1015a, interfaceC1000a);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C7462a.m18690d(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC1062f interfaceC1062f) {
        this.mOnMenuItemClickListener = interfaceC1062f;
    }

    public void setOverflowIcon(Drawable drawable) {
        ensureMenu();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.mSubtitleTextAppearance = i;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.mTitleMarginStart = i;
        this.mTitleMarginTop = i2;
        this.mTitleMarginEnd = i3;
        this.mTitleMarginBottom = i4;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.mTitleMarginBottom = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.mTitleMarginEnd = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.mTitleMarginStart = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.mTitleMarginTop = i;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.mTitleTextAppearance = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public boolean showOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.m37397P();
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    /* loaded from: classes2.dex */
    public static class C1061e extends AbstractC0925a.C0926a {

        /* renamed from: b */
        int f3213b;

        public C1061e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3213b = 0;
        }

        /* renamed from: a */
        void m37298a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C1061e(int i, int i2) {
            super(i, i2);
            this.f3213b = 0;
            this.f2538a = 8388627;
        }

        public C1061e(C1061e c1061e) {
            super((AbstractC0925a.C0926a) c1061e);
            this.f3213b = 0;
            this.f3213b = c1061e.f3213b;
        }

        public C1061e(AbstractC0925a.C0926a c0926a) {
            super(c0926a);
            this.f3213b = 0;
        }

        public C1061e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3213b = 0;
            m37298a(marginLayoutParams);
        }

        public C1061e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3213b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7452a.toolbarStyle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C1061e generateDefaultLayoutParams() {
        return new C1061e(-2, -2);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.mCollapseIcon);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ensureLogoView();
            if (!isChildOrHidden(this.mLogoView)) {
                addSystemView(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && isChildOrHidden(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureLogoView();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!isChildOrHidden(this.mNavButtonView)) {
                addSystemView(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && isChildOrHidden(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mSubtitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mSubtitleTextAppearance;
                if (i != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mSubtitleTextView)) {
                addSystemView(this.mSubtitleTextView, true);
            }
        } else {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mTitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mTitleTextAppearance;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mTitleTextView)) {
                addSystemView(this.mTitleTextView, true);
            }
        } else {
            TextView textView = this.mTitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    /* loaded from: classes2.dex */
    public static class C1063g extends AbstractC7781a {
        public static final Parcelable.Creator<C1063g> CREATOR = new C1064a();

        /* renamed from: e */
        int f3214e;

        /* renamed from: f */
        boolean f3215f;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        /* loaded from: classes2.dex */
        class C1064a implements Parcelable.ClassLoaderCreator<C1063g> {
            C1064a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1063g createFromParcel(Parcel parcel) {
                return new C1063g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C1063g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1063g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C1063g[] newArray(int i) {
                return new C1063g[i];
            }
        }

        public C1063g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3214e = parcel.readInt();
            this.f3215f = parcel.readInt() != 0;
        }

        @Override // p201g.p243j.p244a.AbstractC7781a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3214e);
            parcel.writeInt(this.f3215f ? 1 : 0);
        }

        public C1063g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuViewItemClickListener = new C1057a();
        this.mShowOverflowMenuRunnable = new RunnableC1058b();
        C1138r0 m37026v = C1138r0.m37026v(getContext(), attributeSet, C7461j.Toolbar, i, 0);
        C7759x.m17502n0(this, context, C7461j.Toolbar, attributeSet, m37026v.m37030r(), i, 0);
        this.mTitleTextAppearance = m37026v.m37034n(C7461j.Toolbar_titleTextAppearance, 0);
        this.mSubtitleTextAppearance = m37026v.m37034n(C7461j.Toolbar_subtitleTextAppearance, 0);
        this.mGravity = m37026v.m37036l(C7461j.Toolbar_android_gravity, this.mGravity);
        this.mButtonGravity = m37026v.m37036l(C7461j.Toolbar_buttonGravity, 48);
        int m37043e = m37026v.m37043e(C7461j.Toolbar_titleMargin, 0);
        m37043e = m37026v.m37029s(C7461j.Toolbar_titleMargins) ? m37026v.m37043e(C7461j.Toolbar_titleMargins, m37043e) : m37043e;
        this.mTitleMarginBottom = m37043e;
        this.mTitleMarginTop = m37043e;
        this.mTitleMarginEnd = m37043e;
        this.mTitleMarginStart = m37043e;
        int m37043e2 = m37026v.m37043e(C7461j.Toolbar_titleMarginStart, -1);
        if (m37043e2 >= 0) {
            this.mTitleMarginStart = m37043e2;
        }
        int m37043e3 = m37026v.m37043e(C7461j.Toolbar_titleMarginEnd, -1);
        if (m37043e3 >= 0) {
            this.mTitleMarginEnd = m37043e3;
        }
        int m37043e4 = m37026v.m37043e(C7461j.Toolbar_titleMarginTop, -1);
        if (m37043e4 >= 0) {
            this.mTitleMarginTop = m37043e4;
        }
        int m37043e5 = m37026v.m37043e(C7461j.Toolbar_titleMarginBottom, -1);
        if (m37043e5 >= 0) {
            this.mTitleMarginBottom = m37043e5;
        }
        this.mMaxButtonHeight = m37026v.m37042f(C7461j.Toolbar_maxButtonHeight, -1);
        int m37043e6 = m37026v.m37043e(C7461j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int m37043e7 = m37026v.m37043e(C7461j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int m37042f = m37026v.m37042f(C7461j.Toolbar_contentInsetLeft, 0);
        int m37042f2 = m37026v.m37042f(C7461j.Toolbar_contentInsetRight, 0);
        ensureContentInsets();
        this.mContentInsets.m37108e(m37042f, m37042f2);
        if (m37043e6 != Integer.MIN_VALUE || m37043e7 != Integer.MIN_VALUE) {
            this.mContentInsets.m37106g(m37043e6, m37043e7);
        }
        this.mContentInsetStartWithNavigation = m37026v.m37043e(C7461j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = m37026v.m37043e(C7461j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.mCollapseIcon = m37026v.m37041g(C7461j.Toolbar_collapseIcon);
        this.mCollapseDescription = m37026v.m37032p(C7461j.Toolbar_collapseContentDescription);
        CharSequence m37032p = m37026v.m37032p(C7461j.Toolbar_title);
        if (!TextUtils.isEmpty(m37032p)) {
            setTitle(m37032p);
        }
        CharSequence m37032p2 = m37026v.m37032p(C7461j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(m37032p2)) {
            setSubtitle(m37032p2);
        }
        this.mPopupContext = getContext();
        setPopupTheme(m37026v.m37034n(C7461j.Toolbar_popupTheme, 0));
        Drawable m37041g = m37026v.m37041g(C7461j.Toolbar_navigationIcon);
        if (m37041g != null) {
            setNavigationIcon(m37041g);
        }
        CharSequence m37032p3 = m37026v.m37032p(C7461j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(m37032p3)) {
            setNavigationContentDescription(m37032p3);
        }
        Drawable m37041g2 = m37026v.m37041g(C7461j.Toolbar_logo);
        if (m37041g2 != null) {
            setLogo(m37041g2);
        }
        CharSequence m37032p4 = m37026v.m37032p(C7461j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(m37032p4)) {
            setLogoDescription(m37032p4);
        }
        if (m37026v.m37029s(C7461j.Toolbar_titleTextColor)) {
            setTitleTextColor(m37026v.m37045c(C7461j.Toolbar_titleTextColor));
        }
        if (m37026v.m37029s(C7461j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(m37026v.m37045c(C7461j.Toolbar_subtitleTextColor));
        }
        if (m37026v.m37029s(C7461j.Toolbar_menu)) {
            inflateMenu(m37026v.m37034n(C7461j.Toolbar_menu, 0));
        }
        m37026v.m37025w();
    }

    @Override // android.view.ViewGroup
    public C1061e generateLayoutParams(AttributeSet attributeSet) {
        return new C1061e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C1061e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1061e) {
            return new C1061e((C1061e) layoutParams);
        }
        if (layoutParams instanceof AbstractC0925a.C0926a) {
            return new C1061e((AbstractC0925a.C0926a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1061e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1061e(layoutParams);
    }
}
