package com.intercom.composer.input.empty;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.intercom.composer.C7163R;
import com.intercom.composer.input.InputFragment;
/* loaded from: classes2.dex */
public class EmptyFragment extends InputFragment {
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C7163R.C7166layout.intercom_composer_fragment_empty, viewGroup, false);
    }

    @Override // com.intercom.composer.input.InputFragment
    public void onInputDeselected() {
    }

    @Override // com.intercom.composer.input.InputFragment
    public void onInputReselected() {
    }

    @Override // com.intercom.composer.input.InputFragment
    public void onInputSelected() {
    }

    @Override // com.intercom.composer.input.InputFragment
    protected void passDataOnViewCreated(Bundle bundle) {
    }
}
