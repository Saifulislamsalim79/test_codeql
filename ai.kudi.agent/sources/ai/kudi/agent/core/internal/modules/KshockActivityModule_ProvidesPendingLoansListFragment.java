package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.kshock.p009ui.views.KshockPendingLoansListFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class KshockActivityModule_ProvidesPendingLoansListFragment {

    /* loaded from: classes.dex */
    public interface KshockPendingLoansListFragmentSubcomponent extends b<KshockPendingLoansListFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<KshockPendingLoansListFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private KshockActivityModule_ProvidesPendingLoansListFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(KshockPendingLoansListFragmentSubcomponent.Factory factory);
}
