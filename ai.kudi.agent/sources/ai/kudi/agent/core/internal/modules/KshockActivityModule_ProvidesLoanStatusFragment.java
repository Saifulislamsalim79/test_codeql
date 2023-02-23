package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.kshock.p009ui.views.LoanStatusFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class KshockActivityModule_ProvidesLoanStatusFragment {

    /* loaded from: classes.dex */
    public interface LoanStatusFragmentSubcomponent extends b<LoanStatusFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<LoanStatusFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private KshockActivityModule_ProvidesLoanStatusFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(LoanStatusFragmentSubcomponent.Factory factory);
}
