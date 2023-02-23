package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.kshock.p009ui.views.KshockOverdueLoansListFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class KshockActivityModule_ProvidesKshockOverdueLoansListFragment {

    /* loaded from: classes.dex */
    public interface KshockOverdueLoansListFragmentSubcomponent extends b<KshockOverdueLoansListFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<KshockOverdueLoansListFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private KshockActivityModule_ProvidesKshockOverdueLoansListFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(KshockOverdueLoansListFragmentSubcomponent.Factory factory);
}
