package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.p008ui.DelayedKTAtopUpFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class IssueActivityModule_InjectDelayedKTAtopUpFragment {

    /* loaded from: classes.dex */
    public interface DelayedKTAtopUpFragmentSubcomponent extends b<DelayedKTAtopUpFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<DelayedKTAtopUpFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private IssueActivityModule_InjectDelayedKTAtopUpFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(DelayedKTAtopUpFragmentSubcomponent.Factory factory);
}
