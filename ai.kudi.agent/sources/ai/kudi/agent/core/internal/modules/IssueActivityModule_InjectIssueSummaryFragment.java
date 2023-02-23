package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.p008ui.IssueSummaryFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class IssueActivityModule_InjectIssueSummaryFragment {

    /* loaded from: classes.dex */
    public interface IssueSummaryFragmentSubcomponent extends b<IssueSummaryFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<IssueSummaryFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private IssueActivityModule_InjectIssueSummaryFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(IssueSummaryFragmentSubcomponent.Factory factory);
}
