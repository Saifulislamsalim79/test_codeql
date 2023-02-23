package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.kshock.p009ui.views.OtpVerificationFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class KshockActivityModule_ProvidesOtpVerificationFragment {

    /* loaded from: classes.dex */
    public interface OtpVerificationFragmentSubcomponent extends b<OtpVerificationFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<OtpVerificationFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private KshockActivityModule_ProvidesOtpVerificationFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(OtpVerificationFragmentSubcomponent.Factory factory);
}
