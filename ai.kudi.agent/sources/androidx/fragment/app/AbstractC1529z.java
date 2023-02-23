package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1565i;
import androidx.viewpager.widget.AbstractC1904a;
import java.util.ArrayList;
/* compiled from: FragmentStatePagerAdapter.java */
@Deprecated
/* renamed from: androidx.fragment.app.z */
/* loaded from: classes2.dex */
public abstract class AbstractC1529z extends AbstractC1904a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;
    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentStatePagerAdapt";
    private final int mBehavior;
    private AbstractC1449b0 mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final FragmentManager mFragmentManager;
    private ArrayList<Fragment> mFragments;
    private ArrayList<Fragment.C1427l> mSavedState;

    @Deprecated
    public AbstractC1529z(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    @Override // androidx.viewpager.widget.AbstractC1904a
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.m35924l();
        }
        while (this.mSavedState.size() <= i) {
            this.mSavedState.add(null);
        }
        this.mSavedState.set(i, fragment.isAdded() ? this.mFragmentManager.m35922l1(fragment) : null);
        this.mFragments.set(i, null);
        this.mCurTransaction.mo35798q(fragment);
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

    @Override // androidx.viewpager.widget.AbstractC1904a
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Fragment.C1427l c1427l;
        Fragment fragment;
        if (this.mFragments.size() <= i || (fragment = this.mFragments.get(i)) == null) {
            if (this.mCurTransaction == null) {
                this.mCurTransaction = this.mFragmentManager.m35924l();
            }
            Fragment item = getItem(i);
            if (this.mSavedState.size() > i && (c1427l = this.mSavedState.get(i)) != null) {
                item.setInitialSavedState(c1427l);
            }
            while (this.mFragments.size() <= i) {
                this.mFragments.add(null);
            }
            item.setMenuVisibility(false);
            if (this.mBehavior == 0) {
                item.setUserVisibleHint(false);
            }
            this.mFragments.set(i, item);
            this.mCurTransaction.m35829b(viewGroup.getId(), item);
            if (this.mBehavior == 1) {
                this.mCurTransaction.mo35797u(item, AbstractC1565i.c.f);
            }
            return item;
        }
        return fragment;
    }

    @Override // androidx.viewpager.widget.AbstractC1904a
    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.AbstractC1904a
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.mSavedState.clear();
            this.mFragments.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.mSavedState.add((Fragment.C1427l) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment m35911p0 = this.mFragmentManager.m35911p0(bundle, str);
                    if (m35911p0 != null) {
                        while (this.mFragments.size() <= parseInt) {
                            this.mFragments.add(null);
                        }
                        m35911p0.setMenuVisibility(false);
                        this.mFragments.set(parseInt, m35911p0);
                    } else {
                        Log.w(TAG, "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.AbstractC1904a
    public Parcelable saveState() {
        Bundle bundle;
        if (this.mSavedState.size() > 0) {
            bundle = new Bundle();
            Fragment.C1427l[] c1427lArr = new Fragment.C1427l[this.mSavedState.size()];
            this.mSavedState.toArray(c1427lArr);
            bundle.putParcelableArray("states", c1427lArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.mFragments.size(); i++) {
            Fragment fragment = this.mFragments.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.mFragmentManager.m35949c1(bundle, "f" + i, fragment);
            }
        }
        return bundle;
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

    public AbstractC1529z(FragmentManager fragmentManager, int i) {
        this.mCurTransaction = null;
        this.mSavedState = new ArrayList<>();
        this.mFragments = new ArrayList<>();
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = fragmentManager;
        this.mBehavior = i;
    }
}
