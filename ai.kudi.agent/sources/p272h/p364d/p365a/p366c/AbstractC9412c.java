package p272h.p364d.p365a.p366c;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import h.d.a.c.e;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import p272h.p364d.p365a.p366c.p367f.C9417d;
import p272h.p364d.p365a.p366c.p367f.InterfaceC9416c;
import p272h.p364d.p365a.p366c.p367f.InterfaceC9418e;
/* compiled from: MvpFragment.java */
/* renamed from: h.d.a.c.c */
/* loaded from: classes2.dex */
public abstract class AbstractC9412c<V extends e, P extends InterfaceC9413d<V>> extends Fragment implements InterfaceC9418e<V, P>, e {
    protected InterfaceC9416c<V, P> mvpDelegate;
    protected P presenter;

    public abstract P createPresenter();

    protected InterfaceC9416c<V, P> getMvpDelegate() {
        if (this.mvpDelegate == null) {
            this.mvpDelegate = new C9417d(this, this, true, true);
        }
        return this.mvpDelegate;
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public V getMvpView() {
        return this;
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public P getPresenter() {
        return this.presenter;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getMvpDelegate().mo14793g(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        getMvpDelegate().mo14794f(activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getMvpDelegate().mo14797c(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getMvpDelegate().onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getMvpDelegate().mo14792h();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        getMvpDelegate().mo14796d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getMvpDelegate().onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getMvpDelegate().mo14799a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getMvpDelegate().mo14798b(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getMvpDelegate().onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getMvpDelegate().onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getMvpDelegate().mo14795e(view, bundle);
    }

    @Override // p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public void setPresenter(P p) {
        this.presenter = p;
    }
}
