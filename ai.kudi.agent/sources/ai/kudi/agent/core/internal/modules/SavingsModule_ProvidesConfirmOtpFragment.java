package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.savings.p024ui.ConfirmOtpFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class SavingsModule_ProvidesConfirmOtpFragment {

    /* loaded from: classes.dex */
    public interface ConfirmOtpFragmentSubcomponent extends b<ConfirmOtpFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<ConfirmOtpFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private SavingsModule_ProvidesConfirmOtpFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(ConfirmOtpFragmentSubcomponent.Factory factory);
}
