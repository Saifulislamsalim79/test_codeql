package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.kshock.p009ui.views.ApplyForLoanFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class KshockActivityModule_ProvidesApplyForLoanFragment {

    /* loaded from: classes.dex */
    public interface ApplyForLoanFragmentSubcomponent extends b<ApplyForLoanFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<ApplyForLoanFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private KshockActivityModule_ProvidesApplyForLoanFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(ApplyForLoanFragmentSubcomponent.Factory factory);
}
