package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.p008ui.SupportIssueFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class IssueActivityModule_InjectSupportIssueFragment {

    /* loaded from: classes.dex */
    public interface SupportIssueFragmentSubcomponent extends b<SupportIssueFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<SupportIssueFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private IssueActivityModule_InjectSupportIssueFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(SupportIssueFragmentSubcomponent.Factory factory);
}
