package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;
/* compiled from: PickerFragment.java */
/* renamed from: com.google.android.material.datepicker.p */
/* loaded from: classes2.dex */
abstract class AbstractC4616p<S> extends Fragment {

    /* renamed from: c */
    protected final LinkedHashSet<AbstractC4615o<S>> f11497c = new LinkedHashSet<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo27030e(AbstractC4615o<S> abstractC4615o) {
        return this.f11497c.add(abstractC4615o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m27029f() {
        this.f11497c.clear();
    }
}
