package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1565i;
import androidx.viewpager.widget.AbstractC1904a;
/* compiled from: FragmentPagerAdapter.java */
@Deprecated
/* renamed from: androidx.fragment.app.v */
/* loaded from: classes2.dex */
public abstract class AbstractC1522v extends AbstractC1904a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;
    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private AbstractC1449b0 mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final FragmentManager mFragmentManager;

    @Deprecated
    public AbstractC1522v(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    private static String makeFragmentName(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // androidx.viewpager.widget.AbstractC1904a
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.m35924l();
        }
        this.mCurTransaction.mo35801m(fragment);
        if (fragment.equals(this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC1904a
    public void finishUpdate(ViewGroup viewGroup) {
        AbstractC1449b0 abstractC1449b0 = this.mCurTransaction;
        if (abstractC1449b0 != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    abstractC1449b0.mo35802l();
                } finally {
                    this.mExecutingFinishUpdate = false;
                }
            }
            this.mCurTransaction = null;
        }
    }

    public abstract Fragment getItem(int i);

    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.viewpager.widget.AbstractC1904a
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.m35924l();
        }
        long itemId = getItemId(i);
        Fragment m35938g0 = this.mFragmentManager.m35938g0(makeFragmentName(viewGroup.getId(), itemId));
        if (m35938g0 != null) {
            this.mCurTransaction.m35823h(m35938g0);
        } else {
            m35938g0 = getItem(i);
            this.mCurTransaction.m35828c(viewGroup.getId(), m35938g0, makeFragmentName(viewGroup.getId(), itemId));
        }
        if (m35938g0 != this.mCurrentPrimaryItem) {
            m35938g0.setMenuVisibility(false);
            if (this.mBehavior == 1) {
                this.mCurTransaction.mo35797u(m35938g0, AbstractC1565i.c.f);
            } else {
                m35938g0.setUserVisibleHint(false);
            }
        }
        return m35938g0;
    }

    @Override // androidx.viewpager.widget.AbstractC1904a
    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.AbstractC1904a
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.AbstractC1904a
    public Parcelable saveState() {
        return null;
    }

    @Override // androidx.viewpager.widget.AbstractC1904a
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        this.mCurTransaction = this.mFragmentManager.m35924l();
                    }
                    this.mCurTransaction.mo35797u(this.mCurrentPrimaryItem, AbstractC1565i.c.f);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    this.mCurTransaction = this.mFragmentManager.m35924l();
                }
                this.mCurTransaction.mo35797u(fragment, AbstractC1565i.c.w);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC1904a
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public AbstractC1522v(FragmentManager fragmentManager, int i) {
        this.mCurTransaction = null;
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = fragmentManager;
        this.mBehavior = i;
    }
}
