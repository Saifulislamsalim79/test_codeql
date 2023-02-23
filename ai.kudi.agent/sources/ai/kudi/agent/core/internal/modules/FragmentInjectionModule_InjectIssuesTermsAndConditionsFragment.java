package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.p008ui.IssuesTermsAndConditionsFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class FragmentInjectionModule_InjectIssuesTermsAndConditionsFragment {

    /* loaded from: classes.dex */
    public interface IssuesTermsAndConditionsFragmentSubcomponent extends b<IssuesTermsAndConditionsFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<IssuesTermsAndConditionsFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private FragmentInjectionModule_InjectIssuesTermsAndConditionsFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(IssuesTermsAndConditionsFragmentSubcomponent.Factory factory);
}
