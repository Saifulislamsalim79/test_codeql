package com.intercom.composer.pager;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractC1522v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.intercom.composer.input.Input;
import java.util.List;
/* loaded from: classes2.dex */
public class ComposerPagerAdapter extends AbstractC1522v {
    private final List<? extends Input> inputs;

    public ComposerPagerAdapter(FragmentManager fragmentManager, List<? extends Input> list) {
        super(fragmentManager);
        this.inputs = list;
    }

    @Override // androidx.viewpager.widget.AbstractC1904a
    public int getCount() {
        return this.inputs.size();
    }

    @Override // androidx.fragment.app.AbstractC1522v
    public Fragment getItem(int i) {
        return this.inputs.get(i).createFragment();
    }

    @Override // androidx.fragment.app.AbstractC1522v, androidx.viewpager.widget.AbstractC1904a
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Fragment fragment = (Fragment) super.instantiateItem(viewGroup, i);
        this.inputs.get(i).setFragmentTag(fragment.getTag());
        return fragment;
    }
}
