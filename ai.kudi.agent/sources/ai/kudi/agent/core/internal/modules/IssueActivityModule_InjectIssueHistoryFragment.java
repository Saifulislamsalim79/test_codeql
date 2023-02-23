package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.p008ui.IssueHistoryFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class IssueActivityModule_InjectIssueHistoryFragment {

    /* loaded from: classes.dex */
    public interface IssueHistoryFragmentSubcomponent extends b<IssueHistoryFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<IssueHistoryFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private IssueActivityModule_InjectIssueHistoryFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(IssueHistoryFragmentSubcomponent.Factory factory);
}
