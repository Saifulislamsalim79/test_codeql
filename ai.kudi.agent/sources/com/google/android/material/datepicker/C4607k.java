package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
/* compiled from: MaterialTextInputPicker.java */
/* renamed from: com.google.android.material.datepicker.k */
/* loaded from: classes2.dex */
public final class C4607k<S> extends AbstractC4616p<S> {

    /* renamed from: d */
    private int f11471d;

    /* renamed from: e */
    private InterfaceC4583d<S> f11472e;

    /* renamed from: f */
    private C4577a f11473f;

    /* compiled from: MaterialTextInputPicker.java */
    /* renamed from: com.google.android.material.datepicker.k$a */
    /* loaded from: classes2.dex */
    class C4608a extends AbstractC4615o<S> {
        C4608a() {
        }

        @Override // com.google.android.material.datepicker.AbstractC4615o
        /* renamed from: a */
        public void mo27031a(S s) {
            Iterator<AbstractC4615o<S>> it = C4607k.this.f11497c.iterator();
            while (it.hasNext()) {
                it.next().mo27031a(s);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static <T> C4607k<T> m27065h(InterfaceC4583d<T> interfaceC4583d, int i, C4577a c4577a) {
        C4607k<T> c4607k = new C4607k<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", interfaceC4583d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c4577a);
        c4607k.setArguments(bundle);
        return c4607k;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f11471d = bundle.getInt("THEME_RES_ID_KEY");
        this.f11472e = (InterfaceC4583d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f11473f = (C4577a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f11472e.m27121i0(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f11471d)), viewGroup, bundle, this.f11473f, new C4608a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f11471d);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f11472e);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f11473f);
    }
}
